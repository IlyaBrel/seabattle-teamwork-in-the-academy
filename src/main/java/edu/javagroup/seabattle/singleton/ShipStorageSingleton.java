package edu.javagroup.seabattle.singleton;

import java.util.HashMap;
import java.util.Map;

public class ShipStorageSingleton {

    private static ShipStorageSingleton instance;
    private final Map<String, Integer> storageSingleton;

    private ShipStorageSingleton(Map<String, Integer> storageSingleton) {
        this.storageSingleton = storageSingleton;
    }

    public static ShipStorageSingleton instance(Map<String, Integer> storageSingleton) {
        if (instance == null) {
            instance = new ShipStorageSingleton(new HashMap<>(0));
        }
        if (storageSingleton != null) {
            instance = new ShipStorageSingleton(storageSingleton);
        }
        return instance;
    }

    public Map<String, Integer> getShipMap() {
        return storageSingleton;
    }
}
