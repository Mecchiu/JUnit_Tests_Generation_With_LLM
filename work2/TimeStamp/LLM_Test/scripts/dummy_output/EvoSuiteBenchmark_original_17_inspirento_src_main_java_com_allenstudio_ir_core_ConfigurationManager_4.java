// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains one unit test case for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {
		
    /**
     * Creates an empty ConfigurationManager instance.
     */
    public ConfigurationManagerTest () {
}

@Test
    /**
     * Test method run method and gets key for the given name.
     *
     * @param  name the value name we want to get from the given configuration
     * @return the value name
     */
    public String run (String name) {
        return getProperty(name);
    }
}