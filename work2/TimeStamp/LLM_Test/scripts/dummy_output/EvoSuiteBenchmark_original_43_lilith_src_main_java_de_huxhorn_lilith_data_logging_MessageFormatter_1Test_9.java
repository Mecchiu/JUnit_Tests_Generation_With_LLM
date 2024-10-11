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
		private static void countArgumentPlaceholders(String messagePattern) {
				int placeholderPos =  messagePattern.indexOf("?");
				if (placeholderPos == -1) {
						placeholderPos = messagePattern.length();
				}
				int argumentArrayLength = placeholderPos - messagePattern.indexOf("?") + 1;
				int expectedArgumentCount = countArguments(
				        messagePattern.substring(0,placeholderPos), Arrays.asList(argumentsFor(messagePattern, null))) ;
				if (expectedArgumentCount!= messagePattern.length()) {
						throw new IllegalArgumentException("Count value is out of range (expected: " + expectedArgumentCount + ", actual: " + messagePattern.length() +")  for pattern ["+messagePattern+"]");
				}
		}
		
		private static int countArguments(String messagePattern, Set<String> arguments) {
				int count = 0;
				String messageArguments = messagePattern;
				while (messageArguments.indexOf('?')!= -1) {
						if (arguments == null) return count;
						
						String argument = arguments.iterator().next();
						messageArguments = messageArguments.replace("?", argument + "?");
						count += 1;
				}
				return count;
		}
	
		private static Collection<String> argumentsFor(String messagePattern, String optionalCauseMessage) {
				return parseMessage(messagePattern, optionalCauseMessage);
		}
		
//		private static Collection<String> parseMessage(String messagePattern, String optionalCauseMessage) {
//						String[] argumentArray = Arrays.asList(messagePattern.split(":")) ;
//						String[] argumentArray2 = Arrays.asList(messagePattern.split(":")) ;
//						LinkedList<String> argumentsFor = new LinkedList<String>() ;
//						if (argumentArray.length < 1) {
//								throw new IllegalArgumentException("Cannot parse argument pattern for message [" + messagePattern + "] because some arguments are missing (empty list)");
//						}
//						for (int i = 0; i < argumentArray.length; ++i) {
//								if (argumentArray[i].equals(argumentArray2[i])) {
//										continue ;
//								}
//								if (argumentArray[i].startsWith("?")) {
//										continue ;
//								}
//								argumentsFor.add(argumentArray[i].replaceFirst(argumentArray2[i], "?")) ;
//						}
//						return argumentsFor ;
//		}

//		private static final String[] argumentsFor(String messagePattern, String optionalCauseMessage, String... arguments) {
//						String[] argumentArray = Arrays.asList(messagePattern.split(":")) ;
//						String[] argumentArray2 = Arrays.asList(messagePattern.split(":")) ;
//						LinkedList<String> argumentsFor = new LinkedList<String>() ;
//						if (argumentArray.length == 1) {
//						if (argumentArray[0].equals(arguments[0])) {
//								continue ;
//						}
//						}
//						for (int i = 0; i < argumentArray.length; ++i) {
//								if (argumentArray[i].startsWith("?")) {
//										continue ;
//								}
//								if (argumentArray[i].startsWith("?")) {
//										continue ;
//								}
//								argumentsFor.add(arguments[i]) ;
//						}
//						return argumentsFor.toArray(new String[0]);
//		}
	@Test
	public void test() {
}
}