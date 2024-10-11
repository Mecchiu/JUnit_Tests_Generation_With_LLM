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
		
	private final MessageFormatter formatter = new MessageFormatter();

	@Test
	void testEvaluateArguments() {
		//Test 1
	    String[] args = new String[]{"arg1", "arg2"};
	    String message = formatter.evaluateArguments(null, args);
	    assertTrue(Arrays.equals(args, formatter.evaluateArguments(null, args).getThrowable().getMessageArray()));
	    //Test 2
	    String message2 = formatter.evaluateArguments(Arrays.asList("arg1", "arg2"));
	    
	    //assertTrue(Arrays.equals(args, formatter.evaluateArguments(args).getThrowable().getMessageArray()));
	    assertTrue(message.equals(message2));
	}
	
	@Test
	void testEvaluateArgumentsWithOneArgumentPerPart() {
		String message = formatter.evaluateArguments(null, new String[]{"arg1", "arg2"});
	    assertTrue(Arrays.equals(new String[]{"arg1", "arg2"}, formatter.evaluateArguments(null, new String[]{"arg1", "arg2"}).getThrowable().getMessageArray()));
	}
	
	@Test
	void testEvaluateArgumentsMultipleTimesWithSameArguments() {
		String[] args = new String[]{"arg1", "arg2", "arg3"};
		String message = formatter.evaluateArguments(null, args);
		//System.out.println(message); //TODO print on console
	}


	@Test
	void testCountingOfPlaceholders() {
		//No arguments for first place holder found.
		String message = formatter.evaluateArguments(null, null);
		assertTrue(message.indexOf("Number of Placeholders: 0") == -1);
		//1 argument
		String message2 = formatter.evaluateArguments(Arrays.asList("arg1", "arg2"), null);
		assertTrue(message2.indexOf("Number of Placeholders: 1") == -1);
		//2 arguments
		String message3 = formatter.evaluateArguments(Arrays.asList("arg1", "arg2", "arg3"), null);
		assertTrue(message3.indexOf("Number of Placeholders: 2") == -1);
		//3 args
		String message4 = formatter.evaluateArguments(Arrays.asList("arg1", "arg2", "arg3"), new String[]{"arg1", "arg2"});
		assertTrue(message4.indexOf("Number of Placeholders: 1") == 0);
		//3-3 args with placeholders
		String message5 = formatter.evaluateArguments(Arrays.asList("arg1", "arg2", "arg3", "arg4"), new String[]{"arg1", "arg2", "arg3"});
		assertTrue(message5.indexOf("Number of Placeholders: 3") == 4);
	}

	@Test
	void testConstructionOfArgumentResultWithThrowable() {
		Map result = formatter.evaluateArguments(new String[]{"value"}, null);
		assertNotNull(result.get("message"));
		assertNotNull(result.get("value"));
		Set errorSet = new HashSet(Arrays.asList("msg", "arg1", "value", "throwable"));
		assertTrue(errorSet.equals(result.keySet()));
		//TODO: the tests could be improved.
	}
	
	@Test
	void testConstructionOfArgumentResultWithFallback() {
		ArgumentResult result = new MessageFormatter_2Test().evaluateArguments(null, new String[]{"value4", "arg3"});
	    assertNotNull(result.getThrowable());
		assertNotSame(result.getThrowable(), null);
        assertTrue(result.getThrowable() instanceof RuntimeException);
	}

	@Test
	void testConstructionOfCollectionOfArguments() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:sszzz");
		Collection<String> result = new MessageFormatter_2Test().evaluateArguments(null, new String[]{"value", "arg3"}); 
		
		assertNotNull(result);
		assertNotNull(result.toArray());
		assertTrue(result instanceof Collection);

		//TODO: remove one test
		result.remove("value");
		assertFalse(result.remove("value"));
	}
	
}