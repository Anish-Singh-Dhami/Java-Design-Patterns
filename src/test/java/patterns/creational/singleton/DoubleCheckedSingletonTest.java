package patterns.creational.singleton;

import org.anish.patterns.creational.singleton.DoubleCheckedSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleCheckedSingletonTest {
    @Test
    void testSingletonReturnsSameInstance() {
        DoubleCheckedSingleton instance1 = DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton instance2 = DoubleCheckedSingleton.getInstance();

        Assertions.assertSame(instance1, instance2);
        Assertions.assertEquals(DoubleCheckedSingleton.HELLO_STRING, instance1.sayHello());
    }
}
