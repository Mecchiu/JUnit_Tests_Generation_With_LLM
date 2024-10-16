/*
 * This file was automatically generated by EvoSuite
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import weka.core.Instance;
import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Copy;

@RunWith(EvoSuiteRunner.class)
public class CopyEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Copy copy0 = new Copy();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "ji([#;C:*";
      Filter.runFilter((Filter) copy0, stringArray0);
      assertEquals(false, copy0.getInvertSelection());
  }

  @Test
  public void test1()  throws Throwable  {
      Copy copy0 = new Copy();
      String string0 = copy0.globalInfo();
      assertEquals("An instance filter that copies a range of attributes in the dataset. This is used in conjunction with other filters that overwrite attribute values during the course of their operation -- this filter allows the original attributes to be kept as well as the new attributes.", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Copy copy0 = new Copy();
      String string0 = copy0.getRevision();
      assertEquals("8034", string0);
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      Copy copy0 = new Copy();
      String string0 = copy0.invertSelectionTipText();
      assertEquals("Sets copy selected vs unselected action. If set to false, only the specified attributes will be copied; If set to true, non-specified attributes will be copied.", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      Copy copy0 = new Copy();
      try {
        copy0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Copy copy0 = new Copy();
      int[] intArray0 = new int[6];
      copy0.setAttributeIndicesArray(intArray0);
      assertEquals("1,1,1,1,1,1", copy0.getAttributeIndices());
  }

  @Test
  public void test6()  throws Throwable  {
      Copy copy0 = new Copy();
      String string0 = copy0.attributeIndicesTipText();
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Copy copy0 = new Copy();
      copy0.setInvertSelection(true);
      String[] stringArray0 = copy0.getOptions();
      assertEquals(true, copy0.getInvertSelection());
      assertNotNull(stringArray0);
  }

  @Test
  public void test8()  throws Throwable  {
      Copy copy0 = new Copy();
      copy0.setAttributeIndices("Sets copy selected vs unselected action. If set to false, only the specified attributes will be copied; If set to true, non-specified attributes will be copied.");
      String[] stringArray0 = copy0.getOptions();
      assertEquals("Sets copy selected vs unselected action. If set to false,only the specified attributes will be copied; If set to true,non-specified attributes will be copied.", copy0.getAttributeIndices());
      assertNotNull(stringArray0);
  }

  @Test
  public void test9()  throws Throwable  {
      Copy copy0 = new Copy();
      // Undeclared exception!
      try {
        copy0.input((Instance) null);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No input instance format defined
         */
      }
  }
}
