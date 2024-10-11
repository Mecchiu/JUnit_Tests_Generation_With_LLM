// ObjectFactory_0Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_0Test {

    /**
     * Test of createPage method, of class ObjectFactory.
     */
    @Test
    public void testCreatePage() {

        Page page = ObjectFactory.createPage();
     assertEquals(Page.class, page.getClass());
    }

}