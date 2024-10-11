// Test case 1: Test if method returns true for Mac OS X 10.5
@Test
void testIsMacOSXLeopardOrSuperiorForMacOSX10_5() {
    System.setProperty("os.name", "Mac OS X");
    System.setProperty("os.version", "10.5");
    assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
}

// Test case 2: Test if method returns true for Mac OS X 10.6
@Test
void testIsMacOSXLeopardOrSuperiorForMacOSX10_6() {
    System.setProperty("os.name", "Mac OS X");
    System.setProperty("os.version", "10.6");
    assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
}

// Test case 3: Test if method returns true for Mac OS X 10.7
@Test
void testIsMacOSXLeopardOrSuperiorForMacOSX10_7() {
    System.setProperty("os.name", "Mac OS X");
    System.setProperty("os.version", "10.7");
    assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
}

// Test case 4: Test if method returns true for Mac OS X 10.8
@Test
void testIsMacOSXLeopardOrSuperiorForMacOSX10_8() {
    System.setProperty("os.name", "Mac OS X");
    System.setProperty("os.version", "10.8");
    assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
}

// Test case 5: Test if method returns true for Mac OS X 10.9
@Test
void testIsMacOSXLeopardOrSuperiorForMacOSX10_9() {
    System.setProperty("os.name", "Mac OS X");
    System.setProperty("os.version", "10.9");
    assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
}

// Test case 6: Test if method returns true for Mac OS X 10.10
@Test
void testIsMacOSXLeopardOrSuperiorForMacOSX10_10() {
    System.setProperty("os.name", "Mac OS X");
    System.setProperty("os.version", "10.10");
    assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
}

// Test case 7: Test if method returns true for Mac OS X 10.11
@Test
void testIsMacOSXLeopardOrSuperiorForMacOSX10_11() {
    System.setProperty("os.name", "Mac OS X");
    System.setProperty("os.version", "10.11");
    assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
}

// Test case 8: Test if method returns true for Mac OS X 10.12
@Test
void testIsMacOSXLeopardOrSuperiorForMacOSX10_12() {
    System.setProperty("os.name", "Mac OS X");
    System.setProperty("os.version", "10.12");
    assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
}

// Test case 9: Test if method returns false for Mac OS X 10.4
@Test
void testIsMacOSXLeopardOrSuperiorForMacOSX10_4() {
    System.setProperty("os.name", "Mac OS X");
    System.setProperty("os.version", "10.4");
    assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
}

// Test case 10: Test if method returns false for Windows
@Test
void testIsMacOSXLeopardOrSuperiorForWindows() {
    System.setProperty("os.name", "Windows");
    assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
}
}