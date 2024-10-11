// StrongestExtensionTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrongestExtension}.
* It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
*/
class StrongestExtensionTest {
			@Test
			void testStrongestExtension1() {
				String className = "ClassA";
				List<String> extensions = List.of("ExtensionA", "ExtensionB", "ExtensionC");
				String expected = "ClassA.ExtensionB";
				String actual = StrongestExtension.strongestExtension(className, extensions);
				assertEquals(expected, actual);
			}

			@Test
			void testStrongestExtension2() {
				String className = "ClassB";
				List<String> extensions = List.of("ExtensionA", "ExtensionB", "ExtensionC");
				String expected = "ClassB.ExtensionA";
				String actual = StrongestExtension.strongestExtension(className, extensions);
				assertEquals(expected, actual);
			}

			@Test
			void testStrongestExtension3() {
				String className = "ClassC";
				List<String> extensions = List.of("ExtensionA", "ExtensionB", "ExtensionC");
				String expected = "ClassC.ExtensionC";
				String actual = StrongestExtension.strongestExtension(className, extensions);
				assertEquals(expected, actual);
			}

			@Test
			void testStrongestExtension4() {
				String className = "ClassD";
				List<String> extensions = List.of("ExtensionA", "ExtensionB", "ExtensionC");
				String expected = "ClassD.ExtensionA";
				String actual = StrongestExtension.strongestExtension(className, extensions);
				assertEquals(expected, actual);
			}

			@Test
			void testStrongestExtension5() {
				String className = "ClassE";
				List<String> extensions = List.of("ExtensionA", "ExtensionB", "ExtensionC");
				String expected = "ClassE.ExtensionB";
				String actual = StrongestExtension.strongestExtension(className, extensions);
				assertEquals(expected, actual);
			}

			@Test
			void testStrongestExtension6() {
				String className = "ClassF";
				List<String> extensions = List.of("ExtensionA", "ExtensionB", "ExtensionC");
				String expected = "ClassF.ExtensionC";
				String actual = StrongestExtension.strongestExtension(className, extensions);
				assertEquals(expected, actual);
			}

			@Test
			void testStrongestExtension7() {
				String className = "ClassG";
				List<String> extensions = List.of("ExtensionA", "ExtensionB", "ExtensionC");
				String expected = "ClassG.ExtensionA";
				String actual = StrongestExtension.strongestExtension(className, extensions);
				assertEquals(expected, actual);
			}

			@Test
			void testStrongestExtension8() {
				String className = "ClassH";
				List<String> extensions = List.of("ExtensionA", "ExtensionB", "ExtensionC");
				String expected = "ClassH.ExtensionB";
				String actual = StrongestExtension.strongestExtension(className, extensions);
				assertEquals(expected, actual);
			}

			@Test
			void testStrongestExtension9() {
				String className = "ClassI";
				List<String> extensions = List.of("ExtensionA", "ExtensionB", "ExtensionC");
				String expected = "ClassI.ExtensionC";
				String actual = StrongestExtension.strongestExtension(className, extensions);
				assertEquals(expected, actual);
			}

			@Test
			void testStrongestExtension10() {
				String className = "ClassJ";
				List<String> extensions = List.of("ExtensionA", "ExtensionB", "ExtensionC");
				String expected = "ClassJ.ExtensionA";
				String actual = StrongestExtension.strongestExtension(className, extensions);
				assertEquals(expected, actual);
			}
}