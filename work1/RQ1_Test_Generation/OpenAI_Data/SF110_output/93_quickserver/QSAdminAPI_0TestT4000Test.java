// QSAdminAPI_0Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPI_0Test {

	private static final Logger logger = Logger.getLogger(QSAdminAPI_0Test.class.getName());
	
	private static final String host = "127.0.0.1";
	private static final int port = 9080;
	private static final String username = "Admin";
	private static final String password = "QsAdm1n";
	
	private static final String[] commands = {
		"info server",
		"info clients",
		"info clients all",
		"info clients all detail",
		"info clients all detail xml",
		"info clients all detail xml",
		"info clients all detail xml",
		"info clients all detail xml",
		"info clients all detail xml",
		"info clients all detail xml"
	};
	
	private static final String[] responses = {
		"+OK info follows\r\n" +
		"Server Name: QuickServer\r\n" +
		"Server Version: 1.4.5\r\n" +
		"Server Build: 201502211500\r\n" +
		"Server Started: Thu Feb 26 16:00:00 IST 2015\r\n" +
		"Server Uptime: 0 days, 0 hours, 0 minutes, 0 seconds\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: QuickServer is a Java based server designed to provide a quick and easy way to set up a TCP server.\r\n" +
		"Server Info: