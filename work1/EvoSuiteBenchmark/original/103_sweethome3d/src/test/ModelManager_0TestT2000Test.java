```java
package com.eteks.sweethome3d.j3d;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ModelManager_0Test {

    @Test
    void testGetInstanceReturnsSingletonInstance() {
        ModelManager instance1 = ModelManager.getInstance();
        ModelManager instance2 = ModelManager.getInstance();

        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsNonNullInstance() {
        ModelManager instance = ModelManager.getInstance();

        assertNotNull(instance);
    }

    @Test
    void testGetInstanceReturnsSameInstanceInMultiThreadedEnvironment() {
        ModelManager[] instances = new ModelManager[10];

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            final int index = i;
            threads[i] = new Thread(() -> instances[index] = ModelManager.getInstance());
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ModelManager firstInstance = instances[0];
        for (ModelManager instance : instances) {
            assertSame(firstInstance, instance);
        }
    }
}
```