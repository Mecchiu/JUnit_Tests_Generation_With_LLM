// Test case 1: Test when the class has no interfaces
@Test
void testPrintInterfaces_noInterfaces() throws ClassNotFoundException {
    ClassInfo classInfo = new ClassInfo("java.lang.String");
    String[] interfaces = classInfo.printInterfaces();
    assertEquals(0, interfaces.length);
}

// Test case 2: Test when the class has one interface
@Test
void testPrintInterfaces_oneInterface() throws ClassNotFoundException {
    ClassInfo classInfo = new ClassInfo("java.util.List");
    String[] interfaces = classInfo.printInterfaces();
    assertEquals(1, interfaces.length);
    assertEquals("java.util.Collection", interfaces[0]);
}

// Test case 3: Test when the class has multiple interfaces
@Test
void testPrintInterfaces_multipleInterfaces() throws ClassNotFoundException {
    ClassInfo classInfo = new ClassInfo("java.util.ArrayList");
    String[] interfaces = classInfo.printInterfaces();
    assertEquals(3, interfaces.length);
    assertEquals("java.util.List", interfaces[0]);
    assertEquals("java.util.RandomAccess", interfaces[1]);
    assertEquals("java.lang.Cloneable", interfaces[2]);
}

// Test case 4: Test when the class is an interface
@Test
void testPrintInterfaces_classIsInterface() throws ClassNotFoundException {
    ClassInfo classInfo = new ClassInfo("java.util.Collection");
    String[] interfaces = classInfo.printInterfaces();
    assertEquals(1, interfaces.length);
    assertEquals("java.lang.Iterable", interfaces[0]);
}

// Test case 5: Test when the class is an abstract class
@Test
void testPrintInterfaces_classIsAbstract() throws ClassNotFoundException {
    ClassInfo classInfo = new ClassInfo("java.awt.Shape");
    String[] interfaces = classInfo.printInterfaces();
    assertEquals(1, interfaces.length);
    assertEquals("java.awt.geom.PathIterator", interfaces[0]);
}

// Test case 6: Test when the class extends a class and implements an interface
@Test
void testPrintInterfaces_classExtendsClassAndImplementsInterface() throws ClassNotFoundException {
    ClassInfo classInfo = new ClassInfo("javax.swing.JComponent");
    String[] interfaces = classInfo.printInterfaces();
    assertEquals(4, interfaces.length);
    assertEquals("java.awt.image.ImageObserver", interfaces[0]);
    assertEquals("java.awt.MenuContainer", interfaces[1]);
    assertEquals("javax.accessibility.Accessible", interfaces[2]);
    assertEquals("javax.swing.TransferHandler$HasGetTransferHandler", interfaces[3]);
}

// Test case 7: Test when the class extends a class and implements multiple interfaces
@Test
void testPrintInterfaces_classExtendsClassAndImplementsMultipleInterfaces() throws ClassNotFoundException {
    ClassInfo classInfo = new ClassInfo("javax.swing.JButton");
    String[] interfaces = classInfo.printInterfaces();
    assertEquals(4, interfaces.length);
    assertEquals("javax.swing.SwingConstants", interfaces[0]);
    assertEquals("javax.accessibility.Accessible", interfaces[1]);
    assertEquals("javax.swing.ButtonModel", interfaces[2]);
    assertEquals("javax.swing.plaf.UIResource", interfaces[3]);
}

// Test case 8: Test when the class extends an abstract class and implements an interface
@Test
void testPrintInterfaces_classExtendsAbstractClassAndImplementsInterface() throws ClassNotFoundException {
    ClassInfo classInfo = new ClassInfo("javax.swing.JComponent$AccessibleJComponent");
    String[] interfaces = classInfo.printInterfaces();
    assertEquals(2, interfaces.length);
    assertEquals("javax.accessibility.Accessible", interfaces[0]);
    assertEquals("javax.swing.SwingConstants", interfaces[1]);
}

// Test case 9: Test when the class extends an abstract class and implements multiple interfaces
@Test
void testPrintInterfaces_classExtendsAbstractClassAndImplementsMultipleInterfaces() throws ClassNotFoundException {
    ClassInfo classInfo = new ClassInfo("javax.swing.JTree$AccessibleJTree");
    String[] interfaces = classInfo.printInterfaces();
    assertEquals(3, interfaces.length);
    assertEquals("javax.accessibility.Accessible", interfaces[0]);
    assertEquals("javax.swing.tree.TreeModelListener", interfaces[1]);
    assertEquals("javax.swing.event.TreeSelectionListener", interfaces[2]);
}

// Test case 10: Test when the class is an inner class
@Test
void testPrintInterfaces_innerClass() throws ClassNotFoundException {
    ClassInfo classInfo = new ClassInfo("javax.swing.JComponent$1");
    String[] interfaces = classInfo.printInterfaces();
    assertEquals(0, interfaces.length);
}
}