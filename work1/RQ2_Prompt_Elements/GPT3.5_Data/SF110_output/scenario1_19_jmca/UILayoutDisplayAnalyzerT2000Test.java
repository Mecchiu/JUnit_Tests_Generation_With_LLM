// Test case 1: Test if the output contains the filename
@Test
public void testOutputContainsFilename() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("File:"));
}

// Test case 2: Test if the output contains the class name
@Test
public void testOutputContainsClassName() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("Class:"));
}

// Test case 3: Test if the output contains the method names
@Test
public void testOutputContainsMethodNames() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("Method Name"));
}

// Test case 4: Test if the output contains the cohesion levels
@Test
public void testOutputContainsCohesionLevels() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("Cohesion Level"));
}

// Test case 5: Test if the output contains the deposit method with Functional cohesion
@Test
public void testOutputContainsDepositMethodWithFunctionalCohesion() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("deposit                                 Functional"));
}

// Test case 6: Test if the output contains the withdraw method with Sequential cohesion
@Test
public void testOutputContainsWithdrawMethodWithSequentialCohesion() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("withdraw                                Sequential"));
}

// Test case 7: Test if the output contains the addCD method with Communicational cohesion
@Test
public void testOutputContainsAddCDMethodWithCommunicationalCohesion() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("addCD                                   Communicational"));
}

// Test case 8: Test if the output contains the formDet method with Iterative cohesion
@Test
public void testOutputContainsFormDetMethodWithIterativeCohesion() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("formDet                                 Iterative"));
}

// Test case 9: Test if the output contains the checkBookIn method with Conditional cohesion
@Test
public void testOutputContainsCheckBookInMethodWithConditionalCohesion() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("checkBookIn                             Conditional"));
}

// Test case 10: Test if the output contains the readInput method with Coincidental cohesion
@Test
public void testOutputContainsReadInputMethodWithCoincidentalCohesion() {
    ASTNode dummy = new ASTNode();
    UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
    String output = analyzer.analyze(dummy);
    assertTrue(output.contains("readInput                               Coincidental"));
}
}