/*
 * This file was automatically generated by EvoSuite
 */

package httpanalyzer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import httpanalyzer.ScreenInputFilter;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

@RunWith(EvoSuiteRunner.class)
public class ScreenInputFilterEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 httpanalyzer.ScreenInputFilter.read()I: I13 Branch 1 IF_ICMPNE L43 - true
   * 2 httpanalyzer.ScreenInputFilter.read()I: I23 Branch 2 IF_ICMPGE L45 - false
   * 3 httpanalyzer.ScreenInputFilter.<init>(Ljava/io/InputStream;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ScreenInputFilter screenInputFilter0 = new ScreenInputFilter((InputStream) byteArrayInputStream0);
      int int0 = screenInputFilter0.read();
      assertEquals(88, int0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 httpanalyzer.ScreenInputFilter.read()I: I23 Branch 2 IF_ICMPGE L45 - true
   * 2 httpanalyzer.ScreenInputFilter.<init>(Ljava/io/InputStream;)V: root-Branch
   * 3 httpanalyzer.ScreenInputFilter.read()I: I13 Branch 1 IF_ICMPNE L43 - true
   */
  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byteArray0[0] = (byte) (-30);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ScreenInputFilter screenInputFilter0 = new ScreenInputFilter((InputStream) byteArrayInputStream0);
      int int0 = screenInputFilter0.read();
      assertEquals(88, int0);
  }
}
