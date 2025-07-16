package patterns.structural.singleton;

import org.anish.patterns.structural.singleton.LazySingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LazySingletonTest {

    @Test
    void testSingletonReturnsSameInstance() {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        Assertions.assertSame(instance1, instance2);
        Assertions.assertEquals(LazySingleton.HELLO_STRING, instance1.sayHello());
    }
}
