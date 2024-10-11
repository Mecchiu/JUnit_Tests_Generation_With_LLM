// MessageFormatter_4Test.java
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
class MessageFormatter_4Test {

		@Test
		public void testIdentityToString() {
				assertNull(MessageFormatter.identityToString(null));
				assertEquals("java.lang.String@" + Integer.toHexString(System.identityHashCode("")), MessageFormatter.identityToString(""));
				assertEquals("java.lang.String@" + Integer.toHexString(System.identityHashCode("test")), MessageFormatter.identityToString("test"));
				assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(Integer.valueOf(0))), MessageFormatter.identityToString(Integer.valueOf(0)));
				assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(Integer.valueOf(1))), MessageFormatter.identityToString(Integer.valueOf(1)));
				assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(Integer.valueOf(-1))), MessageFormatter.identityToString(Integer.valueOf(-1)));
				assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(Integer.valueOf(Integer.MAX_VALUE))), MessageFormatter.identityToString(Integer.valueOf(Integer.MAX_VALUE)));
				assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(Integer.valueOf(Integer.MIN_VALUE))), MessageFormatter.identityToString(Integer.valueOf(Integer.MIN_VALUE)));
				assertEquals("java.lang.Long@" + Integer.toHexString(System.identityHashCode(Long.valueOf(0))), MessageFormatter.identityToString(Long.valueOf(0)));
				assertEquals("java.lang.Long@" + Integer.toHexString(System.identityHashCode(Long.valueOf(1))), MessageFormatter.identityToString(Long.valueOf(1)));
				assertEquals("java.lang.Long@" + Integer.toHexString(System.identityHashCode(Long.valueOf(-1))), MessageFormatter.identityToString(Long.valueOf(-1)));
				assertEquals("java.lang.Long@" + Integer.toHexString(System.identityHashCode(Long.valueOf(Long.MAX_VALUE))), MessageFormatter.identityToString(Long.valueOf(Long.MAX_VALUE)));
				assertEquals("java.lang.Long@" + Integer.toHexString(System.identityHashCode(Long.valueOf(Long.MIN_VALUE))), MessageFormatter.identityToString(Long.valueOf(Long.MIN_VALUE)));
				assertEquals("java.lang.Boolean@" + Integer.toHexString(System.identityHashCode(Boolean.TRUE)), MessageFormatter.identityToString(Boolean.TRUE));
				assertEquals("java.lang.Boolean@" + Integer.toHexString(System.identityHashCode(Boolean.FALSE)), MessageFormatter.identityToString(Boolean.FALSE));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('a'))), MessageFormatter.identityToString(Character.valueOf('a')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\u0000'))), MessageFormatter.identityToString(Character.valueOf('\u0000')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\u0001'))), MessageFormatter.identityToString(Character.valueOf('\u0001')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\u007F'))), MessageFormatter.identityToString(Character.valueOf('\u007F')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\u0080'))), MessageFormatter.identityToString(Character.valueOf('\u0080')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\u00FF'))), MessageFormatter.identityToString(Character.valueOf('\u00FF')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\u0100'))), MessageFormatter.identityToString(Character.valueOf('\u0100')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\u07FF'))), MessageFormatter.identityToString(Character.valueOf('\u07FF')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\u0800'))), MessageFormatter.identityToString(Character.valueOf('\u0800')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\uFFFF'))), MessageFormatter.identityToString(Character.valueOf('\uFFFF')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\uD800'))), MessageFormatter.identityToString(Character.valueOf('\uD800')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\uDFFF'))), MessageFormatter.identityToString(Character.valueOf('\uDFFF')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\uE000'))), MessageFormatter.identityToString(Character.valueOf('\uE000')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\uFFFD'))), MessageFormatter.identityToString(Character.valueOf('\uFFFD')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\uFFFE'))), MessageFormatter.identityToString(Character.valueOf('\uFFFE')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\uFFFF'))), MessageFormatter.identityToString(Character.valueOf('\uFFFF')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\uD800'))), MessageFormatter.identityToString(Character.valueOf('\uD800')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\uDBFF'))), MessageFormatter.identityToString(Character.valueOf('\uDBFF')));
				assertEquals("java.lang.Character@" + Integer.toHexString(System.identityHashCode(Character.valueOf('\u