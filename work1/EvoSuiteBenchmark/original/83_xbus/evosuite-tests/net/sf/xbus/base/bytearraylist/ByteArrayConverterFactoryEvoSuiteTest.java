/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xbus.base.bytearraylist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.xbus.base.bytearraylist.ByteArrayConverterFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ByteArrayConverterFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ByteArrayConverterFactory byteArrayConverterFactory0 = new ByteArrayConverterFactory();
      ByteArrayConverterFactory.Field byteArrayConverterFactory_Field0 = byteArrayConverterFactory0.new Field();
      assertEquals(0, byteArrayConverterFactory_Field0.length);
  }
}
