/*
 * This file was automatically generated by EvoSuite
 */

package mygrid.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.xml.namespace.QName;
import mygrid.web.ArrayOfDependency;
import mygrid.web.Dependency;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ArrayOfDependencyEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ArrayOfDependency arrayOfDependency0 = new ArrayOfDependency();
      Dependency dependency0 = new Dependency();
      // Undeclared exception!
      try {
        arrayOfDependency0.setDependency(16, dependency0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = QName.class;
      QName qName0 = new QName("cMO4Rvo.");
      BeanDeserializer beanDeserializer0 = (BeanDeserializer)ArrayOfDependency.getDeserializer("cMO4Rvo.", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanDeserializer0.getMechanismType());
  }

  @Test
  public void test2()  throws Throwable  {
      TypeDesc typeDesc0 = ArrayOfDependency.getTypeDesc();
      assertEquals(false, typeDesc0.hasAttributes());
  }

  @Test
  public void test3()  throws Throwable  {
      ArrayOfDependency arrayOfDependency0 = new ArrayOfDependency();
      // Undeclared exception!
      try {
        arrayOfDependency0.getDependency(1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ArrayOfDependency arrayOfDependency0 = new ArrayOfDependency();
      ArrayOfDependency arrayOfDependency1 = new ArrayOfDependency();
      boolean boolean0 = arrayOfDependency0.equals((Object) arrayOfDependency1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      Class<?> class0 = QName.class;
      QName qName0 = new QName("cMO4Rvo.");
      BeanSerializer beanSerializer0 = (BeanSerializer)ArrayOfDependency.getSerializer("cMO4Rvo.", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanSerializer0.getMechanismType());
  }

  @Test
  public void test6()  throws Throwable  {
      ArrayOfDependency arrayOfDependency0 = new ArrayOfDependency();
      boolean boolean0 = arrayOfDependency0.equals((Object) "cMO4Rvo.");
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      ArrayOfDependency arrayOfDependency0 = new ArrayOfDependency();
      ArrayOfDependency arrayOfDependency1 = new ArrayOfDependency();
      assertTrue(arrayOfDependency1.equals(arrayOfDependency0));
      
      Dependency[] dependencyArray0 = new Dependency[19];
      arrayOfDependency1.setDependency(dependencyArray0);
      boolean boolean0 = arrayOfDependency0.equals((Object) arrayOfDependency1);
      assertFalse(arrayOfDependency1.equals(arrayOfDependency0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      ArrayOfDependency arrayOfDependency0 = new ArrayOfDependency();
      Dependency[] dependencyArray0 = new Dependency[1];
      arrayOfDependency0.setDependency(dependencyArray0);
      ArrayOfDependency arrayOfDependency1 = new ArrayOfDependency();
      boolean boolean0 = arrayOfDependency0.equals((Object) arrayOfDependency1);
      assertFalse(arrayOfDependency1.equals(arrayOfDependency0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      ArrayOfDependency arrayOfDependency0 = new ArrayOfDependency();
      Dependency[] dependencyArray0 = new Dependency[1];
      arrayOfDependency0.setDependency(dependencyArray0);
      ArrayOfDependency arrayOfDependency1 = new ArrayOfDependency();
      assertFalse(arrayOfDependency1.equals(arrayOfDependency0));
      
      arrayOfDependency1.setDependency(dependencyArray0);
      boolean boolean0 = arrayOfDependency0.equals((Object) arrayOfDependency1);
      assertTrue(arrayOfDependency1.equals(arrayOfDependency0));
      assertEquals(true, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      ArrayOfDependency arrayOfDependency0 = new ArrayOfDependency();
      int int0 = arrayOfDependency0.hashCode();
      assertEquals(1, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      ArrayOfDependency arrayOfDependency0 = new ArrayOfDependency();
      Dependency dependency0 = new Dependency();
      Dependency[] dependencyArray0 = new Dependency[7];
      dependencyArray0[5] = dependency0;
      arrayOfDependency0.setDependency(dependencyArray0);
      int int0 = arrayOfDependency0.hashCode();
      assertEquals(2, int0);
  }
}
