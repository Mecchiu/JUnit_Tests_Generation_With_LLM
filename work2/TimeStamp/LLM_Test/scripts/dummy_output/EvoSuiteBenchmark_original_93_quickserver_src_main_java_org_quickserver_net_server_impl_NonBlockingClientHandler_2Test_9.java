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
* It contains one unit test case for the {@link NonBlockingClientHandler#getMaxThreadAccessCount()} method.
*/
class NonBlockingClientHandler_2Test {
		
	/**
	 * Test for {@link NonBlockingClientHandler#NonBlockingClientHandler(String)}.
	 * @since 1.4.7
	 */
// This tests the constructor.
// Its use is as it needs to be public, because then it is called by a static 
// method from its inner class if the constructor is not supported as a way to make
// one unit test (as the unit test could be inherited from the inherited
// class - in which case this unit test does not have a class name because the
// constructor would fail.
	@Test
	public abstract void testConstructor1() throws Exception;
		
}