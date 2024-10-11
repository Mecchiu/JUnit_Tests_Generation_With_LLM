// ModelManager_0Test.java
package com.eteks.sweethome3d.j3d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModelManager}.
 * It contains ten unit test cases for the {@link ModelManager#getInstance()} method.
 */
class ModelManager_0Test {
    
    @Test
    void testGetInstance() {
        // Test if the instance returned is not null
        assertNotNull(ModelManager.getInstance());
        
        // Test if the same instance is returned on multiple calls
        assertSame(ModelManager.getInstance(), ModelManager.getInstance());
    }
    
    @Test
    void testSingletonPattern() {
        // Test if the class follows the singleton pattern
        // by checking if a new instance can be created using reflection
        assertThrows(IllegalAccessException.class, () -> {
            Constructor<ModelManager> constructor = ModelManager.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            constructor.newInstance();
        });
    }
    
    @Test
    void testThreadSafety() throws InterruptedException {
        // Test if the class is thread-safe by creating multiple threads
        // that call the getInstance method and check if they all get the same instance
        int numThreads = 10;
        Thread[] threads = new Thread[numThreads];
        ModelManager[] instances = new ModelManager[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> instances[i] = ModelManager.getInstance());
            threads[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }
        for (int i = 1; i < numThreads; i++) {
            assertSame(instances[0], instances[i]);
        }
    }
    
    @Test
    void testSupportedFormats() {
        // Test if the manager supports the default formats
        assertTrue(ModelManager.getInstance().isFormatSupported("obj"));
        assertTrue(ModelManager.getInstance().isFormatSupported("dae"));
        assertTrue(ModelManager.getInstance().isFormatSupported("3ds"));
        assertTrue(ModelManager.getInstance().isFormatSupported("lws"));
    }
    
    @Test
    void testAdditionalLoaderClasses() {
        // Test if additional loader classes can be added
        assertFalse(ModelManager.getInstance().isFormatSupported("xyz"));
        ModelManager.getInstance().addLoaderClass(TestLoader.class);
        assertTrue(ModelManager.getInstance().isFormatSupported("xyz"));
    }
    
    @Test
    void testLoadModel() {
        // Test if a model can be loaded from a URL
        assertNotNull(ModelManager.getInstance().loadModel(getClass().getResource("testModel.obj")));
    }
    
    @Test
    void testLoadModelWithInvalidURL() {
        // Test if an exception is thrown when loading a model from an invalid URL
        assertThrows(IllegalArgumentException.class, () -> {
            ModelManager.getInstance().loadModel(new URL("http://invalid.url"));
        });
    }
    
    @Test
    void testLoadModelWithUnsupportedFormat() {
        // Test if an exception is thrown when loading a model with an unsupported format
        assertThrows(IllegalArgumentException.class, () -> {
            ModelManager.getInstance().loadModel(getClass().getResource("testModel.xyz"));
        });
    }
    
    @Test
    void testLoadModelWithInvalidFormat() {
        // Test if an exception is thrown when loading a model with an invalid format
        assertThrows(IllegalArgumentException.class, () -> {
            ModelManager.getInstance().loadModel(getClass().getResource("testModelInvalid.obj"));
        });
    }
    
    @Test
    void testLoadModelWithIOException() {
        // Test if an exception is thrown when an IO exception occurs while loading a model
        assertThrows(IOException.class, () -> {
            ModelManager.getInstance().loadModel(getClass().getResource("testModelIOException.obj"));
        });
    }
    
    /**
     * Test loader class for the additionalLoaderClasses test case.
     */
    private static class TestLoader implements Loader {
        @Override
        public Scene load(URL url) throws FileNotFoundException, IncorrectFormatException, ParsingErrorException {
            return null;
        }
    }
}