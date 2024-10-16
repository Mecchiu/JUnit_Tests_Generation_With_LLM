/*
 * This file was automatically generated by EvoSuite
 */

package corina.browser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import corina.browser.Browser;
import corina.browser.SearchField;
import java.awt.Component;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SearchFieldEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SearchField searchField0 = new SearchField((Browser) null, (Component) null);
      assertNotNull(searchField0);
      
      searchField0.reset();
      assertEquals(true, searchField0.isMaximumSizeSet());
  }

  @Test
  public void test1()  throws Throwable  {
      SearchField searchField0 = new SearchField((Browser) null, (Component) null);
      assertNotNull(searchField0);
      
      String[] stringArray0 = searchField0.getTextAsWords();
      assertNotNull(stringArray0);
      assertEquals(true, searchField0.isMaximumSizeSet());
  }

  @Test
  public void test2()  throws Throwable  {
      SearchField searchField0 = new SearchField((Browser) null, (Component) null);
      assertNotNull(searchField0);
      
      // Undeclared exception!
      try {
        searchField0.replaceSelection("/MJh");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SearchField searchField0 = new SearchField((Browser) null, (Component) null);
      assertNotNull(searchField0);
      
      boolean boolean0 = searchField0.isEmpty();
      assertEquals(true, boolean0);
      assertEquals(true, searchField0.isMaximumSizeSet());
  }
}
