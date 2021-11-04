package com.talents.demo.designMode.singleton;

public class LazyService {

    private static volatile LazyService instance;

    private LazyService() {
    }

    public static LazyService getInstance() {
        if (instance == null) {
            synchronized (LazyService.class) {
                if (instance == null) {
                    instance = new LazyService();
                }
            }
            return instance;
        }
        return instance;
    }
}
