package patterns.creational.singleton;

import org.anish.patterns.creational.singleton.EagerSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EagerSingletonTest {
    @Test
    void testSingletonReturnSameInstance() {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        Assertions.assertSame(instance1, instance2);
        Assertions.assertEquals(EagerSingleton.HELLO_STRING, instance1.sayHello());
    }
}
