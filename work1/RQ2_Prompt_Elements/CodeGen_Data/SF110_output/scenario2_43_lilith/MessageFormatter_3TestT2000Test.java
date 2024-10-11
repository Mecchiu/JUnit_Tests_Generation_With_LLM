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

	@Test
    public void testIdentityToString() {
		final String msg = identityToString(new String[] {"Hello World"});    // Simple message from identityToString()
		assertEquals("MessageFormatter_3Test.identityToString() identity", msg);    // Message string equals the test message string
	}
	
}
