package question_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    void testHungry(){
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();

        Assertions.assertNotNull(instance1);
        Assertions.assertNotNull(instance2);

        Assertions.assertTrue(instance1 == instance2);
    }

    @Test
    void testLazy(){
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        Assertions.assertNotNull(instance1);
        Assertions.assertNotNull(instance2);

        Assertions.assertTrue(instance1 == instance2);
    }

    @Test
    void testSync(){
        SyncSingleton instance1 = SyncSingleton.getInstance();
        SyncSingleton instance2 = SyncSingleton.getInstance();

        Assertions.assertNotNull(instance1);
        Assertions.assertNotNull(instance2);

        Assertions.assertTrue(instance1 == instance2);
    }

    @Test
    void testDoubleCheck(){
        DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton instance2 = DoubleCheckSingleton.getInstance();

        Assertions.assertNotNull(instance1);
        Assertions.assertNotNull(instance2);

        Assertions.assertTrue(instance1 == instance2);
    }

    @Test
    void testInnerClass(){
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();

        Assertions.assertNotNull(instance1);
        Assertions.assertNotNull(instance2);

        Assertions.assertTrue(instance1 == instance2);
    }
}
