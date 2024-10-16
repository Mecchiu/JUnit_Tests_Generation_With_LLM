/*
 * This file was automatically generated by EvoSuite
 */

package org.fixsuite.message.info;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.List;
import java.util.TreeMap;
import org.fixsuite.message.info.ComponentInfo;
import org.fixsuite.message.info.FieldInfo;
import org.fixsuite.message.info.GroupInfo;
import org.fixsuite.message.info.ValueInfo;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FieldInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FieldInfo fieldInfo0 = new FieldInfo();
      GroupInfo groupInfo0 = new GroupInfo(fieldInfo0);
      ComponentInfo componentInfo0 = new ComponentInfo();
      groupInfo0.addRequiringComponent(componentInfo0);
      groupInfo0.addRequiringComponent(componentInfo0);
      assertEquals(0, groupInfo0.getTagNumber());
      assertEquals(0, groupInfo0.getLength());
  }

  @Test
  public void test1()  throws Throwable  {
      FieldInfo fieldInfo0 = new FieldInfo();
      fieldInfo0.setNotRequiredXml(true);
      assertEquals(true, fieldInfo0.isNotRequiredXml());
  }

  @Test
  public void test2()  throws Throwable  {
      FieldInfo fieldInfo0 = new FieldInfo();
      boolean boolean0 = fieldInfo0.isNotRequiredXml();
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      FieldInfo fieldInfo0 = new FieldInfo();
      // Undeclared exception!
      try {
        fieldInfo0.isValidValue((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      FieldInfo fieldInfo0 = new FieldInfo();
      boolean boolean0 = fieldInfo0.isRequiredInComponent((ComponentInfo) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      FieldInfo fieldInfo0 = new FieldInfo();
      ComponentInfo componentInfo0 = new ComponentInfo();
      fieldInfo0.addRequiringComponent(componentInfo0);
      boolean boolean0 = fieldInfo0.isRequiredInComponent(componentInfo0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      FieldInfo fieldInfo0 = new FieldInfo();
      List<ValueInfo> list0 = fieldInfo0.getValidValues();
      assertNull(list0);
  }

  @Test
  public void test7()  throws Throwable  {
      FieldInfo fieldInfo0 = new FieldInfo();
      ValueInfo valueInfo0 = new ValueInfo();
      fieldInfo0.addValidValue(valueInfo0);
      List<ValueInfo> list0 = fieldInfo0.getValidValues();
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test
  public void test8()  throws Throwable  {
      FieldInfo fieldInfo0 = new FieldInfo();
      TreeMap<String, ValueInfo> treeMap0 = new TreeMap<String, ValueInfo>();
      fieldInfo0.setValidValues(treeMap0);
      ValueInfo valueInfo0 = new ValueInfo();
      fieldInfo0.addValidValue(valueInfo0);
      assertNull(valueInfo0.getGroup());
  }
}
