// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains one unit test case for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
/**
		* This is the name of HTMLFilterTest.
		*/
        public static String HTTPDestroyTestProc = "destroy()";

        /**
        * Test if destroy() method is called by HTMLFilter instance after the instance has been destroyed with JNDI.
        */
        @Test
	public void testDestroy() {
            HTMLFilter filter = new HTMLFilter();
            assertTrue("instance will not be destroyed", filter.isDestroyed());
            filter.destroy();
            assertTrue("instance's destroy(int){} method should not be called when instance was destroyed",!filter.isDestroyed());
        }
}