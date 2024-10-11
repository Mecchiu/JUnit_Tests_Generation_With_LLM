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
		// Constructor
    
	/**
	 * Tests if {@link IFXDecoder#decode(Element)} should work 
	 * properly.
	 */
	@Test
	  public void Decode() {
	    
	    // test without bundle object
	    try {
	      bundle = new ResourceBundle() {
	        @Override
	        protected Object findResource(String name) throws MissingResourceException {
	          // no resource
	          return null;
	        }
	      };
	      IFXDecoder decoder = new IFXDecoder();
	      IFXObject obj = decoder.decode(IFXObject.getFactory().createElement("aString"));
	      assertEquals(null, obj);
	    } catch (MissingResourceException e) {
		// not a resource bundle
	    }
	    
	    // test empty bundle
	    try {
	      bundle = new ResourceBundle() {
		@Override
		protected Object findResource(String name) throws MissingResourceException {
		  // no resource
		  return null;
		}
	      };
	      decoder = new IFXDecoder();
	      IFXObject obj = decoder.decode(IFXObject.getFactory().createElement("aString"));
	      assertEquals(null, obj);
	      
	    } catch (MissingResourceException e) {
	      // not a resource bundle
	    }

	  }
	  
	  // getXXXMutator Method
	  private Method getGetAccessor(Class<? extends IFXObject> type, String fieldName) {
	    return getGetter(type, fieldName).getMethod(0);
	  }
	  
	  // getXXXMutator Method
	  private Method getGetAccessor(Class<? extends IFXObject> type, String fieldName, Class<?> primitiveType) {
	    return getGetter(type, fieldName).getMethod(1);
	  }
	  
	  // getXXXMutator Method
	  private Method getGetMutator(Class<? extends IFXObject> type, String fieldName) {
	    return getGetter(type, fieldName).getMethod(2);
	  }
	  
	  // getXXXMutator Method
	  private Method getGetMutator(Class<? extends IFXObject> type, String fieldName, Class<?> primitiveType) {
	    return getGetter(type, fieldName).getMethod(3);
	  }
	  
	  // getXXXMutator Method
	  private Method getGetMutator(Class<? extends IFXObject> type, String fieldName, Class<?> primitiveType, Class<?> arrayElementType) {
	    return getGetter(type, fieldName).getMethod(4);
	  }
	  
	  // getXXXMutator Method
	  private Method getGetMutator(Class<? extends IFXObject> type, String fieldName, Class<?> primitiveType, Class<?> arrayElementType, Class<?> objectElementType) {
	    return getGetter(type, fieldName).getMethod(5);
	  }
	  
	  // getXXXMutator Method
	  private Method getGetMutator(Class<? extends IFXObject> type, String fieldName, Class<?> primitiveType, Class<?> arrayElementType, Class<?> objectElementType, Class<?> arrayElementElementType) {
	    return getGetter(type, fieldName).getMethod(6);
	  }
	  
	  // getXXXMutator Method
	  private Class<? extends IBaseType> getGetType(String name) {
	    return getGetType(name, "java");
	  }
	   
	  // getXXXMutator Method
	  private Class<? extends IBaseType> getGetType(String name, Class<?> primitiveType) {
}
}