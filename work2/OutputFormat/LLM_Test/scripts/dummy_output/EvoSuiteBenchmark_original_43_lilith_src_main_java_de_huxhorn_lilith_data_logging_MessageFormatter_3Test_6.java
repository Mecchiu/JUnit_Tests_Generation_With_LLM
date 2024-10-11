// MessageFormatter_3Test.java
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
* It contains one unit test case for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_3Test {
		
	@Test
	void identityToString() {
		String s = MessageFormatter.identityToString(1);
		assertSame("'1' should be the identity string", "1", s);
		
		s 		= MessageFormatter.identityToString("x");
		assertSame("'" + MessageFormatter.IDENTITY + "' should be the identity string", "x", s);
	}
	
	@Test
	void argumentStrings() {
		assertEquals("'1' should be the empty string", "1", MessageFormatter.argument(1));
		assertEquals("'2' should be the empty string", "2", MessageFormatter.argument(2));
		assertEquals("'3' should be the string '3'", "3", MessageFormatter.argument(3));
		assertEquals("'4' should be the string '4'", MessageFormatter.IDENTITY,MessageFormatter.argument(4));
		assertEquals("'5' should be the empty string", "5", MessageFormatter.argument(5));
		assertEquals("'6' should be the empty string", "6", MessageFormatter.argument(6));
		assertEquals("'7' should be the empty string", "7", MessageFormatter.argument(7));
		assertEquals("'8' should be the empty string", "8", MessageFormatter.argument(8));
		assertEquals("'9' should be the empty string", "9", MessageFormatter.argument(9));
	}
}