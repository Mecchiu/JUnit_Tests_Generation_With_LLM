// Test case 1: Test if getFoundMethod() returns null when no methods have been searched for
@Test
void testGetFoundMethodNoMethodsSearched() {
    ClassInfo classInfo = new ClassInfo();
    MethodData methodData = classInfo.getFoundMethod(0);
    assertNull(methodData);
}

// Test case 2: Test if getFoundMethod() returns null when an invalid position is given
@Test
void testGetFoundMethodInvalidPosition() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.srchMethods("test");
    MethodData methodData = classInfo.getFoundMethod(5);
    assertNull(methodData);
}

// Test case 3: Test if getFoundMethod() returns the correct method data for the first method searched for
@Test
void testGetFoundMethodFirstMethod() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.srchMethods("test");
    MethodData methodData = classInfo.getFoundMethod(0);
    assertEquals("testMethod1", methodData.getName());
    assertEquals("public void testMethod1()", methodData.toString());
}

// Test case 4: Test if getFoundMethod() returns the correct method data for the last method searched for
@Test
void testGetFoundMethodLastMethod() {
    ClassInfo classInfo = new ClassInfo();
    classInfo.srchMethods("test");
    MethodData methodData = classInfo.getFoundMethod(2);
    assertEquals("testMethod3", methodData.getName());
    assertEquals("public void testMethod3()", methodData.toString());
}

// Test case 5: Test if getFoundMethod() returns the correct method data for a method searched for with a specific index
@Test
void testGetFoundMethodSpecificIndex() {
    ClassInfo classInfo = new ClassInfo();
    String[] index = {"testMethod2", "testMethod3"};
    classInfo.srchMethods("test", index);
    MethodData methodData = classInfo.getFoundMethod(1);
    assertEquals("testMethod3", methodData.getName());
    assertEquals("public void testMethod3()", methodData.toString());
}

// Test case 6: Test if getFoundMethod() returns the correct method data for a method searched for with a specific index and a different position
@Test
void testGetFoundMethodSpecificIndexDifferentPosition() {
    ClassInfo classInfo = new ClassInfo();
    String[] index = {"testMethod2", "testMethod3"};
    classInfo.srchMethods("test", index);
    MethodData methodData = classInfo.getFoundMethod(0);
    assertEquals("testMethod2", methodData.getName());
    assertEquals("public void testMethod2()", methodData.toString());
}

// Test case 7: Test if getFoundMethod() returns the correct method data for a method searched for with a specific index and an invalid position
@Test
void testGetFoundMethodSpecificIndexInvalidPosition() {
    ClassInfo classInfo = new ClassInfo();
    String[] index = {"testMethod2", "testMethod3"};
    classInfo.srchMethods("test", index);
    MethodData methodData = classInfo.getFoundMethod(2);
    assertNull(methodData);
}

// Test case 8: Test if getFoundMethod() returns the correct method data for a method searched for with a specific index and a negative position
@Test
void testGetFoundMethodSpecificIndexNegativePosition() {
    ClassInfo classInfo = new ClassInfo();
    String[] index = {"testMethod2", "testMethod3"};
    classInfo.srchMethods("test", index);
    MethodData methodData = classInfo.getFoundMethod(-1);
    assertNull(methodData);
}

// Test case 9: Test if getFoundMethod() returns the correct method data for a method searched for with a specific index and a position equal to the number of found methods
@Test
void testGetFoundMethodSpecificIndexPositionEqualsNumberOfFoundMethods() {
    ClassInfo classInfo = new ClassInfo();
    String[] index = {"testMethod2", "testMethod3"};
    classInfo.srchMethods("test", index);
    MethodData methodData = classInfo.getFoundMethod(2);
    assertNull(methodData);
}

// Test case 10: Test if getFoundMethod() returns the correct method data for a method searched for with a specific index and a position one less than the number of found methods
@Test
void testGetFoundMethodSpecificIndexPositionOneLessThanNumberOfFoundMethods() {
    ClassInfo classInfo = new ClassInfo();
    String[] index = {"testMethod2", "testMethod3"};
    classInfo.srchMethods("test", index);
    MethodData methodData = classInfo.getFoundMethod(1);
    assertEquals("testMethod3", methodData.getName());
    assertEquals("public void testMethod3()", methodData.toString());
}