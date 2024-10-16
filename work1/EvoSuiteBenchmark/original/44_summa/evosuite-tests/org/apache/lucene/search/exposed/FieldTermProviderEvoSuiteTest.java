/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.lucene.search.exposed;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Locale;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.exposed.ExposedRequest;
import org.apache.lucene.search.exposed.FieldTermProvider;
import org.apache.lucene.search.exposed.compare.NamedCollatorComparator;
import org.apache.lucene.search.exposed.compare.NamedComparator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FieldTermProviderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Locale locale0 = new Locale("*", "*", "*");
      NamedCollatorComparator namedCollatorComparator0 = new NamedCollatorComparator(locale0);
      ExposedRequest.Field exposedRequest_Field0 = new ExposedRequest.Field("*", (NamedComparator) namedCollatorComparator0, "*");
      FieldTermProvider fieldTermProvider0 = null;
      try {
        fieldTermProvider0 = new FieldTermProvider((IndexReader) null, 1, exposedRequest_Field0, false);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * The reader for a FieldTermProvider must not contain sub readers
         */
      }
  }
}
