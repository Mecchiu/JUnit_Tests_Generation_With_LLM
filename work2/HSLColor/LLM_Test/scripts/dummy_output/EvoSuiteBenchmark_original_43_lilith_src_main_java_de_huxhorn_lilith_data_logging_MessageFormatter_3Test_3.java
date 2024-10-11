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
		// private volatile boolean test;
		// to test that messages form as expected, set test = true;
		private volatile String message = "";
		private volatile Throwable throwable = null;

    // @Test is in the unit test cases as well
    // public void constructorTest() {
    // Test test = new Test();
    // }

    /* (non-Javadoc)
      * @see junit.framework.TestCase#setUp()
      */
    @Override
    protected void setUp() throws Exception {
        try {
            message = identityToString(new Object());
        } catch (RuntimeException e) {
            throw new RuntimeException("Unexpected exception: " + e.getLocalizedMessage(), e);
        }
    }

    /* (non-Javadoc)
      * @see junit.framework.TestCase#tearDown()
      */
    @Override
    protected void tearDown() throws Exception {
        message = null;
        throwable = null;
    }

    public String message() {
        return message;
    }

    public Throwable throwable() {
        return throwable;
    }

    // to test that message format as expected:
    // public void testMessage() {
    //    test();
    //    message.equals(msg);
    //    message.equals(msg);
    //    test();
    //    message.equals(msg.getClass().getName());
    //    message.equals(msg.getClass().getName());
    //    test();
    //    test();
    //    test();
    //    test();
    //    test();
    // }

    public void test() {
        assertTrue("testString: Message not formated correctly.", message.contains(MessageFormatter.identityToString(new Object())));
    }


    public void testThrowable() {
        message = String.format("%1$tT%1$tM", new Date());
        assertEquals("testThrowable: msg was different", throwable, null);
        assertTrue("testMessage: No msg throws.", message.indexOf(MessageFormatter.identityToString(new Object())) > 0);
    }

    public void testMessageSet() {
        Set<String> messageSet = new HashSet<String>();
        MessageFormatter.messageSet(messageSet, "TEST");
        assertTrue("testSet: " + messageSet, messageSet.contains("TEST"));
    }

    public void testMessageSetNull() {
        try {
            MessageFormatter.messageSet(null, "TEST");
            fail();
        } catch (NullPointerException e) {
            assertFalse("expected not null.", false);
        }
    }

    public void testMessageSetNonExist() {
        try {
            MessageFormatter.messageSet(new Set<String>(), "TEST");
            fail();
        } catch (InvalidKeyLengthException e) {
            assertEquals("Unexpected message length.", "TEST", e.getMessage());
        }
    }

    public void testNonExistSet() {
        try {
            MessageFormatter.messageSet(new StringSet(), "TEST");
            fail("Expected an NPE");
        } catch (NullPointerException e) {
            assertFalse("expected not null.", false);
        }
    }


    // This unit test depends on the order of the test classes.
    class Test {
        public String message;
        public Throwable throwable;

        Test() {
            message = message();
        }

        public Test setMessage(String test) {
            message = test;
            return this;
        }

        public Test setThrowable(Throwable test) {
            throwable = test;
            return this;
        }

        public void test() {
            setMessage("TEST").test();
            setMessage("TEST").test();
            setThrowable(new RuntimeException("TEST"));
            setThrowable("TEST");
        }

        public void testThrowable() {
            message = message + "TEST";
            throwable = null;
            try {
                setThrowable("TEST").test();
            } catch (NullPointerException e) {
            }
        }
    }

    // To test that messages formatted correctly:
    public void testsFormattedMessage() {
        MessageFormatter formatter = new MessageFormatter();
        Set<String> formattedSet = formatter.messageSet(new HashSet<String>(), "TEST");
        assertNull("testFormattedMessage: " + message, formattedSet);
        formatter.messageSet(new HashSet<String>(), "TEST");
        assertNull("testFormattedMessage: " + message, formattedSet);
    }

    class MessageFormatter {
        private final Map<LogLevels, MessageFormatter.MessageFormat> messageFormatters =
                (Map<LogLevels, MessageFormatter.MessageFormat>) Arrays.asList(new MessageFormatter.MessageFormat[]{
                        new MessageFormatter.MessageFormat() {
                            public String message(Object obj) {
                                Collection.of(LogLevels.SUB_OBJ).inverse();
                                Collection.of(LogLevels.DEBUG).inverse();
                                return message;
                            }
                        },
                        new MessageFormatter.MessageFormat() {
                            public String value(String value) {
                                return message;
                            }

                            public String format(String format) {
                                return message;
                            }
                        }
                }
        );

}
}