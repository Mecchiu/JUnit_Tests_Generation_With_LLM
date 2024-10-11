// JMCAAnalyzerTest.java
package com.soops.CEN4010.JMCA;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JMCAAnalyzer}.
 * It contains ten unit test cases for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
 */
class JMCAAnalyzerTest {

    @Test
    void testEmptyAST() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(null);
        assertEquals("File did not parse correctly", result);
    }

    @Test
    void testSingleClass() {
        ASTNode root = new ASTNode("class", "MyClass");
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        String expected = "Class: MyClass\n";
        assertEquals(expected, result);
    }

    @Test
    void testMultipleClasses() {
        ASTNode root = new ASTNode("root", "");
        ASTNode class1 = new ASTNode("class", "MyClass1");
        ASTNode class2 = new ASTNode("class", "MyClass2");
        root.list.add(class1);
        root.list.add(class2);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        String expected = "Class: MyClass1\nClass: MyClass2\n";
        assertEquals(expected, result);
    }

    @Test
    void testClassWithFields() {
        ASTNode root = new ASTNode("root", "");
        ASTNode classNode = new ASTNode("class", "MyClass");
        ASTNode field1 = new ASTNode("field", "int x");
        ASTNode field2 = new ASTNode("field", "String y");
        classNode.list.add(field1);
        classNode.list.add(field2);
        root.list.add(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        String expected = "Class: MyClass\nFields:\nint x\nString y\n";
        assertEquals(expected, result);
    }

    @Test
    void testClassWithMethods() {
        ASTNode root = new ASTNode("root", "");
        ASTNode classNode = new ASTNode("class", "MyClass");
        ASTNode method1 = new ASTNode("method", "public void foo()");
        ASTNode method2 = new ASTNode("method", "private int bar(String s)");
        classNode.list.add(method1);
        classNode.list.add(method2);
        root.list.add(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        String expected = "Class: MyClass\nMethods:\npublic void foo()\nprivate int bar(String s)\n";
        assertEquals(expected, result);
    }

    @Test
    void testClassWithFieldsAndMethods() {
        ASTNode root = new ASTNode("root", "");
        ASTNode classNode = new ASTNode("class", "MyClass");
        ASTNode field1 = new ASTNode("field", "int x");
        ASTNode field2 = new ASTNode("field", "String y");
        ASTNode method1 = new ASTNode("method", "public void foo()");
        ASTNode method2 = new ASTNode("method", "private int bar(String s)");
        classNode.list.add(field1);
        classNode.list.add(field2);
        classNode.list.add(method1);
        classNode.list.add(method2);
        root.list.add(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        String expected = "Class: MyClass\nFields:\nint x\nString y\nMethods:\npublic void foo()\nprivate int bar(String s)\n";
        assertEquals(expected, result);
    }

    @Test
    void testNestedClasses() {
        ASTNode root = new ASTNode("root", "");
        ASTNode class1 = new ASTNode("class", "MyClass1");
        ASTNode class2 = new ASTNode("class", "MyClass2");
        ASTNode class3 = new ASTNode("class", "MyClass3");
        class2.list.add(class3);
        class1.list.add(class2);
        root.list.add(class1);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        String expected = "Class: MyClass1\nClass: MyClass2\nClass: MyClass3\n";
        assertEquals(expected, result);
    }

    @Test
    void testClassWithInheritance() {
        ASTNode root = new ASTNode("root", "");
        ASTNode classNode = new ASTNode("class", "MyClass");
        ASTNode extendsNode = new ASTNode("extends", "MyParentClass");
        classNode.list.add(extendsNode);
        root.list.add(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        String expected = "Class: MyClass\nExtends: MyParentClass\n";
        assertEquals(expected, result);
    }

    @Test
    void testClassWithInterfaces() {
        ASTNode root = new ASTNode("root", "");
        ASTNode classNode = new ASTNode("class", "MyClass");
        ASTNode implementsNode1 = new ASTNode("implements", "MyInterface1");
        ASTNode implementsNode2 = new ASTNode("implements", "MyInterface2");
        classNode.list.add(implementsNode1);
        classNode.list.add(implementsNode2);
        root.list.add(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        String expected = "Class: MyClass\nImplements: MyInterface1, MyInterface2\n";
        assertEquals(expected, result);
    }

    @Test
    void testClassWithModifiers() {
        ASTNode root = new ASTNode("root", "");
        ASTNode classNode = new ASTNode("class", "MyClass");
        ASTNode modifierNode1 = new ASTNode("modifier", "public");
        ASTNode modifierNode2 = new ASTNode("modifier", "abstract");
        classNode.list.add(modifierNode1);
        classNode.list.add(modifierNode2);
        root.list.add(classNode);
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(root);
        String expected = "Class: MyClass\nModifiers: public, abstract\n";
        assertEquals(expected, result);
    }
}