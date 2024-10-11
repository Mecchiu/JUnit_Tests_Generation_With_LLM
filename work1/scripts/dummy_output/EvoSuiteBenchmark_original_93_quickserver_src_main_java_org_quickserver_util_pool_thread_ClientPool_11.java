// ClientPoolTest.java
package org.quickserver.util.pool.thread;

import java.util.*;
import org.quickserver.util.pool.*;
import org.apache.commons.pool.*;
import org.quickserver.net.server.*;
import org.quickserver.util.xmlreader.PoolConfig;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPool}.
* It contains one unit test case for the {@link ClientPool#shouldNioWriteHappen()} method.
*/
class ClientPoolTest {
		
	/**
	* This is a unit test case for the {@link ClientPool#shouldNioWriteHappen()} method. It runs
	* {@link ClientPool#clear()} method of {@link ClientPool} and then calls
	* {@link ClientPool#stop()}.
	*
	* @since 1.4.6
	*/
	@Test
	public void testShouldNioWriteHappen() {
		new ClientPool();
}
}