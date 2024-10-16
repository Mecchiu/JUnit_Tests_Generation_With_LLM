/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.mfw.bundle.server.plugins.webui.availabilitypage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.mfw.bundle.server.plugins.webui.availabilitypage.ProbeDesc;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ProbeDescEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ProbeDesc probeDesc0 = new ProbeDesc((-1354L), (-1994L), "", true);
      long long0 = probeDesc0.getProbeId();
      assertEquals((-1994L), probeDesc0.getBmId());
      assertEquals(true, probeDesc0.isDisabled());
      assertEquals((-1354L), long0);
  }

  @Test
  public void test1()  throws Throwable  {
      ProbeDesc probeDesc0 = new ProbeDesc((-1354L), (-1994L), "", true);
      boolean boolean0 = probeDesc0.isDisabled();
      assertEquals((-1354L), probeDesc0.getProbeId());
      assertEquals(true, boolean0);
      assertEquals((-1994L), probeDesc0.getBmId());
  }

  @Test
  public void test2()  throws Throwable  {
      ProbeDesc probeDesc0 = new ProbeDesc((-1354L), (-1994L), "", true);
      long long0 = probeDesc0.getBmId();
      assertEquals((-1354L), probeDesc0.getProbeId());
      assertEquals((-1994L), long0);
      assertEquals(true, probeDesc0.isDisabled());
  }

  @Test
  public void test3()  throws Throwable  {
      ProbeDesc probeDesc0 = new ProbeDesc((-1354L), (-1994L), "", true);
      String string0 = probeDesc0.getName();
      assertEquals((-1994L), probeDesc0.getBmId());
      assertEquals((-1354L), probeDesc0.getProbeId());
      assertEquals(true, probeDesc0.isDisabled());
      assertNotNull(string0);
  }
}
