package com.eteks.sweethome3d.j3d;
java
import static org.junit.jupiter.api.Assertions.*;

class TextureManager_0Test {

    @Test
    void testGetInstanceReturnsSameInstance() {
        TextureManager instance1 = TextureManager.getInstance();
        TextureManager instance2 = TextureManager.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsNonNullInstance() {
        TextureManager instance = TextureManager.getInstance();
        assertNotNull(instance);
    }

    @Test
    void testGetInstanceReturnsSingletonInstance() {
        TextureManager instance1 = TextureManager.getInstance();
        TextureManager instance2 = TextureManager.getInstance();
        TextureManager instance3 = TextureManager.getInstance();
        assertSame(instance1, instance2);
        assertSame(instance2, instance3);
    }

    @Test
    void testGetInstanceReturnsUniqueInstances() {
        TextureManager instance1 = TextureManager.getInstance();
        TextureManager instance2 = new TextureManager();
        assertNotSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsValidInstance() {
        TextureManager instance = TextureManager.getInstance();
        assertNotNull(instance);
        assertTrue(instance instanceof TextureManager);
    }

    @Test
    void testGetInstanceReturnsNotNullInstance() {
        TextureManager instance = TextureManager.getInstance();
        assertNotNull(instance);
    }

    @Test
    void testGetInstanceReturnsSameInstanceAfterClear() {
        TextureManager instance = TextureManager.getInstance();
        instance.clear();
        TextureManager newInstance = TextureManager.getInstance();
        assertSame(instance, newInstance);
    }

    @Test
    void testGetInstanceReturnsNewInstanceAfterClear() {
        TextureManager instance = TextureManager.getInstance();
        instance.clear();
        TextureManager newInstance = TextureManager.getInstance();
        assertNotSame(instance, newInstance);
    }

    @Test
    void testGetInstanceReturnsNonNullInstanceAfterClear() {
        TextureManager instance = TextureManager.getInstance();
        instance.clear();
        TextureManager newInstance = TextureManager.getInstance();
        assertNotNull(newInstance);
    }
}
