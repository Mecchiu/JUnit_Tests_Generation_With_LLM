// MessageFormatterTest.java
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
class MessageFormatterTest {

	@Test
	void countArgumentPlaceholders_null() {
		assertEquals(0, MessageFormatter.countArgumentPlaceholders(null));
	}
	
	@Test
	void countArgumentPlaceholders_empty() {
		assertEquals(0, MessageFormatter.countArgumentPlaceholders(""));
	}
	
	@Test
	void countArgumentPlaceholders_noPlaceholders() {
		assertEquals(0, MessageFormatter.countArgumentPlaceholders("Hello World!"));
	}
	
	@Test
	void countArgumentPlaceholders_onePlaceholder() {
		assertEquals(1, MessageFormatter.countArgumentPlaceholders("Hello {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_twoPlaceholders() {
		assertEquals(2, MessageFormatter.countArgumentPlaceholders("Hello {}! {}"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder() {
		assertEquals(0, MessageFormatter.countArgumentPlaceholders("Hello \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder2() {
		assertEquals(1, MessageFormatter.countArgumentPlaceholders("Hello \\{} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder3() {
		assertEquals(1, MessageFormatter.countArgumentPlaceholders("Hello {} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder4() {
		assertEquals(2, MessageFormatter.countArgumentPlaceholders("Hello \\{} {} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder5() {
		assertEquals(2, MessageFormatter.countArgumentPlaceholders("Hello {} \\{} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder6() {
		assertEquals(2, MessageFormatter.countArgumentPlaceholders("Hello {} {} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder7() {
		assertEquals(3, MessageFormatter.countArgumentPlaceholders("Hello {} \\{} {} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder8() {
		assertEquals(3, MessageFormatter.countArgumentPlaceholders("Hello \\{} {} \\{} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder9() {
		assertEquals(3, MessageFormatter.countArgumentPlaceholders("Hello \\{} \\{} {} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder10() {
		assertEquals(3, MessageFormatter.countArgumentPlaceholders("Hello {} \\{} \\{} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder11() {
		assertEquals(3, MessageFormatter.countArgumentPlaceholders("Hello {} {} \\{} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder12() {
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("Hello {} \\{} \\{} {} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder13() {
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("Hello \\{} {} \\{} \\{} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder14() {
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("Hello \\{} \\{} {} \\{} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder15() {
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("Hello {} \\{} \\{} \\{} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder16() {
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("Hello {} \\{} {} \\{} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder17() {
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("Hello {} {} \\{} \\{} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder18() {
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("Hello {} {} \\{} {} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder19() {
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("Hello {} {} {} \\{} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder20() {
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("Hello {} {} {} \\{} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder21() {
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("Hello {} {} {} {} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder22() {
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("Hello {} \\{} \\{} \\{} {} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder23() {
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("Hello \\{} {} \\{} \\{} \\{} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder24() {
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("Hello \\{} \\{} {} \\{} \\{} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder25() {
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("Hello {} \\{} \\{} \\{} \\{} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder26() {
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("Hello {} \\{} {} \\{} \\{} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder27() {
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("Hello {} {} \\{} \\{} \\{} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder28() {
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("Hello {} {} \\{} \\{} {} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder29() {
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("Hello {} {} \\{} {} \\{} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder30() {
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("Hello {} {} {} \\{} \\{} \\{}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder31() {
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("Hello {} {} {} \\{} \\{} {}!"));
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder32() {