// TreeBuilder_0Test.java
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
* It contains one unit test case for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {
		/**
		 * Run the test with the given test parameters.
		 * @param testParameters A test parameter tuple
		 * @return The tests output (the output of this method can be interpreted by a JUnit parser).
		 */
		public String runTest(String[] testParameters) throws Exception{
		StringWriter sw = new StringWriter();
		XMLWriter out = new XMLWriter(sw);
		boolean result = TreeBuilder.fileToInputSource(new File(testParameters[0]));
		out.close();
		return sw.toString();
    }
		/**
		 * Run the test using the default character encoding of the current system.
		 */
		public final void runDefaultTest() throws Exception {
			runTest(new String[] {"test/junit/xml/TreeBuilderXTreeBuilderTest/TreeBuilder._0.default.xml"});
		}
		/**
		 * Run the test using a different character set.
		 */
		public final void runMixedTest() throws Exception {
			runTest(new String[] {"test/junit/xml/TreeBuilderXTreeBuilderTest/TreeBuilder._0.xml", "test/junit/xml/TreeBuilderXTreeBuilderTest/TreeBuilder._0.1.xml",
					"test/junit/xml/TreeBuilderXTreeBuilderTest/TreeBuilder._0.xml-utf-8",
					"test/junit/xml/TreeBuilderXTreeBuilderTest/TreeBuilder._0.xml-utf-8_encoded"});
		}

		/**
		 * Run an XML file named test/junit/xml/TreeBuilderXTreeBuilderTest/TreeBuilder._0.default.xml using the default character
		 * encoding.
		 */
		public final void runDefaultTest_Default_UTF8Encoded() throws Exception {
			runTest(new String[] {"test/junit/xml/TreeBuilderXTreeBuilderTest/TreeBuilder._0.utf8-encoded.xml",
					"test/junit/xml/TreeBuilderXTreeBuilderTest/TreeBuilder._0.default.xml"});
		}
}