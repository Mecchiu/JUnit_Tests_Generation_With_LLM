// ObjectFactory_1Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createStaticPage()} method.
*/
class ObjectFactory_1Test {
		

    /**
	 * Create a new instance of {@link ObjectFactory_1Test}
	 */
	public ObjectFactory_1Test() {
	}

    /**
     * Constructor with 2 parameters.
     * 
     * {@link ObjectFactory_1Test#createDynamicPage()} and {@link ObjectFactory_1Test#createStaticPage()}
	 * 
	 */
	@Test
    public void testConstraints( @Param("a") int a,@Param("b") int b) {
	}

    /**
     * {@inheritDoc}
	 * 
	 * {@link ObjectFactory_1Test#createDynamicPage()}
	 * {@link ObjectFactory_1Test#createStaticPage()}
	 */
	@Test
    public void testDynamicPage( @Param("a") int a, @Param("b") int b) {
		final int expectedValue = a > 0? (a % 10) == 0? 0 : a : (10-1)*10 + a % 10;
		assertEquals(expectedValue, createDynamicPage().getValue());
	}
}