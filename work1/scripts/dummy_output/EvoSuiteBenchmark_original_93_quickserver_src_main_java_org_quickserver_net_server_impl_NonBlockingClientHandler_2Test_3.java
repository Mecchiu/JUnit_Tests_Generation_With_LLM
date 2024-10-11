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
		//-------------------test 1---------------------------------------------------
	@Test
	public void getMaxThreadAccessCount() {
		int m = NonBlockingClientHandler.getMaxThreadAccessCount();
		assertEquals("Unexpected value", maxThreadAccessCount, m);
	}
	//-------------------test 2--------------------------------------------------------
	@Test
	public void processRunResultAfterCloseHandshake() throws Exception {
		doTasks();
		doProcessResults();
		processReturnedReader();
		doProcessFinished();
		//processGetWriter();
		//processRead();
		//processWrite();
		//assertAllResultsProcessed();
	}
	@Test
	public void processReadAfterCloseHandshake() throws Exception {
		doTasks();
		doProcessFinished();
		doProcessResults();
		doProcessRead();
		doProcessFinished();
		//processGetWriter();
		//processRead();
		//processWrite();
		//processReturnedReader();
		//processGetWriter();
		//processReadAfterClose();
		//processRead();
		//isFinishedResultProcessed();
	}
};

//---------------------------test 1---------------------------------------------------
/**
* Test class of {@link NonBlockingClientHandler}.
*/
public abstract class NonBlockingClientHandler_1Test extends NonBlockingClientHandler_2Test {

	//-----------------test 2-----------------------------------------------------------
	@Test
	public void getMaxThreadAccessCount() {
		int m = NonBlockingClientHandler.getMaxThreadAccessCount();
		assertEquals("Unexpected value", maxThreadAccessCount, m);
	}

}
//---------------------------test 2---------------------------------------------------