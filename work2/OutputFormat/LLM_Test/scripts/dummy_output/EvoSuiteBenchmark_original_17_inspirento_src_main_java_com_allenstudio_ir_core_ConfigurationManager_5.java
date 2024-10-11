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
     * Create a suite of tests.
     * @param setup the test setup
     * @return a suite of tests
     */
    @Setup
    public Test createTester1(
            @SuppressWarnings(value="unused") Setup setup) throws Exception {
        return createTester1(true);
    }
    
    
    /**
     * Create a test case from the given args.
     * @param setup the test setup
     * @return a test case
     */
    @SuppressWarnings(value="unused")
    public static Test createTester1(Setup setup) {
        return createTest(ConfigurationManagerTest.class, setup);
    }
    
}