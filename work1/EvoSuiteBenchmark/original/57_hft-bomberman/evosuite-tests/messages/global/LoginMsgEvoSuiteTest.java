/*
 * This file was automatically generated by EvoSuite
 */

package messages.global;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import messages.global.LoginMsg;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LoginMsgEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LoginMsg loginMsg0 = new LoginMsg("c1ptn(2F|JK3", "c1ptn(2F|JK3", 1637);
      loginMsg0.setUsername("c1ptn(2F|JK3");
      assertEquals(1637, loginMsg0.getAction());
  }

  @Test
  public void test1()  throws Throwable  {
      LoginMsg loginMsg0 = new LoginMsg(")m}", (-764));
      loginMsg0.getPassword();
      assertEquals(-764, loginMsg0.getAction());
  }

  @Test
  public void test2()  throws Throwable  {
      LoginMsg loginMsg0 = new LoginMsg(")m}", (-764));
      String string0 = loginMsg0.getUsername();
      assertNotNull(string0);
      assertEquals(-764, loginMsg0.getAction());
  }

  @Test
  public void test3()  throws Throwable  {
      LoginMsg loginMsg0 = new LoginMsg(")m}", (-764));
      loginMsg0.setAction((-764));
      assertEquals(-764, loginMsg0.getAction());
  }

  @Test
  public void test4()  throws Throwable  {
      LoginMsg loginMsg0 = new LoginMsg(")m}", (-764));
      int int0 = loginMsg0.getAction();
      assertEquals((-764), int0);
  }

  @Test
  public void test5()  throws Throwable  {
      LoginMsg loginMsg0 = new LoginMsg(")m}", (-764));
      loginMsg0.setPassword(")m}");
      assertEquals(-764, loginMsg0.getAction());
  }
}
