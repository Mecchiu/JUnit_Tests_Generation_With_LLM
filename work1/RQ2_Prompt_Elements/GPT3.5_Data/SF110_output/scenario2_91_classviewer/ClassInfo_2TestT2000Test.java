// Test case 1: Test if the method returns null when there are no public methods
@Test
void testPrintMethodsNoPublicMethods() {
    ClassInfo classInfo = new ClassInfo();
    String[] expected = null;
    String[] actual = classInfo.printMethods(0);
    assertArrayEquals(expected, actual);
}

// Test case 2: Test if the method returns all public methods when param is 0
@Test
void testPrintMethodsAllPublicMethods() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.setClass(TestClass.class);
    String[] expected = {"publicMethod1", "publicMethod2"};
    String[] actual = classInfo.printMethods(0);
    assertArrayEquals(expected, actual);
}

// Test case 3: Test if the method returns only the methods of the current class when param is 0
@Test
void testPrintMethodsOnlyCurrentClassMethods() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.setClass(TestClass.class);
    String[] expected = {"com.jstevh.viewer.TestClass.publicMethod1", "com.jstevh.viewer.TestClass.publicMethod2"};
    String[] actual = classInfo.printMethods(0);
    assertArrayEquals(expected, actual);
}

// Test case 4: Test if the method returns all public and inherited methods when param is 1
@Test
void testPrintMethodsAllPublicAndInheritedMethods() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.setClass(TestClass.class);
    String[] expected = {"publicMethod1", "publicMethod2", "java.lang.Object.toString", "java.lang.Object.equals", "java.lang.Object.hashCode"};
    String[] actual = classInfo.printMethods(1);
    assertArrayEquals(expected, actual);
}

// Test case 5: Test if the method returns only the inherited methods when param is 1 and there are no public methods in the current class
@Test
void testPrintMethodsOnlyInheritedMethods() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.setClass(TestClass2.class);
    String[] expected = {"java.lang.Object.toString", "java.lang.Object.equals", "java.lang.Object.hashCode"};
    String[] actual = classInfo.printMethods(1);
    assertArrayEquals(expected, actual);
}

// Test case 6: Test if the method returns null when param is 1 and there are no inherited methods
@Test
void testPrintMethodsNoInheritedMethods() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.setClass(TestClass3.class);
    String[] expected = null;
    String[] actual = classInfo.printMethods(1);
    assertArrayEquals(expected, actual);
}

// Test case 7: Test if the method returns null when the class is null
@Test
void testPrintMethodsClassIsNull() {
    ClassInfo classInfo = new ClassInfo();
    String[] expected = null;
    String[] actual = classInfo.printMethods(0);
    assertArrayEquals(expected, actual);
}

// Test case 8: Test if the method returns null when the class has no methods
@Test
void testPrintMethodsClassHasNoMethods() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.setClass(TestClass4.class);
    String[] expected = null;
    String[] actual = classInfo.printMethods(0);
    assertArrayEquals(expected, actual);
}

// Test case 9: Test if the method returns null when the class has private methods
@Test
void testPrintMethodsClassHasPrivateMethods() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.setClass(TestClass5.class);
    String[] expected = null;
    String[] actual = classInfo.printMethods(0);
    assertArrayEquals(expected, actual);
}

// Test case 10: Test if the method returns null when the class has protected methods and param is 0
@Test
void testPrintMethodsClassHasProtectedMethods() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.setClass(TestClass6.class);
    String[] expected = null;
    String[] actual = classInfo.printMethods(0);
    assertArrayEquals(expected, actual);
}
}

// Test classes for the unit tests
class TestClass {
    public void publicMethod1() {}
    public void publicMethod2() {}
}

class TestClass2 extends TestClass {}

class TestClass3 {}

class TestClass4 {
    private void privateMethod() {}
}

class TestClass5 {
    public void publicMethod() {}
    private void privateMethod() {}
}

class TestClass6 {
    public void publicMethod() {}
    protected void protectedMethod() {}
}