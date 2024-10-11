// Test case 1: Test successful build with force=true
@Test
void testBuildForceTrueSuccess() throws IOException {
    // Setup
    Sitemap sitemap = new Sitemap();
    LagoonProcessor processor = new LagoonProcessor(sitemap, "src", "http://localhost");
    
    // Add sitemap entries
    SitemapEntry entry1 = new SitemapEntry("file1.xml", "file1.html", "xslt1.xsl");
    sitemap.addEntry(entry1);
    
    // Create source file
    File sourceFile = new File("src/file1.xml");
    sourceFile.createNewFile();
    
    // Create XSLT file
    File xsltFile = new File("src/xslt1.xsl");
    xsltFile.createNewFile();
    
    // Create target file
    File targetFile = new File("http://localhost/file1.html");
    
    // Test
    boolean success = processor.build(true);
    
    // Assert
    assertTrue(success);
    assertTrue(targetFile.exists());
    
    // Cleanup
    sourceFile.delete();
    xsltFile.delete();
    targetFile.delete();
}

// Test case 2: Test successful build with force=false
@Test
void testBuildForceFalseSuccess() throws IOException {
    // Setup
    Sitemap sitemap = new Sitemap();
    LagoonProcessor processor = new LagoonProcessor(sitemap, "src", "http://localhost");
    
    // Add sitemap entries
    SitemapEntry entry1 = new SitemapEntry("file1.xml", "file1.html", "xslt1.xsl");
    sitemap.addEntry(entry1);
    
    // Create source file
    File sourceFile = new File("src/file1.xml");
    sourceFile.createNewFile();
    
    // Create XSLT file
    File xsltFile = new File("src/xslt1.xsl");
    xsltFile.createNewFile();
    
    // Create target file
    File targetFile = new File("http://localhost/file1.html");
    
    // Test
    boolean success = processor.build(false);
    
    // Assert
    assertTrue(success);
    assertTrue(targetFile.exists());
    
    // Cleanup
    sourceFile.delete();
    xsltFile.delete();
    targetFile.delete();
}

// Test case 3: Test failed build with force=true
@Test
void testBuildForceTrueFail() throws IOException {
    // Setup
    Sitemap sitemap = new Sitemap();
    LagoonProcessor processor = new LagoonProcessor(sitemap, "src", "http://localhost");
    
    // Add sitemap entries
    SitemapEntry entry1 = new SitemapEntry("file1.xml", "file1.html", "xslt1.xsl");
    sitemap.addEntry(entry1);
    
    // Create source file
    File sourceFile = new File("src/file1.xml");
    sourceFile.createNewFile();
    
    // Create XSLT file
    File xsltFile = new File("src/xslt1.xsl");
    xsltFile.createNewFile();
    
    // Create target file
    File targetFile = new File("http://localhost/file1.html");
    
    // Modify XSLT file to cause build failure
    FileWriter writer = new FileWriter(xsltFile);
    writer.write("invalid xslt");
    writer.close();
    
    // Test
    boolean success = processor.build(true);
    
    // Assert
    assertFalse(success);
    assertFalse(targetFile.exists());
    
    // Cleanup
    sourceFile.delete();
    xsltFile.delete();
}

// Test case 4: Test failed build with force=false
@Test
void testBuildForceFalseFail() throws IOException {
    // Setup
    Sitemap sitemap = new Sitemap();
    LagoonProcessor processor = new LagoonProcessor(sitemap, "src", "http://localhost");
    
    // Add sitemap entries
    SitemapEntry entry1 = new SitemapEntry("file1.xml", "file1.html", "xslt1.xsl");
    sitemap.addEntry(entry1);
    
    // Create source file
    File sourceFile = new File("src/file1.xml");
    sourceFile.createNewFile();
    
    // Create XSLT file
    File xsltFile = new File("src/xslt1.xsl");
    xsltFile.createNewFile();
    
    // Create target file
    File targetFile = new File("http://localhost/file1.html");
    
    // Modify XSLT file to cause build failure
    FileWriter writer = new FileWriter(xsltFile);
    writer.write("invalid xslt");
    writer.close();
    
    // Test
    boolean success = processor.build(false);
    
    // Assert
    assertFalse(success);
    assertFalse(targetFile.exists());
    
    // Cleanup
    sourceFile.delete();
    xsltFile.delete();
}

