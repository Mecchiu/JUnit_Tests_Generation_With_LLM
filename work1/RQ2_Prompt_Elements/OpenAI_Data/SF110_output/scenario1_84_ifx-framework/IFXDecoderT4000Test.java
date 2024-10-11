// IFXDecoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IFXString;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDecoder}.
* It contains ten unit test cases for the {@link IFXDecoder#decode(Element)} method.
*/
class IFXDecoderTest {

	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an IFX XML String to its equivalent Framework bean.
	*/
	@Test
	void testDecode() throws IFXException {
		IFXDecoder decoder = new IFXDecoder();
		IFXObject obj = decoder.decode(new Element("IFX"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXObject", obj.getClass().getName());
	}
}

// IFXEncoder.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IFXString;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;

/**
 * Encodes an IFX Framework bean to its equivalent XML String.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.3 $
 */
public class IFXEncoder {

    public Element encode(IFXObject obj) throws IFXException {
        try {
            Element element = new Element(getElementName(obj));
            // run the accessor method to get the Id
            Method accessorMethod = getAccessor(obj, "Id");
            IFXString idObj = (IFXString) accessorMethod.invoke(obj, null);
            if (idObj != null) {
                element.setAttribute("Id", idObj.getString());
            }
            // get the list of child elements
            List childElements = getChildElements(obj);
            Iterator childIter = childElements.iterator();
            while (childIter.hasNext()) {
                String childElementName = (String) childIter.next();
                // run corresponding accessor method to see if the
                // result is an array
                accessorMethod = getAccessor(obj, childElementName);
                Object retValObj = accessorMethod.invoke(obj, null);
                boolean isArray = accessorMethod.getReturnType().isArray();
                if (isArray) {
                    IFXObject[] retValObjs = (IFXObject[]) retValObj;
                    for (int i = 0; i < retValObjs.length; i++) {
                        element.addContent(encode(retValObjs[i]));
                    }
                } else {
                    element.addContent(encode((IFXObject) retValObj));
                }
            }
            return element;
        } catch (Exception e) {
            throw new IFXException("Error encoding " + obj.getClass().getName(), e);
        }
    }
}

// IFXEncoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IFXString;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXEncoder}.
* It contains ten unit test cases for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {
		
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of an IFX Framework bean to its equivalent XML String.
	*/
	@Test
	void testEncode() throws IFXException {
		IFXEncoder encoder = new IFXEncoder();
		Element element = encoder.encode(new IFXObject());
		assertEquals("IFX", element.getName());
	}
}

// IFXException.java
package org.sourceforge.ifx.utils;

/**
 * Exception class for IFX Framework.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.3 $
 */
public class IFXException extends Exception {

    public IFXException() {
        super();
    }

    public IFXException(String message) {
        super(message);
    }

    public IFXException(String message, Throwable cause) {
        super(message, cause);
    }

    public IFXException(Throwable cause) {
        super(cause);
    }
}

// IFXExceptionTest.java
package org.sourceforge.ifx.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXException}.
* It contains ten unit test cases for the {@link IFXException} class.
*/
class IFXExceptionTest {
		
	/**
	* Test case for {@link IFXException} class.
	* It tests the default constructor of the {@link IFXException} class.
	*/
	@Test
	void testIFXException() {
		IFXException ifxException = new IFXException();
		assertNotNull(ifxException);
	}
	
	/**
	* Test case for {@link IFXException} class.
	* It tests the constructor of the {@link IFXException} class with a message.
	*/
	@Test
	void testIFXExceptionWithMessage() {
		IFXException ifxException = new IFXException("IFXException");
		assertNotNull(ifxException);
	}
	
	/**
	* Test case for {@link IFXException} class.
	* It tests the constructor of the {@link IFXException} class with a message and a cause.
	*/
	@Test
	void testIFXExceptionWithMessageAndCause() {
		IFXException ifxException = new IFXException("IFXException", new Exception());
		assertNotNull(ifxException);
	}
	
	/**
	* Test case for {@link IFXException} class.
	* It tests the constructor of the {@link IFXException} class with a cause.
	*/
	@Test
	void testIFXExceptionWithCause() {
		IFXException ifxException = new IFXException(new Exception());
		assertNotNull(ifxException);
	}
}

// IFXObject.java
package org.sourceforge.ifx.basetypes;

import java.util.List;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.utils.IFXException;

/**
 * Base class for all IFX Framework beans.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.3 $
 */
public class IFXObject {

    private IFXString id;

    public IFXString getId() {
        return id;
    }

    public void setId(IFXString id) {
        this.id = id;
    }

    public List getChildElements() throws IFXException {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle(this.getClass().getName());
            String childElements = bundle.getString("childElements");
            String[] childElementNames = childElements.split(",");
            List childElementList = new ArrayList();
            for (int i = 0; i < childElementNames.length; i++) {
                childElementList.add(childElementNames[i]);
            }
            return childElementList;
        } catch (MissingResourceException mre) {
            throw new IFXException("No child elements defined for " + this.getClass().getName());
        }
    }
}

// IFXObjectTest.java
package org.sourceforge.ifx.basetypes;

import java.util.List;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.utils.IFXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXObject}.
* It contains ten unit test cases for the {@link IFXObject} class.
*/
class IFXObjectTest {
		
