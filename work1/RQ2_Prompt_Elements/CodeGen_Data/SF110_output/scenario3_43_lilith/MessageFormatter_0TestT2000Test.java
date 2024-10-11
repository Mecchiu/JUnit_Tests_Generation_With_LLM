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

	/**
	 * Format a message pattern with arguments to an array of String.
	 * The first part holds the placeholder to be used. That's the one with this argument.
	 * This step may be expensive, because the converted argument list may contain more arguments than
	 * they should be given to the message pattern.
	 * 
	 * @param messagePattern the message pattern with arguments to form the pattern to be converted.
	 * @param arguments the the arguments to be be used to convert the pattern.
	 * @return the formatted message.
	 * @see MessageFormatter#format(String, String[])
	 */
	public static String format(String messagePattern, String[] arguments) {
	
		assert messagePattern!= null && arguments!= null;
		
		StringBuilder stringBuilder = getMessageFormatter().format(messagePattern, arguments);
		if (stringBuilder == null) {
			throw new IllegalStateException("Result of {@link MessageFormatter#format(String,String[])} method is not initialized.");
		}
		return stringBuilder.toString();
	}

	private MessageFormatter getMessageFormatter() {
		return MessageFormatter.this;
	}
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		
	@Test
	public void test001() {
		
		Collection<String> aEmptyCollection = new HashSet<String>();
		
		assert false!= getMessageFormatter().format("", aEmptyCollection) || aEmptyCollection.size() == 0;
		
		Collection<String> aLongArray = Arrays.asList("hello", "goodbye");

		assert false!= getMessageFormatter().format("hi", aLongArray) || aLongArray.size() == 2;
		
		String[] aSimpleArray = new String[]{"ok", 
										  "hello", 
										  "this is a test"};
		
		String aSimpleString = "ok this is a test";
		
		assert Arrays.deepEquals(aSimpleArray, getMessageFormatter().format("hi", aSimpleArray)) || Arrays.deepEquals(aSimpleArray, getMessageFormatter().format("hello", aSimpleArray)) || 
			Arrays.deepEquals(aSimpleArray, getMessageFormatter().format("hello", aSimpleString.toCharArray()));
		
	}
	
	private static final <T> String composeText(String argument1, Parameter<T> parameter) {
	
		return parameter == null? argument1 : StringFormatter.compose("{0}", argument1, parameter);
	}
	
	private Collection<String> composeEmpty(String argument) {
	
		Set<String> answer = new HashSet<String>();
			
		answer.add(argument);
	
		return answer;
	}
		
	private Collection<String> composeCollection(String argument) {
	
		Set<String> answer = new HashSet<String>();
			
		answer.add(argument);
	
		return answer;
	}
	
	@Test 
	public void test002() {
	
		Collection<String> aEmptyCollection;
		Collection<String> aLongArray = new HashSet<String>();
		
		assert false!= getMessageFormatter().format("", aEmptyCollection) || aEmptyCollection.size() == 0;
		assert false!= getMessageFormatter().format("", aEmptyCollection);
		
		aEmptyCollection = Collections.emptyList();
		
		assert false!= getMessageFormatter().format("", aEmptyCollection) || aEmptyCollection.size() == 0;
		
		aLongArray = Arrays.asList("");
		
		assert false!= getMessageFormatter().format("", aLongArray) || aLongArray.size() == 1;
		
		aLongArray = Arrays.asList("");
		
		assert false!= getMessageFormatter().format("", aLongArray) || aLongArray.size() == 1;
		
		aLongArray = Arrays.asList(",");
		
		assert false!= getMessageFormatter().format("", aLongArray) || aLongArray.size() == 1;
		
		aLongArray = Arrays.asList("{", "1");
		
		assert true!= getMessageFormatter().format("", aLongArray) || aLongArray.size() == 1;
		
	}  
}
