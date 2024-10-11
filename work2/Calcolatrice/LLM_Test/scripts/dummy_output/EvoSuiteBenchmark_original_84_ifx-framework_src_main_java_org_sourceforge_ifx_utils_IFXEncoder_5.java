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
		 * The name of the XML element.
		 */
	public static final String NAME = "name";

	/**
	 * The type which represents an array element.
	 * Does not include the "value" array element.
	 */
	public static final String ARRAY_TYPE = "arrayType";

	/**
	 * The type which represents a string element.
	 */
	public static final String STRING_TYPE = "stringType";

	/**
	 * The type which represents a list element.
	 * It is assumed to be a reference to an IFXObject subclass, and its
	 * "value" field will point to "arrayType".
	 */
	public static final String LIST_TYPE = "listType";

	/**
	 * The name of the XML element for an IFXArray.
	 */
	public static final String ARRAY_ELEMENT = "arrayElement";

	/**
	 * The name of the XML element for an IFXString.
	 */
	public static final String STRING_ELEMENT = "stringElement";

	/**
	 * The name of the XML element for an IFXObjectRef.
	 */
	public static final String OBJECT_REF_ELEMENT = "objectRef";

	/**
	 * The name of the XML element for an IFXObjectReference.
	 */
	public static final String OBJECT_REFERENCE_ELEMENT = "objectReference";

	/**
	 * The name of the XML element for an IFXList.
	 */
	public static final String LIST_ELEMENT = "listElement";

	/**
	 * The name of the XML element for an IFXObject reference.
	 */
	public static final String OBJECT_REF_ELEMENT_BUNDLE_NAME = "ifxObjectRef";
		/**
	 * The name of the XML element for an ifxElement.
	 */
	public static final String ELEMENT = "element";

	/**
	 * The name of the XML element for an list.
	 */
	public static final String LIST = "list";

    /**
     * Sets the namespaces for encoding the given IFXObject object under the
     * given base class.
     * @param baseClass the Base Class which is used where encoding is done.
     * @param base the base Element, containing the encoding information.
     */
    public static void setNamespaces(Class baseClass, Element base) {
        Namespace nso = null;
        if (baseClass.getName().equals(IFXList.class.getName())) {
            nso = Namespace.NO_NAMESPACE;
        } else {
            nso = Namespace.getNamespaceByPrefix(baseClass, "ifx");
        }
        Namespace.applyNamespace(base, nso);
    }

    /**
     * Returns an array which contains the IFXObjects contained as a
     * list.
     * @return an array of IFXObjects.
     */
    public List getArrayList() {
}
}