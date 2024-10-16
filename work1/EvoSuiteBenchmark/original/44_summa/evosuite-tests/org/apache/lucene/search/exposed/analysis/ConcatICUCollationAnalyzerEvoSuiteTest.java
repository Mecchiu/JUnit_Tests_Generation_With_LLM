/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.lucene.search.exposed.analysis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.ibm.icu.text.Collator;
import com.ibm.icu.text.RuleBasedCollator;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.util.Locale;
import org.apache.lucene.search.exposed.analysis.ConcatICUCollationAnalyzer;
import org.apache.lucene.util.BytesRef;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ConcatICUCollationAnalyzerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BytesRef bytesRef0 = new BytesRef();
      BytesRef bytesRef1 = ConcatICUCollationAnalyzer.getOriginalString(bytesRef0, bytesRef0);
      assertEquals(0, bytesRef1.offset);
  }

  @Test
  public void test1()  throws Throwable  {
      RuleBasedCollator ruleBasedCollator0 = (RuleBasedCollator)Collator.getInstance();
      ConcatICUCollationAnalyzer concatICUCollationAnalyzer0 = new ConcatICUCollationAnalyzer((Collator) ruleBasedCollator0);
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      concatICUCollationAnalyzer0.createComponents("[]", (Reader) pipedReader0);
  }

  @Test
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      RuleBasedCollator ruleBasedCollator0 = (RuleBasedCollator)Collator.getInstance(locale0);
      ConcatICUCollationAnalyzer concatICUCollationAnalyzer0 = new ConcatICUCollationAnalyzer((Collator) ruleBasedCollator0);
      RuleBasedCollator ruleBasedCollator1 = (RuleBasedCollator)concatICUCollationAnalyzer0.getCollator();
      assertEquals(false, ruleBasedCollator1.isUpperCaseFirst());
  }
}
