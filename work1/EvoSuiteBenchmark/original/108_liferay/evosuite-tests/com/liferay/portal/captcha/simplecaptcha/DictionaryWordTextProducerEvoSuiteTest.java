/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.captcha.simplecaptcha;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.captcha.simplecaptcha.DictionaryWordTextProducer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DictionaryWordTextProducerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DictionaryWordTextProducer dictionaryWordTextProducer0 = new DictionaryWordTextProducer();
      // Undeclared exception!
      try {
        dictionaryWordTextProducer0.getText();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.words.WordsUtil
         */
      }
  }
}
