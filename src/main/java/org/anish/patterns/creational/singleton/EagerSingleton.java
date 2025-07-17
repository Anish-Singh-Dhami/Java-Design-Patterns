package org.anish.patterns.creational.singleton;

public class EagerSingleton {
    public static final String HELLO_STRING = "Hello from EagerSingleton!!";
    // Instance created at the time of class loading
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // private constructor to prevent initialization
    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public String sayHello() {
        return HELLO_STRING;
    }
}
