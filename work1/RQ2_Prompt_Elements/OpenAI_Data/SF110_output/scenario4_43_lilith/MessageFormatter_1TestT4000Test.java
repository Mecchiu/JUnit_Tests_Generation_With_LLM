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
		public void testCountArgumentPlaceholders_1() {
				String messagePattern = "";
				int expected = 0;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_2() {
				String messagePattern = "foo";
				int expected = 0;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_3() {
				String messagePattern = "foo {}";
				int expected = 1;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_4() {
				String messagePattern = "foo {0}";
				int expected = 1;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_5() {
				String messagePattern = "foo {1}";
				int expected = 1;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_6() {
				String messagePattern = "foo {1} {0}";
				int expected = 2;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_7() {
				String messagePattern = "foo {1} {0} {2}";
				int expected = 3;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_8() {
				String messagePattern = "foo {1} {0} {2} {3}";
				int expected = 4;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_9() {
				String messagePattern = "foo {1} {0} {2} {3} {4}";
				int expected = 5;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_10() {
				String messagePattern = "foo {1} {0} {2} {3} {4} {5}";
				int expected = 6;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
}

// MessageFormatter_2Test.java
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
* It contains ten unit test cases for the {@link MessageFormatter#format(String, String[])} method.
*/
class MessageFormatter_2Test {
		
		@Test
		public void testFormat_1() {
				String messagePattern = "";
				String[] arguments = new String[] {};
				String expected = "";
				String actual = MessageFormatter.format(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testFormat_2() {
				String messagePattern = "foo";
				String[] arguments = new String[] {};
				String expected = "foo";
				String actual = MessageFormatter.format(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testFormat_3() {
				String messagePattern = "foo {}";
				String[] arguments = new String[] {"bar"};
				String expected = "foo bar";
				String actual = MessageFormatter.format(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testFormat_4() {
				String messagePattern = "foo {0}";
				String[] arguments = new String[] {"bar"};
				String expected = "foo bar";
				String actual = MessageFormatter.format(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testFormat_5() {
				String messagePattern = "foo {1}";
				String[] arguments = new String[] {"bar"};
				String expected = "foo {1}";
				String actual = MessageFormatter.format(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testFormat_6() {
				String messagePattern = "foo {1} {0}";
				String[] arguments = new String[] {"bar", "baz"};
				String expected = "foo baz bar";
				String actual = MessageFormatter.format(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testFormat_7() {
				String messagePattern = "foo {1} {0} {2}";
				String[] arguments = new String[] {"bar", "baz", "boo"};
				String expected = "foo baz bar boo";
				String actual = MessageFormatter.format(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testFormat_8() {
				String messagePattern = "foo {1} {0} {2} {3}";
				String[] arguments = new String[] {"bar", "baz", "boo", "bam"};
				String expected = "foo baz bar boo bam";
				String actual = MessageFormatter.format(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testFormat_9() {
				String messagePattern = "foo {1} {0} {2} {3} {4}";
				String[] arguments = new String[] {"bar", "baz", "boo", "bam", "bud"};
				String expected = "foo baz bar boo bam bud";
				String actual = MessageFormatter.format(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testFormat_10() {
				String messagePattern = "foo {1} {0} {2} {3} {4} {5}";
				String[] arguments = new String[] {"bar", "baz", "boo", "bam", "bud", "bae"};
				String expected = "foo baz bar boo bam bud bae";
				String actual = MessageFormatter.format(messagePattern, arguments);
				assertEquals(expected, actual);
		}
}

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
* It contains ten unit test cases for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatter_3Test {
		
		@Test
		public void testEvaluateArguments_1() {
				String messagePattern = "";
				Object[] arguments = new Object[] {};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_2() {
				String messagePattern = "foo";
				Object[] arguments = new Object[] {};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_3() {
				String messagePattern = "foo {}";
				Object[] arguments = new Object[] {"bar"};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {"bar"}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_4() {
				String messagePattern = "foo {0}";
				Object[] arguments = new Object[] {"bar"};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {"bar"}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_5() {
				String messagePattern = "foo {1}";
				Object[] arguments = new Object[] {"bar"};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_6() {
				String messagePattern = "foo {1} {0}";
				Object[] arguments = new Object[] {"bar", "baz"};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {"baz", "bar"}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_7() {
				String messagePattern = "foo {1} {0} {2}";
				Object[] arguments = new Object[] {"bar", "baz", "boo"};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {"baz", "bar", "boo"}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_8() {
				String messagePattern = "foo {1} {0} {2} {3}";
				Object[] arguments = new Object[] {"bar", "baz", "boo", "bam"};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {"baz", "bar", "boo", "bam"}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_9() {
				String messagePattern = "foo {1} {0} {2} {3} {4}";
				Object[] arguments = new Object[] {"bar", "baz", "boo", "bam", "bud"};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {"baz", "bar", "boo", "bam", "bud"}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_10() {
				String messagePattern = "foo {1} {0} {2} {3} {4} {5}";
				Object[] arguments = new Object[] {"bar", "baz", "boo", "bam", "bud", "bae"};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {"baz", "bar", "boo", "bam", "bud", "bae"}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
}

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
* It contains ten unit test cases for the {@link MessageFormatter#deepToString(Object)} method.
*/
class MessageFormatter_4Test {
		
		@Test
		public void testDeepToString_1() {
				Object o = null;
				String expected = "null";
		