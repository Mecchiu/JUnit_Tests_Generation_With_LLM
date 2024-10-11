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
public static class TestThread extends Thread implements NonBlockingClientHandler {
            private boolean stop;
            /**
             * The constructor.
             *
             */
            public TestThread() {
            	super("Thread for checking");
            }

            public void run() {
            	while (!this.stop) {
            		String clientMessage = new String();
            		try {
            			clientMessage = this.getMessage();
            		} catch (IOException e) {

            		}
            		Connection con = null;
            		try {
            			con = this.getConnection();
            			while (!this.stop) {
            				try {
            					int ret = con.getAcceptancePolicy().checkClientConnection(clientMessage);
            					return;
                    			} catch (IOException e) {

            					}
            				try {
            					con.setTimeOut(5000);
            				} catch (Exception e) {

            					con.setNoReply();
            					
            				}
            				try {
            					con.close();
            				} catch (Exception e) {
            				}

                			try {
                				Thread.sleep(100);
                			} catch (Exception e) {
                			}
            			}
            		}
            		catch (IOException io) {

            		} catch (InterruptedException e) {

            		}
            		finally {
            			try {
            				if (con!= null) {

            					con.close();
            				}

            			} catch (Exception e) {

            			}

            			try {
            				if (this.con!= null) {

            					Thread.sleep(50);
            				}
            			} catch (Exception e) {
            			}

            			if (this.con!= null) {

            				Thread.sleep(50);
            			}
            		}
            	}
            }
        }
}

