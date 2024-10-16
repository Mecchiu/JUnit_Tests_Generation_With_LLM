/*
 * This file was automatically generated by EvoSuite
 */

package org.objectweb.asm.jip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.objectweb.asm.jip.AnnotationVisitor;
import org.objectweb.asm.jip.Attribute;
import org.objectweb.asm.jip.ClassAdapter;
import org.objectweb.asm.jip.ClassVisitor;
import org.objectweb.asm.jip.ClassWriter;
import org.objectweb.asm.jip.Label;
import org.objectweb.asm.jip.MethodAdapter;
import org.objectweb.asm.jip.MethodVisitor;

@RunWith(EvoSuiteRunner.class)
public class MethodAdapterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-544));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "`Q>rTq+ea";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod((-544), "`Q>rTq+ea", "`Q>rTq+ea", "`Q>rTq+ea", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitMaxs((-544), (-544));
  }

  @Test
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) classWriter0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = ":MH_wq5S";
      stringArray0[1] = ":MH_wq5S";
      stringArray0[2] = ":MH_wq5S";
      stringArray0[3] = ":MH_wq5S";
      MethodVisitor methodVisitor0 = classAdapter0.visitMethod(0, ":MH_wq5S", ":MH_wq5S", ":MH_wq5S", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitMultiANewArrayInsn(":MH_wq5S", 0);
  }

  @Test
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(0, "", "", "", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      Label label0 = new Label();
      methodAdapter0.visitLocalVariable("", "", "", label0, label0, 0);
      assertEquals("L277780465", label0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(0, "", "", "", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitIincInsn(0, 16777217);
  }

  @Test
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(0, "", "", "", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitVarInsn(0, 0);
  }

  @Test
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-544));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "`Q>rTq+ea";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod((-544), "`Q>rTq+ea", "`Q>rTq+ea", "`Q>rTq+ea", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitIntInsn((-544), (-544));
  }

  @Test
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) classWriter0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = ":MH_wq5S";
      stringArray0[1] = ":MH_wq5S";
      stringArray0[2] = ":MH_wq5S";
      stringArray0[3] = ":MH_wq5S";
      MethodVisitor methodVisitor0 = classAdapter0.visitMethod(0, ":MH_wq5S", ":MH_wq5S", ":MH_wq5S", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitTypeInsn(0, ":MH_wq5S");
  }

  @Test
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) classWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodVisitor methodVisitor0 = classAdapter0.visitMethod(0, "", "", "", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitInsn(0);
  }

  @Test
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(0, "", "", "", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      Label label0 = new Label();
      int[] intArray0 = new int[4];
      Label[] labelArray0 = new Label[6];
      // Undeclared exception!
      try {
        methodAdapter0.visitLookupSwitchInsn(label0, intArray0, labelArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      MethodAdapter methodAdapter0 = new MethodAdapter((MethodVisitor) null);
      Label label0 = new Label();
      // Undeclared exception!
      try {
        methodAdapter0.visitTryCatchBlock(label0, label0, label0, ")q+(v0`M&/qtvOt|");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-544));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "`Q>rTq+ea";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod((-544), "`Q>rTq+ea", "`Q>rTq+ea", "`Q>rTq+ea", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      AnnotationVisitor annotationVisitor0 = methodAdapter0.visitAnnotationDefault();
      assertNotNull(annotationVisitor0);
  }

  @Test
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) classWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodVisitor methodVisitor0 = classAdapter0.visitMethod(0, "", "", "", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      Label label0 = new Label();
      methodAdapter0.visitLineNumber(0, label0);
      assertEquals("L644013931", label0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      MethodAdapter methodAdapter0 = new MethodAdapter((MethodVisitor) null);
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try {
        methodAdapter0.visitFrame(0, 0, objectArray0, 0, objectArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(0, "", "", "", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      AnnotationVisitor annotationVisitor0 = methodAdapter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) classWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodVisitor methodVisitor0 = classAdapter0.visitMethod(0, "", "", "", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      Label label0 = new Label();
      Label[] labelArray0 = new Label[6];
      // Undeclared exception!
      try {
        methodAdapter0.visitTableSwitchInsn(0, 0, label0, labelArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-544));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "`Q>rTq+ea";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod((-544), "`Q>rTq+ea", "`Q>rTq+ea", "`Q>rTq+ea", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitCode();
  }

  @Test
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) classWriter0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = ":MH_wq5S";
      stringArray0[1] = ":MH_wq5S";
      stringArray0[2] = ":MH_wq5S";
      stringArray0[3] = ":MH_wq5S";
      MethodVisitor methodVisitor0 = classAdapter0.visitMethod(0, ":MH_wq5S", ":MH_wq5S", ":MH_wq5S", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      // Undeclared exception!
      try {
        methodAdapter0.visitParameterAnnotation(0, ":MH_wq5S", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 8
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) classWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodVisitor methodVisitor0 = classAdapter0.visitMethod(0, "", "", "", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitEnd();
  }

  @Test
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) classWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodVisitor methodVisitor0 = classAdapter0.visitMethod(0, "", "", "", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitFieldInsn(0, "", "", "");
  }

  @Test
  public void test19()  throws Throwable  {
      MethodAdapter methodAdapter0 = new MethodAdapter((MethodVisitor) null);
      Label label0 = new Label();
      // Undeclared exception!
      try {
        methodAdapter0.visitLabel(label0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = ".s.IFJDCS";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(0, "java/lang/dyn/Dynamic", "", ".s.IFJDCS", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      // Undeclared exception!
      try {
        methodAdapter0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-544));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "`Q>rTq+ea";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod((-544), "`Q>rTq+ea", "`Q>rTq+ea", "`Q>rTq+ea", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitMethodInsn((-544), "`Q>rTq+ea", "`Q>rTq+ea", "`Q>rTq+ea");
  }

  @Test
  public void test22()  throws Throwable  {
      MethodAdapter methodAdapter0 = new MethodAdapter((MethodVisitor) null);
      Label label0 = new Label();
      // Undeclared exception!
      try {
        methodAdapter0.visitJumpInsn(16777222, label0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "!i6)_*KQvwtYdWy(";
      stringArray0[1] = "!i6)_*KQvwtYdWy(";
      stringArray0[2] = "!i6)_*KQvwtYdWy(";
      stringArray0[3] = "!i6)_*KQvwtYdWy(";
      stringArray0[4] = "!i6)_*KQvwtYdWy(";
      stringArray0[5] = "!i6)_*KQvwtYdWy(";
      stringArray0[6] = "!i6)_*KQvwtYdWy(";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(8, "!i6)_*KQvwtYdWy(", "!i6)_*KQvwtYdWy(", "!i6)_*KQvwtYdWy(", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      methodAdapter0.visitLdcInsn((Object) "!i6)_*KQvwtYdWy(");
  }
}
