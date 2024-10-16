/*
 * This file was automatically generated by EvoSuite
 */

package corina.browser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import corina.browser.Summary;
import corina.util.GreedyProgressMonitor;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JPasswordField;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SummaryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField("'T");
      Summary summary0 = null;
      try {
        summary0 = new Summary("'T", (GreedyProgressMonitor) null, (Component) jPasswordField0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
