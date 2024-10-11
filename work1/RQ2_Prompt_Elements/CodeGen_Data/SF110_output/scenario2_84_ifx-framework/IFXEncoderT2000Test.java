// IFXEncoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.Writer;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.output.XMLOutputter;
import org.jdom.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXEncoder}.
* It contains one unit test case for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {

    /**
     * Test static methods of {@link IFXEncoder}.
     */
    @Test
    public void oneInstance() {
        assertTrue(new IFXEncoder().getAccessors().size() == 1);
        assertTrue(new IFXEncoder().getElement().getLocalName() == "Element");
    }

    /**
     * Test to write out to a string.
     */
    @Test
    public void writeString()  {
        IFXEncoder instance = new IFXEncoder();
        Element element = instance.encode(new IFXObject()).getRootElement();
        StringWriter sw = new StringWriter();
        instance.encode(new IFXObject(), sw).getRootElement().write(new OutputStreamWriter(sw));
        Element output = new Element("IFXWriterTest", namespace);
        output.addContent(element);
        System.out.println(output.toString());
        assertFalse(sw.toString().equals(""));
    }

    @Test
    public void testWithResourceBundle() {
    		ResourceBundle rbn = ResourceBundle.getBundle( "IFXEncodingResources");
    		Element element = new Element(getElementName(), Namespace.getNamespace("IFX", "IFX"));
    		OutputStream output = null;
    		try {
    			output = new ByteArrayOutputStream();
    			XMLOutputter.outputProperty(output, Namespace.getNamespace("IFX", "IFX"));
    			XMLOutputter output2 = new XMLOutputter(output);
    			output2.write(element, null, true);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		assertTrue(rbn.getString(getElementName() + ".error.type") == null);
    		assertFalse(rbn.getString(getElementName() + ".error.type") == null);
    		assertFalse(rbn.getString(getElementName() + ".error.type").equals(null));
    		assertFalse(rbn.getString(getElementName() + ".error.type").equals(""));
    		// Check the output stream is a byte array!
    		byte[] baOutput = output.toByteArray();
    		assertTrue("output is not a byte array!", baOutput.length > 0);
    		assertTrue("output length is not 2", baOutput.length == 2);
    }
}

class IFXEncodingResources {
    public String getElementName() {
        return "IFXEncodingResources";
    }
}

/**
 * Test harness for IFXEncoder.
 * It tests the {@link IFXEncoder#getElementList()} method - checks that list element is returned.
 *
 * @author Sujit Pal
 */
public class IFXEncoderHarness extends IFXEncoderTest {

    @Override
    protected ResourceBundle getResourceBundle() {
        return ResourceBundle.getBundle("IFXEncodingResourcesBundle");
    }

    private void assertEquals(List output, List expected) {
        List actual = new ArrayList();
        Iterator it = output.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            actual.add(String.valueOf(obj));
        }
        assertEquals(actual, expected);
    }

    private Namespace getElementNamespace() {
    	try {
	        return Namespace.getNamespace("IFX", "IFX");
    	} catch (MissingResourceException e) {
    		fail("Element namespace not defined");
    	} catch (IOException e) {
    		fail(e);
    	}
    	return null;
    }

    @Override
    protected Element getElement(Element current) {
    	try {
	        