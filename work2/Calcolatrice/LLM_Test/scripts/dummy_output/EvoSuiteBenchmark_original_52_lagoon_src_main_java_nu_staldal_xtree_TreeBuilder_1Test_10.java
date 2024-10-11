// TreeBuilder_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains one unit test case for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
		
	/**
	* Test one single XML document.
	* It is valid, since the XML data will not break the tree.
	*/
	@Test
	void testOne() {
		assertEquals(1, (new TreeBuilder()).parseXML("http-get://xml.apache.org/xerces.parsers/features/validation", false).size());
	}
		
}