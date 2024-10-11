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
	* Test case 1 for {@link JMCAAnalyzer#analyze(ASTNode)}.
	* It tests the analyze method with a simple program.
	*/
	@Test
	void testAnalyze1() {
		JMCAAnalyzer analyzer = new JMCAAnalyzer();
		ASTNode root = new ASTNode("Program", "Program");
		ASTNode node1 = new ASTNode("Statement", "Statement");
		ASTNode node2 = new ASTNode("Assignment", "Assignment");
		ASTNode node3 = new ASTNode("Variable", "Variable");
		ASTNode node4 = new ASTNode("Identifier", "Identifier");
		ASTNode node5 = new ASTNode("Identifier", "Identifier");
		ASTNode node6 = new ASTNode("Identifier", "Identifier");
		ASTNode node7 = new ASTNode("Identifier", "Identifier");
		ASTNode node8 = new ASTNode("Identifier", "Identifier");
		ASTNode node9 = new ASTNode("Identifier", "Identifier");
		ASTNode node10 = new ASTNode("Identifier", "Identifier");
		ASTNode node11 = new ASTNode("Identifier", "Identifier");
		ASTNode node12 = new ASTNode("Identifier", "Identifier");
		ASTNode node13 = new ASTNode("Identifier", "Identifier");
		ASTNode node14 = new ASTNode("Identifier", "Identifier");
		ASTNode node15 = new ASTNode("Identifier", "Identifier");
		ASTNode node16 = new ASTNode("Identifier", "Identifier");
		ASTNode node17 = new ASTNode("Identifier", "Identifier");
		ASTNode node18 = new ASTNode("Identifier", "Identifier");
		ASTNode node19 = new ASTNode("Identifier", "Identifier");
		ASTNode node20 = new ASTNode("Identifier", "Identifier");
		ASTNode node21 = new ASTNode("Identifier", "Identifier");
		ASTNode node22 = new ASTNode("Identifier", "Identifier");
		ASTNode node23 = new ASTNode("Identifier", "Identifier");
		ASTNode node24 = new ASTNode("Identifier", "Identifier");
		ASTNode node25 = new ASTNode("Identifier", "Identifier");
		ASTNode node26 = new ASTNode("Identifier", "Identifier");
		ASTNode node27 = new ASTNode("Identifier", "Identifier");
		ASTNode node28 = new ASTNode("Identifier", "Identifier");
		ASTNode node29 = new ASTNode("Identifier", "Identifier");
		ASTNode node30 = new ASTNode("Identifier", "Identifier");
		ASTNode node31 = new ASTNode("Identifier", "Identifier");
		ASTNode node32 = new ASTNode("Identifier", "Identifier");
		ASTNode node33 = new ASTNode("Identifier", "Identifier");
		ASTNode node34 = new ASTNode("Identifier", "Identifier");
		ASTNode node35 = new ASTNode("Identifier", "Identifier");
		ASTNode node36 = new ASTNode("Identifier", "Identifier");
		ASTNode node37 = new ASTNode("Identifier", "Identifier");
		ASTNode node38 = new ASTNode("Identifier", "Identifier");
		ASTNode node39 = new ASTNode("Identifier", "Identifier");
		ASTNode node40 = new ASTNode("Identifier", "Identifier");
		ASTNode node41 = new ASTNode("Identifier", "Identifier");
		ASTNode node42 = new ASTNode("Identifier", "Identifier");
		ASTNode node43 = new ASTNode("Identifier", "Identifier");
		ASTNode node44 = new ASTNode("Identifier", "Identifier");
		ASTNode node45 = new ASTNode("Identifier", "Identifier");
		ASTNode node46 = new ASTNode("Identifier", "Identifier");
		ASTNode node47 = new ASTNode("Identifier", "Identifier");
		ASTNode node48 = new ASTNode("Identifier", "Identifier");
		ASTNode node49 = new ASTNode("Identifier", "Identifier");
		ASTNode node50 = new ASTNode("Identifier", "Identifier");
		ASTNode node51 = new ASTNode("Identifier", "Identifier");
		ASTNode node52 = new ASTNode("Identifier", "Identifier");
		ASTNode node53 = new ASTNode("Identifier", "Identifier");
		ASTNode node54 = new ASTNode("Identifier", "Identifier");
		ASTNode node55 = new ASTNode("Identifier", "Identifier");
		ASTNode node56 = new ASTNode("Identifier", "Identifier");
		ASTNode node57 = new ASTNode("Identifier", "Identifier");
		ASTNode node58 = new ASTNode("Identifier", "Identifier");
		ASTNode node59 = new ASTNode("Identifier", "Identifier");
		ASTNode node60 = new ASTNode("Identifier", "Identifier");
		ASTNode node61 = new ASTNode("Identifier", "Identifier");
		ASTNode node62 = new ASTNode("Identifier", "Identifier");
		ASTNode node63 = new ASTNode("Identifier", "Identifier");
		ASTNode node64 = new ASTNode("Identifier", "Identifier");
		ASTNode node65 = new ASTNode("Identifier", "Identifier");
		ASTNode node66 = new ASTNode("Identifier", "Identifier");
		ASTNode node67 = new ASTNode("Identifier", "Identifier");
		ASTNode node68 = new ASTNode("Identifier", "Identifier");
		ASTNode node69 = new ASTNode("Identifier", "Identifier");
		ASTNode node70 = new ASTNode("Identifier", "Identifier");
		ASTNode node71 = new ASTNode("Identifier", "Identifier");
		ASTNode node72 = new ASTNode("Identifier", "Identifier");
		ASTNode node73 = new ASTNode("Identifier", "Identifier");
		ASTNode node74 = new ASTNode("Identifier", "Identifier");
		ASTNode node75 = new ASTNode("Identifier", "Identifier");
		ASTNode node76 = new ASTNode("Identifier", "Identifier");
		ASTNode node77 = new ASTNode("Identifier", "Identifier");
		ASTNode node78 = new ASTNode("Identifier", "Identifier");
		ASTNode node79 = new ASTNode("Identifier", "Identifier");
		ASTNode node80 = new ASTNode("Identifier", "Identifier");
		ASTNode node81 = new ASTNode("Identifier", "Identifier");
		ASTNode node82 = new ASTNode("Identifier", "Identifier");
		ASTNode node83 = new ASTNode("Identifier", "Identifier");
		ASTNode node84 = new ASTNode("Identifier", "Identifier");
		ASTNode node85 = new ASTNode("Identifier", "Identifier");
		ASTNode node86 = new ASTNode("Identifier", "Identifier");
		ASTNode node87 = new ASTNode("Identifier", "Identifier");
		ASTNode node88 = new ASTNode("Identifier", "Identifier");
		ASTNode node89 = new ASTNode("Identifier", "Identifier");
		ASTNode node90 = new ASTNode("Identifier", "Identifier");
		ASTNode node91 = new ASTNode("Identifier", "Identifier");
		ASTNode node92 = new ASTNode("Identifier", "Identifier");
		ASTNode node93 = new ASTNode("Identifier", "Identifier");
		ASTNode node94 = new ASTNode("Identifier", "Identifier");
		ASTNode node95 = new ASTNode("Identifier", "Identifier");
		ASTNode node96 = new ASTNode("Identifier", "Identifier");
		ASTNode node97 = new ASTNode("Identifier", "Identifier");
		ASTNode node98 = new ASTNode("Identifier", "Identifier");
		ASTNode node99 = new ASTNode("Identifier", "Identifier");
		ASTNode node100 = new ASTNode("Identifier", "Identifier");
		ASTNode node101 = new ASTNode("Identifier", "Identifier