/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.assembly.consed.phd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.jcvi.jillion.assembly.consed.phd.Phd;
import org.jcvi.jillion.assembly.consed.phd.SinglePhdWriter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SinglePhdWriterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      SinglePhdWriter singlePhdWriter0 = new SinglePhdWriter((OutputStream) byteArrayOutputStream0);
      singlePhdWriter0.close();
      assertEquals(6, byteArrayOutputStream0.size());
      assertEquals("#null\n", byteArrayOutputStream0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      SinglePhdWriter singlePhdWriter0 = new SinglePhdWriter((OutputStream) byteArrayOutputStream0);
      // Undeclared exception!
      try {
        singlePhdWriter0.write((Phd) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * phd can not be null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SinglePhdWriter singlePhdWriter0 = null;
      try {
        singlePhdWriter0 = new SinglePhdWriter((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
