/*
 * This file was automatically generated by EvoSuite
 */

package simulator.MOA;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import jade.lang.acl.MessageTemplate;
import org.junit.BeforeClass;
import simulator.MOA.MetOfficeAgent;

@RunWith(EvoSuiteRunner.class)
public class MetOfficeAgentEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MetOfficeAgent metOfficeAgent0 = new MetOfficeAgent();
      MessageTemplate messageTemplate0 = MessageTemplate.MatchProtocol("");
      MetOfficeAgent.BehaviourReplyMetDataQuery metOfficeAgent_BehaviourReplyMetDataQuery0 = metOfficeAgent0.new BehaviourReplyMetDataQuery(metOfficeAgent0, messageTemplate0);
      assertEquals(false, metOfficeAgent_BehaviourReplyMetDataQuery0.sentAgree);
  }
}
