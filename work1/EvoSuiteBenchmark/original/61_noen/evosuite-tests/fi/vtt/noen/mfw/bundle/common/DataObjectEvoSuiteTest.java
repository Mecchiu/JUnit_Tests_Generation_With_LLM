/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.mfw.bundle.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.mfw.bundle.common.DataObject;
import fi.vtt.noen.mfw.bundle.common.DataType;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DataObjectEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DataType dataType0 = DataType.STRINGVALUE;
      DataObject dataObject0 = new DataObject(dataType0);
      DataType dataType1 = dataObject0.getType();
      assertEquals(0, dataType1.ordinal());
  }

  @Test
  public void test1()  throws Throwable  {
      DataType dataType0 = DataType.STRINGVALUE;
      DataObject dataObject0 = new DataObject(dataType0);
      dataObject0.setType(dataType0);
      assertEquals(DataType.STRINGVALUE, dataObject0.getType());
  }
}
