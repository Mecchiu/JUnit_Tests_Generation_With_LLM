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
	 * Encodes an IFXObject to an xml element.
	 * @param obj an Object to convert
	 * @return the encoded XML Element representation of the provided object.
	 * @exception IOException if an error occured saving the output buffer.
	 * @exception IFXException wrapped by other exceptions.
	*/
	private Element encode(IFXObject obj) throws IOException, IFXException {
		return encode(obj, null);
	}

	/**
	 * Encodes anIFXObject to an xml element.
	 * @param obj an object to convert.
	 * @return the generated xml element representation of the provided object.
	 * @exception IOException if an error occured saving the output buffer.
	 * @exception IFXException wrapped by other exceptions.
	*/
	private Element encode(IFXObject obj, HashMap<String, String> map) throws IOException, IFXException {

		Class<?> javaClass = obj.getClass();
		Element newElement = new Element("IFX");

		if(javaClass.getName().equals("java.lang.String")) {
			javaClass = String.class;
		}
		newElement.setAttribute("name", javaClass.getName());

		List<Element> elementList = new ArrayList<>();

	    if(map!= null) {
			Map<String,String> attributeMap = new HashMap<>();

			for(String key : map.keySet()) {
				attributeMap.put(key, map.get(key));
			}

			if(!attributeMap.isEmpty()) {
				newElement.setAttributes(attributeMap);
			}
		}

		for(Class<?> cls : getAccessors(obj)) {
			newElement.addContent(cls.newInstance().encode(obj));
		}
		for(Class<IFXObject> rtcls : javaClass.getClasses()) {
			newElement.addContent(rtcls.newInstance().encode(obj));
		}
		//newElement.setAttribute("nsprefix", "ns");

		//newElement.addContent(obj.getContent().encode(obj));

        HashMap<String,String> namespaceMap = obj.getNamespaceMap();

		if(namespaceMap!= null) {
			// Save namespace map
			ArrayList<String> keys = namespaceMap.keySet();

			for(String key : keys) {
				if(!map.containsKey(key)) {
					newElement.setAttribute(key + "Map", namespaceMap.get(key));
				}
			}
		}

		return newElement;

	}

	/**
	 * Encode a given object to a new XML with no namespace
	 * @param obj the object to encode
	 * @return the generated XML element representation of the provided object.
	 * @exception IOException if an error occured saving the output buffer.
	 * @exception IFXException wrapped by other exceptions
	*/
	private Element encode_no_ns(IFXObject obj) throws IOException, IFXException {
		OutputStream os = null;
		try {
			os = new ByteArrayOutputStream();
			encode(obj, new HashMap<>());
	        return XMLEncoder.encodeXML(os, bundle);
		} catch (IOException e) {
			throw e;
		} catch (MissingResourceException e) {
			throw new IFXException();
		} finally {
			closeResources(os);			
		}		
	}
	
	/**
	 * Encode the contents