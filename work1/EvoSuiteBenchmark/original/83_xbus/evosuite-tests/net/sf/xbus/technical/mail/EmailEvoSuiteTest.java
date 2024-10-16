/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xbus.technical.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.List;
import javax.mail.internet.InternetAddress;
import net.sf.xbus.base.core.XException;
import net.sf.xbus.technical.mail.Email;
import org.evosuite.runtime.System;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EmailEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Email email0 = new Email("");
      InternetAddress internetAddress0 = email0.getFromAddress();
      assertNull(internetAddress0);
  }

  @Test
  public void test1()  throws Throwable  {
      Email email0 = new Email("[ENV] No LogFactory attribute found for");
      List<Object> list0 = email0.getBCCAddresses();
      assertNull(list0);
  }

  @Test
  public void test2()  throws Throwable  {
      Email email0 = new Email((String) null);
      String string0 = email0.getContent();
      assertNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      Email email0 = new Email("");
      email0.setContent("");
      boolean boolean0 = email0.isEmpty();
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      Email email0 = new Email("");
      String string0 = email0.getSubject();
      assertNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      Email email0 = new Email("[ENV] No LogFactory attribute found for");
      Date date0 = new Date();
      email0.setSentDate(date0);
      assertNull(email0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      Email email0 = new Email("[ENV] No LogFactory attribute found for");
      email0.setContentType("[ENV] No LogFactory attribute found for");
      assertEquals(true, email0.isEmpty());
  }

  @Test
  public void test7()  throws Throwable  {
      Email email0 = new Email("[ENV] No LogFactory attribute found for");
      List<Object> list0 = email0.getCCAddresses();
      assertNull(list0);
  }

  @Test
  public void test8()  throws Throwable  {
      Email email0 = new Email("[ENV] No LogFactory attribute found for");
      String string0 = email0.getContentType();
      assertNull(string0);
  }

  @Test
  public void test9()  throws Throwable  {
      Email email0 = new Email((String) null);
      InternetAddress internetAddress0 = new InternetAddress();
      email0.setFromAddress(internetAddress0);
      assertNull(internetAddress0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      Email email0 = new Email("");
      email0.setSubject("");
      assertNull(email0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      Email email0 = new Email("");
      email0.toString();
      assertEquals(true, email0.isEmpty());
  }

  @Test
  public void test12()  throws Throwable  {
      Email email0 = new Email("a@e");
      List<Object> list0 = email0.getToAddresses();
      assertNull(list0);
  }

  @Test
  public void test13()  throws Throwable  {
      Email email0 = new Email((String) null);
      Date date0 = email0.getSentDate();
      assertNull(date0);
  }

  @Test
  public void test14()  throws Throwable  {
      Email email0 = new Email("a@e");
      email0.setContent("a@e");
      // Undeclared exception!
      try {
        email0.getXML();
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Email email0 = new Email("");
      email0.setToAddress((InternetAddress) null);
      email0.setToAddress((InternetAddress) null);
      assertNull(email0.getContentType());
  }

  @Test
  public void test16()  throws Throwable  {
      Email email0 = new Email("");
      email0.setCCAddress((InternetAddress) null);
      email0.setCCAddress((InternetAddress) null);
      assertNull(email0.getContent());
  }

  @Test
  public void test17()  throws Throwable  {
      Email email0 = new Email((String) null);
      InternetAddress internetAddress0 = new InternetAddress();
      email0.setBCCAddress(internetAddress0);
      email0.setBCCAddress(internetAddress0);
      assertNull(email0.getContentType());
  }
}
