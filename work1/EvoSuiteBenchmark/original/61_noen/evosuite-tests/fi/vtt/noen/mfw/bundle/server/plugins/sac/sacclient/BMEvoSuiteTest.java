/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.mfw.bundle.server.plugins.sac.sacclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.mfw.bundle.server.plugins.sac.sacclient.BM;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BMEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BM bM0 = new BM();
      bM0.isDisabled();
  }

  @Test
  public void test1()  throws Throwable  {
      BM bM0 = new BM();
      bM0.setName("");
      assertEquals(0L, bM0.getId());
  }

  @Test
  public void test2()  throws Throwable  {
      BM bM0 = new BM();
      bM0.setClazz("G4@W");
      assertEquals(0L, bM0.getId());
  }

  @Test
  public void test3()  throws Throwable  {
      BM bM0 = new BM();
      String string0 = bM0.getDescription();
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      BM bM0 = new BM();
      bM0.setId((-1229L));
      assertEquals((-1229L), bM0.getId());
  }

  @Test
  public void test5()  throws Throwable  {
      BM bM0 = new BM();
      String string0 = bM0.getClazz();
      assertNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      BM bM0 = new BM();
      Boolean boolean0 = Boolean.FALSE;
      bM0.setDisabled(boolean0);
      assertEquals(false, boolean0.booleanValue());
  }

  @Test
  public void test7()  throws Throwable  {
      BM bM0 = new BM();
      String string0 = bM0.getName();
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      BM bM0 = new BM();
      long long0 = bM0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test9()  throws Throwable  {
      BM bM0 = new BM();
      bM0.setDescription("&,77Cd^SvPO1~qsaNS");
      assertNull(bM0.getName());
  }

  @Test
  public void test10()  throws Throwable  {
      BM bM0 = new BM();
      List<Long> list0 = bM0.getDeviceId();
      List<Long> list1 = bM0.getDeviceId();
      assertSame(list1, list0);
      assertNotNull(list1);
  }
}
