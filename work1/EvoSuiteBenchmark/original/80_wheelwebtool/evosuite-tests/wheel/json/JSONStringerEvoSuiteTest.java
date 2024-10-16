/*
 * This file was automatically generated by EvoSuite
 */

package wheel.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import wheel.json.JSONException;
import wheel.json.JSONStringer;

@RunWith(EvoSuiteRunner.class)
public class JSONStringerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JSONStringer jSONStringer0 = new JSONStringer();
      String string0 = jSONStringer0.toString();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      JSONStringer jSONStringer0 = new JSONStringer();
      jSONStringer0.object();
      jSONStringer0.endObject();
      String string0 = jSONStringer0.toString();
      assertEquals("{}", string0);
  }
}
