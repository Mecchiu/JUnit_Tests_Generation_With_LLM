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
		 * Test the parseXML("text/xml;base=\"http://www.example.org/\"") method with a null stream.
		 */
		@Test
		public void parseXMLEmptyInput() {
			final TreeBuilder tree = new TreeBuilder();
			assertEquals("Expected the empty XML input", null, tree.parseXML("text/xml;base=\"http://www.example.org/\""));
		}

		/**
		 * Test the parseXML("text/xml;base=\"http://www.example.org\"") method with a non empty stream.
		 */
		@Test
		public void parseXMLNonEmptyInput() {
			String inputSource = "<!DOCTYPE root [ \n" +
			                    "<elem root:name=\"root\" text-base=\"http://www.example.org\"/>\n" +
                    "]>";
			String expectedOutput = "<root/>";
			final TreeBuilder tree = new TreeBuilder();
			assertEquals("Expected the parsed xml, but got: "+expectedOutput,expectedOutput,tree.parseXML(inputSource, true).toString());
		}

		/**
		 * Test the parseXML("text/xml;base=\"http://www.example.org\n\"") method.
		 */
		@Test
		public void parseXMLNonEmptyInputAfterBase() {
			String inputSource = "<!DOCTYPE root [ \n" +
			                    "<elem root:name=\"root\" text-base=\"http://www.example.org\"/>\n" +
            "]>";
			final TreeBuilder tree = new TreeBuilder();
			assertEquals("Expected the parsed xml, but got: "+inputSource,inputSource,tree.parseXML(inputSource, true));
			assertEquals("Expected the last element in the xml to not be an xml literal, but it is 'root'",TreeBuilder.ROOT_NAME,"root");
		}

		/**
		 * Test the parseXML("text/xml;base=\"http://www.example.org/\"") method with a valid base.
		 */
		@Test
		public void parseXMLValidBaseInput() {
			final String baseURI = "http://www.example.org/";
			final String baseOutput = TreeBuilder.ROOT_NAME + "/";
			final TreeBuilder tree = new TreeBuilder();
			assertEquals("Expected the parsed xml, but got: "+baseOutput+" "+baseURI,baseOutput,tree.parseXML(baseURI, true).toString());
		}

		/**
		 * Test the parseXML("text/xml;base=\"\"") method with a valid base. The root should be added.
		 */
		@Test
		public void parseXMLNullInput() throws Exception {
			String inputSource = "<!DOCTYPE root [ \n" +
			                    "<elem root:name=\"root\" text-base=\"\"/>\n" +
                    "]>";
			assertEquals("Expected the empty XML input with a valid xml base, but got: "+inputSource,TreeBuilder.ROOT_NAME,inputSource);
		}

		/**
		 * Test XML input with bad base, bad URI to build.
		 */
		@Test
		public void parseXMLBadInputBaseURI() throws Exception {
			String inputSource = "<!DOCTYPE root [ \n" +
			                    "<elem root:name=\"root\" text-base=\"http://www.example.org/\"/>\n" +
                    "]>";
			String expectedError = ErrorReceiver.ROOT_NOT_VALID + " - XML root node cannot be built with root: http://www.example.org/";
			assertThrows(XMLSyntaxException.class, ()->parseXML(inputSource, true), expectedError);
		}

		/**
		 * Test XML input with good base.
		 */
		@Test
		public void parseXMLGoodBaseInput() {
			String inputSource = "<!DOCTYPE root [ \n" +
			                    "<elem root:name=\"root\" text-base=\"http://www.example.org/\"/>\n" +
                "]>";
			final TreeBuilder tree = new TreeBuilder();
			assertEquals("Expected the parsed xml, but got: "+inputSource,TreeBuilder.ROOT_NAME,tree.parseXML(inputSource, true).toString());
		}

}