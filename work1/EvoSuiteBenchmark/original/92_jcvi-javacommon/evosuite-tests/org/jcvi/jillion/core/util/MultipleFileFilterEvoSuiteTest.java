/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.core.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileFilter;
import java.util.LinkedList;
import java.util.List;
import org.jcvi.jillion.core.util.MultipleFileFilter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MultipleFileFilterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FileFilter[] fileFilterArray0 = new FileFilter[2];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter((List<FileFilter>) linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(fileFilterArray0);
      // Undeclared exception!
      try {
        multipleFileFilter1.accept((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
