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
		QuickServer_4Test() {
    }
}

/*
 *
 *
 *
 */
@SuppressWarnings("serial")
class QuickServerImpl implements QuickServer {

	String myServerName = "QuickServer Test";
	private String qsHostAddr = "192.168.100.100";
	private int qsPort = 2550;

	List clients = new LinkedList();
	List myClients = new LinkedList();

	public synchronized boolean add(Object clt) {
		try {
			clt = clt.getClass();
		}
		catch (ClassCastException e) {
			return false;
		}

		add(clt);

		return true;
	}

	public synchronized boolean add(Class<?> clt) {
		if (Cloneable.class.isAssignableFrom(clt)) {
			return add(((Cloneable) clt).createNew());
		}

		return false;
	}

	@Override
	public synchronized boolean add(InputStream is) {
		try {
			is = new BufferedInputStream(is);
			StringBuilder sb = new StringBuilder();
			byte[] b = new byte[1023];

			int lengthByte = is.read(b);

			while (lengthByte > 0) {
				sb.append(new String(b, 0, lengthByte));
				lengthByte = is.read(b);
			}

			return add(sb.toString());
		}
		finally {
			is.close();
		}
	}

	@Override
	public synchronized boolean add(String text) {
		if (text == null || text.isEmpty()) {
			return false;
		}

		StringTokenizer tokenizer = new StringTokenizer(text, "!");

		LinkedList<Object> list = new LinkedList<Object>();

		while (tokenizer.hasMoreTokens()) {
			list.add(tokenizer.nextToken());
		}

		if (!contains(list, myClients)) {
			add(list);

			return true;
		}

		return false;
	}

	@Override
	public synchronized boolean add(Iterable<Object> list) {
		if (list == null) {
			return false;
		}

}
}