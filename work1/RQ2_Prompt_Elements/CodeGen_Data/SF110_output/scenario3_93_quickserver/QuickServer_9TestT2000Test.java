// QuickServer_9Test.java
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
* It contains one unit test case for the {@link QuickServer#info()} method.
*/
class QuickServer_9Test {

	public static final String SERVICE = "quick://server.QuickServer";
    /**
     * Create a new instance of QuickServer.
     * <ol>
     * <li>It sets the default ports number, which is 4123</li>
     * </ol>
     */
	public QuickServer()
    throws AppException {
		int port = 4123;
    
        try {
			this.info();
			System.out.println(SERVICE + " created");
            java.io.File file = new java.io.File("src/main/java/org/quickserver/net/server/" + SERVICE + ".java");
            byte[] source = null;
            FileInputStream fileinputStream = null;
            try {
                    fileinputStream = new FileInputStream(file);
		    source = java.util.Arrays.copyOf(fileinputStream.readAllBytes(), fileinputStream.available());
			System.out.println("Source: " + source.length);

			this.configureServer(this.PORT, port, true);
			//testClient();
			//
			//this.server.stop();
			this.server = new QuickServer();
			this.server.configure(fileinputStream,
				this.PORT,
				this.PORT,
				true
			);
			this.server.start();
		} catch(AppException e) {
			e.printStackTrace();
			System.err.println("Server start failed: " + e);
		} catch(Exception e) {
			e.printStackTrace();
			System.err.println("Server start failed: " + e);
		}
	}
	
	//test Client
	public void testClient()
    throws AppException {
    	//new ClientObjectHandler(0,0) does not work so we use the one from server.
		Class<?> clientClass = this.server.getClass();
		try {
			//ClientData obj = (ClientData)clientClass.newInstance();
			Socket serverSocket = new Socket(this.PORT, this.PORT);
			sockReader = new SocketReader(serverSocket, 3, true, 102400);
		
			if(0 == sockReader.readObject(clientClass)) {
				System.out.println("Client created");
				System.out.println("Client info: " + this.server.info());
			} //else {
			//throw new Exception("SockReader Exception