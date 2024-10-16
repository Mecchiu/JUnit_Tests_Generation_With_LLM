/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.webdav.methods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.webdav.WebDAVException;
import com.liferay.portal.kernel.webdav.WebDAVRequest;
import com.liferay.portal.webdav.methods.LockMethodImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LockMethodImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LockMethodImpl lockMethodImpl0 = new LockMethodImpl();
      try {
        lockMethodImpl0.process((WebDAVRequest) null);
        fail("Expecting exception: WebDAVException");
      } catch(WebDAVException e) {
        /*
         * java.lang.NullPointerException
         */
      }
  }
}
