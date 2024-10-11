// QuickServer_0Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains one unit test case for the {@link QuickServer#getVersion()} method.
*/
class QuickServer_0Test {
public static void main(String[] args) {
		}
}
/*v1.4.0
 * Test class with JUnit.
 * Test main() function for JUnit.
*/
public final class QuickServer_Test extends junit.framework.TestCase  {
	
	private QuickServer _server;
	private static final Long TIMEOUT_MS = 200L;
	
	public QuickServer_Test(){				
	}
	
	public void setSystemOutOut(java.io.PrintWriter out){
		System.setOut(new PrintWriter(out, true));
	}
	
	protected void setSystemErrOut(java.io.PrintWriter out){
		System.setErr(new PrintWriter(out, true));
	}
	protected void resetSystemOutOut(java.io.PrintWriter out){
		System.setOut(out);
	}
	
    /**
     * Creates a QuickServer with specified client.
     * @param clientName The name of the client.
     * @throws AppException An exception occuring.
     * @see #setName(String)
     */
	public QuickServer(String clientName) throws AppException {
		super();
		_server = new QuickServer();
		setName(clientName);
	}
	
	@SuppressWarnings("rawtypes")
	public void setName(String name){
		QuickServer_Test.this._server.setName(name);
		setSysOutOut(System.out);
		setSysErrOut(System.err);
	}

	/**
	 * Closes the server
	 * @throws Exception An exception occuring.
	 * @see #setName(String)
	 * @see #waitUntilClosed()
	 */
	public void cleanUp() throws Exception {
		java.util.Iterator it = _server.getCurrentActiveClient().getObjects().iterator();
		while(it.hasNext()){
			try {
				_server.closeClient(it.nextObject());
				it.remove();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
		_server.closeServers();		
	}

	@Override
	public boolean start() {
		java.util.Iterator c = _server.getClients().iterator();
		while(c.hasNext()){
			try {
				_server.addClient(new