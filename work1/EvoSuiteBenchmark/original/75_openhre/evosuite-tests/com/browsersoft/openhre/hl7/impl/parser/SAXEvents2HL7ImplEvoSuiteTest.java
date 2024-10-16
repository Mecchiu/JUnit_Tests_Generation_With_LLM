/*
 * This file was automatically generated by EvoSuite
 */

package com.browsersoft.openhre.hl7.impl.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.browsersoft.openhre.hl7.api.parse.ParserException;
import com.browsersoft.openhre.hl7.impl.parser.SAXEvents2HL7Impl;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SAXEvents2HL7ImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.setSubComponentSeparator('~');
      assertEquals('~', sAXEvents2HL7Impl0.getSubComponentSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
  }

  @Test
  public void test1()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      char char0 = sAXEvents2HL7Impl0.getSubComponentSeparator();
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals('&', char0);
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
  }

  @Test
  public void test2()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      String string0 = sAXEvents2HL7Impl0.getSegmentSeparator();
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertNotNull(string0);
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals("\n", string0);
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
  }

  @Test
  public void test3()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      char char0 = sAXEvents2HL7Impl0.getRepeatableSeparator();
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('~', char0);
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
  }

  @Test
  public void test4()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      char char0 = sAXEvents2HL7Impl0.getComponentSeparator();
      assertEquals('^', char0);
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
  }

  @Test
  public void test5()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.setEscapeCharacter('&');
      assertEquals('&', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
  }

  @Test
  public void test6()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      char char0 = sAXEvents2HL7Impl0.getEscapeCharacter();
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
      assertEquals('\\', char0);
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
  }

  @Test
  public void test7()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      // Undeclared exception!
      try {
        sAXEvents2HL7Impl0.processStart();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      StringWriter stringWriter0 = new StringWriter();
      sAXEvents2HL7Impl0.setWriter((Writer) stringWriter0);
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
  }

  @Test
  public void test9()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.setComponentSeparator('~');
      assertEquals('~', sAXEvents2HL7Impl0.getComponentSeparator());
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
  }

  @Test
  public void test10()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      
      sAXEvents2HL7Impl0.setSegmentSeparator("AoDemV#s~J0I\"q_f-0bV");
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
  }

  @Test
  public void test11()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.getWriter();
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
  }

  @Test
  public void test12()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      char char0 = sAXEvents2HL7Impl0.getFieldSeparator();
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals('|', char0);
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
  }

  @Test
  public void test13()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.setFieldSeparator('^');
      assertEquals('^', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
  }

  @Test
  public void test14()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.setRepeatableSeparator('~');
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
  }

  @Test
  public void test15()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.processStartTag("MSH");
      sAXEvents2HL7Impl0.processStartTag("MSH");
      sAXEvents2HL7Impl0.processEndTag("MSH");
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
  }

  @Test
  public void test16()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.processStartTag("MSH");
      sAXEvents2HL7Impl0.processStartTag("MSH");
      try {
        sAXEvents2HL7Impl0.processStartTag("MSH");
        fail("Expecting exception: ParserException");
      } catch(ParserException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.processStartTag("AoDemV#s~J0I\"q_f-0bV");
      sAXEvents2HL7Impl0.processStartTag("AoDemV#s~J0I\"q_f-0bV");
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
  }

  @Test
  public void test18()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.processStartTag("AoDemV#s~J0I\"q_f-0bV");
      // Undeclared exception!
      try {
        sAXEvents2HL7Impl0.processStartTag("Jz.");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.processText("MSH");
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
  }

  @Test
  public void test20()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.processEndTag("AoDemV#s~J0I\"q_f-0bV");
      assertEquals('^', sAXEvents2HL7Impl0.getComponentSeparator());
      assertEquals('\\', sAXEvents2HL7Impl0.getEscapeCharacter());
      assertEquals('|', sAXEvents2HL7Impl0.getFieldSeparator());
      assertEquals('~', sAXEvents2HL7Impl0.getRepeatableSeparator());
      assertEquals("\n", sAXEvents2HL7Impl0.getSegmentSeparator());
      assertEquals('&', sAXEvents2HL7Impl0.getSubComponentSeparator());
  }

  @Test
  public void test21()  throws Throwable  {
      SAXEvents2HL7Impl sAXEvents2HL7Impl0 = new SAXEvents2HL7Impl();
      sAXEvents2HL7Impl0.processStartTag("MSH");
      sAXEvents2HL7Impl0.processStartTag("MSH");
      try {
        sAXEvents2HL7Impl0.processStartTag("'!.java");
        fail("Expecting exception: ParserException");
      } catch(ParserException e) {
      }
  }
}
