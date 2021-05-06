package org.lstec.algorithm.question_2;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SingletonTest {

    @Test
    void testHungry(){
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);

        assertTrue(instance1 == instance2);
    }

    @Test
    void testLazy(){
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);

        assertTrue(instance1 == instance2);
    }

    @Test
    void testSync(){
        SyncSingleton instance1 = SyncSingleton.getInstance();
        SyncSingleton instance2 = SyncSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);

        assertTrue(instance1 == instance2);
    }

    @Test
    void testDoubleCheck(){
        DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton instance2 = DoubleCheckSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);

        assertTrue(instance1 == instance2);
    }

    @Test
    void testInnerClass(){
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);

        assertTrue(instance1 == instance2);
    }
}
