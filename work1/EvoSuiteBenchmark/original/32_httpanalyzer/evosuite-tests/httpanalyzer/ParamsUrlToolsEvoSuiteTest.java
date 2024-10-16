/*
 * This file was automatically generated by EvoSuite
 */

package httpanalyzer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import httpanalyzer.ParamsUrlTools;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JFrame;
import org.apache.http.NameValuePair;

@RunWith(EvoSuiteRunner.class)
public class ParamsUrlToolsEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 httpanalyzer.ParamsUrlTools.getPairParams(Ljava/lang/String;)Ljava/util/List;: I20 Branch 1 IF_ICMPGE L44 - true
   * 2 httpanalyzer.ParamsUrlTools.getPairParams(Ljava/lang/String;)Ljava/util/List;: I20 Branch 1 IF_ICMPGE L44 - false
   * 3 httpanalyzer.ParamsUrlTools.getPairParams(Ljava/lang/String;)Ljava/util/List;: I45 Branch 2 IFGT L47 - true
   * 4 httpanalyzer.ParamsUrlTools.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ParamsUrlTools paramsUrlTools0 = new ParamsUrlTools();
      List<NameValuePair> list0 = paramsUrlTools0.getPairParams("");
      assertEquals(0, list0.size());
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 httpanalyzer.ParamsUrlTools.getPairParams(Ljava/lang/String;)Ljava/util/List;: I45 Branch 2 IFGT L47 - false
   * 2 httpanalyzer.ParamsUrlTools.getPairParams(Ljava/lang/String;)Ljava/util/List;: I20 Branch 1 IF_ICMPGE L44 - true
   * 3 httpanalyzer.ParamsUrlTools.getPairParams(Ljava/lang/String;)Ljava/util/List;: I20 Branch 1 IF_ICMPGE L44 - false
   */
  @Test
  public void test1()  throws Throwable  {
      ParamsUrlTools paramsUrlTools0 = new ParamsUrlTools();
      List<NameValuePair> list0 = paramsUrlTools0.getPairParams("AsSLNaxcr+MuO:m=");
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 httpanalyzer.ParamsUrlTools.splitUrl(Ljava/lang/String;Ljavax/swing/JFrame;)[Ljava/lang/String;: I56 Branch 3 IFGT L82 - false
   * 2 httpanalyzer.ParamsUrlTools.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      ParamsUrlTools paramsUrlTools0 = new ParamsUrlTools();
      // Undeclared exception!
      try {
        paramsUrlTools0.splitUrl("AsSLNaxcr+MuO:m=", (JFrame) null);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }
}
