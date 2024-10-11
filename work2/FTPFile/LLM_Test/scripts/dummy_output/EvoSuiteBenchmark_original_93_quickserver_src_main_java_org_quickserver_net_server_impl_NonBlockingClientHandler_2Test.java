// NonBlockingClientHandler_2Test.java
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
* It contains ten unit test cases for the {@link NonBlockingClientHandler#getMaxThreadAccessCount()} method.
*/
class NonBlockingClientHandler_2Test {
		@Test
void testGetMaxThreadAccessCount() {
    NonBlockingClientHandler handler = new NonBlockingClientHandler();
    
    // Test case 1: Default value
    assertEquals(5, handler.getMaxThreadAccessCount());
    
    // Test case 2: Set to a specific value
    NonBlockingClientHandler.setMaxThreadAccessCount(10);
    assertEquals(10, handler.getMaxThreadAccessCount());
    
    // Test case 3: Set to a negative value
    assertThrows(IllegalArgumentException.class, () -> {
        NonBlockingClientHandler.setMaxThreadAccessCount(-1);
    });
    
    // Test case 4: Set to a value less than 3
    assertThrows(IllegalArgumentException.class, () -> {
        NonBlockingClientHandler.setMaxThreadAccessCount(2);
    });
    
    // Test case 5: Set back to default value
    NonBlockingClientHandler.setMaxThreadAccessCount(5);
    assertEquals(5, handler.getMaxThreadAccessCount());
}
}