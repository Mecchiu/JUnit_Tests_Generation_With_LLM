/*
 * This file was automatically generated by EvoSuite
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.AddID;

@RunWith(EvoSuiteRunner.class)
public class AddIDEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AddID addID0 = new AddID();
      try {
        addID0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AddID addID0 = new AddID();
      String[] stringArray0 = addID0.getOptions();
      assertEquals("ID", addID0.getAttributeName());
      assertNotNull(stringArray0);
      
      addID0.setOptions(stringArray0);
      assertEquals("first", addID0.getIDIndex());
  }

  @Test
  public void test2()  throws Throwable  {
      AddID addID0 = new AddID();
      String string0 = addID0.attributeNameTipText();
      assertEquals("Set the new attribute's name.", string0);
      assertEquals("ID", addID0.getAttributeName());
      assertEquals("first", addID0.getIDIndex());
  }

  @Test
  public void test3()  throws Throwable  {
      AddID addID0 = new AddID();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"/.5ym05T)nfY6D";
      Filter.runFilter((Filter) addID0, stringArray0);
      assertEquals("first", addID0.getIDIndex());
      assertEquals("ID", addID0.getAttributeName());
  }

  @Test
  public void test4()  throws Throwable  {
      AddID addID0 = new AddID();
      String string0 = addID0.getRevision();
      assertEquals("first", addID0.getIDIndex());
      assertNotNull(string0);
      assertEquals("ID", addID0.getAttributeName());
      assertEquals("8034", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      AddID addID0 = new AddID();
      assertEquals("first", addID0.getIDIndex());
      
      addID0.setIDIndex("");
      assertEquals("", addID0.getIDIndex());
  }

  @Test
  public void test6()  throws Throwable  {
      AddID addID0 = new AddID();
      String string0 = addID0.globalInfo();
      assertEquals("first", addID0.getIDIndex());
      assertEquals("An instance filter that adds an ID attribute to the dataset. The new attribute contains a unique ID for each instance.\nNote: The ID is not reset for the second batch of files (using -b and -r and -s).", string0);
      assertEquals("ID", addID0.getAttributeName());
  }

  @Test
  public void test7()  throws Throwable  {
      AddID addID0 = new AddID();
      double[] doubleArray0 = new double[5];
      DenseInstance denseInstance0 = new DenseInstance(1654.7191108428779, doubleArray0);
      addID0.convertInstance((Instance) denseInstance0);
      assertEquals("ID", addID0.getAttributeName());
      assertEquals("first", addID0.getIDIndex());
  }

  @Test
  public void test8()  throws Throwable  {
      AddID addID0 = new AddID();
      String string0 = addID0.IDIndexTipText();
      assertEquals("first", addID0.getIDIndex());
      assertEquals("The position (starting from 1) where the attribute will be inserted (first and last are valid indices).", string0);
      assertEquals("ID", addID0.getAttributeName());
  }

  @Test
  public void test9()  throws Throwable  {
      AddID addID0 = new AddID();
      assertEquals("ID", addID0.getAttributeName());
      
      addID0.setAttributeName("M");
      assertEquals("first", addID0.getIDIndex());
  }

  @Test
  public void test10()  throws Throwable  {
      AddID addID0 = new AddID();
      // Undeclared exception!
      try {
        addID0.input((Instance) null);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No input instance format defined
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      AddID addID0 = new AddID();
      // Undeclared exception!
      try {
        addID0.batchFinished();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No input instance format defined
         */
      }
  }
}
