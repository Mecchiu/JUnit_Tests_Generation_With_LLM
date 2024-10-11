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
		private static final String TICKET_TYPE = "http://www.ticketsource.org/ticketsource/ticket/12345.jsp";
        private static final String TICKET_ID = "12345";
        private static final String USER_ID = null;

        private static final String ROOM_PASS = "q2";
        private static final String ROOM_ID = "1-roomid-1"; // 1;
        private static final String TUPLES_PASS = "q3";

        private ProxyServer myServer = null;
        private String serverName = "ServerName";
        private String hostName = "hostName";
        private int portNumber = 9999;
        private volatile ServerSocket server;
        private volatile boolean isClosed;
        private volatile boolean isOpen;

        public String getServerName() {
            return this.serverName;
        }

        public String getHostName() {
            return this.hostName;
        }

        public int getPortNumber() {
            return this.portNumber;
        }

        public ProxyServer getMyServer() {
            return this.myServer;
        }

        public int getPort() {
            return this.portNumber;
        }

        public String getTicket(String resourceName){
            return this.myServer.getFile(resourceName).toString();
        }

        public String getRoomID(){
            return this.getTicket(TICKET_ID);
        }

        public String getRoomPassword(){
            return this.getTicket(ROOM_PASS);
        }

        public String getRoomName(){
            return this.getTicket(ROOM_ID);
        }

        public String getTuples(String resourceName){
            return this.getTicket(TUPLES_PASS);
        }

        public boolean getTicketType(String resourceName, List <String> ticketType){
            return this.getTicket(TICKET_TYPE + resourceName).equals("true");
        }

        public boolean getTicketReadyFlag(String resourceName, List <String> ticketType){
            return this.getTicket(Ticket_ID + resourceName).equals("true");
        }

        public boolean getTicketReadyFlag(String resourceName){
            return this.getTicketReadyFlag(resourceName, Collections.EMPTY_LIST);
        }

}