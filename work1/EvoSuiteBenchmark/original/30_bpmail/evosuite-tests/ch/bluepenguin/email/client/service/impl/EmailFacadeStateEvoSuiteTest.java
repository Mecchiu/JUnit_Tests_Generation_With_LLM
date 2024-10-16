/*
 * This file was automatically generated by EvoSuite
 */

package ch.bluepenguin.email.client.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ch.bluepenguin.email.client.service.impl.EmailFacadeState;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EmailFacadeStateEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EmailFacadeState emailFacadeState0 = new EmailFacadeState();
      emailFacadeState0.clear();
      assertEquals(false, emailFacadeState0.isAllClean());
  }

  @Test
  public void test1()  throws Throwable  {
      EmailFacadeState emailFacadeState0 = new EmailFacadeState();
      Integer integer0 = new Integer(0);
      boolean boolean0 = emailFacadeState0.isDirty(integer0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      EmailFacadeState emailFacadeState0 = new EmailFacadeState();
      Integer integer0 = new Integer((-1761));
      emailFacadeState0.setState(integer0, false);
      emailFacadeState0.setAll(false);
      assertEquals(true, emailFacadeState0.isAllClean());
  }

  @Test
  public void test3()  throws Throwable  {
      EmailFacadeState emailFacadeState0 = new EmailFacadeState();
      assertEquals(false, emailFacadeState0.isAllClean());
      
      Integer integer0 = new Integer((-1761));
      emailFacadeState0.setState(integer0, false);
      boolean boolean0 = emailFacadeState0.isAllClean();
      assertEquals(true, emailFacadeState0.isAllClean());
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      EmailFacadeState emailFacadeState0 = new EmailFacadeState();
      boolean boolean0 = emailFacadeState0.isAllClean();
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      EmailFacadeState emailFacadeState0 = new EmailFacadeState();
      emailFacadeState0.setState((Integer) null, true);
      boolean boolean0 = emailFacadeState0.isAllClean();
      assertEquals(false, emailFacadeState0.isAllClean());
      assertEquals(false, boolean0);
  }
}
