package org.anish.patterns.creational.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    public static final String HELLO_STRING = "Hello from ThreadSafeSingleton!!";

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public String sayHello() {
        return HELLO_STRING;
    }
}
