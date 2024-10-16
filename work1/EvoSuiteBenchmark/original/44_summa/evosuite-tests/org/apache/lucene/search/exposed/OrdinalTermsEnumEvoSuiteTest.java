/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.lucene.search.exposed;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.apache.lucene.index.MultiTermsEnum;
import org.apache.lucene.index.ReaderSlice;
import org.apache.lucene.index.TermsEnum;
import org.apache.lucene.search.exposed.OrdinalTermsEnum;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OrdinalTermsEnumEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ReaderSlice[] readerSliceArray0 = new ReaderSlice[12];
      MultiTermsEnum multiTermsEnum0 = new MultiTermsEnum(readerSliceArray0);
      OrdinalTermsEnum ordinalTermsEnum0 = null;
      try {
        ordinalTermsEnum0 = new OrdinalTermsEnum((TermsEnum) multiTermsEnum0, 1848);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
