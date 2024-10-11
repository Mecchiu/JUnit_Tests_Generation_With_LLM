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
* It contains ten unit test cases for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatterTest {

		@Test
		public void testEvaluateArguments_null() {
				ArgumentResult result = MessageFormatter.evaluateArguments(null, null);
				assertNull(result);
		}
		
		@Test
		public void testEvaluateArguments_empty() {
				ArgumentResult result = MessageFormatter.evaluateArguments("", null);
				assertNull(result);
		}
		
		@Test
		public void testEvaluateArguments_noPlaceholders() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello World!", null);
				assertNull(result);
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World" });
				assertNotNull(result);
				assertEquals(1, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!" });
				assertNotNull(result);
				assertEquals(1, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable() });
				assertNotNull(result);
				assertEquals(1, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertNotNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {}", new Object[] { "World", "!", new Throwable() });
				assertNotNull(result);
				assertEquals(2, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {}", new Object[] { "World", "!", new Throwable(), "!" });
				assertNotNull(result);
				assertEquals(2, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable() });
				assertNotNull(result);
				assertEquals(2, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertNotNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable() });
				assertNotNull(result);
				assertEquals(3, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!" });
				assertNotNull(result);
				assertEquals(3, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable() });
				assertNotNull(result);
				assertEquals(3, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertNotNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable() });
				assertNotNull(result);
				assertEquals(4, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertEquals("!", result.getArguments()[3]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!" });
				assertNotNull(result);
				assertEquals(4, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertEquals("!", result.getArguments()[3]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable() });
				assertNotNull(result);
				assertEquals(4, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertEquals("!", result.getArguments()[3]);
				assertNotNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {} {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable() });
				assertNotNull(result);
				assertEquals(5, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertEquals("!", result.getArguments()[3]);
				assertEquals("!", result.getArguments()[4]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {} {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!" });
				assertNotNull(result);
				assertEquals(5, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertEquals("!", result.getArguments()[3]);
				assertEquals("!", result.getArguments()[4]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {} {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable() });
				assertNotNull(result);
				assertEquals(5, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertEquals("!", result.getArguments()[3]);
				assertEquals("!", result.getArguments()[4]);
				assertNotNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {} {} {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable() });
				assertNotNull(result);
				assertEquals(6, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertEquals("!", result.getArguments()[3]);
				assertEquals("!", result.getArguments()[4]);
				assertEquals("!", result.getArguments()[5]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {} {} {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!" });
				assertNotNull(result);
				assertEquals(6, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertEquals("!", result.getArguments()[3]);
				assertEquals("!", result.getArguments()[4]);
				assertEquals("!", result.getArguments()[5]);
				assertNull(result.getThrowable());
		}
		
		@Test
		public void testEvaluateArguments_onePlaceholder_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable_used_tooMany_throwable() {
				ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}! {} {} {} {} {}", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable() });
				assertNotNull(result);
				assertEquals(6, result.getArguments().length);
				assertEquals("World", result.getArguments()[0]);
				assertEquals("!", result.getArguments()[1]);
				assertEquals("!", result.getArguments()[2]);
				assertEquals("!", result.getArguments()[3]);
				assertEquals("!", result.getArguments()[4]);
				assertEquals("!", result.get