// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains one unit test case for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {
		/**
		* Unit test method of {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}
		*/
    @Test
    public void testAnalyze() {
        // no operationTest
	UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
	assertTrue( analyzer.analyze(new ASTNode()) == "dummy" );
    	assertTrue( analyzer.hasAnalyzer("dummy") );
    	assertTrue( analyzer.hasAnalyzer("1") );
	assertTrue( analyzer.hasAnalyzer("1") );
	assertTrue( analyzer.hasAnalyzer("1") );
    	assertTrue( analyzer.hasAnalyzer("1") );
    	assertFalse( analyzer.hasAnalyzer("not an analyzer") );
	assertFalse( analyzer.hasAnalyzer("not an analyzer") );
	assertFalse( analyzer.hasAnalyzer("not an analyzer") );
	assertFalse( analyzer.hasAnalyzer("not an analyzer") );
	assertTrue( analyzer.analyze(new ASTNode("dummy")) == "dummy" );
	assertTrue( analyzer.analyze(new ASTNode("1")) == "1" );
	assertTrue( analyzer.analyze(new ASTNode("1")) == "1" );
	assertTrue( analyzer.analyze(new ASTNode("1")) == "1" );
	assertTrue( analyzer.analyze(new ASTNode("not an Analyzer")) == "not an Analyzer" );
	assertFalse( analyzer.analyze(new ASTNode("not an Analyzer")) == "not an Analyzer" );
	assertTrue( analyzer.analyze(new ASTNode("not an Analyzer")) == "not an Analyzer");
	assertFalse( analyzer.analyze(new ASTNode("not an Analyzer")) == "not an Analyzer" );
	assertFalse( analyzer.analyze(new ASTNode("not an Analyzer")) == "not an Analyzer" );
	assertFalse( analyzer.analyze(new ASTNode("not an Analyzer")) == "not an Analyzer" );
	assertFalse( analyzer.analyze(new ASTNode("not an Analyzer")) == "not an Analyzer");
	assertTrue( analyzer.analyze(new ASTNode("1" )) == "1" );
	assertTrue( analyzer.analyze(new ASTNode("1")) == "1" );
	assertTrue( analyzer.analyze(new ASTNode("1")) == "1" );
	assertTrue( analyzer.analyze(new ASTNode("1")) == "1" );
	assertFalse( analyzer.analyze(new ASTNode("not an Analyzer")) == "not an Analyzer");
        // unitTest - empty string
    	assertTrue( analyzer.analyze(new ASTNode("")) == "" );

	assertTrue( analyzer.hasAnalyzer(StringUtils.EMPTY) );
	assertTrue( analyzer.hasAnalyzer(StringUtils.EMPTY + "-") );
	assertFalse( analyzer.hasAnalyzer(StringUtils.EMPTY.concat(StringUtils.EMPTY)) );

    	assertTrue(analyzer.hasAnalyzer("-"));
	assertTrue(analyzer.hasAnalyzer("-"));
	assertTrue(analyzer.hasAnalyzer("-"));
	
    	assertTrue(analyzer.hasAnalyzer(StringUtils.EMPTY.concat("")));

	assertTrue(analyzer.hasAnalyzer("not an Analyzer"));
	assertTrue(analyzer.hasAnalyzer(StringUtils.EMPTY.concat("not an Analyzer")));
    }

	/**
	* Unit test method of {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
	*/
	@Test
	public void testAnalyzeNode() {
		String file = null;
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode dummy = null;
 
		try {
			file = CEN4010Utils.loadTestResourcesRelativePath("CEN/CEN4010-CENC4010_mcf1_4.mcf");
			dummy = CEN4010Utils.loadTestCEN4010Node(file);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

        // test getNode
		assertNotNull( analyzer.analyze(dummy) );
		// test getAnalyzer string
		assertEquals( "Analyzer for " + emptyString + " [value:empty]", analyzer.getDisplayStringForAnalyzer(dummy) );
		// test getAnalyzer boolean
		assertTrue( analyzer.analyze(dummy) );
		// test getAnalyzer String
		assertEquals( string + " [value:empty]", analyzer.getDisplayStringForAnalyzer(dummy) );
		// test getAnalyzer boolean
		assertFalse( analyzer.analyze(dummy) );
	}
	
	private String emptyString="";
	/**
	* Unit test method of {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
	*/
	@Test
	public void testAnalyzeNodeNo() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();

        // test getNode
		assertNotNull( analyzer.analyze(emptyNode) );
		assertEquals( "Analyzer for " + emptyString + " [value:empty]", analyzer.getDisplayStringForAnalyzer(emptyNode) );
		assertTrue( analyzer.analyze(emptyNode) );
		assertTrue( analyzer.analyze(emptyNode) );
		assertTrue( analyzer.analyze(emptyNode) );
		assertTrue( analyzer.analyze(emptyNode) );
		assertFalse( analyzer.analyze(emptyNode) );
	}


	/**
	* Unit test methode of {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
	*/
    public ASTNode emptyNode;

	@Test
    public void testEmptyNode() {
	    emptyNode = new ASTNode("");

	    // test getNode
	    assertNotNull( analyzer.analyze(emptyNode));
	    assertEquals( "Analyzer for " + emptyString + " [value:empty]", analyzer.getDisplayStringForAnalyzer(emptyNode) );
	    assertTrue( analyzer.analyze(emptyNode) );
	    assertTrue( analyzer.analyze(emptyNode) );
	    assertTrue( analyzer.analyze(emptyNode) );
	    assertTrue( analyzer.analyze(emptyNode) );
	    assertTrue( analyzer.analyze(emptyNode) );
	    assertFalse( analyzer.analyze(emptyNode) );
    }
}