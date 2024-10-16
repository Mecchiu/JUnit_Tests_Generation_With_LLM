/*
 * This file was automatically generated by EvoSuite
 */

package messages.global;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import messages.global.ParticipantInfo;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ParticipantInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ParticipantInfo participantInfo0 = new ParticipantInfo(1489, "");
      String string0 = participantInfo0.getName();
      assertEquals(1489, participantInfo0.getId());
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ParticipantInfo participantInfo0 = new ParticipantInfo(1489, "");
      int int0 = participantInfo0.getId();
      assertEquals(1489, int0);
  }
}
