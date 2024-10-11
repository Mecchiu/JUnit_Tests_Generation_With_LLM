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

	/**
	 * @param args
	*/
	@Test
	void shouldCountArgumentPlaceholders(Object[] args) {
		assertEquals("countArgumentPlaceholders shall be equal to 0", 0, countArgumentPlaceholders(null));
		assertEquals("countArgumentPlaceholders shall be equal to 1", 1, countArgumentPlaceholders(args));
	}
    
    @Test
    void shouldCreateArgumentResultCorrectlyBasedOnArgumentCount() {
        Object[] args = new Object[10];
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (int i = 0; i < args.length; i++) {
            args[i] = dateFormat.format(new Date()) + " " + i;
        }
        String expectedMessage = "Hello, World!";
        ArgumentResult argumentResult = new MessageFormatter().evaluateArguments(expectedMessage, args);
        assertEquals("message should be properly formatted with the parameters", expectedMessage, argumentResult.getArgumentResult().getArgument().toString());
        Collection<Throwable> exceptions
                = 
                new HashSet<>(Arrays.asList(argumentResult.getThrowable()));
        assertTrue("The last one in the results should contain the given exception",
                exceptions.contains(expectedException(0)));
        assertTrue("The last one in the results should contain the given exception",
                exceptions.contains(expectedException(1)));
        assertFalse("The last one in the results should NOT contain the given exception",
                exceptions.contains(expectedException(2)));
        assertFalse("The last one in the results should NOT contain the given exception",
                exceptions.contains(expectedException(3)));
    }
    
    @Test
    void shouldUseArgumentArrayToConstructMessagePattern() {
        MessageFormatter.ArgumentResult result = new MessageFormatter().evaluateArguments("Hello", new Object[] {1, 2, 3});
        assertEquals("message pattern shall be correctly constructed", "Hello, World #1 #2", result.getArgumentResult().getArgument().toString());
    }
    
    @Test
    void shouldGetArgumentStringsFromArgumentResult() {
        final Map<String, Object> argumentResult = new HashMap<>();
        argumentResult.put("arg1", "Hello1 World1");
        argumentResult.put("arg2", "Hello2 World2");
        argumentResult.put("arg3", "Hello3 World3");
        messageCountWithArguments(argumentResult);
    }
    
    Integer messageCountWithArguments(Map<String, Object> argumentResult) {
        ArgumentResult argumentResultWithArguments
                = new MessageFormatter().evaluateArguments(null, argumentResult.values().toArray(new Object[0]));
        return argumentResultWithArguments.getArgumentResult().getCount();
    }
    
    @Test
    void shouldThrowIfArgumentResultAndThrowableIsNull() {
        ArgumentResult argumentResultWithException = new MessageFormatter().evaluateArguments(null,  null);
//        Set<Throwable> set = new HashSet<>();
        Integer result = messageCountWithArguments(argumentResultWithException);
//        set.add(argumentResultWithException.getThrowable());
//        assertEquals("message count shall be zero if the argument Result and the value of throwable if a Throwable", 0, result);
    } 
}

class MessageFormatter_2Test_2 {

}