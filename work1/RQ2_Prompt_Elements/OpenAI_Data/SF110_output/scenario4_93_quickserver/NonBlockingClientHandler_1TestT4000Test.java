// NonBlockingClientHandler_1Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterRead()} method.
*/
class NonBlockingClientHandler_1Test {

	@Test
	void testGetWakeupSelectorAfterRegisterRead() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		assertTrue(nonBlockingClientHandler.getWakeupSelectorAfterRegisterRead());
	}
}

// NonBlockingClientHandler_2Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#setWakeupSelectorAfterRegisterRead(boolean)} method.
*/
class NonBlockingClientHandler_2Test {
		
	@Test
	void testSetWakeupSelectorAfterRegisterRead() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		nonBlockingClientHandler.setWakeupSelectorAfterRegisterRead(false);
		assertFalse(nonBlockingClientHandler.getWakeupSelectorAfterRegisterRead());
	}
}

// NonBlockingClientHandler_3Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterWrite()} method.
*/
class NonBlockingClientHandler_3Test {
		
	@Test
	void testGetWakeupSelectorAfterRegisterWrite() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		assertTrue(nonBlockingClientHandler.getWakeupSelectorAfterRegisterWrite());
	}
}

// NonBlockingClientHandler_4Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#setWakeupSelectorAfterRegisterWrite(boolean)} method.
*/
class NonBlockingClientHandler_4Test {
		
	@Test
	void testSetWakeupSelectorAfterRegisterWrite() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		nonBlockingClientHandler.setWakeupSelectorAfterRegisterWrite(false);
		assertFalse(nonBlockingClientHandler.getWakeupSelectorAfterRegisterWrite());
	}
}

// NonBlockingClientHandler_5Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getMaxThreadAccessCount()} method.
*/
class NonBlockingClientHandler_5Test {
		
	@Test
	void testGetMaxThreadAccessCount() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		assertEquals(5, nonBlockingClientHandler.getMaxThreadAccessCount());
	}
}

// NonBlockingClientHandler_6Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#setMaxThreadAccessCount(int)} method.
*/
class NonBlockingClientHandler_6Test {
		
	@Test
	void testSetMaxThreadAccessCount() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		nonBlockingClientHandler.setMaxThreadAccessCount(10);
		assertEquals(10, nonBlockingClientHandler.getMaxThreadAccessCount());
	}
}

// NonBlockingClientHandler_7Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getThreadAccessCount()} method.
*/
class NonBlockingClientHandler_7Test {
		
	@Test
	void testGetThreadAccessCount() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		assertEquals(0, nonBlockingClientHandler.getThreadAccessCount());
	}
}

// NonBlockingClientHandler_8Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getInitialHandshakeStatus()} method.
*/
class NonBlockingClientHandler_8Test {
		
	@Test
	void testGetInitialHandshakeStatus() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		assertFalse(nonBlockingClientHandler.getInitialHandshakeStatus());
	}
}

// NonBlockingClientHandler_9Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#encrypt(ByteBuffer)} method.
*/
class NonBlockingClientHandler_9Test {
		
	@Test
	void testEncrypt() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		ByteBuffer src = ByteBuffer.allocate(0);
		assertThrows(IOException.class, () -> nonBlockingClientHandler.encrypt(src));
	}
}

// NonBlockingClientHandler_10Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#clean()} method.
*/
class NonBlockingClientHandler_10Test {
		
	@Test
	void testClean() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		nonBlockingClientHandler.clean();
	}
}

// NonBlockingClientHandler_11Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#finalize()} method.
*/
class NonBlockingClientHandler_11Test {
		
	@Test
	void testFinalize() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		assertThrows(Throwable.class, () -> nonBlockingClientHandler.finalize());
	}
}

// NonBlockingClientHandler_12Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#handleClient(TheClient)} method.
*/
class NonBlockingClientHandler_12Test {
		
	@Test
	void testHandleClient() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		TheClient theClient = new TheClient();
		assertThrows(Exception.class, () -> nonBlockingClientHandler.handleClient(theClient));
	}
}

// NonBlockingClientHandler_13Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#setInputStream(InputStream)} method.
*/
class NonBlockingClientHandler_13Test {
		
	@Test
	void testSetInputStream() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		InputStream in = new InputStream();
		assertThrows(IOException.class, () -> nonBlockingClientHandler.setInputStream(in));
	}
}

// NonBlockingClientHandler_14Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getBufferedReader()} method.
*/
class NonBlockingClientHandler_14Test {
		
	@Test
	void testGetBufferedReader() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		assertNull(nonBlockingClientHandler.getBufferedReader());
	}
}

// NonBlockingClientHandler_15Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server