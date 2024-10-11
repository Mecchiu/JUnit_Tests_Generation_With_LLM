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
		* Decodes the element into its equivalent IFX XML representation.
		*
		* @param element the Element to decode.
		* @return an IFXObject.
		* @exception IFXException wrapper for underlying exception.
		*/
		@Test
    public void decode(Element element) throws IFXException {
			IFXString string;
			Class<?> tClass;
			Object array;
			int n = 10;

			// Test <string></string>
			string = findElement(element, "string", "java.lang.String", n);
			assertNotNull(string);

			// Test other types
			tClass = IFXString.class;
			array = IFXDecoder.parseArrayOfObjects(element, tClass);
			assertNotNull(array);
			assertTrue("Array of objects expected", array instanceof IFXObject[0]);
			assertTrue("Array of string expected", array instanceof IFXString[]);

			// Test only <string></string>
			string = findElement(element, "string", "", n);
			assertEquals(IFXString.class.getSimpleName(), string.getClassName());

			// Test only <string></string>
			string = findElement(element, "string", "", 0);
			assertEquals(IFXString.class.getSimpleName(), string.getClassName());

			// Test <array></array>
			array = IFXDecoder.parseArrayOfObjects(element, IFXString[].class);
			assertNotNull(array);
			assertTrue("Array of string expected", array instanceof IFXString[0]);

			// Test only <array></array>
			array = IFXDecoder.parseArrayOfObjects(element, IFXString[].class);
			assertNotNull(array);
			assertTrue("Array of string expected", array instanceof IFXString[0]);

			// Test missing <string></String>
			string = findElement(element, "string", "", 1);
			assertNull(string);
		}

        /**
         * Find the object corresponding to the type of Element element.
         *
         * @param element the Element to parse.
         * @param targetClass the target Class where to extract the corresponding
         *        object.
         * @param name the fully qualified name of the object.
         * @param n the index of the element in the array.
         * @return the object corresponding to the Element element.
         * @throws MissingResourceException if <String></String>
         * @throws IllegalArgumentException if <array></array>
         * @throws IFXException wraps underlying problems with the underlying
         *        underlying implementation.
         */
        private <T> T findObjectImpl(Element element, Class<T> targetClass, String name, int n) throws
                MissingResourceException, IllegalArgumentException, IFXException {
                return targetClass.getDeclaredConstructor(Object.class).newInstance(element);
        }

        /**
         * Find Element in xml string.
         *
         * @param xmlString String that acts as a String array.
         * @param expectedClass Class name of the element.
         * @return an Element corresponding to the Element specified in xmlString.
         * @throws IFXException wrapper for underlying exception.
         */
        private Element findElement(String xmlString, String expectedClass, String name, int n) throws
                IFXException {
            try {
                Element result = getXML(xmlString, expectedClass);
                assertNotNull(result);
                Element target = result.getChild(name);
                assertNotNull(target);
                return target.element(n);
            } catch (BadElementException ex) {
               throw new IFXException(ex.getMessage()+" " + name,ex);
            }
        }

        // Get xmllist from xmlString
        private Element getXML(String xmlString, String expectedClass) throws
                IFXException {
            try {
                return new org.jdom.input.XMLInputSource(xmlString).asDOM().getRootElement();
            } catch (XMLStreamException ex) {
                throw new IFXException(ex.getMessage()+" " + expectedClass,ex);
            }
        }

		/**
		* Parses a set of object from an array of objects.
		*
		* @param array Object array.
		* @param targetClass The array of classes from which elements should be
		*        consumed.
		* @return an array of the object corresponding to each element in the array.
		* @throws IllegalArgumentException if <array></array>
		* @throws IFXException wraps underlying problems with the underlying
		*        underlying implementation.
		*/
        private Object[] parseArrayOfObjects(String xmlString, Class<?>[] targetClass)
                throws IFXException {
            List<Object> result = null;
            try {
                result = getXML(xmlString, targetClass).getChild("objects").getChildren();
            } catch (BadElementException ex) {
                throw new IFXException(ex.getMessage() + " " + targetClass.length + "(" + targetClass.length + ") " +
                                         result.size(),ex);
            } catch (XMLStreamException ex) {
                throw new IFXException(ex.getMessage() + " " + targetClass.length + "(" + targetClass.length + ")",ex);
            }
            return (result == null? null : result.toArray());
        }

        /**
         * Decodes an IFX XML Element.
         *
         * @param element the Element to decode.
         * @return an IFXObject.
         * @exception IFXException wrapper for underlying exception.
         */
        public IFXObject decode(Element element) throws IFXException {
            Class<?> targetClass;
            Object array;
            int n = 10;
            System.out.println("Target Class for element in \""+element.getName()+"\":");
            try {
                targetClass = IFXDecoder.findTargetClass(element.getName());
            } catch (MissingResourceException ex) {
                System.out.println("No target class specified, returning empty array of class: ");
                targetClass = IFXObject.class;
            }
            TypeDescriptor tDesc = TypeDescriptorFactory.findTypeDescriptor(targetClass);
            if (tDesc == null) {
                System.err.println("Could not find target class");
                n = 0;
                return new IFXObject(IN