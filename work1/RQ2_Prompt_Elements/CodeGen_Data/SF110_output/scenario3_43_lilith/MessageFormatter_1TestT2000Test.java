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
* It contains one unit test case for the {@link MessageFormatter#countArgumentPlaceholders(String)} method.
*/
class MessageFormatter_1Test {

		@Test
		public void countArgumentPlaceholders_should_return_value_equal_to_size_of_the_first2_placeholders_given_argsAndarguments() {
			Set<String> messagePattern = new HashSet<String>();
			messagePattern.add("message1");
			messagePattern.add("message2");
			ArrayFormatter ama = new ArrayFormatter(messagePattern);
			Set<String> result = ama.countArgumentPlaceholders("message1=message");
			assertEquals(2, result.size());
			assertTrue(result.contains("message1=message"));
			assertTrue(result.contains("message2=message"));
		}
		@Test(expected=IllegalStateException.class)
		public void countArgumentPlaceholders_should_throw_IllegalStateException_if_arguments_are_null() {
			Set<String> messagePattern = new HashSet<String>();
			messagePattern.add("message1");
			messagePattern.add(null);
			ArrayFormatter ama = new ArrayFormatter(messagePattern);
			ama.countArgumentPlaceholders(null);
		}
		
		
		@Test()
		public void countArgumentPlaceholders_should_be_immutable_and_unmodifiable() {
			Set<String> messagePattern = new HashSet<String>();
			Set<String> replacementSet = new HashSet<String>();
			messagePattern.add("message1");
			messagePattern.add("message2");
			replacementSet.add("message3");
			replacementSet.add("message4");
			ArrayFormatter ama = new ArrayFormatter(messagePattern);
			assertSame(messagePattern, ama.getMessagePattern());
			assertSame(messagePattern, ama.getMessagePattern());
			assertTrue(messagePattern.isEmpty());
			assertNotNull(replacementSet);
			assertTrue(replacementSet.isEmpty());
		}
		
		/**
		 * A simple StringFormatter test which is not directly involved with MessageFormatter but it is used to test
		 * the replacement process of the message which is applied when the messagePattern has been modified.
		 */
		private static final String[] testMsgData = {
				"[message] = message",
				"[message] = message",
				"[message] = message"
		};

		@Test
		public void replacePlaceholders_should_replace_all_placeholders() throws Exception {
			Set<String> messagePattern = new HashSet<String>();
			for (int i = 0; i < testMsgData.length; i++) {
				messagePattern.add(testMsgData[i]);
			}
			
			setDate(new SimpleDateFormat("[yy_MM_dd_HH:mm:ss:SSS]"));
			String result = new ArrayFormatter().replacePlaceholders("message=hello");
			assertEquals("hello", result);
			result = new ArrayFormatter().replacePlaceholders("message=\"world, and is it\"");
			assertEquals("world, and is it", result);
			result = new ArrayFormatter().replacePlaceholders("message\\=world");
			assertEquals("world", result);
			result = new ArrayFormatter().replacePlaceholders("message={world}");
			assertEquals("world", result);
			// test for array replacement of multiple spaces as long as nothing is split between the placeholders
			result = new ArrayFormatter().replacePlaceholders("message={world}");
			assertEquals("world", result);

		}
		private static void setDate(SimpleDateFormat sdf) {
			sdf.setTimeZone(null);
			Date date = new Date();
			Calendar calendar = Calendar.getInstance(new SimpleDateFormat("yyyy-M-dd hh:mm:ss,SS").getTimeZone());
			calendar.setTime(date);
			int day = calendar.get(Calendar.DAY_OF_YEAR);
			String strDay = String.valueOf(day);
			sdf.setDate(day + 1);
			String month = String.valueOf(day);
			setDate(sdf, month, day + 1);
		}
		private static void setDate(SimpleDateFormat sdf, String month, int day) {
			sdf.setTimeZone(null);
			Calendar calendar = Calendar.getInstance(new SimpleDateFormat("yyyy-M-dd hh:mm:ss,SS").getTimeZone());
			calendar.set(Calendar.DAY_OF_YEAR, day);
			sdf.setDate(calendar.get(Calendar.DAY_OF_YEAR));
			String strMonth = String.valueOf(calendar.get(Calendar.MONTH));
			setString(sdf, month, strMonth);
		}
		private static void setString(Style style, String msg, String replacementText) {
			style.setText(msg);
			style.insertText(msg);
			style.replaceText(msg, replacementText);
		}
		public static Iterable<String> toMsg(String s) {
			return new Iterable<String>() {
				public Iterator<String> iterator(){ return Arrays.asList(s.split(" ")).iterator(); }
			};
		}
		
}
