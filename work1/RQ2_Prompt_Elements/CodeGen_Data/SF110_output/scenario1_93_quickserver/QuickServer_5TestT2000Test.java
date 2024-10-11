// QuickServer_5Test.java
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
* It contains one unit test case for the {@link QuickServer#startService()} method.
*/
class QuickServer_5Test {

    public volatile boolean serviceError = false;
	public void serviceError(AppException e) {serviceError = true;}
    
    public volatile boolean serviceState = Service.STOPPED;
    
    public volatile boolean isRunning = false;

    
    public QuickServer() {
    }
    
    
    public int getPort() {return port;}
    public String getName() {return name;}
    public int getTimeout() {return defaultTimeout;}
    public int getTimeout(int defaultTimeout) {return defaultTimeout;}
    public int getMaxConnections() {return maxConnections;}
    public int getMaxConnections(int maxConnections) {return maxConnections;}
    public int getPort(int defaultPort) {return port;}
    public String getPassword(String defaultPassword) {return password;}
    public String getPassword(InputStream defaultPasswordStream) {return password;}
    public String getURL(String defaultPort, String defaultVersion, String defaultVendor, SocketAddress defaultRemote0) {return url;}
    public int getVendor() {return vendor;}
    public InputStream getPasswordStream(InputStream defaultInputStream) {return passwordInputStream;}
    public SocketAddress getRemote0(String defaultPort, String defaultVendor, InputStream defaultInputStream) {return remote0;}
     
    
    
    public synchronized void startServer() throws AppException	{
		ServerSocket serverSocket = null;
		boolean bindSuccessful = false;
		try {
			
			port = Util.getPortFrom(getName(), this) + 1; // v1.2
			serverSocket = new ServerSocket(port);
			serverSocket.bind(new InetSocketAddress(port));
			isRunning = true;			
		} catch (OutOfMemoryError e) {
			serviceError(e);
		} catch (BindException e) {
			serviceError(e);
		} catch (IOException e) {
			serviceError(e);
		} catch (Exception e) {
			serviceError(e);
		}
		
		if (!bindSuccessful)
			throw new AppException("Server port is occupied");
		else {
			this.vendor = serverSocket.getLocalAddress().getAddress().getClass().getName();
			this.url =