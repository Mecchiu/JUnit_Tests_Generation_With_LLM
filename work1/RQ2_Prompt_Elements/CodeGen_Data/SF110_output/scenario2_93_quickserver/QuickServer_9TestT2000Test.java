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
/**
		* @since 1.2
		*/
	public static class ClientBinaryHandler extends ClientHandler<BinaryData> {
		/**
		* @since 1.2
		*/
		public void handleData(ClientEvent event) {
			byte[] buffer = event.getBuffer();
			sendCommand(buffer, 1, buffer.length);
		}
	}
	
	/**
	*
	* @since 1.2
	*/
	public static class ClientCommandHandler implements ClientEventHandler<QuickCommand<BinaryData>>, ClientObjectHandler {
		public static final ClientCommandHandler instance = new ClientCommandHandler();
		private int sendLen;
		private int timeout;
		private ArrayList listener = new ArrayList();

		/**
		* Constructor to be inherited by sub classes.
		*/
		public ClientCommandHandler() {
		}

		/**
		*
		* @since 1.2
		*/
		public QuickCommand<BinaryData> getPayload() {
			return new QuickCommand<BinaryData>(false, false);
		}

		/**
		*
		* @since 1.2
		*/
		public void setTimeout(int timeout) {
			this.timeout = timeout;
		}

		/**
		* This method is called by the service after client connection.
		*
		* @since 1.2
		*/
		public void afterConnection(ClientEvent event) throws AppException {
			quickServiceError = null;
			sendData();
		}

		/**
		*
		* @since 1.2
		*/
		public void beforeServerClose() {
		}

		/**
		*
		* @since 1.2
		*/
		public ClientMessage<BinaryData> getClientMessage() {
			return null;
		}

		/**
		*
		* @since 1.2
		*/
		public synchronized void send(BinaryData buffer, int ack) {
			sendLen += buffer.length;
			if (sendLen > timeout) {
				throw new AppException("ClientHandler timeout"   + sendLen + " > 0!!");