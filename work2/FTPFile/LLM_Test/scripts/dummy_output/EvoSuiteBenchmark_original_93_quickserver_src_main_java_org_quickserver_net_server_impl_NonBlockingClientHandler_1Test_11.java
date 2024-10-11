// NonBlockingClientHandler_1Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterRead()} method.
*/
class NonBlockingClientHandler_1Test {
		
    boolean getWakeupSelectorAfterRegisterWrite(SSLEngine sslEngine);

    /**
     * Returns wakeupSelectorAfterRegisterWrite.
     * @return true if wakeupSelectorAfterRegisterWrite is set, false if not set
     */
    public boolean getWakeupSelectorAfterRegisterWrite();

     Boolean getInitialHandshakeStatus(SSLEngine sslEngine);
        
	/**
	 * Returns initialHandshakeStatus.
	 * @return true if initialHandshakeStatus is set, false if not set
	 */
	public Boolean getInitialHandshakeStatus();
	
	/**
	 * Returns false if initialize is not complete.
	 * @return value
	 */
	public boolean getInitialHandshakeStatus();

	public String getClassName();

	public String getMethodName();

	public Client read();

	public Client write();

	public byte[] readInputStream();

	public void write();

	public ByteBuffer encrypt(Client client, ByteBuffer src, ByteBuffer target, ByteBuffer options) throws IOException;

	public void finishInitialHandshake(SSLEngine engine, ByteBuffer src, ByteBuffer target, ByteBuffer options, boolean sslClose) throws Exception;

	public void handleInput(SSLEngine engine, ByteBuffer src, ByteBuffer target, ByteBuffer options, boolean sslClose) throws Exception;
}