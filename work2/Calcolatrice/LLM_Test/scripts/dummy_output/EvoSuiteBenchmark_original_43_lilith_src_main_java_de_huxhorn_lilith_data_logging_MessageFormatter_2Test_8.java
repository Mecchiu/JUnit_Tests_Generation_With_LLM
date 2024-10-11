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
* It contains one unit test case for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatter_2Test {
		private final long TEST_ID = 1;

		@javax.annotation.ParametersAreNonnullByDefault class C {
			@Nonnull
			String pattern;
			private final Date date;

			public C(final String pattern, @Nonnull Date date) {
				super();
				this.date = date;
				this.pattern = pattern;
			}

		}

		/**
		 * This unit test checks for a situation when the pattern is wrong. It tests an implementation of {@link MessageFormatter} which tries
		 * to use a regular expression pattern to extract pattern arguments correctly.
		 */
		@Test
		void testWrongPattern() throws Exception {
			//given a regular pattern for the pattern check
			SimpleDateFormat form = new SimpleDateFormat("dd.MM.yyyy HH.mm.ll");

			//when the user calls MessageFormatter.evaluateArguments({ messagePattern, arguments }) with a parameter error
			ArgumentResult result = MessageFormatter.evaluateArguments(null, null);
			assertNotNull(result);

			//then the pattern is not used correctly
			assertNotSame(new C("aaa", null), result.pattern);
			assertEquals(1, result.count);
		}

		/**
		 * This unit test checks for a situation when the first argument is a placeholder.  A placeholder is the argument value which is used in
		 * the message.
		 */
		@Test
		void testFirstArgIsPlaceholder() throws Exception {
			//given an empty argument array
			Collection<String> args = new HashSet<>(0);
			ArgumentResult result = MessageFormatter.evaluateArguments(null, args.toArray());
			assertSame(args, result.getArgumentsAsCollection());
			assertSame(null, result.getThrowable());
			assertSame(args, result.getCount());
		}

		/**
		 * This unit test checks for a situation where the first argument is invalid.  The invalid argument will be the placeholder for
		 * invalid arguments.
		 */
		@Test
		void testFirstArgIsInvalid() throws Exception {
			//given a "invalid argument number is 2" argument
			Collection<String> args = Arrays.asList("invalid argument number is", "2");
			ArgumentResult result = MessageFormatter.evaluateArguments(null, args.toArray());
			assertNotSame(args, result.getArgumentsAsCollection());

		}

		/**
		 * This unit test checks for a situation where the message contains placeholders.  The placeholders shall not be used yet.
		 */
		@Test
		void testNoPlaceholders() throws Exception {
			//given a "placeholder is used" argument
			Collection<String> args = Arrays.asList("{placeholder is used", "by default, a placeholder is never used");

			//when the user calls MessageFormatter.evaluateArguments({ messagePattern, args }) with a parameter error
			ArgumentResult result = MessageFormatter.evaluateArguments(null, args.toArray());
			assertNotNull(result);

			//then the placeholders are never used
			assertNull(result.getArgumentsAsCollection());
			assertSame(null, result.getThrowable());
			assertNull(result.getCount());

		}

		/**
		 * This unit test checks for a situation where the last argument is a placeholder.  A placeholder shall be used as argument.
		 */
		@Test
		void testLastArgIsPlaceholder() throws Exception {
			//given a "placeholder is never used" argument
			Collection<String> args = Arrays.asList("{placeholder is never used", "by default, a placeholder is never used");

			//when the user calls MessageFormatter.evaluateArguments({ messagePattern, args }) with a parameter error
			ArgumentResult result = MessageFormatter.evaluateArguments(null, args.toArray());
			assertNotNull(result);

			//then the placeholder is used
			assertSame(args, result.getArgumentsAsCollection());
			assertNotSame(null, result.getThrowable());
			assertNotSame(args, result.getCount());
		}

		/**
		 * This unit test checks for a situation where the optional Throwable is specified.  In this case, the optional Throwable is used
		 * as message pattern parameter.
		 */
		@Test
		void testOptionalThrowable() throws Exception {
			//given an optional error message
			Collection<String> args = Arrays.asList("error message", null);

			//when the user calls MessageFormatter.evaluateArguments({ messagePattern, args }) with a parameter error
			ArgumentResult result = MessageFormatter.evaluateArguments(null, args.toArray());
			assertNotNull(result);

			//then the optional throwable is used
			assertSame(args, result.getArgumentsAsCollection());
			assertNotNull(result.getThrowable());
			assertNotSame(args, result.getCount());
		}

		/**
		 * This unit test checks for a situation where a parameter does not contain a valid pattern.  When a parameter contains no
		 * placeholders it is used as message pattern parameter.
		 */
		@Test
		void testParamNotHasValidPattern() throws Exception {
			//given a parameter which does not contain a valid pattern
			Collection<String> args = Arrays.asList("{unknown pattern", null);

			//when the user calls MessageFormatter.evaluateArguments({ messagePattern, args }) with a parameter error
			ArgumentResult result = MessageFormatter.evaluateArguments(null, args.toArray());
			assertNotNull(result);

			//then the parameter is used as message pattern parameter
			assertSame(args, result.getArgumentsAsCollection());
			assertNotNull(result.getThrowable());
			assertNotSame(0, args.size());
		}
}