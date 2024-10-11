// DefaultFSPathTest.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import net.sf.sugar.fspath.xpath.RegexFunctionResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultFSPath}.
* It contains one unit test case for the {@link DefaultFSPath#query(String)} method.
*/
class DefaultFSPathTest {
		
    /**
     *  Convenience method for making a File object in the given directory
     *  Using the DefaultFsPath object
     */
    static File createFile (String str) throws IOException{
        return new DefaultFsPath(str).getRootDirectory();
    }

//   private static final String s = "test");
//
//   private static final String n = "test-no-attr";
//   private static final String a = "attribute", b="child";
//   private static final String e = "element", f = "file";
//   private static final String g = "grandchild-grandchild", h = "grandgrandchild";
//
//   private static final String F1 = "first-child-element", F2 = "second-child-element", F3 = "third-child-element", F4 = "fourth-child-element";
//   private static final String X1  = "parent";
//   private static final String X2  = "child", XYZ = "grandchild-grandchild", ZZ = "grandgrandchild";
//
//   private static final QName Q1 = new QName(X1), Q2 = new QName(X2);
//   private static final QName Q3 = new QName(ZZ);
//
//   private static final Class<? extends File> SRC = DefaultFsPathTest.class;

//   // private static final Map<String, String> attrsToBeImportedToTest = new HashMap(){{put("testChild", "firstChild"); put(null, "grandChild");}};
//
//   /**
//    *  The Class attribute should be imported using the attributeToBeImportedToTest map
//    *  Note - if null is passed, the default value will be set to "".
//    */
//   private static final Map<String, String> attrsToBeImportedToTest = new HashMap(){{put("testChild", "firstChild"); put("testGrandChild", "grandChild");}};
//
//   /**
//    *  The testFile attribute should be imported using the attributeToBeImportedToTest map
//    *  Note - if null is passed, the default value will be set to "".
//    */
//   private static final Map<String, String> attrsToBeImportedToTestNoAttr = new HashMap(){{put("testGrandChild", "grandChild");}};
//
//   private static final String INVALID = null;
//
//   protected void testImportedFile(String filename, String attr, Class<? extends File> expectedClassName, Map attrs) throws FileNotFoundException {
//       File file = new DefaultFsPath(filename).getRootDirectory();
//      
//       QName qName = new QName(attr);
//      
//       File importedFile = getTestFile(file);
//       assertEquals(expectedClassName.getName(), expectedClassName.get
}