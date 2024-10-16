/*
 * This file was automatically generated by EvoSuite
 */

package weka.gui.visualize;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import javax.swing.JComponent;
import org.junit.BeforeClass;
import weka.gui.visualize.PostscriptWriter;

@RunWith(EvoSuiteRunner.class)
public class PostscriptWriterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PostscriptWriter postscriptWriter0 = new PostscriptWriter();
      String string0 = postscriptWriter0.getExtension();
      assertEquals(".eps", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      PostscriptWriter postscriptWriter0 = new PostscriptWriter((JComponent) null, (File) null);
      assertEquals("Postscript-File", postscriptWriter0.getDescription());
  }

  @Test
  public void test2()  throws Throwable  {
      PostscriptWriter postscriptWriter0 = new PostscriptWriter((JComponent) null);
      postscriptWriter0.generateOutput();
      assertEquals("Postscript-File", postscriptWriter0.getDescription());
  }

  @Test
  public void test3()  throws Throwable  {
      PostscriptWriter postscriptWriter0 = new PostscriptWriter();
      String string0 = postscriptWriter0.getDescription();
      assertEquals("Postscript-File", string0);
  }
}
