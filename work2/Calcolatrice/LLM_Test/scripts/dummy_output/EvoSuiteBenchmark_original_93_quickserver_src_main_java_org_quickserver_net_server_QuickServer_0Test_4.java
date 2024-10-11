// QuickServer_0Test.java
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
* It contains one unit test case for the {@link QuickServer#getVersion()} method.
*/
class QuickServer_0Test {
		
	public static final String QSF_ADMIN = "admin";
	

	/**
	 * Returns the version of the library.
	 */
	public static final String getVersion() {
		// TODO Auto-generated method stub
		return "1.1.4";
	}
	public final String DATAMODE;
	final static int DATAMAX_INIT_SIZE=1;


/**
* @throws Exception
* @throws InvalidProtocolBufferException
* @throws InvalidObjectException
* @throws IOException
* @throws UnknownHostException
*/
	public QuickServer_0Test() throws Exception {
		this.DATAMODE=ManagementFactory.getPlatformMBeanServer().getAttribute(ManagementFactory.MEMORY_MXBEAN_NAME);
		LoggingObjectType logger = new LoggingObjectType();
		logger.setName(ManagementFactory.MEMORY_LOGGER_NAME);
		logger.setDescription("MemLogger Object");
		final MemoryMXBean mem_mbean = ManagementFactory.newPlatformMXBeanProxy(ManagementFactory
				.getPlatformMBeanServer(), ManagementFactory.MEMORY_MXBEAN_NAME,
				MemoryMXBean.class);
		//final RuntimeMXBean rt_mbean = ManagementFactory.newPlatformMXBeanProxy(ManagementFactory
		//		.getPlatformMBeanServer(), ManagementFactory.RUNTIME_MXBEAN_NAME, RuntimeMXBean.class);
		final RuntimeMXBean rt_mbean = ManagementFactory
				.getRuntimeMXBean();
		final int mem_free_bytes0= mem_mbean.getUsed();

		//final int mem_free_bytes=rt_mbean.getHeapMemoryUsage().getMemory();
		final int mem_free_gcs0=mem_mbean.getUsage().getUsed();
		final int mem_free_heaps0=mem_mbean.getUsage().getMax();

		System.out.print(String.format("Memory: %d Bytes  [%dGB, Total: %d]\n\n",
				mem_free_bytes0,
				(mem_free_bytes0/1024)/1024,
				("Total:"+(mem_free_bytes0/(1024*1024)))/1024));
}
}