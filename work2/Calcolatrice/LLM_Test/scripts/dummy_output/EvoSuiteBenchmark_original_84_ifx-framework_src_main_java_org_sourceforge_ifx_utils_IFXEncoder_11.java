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
		* The number of iterations of testing that will be executed. Default
		* is 16.
		*/
    private static final int i = 16;

    /**
     * Encode an object with JDOM as the XML output format.
     * @return the XML element representing this object
     * @see ifx.IFXEncoder
	*/
	public Element encode(IFXObject obj) throws IFXException {
	    ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    XMLOutputter xml = new XMLOutputter(XMLOutputter.FORMAT_NONE);
	    xml.setOutput(bos,xmlIndentSize);
	    obj.write(xml);
	    return (Element)xml.getDOM().
	    parse("<IFQO>\n" +
		   "<objname>IFXEncoderTest</objname>\n" +
	    	   "<indent number>1</indent>\n" +
		       "\n</IFQO>",SAXBuilder.feature("org.jdom.text"));
	}

	/**
	* Test case to encode a list of IFXObjects.
	* @see ifx.IFXEncoder#encode(IFXObject)
	*/
	@Test
	public void testEncode() throws IFXException,IOException {
	    IFXObject[] array = IFXObject.getArray(i);
	    for (int j=0;j<10;j++) {
	        IFXObject obj1 = array[j];
	        IFXObject obj2 = array[j+1];
	        IFXObject obj3 = array[j+2];
	        IType objType = getXmlTypeByName(obj1.getClassName());
	        IFXObject obj4 = getObjectById(obj1,objType);
	        IFXObject obj5 = getObjectById(obj2,objType);
	        IFXObject obj6 = getObjectById(obj3,objType);
	        IFXObject obj7 = getObjectById(obj4,objType);
	        IFXObject obj8 = getObjectById(obj5,objType);
	        IFXObject obj9 = getObjectById(obj6,objType);
	        IFXObject obj10 = getObjectById(obj7,objType);
	        IFXObject obj11 = getObjectById(obj8,objType);
	        IFXObject obj12 = getObjectById(obj9,objType);
	        IFXObject obj13 = getObjectById(obj10,objType);
	        IFXObject obj14 = getObjectById(obj11,objType);
	        IFXObject obj16 = getObjectById(obj12,objType);
	        System.out.println(obj1);
	        System.out.println(obj2);
	        System.out.println(obj3);
	    }
	}
    /**
    * Constructs an IFXEncoder from the specified set of input fields.
    * @param xml
    * @param keyList a List of names of fields in the XML document
    */
    private IFXEncoder(List xmlList) {
       setXmlList(xmlList);
    }

    /**
    * Set the element list for this object.
    * This method is only used if a List of names of field in the XML
    * document does not exist.
    * @param xmlList
    */
    private void setXmlList(List xmlList) {
}
}