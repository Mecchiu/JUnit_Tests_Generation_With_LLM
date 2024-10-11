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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getMaxThreadAccessCount()} method.
*/
class NonBlockingClientHandler_2Test {

	@Test
	void testGetMaxThreadAccessCount() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		int result = nonBlockingClientHandler.getMaxThreadAccessCount();
		assertEquals(5, result);
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#setMaxThreadAccessCount(int)} method.
*/
class NonBlockingClientHandler_3Test {
		
	@Test
	void testSetMaxThreadAccessCount() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		nonBlockingClientHandler.setMaxThreadAccessCount(5);
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterWrite()} method.
*/
class NonBlockingClientHandler_4Test {
		
	@Test
	void testGetWakeupSelectorAfterRegisterWrite() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		boolean result = nonBlockingClientHandler.getWakeupSelectorAfterRegisterWrite();
		assertEquals(true, result);
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#setWakeupSelectorAfterRegisterWrite(boolean)} method.
*/
class NonBlockingClientHandler_5Test {
		
	@Test
	void testSetWakeupSelectorAfterRegisterWrite() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		nonBlockingClientHandler.setWakeupSelectorAfterRegisterWrite(true);
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterRead()} method.
*/
class NonBlockingClientHandler_6Test {
		
	@Test
	void testGetWakeupSelectorAfterRegisterRead() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		boolean result = nonBlockingClientHandler.getWakeupSelectorAfterRegisterRead();
		assertEquals(true, result);
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#setWakeupSelectorAfterRegisterRead(boolean)} method.
*/
class NonBlockingClientHandler_7Test {
		
	@Test
	void testSetWakeupSelectorAfterRegisterRead() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		nonBlockingClientHandler.setWakeupSelectorAfterRegisterRead(true);
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getThreadAccessCount()} method.
*/
class NonBlockingClientHandler_8Test {
		
	@Test
	void testGetThreadAccessCount() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		int result = nonBlockingClientHandler.getThreadAccessCount();
		assertEquals(0, result);
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#clean()} method.
*/
class NonBlockingClientHandler_9Test {
		
	@Test
	void testClean() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		nonBlockingClientHandler.clean();
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#finalize()} method.
*/
class NonBlockingClientHandler_10Test {
		
	@Test
	void testFinalize() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		nonBlockingClientHandler.finalize();
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#handleClient(TheClient)} method.
*/
class NonBlockingClientHandler_11Test {
		
	@Test
	void testHandleClient() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		TheClient theClient = new TheClient();
		nonBlockingClientHandler.handleClient(theClient);
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#setInputStream(InputStream)} method.
*/
class NonBlockingClientHandler_12Test {
		
	@Test
	void testSetInputStream() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		InputStream in = new InputStream();
		nonBlockingClientHandler.setInputStream(in);
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getBufferedReader()} method.
*/
class NonBlockingClientHandler_13Test {
		
	@Test
	void testGetBufferedReader() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		BufferedReader result = nonBlockingClientHandler.getBufferedReader();
		assertEquals(null, result);
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#closeConnection()} method.
*/
class NonBlockingClientHandler_14Test {
		
	@Test
	void testCloseConnection() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		nonBlockingClientHandler.closeConnection();
	}
}

// NonBlockingClientHandler_15Test.java
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#closeIfSSLOutboundDone()} method.
*/
class NonBlockingClientHandler_15Test {
		
	@Test
	void testCloseIfSSLOutboundDone() {
		NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
		boolean result = nonBlockingClientHandler.closeIfSSLOutboundDone();
		assertEquals(false, result);
	}
}

// NonBlockingClientHandler_16Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.