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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatterTest {

	@Test
	void identityToString_null() {
		assertNull(MessageFormatter.identityToString(null));
	}
	
	@Test
	void identityToString_string() {
		assertEquals("java.lang.String@" + Integer.toHexString(System.identityHashCode("")), MessageFormatter.identityToString(""));
	}
	
	@Test
	void identityToString_integer() {
		assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(0)), MessageFormatter.identityToString(0));
	}
	
	@Test
	void identityToString_long() {
		assertEquals("java.lang.Long@" + Integer.toHexString(System.identityHashCode(0L)), MessageFormatter.identityToString(0L));
	}
	
	@Test
	void identityToString_double() {
		assertEquals("java.lang.Double@" + Integer.toHexString(System.identityHashCode(0.0)), MessageFormatter.identityToString(0.0));
	}
	
	@Test
	void identityToString_float() {
		assertEquals("java.lang.Float@" + Integer.toHexString(System.identityHashCode(0.0f)), MessageFormatter.identityToString(0.0f));
	}
	
	@Test
	void identityToString_boolean() {
		assertEquals("java.lang.Boolean@" + Integer.toHexString(System.identityHashCode(false)), MessageFormatter.identityToString(false));
	}
	
	@Test
	void identityToString_char() {
		assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode('\0')), MessageFormatter.identityToString('\0'));
	}
	
	@Test
	void identityToString_byte() {
		assertEquals("java.lang.Byte@" + Integer.toHexString(System.identityHashCode((byte) 0)), MessageFormatter.identityToString((byte) 0));
	}
	
	@Test
	void identityToString_short() {
		assertEquals("java.lang.Short@" + Integer.toHexString(System.identityHashCode((short) 0)), MessageFormatter.identityToString((short) 0));
	}
	
	@Test
	void identityToString_object() {
		assertEquals("de.huxhorn.lilith.data.logging.MessageFormatterTest@" + Integer.toHexString(System.identityHashCode(this)), MessageFormatter.identityToString(this));
	}
}

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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatterTest {
		
	@Test
	void identityToString_null() {
		assertNull(MessageFormatter.identityToString(null));
	}
	
	@Test
	void identityToString_string() {
		assertEquals("java.lang.String@" + Integer.toHexString(System.identityHashCode("")), MessageFormatter.identityToString(""));
	}
	
	@Test
	void identityToString_integer() {
		assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(0)), MessageFormatter.identityToString(0));
	}
	
	@Test
	void identityToString_long() {
		assertEquals("java.lang.Long@" + Integer.toHexString(System.identityHashCode(0L)), MessageFormatter.identityToString(0L));
	}
	
	@Test
	void identityToString_double() {
		assertEquals("java.lang.Double@" + Integer.toHexString(System.identityHashCode(0.0)), MessageFormatter.identityToString(0.0));
	}
	
	@Test
	void identityToString_float() {
		assertEquals("java.lang.Float@" + Integer.toHexString(System.identityHashCode(0.0f)), MessageFormatter.identityToString(0.0f));
	}
	
	@Test
	void identityToString_boolean() {
		assertEquals("java.lang.Boolean@" + Integer.toHexString(System.identityHashCode(false)), MessageFormatter.identityToString(false));
	}
	
	@Test
	void identityToString_char() {
		assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode('\0')), MessageFormatter.identityToString('\0'));
	}
	
	@Test
	void identityToString_byte() {
		assertEquals("java.lang.Byte@" + Integer.toHexString(System.identityHashCode((byte) 0)), MessageFormatter.identityToString((byte) 0));
	}
	
	@Test
	void identityToString_short() {
		assertEquals("java.lang.Short@" + Integer.toHexString(System.identityHashCode((short) 0)), MessageFormatter.identityToString((short) 0));
	}
	
	@Test
	void identityToString_object() {
		assertEquals("de.huxhorn.lilith.data.logging.MessageFormatterTest@" + Integer.toHexString(System.identityHashCode(this)), MessageFormatter.identityToString(this));
	}
}

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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatterTest {
		
	@Test
	void identityToString_null() {
		assertNull(MessageFormatter.identityToString(null));
	}
	
	@Test
	void identityToString_string() {
		assertEquals("java.lang.String@" + Integer.toHexString(System.identityHashCode("")), MessageFormatter.identityToString(""));
	}
	
	@Test
	void identityToString_integer() {
		assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(0)), MessageFormatter.identityToString(0));
	}
	
	@Test
	void identityToString_long() {
		assertEquals("java.lang.Long@" + Integer.toHexString(System.identityHashCode(0L)), MessageFormatter.identityToString(0L));
	}
	
	@Test
	void identityToString_double() {
		assertEquals("java.lang.Double@" + Integer.toHexString(System.identityHashCode(0.0)), MessageFormatter.identityToString(0.0));
	}
	
	@Test
	void identityToString_float() {
		assertEquals("java.lang.Float@" + Integer.toHexString(System.identityHashCode(0.0f)), MessageFormatter.identityToString(0.0f));
	}
	
	@Test
	void identityToString_boolean() {
		assertEquals("java.lang.Boolean@" + Integer.toHexString(System.identityHashCode(false)), MessageFormatter.identityToString(false));
	}
	
	@Test
	void identityToString_char() {
		assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode('\0')), MessageFormatter.identityToString('\0'));
	}
	
	@Test
	void identityToString_byte() {
		assertEquals("java.lang.Byte@" + Integer.toHexString(System.identityHashCode((byte) 0)), MessageFormatter.identityToString((byte) 0));
	}
	
	@Test
	void identityToString_short() {
		assertEquals("java.lang.Short@" + Integer.toHexString(System.identityHashCode((short) 0)), MessageFormatter.identityToString((short) 0));
	}
	
	@Test
	void identityToString_object() {
		assertEquals("de.huxhorn.lilith.data.logging.MessageFormatterTest@" + Integer.toHexString(System.identityHashCode(this)), MessageFormatter.identityToString(this));
	}
}

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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatterTest {
		
	@Test
	void identityToString_null() {
		assertNull(MessageFormatter.identityToString(null));
	}
	
	@Test
	void identityToString_string() {
		assertEquals("java.lang.String@" + Integer.toHexString(System.identityHashCode("")), MessageFormatter.identityToString(""));
	}
	
	@Test
	void identityToString_integer() {
		assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(0)), MessageFormatter.identityToString(0));
	}
	
	@Test
	void identityToString_long() {
		assertEquals("java.lang.Long@" + Integer.toHexString(System.identityHashCode(0L)), MessageFormatter.identityToString(0L));
	}
	
	@Test
	void identityToString_double() {
		assertEquals("java.lang.Double@" + Integer.toHexString(System.identityHashCode(0.0)), MessageFormatter.identityToString(0.0));
	}
	
	@Test
	void identityToString_float() {
		assertEquals("java.lang.Float@" + Integer.toHexString(System.identityHashCode(0.0f)), MessageFormatter.identityToString(0.0f));
	}
	
	@Test
	void identityToString_boolean() {
		assertEquals("java.lang.Boolean@" + Integer.toHexString(System.identityHashCode(false)), MessageFormatter.identityToString(false));
	}
	
	@Test
	void identityToString_char() {
		assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode('\0')), MessageFormatter.identityToString('\0'));
	}
	
	@Test
	void identityToString_byte() {
		assertEquals("java.lang.Byte@" + Integer.toHexString(System.identityHashCode((byte) 0)), MessageFormatter.identityToString((byte) 0));
	}
	
	@Test
	void identityToString_short() {
		assertEquals("java.lang.Short@" + Integer.toHexString(System.identityHashCode((short) 0)), MessageFormatter.identityToString((short) 0));
	}
	
	@Test
	void identityToString_object() {
		assertEquals("de.huxhorn.lilith.data.logging.MessageFormatterTest@" + Integer.toHexString(System.identityHashCode(this)), MessageFormatter.identityToString(this));
	}
}

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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatterTest {
		
	@Test
	void identityToString_null() {
		assertNull(MessageFormatter.identityToString(null));
	}
	
	@Test
	void identityToString_string() {
		assertEquals("java.lang.String@" + Integer.toHexString(System.identityHashCode("")), MessageFormatter.identityToString(""));
	}
	
	@Test
	void identityToString_integer() {
		assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(0)), MessageFormatter.identityToString(0));
	}
	
	@Test
	void identityToString_long() {
		assertEquals("java.lang.Long@" + Integer.toHexString(System.identityHashCode(0L)), MessageFormatter.identityToString(0L));
	}
	
	@Test
	void identityToString_double() {
		assertEquals("java.lang.Double@" + Integer.toHexString(System.identityHashCode(0.0)), MessageFormatter.identityToString(0.0));
	}
	
	@Test
	void identityToString_float() {
		assertEquals("java.lang.Float@" + Integer.toHexString(System.identityHashCode(0.0f)), MessageFormatter.identityToString(0.0f));
	}
	
	@Test
	void identityToString_boolean() {
		assertEquals("java.lang.Boolean@" + Integer.toHexString(System.identityHashCode(false)), MessageFormatter.identityToString(false));
	}
	
	@Test
	void identityToString_char() {
		assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode('\0')), MessageFormatter.identityToString('\0'));
	}
	
	@Test
	void identityToString_byte() {
		assertEquals("java.lang.Byte@" + Integer.toHexString(System.identityHashCode((byte) 0)), MessageFormatter.identityToString((byte) 0));
	}
	
	@Test
	void identityToString_short() {
		assertEquals("java