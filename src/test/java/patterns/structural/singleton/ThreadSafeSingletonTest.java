package patterns.structural.singleton;

import org.anish.patterns.structural.singleton.ThreadSafeSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreadSafeSingletonTest {
    @Test
    void testSingletonReturnsSameInstance() {
        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();

        Assertions.assertSame(instance1, instance2);
        Assertions.assertSame(ThreadSafeSingleton.HELLO_STRING, instance1.sayHello());
    }
}
