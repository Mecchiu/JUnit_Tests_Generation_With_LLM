// MessageFormatter_0Test.java
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
* It contains one unit test case for the {@link MessageFormatter#format(String, String[])} method.
*/
class MessageFormatter_0Test {
		
	final static String messagePattern = (
		"<%%>" +
		 "  <%%>Message created by <%%> " +
		 "{(date)" +
		 " {@link java.net.Date} " +
		 " {(time)" +
		 " " +
 		 "(formatted message from now)");

//		"   <%%>Message created by <%%>" +
//		 " {(date)" +
//		 " " +
//		 "<%%>{@link String}";

	/**
	 * Empty message pattern. It contains one place holder on which only the actual formatting
	 * of the message is performed.
	 */
	final static String EMPTY_MESSAGE_PATTERN = "";

	final static String MESSAGE_PATTERN = "Message";

	/**
	 * Initializing the message.
	 */
	@SuppressWarnings("unchecked")
	final static Map<String, String> CONTENT_FIELD_SUBSTITUTIONS = Arrays.asList("date", "time");

	final static Map<String, String> CONTENT_FIELD_SUBSTITUTIONS_2_0 = Arrays.stream(CONTENT_FIELD_SUBSTITUTIONS)
		.filter(x -> x.indexOf("date") == x.lastIndexOf("date"))
		.filter(x -> x.lastIndexOf("time") > x.indexOf("time"))
		.collect(Collectors.toMap(Function::convert, Function.identity()));

	final static String[][][] CONTENT_FIELD_NAMES_IN_VALID_PATTERN = {
		{"", "/date = ${date}"       , "/time = ${time}"     },
		{"", CONTENT_FIELD_SUBSTITUTIONS, CONTENT_FIELD_SUBSTITUTIONS },
		{"", CONTENT_FIELD_SUBSTITUTIONS_2_0, CONTENT_FIELD_SUBSTITUTIONS_2_0 }
	};

	@Test
	void canConstructOneOfMatchingConstructorsWithValidPattern() {
		final MessageFormatter mfa = new MessageFormatter();
		assertNotNull(mfa.format(messagePattern, EMPTY_MESSAGE_PATTERN));
	}

//	/**
//	 * Create a collection of messages consisting of two empty messages.
//	 * Each message in this collection has only the date and time specified so far.
//	 * A message with date= ${date} and time ${time} will be created at  ${time} (plus now)
//	 */
//	private Collection<String[]> emptyAndOneMessageConstructed() {
//		final Collection<String[]> emptyMessageConstructeds = new HashSet<>();
//		emptyMessageConstructeds.add(new String[] {"", null, null});
//		return emptyMessageConstructeds;
//	}
//	/**
//	 * Format a single message according to the pattern that was used in the constructor.
//	 * The pattern is a pattern with place holders replaced by message substitutions (i.e. {@link MessagePattern#substituteFor(String, String, Object)}).
//	 *
//	 * @param contentFieldSubstitutions the values of the pattern to be used for substitution
//	 * @return the formatted message.
//	 */
//	private String formatOneMessage(final Map<String, String> contentFieldSubstitutions) {
//		final DefaultMutableDateTimeFormatter dateTimeFormatter =
//			DefaultMutableDateTimeFormatter.ofPattern(messagePattern, contentFieldSubstitutions);
//		return String.format(messagePattern,
//				DateUtils.convertDateToString(new Date(), dateTimeFormatter),
//				DateUtils.formatTime(new Date(), dateTimeFormatter));
//	}
//
//	/**
//	 * Create a collection of messages consisting of one empty message and one message with all substitutions given by contentFieldSubstitutions.
//	 *
//	 * <p>This method can't be used directly.
//	 * Use {@link #formatOneMessage(Map)} instead.
//	 * </p>
//	 *
//	 * @param contentFieldSubstitutions the values of the pattern where substitutions for the content field will be used (i.e. {@link MessagePattern#substituteFor(String, String)})
//	 * @return the formatted message.
//	 */
//	private String[] oneAndOneAndOnlyOneMessageConstructed(final Map<String, String> contentFieldSubstitutions) {
//		final DefaultMutableDateTimeFormatter dateTimeFormatter =
//			DefaultMutableDateTimeFormatter.ofPattern(messagePattern, contentFieldSubstitutions);
//		return new String [] {
//			String.format("{(date) = %s, (%time) = %s}",
//				DateUtils.convertDateToString(new Date(), dateTimeFormatter),
//				DateUtils.formatTime(new Date(), dateTimeFormatter),
//				DateUtils.convertDateToString(new Date(), dateTimeFormatter))
//		};
//	}

//	/**
//	 * Format a single message according to the given pattern.
//	 *
//	 * <p>The pattern is a pattern with place holders replaced by message substitutions (i.e. {@link MessagePattern#substituteFor(String, String, Object)}.
//	 * </p>
//	 *
//	 * @param contentFieldSubstitutions the values of the pattern to be used for substitution
//	 * @return the formatted message.
//	 */
//	private String formatOneMessage(final Map<String, String> contentFieldSubstitutions) {
//
//		final DefaultMutableDateTimeFormatter dateTimeFormatter =
//			DefaultMutableDateTimeFormatter.ofPattern(messagePattern, contentFieldSubstitutions);
//		return String.format(messagePattern,
//				DateUtils.convertDateToString(new Date(), dateTimeFormatter),
//				DateUtils.formatTime(new Date(), dateTimeFormatter));
//	}

//	@Test
//	void canFormatMessageWithSubstitutions() {
//		final MessageFormatter mfa = new MessageFormatter();
//
}