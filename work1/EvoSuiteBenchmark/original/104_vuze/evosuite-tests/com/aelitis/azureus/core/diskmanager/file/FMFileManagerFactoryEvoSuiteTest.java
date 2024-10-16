/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.diskmanager.file;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.diskmanager.file.FMFileManagerFactory;
import com.aelitis.azureus.core.diskmanager.file.impl.FMFileManagerImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FMFileManagerFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FMFileManagerFactory fMFileManagerFactory0 = new FMFileManagerFactory();
      assertNotNull(fMFileManagerFactory0);
  }

  @Test
  public void test1()  throws Throwable  {
      FMFileManagerImpl fMFileManagerImpl0 = (FMFileManagerImpl)FMFileManagerFactory.getSingleton();
      assertNotNull(fMFileManagerImpl0);
  }
}
