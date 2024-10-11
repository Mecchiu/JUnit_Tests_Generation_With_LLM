// QuickServer_2Test.java
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
* It contains one unit test case for the {@link QuickServer#getNewLine()} method.
*/
class QuickServer_2Test {
		
	public static final String testServer = "localhost";
    private static String testPort = "";
    private static volatile ServerSocket service;
    private static volatile ServerSocket serverSocket;
    private final Pool pool;
    private volatile ClientCommandHandler   cmdRead;
    private volatile ClientCommandHandler   cmdWrite;
    private volatile ClientCommandHandler   cmdAuthenticate;
    private volatile ClientCommandHandler   cmdExtData;
    private volatile ClientCommandHandler   cmdAuthentication;
    private volatile ClientCommandHandler   cmdDisconnect;
    private volatile ClientData            clientDatalist_Bin;
    private volatile ClientData            clientDatalist_String;
    private volatile ClientCommandHandler   cmdData;
    private volatile ClientCommandHandler   cmdData_String;
    private volatile ClientCommandHandler   cmdWrite_String;
    private volatile ClientData            commandHandler_WriteString;
    private volatile ClientData            commandHandler_Bin;
    private volatile ClientData            commandHandler_String;
    private volatile ClientCommandHandler   cmdDataWrite_Bin;
    private volatile ClientCommandHandler   cmdDataWrite_String;
    private volatile ClientCommandHandler   cmdWrite_String;
    
    
	public static volatile boolean doRun=false;
	public static volatile boolean running=false;
	public static volatile String testserver="";
	
	public final void start() throws Exception {
		int i;
		
		this.doRun=true;
		
		pool = new TestPool(getNewLine());
		Thread t=new Thread(pool);
		t.setName("TestClient_pool");
		t.start();
		
}
}