// QuickServer_4Test.java
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
* It contains one unit test case for the {@link QuickServer#initService(QuickServerConfig)} method.
*/
class QuickServer_4Test {
		
	QuickServer _source;
	String _serverURL;
	QuickServerConfig _qsConfig;
	
	/**
	 * @param args
	 */
    public QuickServer_4Test(String args) {
        _serverURL = "127.0.0.1";
        _source = new QuickServer();
        initService(_qsConfig=new QuickServerConfig().importXmlResource(args).setServerURL(_serverURL));
    }

	@Test
	public void test() throws Exception {
	       if (_serverURL.length()<5) {
	             fail("Need a quick server for quick server - please set up Quickserver with --url");
	       }
	       
		try (final Socket soc = new Socket(_serverURL, 54565))
		{
                try {
					String s = sendRequest("QUICK_SERVER.CGI");
					System.out.println("server.cgi.response=" + s);
                    Thread.sleep(2000);
                    soc.close();
                } catch (Exception e) {
					System.out.println("Exception in creating socket" + e);
				}
        	}
        
	}

	private String sendRequest(final String cmd) throws Exception {
		StringBuilder body="";
		body+="<?xml version=\"1.0\" encoding=\"UTF-8\"?><RequestType><Command type=\"EchoCommandHandler\" actionClient=\"client"+cmd+"\"/>";
		body+="<Query><Command type=\"GetAvailableCmdIds\" actionClient=\"getAvailableCmdIdsHandler\"/>";
		body+="<Command type=\"GetCmdResult\" actionClient=\"getCmdResultHandler\"/>"+
				"</Query>";
		body+="</RequestType>";
		return send(0, body.toString());
	}
    
    private native String send(int timeout, String req) throws IOException;
   
    private class ServerWorker
		extends Thread {
            protected void run() {
				try {                          
					_source.setPort(4560);
					_source.run();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
    }
    public static void main (String[] args) {
}
}