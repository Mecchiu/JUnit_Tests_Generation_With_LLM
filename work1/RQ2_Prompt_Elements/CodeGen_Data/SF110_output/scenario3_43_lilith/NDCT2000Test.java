// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains one unit test case for the {@link NDC#getContextStack()} method.
*/
class NDCTest {
/**
		* This method performs the test for all NDC.
		* <p/>
		* In the implementation of the interface NDCTest.
		* It tests that the implementation of the interface {@link NDC#getContextStack()}
		* returns an array containing only one instance of {@link Message}:
		* <p/>
		* 1. The implementation of the {@link NDC#getContextStack} method should return
		* an {@link Message} with the field {@link Message#_messageId} equal to
		* the {@code nodeId} of the root Node.
		* <p/>
		* 2. The implementation of the {@link NDC#getContextStack} method should return
		* an empty array.
		* <p/>
		* 3. The implementation of the {@link NDC#getContextStack} method should return a
		* String array with the last element equal to the Node identifier String:
		* <p/>
		* 4. The implementation of the {@link NDC#getContextStack} method should return the String "0"
		* as the last element.
		*
		* @throws Exception In case of any error.
		*/		
	@Test   
	public void testGetContextStackWithGetContextStackWithEQ() throws Exception {
        Message[] contextStack = new Message[1];
        contextStack[0] = new Message("abc");
        assertEquals("", contextStack[0].getContextStack());
        assertArrayEquals("0", contextStack[0].getRootMessage().getNodeId().toString());
    }
}