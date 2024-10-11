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
	 * Tests the empty operation.
	 */
	@Test
    public void tTestEmptyOperation() {

        // No NDC present
        assertNull(NDC.getContextStack());
    }

	/**
	 * Tests the addition of one message into the top context.
	 */
	@Test
	void tTestTopLevelPush() {
	    
		// The message is pushed
		Message m0 = Message.newBuilder()
						.setId("m0")
						.setThreadId(1)
						.setMessageId(1)
						.setMessageTag(1)
						.setThreadName(10)
						.setMessage("test message")
						.setMessageText("text")
						.build();
		
		// The NDC needs a message added in its stack
		Message m1 = Message.newBuilder()
						.setId("m1")
						.setThreadId(2)
						.setMessageId(1)
						.setMessageTag(1)
						.setThreadName(1)
						.setMessage("test message")
						.setMessageText("text")
						.build();
		
		// The NDC pushes message m0
		Message m2 = Message.newBuilder()
						.setId("m2")
						.setThreadId(3)
						.setMessageId(1)
						.setMessageTag(1)
						.setThreadName(1)
						.setMessage("test message")
						.setMessageText("text")
						.build();
		
		// The NDC has a previous message in its stack
		Message m3 = Message.newBuilder().setId("m3")
						.setThreadId(1)
						.setMessageId(1)
						.setMessageTag(1)
						.setThreadName(1)
						.setMessage("test message")
						.setMessageText("text")
						.build();
		
		assertNotNull(NDC.getContextStack());
		
		assertEquals(3, DCManager.get()
			.getTopContextStack().size());
        
		assertSameObject(m0, DCManager.get().getTopContextStack().get(0));
		assertSameObject(m1, DCManager.get().getTopContextStack().get(1));
        
        assertSameObject(m2, DCManager.get().getTopContextStack().get(2));
        
        assertSameObject(m3, DCManager.get().getTopContextStack().get(3));
        
	}
        
    /**
	 * Tests the addition of one message into a thread.
	 */
	@Test
    public void tTestThreadPush() {
		
    	Message m0 = Message.newBuilder()
					.setId("m0")
					.setThreadGroup("Thread1")
					.setMessageTag(1)
					.setThreadId(1)
					.setMessageId(1)
					.setMessageTag(1)
					.setThreadText("test thread 2")
					.setMessageText("text")
					.build();
		
		Message m1 = Message.newBuilder()
					.setId("m1")
					.setThreadGroup("Thread1")
					.setMessageTag(1)
					.setThreadName(1)
					.setMessage("test message")
					.setMessageText("text")
					.build();
		
		Message m2 = Message.newBuilder()
					.setId("m2")
					.setThreadGroup("Thread1")
					.setMessageTag(1)
					.setThreadName(3)
					.setMessage("test message")
					.setMessageText("text")
					.build();
		
		assertNotNull(DCManager.get());
    
        assertNotNull(DCManager.get().getTopContextStack().get(5));
        
        
        DCManager.get()
			.addContext(Message.newBuilder().setThreadId(1)
								.setMessageId(1)
								.setMessageTag(1)
								.setThreadName(1)
								.setMessageText("test thread 2")
								.setMessage("test message")
								.setMessageText("text")
							.build());
        
        assertNotNull(DCManager.get().getTopContextStack().get(5));
    
	}

}