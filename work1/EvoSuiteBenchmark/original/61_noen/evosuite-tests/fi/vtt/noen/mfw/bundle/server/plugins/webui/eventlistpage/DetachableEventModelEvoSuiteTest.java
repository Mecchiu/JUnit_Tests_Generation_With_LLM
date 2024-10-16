/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.mfw.bundle.server.plugins.webui.eventlistpage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.mfw.bundle.common.EventType;
import fi.vtt.noen.mfw.bundle.server.plugins.webui.eventlistpage.DetachableEventModel;
import fi.vtt.noen.mfw.bundle.server.shared.datamodel.ServerEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DetachableEventModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EventType eventType0 = EventType.PROBE_LOST;
      ServerEvent serverEvent0 = new ServerEvent(77L, eventType0, "] failed to append.", "] failed to append.", 77L);
      DetachableEventModel detachableEventModel0 = null;
      try {
        detachableEventModel0 = new DetachableEventModel(serverEvent0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class fi.vtt.noen.mfw.bundle.server.plugins.webui.eventlistpage.DetachableEventModel
         */
      }
  }
}
