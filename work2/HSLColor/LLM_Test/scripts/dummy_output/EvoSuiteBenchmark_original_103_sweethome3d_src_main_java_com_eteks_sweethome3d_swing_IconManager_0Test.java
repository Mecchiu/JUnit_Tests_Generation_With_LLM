package com.eteks.sweethome3d.swing;
java
class IconManager_0Test {
    
    @Test
    void testGetInstanceReturnsSameInstance() {
        IconManager instance1 = IconManager.getInstance();
        IconManager instance2 = IconManager.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsNonNullInstance() {
        IconManager instance = IconManager.getInstance();
        assertNotNull(instance);
    }

    @Test
    void testGetInstanceReturnsSingletonInstance() {
        IconManager instance1 = IconManager.getInstance();
        IconManager instance2 = IconManager.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsSameInstanceMultipleTimes() {
        IconManager instance1 = IconManager.getInstance();
        IconManager instance2 = IconManager.getInstance();
        IconManager instance3 = IconManager.getInstance();
        assertSame(instance1, instance2);
        assertSame(instance2, instance3);
    }

    @Test
    void testGetInstanceReturnsNotNullInstance() {
        IconManager instance = IconManager.getInstance();
        assertNotNull(instance);
    }

    @Test
    void testGetInstanceReturnsSameInstanceAfterClear() {
        IconManager instance1 = IconManager.getInstance();
        instance1.clear();
        IconManager instance2 = IconManager.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsNewInstanceAfterClear() {
        IconManager instance1 = IconManager.getInstance();
        instance1.clear();
        IconManager instance2 = IconManager.getInstance();
        assertNotSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsSameInstanceAfterClearAndGetInstance() {
        IconManager instance1 = IconManager.getInstance();
        instance1.clear();
        IconManager instance2 = IconManager.getInstance();
        IconManager instance3 = IconManager.getInstance();
        assertSame(instance2, instance3);
    }

    @Test
    void testGetInstanceReturnsNotNullInstanceAfterClear() {
        IconManager instance = IconManager.getInstance();
        instance.clear();
        IconManager newInstance = IconManager.getInstance();
        assertNotNull(newInstance);
    }
}
