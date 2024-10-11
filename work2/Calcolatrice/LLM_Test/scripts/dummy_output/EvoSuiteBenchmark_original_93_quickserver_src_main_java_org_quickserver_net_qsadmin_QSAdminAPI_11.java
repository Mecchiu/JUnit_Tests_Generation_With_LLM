// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains one unit test case for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {
		// Set for logging calls

        static final Logger mylog = Logger.getLogger(QSAdminAPITest.class.getName());
		private static final int port=8880;
		private static final String host="127.0.0.1";
		private static final int protocol=2;
		private static QSAdminServer qsAdmin;

		void initServer(int port);

		void testLogon(int port,int protocol,String username,String password);
		//void testLogon(String[] arguments, String user, String pass);

		String echoStr(String in);

		QSAdminServer getInstance();

        String logoff();
}