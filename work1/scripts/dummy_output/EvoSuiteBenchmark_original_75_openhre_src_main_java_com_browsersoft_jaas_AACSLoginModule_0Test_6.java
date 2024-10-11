// AACSLoginModule_0Test.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AACSLoginModule}.
* It contains one unit test case for the {@link AACSLoginModule#login()} method.
*/
class AACSLoginModule_0Test {
		
    /**
     * Test case method which tests the operation logged in with valid params.
     */
    @Test
    public void validConfigurationTest() {

        // Call the setLoginModule method of this LoginModule
        org.junit.jupiter.api.TestInstance.invokeMethod("setLoginModule",
                new Class [] { Boolean.class }, new Object [] { true });        

        // Check the outcome of the operation
        assertEquals("FAIL", LoginModuleTestHelper.getOutcome());
        
    }    

    /**
     * Test case method which tests the operation logged in with null params.
     */
    @Test
    public void nullConfigurationTest() {

        // Call the setLoginModule method of this LoginModule
        org.junit.jupiter.api.TestInstance.invokeMethod("setLoginModule",
                new Class [] { }, new Object [] { null });        

        // Check the outcome of the operation
        assertEquals("FAIL", LoginModuleTestHelper.getOutcome());

    }    

    /**
     * Test case method which tests the operation logged in with valid params
     * without a propery called "debug".
     */
    @Test
    public void noDebugParameter_1Test() {

        // Call the setLoginModule method of this LoginModule
        org.junit.jupiter.api.TestInstance.invokeMethod("setLoginModule",
                new Class [] { Boolean.class }, new Object [] { true });        

        // Check the outcome of the operation
        assertEquals("FAIL", LoginModuleTestHelper.getOutcome());

    }    

    /**
     * Test case method which tests the operation logged in with null params
     * without a propery called "debug".
     */
    @Test
    public void noDebugParameter_2Test() {

        // Call the setLoginModule method of this LoginModule
        org.junit.jupiter.api.TestInstance.invokeMethod("setLoginModule",
                new Class [] { Boolean.class }, new Object [] { false });        

        // Check the outcome of the operation
        assertEquals("FAIL", LoginModuleTestHelper.getOutcome());

    }

}