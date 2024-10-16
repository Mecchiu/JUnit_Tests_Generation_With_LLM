/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.documentlibrary.service.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.documentlibrary.service.http.DLFileVersionServiceSoap;
import java.rmi.RemoteException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DLFileVersionServiceSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      try {
        DLFileVersionServiceSoap.getLatestFileVersion((-185L));
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DLFileVersionServiceSoap dLFileVersionServiceSoap0 = new DLFileVersionServiceSoap();
      assertNotNull(dLFileVersionServiceSoap0);
  }

  @Test
  public void test2()  throws Throwable  {
      try {
        DLFileVersionServiceSoap.getFileVersion((-1859L));
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
