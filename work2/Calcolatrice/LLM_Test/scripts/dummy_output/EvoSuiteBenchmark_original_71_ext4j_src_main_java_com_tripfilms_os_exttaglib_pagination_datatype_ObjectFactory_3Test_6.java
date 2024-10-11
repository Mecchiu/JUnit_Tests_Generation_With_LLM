// ObjectFactory_3Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactory_3Test {
		
    /**
     * Unit test for {@link ObjectFactory#createPages()} method.
     */
    @Test
    public void testCreatePages() {
        assertNotNull(ObjectFactory.createPages());
		assertEquals(ObjectFactory.createPages().size(), 5);
		assertTrue(ObjectFactory.createPages() instanceof Pagination);
    }
    
}