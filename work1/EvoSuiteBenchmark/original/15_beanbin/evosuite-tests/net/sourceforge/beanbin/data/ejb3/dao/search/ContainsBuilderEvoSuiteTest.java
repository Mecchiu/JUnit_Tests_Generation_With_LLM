/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.beanbin.data.ejb3.dao.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.beanbin.BeanBinException;
import net.sourceforge.beanbin.data.ejb3.dao.search.ContainsBuilder;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ContainsBuilderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ContainsBuilder containsBuilder0 = new ContainsBuilder();
      try {
        containsBuilder0.getQueryString();
        fail("Expecting exception: BeanBinException");
      } catch(BeanBinException e) {
        /*
         * You must initialize this JPA-QL Builder before you can use it!
         */
      }
  }
}
