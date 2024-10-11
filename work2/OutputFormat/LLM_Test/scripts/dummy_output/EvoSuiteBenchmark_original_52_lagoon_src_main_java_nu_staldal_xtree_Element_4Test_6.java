// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {
		
        /**
         * Test method for 
         * {@link org.xml.sax.helpers.AttributesImpl#getLength()} and
         * {@link org.xml.sax.helpers.AttributesImpl#getValue(int)} (CDATA is not a supported attribute type).
         */
        @Test
        public void testCData() {
            
            AttributesImpl attributes = new AttributesImpl();
            String[] stringArray = {"CODE", "VALUE"};
            Vector vector = new Vector();
            for(int index=0;index<2;index++) {
                vector.add(stringArray[index]);
            }
            
            String resultString = "cdata";
            
            // Test
            if(element.getAttributeType("CDATA")!= resultString) {
                fail("expected cdata");
            }
            // Test
            if(element.lookupAttribute("CDATA")!= resultString) {
                fail("expected cdata");
            }
            
            // Test
            assertEquals(resultString,"cdata");
            // Test
            assertEquals(vector.get(0),"CDATA");
            assertEquals(vector.get(1),"VALUE");
        }    
        
		// Test method for
		// {@link Element#getAttributeType(String)} and
		// {@link Element#lookupAttribute(String)} (CDATA is not a supported attribute type).
		@Test
		public void testGetCdata() {
			AttributesImpl attributes = new AttributesImpl();
			String[] stringArray = {"CODE", "VALUE"};
			Vector vector = new Vector();
			for(int index=0;index<2;index++) {
				vector.add(stringArray[index]);
			}
			
			String resultName = "cdata";
			String resultValue = "value";
			
			// Test
			if(element.getAttributeValue("CDATA")!= resultValue) {
				fail("expected CDATA");
			}
			// Test
			if(element.lookupAttribute("CDATA")!= resultName) {
				fail("expected CDATA");
			}
			
			// Test
			assertEquals(resultName,"cdata");
			assertEquals(vector.get(0),"VALUE");
            assertEquals(vector.get(1),"cdata");
        }
	}