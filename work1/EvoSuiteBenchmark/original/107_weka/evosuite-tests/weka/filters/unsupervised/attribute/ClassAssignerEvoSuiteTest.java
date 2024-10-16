/*
 * This file was automatically generated by EvoSuite
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.BeforeClass;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.ClassAssigner;

@RunWith(EvoSuiteRunner.class)
public class ClassAssignerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      Capabilities capabilities0 = classAssigner0.getCapabilities();
      assertEquals("Capabilities: [Nominal attributes, Binary attributes, Unary attributes, Empty nominal attributes, Numeric attributes, Date attributes, String attributes, Relational attributes, Missing values, No class, Nominal class, Binary class, Unary class, Empty nominal class, Numeric class, Date class, String class, Relational class, Missing class values]\nDependencies: []\nmin # Instance: 0\n", capabilities0.toString());
      assertEquals("last", classAssigner0.getClassIndex());
  }

  @Test
  public void test1()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.process((Instance) null);
      assertEquals("last", classAssigner0.getClassIndex());
  }

  @Test
  public void test2()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String string0 = classAssigner0.classIndexTipText();
      assertEquals("The index of the class attribute, starts with 1, 'first' and 'last' are accepted as well, '0' unsets the class index.", string0);
      assertEquals("last", classAssigner0.getClassIndex());
  }

  @Test
  public void test3()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String string0 = classAssigner0.getRevision();
      assertNotNull(string0);
      assertEquals("8034", string0);
      assertEquals("last", classAssigner0.getClassIndex());
  }

  @Test
  public void test4()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String string0 = classAssigner0.globalInfo();
      assertEquals("Filter that can set and unset the class index.", string0);
      assertEquals("last", classAssigner0.getClassIndex());
  }

  @Test
  public void test5()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String[] stringArray0 = new String[2];
      stringArray0[0] = ".arff";
      stringArray0[1] = ".arff";
      Filter.runFilter((Filter) classAssigner0, stringArray0);
      assertEquals("last", classAssigner0.getClassIndex());
  }

  @Test
  public void test6()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String[] stringArray0 = classAssigner0.getOptions();
      assertNotNull(stringArray0);
      
      classAssigner0.setOptions(stringArray0);
      assertEquals("last", classAssigner0.getClassIndex());
  }

  @Test
  public void test7()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.setDebug(true);
      String[] stringArray0 = classAssigner0.getOptions();
      assertNotNull(stringArray0);
      assertEquals("last", classAssigner0.getClassIndex());
  }

  @Test
  public void test8()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.setClassIndex("$i\"");
      assertEquals("last", classAssigner0.getClassIndex());
  }

  @Test
  public void test9()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertEquals("last", classAssigner0.getClassIndex());
      
      classAssigner0.setClassIndex("0");
      classAssigner0.getOptions();
      assertEquals("0", classAssigner0.getClassIndex());
  }

  @Test
  public void test10()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 1);
      Instances instances1 = classAssigner0.determineOutputFormat(instances0);
      assertNotNull(instances1);
      assertEquals("last", classAssigner0.getClassIndex());
      assertNotSame(instances0, instances1);
      assertEquals(-1, instances1.classIndex());
  }
}
