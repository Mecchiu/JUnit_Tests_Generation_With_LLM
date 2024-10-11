// StrongestExtensionTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrongestExtension}.
* It contains one unit test case for the {@link StrongestExtension#strongestExtension(String, List)} method.
*/
class StrongestExtensionTest {

		@Test
		void testStrongestExtension1() {
			assertEquals(StrongestExtension.strongestExtension("StringList", "1,2,3,4,5,6"), "<Int>:1");
		}
		
		@Test
		void testStrongestExtension2() {
			assertEquals(StrongestExtension.strongestExtension("StringList", "b,c,d"), "<Int>:3");
		}
		
		@Test
		void testStrongestExtensionWithExtensions() {
			assertEquals(StrongestExtension.strongestExtension("StringList", "1,2,3,4,5,6,"), "<Int>:1");
		}
		
		@Test
		void testStrongestExtensionWithTwoExtensions() {
			List<String> exts = new ArrayList<>(1);
			exts.add("1");
			exts.add("2");
			
			assertEquals(StrongestExtension.strongestExtension("StringList", exts), "<Int>:2");
		}
}

// StrongestExtensionTest.java