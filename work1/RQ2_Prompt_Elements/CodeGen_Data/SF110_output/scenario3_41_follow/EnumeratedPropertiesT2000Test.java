// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains one unit test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {
private final String key = "FOO";
			enum FOO {
			FOO1, FOO2
			}

	@Test
    public void test() {
		EnumeratedProperties esp = new EnumeratedProperties();
		assertEquals(esp.contains(FOO), 			FOO.FOO1 == esp.getEnumeratedProperty(key));
		assertEquals(esp.contains(FOO), 			FOO.FOO2 == esp.getEnumeratedProperty(key));
		assertEquals(esp.contains(FOO), 
					!esp.containsUnset(key));
		esp.setEnumeratedProperty(key, FOO.FOO3);
		assertEquals(esp.contains(FOO.FOO3), FOO.FOO3 == esp.getEnumeratedProperty(key));
		assertTrue(Foo.FOO10 == esp.getEnumeratedProperty(key));
		assertTrue(Foo.FOO11 == esp.getEnumeratedProperty(Foo.FOO12));
    }


}
