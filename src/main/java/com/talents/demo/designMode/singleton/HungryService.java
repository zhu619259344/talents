package com.talents.demo.designMode.singleton;

public class HungryService {
    private static HungryService instance = new HungryService();

    private HungryService() {
    }

    public static HungryService getInstance() {
        return instance;
    }
}
