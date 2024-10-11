// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {
		private final String E_LOCAL_NAME
            = getClass().getName() + "_3_"
				+ new Object() {
					private static boolean bCalled;
					@Override
					public boolean equals(Object o) {
						return super.equals(o);
					}
				};
		
		@Test
		public void getAttributeLocalName() {
			Element.E_LOCAL_NAME = getClass().getName() + "_3_" + new Object() {
				@Override
				public boolean equals(Object o) {
					return super.equals(o);
				}
			};
			final String attrs[] = new String[1];

			final String expectedName = "Attribute";
			
			assertNotNull(Element.E_LOCAL_NAME);
			assertNotNull(expectedName);
			assertEquals(expectedName, E_LOCAL_NAME);
			
			assertNotNull(getAttributeLocalName(0));

            attrs[0] = getAttributeLocalName(0);
			assertTrue(attrs[0] == expectedName);
			bCalled = true;

		}
	}