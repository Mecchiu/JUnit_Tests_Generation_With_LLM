// Test case 1: Test if getClassLoaderFromJars() returns a non-null ClassLoader object
@Test
public void testGetClassLoaderFromJarsNotNull() throws Exception {
    ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("path/to/jars");
    assertNotNull(classLoader);
}

// Test case 2: Test if getClassLoaderFromJars() returns a ClassLoader object of type URLClassLoader
@Test
public void testGetClassLoaderFromJarsType() throws Exception {
    ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("path/to/jars");
    assertTrue(classLoader instanceof URLClassLoader);
}

// Test case 3: Test if getClassLoaderFromJars() returns a ClassLoader object with the correct URLs
@Test
public void testGetClassLoaderFromJarsURLs() throws Exception {
    ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("path/to/jars");
    URL[] urls = ((URLClassLoader) classLoader).getURLs();
    assertEquals(urls.length, 2);
    assertEquals(urls[0], new URL("file:path/to/jars/jar1.jar"));
    assertEquals(urls[1], new URL("file:path/to/jars/jar2.jar"));
}

// Test case 4: Test if getClassLoaderFromJars() throws an exception when the directory does not exist
@Test
public void testGetClassLoaderFromJarsInvalidDir() {
    assertThrows(Exception.class, () -> {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("invalid/path");
    });
}

// Test case 5: Test if getClassLoaderFromJars() throws an exception when the directory is empty
@Test
public void testGetClassLoaderFromJarsEmptyDir() {
    assertThrows(Exception.class, () -> {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("empty/dir");
    });
}

// Test case 6: Test if getClassLoaderFromJars() throws an exception when the directory contains non-jar files
@Test
public void testGetClassLoaderFromJarsNonJarFiles() {
    assertThrows(Exception.class, () -> {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("path/to/non-jar/files");
    });
}

// Test case 7: Test if getClassLoaderFromJars() throws an exception when the directory contains invalid jar files
@Test
public void testGetClassLoaderFromJarsInvalidJarFiles() {
    assertThrows(Exception.class, () -> {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("path/to/invalid/jar/files");
    });
}

// Test case 8: Test if getClassLoaderFromJars() throws an exception when the directory contains duplicate jar files
@Test
public void testGetClassLoaderFromJarsDuplicateJarFiles() {
    assertThrows(Exception.class, () -> {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("path/to/duplicate/jar/files");
    });
}

// Test case 9: Test if getClassLoaderFromJars() throws an exception when the directory contains jar files with duplicate class names
@Test
public void testGetClassLoaderFromJarsDuplicateClasses() {
    assertThrows(Exception.class, () -> {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("path/to/jars/with/duplicate/classes");
    });
}

// Test case 10: Test if getClassLoaderFromJars() throws an exception when the directory contains jar files with conflicting dependencies
@Test
public void testGetClassLoaderFromJarsConflictingDependencies() {
    assertThrows(Exception.class, () -> {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("path/to/jars/with/conflicting/dependencies");
    });
}