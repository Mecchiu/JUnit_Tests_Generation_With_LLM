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

	private int port = 534;
	private String bindAddress = "localhost"; //default to localhost
	private String bindHost = "127.0.0.1"; //localhost
	private String portString = "" + port;
	private SSLContext sslContext;
	private ServerSocket sslServerSocket;
	private ServerSocket sslServerSocket2;

	private String bindPassword = "guest";
	private String sslPassword = "joe";

	private int port2 = 3333;
	
	private boolean useSsl = false;
	private boolean useProxy = true;
	private boolean useSslOnly = false;
	

	private boolean quiet = true;
	boolean ssl = true;

//	public QuickServer(){
//	    ssl = true;
//	 	 useSsl = true;
//	 	 useSslOnly = false;
//	}

	public QuickServer_9Test(Service service, int port, int bindAdress, String bindpassword, String sslpassword) {
		try {
	        String contextRoot, sslContextroot = null;
	        FileSystemManager fsm = FileSystemManager.getFileSystemManager();
	        if (fsm.exists(FileStore.SSL_ROOT_FOLDER)!= null) {
		        FileStore root = fsm.lookup(FileStore.SSL_ROOT_FOLDER);
		        contextRoot = sslContextroot = root.getPath() + File.separator;
	        }
            serverClass = new ServerClass(sslContextroot + sslContext, port);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	 	this.port = port;
		this.bindAddress = bindAdress;
		this.bindPassword = bindpassword;
		this.sslPassword = sslpassword;
	}

	public static String sslPassword = null;
	
	public void setSslPassword(String sslPassword){
		this.sslPassword = sslPassword;
	}
	
	class ServerClass implements Runnable {
	   	private static final int DEFAULT_POOL_SIZE = 2000;
		private Server