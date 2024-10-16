/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.model.VirtualHost;
import com.liferay.portal.model.VirtualHostSoap;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class VirtualHostSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      VirtualHostSoap virtualHostSoap0 = new VirtualHostSoap();
      virtualHostSoap0.setHostname((String) null);
      assertEquals(0L, virtualHostSoap0.getVirtualHostId());
  }

  @Test
  public void test1()  throws Throwable  {
      VirtualHostSoap virtualHostSoap0 = new VirtualHostSoap();
      virtualHostSoap0.setLayoutSetId(0L);
      assertEquals(0L, virtualHostSoap0.getVirtualHostId());
  }

  @Test
  public void test2()  throws Throwable  {
      VirtualHostSoap virtualHostSoap0 = new VirtualHostSoap();
      virtualHostSoap0.setCompanyId(0L);
      assertNull(virtualHostSoap0.getHostname());
  }

  @Test
  public void test3()  throws Throwable  {
      VirtualHostSoap virtualHostSoap0 = new VirtualHostSoap();
      long long0 = virtualHostSoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test4()  throws Throwable  {
      VirtualHostSoap virtualHostSoap0 = new VirtualHostSoap();
      virtualHostSoap0.setPrimaryKey(0L);
      assertNull(virtualHostSoap0.getHostname());
  }

  @Test
  public void test5()  throws Throwable  {
      VirtualHostSoap virtualHostSoap0 = new VirtualHostSoap();
      String string0 = virtualHostSoap0.getHostname();
      assertNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      VirtualHostSoap virtualHostSoap0 = new VirtualHostSoap();
      long long0 = virtualHostSoap0.getVirtualHostId();
      assertEquals(0L, long0);
  }

  @Test
  public void test7()  throws Throwable  {
      LinkedList<VirtualHost> linkedList0 = new LinkedList<VirtualHost>();
      linkedList0.add((VirtualHost) null);
      // Undeclared exception!
      try {
        VirtualHostSoap.toSoapModels((List<VirtualHost>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      VirtualHostSoap virtualHostSoap0 = new VirtualHostSoap();
      long long0 = virtualHostSoap0.getLayoutSetId();
      assertEquals(0L, long0);
  }

  @Test
  public void test9()  throws Throwable  {
      VirtualHostSoap virtualHostSoap0 = new VirtualHostSoap();
      long long0 = virtualHostSoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test10()  throws Throwable  {
      VirtualHost[][] virtualHostArray0 = new VirtualHost[15][8];
      // Undeclared exception!
      try {
        VirtualHostSoap.toSoapModels(virtualHostArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      LinkedList<VirtualHost> linkedList0 = new LinkedList<VirtualHost>();
      VirtualHostSoap[] virtualHostSoapArray0 = VirtualHostSoap.toSoapModels((List<VirtualHost>) linkedList0);
      assertNotNull(virtualHostSoapArray0);
  }
}
