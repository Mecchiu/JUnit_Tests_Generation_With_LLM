/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.events;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.events.AddDefaultDocumentLibraryStructuresAction;
import com.liferay.portal.service.ServiceContext;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BaseDefaultDDMStructureActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AddDefaultDocumentLibraryStructuresAction addDefaultDocumentLibraryStructuresAction0 = new AddDefaultDocumentLibraryStructuresAction();
      ServiceContext serviceContext0 = new ServiceContext();
      try {
        addDefaultDocumentLibraryStructuresAction0.addDDMStructures(0L, 0L, 0L, (String) null, serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
