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
* It contains one unit test case for the {@link IFXDecoder#decode(Element)} method.
*/
class IFXDecoderTest {
// IFXDecoder.java
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
 * Decodes an IFX XML String to its equivalent Framework bean.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.3 $
 */
public class IFXDecoder {

    /**
     * Decodes the element into its equivalent IFX XML representation.
     *
     * @param element the Element to decode.
     * @return an IFXObject.
     * @exception IFXException wrapper for underlying exception.
     */
    public IFXObject decode(Element element) throws IFXException {
        try {
            String id = element.getAttributeValue("Id");
            String beanClassName = getBeanClassName(element);
            IFXObject obj = (IFXObject) Class.forName(beanClassName).newInstance();
            List children = element.getChildren();
            if (children.size() == 0) {
                String text = element.getText();
                if (text!= null && text.trim().length() > 0) {
                    if (!(obj instanceof IBaseType)) {
                        throw new IFXException("Leaf node not an instance of IBaseType: " + obj.getClass().getName());
                    } else {
                        ((IBaseType) obj).setString(text);
                        return obj;
                    }
                } else {
                    // return the empty object
                    return obj;
                }
            } else {
                Iterator childIter = children.iterator();
                while (childIter.hasNext()) {
                    Element childElement = (Element) childIter.next();
                    IFXObject childObj = decode(childElement);
                    // run corresponding accessor method to see if the
                    // result is an array
                    Method accessorMethod = getAccessor(obj, childElement);
                    Object retValObj = accessorMethod.invoke(obj, null);
                    boolean isArray = accessorMethod.getReturnType().isArray();
                    // then get the mutator method and invoke it
                    Method mutatorMethod = getMutator(obj, childElement);
                    if (isArray) {
                        // if result is an array, build a new array with
                        // size = returned array size + 1, and stuff this
                        // object at the end of the array
                        IFXObject[] childObjs = null;
                        if (retValObj!= null) {
                            int oldLen = Array.getLength(retValObj);
                            childObjs = (IFXObject[]) Array.newInstance(childObj.getClass(), new int[] { oldLen + 1 });
                            IFXObject[] retValObjs = (IFXObject[]) retValObj;
                            System.arraycopy(retValObj, 0, childObjs, 0, oldLen);
                            childObjs[oldLen] = childObj;
                        } else {
                            childObjs = (IFXObject[]) Array.newInstance(childObj.getClass(), new int[] { 1 });
                            childObjs[0] = childObj;
                        }
                        mutatorMethod.invoke(obj, new Object[] { childObjs });
                    } else {
                        mutatorMethod.invoke(obj, new Object[] { childObj });
                    }
                }
                // if Id attribute is specified, populate it
                if (id!= null) {
                    Method mutatorMethod = getMutator(obj, "Id");
                    IFXString idObj = new IFXString();
                    idObj.setString(id);
                    mutatorMethod.invoke(obj, new Object[] { idObj });
                }
                return obj;
            }
        } catch (Exception e) {
            throw new IFXException("Error decoding " + element.getName(), e);
        }
    }
}

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
* It contains one unit test case for the {@link IFXDecoder#decode(Element)} method.
*/
class IFXDecoderTest {
		/*
   * The number of objects in this test.
   */
    static final int NUMBER_OF_OBJECTS = 9;

		/*
    * The number of arrays in this test.
    */
	static final int NUMBER_OF_ARRAY_ELEMENTS = 4;

		/*
  * The number of class types in this test.
  */
	static final int NUMBER_OF_BEAN_CLASSES = 7;

  static final IFXClassType[] classTypes = new IFXClassType[NUMBER_OF_BEAN_CLASSES];
  static {
    // Initialize all class types
    int i = 0;
    for (i = IFXClassType.classTypeID;
			i < classTypes.length;
			i++) {
			if (!classTypes[i].isClass()) {
				System.out.println("IFXClassType: "+classTypes[i].getClass().getName()+" not an IFXClass");
				System.exit(255);
			} else {
				classTypes[i] = ClassTypeFactory.create(classTypes[i]);
			}
    }
  }

	/**
	 * Run the unit test case for {@link IFXDecoder#decode(Element)} method.
	*/
	@Test public void testCasesDecoding() {

          IFXObject[][] objects = new IFXObject[NUMBER_OF_OBJECTS] ;
	List classAndArrayTypes = ClassTypeFactory.getAllClassTypes();
	for (int i = 0; i < classAndArrayTypes.size(); i++) {
		objects[i] = new IFXObject[NUMBER_OF_ARRAY_ELEMENTS];
	}
	IFXDecoder decoder = new IFXDecoder();
	boolean done = false;
	try {
		for (int i = 0; i < NUMBER_OF_OBJECTS; i++) {
			IFXClassType classType = (IFXClassType)classAndArrayTypes.get(i);
			String id = classType.getName() + "_" + classType.getClass().getSimpleName() + "_" + classType.getExtends();
			IFXObject obj = decoder.decode("ID=" + id);
			objects[i] = new IFXObject[NUMBER_OF_ARRAY_ELEMENTS];
            System.out.print("Testing class " + i);
            System.out.println(": ");

            System.out.print("Testing object " + obj.getName());
            System.out.println(": ");

			System.out.print(obj.getClass().getName());
            System.out.println(": ");

			int position = 0;
			Object arrayObj = Array.newInstance(obj.getClass().getName(), NUMBER_OF_ARRAY_ELEMENTS);
			for (int j = NUMBER_OF_ARRAY_ELEMENTS; j > 0; j--) {
				System.out.print(j + ": ");
				Method getMethod = classType.getMethod("get"+j);
				if (getMethod!= null) {
					Object retValueObj = getMethod.invoke(obj);
					for (int n = 0; n < j; n++) {
						Object tmpObj = Array.get(retValueObj, position);
						Class type = tmpObj.getClass();
						if (tmpObj instanceof IFXObject)