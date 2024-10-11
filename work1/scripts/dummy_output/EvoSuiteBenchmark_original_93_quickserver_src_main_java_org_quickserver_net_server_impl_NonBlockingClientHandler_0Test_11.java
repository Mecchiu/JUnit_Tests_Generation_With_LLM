// NonBlockingClientHandler_0Test.java
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
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterWrite()} method.
*/
class NonBlockingClientHandler_0Test {
		//---------------- CONSTRUCTORS ----------------//
    private  NonBlockingClientHandler_0Test(ClientThread clientThread) {
    }
    
	//----------------- PROPERTIES ------------------//

    //------------------ METHODS ----------------//
    public void threadAccessCount(int newValue) {
        threadAccessCount = newValue;
    }

    public int threadAccessCount() {
        return threadAccessCount;
    }

    public BasicTcpServer newClientThread(int instanceCount) {
        ClientThread clientThread = new ClientThread(instanceCount);
        clientThread.setProtocol(ClientProtocol.class);
        return clientThread;
    }

    public boolean willReturn() {
        return willReturn;
    }

    public boolean isWakeupSelectorAfterRegisterWrite() {
        return wakeupSelectorAfterRegisterWrite;
    }

    public boolean getInitialHandshakeStatus() {
        return initialHandshakeStatus;
    }

    public boolean willReturnClientHandler() {
        return willReturnClientHandler;
    }

    public void threadAccessCount(int newValue, int newValue2) {
        threadAccessCount = newValue;
        threadAccessCount = newValue2;
    }

    public int threadAccessCount() {
        return threadAccessCount;
    }
}