/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.managementconsole.soap.axis.sapcontrol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.sapcontrol.HeapInfo;
import com.sap.managementconsole.soap.axis.sapcontrol.STATECOLOR;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HeapInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      HeapInfo heapInfo1 = new HeapInfo();
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      heapInfo0.setMaxSize(4L);
      assertEquals(4L, heapInfo0.getMaxSize());
  }

  @Test
  public void test2()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      heapInfo0.setProcessname("3W|]p`5!d'&nHND|");
      HeapInfo heapInfo1 = new HeapInfo();
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertEquals(false, boolean0);
      assertFalse(heapInfo1.equals(heapInfo0));
  }

  @Test
  public void test3()  throws Throwable  {
      TypeDesc typeDesc0 = HeapInfo.getTypeDesc();
      assertEquals(false, typeDesc0.hasAttributes());
  }

  @Test
  public void test4()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      heapInfo0.setCommitSize(0L);
      assertNull(heapInfo0.getProcessname());
  }

  @Test
  public void test5()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      heapInfo0.setSize(4L);
      assertEquals(4L, heapInfo0.getSize());
  }

  @Test
  public void test6()  throws Throwable  {
      Class<?> class0 = QName.class;
      QName qName0 = new QName("=l,_TuL-Z(4kg\"i%O", "=l,_TuL-Z(4kg\"i%O", "=l,_TuL-Z(4kg\"i%O");
      BeanDeserializer beanDeserializer0 = (BeanDeserializer)HeapInfo.getDeserializer("jq;U:]", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanDeserializer0.getMechanismType());
  }

  @Test
  public void test7()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      heapInfo0.setInitialSize(1226L);
      HeapInfo heapInfo1 = new HeapInfo();
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertEquals(1226L, heapInfo0.getInitialSize());
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      Class<?> class0 = Object.class;
      QName qName0 = new QName("u%>)K");
      BeanSerializer beanSerializer0 = (BeanSerializer)HeapInfo.getSerializer("u%>)K", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanSerializer0.getMechanismType());
  }

  @Test
  public void test9()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo("due to bad log hierarchy. ", "due to bad log hierarchy. ", 1055L, 1055L, 1055L, 1055L, 1055L, (STATECOLOR) null);
      HeapInfo heapInfo1 = new HeapInfo("due to bad log hierarchy. ", "due to bad log hierarchy. ", 19L, 19L, 19L, 19L, 19L, (STATECOLOR) null);
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertEquals(1055L, heapInfo0.getInitialSize());
      assertEquals(1055L, heapInfo0.getCommitSize());
      assertEquals(1055L, heapInfo0.getSize());
      assertEquals(1055L, heapInfo0.getMaxUsedSize());
      assertEquals(false, boolean0);
      assertEquals(1055L, heapInfo0.getMaxSize());
  }

  @Test
  public void test10()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      heapInfo0.setMaxUsedSize((long) 1);
      assertEquals(1L, heapInfo0.getMaxUsedSize());
  }

  @Test
  public void test11()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      heapInfo0.setType("jq;U:]");
      assertNull(heapInfo0.getProcessname());
  }

  @Test
  public void test12()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      boolean boolean0 = heapInfo0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      HeapInfo heapInfo0 = new HeapInfo("geagalu[", "geagalu[", 1531L, 1531L, 1531L, 1531L, 1531L, sTATECOLOR0);
      HeapInfo heapInfo1 = new HeapInfo();
      boolean boolean0 = heapInfo1.equals((Object) heapInfo0);
      assertEquals(false, boolean0);
      assertEquals(1531L, heapInfo0.getCommitSize());
      assertEquals(1531L, heapInfo0.getInitialSize());
      assertEquals(1531L, heapInfo0.getSize());
      assertEquals(1531L, heapInfo0.getMaxUsedSize());
      assertEquals(1531L, heapInfo0.getMaxSize());
  }

  @Test
  public void test14()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      heapInfo0.setProcessname("3W|]p`5!d'&nHND|");
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      HeapInfo heapInfo1 = new HeapInfo("3W|]p`5!d'&nHND|", "3W|]p`5!d'&nHND|", 0L, 0L, 0L, 0L, 0L, sTATECOLOR0);
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo("=l,_TuL-Z(4kg\"i%O", "=l,_TuL-Z(4kg\"i%O", 0L, 0L, 0L, 0L, 0L, (STATECOLOR) null);
      HeapInfo heapInfo1 = new HeapInfo("=l,_TuL-Z(4kg\"i%O", "jq;U:]", 0L, 0L, 0L, 0L, 0L, (STATECOLOR) null);
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertEquals(false, boolean0);
      assertEquals("=l,_TuL-Z(4kg\"i%O", heapInfo1.getProcessname());
  }

  @Test
  public void test16()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      HeapInfo heapInfo0 = new HeapInfo("geagalu[", "geagalu[", 1531L, 1531L, 1531L, 1531L, 1531L, sTATECOLOR0);
      HeapInfo heapInfo1 = new HeapInfo("geagalu[", "geagalu[", 1531L, 0L, 1531L, 0L, 1531L, sTATECOLOR0);
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertEquals(1531L, heapInfo1.getMaxSize());
      assertEquals(1531L, heapInfo1.getMaxUsedSize());
      assertEquals(1531L, heapInfo0.getCommitSize());
      assertEquals(1531L, heapInfo0.getInitialSize());
      assertEquals(0L, heapInfo1.getInitialSize());
      assertEquals(1531L, heapInfo1.getSize());
      assertEquals(0L, heapInfo1.getCommitSize());
      assertEquals(false, boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo("tros", "tros", 1048578L, (-656L), 1048578L, (-656L), 1048578L, (STATECOLOR) null);
      HeapInfo heapInfo1 = new HeapInfo("tros", "tros", 1048578L, (-656L), (-656L), 1048578L, (-656L), (STATECOLOR) null);
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertEquals(1048578L, heapInfo0.getSize());
      assertEquals(false, boolean0);
      assertEquals((-656L), heapInfo1.getMaxSize());
      assertEquals((-656L), heapInfo0.getInitialSize());
      assertEquals((-656L), heapInfo1.getMaxUsedSize());
      assertEquals(1048578L, heapInfo0.getMaxSize());
      assertEquals(1048578L, heapInfo1.getInitialSize());
      assertEquals(1048578L, heapInfo0.getMaxUsedSize());
      assertEquals(1048578L, heapInfo1.getSize());
      assertEquals((-656L), heapInfo1.getCommitSize());
      assertEquals((-656L), heapInfo0.getCommitSize());
  }

  @Test
  public void test18()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      HeapInfo heapInfo1 = new HeapInfo((String) null, (String) null, 0L, 0L, 0L, 0L, 1073741843L, (STATECOLOR) null);
      boolean boolean0 = heapInfo1.equals((Object) heapInfo0);
      assertEquals(0L, heapInfo1.getCommitSize());
      assertEquals(0L, heapInfo1.getSize());
      assertEquals(false, boolean0);
      assertEquals(1073741843L, heapInfo1.getMaxSize());
      assertEquals(0L, heapInfo1.getMaxUsedSize());
      assertEquals(0L, heapInfo1.getInitialSize());
  }

  @Test
  public void test19()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      HeapInfo heapInfo1 = new HeapInfo();
      assertTrue(heapInfo1.equals(heapInfo0));
      
      STATECOLOR sTATECOLOR0 = STATECOLOR.value2;
      heapInfo0.setDispstatus(sTATECOLOR0);
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertFalse(heapInfo1.equals(heapInfo0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      HeapInfo heapInfo1 = new HeapInfo();
      assertTrue(heapInfo1.equals(heapInfo0));
      
      STATECOLOR sTATECOLOR0 = STATECOLOR.value4;
      heapInfo1.setDispstatus(sTATECOLOR0);
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      HeapInfo heapInfo1 = new HeapInfo();
      STATECOLOR sTATECOLOR0 = STATECOLOR.value2;
      heapInfo1.setDispstatus(sTATECOLOR0);
      assertFalse(heapInfo1.equals(heapInfo0));
      
      heapInfo0.setDispstatus(sTATECOLOR0);
      boolean boolean0 = heapInfo0.equals((Object) heapInfo1);
      assertTrue(heapInfo1.equals(heapInfo0));
      assertEquals(true, boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      HeapInfo heapInfo0 = new HeapInfo();
      int int0 = heapInfo0.hashCode();
      assertEquals(1, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value4;
      HeapInfo heapInfo0 = new HeapInfo("", "", (-11L), (-11L), (-11L), (-11L), (-11L), sTATECOLOR0);
      int int0 = heapInfo0.hashCode();
      assertEquals(785087250, int0);
  }
}
