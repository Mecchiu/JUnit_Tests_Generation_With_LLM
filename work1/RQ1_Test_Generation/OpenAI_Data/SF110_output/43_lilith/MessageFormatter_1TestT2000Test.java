// MessageFormatter_1Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFormatter}.
* It contains ten unit test cases for the {@link MessageFormatter#countArgumentPlaceholders(String)} method.
*/
class MessageFormatter_1Test {

		@Test
		public void testCountArgumentPlaceholders_null() {
				int result = MessageFormatter.countArgumentPlaceholders(null);
				assertEquals(0, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_empty() {
				int result = MessageFormatter.countArgumentPlaceholders("");
				assertEquals(0, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_noPlaceholders() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello World!");
				assertEquals(0, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_onePlaceholder() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello {}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_twoPlaceholders() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello {}! {}");
				assertEquals(2, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\{}!");
				assertEquals(0, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder2() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder3() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\{}!");
				assertEquals(0, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder4() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder5() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder6() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder7() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder8() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder9() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder10() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder11() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder12() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder13() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder14() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder15() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder16() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder17() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder18() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder19() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder20() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder21() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder22() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder23() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1, result);
		}
		
		@Test
		public void testCountArgumentPlaceholders_escapedPlaceholder24() {
				int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
				assertEquals(1