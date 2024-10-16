/*
 * This file was automatically generated by EvoSuite
 */

package macaw.presentationLayer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.HeadlessException;
import macaw.presentationLayer.OntologyTermsPanel;
import macaw.system.SessionProperties;
import macaw.util.DisplayableListParentForm;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OntologyTermsPanelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      OntologyTermsPanel ontologyTermsPanel0 = null;
      try {
        ontologyTermsPanel0 = new OntologyTermsPanel(sessionProperties0, (DisplayableListParentForm) null, true);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }
}
