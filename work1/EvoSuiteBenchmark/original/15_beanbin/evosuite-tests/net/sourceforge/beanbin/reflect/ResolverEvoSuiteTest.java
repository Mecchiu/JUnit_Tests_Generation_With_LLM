/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.beanbin.reflect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.List;
import net.sourceforge.beanbin.BeanBinException;
import net.sourceforge.beanbin.reflect.Resolver;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ResolverEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Resolver resolver0 = new Resolver();
      Class class0 = Resolver.class;
      List<Class> list0 = (List<Class>)resolver0.findImplementations(class0);
      assertEquals(true, list0.isEmpty());
  }
}
