/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import geo.google.utils.XmlUtils;
import java.io.IOException;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.junit.BeforeClass;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

@RunWith(EvoSuiteRunner.class)
public class XmlUtilsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      try {
        XmlUtils.parse("");
        fail("Expecting exception: SAXParseException");
      } catch(SAXParseException e) {
        /*
         * Premature end of file.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Node node0 = XmlUtils.selectNode((Node) iIOMetadataNode0, "XB2");
      assertNull(node0);
  }

  @Test
  public void test2()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      String string0 = XmlUtils.selectValue((Node) iIOMetadataNode0, "XB2");
      assertEquals("", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      XmlUtils xmlUtils0 = new XmlUtils();
      assertNotNull(xmlUtils0);
  }
}