// Test case 5: Test build with no sitemap entries
@Test
void testBuildNoSitemapEntries() throws IOException {
    // Setup
    Sitemap sitemap = new Sitemap();
    LagoonProcessor processor = new LagoonProcessor(sitemap, "src", "http://localhost");
    
    // Test
    boolean success = processor.build(true);
    
    // Assert
    assertTrue(success);
}

// Test case 6: Test build with non-existent source file
@Test
void testBuildNonExistentSourceFile() throws IOException {
    // Setup
    Sitemap sitemap = new Sitemap();
    LagoonProcessor processor = new LagoonProcessor(sitemap, "src", "http://localhost");
    
    // Add sitemap entries
    SitemapEntry entry1 = new SitemapEntry("file1.xml", "file1.html", "xslt1.xsl");
    sitemap.addEntry(entry1);
    
    // Test
    boolean success = processor.build(true);
    
    // Assert
    assertFalse(success);
}

// Test case 7: Test build with non-existent XSLT file
@Test
void testBuildNonExistentXSLTFile() throws IOException {
    // Setup
    Sitemap sitemap = new Sitemap();
    LagoonProcessor processor = new LagoonProcessor(sitemap, "src", "http://localhost");
    
    // Add sitemap entries
    SitemapEntry entry1 = new SitemapEntry("file1.xml", "file1.html", "xslt1.xsl");
    sitemap.addEntry(entry1);
    
    // Create source file
    File sourceFile = new File("src/file1.xml");
    sourceFile.createNewFile();
    
    // Test
    boolean success = processor.build(true);
    
    // Assert
    assertFalse(success);
    
    // Cleanup
    sourceFile.delete();
}

// Test case 8: Test build with non-existent target directory
@Test
void testBuildNonExistentTargetDirectory() throws IOException {
    // Setup
    Sitemap sitemap = new Sitemap();
    LagoonProcessor processor = new LagoonProcessor(sitemap, "src", "http://localhost/nonexistent");
    
    // Add sitemap entries
    SitemapEntry entry1 = new SitemapEntry("file1.xml", "file1.html", "xslt1.xsl");
    sitemap.addEntry(entry1);
    
    // Create source file
    File sourceFile = new File("src/file1.xml");
    sourceFile.createNewFile();
    
    // Create XSLT file
    File xsltFile = new File("src/xslt1.xsl");
    xsltFile.createNewFile();
    
    // Test
    boolean success = processor.build(true);
    
    // Assert
    assertFalse(success);
    
    // Cleanup
    sourceFile.delete();
    xsltFile.delete();
}

// Test case 9: Test build with invalid sitemap entry
@Test
void testBuildInvalidSitemapEntry() throws IOException {
    // Setup
    Sitemap sitemap = new Sitemap();
    LagoonProcessor processor = new LagoonProcessor(sitemap, "src", "http://localhost");
    
    // Add invalid sitemap entry
    SitemapEntry entry1 = new SitemapEntry(null, null, null);
    sitemap.addEntry(entry1);
    
    // Test
    boolean success = processor.build(true);
    
    // Assert
    assertFalse(success);
}

// Test case 10: Test build with multiple sitemap entries
@Test
void testBuildMultipleSitemapEntries() throws IOException {
    // Setup
    Sitemap sitemap = new Sitemap();
    LagoonProcessor processor = new LagoonProcessor(sitemap, "src", "http://localhost");
    
    // Add sitemap entries
    SitemapEntry entry1 = new SitemapEntry("file1.xml", "file1.html", "xslt1.xsl");
    SitemapEntry entry2 = new SitemapEntry("file2.xml", "file2.html", "xslt2.xsl");
    sitemap.addEntry(entry1);
    sitemap.addEntry(entry2);
    
    // Create source files
    File sourceFile1 = new File("src/file1.xml");
    sourceFile1.createNewFile();
    File sourceFile2 = new File("src/file2.xml");
    sourceFile2.createNewFile();
    
    // Create XSLT files
    File xsltFile1 = new File("src/xslt1.xsl");
    xsltFile1.createNewFile();
    File xsltFile2 = new File("src/xslt2.xsl");
    xsltFile2.createNewFile();
    
    // Create target files
    File targetFile1 = new File("http://localhost/file1.html");
    File targetFile2 = new File("http://localhost/file2.html");
    
    // Test
