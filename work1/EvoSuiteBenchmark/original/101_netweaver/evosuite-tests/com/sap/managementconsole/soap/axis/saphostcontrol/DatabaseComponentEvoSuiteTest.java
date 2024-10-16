/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.managementconsole.soap.axis.saphostcontrol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.saphostcontrol.DatabaseComponent;
import com.sap.managementconsole.soap.axis.saphostcontrol.DatabaseStatus;
import com.sap.managementconsole.soap.axis.saphostcontrol.Property;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DatabaseComponentEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TypeDesc typeDesc0 = DatabaseComponent.getTypeDesc();
      assertEquals(false, typeDesc0.hasAttributes());
  }

  @Test
  public void test1()  throws Throwable  {
      Property[] propertyArray0 = new Property[14];
      DatabaseStatus databaseStatus0 = DatabaseStatus.value6;
      DatabaseComponent databaseComponent0 = new DatabaseComponent(propertyArray0, databaseStatus0);
      DatabaseComponent databaseComponent1 = new DatabaseComponent(propertyArray0, databaseStatus0);
      boolean boolean0 = databaseComponent0.equals((Object) databaseComponent1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      Class<?> class0 = QName.class;
      QName qName0 = new QName("zKa", "zKa", "zKa");
      BeanSerializer beanSerializer0 = (BeanSerializer)DatabaseComponent.getSerializer("zKa", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanSerializer0.getMechanismType());
  }

  @Test
  public void test3()  throws Throwable  {
      DatabaseComponent databaseComponent0 = new DatabaseComponent();
      DatabaseComponent databaseComponent1 = new DatabaseComponent();
      boolean boolean0 = databaseComponent0.equals((Object) databaseComponent1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      Class<?> class0 = QName.class;
      QName qName0 = new QName("zKa", "zKa", "zKa");
      BeanDeserializer beanDeserializer0 = (BeanDeserializer)DatabaseComponent.getDeserializer("zKa", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanDeserializer0.getMechanismType());
  }

  @Test
  public void test5()  throws Throwable  {
      DatabaseComponent databaseComponent0 = new DatabaseComponent();
      boolean boolean0 = databaseComponent0.equals((Object) "SAPHostControl-DB-STARTING");
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      DatabaseComponent databaseComponent0 = new DatabaseComponent();
      DatabaseComponent databaseComponent1 = new DatabaseComponent();
      assertTrue(databaseComponent1.equals(databaseComponent0));
      
      DatabaseStatus databaseStatus0 = DatabaseStatus.value2;
      databaseComponent1.setMStatus(databaseStatus0);
      boolean boolean0 = databaseComponent0.equals((Object) databaseComponent1);
      assertFalse(databaseComponent1.equals(databaseComponent0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      DatabaseComponent databaseComponent0 = new DatabaseComponent();
      DatabaseComponent databaseComponent1 = new DatabaseComponent();
      assertTrue(databaseComponent1.equals(databaseComponent0));
      
      Property[] propertyArray0 = new Property[4];
      databaseComponent1.setMProperties(propertyArray0);
      boolean boolean0 = databaseComponent0.equals((Object) databaseComponent1);
      assertFalse(databaseComponent1.equals(databaseComponent0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      Property[] propertyArray0 = new Property[9];
      DatabaseComponent databaseComponent0 = new DatabaseComponent();
      DatabaseStatus databaseStatus0 = DatabaseStatus.value4;
      DatabaseComponent databaseComponent1 = new DatabaseComponent(propertyArray0, databaseStatus0);
      boolean boolean0 = databaseComponent1.equals((Object) databaseComponent0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      DatabaseComponent databaseComponent0 = new DatabaseComponent();
      DatabaseComponent databaseComponent1 = new DatabaseComponent();
      assertTrue(databaseComponent1.equals(databaseComponent0));
      
      DatabaseStatus databaseStatus0 = DatabaseStatus.value5;
      databaseComponent1.setMStatus(databaseStatus0);
      boolean boolean0 = databaseComponent1.equals((Object) databaseComponent0);
      assertFalse(databaseComponent1.equals(databaseComponent0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseComponent databaseComponent0 = new DatabaseComponent();
      int int0 = databaseComponent0.hashCode();
      assertEquals(1, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      Property[] propertyArray0 = new Property[8];
      Property property0 = new Property();
      propertyArray0[2] = property0;
      DatabaseStatus databaseStatus0 = DatabaseStatus.value7;
      DatabaseComponent databaseComponent0 = new DatabaseComponent(propertyArray0, databaseStatus0);
      int int0 = databaseComponent0.hashCode();
      assertEquals((-374067875), int0);
  }
}
