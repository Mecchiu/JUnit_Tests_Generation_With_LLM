// RIFManagerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains one unit test case for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactoryTest {

	@Test
	public void testGetManager() throws RemoteException {
		Hashtable environment = new Hashtable();
		env.put("JVM_NAME", "rif.rifi.tests.RIFManagerFactoryTest");
		env.put("JVM_ROOT", "/usr/local/");

		if (env.get("JVM_NAME") == null) {
			env.put("JVM_NAME", "bin");
		}			
		env.put("JVM_PARAM", "JVM_ROOT,jvm=java.net.ProtocolFamily.IPv6Address,udp=1");
		env.put("RIF_URL", "http://localhost:8080/rifserver-tests/RIFManagerFactoryTest");
		
		RIFManagerFactory factory = getInstance(); 
		assertTrue(factory.getManager(environment) instanceof RIFManager);
	}


	@Test
	public void testGetInvoker() throws RemoteException {
		Hashtable environment = new Hashtable();
		environment.put("JVM_NAME", "rif.rifi.tests.RIFManagerFactoryTest");
		environment.put("JVM_ROOT", "/usr/local/");

		if (environment.get("JVM_NAME") == null) {
			environment.put("JVM_NAME", "bin");
		}			
		environment.put("JVM_PARAM", "JVM_ROOT,jvm=java.net.ProtocolFamily.IPv6Address,udp=1");
		environment.put("RIF_URL", "http://localhost:8080/rifserver-tests/RIFManagerFactoryTest");
		
		RIFManagerFactory factory = getInstance(); 
		assertTrue(factory.getInvoker(environment) instanceof RIFInvoker);
	}


	@Test
	public void testGetManager() throws RemoteException, RemoteException, RemoteException {
		Hashtable environment = new Hashtable();

		environment.put("JVM_NAME", "rif.rifi.tests.RIFManagerFactoryTest");
		environment.put("JVM_ROOT", "/usr/local/");


		environment.put("JVM_PARAM", "JVM_ROOT,jvm=java.net.ProtocolFamily.IPv6Address,udp=1");
		environment.put("RIF_URL", "http://localhost:8080/rifserver-tests/RIFManagerFactoryTest");
		
		RIFManagerFactory factory = getInstance();
		assertTrue(factory.getManager(environment) instanceof RIFManager);
	}


	@Test
	public void testGetInvokeServer() throws RemoteException {
		Hashtable environment = new Hashtable();

		environment.put("JVM_NAME", "rif.rifi.tests.RIFManagerFactoryTest");
		environment.put("JVM_ROOT", "/usr/local/");


		environment.put("JVM_PARAM", "JVM_ROOT,jvm=java.net.ProtocolFamily.IPv6Address,udp=1");
		environment.put("RIF_URL", "http://localhost:8080/rifserver-tests/RIFManagerFactoryTest");
		
		RIFManagerFactory factory = getInstance();
		assertTrue(factory.getInvokeServer(environment) instanceof RIFInvoker);
	}


	@Test
	public void testGetImpl() throws RemoteException {
		Hashtable environment = new Hashtable();
		environment.put("JVM_NAME", "rif.rifi.tests.RIFManagerFactoryTest");
		environment.put("JVM_ROOT", "/usr/local/");


		if (environment.get("JVM_NAME") == null) {
			environment.put("JVM_NAME", "bin");
		}			
		environment.put("JVM_PARAM", "JVM_ROOT,jvm=java.net.ProtocolFamily.IPv6Address,udp=1");
		environment.put("RIF_URL", "http://localhost:8080/rifserver-tests/RIFManagerFactoryTest");

		RIFManagerFactory factory = getInstance();

		Hashtable implEnv	= new Hashtable();
			implEnv.put("IMPLEMENTATION", "java.lang.Object");
		assertTrue(factory.getImpl(implEnv));
		implEnv.put("IMPLEMENTATION", "java.lang.Runnable");
		assertTrue(factory.getImpl(implEnv));
	}

}