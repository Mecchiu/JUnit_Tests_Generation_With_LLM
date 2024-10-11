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
		int result = MessageFormatter.countArgumentPlaceholders(null);
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_empty() {
		int result = MessageFormatter.countArgumentPlaceholders("");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_noPlaceholders() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello World!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_onePlaceholder() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello {}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_twoPlaceholders() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello {}! {}");
		assertEquals(2, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedPlaceholder() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape2() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape3() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape4() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape5() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape6() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape7() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape8() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape9() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape10() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape11() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape12() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape13() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape14() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape15() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape16() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape17() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape18() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape19() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape20() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape21() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape22() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape23() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape24() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape25() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape26() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape27() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape28() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape29() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape30() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape31() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape32() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape33() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape34() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape35() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape36() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape37() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape38() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape39() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape40() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape41() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape42() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape43() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape44() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape45() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape46() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape47() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape48() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape49() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape50() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape51() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape52() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape53() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape54() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape55() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape56() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(0, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape57() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
		assertEquals(1, result);
	}
	
	@Test
	void countArgumentPlaceholders_escapedEscape58() {
		int result = MessageFormatter.countArgumentPlaceholders("Hello \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\{}!");
