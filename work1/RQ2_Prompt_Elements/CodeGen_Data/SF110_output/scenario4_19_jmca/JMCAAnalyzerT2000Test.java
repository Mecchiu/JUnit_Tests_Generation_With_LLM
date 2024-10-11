// JMCAAnalyzerTest.java
package com.soops.CEN4010.JMCA;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAAnalyzer}.
* It contains one unit test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
*/
class JMCAAnalyzerTest {
private String[] tokens = {"c#", "d", "e"};

			private String[] strings = {"a", "b", "c", "d", "e"};
			private int[] ints = {"1", "2", "3", "-1", "-2", "-3"}; 
			private double[] doubles = {"1", "2", "3", "4"};
			private double[] doubles1 = {"1.0", "2.0", "3.0"};
		private ASTNode[] nodes;
		private ArrayList<String> classesForCodegen;

	
	
		/**
		 * Call the constructor for a class - 
		 * first - generates the arrayList of classes and its modifiers
		 * @param classList List<String> classes
		 * @param list ArrayList<ASTNode> list of statements inside the main
		 * @exercise constructor - first - collects all the classes,modifiers and values
		 * @exercise constructor2 - first-and only class
		 * @exercise second - creates the arrayList of methods - uses both types of lists from the variable
		 * @see java/lang/Object
		 */
	@Test
	public void testConstructor() {
		
		this.classesForCodegen = new ArrayList<String>();
		String var;
		String classNameOfFunction;
		String val;
		String valString;
		String rval;
		String rvalString;
		
		classNameOfFunction = "";
		val = "";
		classNameOfFunction += "   public "+ this.tokens[0] + "(){  "+ this.tokens[1] + "  }\n\n";
		classNameOfFunction += "   "+ this.classesForCodegen.get(0) + " {  \n";
		classNameOfFunction += this.classesForCodegen.get(0) + "  {\n";
		classNameOfFunction += this.classesForCodegen.get(0) +  "      return " + this.tokens[2] + ";\n";
		classNameOfFunction += "    }\n\n";
		classNameOfFunction += "   public "+ this.tokens[1] + "()  {\n";
		classNameOfFunction += "    return " + this.ints[0] + ";\n";
		classNameOfFunction += "   }\n\n";
		classNameOfFunction += this.classesForCodegen.get(0) + "  {\n";
		classNameOfFunction += this.classesForCodegen.get(0) + "    for " + this.ints[1] + " in {";
		classNameOfFunction += this.tokens[1] + "\n";
		classNameOfFunction += "      }\n";
		classNameOfFunction += "\n\n";
		classNameOfFunction += this.classesForCodegen.get(0) + "  {\n";
		classNameOfFunction += this.classesForCodegen.get(0) + "    for " + this.ints[1] + " in {";
		classNameOfFunction += this.tokens[2] + "\n";
		classNameOfFunction += this.classesForCodegen.get(0) + "        for " + this.ints[1] + " in {";
		classNameOfFunction += this.classesForCodegen.get(0) + "     }\n";
		classNameOfFunction += "  }\n";
		classNameOfFunction += "\n\n";
		classNameOfFunction += this.classesForCodegen.get(0) + "    {  \n";
		classNameOfFunction += this.classesForCodegen.get(0) + "      return "+this.doubles[3] + ";\n";
		classNameOfFunction += "    }\n\n";
		classNameOfFunction += " }\n\n";
		classNameOfFunction += "\n\n";
		classNameOfFunction += this.classesForCodegen.get(0) + "\n\n";
		classNameOfFunction += "   "+ this.classesForCodegen.get(0) + "() {"  + this.doubles[2] + "  }\n";
		classNameOfFunction += "\n\n";
		classNameOfFunction +=  "   "+ this.classesForCodegen.get(0) + "  {\n";
		classNameOfFunction += this.classesForCodegen.get(0) + "    public  static  public int " + this.doubles[0] + "  =  " + "  {" + this.tokens[2] + "  };\n";
		classNameOfFunction += this.classesForCodegen.get(0) + "    public  static  public  int " + this.double1 + "  =  " + "  {" + this.ints[1] + "  };\n";
		classNameOfFunction += this.classes