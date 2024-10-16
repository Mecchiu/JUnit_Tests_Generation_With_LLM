/*
 * This file was automatically generated by EvoSuite
 */

package org.objectweb.asm.jip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.objectweb.asm.jip.Attribute;
import org.objectweb.asm.jip.ByteVector;
import org.objectweb.asm.jip.ClassReader;
import org.objectweb.asm.jip.ClassWriter;
import org.objectweb.asm.jip.Label;

@RunWith(EvoSuiteRunner.class)
public class AttributeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Attribute attribute0 = new Attribute((String) null);
      char[] charArray0 = new char[5];
      Label[] labelArray0 = new Label[6];
      // Undeclared exception!
      try {
        attribute0.read((ClassReader) null, 1117, 1117, charArray0, (int) 'F', labelArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Attribute attribute0 = new Attribute("j$GQ,(JMb+");
      Label[] labelArray0 = attribute0.getLabels();
      assertNull(labelArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      Attribute attribute0 = new Attribute("j$GQ,(JMb+");
      boolean boolean0 = attribute0.isUnknown();
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      Attribute attribute0 = new Attribute("");
      boolean boolean0 = attribute0.isCodeAttribute();
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      Attribute attribute0 = new Attribute("j$GQ,(JMb+");
      int int0 = attribute0.getCount();
      assertEquals(1, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      Attribute attribute0 = new Attribute("");
      ClassWriter classWriter0 = new ClassWriter((-1804));
      byte[] byteArray0 = new byte[4];
      attribute0.value = byteArray0;
      int int0 = attribute0.getSize(classWriter0, byteArray0, (int) (byte)11, 63, 166);
      assertEquals(10, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      Attribute attribute0 = new Attribute("");
      ClassWriter classWriter0 = new ClassWriter((-1804));
      byte[] byteArray0 = new byte[4];
      attribute0.value = byteArray0;
      ByteVector byteVector0 = new ByteVector();
      attribute0.put(classWriter0, byteArray0, (int) (byte) (-31), (-1804), (int) (byte) (-31), byteVector0);
      assertEquals(true, attribute0.isUnknown());
  }
}
