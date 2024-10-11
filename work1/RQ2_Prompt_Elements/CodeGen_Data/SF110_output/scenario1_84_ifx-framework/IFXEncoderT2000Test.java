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
public static final String nsURI = "", nsPrefix = "",
				encodedPrefix ="test_encodedPrefix";
		private final ResourceBundle bundle;

    public IFXEncoderTest() {
        this.bundle = ResourceBundle.getBundle(encodedPrefix);
    }

	@Test public void setElementAndObject() throws MissingResourceException {
		Element element = new Element(encode(new IFXObject()));

		Element elementToTest = new Element(encode(new IFXObject()), nsURI);
		elementToTest = encode(element);

		IFXObject objOne = new IFXObject();
		objOne.setClassAttributeValue(getElementName(objOne), namespace);
		Object resObjOne = objOne;

		Map namespacesAndPrefixes = new HashMap();
		namespacesAndPrefixes.put(nsURI, encode(objOne));
		namespacesAndPrefixes.put(nsPrefix, namespace);
		IFXObject oneWithoutEncoding = encode(objOne, namespace, null, true);

		IFXObject objTwo = new IFXObject();
		objTwo.setClassAttributeValue(getElementName(objTwo), namespace);
		Object resObjTwo = objTwo;

		IFXObject twoWithoutEncoding = encode(objTwo, namespace, null, true);


		assertTrue(ObjectsEqual.compareObjectsEquals(element, elementToTest, false, true));
		assertTrue(ObjectsEqual.compareObjectsEquals(resObjOne, oneWithoutEncoding, false, true));
		assertTrue(ObjectsEqual.compareObjectsEquals(resObjTwo, twoWithoutEncoding, false, true));
		assertTrue(ObjectsEqual.compareObjectsEquals(objOne, twoWithoutEncoding, false, false));
	}

	@Test public void setElementAndObjectWithNull() throws MissingResourceException {
		Element element = new Element(encode(new IFXObject()));

		Element elementToTest = new Element(encode(new IFXObject()), nsURI);
		elementToTest = encode(element);

		IFXObject objOne = new IFXObject();
		objOne.setClassAttributeValue(getElementName(objOne), namespace);
		Object resObjOne = objOne;

		Map namespacesAndPrefixes = new HashMap();
		namespacesAndPrefixes.put(nsURI, encode(objOne));
		IFXObject oneWithoutEncoding = encode(objOne, namespace, null, true);

		IFXObject objTwo = new IFXObject();
		IFXObject oneWithoutEncoding = encode(objTwo, namespace, null, true);

		IFXObject twoWithoutEncoding = encode(objTwo, namespace, null, true);

		assertTrue(ObjectsEqual.compareObjectsEquals(element, elementToTest, false, true));
		assertTrue(ObjectsEqual.compareObjectsEquals(resObjOne, oneWithoutEncoding, false, true));
		assertTrue(ObjectsEqual.compareObjectsEquals(resObjTwo, twoWithoutEncoding, false, true));
		assertTrue(ObjectsEqual.compareObjectsEquals(objOne, twoWithoutEncoding, false, false));
	}

	@Test public void setElementAndObjectWithEnum() throws MissingResourceException {
		Element element = new Element(encode(new IFXObject()));

		Element elementToTest = new Element(encode(new IFXObject()), nsURI);
		elementToTest = encode(element);

		Enum<IFXObject> enumObjectOne = Enum.valueOf("org.sourceforge", "test_enumEnumOne");
		Object resObjOne = enumObjectOne;

		Map namespacesAndPrefixes = new HashMap();
		namespacesAndPrefixes.put(nsURI, encode(enumObjectOne));
		IFXObject oneWithoutEncoding = encode(enumObjectOne, namespace, null, true);

		IFXObject objTwo = new IFXObject();
		IFXObject oneWithoutEncoding = encode(objTwo, namespace, null, true);

		IFXObject twoWithoutEncoding = encode(objTwo, namespace, null, true);

		assertTrue(ObjectsEqual.