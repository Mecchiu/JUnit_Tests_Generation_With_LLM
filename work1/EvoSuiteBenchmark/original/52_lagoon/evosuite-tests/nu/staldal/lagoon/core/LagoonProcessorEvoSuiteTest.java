/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import nu.staldal.lagoon.core.AuthenticationException;
import nu.staldal.lagoon.core.AuthenticationMissingException;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.core.LagoonProcessor;
import nu.staldal.xtree.Element;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LagoonProcessorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("");
      LagoonProcessor lagoonProcessor0 = null;
      try {
        lagoonProcessor0 = new LagoonProcessor("", (Element) null, file0, "", (PrintWriter) null, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = new File("ftp:+/");
      LagoonProcessor lagoonProcessor0 = null;
      try {
        lagoonProcessor0 = new LagoonProcessor("ftp:+/", (Element) null, file0, "ftp:+/", (PrintWriter) null, (PrintWriter) null);
        fail("Expecting exception: LagoonException");
      } catch(LagoonException e) {
        /*
         * sourceDir must be an existing directory: ftp:+
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LagoonProcessor lagoonProcessor0 = null;
      try {
        lagoonProcessor0 = new LagoonProcessor("s!1:/0", (Element) null, (File) null, "s!1:/0", (PrintWriter) null, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
