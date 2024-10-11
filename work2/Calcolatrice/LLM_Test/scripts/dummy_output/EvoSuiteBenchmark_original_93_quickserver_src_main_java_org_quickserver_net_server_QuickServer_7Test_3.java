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
		public class Client_CommandHandler extends ClientCommandHandler {
			private String text;
			public void setText(String text) {
				this.text = text;
			}
			@Override
			public void clearClient() {
				super.clearClient();
			}
			@Override
			public void sendCommand(CommandEvent event) {
				if(event.isResponse() == true) {
						this.text = event.getCommand();
					}
				super.sendCommand(event);
			}
		}
		
		class Client_CommandHandler_NIO extends ClientCommandHandler {

    	private String text;
        public void setText(String text) {
			super.setText(text);
            sendCommand(new CommandEvent(CommandEvent.EVENT_NIO_CLIENT_RESPONSE, (String)null));
        }
        @Override
        public void clearClient() {
        	super.clearClient();
        }
        @Override
        public void sendCommand(CommandEvent event) {
        	sendCommand(event);
        }
        protected void sendCommand(CommandEvent event) {
	        if(text.equals(Message.RESPONSE)) {
				if(event.isError()) {
					System.err.println("A client is asked an error");
				} else {
					System.out.println(this.displayString(event));
				}
			}
        }

    }
        
		public static void main(String args[]) throws Exception {
	        
	        Logger.getLogger(Logger.GLOBAL).setLevel(Level.WARNING);
	        
	        final Logger LOG = Logger.getLogger(Logger.GLOBAL);
	        final Formatter formatter = new Formatter() {
	            public String format(LogRecord record) {
	                return record.getMessage();
	            }
	        };
	        
	        LOG.setLevel(Level.WARNING);
	        
	        final SSLContext sslContext = SSLContext.getInstance("SSL");
	        sslContext.init(null, new TrustManager[] {new X509TrustManager()}, null);
	        
	        int port = 7777;
	        String host="127.0.0.1";
	        InetAddress localAddress = null;
}
}