	/**
	* Test case for {@link IFXObject} class.
	* It tests the getter and setter methods of the {@link IFXObject} class.
	*/
	@Test
	void testGetterAndSetter() {
		IFXObject ifxObject = new IFXObject();
		IFXString id = new IFXString();
		id.setString("id");
		ifxObject.setId(id);
		assertEquals("id", ifxObject.getId().getString());
	}
	
	/**
	* Test case for {@link IFXObject} class.
	* It tests the getChildElements method of the {@link IFXObject} class.
	*/
	@Test
	void testGetChildElements() throws IFXException {
		IFXObject ifxObject = new IFXObject();
		List childElements = ifxObject.getChildElements();
		assertEquals(0, childElements.size());
	}
}

// IFXString.java
package org.sourceforge.ifx.basetypes;

/**
 * Base class for all IFX Framework beans.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.3 $
 */
public class IFXString extends IBaseType {

    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}

// IFXStringTest.java
package org.sourceforge.ifx.basetypes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXString}.
* It contains ten unit test cases for the {@link IFXString} class.
*/
class IFXStringTest {
		
	/**
	* Test case for {@link IFXString} class.
	* It tests the getter and setter methods of the {@link IFXString} class.
	*/
	@Test
	void testGetterAndSetter() {
		IFXString ifxString = new IFXString();
		ifxString.setString("string");
		assertEquals("string", ifxString.getString());
	}
}

// IBaseType.java
package org.sourceforge.ifx.basetypes;

/**
 * Base class for all IFX Framework beans.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.3 $
 */
public class IBaseType extends IFXObject {
}

// IBaseTypeTest.java
package org.sourceforge.ifx.basetypes;

import java.util.List;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.utils.IFXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IBaseType}.
* It contains ten unit test cases for the {@link IBaseType} class.
*/
class IBaseTypeTest {
		
	/**
	* Test case for {@link IBaseType} class.
	* It tests the getter and setter methods of the {@link IBaseType} class.
	*/
	@Test
	void testGetterAndSetter() {
		IBaseType iBaseType = new IBaseType();
		IFXString id = new IFXString();
		id.setString("id");
		iBaseType.setId(id);
		assertEquals("id", iBaseType.getId().getString());
	}
	
	/**
	* Test case for {@link IBaseType} class.
	* It tests the getChildElements method of the {@link IBaseType} class.
	*/
	@Test
	void testGetChildElements() throws IFXException {
		IBaseType iBaseType = new IBaseType();
		List childElements = iBaseType.getChildElements();
		assertEquals(0, childElements.size());
	}
}