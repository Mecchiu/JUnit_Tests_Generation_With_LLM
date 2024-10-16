/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.site;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.List;
import net.sf.lavalamp.site.Build;
import net.sf.lavalamp.site.Builds;
import net.sf.lavalamp.site.MissingBuildException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BuildsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Builds builds0 = new Builds();
      List<Build> list0 = builds0.getBuilds();
      assertEquals(0, list0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      Builds builds0 = new Builds();
      Build build0 = new Build("BppeN1xq0>}");
      builds0.add(build0);
      boolean boolean0 = builds0.allSuccessful();
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      Builds builds0 = new Builds();
      boolean boolean0 = builds0.allSuccessful();
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      Builds builds0 = new Builds();
      Build build0 = new Build("BppeN1xq0>}");
      builds0.add(build0);
      build0.setSuccessful(false);
      boolean boolean0 = builds0.allSuccessful();
      assertEquals(false, builds0.allSuccessful());
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      Builds builds0 = new Builds();
      Build build0 = new Build("DDJyhYBg7@iQL");
      builds0.add(build0);
      Build build1 = builds0.getBuild("DDJyhYBg7@iQL");
      assertEquals("DDJyhYBg7@iQL", build1.getIdentity());
  }

  @Test
  public void test5()  throws Throwable  {
      Builds builds0 = new Builds();
      Build build0 = new Build("DDJyhYBg7@iQL");
      builds0.add(build0);
      try {
        builds0.getBuild("");
        fail("Expecting exception: MissingBuildException");
      } catch(MissingBuildException e) {
        /*
         *  not found
         */
      }
  }
}
