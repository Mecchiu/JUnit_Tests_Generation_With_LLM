/*
 * This file was automatically generated by EvoSuite
 */

package org.firebirdsql.gds.impl.jni;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.firebirdsql.gds.impl.jni.ServiceRequestBufferImp;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ServiceRequestBufferImpEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ServiceRequestBufferImp serviceRequestBufferImp0 = new ServiceRequestBufferImp((-1886));
      serviceRequestBufferImp0.addArgument(477, "");
      byte[] byteArray0 = serviceRequestBufferImp0.toByteArray();
      assertNotNull(byteArray0);
  }
}
