/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.journal.service.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.journal.service.http.JournalTemplateServiceSoap;
import java.rmi.RemoteException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JournalTemplateServiceSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[6];
      ServiceContext serviceContext0 = new ServiceContext();
      try {
        JournalTemplateServiceSoap.updateTemplate((-1L), "", "", stringArray0, stringArray0, stringArray0, stringArray0, "", true, "", true, serviceContext0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      long[] longArray0 = new long[10];
      try {
        JournalTemplateServiceSoap.searchCount(0L, longArray0, "I8HpM+", "I8HpM+", "I8HpM+", "I8HpM+", "I8HpM+", false);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      try {
        JournalTemplateServiceSoap.getStructureTemplates((-1372L), "");
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[8];
      ServiceContext serviceContext0 = new ServiceContext();
      try {
        JournalTemplateServiceSoap.addTemplate(1320L, "", true, "", stringArray0, stringArray0, stringArray0, stringArray0, "", true, "", true, serviceContext0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      long[] longArray0 = new long[5];
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator(true);
      try {
        JournalTemplateServiceSoap.search((-937L), longArray0, "", "", "", 0, (-1539), (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      JournalTemplateServiceSoap journalTemplateServiceSoap0 = new JournalTemplateServiceSoap();
      assertNotNull(journalTemplateServiceSoap0);
  }

  @Test
  public void test6()  throws Throwable  {
      long[] longArray0 = new long[9];
      try {
        JournalTemplateServiceSoap.searchCount(0L, longArray0, "CveB#", "CveB#", "CveB#");
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      try {
        JournalTemplateServiceSoap.copyTemplate(0L, "colorSchemeId", "colorSchemeId", true);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      long[] longArray0 = new long[5];
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      try {
        JournalTemplateServiceSoap.search(1L, longArray0, "2P", "2P", "2P", "2P", "2P", true, (-437), (-437), (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      try {
        JournalTemplateServiceSoap.getTemplate(0L, "p");
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      try {
        JournalTemplateServiceSoap.deleteTemplate(1L, "");
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
