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
		/**
		 * Test case.
		* Loads a non-exceptionally nested tree
		* containing all methods of
		* class and its inner classes.
		*/
    @Test
    public void decodeTest() {
        IFXDecoder decoder = new IFXDecoder();
        List children = decoder.decode(null);
        // check that no exception
        Iterator iterator = children.iterator();
        IFXObject object = (IFXObject) iterator.next();
        assertNotNull(object);
        while (iterator.hasNext()) {
            object = (IFXObject) iterator.next();
            if (object.getClass().getDeclaredMethods().length!= 1) {
                fail();
            }
        }
        // check that no exceptions
        if (object.getClass().getDeclaredMethods().length!= 1) {
            fail();
        }
        // check that nothing throws
        String error = "";
        Method m = new IFXMethod("get", IFXString.class);
        Object retObj = decoder.getByRef(object, m);
        assertNotNull(retObj);
        assertTrue(retObj.getClass() == object.getClass());
        int retLen = Array.getLength(retObj);
        Iterator iteratorRet = retObj.getClass().getMethods();
        while (iteratorRet.hasNext()) {
            IFXMethod mObj = (IFXMethod) iteratorRet.next();
            // check which method
            Class<?> method = mObj.getClass();
            if (mObj.getName().equals("get") &&
                    method.getDeclaredMethod("getString")!= null) {
                m = method.getDeclaredMethod("getString");
                mObj = (IFXMethod) mObj.getCallContext();
            }
            Object argsObj = decoder.getArgs(object, m);
            assertNotNull(argsObj);
            IFXObject argsObjRet = (IFXObject) argsObj;
            int argLen = Array.getLength(argsObjRet);
            if (arraySameLength(retObj, argsObjRet)) {
                assertEquals(retLen, argLen);
            }
            // if we see a method, look for
            // a method named getString
            if (m.getName().equals("getString")) {
                m = ifxMethodObject;
            }
        }


    }

    public IFXMethod ifxMethodObject;

    /**
     * Build IObject with default parameters for
     * the class to be tested.
     *
     */
    public static class IObject extends IFXObject {
        public IObject() {
            super();
            this.id = null;
            methodId = IFXObject.noId;
            elementName = null;
        }

        /**
         * Get the element
         * @return the element
         */
        public Element getElement() {
            return element.getFirstChild();
        }

        public IObject(String id, String elementName, int size) {
            super(size);
            this.id = id;
            this.elementName = elementName;
        }

        /**
         * Get the ID of this object and its
         * corresponding element.
         *
         * @return the ID
         */
        public String getId() {
            return id;
        }

        public void setId(String id) {
            if (this.id!= null &&!this.id.equals(id)) {
                IFXObject[] objs = ((IFXObject[]) elements.toArray(new IFXObject[0]));
                IFXString newId = new IFXString();
                newId.setString(