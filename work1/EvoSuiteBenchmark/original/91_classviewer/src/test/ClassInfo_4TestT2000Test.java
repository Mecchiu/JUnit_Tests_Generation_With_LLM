```java
    private ClassInfo classInfo;

    @BeforeEach
    void setUp() {
        classInfo = new ClassInfo();
    }

    @Test
    void testPrintInterfaces_NoInterfaces() {
        String[] interfaces = classInfo.printInterfaces();
        assertNull(interfaces);
    }

    @Test
    void testPrintInterfaces_OneInterface() {
        classInfo = new ClassInfo("java.util.List");
        String[] interfaces = classInfo.printInterfaces();
        assertNotNull(interfaces);
        assertEquals(1, interfaces.length);
        assertEquals("java.util.Collection", interfaces[0]);
    }

    @Test
    void testPrintInterfaces_MultipleInterfaces() {
        classInfo = new ClassInfo("java.util.ArrayList");
        String[] interfaces = classInfo.printInterfaces();
        assertNotNull(interfaces);
        assertEquals(2, interfaces.length);
        assertEquals("java.util.List", interfaces[0]);
        assertEquals("java.util.RandomAccess", interfaces[1]);
    }

    @Test
    void testPrintInterfaces_InterfaceInheritedFromSuperclass() {
        classInfo = new ClassInfo("java.util.LinkedList");
        String[] interfaces = classInfo.printInterfaces();
        assertNotNull(interfaces);
        assertEquals(3, interfaces.length);
        assertEquals("java.util.List", interfaces[0]);
        assertEquals("java.util.Deque", interfaces[1]);
        assertEquals("java.util.Queue", interfaces[2]);
    }

    @Test
    void testPrintInterfaces_AbstractClass() {
        classInfo = new ClassInfo("java.awt.Window");
        String[] interfaces = classInfo.printInterfaces();
        assertNotNull(interfaces);
        assertEquals(1, interfaces.length);
        assertEquals("java.awt.image.ImageObserver", interfaces[0]);
    }

    @Test
    void testPrintInterfaces_CustomClass() {
        classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo");
        String[] interfaces = classInfo.printInterfaces();
        assertNotNull(interfaces);
        assertEquals(1, interfaces.length);
        assertEquals("java.lang.Cloneable", interfaces[0]);
    }

    @Test
    void testPrintInterfaces_NullClass() {
        assertThrows(ClassNotFoundException.class, () -> {
            new ClassInfo("NonExistentClass").printInterfaces();
        });
    }

    @Test
    void testPrintInterfaces_NullDirManager() {
        assertThrows(ClassNotFoundException.class, () -> {
            new ClassInfo("java.util.List", null).printInterfaces();
        });
    }

    @Test
    void testPrintInterfaces_EmptyClassName() {
        assertThrows(ClassNotFoundException.class, () -> {
            new ClassInfo("").printInterfaces();
        });
    }
}
```