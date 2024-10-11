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
 	 * Test method for {@link IFXDecoder#decode(Element)} for null element.
  	 */
  @Test
  public void testNullElement() {
    IFXDecoderTest.this.testNullElement(null);
  }
  
  /**
 	 * Test method for {@link IFXDecoder#decode(Element)} for a good empty element.
  	 */
  @Test
  public void testGoodElement() {
    IFXDecoderTest.this.testGoodElement(createGoodElement("<bad/>"));
  }

  /**
  * Test method for {@link IFXDecoder#getMutator(IFXObject,Element)} for a good element.
  * @param element the element representing the mutator.
  * @exception IFXException wraps the original exception thrown.
  */
  private void testGoodElement(Element element) throws IFXException {
    mockStatic(IFXDecoder.class);
    try {
      IFXDecoderTest.this.createMutator(element);
    } catch (MissingResourceException x) {
      fail("Exception in IFXDecoderTest.testGoodElement() :: createMutator(). "
          + "Failure in IFXDecoderTest.createMutator() with the following message: "
          + x.getMessage());
    }
  }
 
  /**
  * Test method for {@link IFXDecoder#getAccessor(IFXObject,Element)} for a good element.
  * @param element the element representing the accessor.
  * @exception IFXException wraps the original exception thrown.
  */
  private void testGoodElement(Element element) throws IFXException {
    IFXDecoderTest.this.createAccessor(element);
  }
  
  /**
  * Test method for {@link IFXDecoder#getMutator(IFXObject,Element)} for a bad element.
  * @param element the element representing the mutator.
  * @exception IFXException wraps the original exception thrown.
  */
  private void testBadElement(Element element) throws IFXException {
    mockStatic(IBaseType.class);
    try {
      IFXDecoderTest.this.createMutator(element);
    } catch (MissingResourceException x) {
      fail("Exception in IFXDecoderTest.testBadElement() :: createMutator(). "
          + "Failure in IFXDecoderTest.createMutator() with the following message: "
          + x.getMessage());
    }
  }
  
  /**
  * Test method for {@link IFXDecoder#getAccessor(IFXObject,Element)} for a bad element.
  * @param element the element representing the accessor.
  * @exception IFXException wraps the original exception thrown.
  */
  private void testBadElement(Element element) throws IFXException {
    IFXDecoderTest.this.createAccessor(element);
  }

  /**
* This method implements the test behavior of the method tests.
**/
  private void createMutator(Element element) throws IFXException {
    if (bundle == null) {
      bundle = ResourceBundle.getBundle(IFXModule.class.getName());
    }
    IFXObject object = new IFXObject();
    Object mutator = createMutator(element);
    // set object to the bean that was passed in
    object.putIFXObject(mutator, element);
    IFXDecoderTest.this.createMutator(element);
  }

  private void createMutator(Element element, Object mutator)
    throws MissingResourceException, IFXException {
    IFXDecoderTest.this.createAccessor(element, mutator);
  }

  private String createGoodElement(String content) {
    IFXObject object = new IFXObject(content);
    return (IFXObject) ((IFXString) object.getIFXType()).getIFXObject();
  }

  private Object createMutator(Element element) {
    // get mutator
    Object mutator = IFXDecoderTest.this.getMutator(element);
    
    // check object
    Object result = (object = ((IFXString) mutator).getIFXObject());
    assertNotNull(result);
    // check if result is a IFXString
    IFXString string = (IFXString) result;
    assertNotNull(string);

    return result;
  }

  private IBaseType createBaseType(String className, String type) {
}
}