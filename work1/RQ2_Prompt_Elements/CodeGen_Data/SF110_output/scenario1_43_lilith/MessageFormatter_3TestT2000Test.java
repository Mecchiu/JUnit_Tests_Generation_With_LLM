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
* It contains one unit test case for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_3Test {

	private final static String ID_C = ""; //$NON-NLS-1$
	private final static String CRLF = "\n";   //$NON-NLS-1$

    @Test
    public void messagePattern_identityToString() {
        MessageFormatter messageFormatter = new MessageFormatter();
        String[] expectedResult = {
            "[1] MessageFormatter(identityToString({0}}))",
            "{2} MessageFormatter(identityToString({0}))",
            "[1] MessageFormatter(identityToString({0}))"};

        Object[] returnResults = messageFormatter.identityToString(null);
        assertArrayEquals(expectedResult, returnResults);

        returnResults = messageFormatter.identityToString(ID_C);
        assertArrayEquals(expectedResult, returnResults);
    }

    @Test
    public void error_formatSingleStrings() {
        String[] expectedResult = {
            "[1] MessageFormatter(identityToString({0}))",
            "{"};

        try {
            String[] actualResult = messageFormatter.identityToString(null);
            String expected = expectedResult[0];
            fail("IllegalArgumentException expected");
        } catch (Throwable t) {
            assertNotNull(expected, t);
        }
    }

    @Test
    public void error_formatMoreStrings_withNullArgument() {
        MessageFormatter messageFormatter = new MessageFormatter();

        try {
            String[] actualResult = messageFormatter.identityToString(null);
            assertTrue(expectedException, actualResult == null);
            fail("IllegalArgumentException expected");
        } catch (Throwable t) {
            String expectedString = expectedException.toString();
            String actualString = "<class 'java.util.Map'>";
            fail("Unexpected exception thrown:" + t);
            failRegexp(expectedString, t);
        }
    }
	
	@Test
	public void repeat_messageWithCollection_withExistingArguments() {
		MessageFormatter messageFormatter = new MessageFormatter();
		Object[] argsCollection = {"MessageFormatter(identityToString({0}),[{1}])", "Test"};
		String[] expectedResult = Arrays.asList("[MessageFormatter(identityToString({12})),[{1}]]"));

		testWithMessage(messageFormatter, messageFormatter.identityToString(null), expectedResult, argsCollection);
	}

	private void testWithMessage(MessageFormatter messageFormatter, Object[] expectedMessage, String[] expectedResult) {
		Object[] argsCollection = Arrays.asList(expectedMessage);
		Object[] actualMessageWithArgsHash = messageFormatter.identityToString(null);
		Object[] actualMessage = messageFormatter.identityToString(null);
		Object[] actualArgsHash = messageFormatter.identityToString(null);

		String actualString = "";
		Set<Object> allArguments = new HashSet<Object>();
		allArguments.add(argsCollection);
		allArguments.add(actualMessageWithArgsHash);
		allArguments.add(actualArgsHash);

		boolean error = false;

		// Assertion is expected to happen on a timeout and fail during the actual assertion.
		try {
			Set<Object> actual = messageFormatter.identityToString(null);
			
			Set<Object> expected = new HashSet<Object>();
			expected.add(expectedMessage[0]);

			Set<Object> actual2 = messageFormatter.identityToString(null);
			assertEquals(expected, actual);

			// Remove the first argument array and ensure it is not contained in actual
			String[] actuals = Arrays.asList(actual);
			
			Set<Object> actual3 = Arrays.asList(actualCollection.get(actuals[0]));
			
			// First array is not in the expected collection.
			assertNotSame(expected, actual3);

			Set<Object> expected2 = new HashSet<Object>();


			expected2.add(expectedMessage[1]);
			Set<Object> actual4 = messageFormatter.identityToString(null);
			
			expected2.add(expectedMessage[1]);
			
			expected2.add(actual2);
			
			actual2.remove(actuals[0]);
			

			// Remove a second argument and ensure it is not contained in actual
			String[] actuals2 = expected2.toArray(new String[expected2.size()]);

			Set<Object> actual5 = Arrays.asList(actual);
			
			expected5.remove(expectedMessage[1]);
			
			Set<Object> actual6 = Arrays.asList(actualCollection.get(actuals2[0]));
			
			expected5.remove(expectedMessage[1]);
			
			
			// Remove the second and add an argument.
			String[] actualValues = Arrays.asList(actual4);
			
			Set<Object> actual7 = Arrays.asList(actuals2);
			
			actual7.remove(actuals2[0]);
			
			// Now the second element is the last value. The second argument.
			String[] actualValues5 = Arrays.asList(actual4);

			expectedValues.remove(expectedMessage[1]);
			expectedValues.add(expectedMessage[2]);

			Set<Object> actual8 = Arrays.asList(actuals);
			actual8.remove(actuals2[0]);
			actual8.remove(actuals2[1]);
			
				
			Object[] arrArgs5 = Arrays.asList(argsCollection);
			int count = expectedMessage[0].length()+1;

			Set<Object> actual9 = Arrays.asList(actual5);
			Set<Object> actual10 = Arrays.asList(actuals2);

			Set<Object> actualArray1 = new HashSet<Object>();
			Set<Object> actualArray3 = new HashSet<Object>();
			Set<Object> actualArray4 = new HashSet<Object>();

			for(int i=0;i<expectedMessage.length;i++) {
				if(expectedMessage[i] instanceof String) {
					String args = (String) expectedMessage[i];
					