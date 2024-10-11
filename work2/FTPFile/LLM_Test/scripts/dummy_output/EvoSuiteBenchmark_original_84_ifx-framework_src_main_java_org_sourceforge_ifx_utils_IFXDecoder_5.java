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
     * Generates an IFXDecoder instance based on the value generated in the XML document.
     * Creates no resources. (Useful for unit tests.)
     * @return the generated IFXDecoder instance.
     */
    static IFXDecoder generate() {
    	IFXDecoder result = new IFXDecoder();
        // result.setProperty("logger", org.sourceforge.ifx.log.IFXDecoderTest.class.getName());
    	return result;
    }

    /**
     * Creates a list of resources related to this test case for the {@link IFXDecoder#decode(Element)} method.
     * @return the setOfResources which will be passed to {@link #generate()}.
     */
    static List<ResourceBundle> createResources() {
        List<ResourceBundle> result = new ArrayList<ResourceBundle>();
        generate().decode(result).createBundle("resources/IFXTest.properties");
        return result;
    }

    /**
     * Test which method from a bean, if available, implements the {@link IFXDecoder#getMutator(IFXObject, Element)} method.
     */
    @Test
    public void testGetMutator() {
    	IFXDecoder tested = IFXDecoderTest.generate();
        IFXString mutator = tested.getMutator("/resources/IFXTest.properties");
        assertNotNull(mutator);
        String message = mutator.value();
        assertEquals("IFX", message);
    	
        Class beanClass = null;
		if (TestUtils.isJVM15Runtime()) {
			beanClass = TestUtils.getBeanClassForClassName("org.sourceforge.ifx.utils.IFXDecoderTesterBean");
		} else {
			beanClass = TestUtils.getBeanClassForClassName("IFXDecoderTesterBean");
		}
		assertNotNull(beanClass);
		methodToTest = beanClass.getDeclaredMethod(TestUtils.TEST_PROP);
        test = methodToTest.invoke(tested);
        test.testReadable();
    }
    
	InterfaceTest getIfTest() {
		if (TestUtils.isJVM15Runtime()) {
			return TestUtils.getIfClassForClassName("IFXDecoderTester");
		} else {
			return IFXDecoderTest.generate();
		}
	}

    String name;

    /**
     * Tests the functionality of {@link IFXDecoder#getBeanClassName()} for JDK10
     */
    @Test
    public void testGetBeanClassName() throws Exception {
    	Element element = new Element("testBean");
}
}