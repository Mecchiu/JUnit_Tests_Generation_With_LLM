// QuickServer_13Test.java
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
* It contains one unit test case for the {@link QuickServer#getPID()} method.
*/
class QuickServer_13Test {
		
	private static final String CLASS_NAME_PREFIX = "Echo";
	private static final String CLASS_SUFFIX = ".Echo";
	
	private static final boolean DEBUG = LoggerManager.getLoggerManager().log.contains("debug");
	private static final boolean TRACE = LoggerManager.getLoggerManager().log.contains("trace");
	private static final String CLASS_NAMES = "Echo";
	private static final String CLASS_NAMES_PREFIX = "Echo.";
	private static final boolean IS_DEBUG = DEBUG;
	private static final boolean IS_TRACE = TRACE;
	
	private static String COMMAND_HANDLER = "EchoCommandHandler";
	
	private static String COMMAND_HANDLER_INPUT= "input";
	private static String COMMAND_HANDLER_OUTPUT= "output";

	
    private QuickServer_13Test(){} 

    @Test
	public void test() throws Exception{
    	
    	QuickServer_13Test.class.getSimpleName();
    	
    	if(IS_DEBUG){
    		System.setProperty("javax.net.ssl.trustStore", "/root/.ssh/id_dsa.pem");
    		System.setProperty("javax.net.ssl.trustStorePassword", "");
    	}
    	
		CommandLine cmd = new CommandLine(COMMAND_HANDLER, 1);
		Echo Server = new EchoServer();
		EchoServer.setPID(Server.getPID());
		EchoServer.setDataMode(DataMode.String);
		EchoServer.setDataMode(CommandMode.Input);
		EchoServer.setClone(true);
		
		CommandLine cmd2 = new CommandLine(EchoServer, CommandMode.Output, 1);
        cmd2.setPID(Server.getPID());
		EchoServer.setCommandLineHandler("output");
		EchoServer.setCommandLineHandler("input");
        cmd2.setPID(Server.getPID());
		EchoServer.setCommandLineHandler("output");
		EchoServer.setCommandLineHandler("input");
		EchoServer.setClone(false);;
	
    	System.exit(ClientProxy.run(cmd));
    	
}
}