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

    NonBlockingClientHandler_1Test() {
        Thread.sleep(100);
    }

    @Test
    public void getWakeupSelectorAfterRegisterRead() {
        assertTrue("nonBlockingClientHandler() doesn't call wakeupSelectorAfterRegisterRead", getWakeupSelectorAfterRegisterRead());
    }
}
