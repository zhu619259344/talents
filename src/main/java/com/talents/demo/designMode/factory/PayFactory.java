package com.talents.demo.designMode.factory;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PayFactory {

    private static Map<String, Pay> map = new HashMap<>();

    public PayFactory (List<Pay> payList){
        payList.stream().forEach(it -> {
            map.put(it.getType(), it);
        });
    }

    public static Pay getPay(String type) {
        return map.get(type);
    }
}
