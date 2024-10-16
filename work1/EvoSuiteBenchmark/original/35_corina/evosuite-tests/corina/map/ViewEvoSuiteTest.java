/*
 * This file was automatically generated by EvoSuite
 */

package corina.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import corina.map.View;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ViewEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      View view0 = new View();
      assertNotNull(view0);
      
      View view1 = (View)view0.clone();
      assertNotNull(view1);
      assertNotSame(view1, view0);
      assertEquals(1.0F, view1.getZoom(), 0.01F);
  }

  @Test
  public void test1()  throws Throwable  {
      View view0 = new View();
      assertNotNull(view0);
      
      view0.setZoom(1.0F);
      assertEquals(1.0F, view0.getZoom(), 0.01F);
  }

  @Test
  public void test2()  throws Throwable  {
      View view0 = new View();
      assertNotNull(view0);
      
      float float0 = view0.getZoom();
      assertEquals(1.0F, float0, 0.01F);
  }
}
