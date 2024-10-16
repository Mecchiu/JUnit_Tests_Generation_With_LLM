/*
 * This file was automatically generated by EvoSuite
 */

package org.pdfsam.guiclient.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import org.junit.BeforeClass;
import org.pdfsam.guiclient.dto.PdfFile;

@RunWith(EvoSuiteRunner.class)
public class PdfFileEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PdfFile pdfFile0 = new PdfFile();
      pdfFile0.setPassword((String) null);
      assertNull(pdfFile0.getPassword());
  }

  @Test
  public void test1()  throws Throwable  {
      PdfFile pdfFile0 = new PdfFile();
      pdfFile0.setInputFile((File) null);
      assertNull(pdfFile0.getPassword());
  }

  @Test
  public void test2()  throws Throwable  {
      PdfFile pdfFile0 = new PdfFile();
      File file0 = pdfFile0.getInputFile();
      assertNull(file0);
  }

  @Test
  public void test3()  throws Throwable  {
      PdfFile pdfFile0 = new PdfFile();
      String string0 = pdfFile0.getPassword();
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      PdfFile pdfFile0 = new PdfFile((File) null, (String) null);
      assertNull(pdfFile0.getPassword());
  }
}
