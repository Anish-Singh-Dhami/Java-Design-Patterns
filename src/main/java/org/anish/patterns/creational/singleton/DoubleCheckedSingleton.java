package org.anish.patterns.creational.singleton;

public class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton instance;
    public static final String HELLO_STRING = "Hello from DoubleCheckedSingleton!!";

    private DoubleCheckedSingleton() {}

    public static DoubleCheckedSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if(instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }

    public String sayHello() {
        return HELLO_STRING;
    }
}
