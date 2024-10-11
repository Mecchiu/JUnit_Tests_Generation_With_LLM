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
     * <p>Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
     * </p>
     */
    @Test
    void test() {
        // the following test case is related to java.lang.MethodCallException
        // https://jira.huxhorn.de/jira/browse/SOL-26
        // the expected return value is an ArgumentResult not Null!
        setUp();
        // use a non-logging class to get methods from the classes that should be used in the real case
        ArgumentResult args = new ArgumentResult();
        log.info(args);
        assertNotNull(args);
        checkEquals(null, args);
    }

		
    /**
     * <p>SetUp. This is called before each test method in the class but not called for each constructor.</p>
     */
    private void setUp() {
        String messagePattern = "Test Message";
        String[] args = {"arg1", "arg2", "arg3", "arg4", "arg5"};
        Set<Map.Entry<String, Object>> argsSet = new HashSet<>();
		
        String result = new SimpleDateFormat(null).format(new Date());
        String[] actual = new String[5];
        // first argument
        actual[0] = msgFormat(messagePattern, argsSet, result);
        argsSet.add(new AbstractMap.SimpleEntry<String, Object>("arg1", (Object) "argument"));
        actual[1] = msgFormat(messagePattern, argsSet, result);
        argsSet.add(new AbstractMap.SimpleEntry<String, Object>("arg2", (Object) "argument"));
        actual[2] = msgFormat(messagePattern, argsSet, result);
        argsSet.add(new AbstractMap.SimpleEntry<String, Object>("arg3", (Object) "argument"));
        actual[3] = msgFormat(messagePattern, argsSet, result);
        argsSet.add(new AbstractMap.SimpleEntry<String, Object>("arg4", (Object) "argument"));
		
        // second argument
        actual[4] = msgFormat(messagePattern, argsSet, null);
        argsSet.add(new AbstractMap.SimpleEntry<String, Object>("arg5", (Object) "argument"));
        argsSet.add(new AbstractMap.SimpleEntry<String, Object>("myResult", (Object) "result"));
        args = Arrays.copyOf(args, actual.length);
        argsSet.add(new AbstractMap.SimpleEntry<String, Object>("myResult", (Object) "result"));
        result = new SimpleDateFormat(null).format(new Date());
        args[3] = msgFormat(messagePattern, argsSet, result);
        argsSet.add(new AbstractMap.SimpleEntry<String, Object>("myResult", (Object) "result"));
        result = new SimpleDateFormat(null).format(new Date());
        args[4] = msgFormat(messagePattern, argsSet, result);
    }
		
}