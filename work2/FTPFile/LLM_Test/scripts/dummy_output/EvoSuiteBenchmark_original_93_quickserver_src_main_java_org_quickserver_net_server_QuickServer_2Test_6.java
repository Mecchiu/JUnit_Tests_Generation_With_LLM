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
		
	private static final int DEFAULT_PORT = 4122;
	private static final int PORT = 0;
	private static final String CUSTOM_KEY = "EchoServer_Test";
	protected ObjectPool<Object> pool1 = new KeyedObjectPool<Object>(CUSTOM_KEY, 1);
	protected ThreadLocal<Boolean> isConnected = new ThreadLocal<Boolean>() {
		protected Boolean initialValue() {
			return false;
		}
	};
	protected ThreadLocal<Boolean> isClientConnected = new ThreadLocal<Boolean>() {
		protected Boolean initialValue() {
			return true;
		}
	};
	
	public static void main(String args[]) {
	}

	private static class KeyedObjectPool<T> extends KeyedObjectPool<T> {
  	public KeyedObjectPool(String name, int maxSize) {
  		super(name, new MyConstantPool(maxSize), maxSize);
	    setInitialCapacity(MyObjectPool.defaultInitialCapacity);
	    setMaximumCapacity(MyObjectPool.defaultMaximumCapacity);
	  }
  	}
  
	private static class MyConstantPool extends PoolableObjectFactory<Object> {
}
}