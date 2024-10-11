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
		
	/**
	 * A TestCase is started (to be run) with this test case will set up and tear down the current instance
	 */
	@Test
	void init()  {
		_messageProcessor.setLogLevel(Level.DEBUG);
		// The constructor with a custom message pattern is tested at end
	}
	
	/**
	 * Sets up (to be run) the instance by changing the argument of the MessageFormatter
	 */
	@Test
	void setUp() {
		// The constructor with a custom message pattern is tested at begin
}
}