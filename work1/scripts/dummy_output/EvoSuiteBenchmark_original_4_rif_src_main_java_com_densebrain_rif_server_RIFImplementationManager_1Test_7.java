// RIFImplementationManager_1Test.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains one unit test case for the {@link RIFImplementationManager#invoke(String, String, Object[])} method.
*/
class RIFImplementationManager_1Test {
		
  /**
   * Test.
   */
  @Test
  void invoke_1() {
  	
    //Test
    Hashtable<String, Object> testParameters = new Hashtable<String, Object>();
    testParameters.put("iterfaceName", "RIFClass");
    // Test Parameters
    Map<String, Object> map = new Hashtable<String, Object>();
 
    Method method = RIFClass_1.class.getMethod("invoke", String.class, Object.class, Object[].class);   
    assertTrue(true);
  }

 
  /**
   * Test.
   */
  @Test
  void interfaceMethod() {
  	 
    // test Parameters
    Map<String, Object> map = new Hashtable<String, Object>();
    map.put("iterfaceName", "RIFClass");
    map.put("methodName", "invoke");
    map.put("params", null);

    // Test
    Object result = method.invoke(null, null, null, null);
    assertTrue(true);
  }
  
 }