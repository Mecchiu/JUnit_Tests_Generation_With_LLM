// Element_1Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfAttributes()} method.
*/
class Element_1Test {
		
//    /**
//     * Unit test for the numberOfAttributes method.
//     */
    @Test
    public void test1() {
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_1Test.class.getMethod("test1").invoke(new Object[] { aClass });
		assertNotNull("Element found in returned Vector", element);
    }

//    /**
//     * Test the {@link Element#numberOfAttributes()} method.
//     */
    public void test2() {
		Element element = (Element) Element_1Test.class.getMethod("test2").invoke(new Object[] { "dilbert" });
		assertNotNull("Element found in returned Vector", element);
    }

//    /**
//     * Test the {@link Element#readAttribute(java.lang.String)} method.
//     */
    public void test3() {
		AttributesImpl test = new AttributesImpl();
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_2Test.class.getMethod("test3", String.class).invoke(new Object[] { aClass });
		
		Vector attributes = new Vector();
		test.clear();
	    element.getAttributes(test);
		assertEquals("Wrong size of Vector", expectedAttributes.length(), test.getLength());
		for( int i=0; i<expectedAttributes.length(); i++ ) {
		    assertEquals("Attribute", expectedAttributes.elementAt(i), test.getQName(i));
		}
    }

//    /**
//     * Test the {@link Element#readAttribute(java.lang.String,java.lang.String)} method.
//     */
    public void test4() {
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_2Test.class.getMethod("test4", String.class, String.class).invoke(new Object[] { aClass, "dilbert", "sally" });
		assertNotNull("Element found in returned Vector", element);
    }

//    /**
//     * Test the {@link Element#hasAttribute(java.lang.String)} method.
//     */
    public void test5() {
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_2Test.class.getMethod("test5", String.class).invoke(new Object[] { aClass });
		assertNotNull("Element found in returned Vector", element);
    }

//    /**
//     * Test the {@link Element#hasAttribute(java.lang.String)} method.
//     */
    public void test6() {
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_1Test.class.getMethod("test6", String.class).invoke(new Object[] { aClass });
		assertNotNull("Element found in returned Vector", element);
    }

//    /**
//     * Test the {@link Element#hasAttribute(java.lang.String)} method.
//     */
    public void test7() {
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_1Test.class.getMethod("test7", String.class).invoke(new Object[] { aClass });
		assertNotNull("Element found in returned Vector", element);
    }

//    /**
//     * Test the {@link Element#hasAttribute(java.lang.String), String name} method.
//     */
    public void test8() {
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_1Test.class.getMethod("test8", String.class, String.class).invoke(new Object[] { aClass });
		assertNotNull("Element found in returned Vector", element);
    }

//    /**
//     * Test the {@link Element#getAttribute(java.lang.String)}, boolean String value} method.
//     */
    public void test9() {
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_1Test.class.getMethod("test9", String.class).invoke(new Object[] { aClass });
		assertNotNull("Element found in returned Vector", element);
    }

//    /**
//     * Test the {@link Element#getAttribute(java.lang.String), String name} method.
//     */
    public void test10() {
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_1Test.class.getMethod("test10", String.class).invoke(new Object[] { aClass });
		assertNotNull("Element found in returned Vector", element);
    }

//    /**
//     * Test the {@link Element#hasText()}.
//     */
    public void test11() {
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_1Test.class.getMethod("test11", String.class).invoke(new Object[] { aClass });
		assertNotNull("Element found in returned Vector", element);
    }

//    /**
//     * Test the {@link Element#isText()} method.
//     */
    public void test12() {
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_1Test.class.getMethod("test12", String.class).invoke(new Object[] { aClass });
		assertNotNull("Element found in returned Vector", element);
	  assertTrue("Element not a Text Node", element instanceof Text);
    }

//    /**
//     * Test the {@link Element#setText} method.
//     */
    public void test13() {
		
		String aClass = "org.jdom.Element";
        Element element = (Element) Element_1Test.class.getMethod("test13", String.class).invoke(new Object[] { aClass });
		assertNotNull("Element found in returned Vector", element);
	  Text text = new Text("dilbert", "sally");
  	element.setText(text);
  	assertEquals("Found Text after setting text", text, element.getText());
	  assertEquals("Number of Attributes after setText", 0, element.getAttributes().getLength());
  	assertTrue("Found Text in generated element", element.toString().indexOf("text")!= 0);
    }

	// End of method Element_1Test
}