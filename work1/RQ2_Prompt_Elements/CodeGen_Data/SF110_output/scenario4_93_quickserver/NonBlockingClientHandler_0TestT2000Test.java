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

    protected SocketChannel socketChannel;
    
    public NonBlockingClientHandler_0Test() {
    }

    

    protected void doClientHandler() throws Exception;

    protected boolean closeIfSSLInboundDone() throws Exception;

    protected boolean closeIfSSLOutboundDone() throws Exception;    

    public void prepareClientHandlerForCloseAfterRead() throws Exception;

    protected void setInitialHandshakeStatus() {
    }

    protected void setDataModeNonBlocking(DataMode dataMode) throws IOException {
    }

    protected void setInitialHandshakeStatus() {
    }

    protected void processGotDataInBuffers() throws AppException {
    }

    protected void processData() throws Exception {
    }

    protected void setSocketChannel(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }    
    
    
    protected void setInputStream(InputStream in) throws IOException {
        //do nothing
    }

    protected boolean checkReturnClientHandler() {
        return true;
    }
    
    protected void setClientWriteHandler(ClientWriteHandler clientWriteHandler) {
    }

    public void setDataMode(DataMode dataMode, DataType dataType) throws IOException {
        InputStream in = dataType.getInputStream();
        OutputStream out = dataType.getOutputStream();
        DataMode realDataMode = dataType.getClientDataMode(realData);

        if(realDataMode == in == null || realDataMode == out == null) {
            throw new IllegalStateException("Data mode can only be set when stream or channel is assigned");
        }
        
        if(!realDataType.isStream(realDataMode)) {
            throw new IllegalStateException("Client data mode can only be set when stream or channel is assigned");
        }
        
        this.socketChannel = null;
        socketChannel = clientWriteHandler.createClientChannel(dataType, in, out);
    }

    //v1.4.10

    protected void set