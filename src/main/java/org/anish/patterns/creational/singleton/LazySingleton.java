package org.anish.patterns.creational.singleton;

public class LazySingleton {
    private static LazySingleton instance;
    public static final String HELLO_STRING = "Hello from LazySingleton!!";

    private LazySingleton() {}

    /**
     * This isn't thread safe.
     * In multithreaded environment, two threads could enter <b>getInstance()</b> method
     * at the same time and create two separate instances.
     * @return single instance of LazySingleton class every time.
     */
    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public String sayHello() {
        return HELLO_STRING;
    }
}
