// QuickServer_7Test.java
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
* It contains one unit test case for the {@link QuickServer#suspendService()} method.
*/
class QuickServer_7Test {
		
  
	private String dataModeDefault ;
	private String name ;

    
    public QuickServer_7Test(String name) {
    	this.name = name;
    	this.dataModeDefault = SecurityPool.getDataMode();
    }

    
    public void setDataMode() {
    	if(this.dataModeDefault == SecurityPool.DataMode.String)
    		this.dataModeDefault = System.getProperty("security.mode") ;
    	else
    		this.dataModeDefault = SecurityPool.DataMode.DataMode.Client;
    }



 




    String createServer() throws UnknownHostException, IOException {
	ProxyConnectionMgr cMgr = new ProxyConnectionMgr();
	ProxyServer pServer = cMgr.createProxyServer(this.dataModeDefault);
	return (String)pServer.getProxyCommandHandling();
    }
    String getDefaultServer() {
	return (String) SecurityPool.getProxyCommandHandling();
    }

    
    void setServer(int value, long duration)  throws IOException, UnknownHostException {
    	cMgr = new ProxyConnectionMgr();
    }

    
    void checkServerOK(String value, long duration) throws UnknownHostException, IOException {
		cMgr = new ProxyConnectionMgr();
		if(!(value.equals(this.getDefaultServer())) )
			throw new Exception("Server check failed for "+this.getDataMode(), "Server failure", value);
		ServerInfoServer infoServer = (ServerInfoServer)(cMgr.getProxyCommandHandling());
        infoServer.updateServerOK(value, duration);
    }
    
    
    void setName(String value) {
    	this.name = value ;
    }
    
    String getDefaultServer() {
	return this.name ;
    }
    
    
    void runTests() throws Exception {
        String serverString = createServer();
        
        System.out.println("### Create server ###");
        System.out.println("Sleeping forever for server to be ready");
        Security.loginAs(serverString, "admin", "admin", serverString);
        new ServerSetup().setDataMode(this.dataModeDefault);
	Thread.sleep(5*1000);
        
}
}