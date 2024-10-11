// Test case 1: Test if the output contains the filename
@Test
public void testOutputContainsFilename() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    analyzer.setFilename("test.java");
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("File: test.java"));
}

// Test case 2: Test if the output contains the class name
@Test
public void testOutputContainsClassName() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("Class: CohesionTest"));
}

// Test case 3: Test if the output contains the method names
@Test
public void testOutputContainsMethodNames() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("Method Name"));
    assertTrue(output.contains("deposit"));
    assertTrue(output.contains("withdraw"));
    assertTrue(output.contains("addCD"));
    assertTrue(output.contains("formDet"));
    assertTrue(output.contains("checkBookIn"));
    assertTrue(output.contains("readInput"));
}

// Test case 4: Test if the output contains the cohesion levels
@Test
public void testOutputContainsCohesionLevels() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("Cohesion Level"));
    assertTrue(output.contains("Functional"));
    assertTrue(output.contains("Sequential"));
    assertTrue(output.contains("Communicational"));
    assertTrue(output.contains("Iterative"));
    assertTrue(output.contains("Conditional"));
    assertTrue(output.contains("Coincidental"));
}

// Test case 5: Test if the output is not null
@Test
public void testOutputNotNull() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertNotNull(output);
}

// Test case 6: Test if the output is of type String
@Test
public void testOutputType() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output instanceof String);
}

// Test case 7: Test if the output is not empty
@Test
public void testOutputNotEmpty() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertFalse(output.isEmpty());
}

// Test case 8: Test if the output length is greater than 0
@Test
public void testOutputLength() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.length() > 0);
}

// Test case 9: Test if the output is formatted correctly
@Test
public void testOutputFormat() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.matches(".*File: .*\\nClass: CohesionTest\\n\\nMethod Name.*Cohesion Level.*"));
}

// Test case 10: Test if the output is consistent
@Test
public void testOutputConsistency() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output1 = analyzer.analyze(dummy);
    String output2 = analyzer.analyze(dummy);
    assertEquals(output1, output2);
}
}