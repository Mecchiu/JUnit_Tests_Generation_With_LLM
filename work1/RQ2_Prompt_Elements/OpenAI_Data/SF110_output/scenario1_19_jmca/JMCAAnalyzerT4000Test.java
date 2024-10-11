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

		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is null.
		*/
		@Test
		void testAnalyzeNull() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				assertEquals("File did not parse correctly", analyzer.analyze(null));
		}
		
		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is an empty ASTNode.
		*/
		@Test
		void testAnalyzeEmpty() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode(ASTNode.NodeType.ROOT);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is a single class.
		*/
		@Test
		void testAnalyzeSingleClass() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode(ASTNode.NodeType.ROOT);
				ASTNode classNode = new ASTNode(ASTNode.NodeType.CLASS);
				classNode.value = "class1";
				root.list.add(classNode);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is a single class with a single method.
		*/
		@Test
		void testAnalyzeSingleClassSingleMethod() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode(ASTNode.NodeType.ROOT);
				ASTNode classNode = new ASTNode(ASTNode.NodeType.CLASS);
				classNode.value = "class1";
				ASTNode methodNode = new ASTNode(ASTNode.NodeType.METHOD);
				methodNode.value = "method1";
				classNode.list.add(methodNode);
				root.list.add(classNode);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is a single class with a single method with a single statement.
		*/
		@Test
		void testAnalyzeSingleClassSingleMethodSingleStatement() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode(ASTNode.NodeType.ROOT);
				ASTNode classNode = new ASTNode(ASTNode.NodeType.CLASS);
				classNode.value = "class1";
				ASTNode methodNode = new ASTNode(ASTNode.NodeType.METHOD);
				methodNode.value = "method1";
				ASTNode statementNode = new ASTNode(ASTNode.NodeType.STATEMENT);
				statementNode.value = "statement1";
				methodNode.list.add(statementNode);
				classNode.list.add(methodNode);
				root.list.add(classNode);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is a single class with a single method with a single statement with a single expression.
		*/
		@Test
		void testAnalyzeSingleClassSingleMethodSingleStatementSingleExpression() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode(ASTNode.NodeType.ROOT);
				ASTNode classNode = new ASTNode(ASTNode.NodeType.CLASS);
				classNode.value = "class1";
				ASTNode methodNode = new ASTNode(ASTNode.NodeType.METHOD);
				methodNode.value = "method1";
				ASTNode statementNode = new ASTNode(ASTNode.NodeType.STATEMENT);
				statementNode.value = "statement1";
				ASTNode expressionNode = new ASTNode(ASTNode.NodeType.EXPRESSION);
				expressionNode.value = "expression1";
				statementNode.list.add(expressionNode);
				methodNode.list.add(statementNode);
				classNode.list.add(methodNode);
				root.list.add(classNode);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is a single class with a single method with a single statement with a single expression with a single term.
		*/
		@Test
		void testAnalyzeSingleClassSingleMethodSingleStatementSingleExpressionSingleTerm() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode(ASTNode.NodeType.ROOT);
				ASTNode classNode = new ASTNode(ASTNode.NodeType.CLASS);
				classNode.value = "class1";
				ASTNode methodNode = new ASTNode(ASTNode.NodeType.METHOD);
				methodNode.value = "method1";
				ASTNode statementNode = new ASTNode(ASTNode.NodeType.STATEMENT);
				statementNode.value = "statement1";
				ASTNode expressionNode = new ASTNode(ASTNode.NodeType.EXPRESSION);
				expressionNode.value = "expression1";
				ASTNode termNode = new ASTNode(ASTNode.NodeType.TERM);
				termNode.value = "term1";
				expressionNode.list.add(termNode);
				statementNode.list.add(expressionNode);
				methodNode.list.add(statementNode);
				classNode.list.add(methodNode);
				root.list.add(classNode);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is a single class with a single method with a single statement with a single expression with a single term with a single factor.
		*/
		@Test
		void testAnalyzeSingleClassSingleMethodSingleStatementSingleExpressionSingleTermSingleFactor() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode(ASTNode.NodeType.ROOT);
				ASTNode classNode = new ASTNode(ASTNode.NodeType.CLASS);
				classNode.value = "class1";
				ASTNode methodNode = new ASTNode(ASTNode.NodeType.METHOD);
				methodNode.value = "method1";
				ASTNode statementNode = new ASTNode(ASTNode.NodeType.STATEMENT);
				statementNode.value = "statement1";
				ASTNode expressionNode = new ASTNode(ASTNode.NodeType.EXPRESSION);
				expressionNode.value = "expression1";
				ASTNode termNode = new ASTNode(ASTNode.NodeType.TERM);
				termNode.value = "term1";
				ASTNode factorNode = new ASTNode(ASTNode.NodeType.FACTOR);
				factorNode.value = "factor1";
				termNode.list.add(factorNode);
				expressionNode.list.add(termNode);
				statementNode.list.add(expressionNode);
				methodNode.list.add(statementNode);
				classNode.list.add(methodNode);
				root.list.add(classNode);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is a single class with a single method with a single statement with a single expression with a single term with a single factor with a single primary.
		*/
		@Test
		void testAnalyzeSingleClassSingleMethodSingleStatementSingleExpressionSingleTermSingleFactorSinglePrimary() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode(ASTNode.NodeType.ROOT);
				ASTNode classNode = new ASTNode(ASTNode.NodeType.CLASS);
				classNode.value = "class1";
				ASTNode methodNode = new ASTNode(ASTNode.NodeType.METHOD);
				methodNode.value = "method1";
				ASTNode statementNode = new ASTNode(ASTNode.NodeType.STATEMENT);
				statementNode.value = "statement1";
				ASTNode expressionNode = new ASTNode(ASTNode.NodeType.EXPRESSION);
				expressionNode.value = "expression1";
				ASTNode termNode = new ASTNode(ASTNode.NodeType.TERM);
				termNode.value = "term1";
				ASTNode factorNode = new ASTNode(ASTNode.NodeType.FACTOR);
				factorNode.value = "factor1";
				ASTNode primaryNode = new ASTNode(ASTNode.NodeType.PRIMARY);
				primaryNode.value = "primary1";
				factorNode.list.add(primaryNode);
				termNode.list.add(factorNode);
				expressionNode.list.add(termNode);
				statementNode.list.add(expressionNode);
				methodNode.list.add(statementNode);
				classNode.list.add(methodNode);
				root.list.add(classNode);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is a single class with a single method with a single statement with a single expression with a single term with a single factor with a single primary with a single literal.
		*/
		@Test
		void testAnalyzeSingleClassSingleMethodSingleStatementSingleExpressionSingleTermSingleFactorSinglePrimarySingleLiteral() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode(ASTNode.NodeType.ROOT);
				ASTNode classNode = new ASTNode(ASTNode.NodeType.CLASS);
				classNode.value = "class1";
				ASTNode methodNode = new ASTNode(ASTNode.NodeType.METHOD);
				methodNode.value = "method1";
				ASTNode statementNode = new ASTNode(ASTNode.NodeType.STATEMENT);
				statementNode.value = "statement1";
				ASTNode expressionNode = new ASTNode(ASTNode.NodeType.EXPRESSION);
				expressionNode.value = "expression1";
				ASTNode termNode = new ASTNode(ASTNode.NodeType.TERM);
				termNode.value = "term1";
				ASTNode factorNode = new ASTNode(ASTNode.NodeType.FACTOR);
				factorNode.value = "factor1";
				ASTNode primaryNode = new ASTNode(ASTNode.NodeType.PRIMARY);
				primaryNode.value = "primary1";
				ASTNode literalNode = new ASTNode(ASTNode.NodeType.LITERAL);
				literalNode.value = "literal1";
				primaryNode.list.add(literalNode);
				factorNode.list.add(primaryNode);
				termNode.list.add(factorNode);
				expressionNode.list.add(termNode);
				statementNode.list.add(expressionNode);
				methodNode.list.add(statementNode);
				classNode.list.add(methodNode);
				root.list.add(classNode);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
		* It tests the case when the input is a single class with a single method with a single statement with a single expression with a single term with a single factor with a single primary with a single literal with a single identifier.
		*/
		@Test
		void testAnalyzeSingleClassSingleMethodSingleStatementSingleExpressionSingleTermSingleFactorSinglePrimarySingleLiteralSingleIdentifier() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode(ASTNode.NodeType.ROOT);
				ASTNode classNode = new ASTNode(ASTNode.NodeType.CLASS);
				classNode.value = "class1";
				ASTNode methodNode = new ASTNode(ASTNode.NodeType.METHOD);
				methodNode.value = "method1";
				ASTNode statementNode = new ASTNode(ASTNode.NodeType.STATEMENT);
				statementNode.value = "statement1";
				ASTNode expressionNode = new ASTNode(ASTNode.NodeType.EXPRESSION);
				expressionNode.value = "expression1";
				ASTNode termNode = new ASTNode(ASTNode.NodeType.TERM);
				termNode.value = "term1";
				ASTNode factorNode = new ASTNode(ASTNode.NodeType.FACTOR);
				factorNode.value = "factor1";
				ASTNode primaryNode = new ASTNode(ASTNode.NodeType.PRIMARY);
				primaryNode.value = "primary1";
				ASTNode literalNode = new ASTNode(ASTNode.NodeType.LITERAL);
				literalNode.value = "literal1";
				ASTNode identifierNode = new ASTNode(ASTNode.NodeType.IDENTIFIER);
				identifierNode.value = "identifier1";
				literalNode.list.add(identifierNode);
				primaryNode.list.add(literalNode);
				factorNode.list.add(primaryNode);
				termNode.list.add(factorNode);
				expressionNode.list.add(termNode);
				statementNode.list.add(expressionNode);
				methodNode.list.add(statementNode);
				classNode.list.add(methodNode);
				root.list.add(classNode);
				assertEquals("File did not parse correctly