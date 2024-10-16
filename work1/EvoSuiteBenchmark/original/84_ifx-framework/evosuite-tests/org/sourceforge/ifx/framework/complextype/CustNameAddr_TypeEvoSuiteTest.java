/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CustNameAddr_Type;
import org.sourceforge.ifx.framework.element.ContactInfo;
import org.sourceforge.ifx.framework.element.CustContact;
import org.sourceforge.ifx.framework.element.CustName;
import org.sourceforge.ifx.framework.element.FullName;
import org.sourceforge.ifx.framework.element.NameAddrType;
import org.sourceforge.ifx.framework.element.PersonName;
import org.sourceforge.ifx.framework.element.PostAddr;

@RunWith(EvoSuiteRunner.class)
public class CustNameAddr_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CustNameAddr_Type custNameAddr_Type0 = new CustNameAddr_Type();
      boolean boolean0 = custNameAddr_Type0.equals((Object) "org.sourceforge.ifx.framework.element.PostAddr = {\n  Country = NULL\n  Addr1 = NULL\n  Addr2 = NULL\n  Addr3 = NULL\n  Addr4 = NULL\n  City = NULL\n  StateProv = NULL\n  PostalCode = NULL\n  AddrType = NULL\n  StartDt = NULL\n  EndDt = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      CustNameAddr_Type custNameAddr_Type0 = new CustNameAddr_Type();
      custNameAddr_Type0.setPostAddr((PostAddr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustNameAddr_Type = {\n  NameAddrType = NULL\n  FullName = NULL\n  CustName = NULL\n  PersonName = NULL\n  PostAddr = NULL\n  CustContact = NULL\n  ContactInfo = NULL\n}", custNameAddr_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CustNameAddr_Type custNameAddr_Type0 = new CustNameAddr_Type();
      String string0 = custNameAddr_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.CustNameAddr_Type = {\n  NameAddrType = NULL\n  FullName = NULL\n  CustName = NULL\n  PersonName = NULL\n  PostAddr = NULL\n  CustContact = NULL\n  ContactInfo = NULL\n}", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      CustNameAddr_Type custNameAddr_Type0 = new CustNameAddr_Type();
      custNameAddr_Type0.setNameAddrType((NameAddrType) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustNameAddr_Type = {\n  NameAddrType = NULL\n  FullName = NULL\n  CustName = NULL\n  PersonName = NULL\n  PostAddr = NULL\n  CustContact = NULL\n  ContactInfo = NULL\n}", custNameAddr_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      CustNameAddr_Type custNameAddr_Type0 = new CustNameAddr_Type();
      ContactInfo contactInfo0 = new ContactInfo();
      custNameAddr_Type0.setContactInfo(contactInfo0);
      assertEquals("org.sourceforge.ifx.framework.element.ContactInfo = {\n  URL = NULL\n  PostAddr = NULL\n  PrefTimeStart = NULL\n  PrefTimeEnd = NULL\n  EmailAddr = NULL\n  ContactPref = NULL\n  PhoneNum = NULL\n  ContactName = NULL\n}", contactInfo0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      CustNameAddr_Type custNameAddr_Type0 = new CustNameAddr_Type();
      PersonName[] personNameArray0 = new PersonName[10];
      custNameAddr_Type0.setPersonName(personNameArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustNameAddr_Type = {\n  NameAddrType = NULL\n  FullName = NULL\n  CustName = NULL\n  PersonName = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  },\n    [9]:Exception! java.lang.NullPointerException\n  }\n  ]\n  PostAddr = NULL\n  CustContact = NULL\n  ContactInfo = NULL\n}", custNameAddr_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      CustNameAddr_Type custNameAddr_Type0 = new CustNameAddr_Type();
      FullName[] fullNameArray0 = new FullName[5];
      custNameAddr_Type0.setFullName(fullNameArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustNameAddr_Type = {\n  NameAddrType = NULL\n  FullName = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n  CustName = NULL\n  PersonName = NULL\n  PostAddr = NULL\n  CustContact = NULL\n  ContactInfo = NULL\n}", custNameAddr_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      CustNameAddr_Type custNameAddr_Type0 = new CustNameAddr_Type();
      custNameAddr_Type0.setCustContact((CustContact) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustNameAddr_Type = {\n  NameAddrType = NULL\n  FullName = NULL\n  CustName = NULL\n  PersonName = NULL\n  PostAddr = NULL\n  CustContact = NULL\n  ContactInfo = NULL\n}", custNameAddr_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      CustNameAddr_Type custNameAddr_Type0 = new CustNameAddr_Type();
      CustName[] custNameArray0 = new CustName[5];
      custNameAddr_Type0.setCustName(custNameArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CustNameAddr_Type = {\n  NameAddrType = NULL\n  FullName = NULL\n  CustName = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n  PersonName = NULL\n  PostAddr = NULL\n  CustContact = NULL\n  ContactInfo = NULL\n}", custNameAddr_Type0.toString());
  }
}
