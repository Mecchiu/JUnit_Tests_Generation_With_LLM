// Here's an example of a test case for the JMCAAnalyzer class

@Test
void testAnalyze() {
    // create a sample ASTNode
    ASTNode root = new ASTNode("Root");
    ASTNode classNode = new ASTNode("Class");
    classNode.addAttribute("name", "TestClass");
    ASTNode methodNode = new ASTNode("Method");
    methodNode.addAttribute("name", "testMethod");
    classNode.addChild(methodNode);
    root.addChild(classNode);

    // create the analyzer object
    JMCAAnalyzer analyzer = new JMCAAnalyzer();

    // call the analyze method and check the output
    String output = analyzer.analyze(root);
    assertEquals("TestClass\n\ttestMethod\n", output);
}
