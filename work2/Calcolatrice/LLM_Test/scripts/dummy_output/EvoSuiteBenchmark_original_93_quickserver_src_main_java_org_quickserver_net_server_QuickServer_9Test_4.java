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
		
    private static final int BLOCKSIZE = 0x4000;
	public static void main(String args[]) throws IOException {
		quickServer_9Test qpv = new quickServer_9Test();
		qpv.init();
		qpv.main(args);
		//quickServer_9Test.class.getClassLoader().getResourceAsStream( "test-resources/EchoServerConfig.xml" );
	}
	
    /**
	 * Initialize all servers, set up their configuration
	 * and start them.
	 *
	 * @throws Exception Any exception that may occur. The server
	 *      exit code will be non-zero if an exception occurs.
	 */
    public void init() throws Exception
	{
		System.out.println("Initialization started");

		String xmlConf = Util.readInputs("test_resources/EchoServerConfig.xml");
                XMLReader xml = new XMLReader(xmlConf);

                ObjectInput in = xml.getObjectInput();
		Configuration conf = (Configuration) in.readObject();

		Configuration config = new Configuration(conf);

		ObjectInput inData = new XMLCharacterReader(xmlConf, new StringReader(""), XMLReader.XMLDECL_REPLACE_DOUBLE_QUOTES);
		ConfigDataReader reader = new ConfigDataReader(xml, inData);
		File f = new File("test_resources/EchoServerConfigTest.xml");

		//ConfigDataReader reader = new ConfigDataReader(new ConfigurationImpl(new File("test_samples/EchoServerConfigTest.xml" )));

		ConfigurationImpl confNoDoubleQuotes = null;
		int errors = 0;

        // read configDataReader and set up connection pool
		if (config.has("ConnectionConfig"))
		{
			ObjectPool<Connection> pool = new ObjectPool<Connection>(new ConnectionPoolConfig(conf));
			conf.setTo("ConnectionConfig", pool);
		}

}
}