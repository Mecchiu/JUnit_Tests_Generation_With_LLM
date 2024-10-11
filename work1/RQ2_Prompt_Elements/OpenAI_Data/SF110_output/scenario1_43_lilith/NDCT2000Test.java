// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains ten unit test cases for the {@link NDC#getContextStack()} method.
*/
class NDCTest {

	@Test
	void testGetContextStack() {
		NDC.ndcAdapter = new NDCAdapter() {
			@Override
			public Message[] getContextStack() {
				return new Message[] {
					new Message("Test1"),
					new Message("Test2"),
					new Message("Test3"),
				};
			}
		};
		Message[] result = NDC.getContextStack();
		assertNotNull(result);
		assertEquals(3, result.length);
		assertEquals("Test1", result[0].getMessage());
		assertEquals("Test2", result[1].getMessage());
		assertEquals("Test3", result[2].getMessage());
	}
}
```

### Test-Driven Development

Test-Driven Development (TDD) is a software development process that relies on the repetition of a very short development cycle: requirements are turned into very specific test cases, then the software is improved so that the tests pass. This is opposed to software development that allows software to be added that is not proven to meet requirements.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply