// Here's an example implementation of JMCAAnalyzerTest class with ten unit test cases for the analyze() method.

// JMCAAnalyzerTest.java
package com.soops.CEN4010.JMCA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JMCAAnalyzerTest {

    @Test
    void testEmptyAST() {
        ASTNode root = new ASTNode("root");
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertEquals("", result);
    }

    @Test
    void testSingleClass() {
        ASTNode root = new ASTNode("root");
        ASTNode classNode = new ASTNode("class");
        classNode.addChild(new ASTNode("className"));
        root.addChild(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertTrue(result.contains("Class: className"));
    }

    @Test
    void testMultipleClasses() {
        ASTNode root = new ASTNode("root");
        ASTNode classNode1 = new ASTNode("class");
        classNode1.addChild(new ASTNode("className1"));
        ASTNode classNode2 = new ASTNode("class");
        classNode2.addChild(new ASTNode("className2"));
        root.addChild(classNode1);
        root.addChild(classNode2);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertTrue(result.contains("Class: className1"));
        assertTrue(result.contains("Class: className2"));
    }

    @Test
    void testSingleMethod() {
        ASTNode root = new ASTNode("root");
        ASTNode classNode = new ASTNode("class");
        ASTNode methodNode = new ASTNode("method");
        methodNode.addChild(new ASTNode("methodName"));
        classNode.addChild(methodNode);
        root.addChild(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertTrue(result.contains("Method: methodName"));
    }

    @Test
    void testMultipleMethods() {
        ASTNode root = new ASTNode("root");
        ASTNode classNode = new ASTNode("class");
        ASTNode methodNode1 = new ASTNode("method");
        methodNode1.addChild(new ASTNode("methodName1"));
        ASTNode methodNode2 = new ASTNode("method");
        methodNode2.addChild(new ASTNode("methodName2"));
        classNode.addChild(methodNode1);
        classNode.addChild(methodNode2);
        root.addChild(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertTrue(result.contains("Method: methodName1"));
        assertTrue(result.contains("Method: methodName2"));
    }

    @Test
    void testSingleStatement() {
        ASTNode root = new ASTNode("root");
        ASTNode classNode = new ASTNode("class");
        ASTNode methodNode = new ASTNode("method");
        ASTNode statementNode = new ASTNode("statement");
        methodNode.addChild(statementNode);
        classNode.addChild(methodNode);
        root.addChild(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertTrue(result.contains("Statement:"));
    }

    @Test
    void testMultipleStatements() {
        ASTNode root = new ASTNode("root");
        ASTNode classNode = new ASTNode("class");
        ASTNode methodNode = new ASTNode("method");
        ASTNode statementNode1 = new ASTNode("statement");
        ASTNode statementNode2 = new ASTNode("statement");
        methodNode.addChild(statementNode1);
        methodNode.addChild(statementNode2);
        classNode.addChild(methodNode);
        root.addChild(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertTrue(result.contains("Statement:"));
        assertTrue(result.contains("Statement:"));
    }

    @Test
    void testVariableDeclaration() {
        ASTNode root = new ASTNode("root");
        ASTNode classNode = new ASTNode("class");
        ASTNode methodNode = new ASTNode("method");
        ASTNode statementNode = new ASTNode("statement");
        ASTNode varDeclNode = new ASTNode("varDecl");
        varDeclNode.addChild(new ASTNode("varName"));
        statementNode.addChild(varDeclNode);
        methodNode.addChild(statementNode);
        classNode.addChild(methodNode);
        root.addChild(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertTrue(result.contains("Variable Declaration: varName"));
    }

    @Test
    void testAssignmentStatement() {
        ASTNode root = new ASTNode("root");
        ASTNode classNode = new ASTNode("class");
        ASTNode methodNode = new ASTNode("method");
        ASTNode statementNode = new ASTNode("statement");
        ASTNode assignNode = new ASTNode("assign");
        assignNode.addChild(new ASTNode("lVal"));
        assignNode.addChild(new ASTNode("rVal"));
        statementNode.addChild(assignNode);
        methodNode.addChild(statementNode);
        classNode.addChild(methodNode);
        root.addChild(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertTrue(result.contains("Assignment Statement:"));
    }

    @Test
    void testIfStatement() {
        ASTNode root = new ASTNode("root");
        ASTNode classNode = new ASTNode("class");
        ASTNode methodNode = new ASTNode("method");
        ASTNode statementNode = new ASTNode("statement");
        ASTNode ifNode = new ASTNode("if");
        ifNode.addChild(new ASTNode("condition"));
        statementNode.addChild(ifNode);
        methodNode.addChild(statementNode);
        classNode.addChild(methodNode);
        root.addChild(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertTrue(result.contains("If Statement:"));
    }

    @Test
    void testWhileStatement() {
        ASTNode root = new ASTNode("root");
        ASTNode classNode = new ASTNode("class");
        ASTNode methodNode = new ASTNode("method");
        ASTNode statementNode = new ASTNode("statement");
        ASTNode whileNode = new ASTNode("while");
        whileNode.addChild(new ASTNode("condition"));
        statementNode.addChild(whileNode);
        methodNode.addChild(statementNode);
        classNode.addChild(methodNode);
        root.addChild(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        assertTrue(result.contains("While Statement:"));
    }
}