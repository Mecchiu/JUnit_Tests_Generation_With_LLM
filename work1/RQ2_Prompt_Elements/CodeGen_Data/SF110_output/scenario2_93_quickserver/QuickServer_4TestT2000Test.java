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
static QuickServer instance;
		static ArrayList<ClientConfig> configList;
		static ArrayList<QuickServerPort> portsList;
	protected void setUp() throws Exception {
		if(instance == null) {
			instance = new QuickServer();
			//instantiate the server
			instance.instance.initService();
			//initialize the config list
			configList = new ArrayList<ClientConfig>();
			//initialize the ports list
			portsList = new ArrayList<QuickServerPort>();
		}
	}
	protected void tearDown() throws Exception {
		instance.instances.clear();
		configList = null;
		portsList = null;
		instance = null;
	}
	@Test
	public void testInitService() {
		setUp();
		initServer("QuickServerConfig");
	}
	@SuppressWarnings("unchecked")
	protected <T> void testClientConfig(T in, String inIp){
		String cfgPath = "config/configFile";
		String inFile = "config/data_test";
		File cfg = new File(cfgPath);
		assertNotNull("File " + cfgPath + " not found", cfg);
		File inFile2 = new File(inFile);
		assertNotNull("File " + inFile + " not found", inFile);
		try {
			Configuration newConf = null;
			FileInputStream fis = new FileInputStream(inFile);
			fis.close();
			InputStream is = new FileInputStream(in);
			BufferedInputStream br = new BufferedInputStream(is);
			newConf = org.quickserver.config.Configuration.read(br, cfg);
			br.close();
			fis = new FileInputStream(inFile2);
			FileOutputStream fos = new FileOutputStream(inFile);
			fos.write(cfg.toCharArray());
			fos.close();
			
			is = new FileInputStream(inIp);
			String[] confs = IpAddress.getConfigs();
			