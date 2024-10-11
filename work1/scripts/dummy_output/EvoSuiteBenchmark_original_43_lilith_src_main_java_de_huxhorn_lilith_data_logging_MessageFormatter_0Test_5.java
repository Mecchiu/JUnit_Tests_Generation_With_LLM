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
		
//------------------------------------------------------------------------------------------------------------------------------------------------------
// Members
//------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * Replacement text based on a template.
     */
    private static final String TEMPLATE = "Test: \n Message 1\n Message 2";
    
    //----------------------------------------------------------------------------------------------------------------------
    /**
     * The number of placeholders to replace in the message pattern.
     */
    private static final int MAX_PLACEHOLDER = 10;
    
    //----------------------------------------------------------------------------------------------------------------------
    /**
     * The arguments to replace placeholders.
     */
    private static final String ARGUMENTS[] = { "first", "second", "third" };
    
        
//------------------------------------------------------------------------------------------------------------------------------------------------------
// Members
//------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * The actual implementation of {@link MessageFormatter}.
     */
    private static final MessageFormatter MESSAGE_FORMATTER = new MessageFormatter();
	
	public String format(String messagePattern, String[] arguments) {
		return MESSAGE_FORMATTER.format(messagePattern, arguments);
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------
// Tests
//------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Test method for {@link MessageFormatter#format(String, String[])}.
     */
    @Test
    public void testFormat() {
        assertEquals(TEMPLATE, format(TEMPLATE, ARGUMENTS));
        
        final Set<String> argumentsTaken = getArgumentsTaken(format(TEMPLATE, ARGUMENTS));
        assertEquals(6, argumentsTaken.size());                                                                                                                                            
        final Collection<String> argumentsWithPlaceHolders = getArgumentsWithPlaceHolders(format(TEMPLATE, ARGUMENTS));
        assertEquals("Message 1\n and\n Message 2\n", argumentsWithPlaceHolders.stream().collect(Collectors.joining(System.lineSeparator(), "and\n", "and,\n")));
	}
	
	
	public Set<String> getArgumentsTaken(String formattedMessage) {
			return Arrays.stream(formattedMessage.split("\n")).map(line -> line.split("[\\n]")).flatMap(i -> i).collect(Collectors.toSet());
	}

	

	public Set<String> getArgumentsWithPlaceHolders(String formattedMessage) {
			return Arrays.stream(formattedMessage.split("\n")).map(line ->
			 line.replaceAll(Pattern.$("\\$(\\$(first,|\\(first, second.*)|last,|\\(last, second.*)|\\))\\$", "\\$"), "")
						.split("[\\n]", 2)).
				collect(Collectors.toSet());
	}


    //------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * The number of placeholders to insert into the message pattern.
     */
    private static final int PLACEHOLDER_COUNT = MAX_PLACEHOLDER * 2;
    
    //------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * Return the arguments that are taken by the given message.
     */
    private static Set<String> getArgumentsTaken(String formattedMessage) {
		String formatted = formattedMessage.trim();
		assertEquals(String.valueOf(PLACEHOLDER_COUNT), formatted.length());
		return new HashSet<>();
	}
    
    //------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * Return the arguments that where taken by the given message.
     */
    private static Collection<String> getArgumentsWithPlaceHolders(String formatted) {
		String formattedWithPlaceholders = formatted.trim();
		//remove the count of placeholders
		String[] splitArgs = formattedWithPlaceholders.split(Pattern.$("\\$(count, ", "\\count"));
		StringBuilder b = new StringBuilder();
		b.append(plural(splitArgs[0]));
		for (int i = 1; i < splitArgs.length; ++i) 
			b.append(",").append(plural(splitArgs[i])).append(' ').append(String.valueOf(splitArgs[i]));
}
}