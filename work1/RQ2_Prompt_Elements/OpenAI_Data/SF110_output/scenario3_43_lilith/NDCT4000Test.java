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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

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
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
		NDC.pop();
	}
}

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack();
}

// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;