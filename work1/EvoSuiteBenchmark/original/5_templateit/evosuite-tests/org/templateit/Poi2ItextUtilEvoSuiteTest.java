/*
 * This file was automatically generated by EvoSuite
 */

package org.templateit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfPCell;
import java.awt.Color;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.junit.BeforeClass;
import org.templateit.Poi2ItextUtil;

@RunWith(EvoSuiteRunner.class)
public class Poi2ItextUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HSSFWorkbook hSSFWorkbook0 = new HSSFWorkbook();
      Poi2ItextUtil poi2ItextUtil0 = new Poi2ItextUtil(hSSFWorkbook0);
      int int0 = poi2ItextUtil0.getDefaultCharWidth();
      assertEquals(6, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      HSSFColor hSSFColor0 = new HSSFColor();
      Color color0 = Poi2ItextUtil.colorPOI2Itext(hSSFColor0);
      assertEquals("java.awt.Color[r=0,g=0,b=0]", color0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      HSSFWorkbook hSSFWorkbook0 = new HSSFWorkbook();
      Poi2ItextUtil poi2ItextUtil0 = new Poi2ItextUtil(hSSFWorkbook0);
      Font font0 = poi2ItextUtil0.chooseFont((short)1);
      assertNotNull(font0);
      assertEquals(0, font0.getStyle());
      assertEquals(1, font0.getFamily());
      assertEquals(10.0F, font0.getSize(), 0.01F);
  }

  @Test
  public void test3()  throws Throwable  {
      HSSFWorkbook hSSFWorkbook0 = new HSSFWorkbook();
      Poi2ItextUtil poi2ItextUtil0 = new Poi2ItextUtil(hSSFWorkbook0);
      HSSFSheet hSSFSheet0 = hSSFWorkbook0.createSheet("f");
      HSSFRow hSSFRow0 = hSSFSheet0.createRow(163);
      HSSFCell hSSFCell0 = hSSFRow0.createCell((short)0);
      poi2ItextUtil0.copyBackgroundColor(hSSFCell0, (PdfPCell) null);
      assertEquals(6, poi2ItextUtil0.getDefaultCharWidth());
  }

  @Test
  public void test4()  throws Throwable  {
      HSSFWorkbook hSSFWorkbook0 = new HSSFWorkbook();
      Poi2ItextUtil poi2ItextUtil0 = new Poi2ItextUtil(hSSFWorkbook0);
      HSSFSheet hSSFSheet0 = hSSFWorkbook0.createSheet("f");
      HSSFRow hSSFRow0 = hSSFSheet0.createRow(163);
      HSSFCell hSSFCell0 = hSSFRow0.createCell((short)17);
      // Undeclared exception!
      try {
        poi2ItextUtil0.copyCellHorisontalAlignment(hSSFCell0, (PdfPCell) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      HSSFWorkbook hSSFWorkbook0 = new HSSFWorkbook();
      Poi2ItextUtil poi2ItextUtil0 = new Poi2ItextUtil(hSSFWorkbook0);
      HSSFSheet hSSFSheet0 = hSSFWorkbook0.createSheet();
      HSSFRow hSSFRow0 = hSSFSheet0.createRow(949);
      HSSFCell hSSFCell0 = hSSFRow0.createCell(169, 1);
      // Undeclared exception!
      try {
        poi2ItextUtil0.copyCellHorisontalAlignment(hSSFCell0, (PdfPCell) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      HSSFWorkbook hSSFWorkbook0 = new HSSFWorkbook();
      Poi2ItextUtil poi2ItextUtil0 = new Poi2ItextUtil(hSSFWorkbook0);
      HSSFSheet hSSFSheet0 = hSSFWorkbook0.createSheet();
      HSSFRow hSSFRow0 = hSSFSheet0.createRow(959);
      HSSFCell hSSFCell0 = hSSFRow0.createCell(169, 1);
      // Undeclared exception!
      try {
        poi2ItextUtil0.copyCellBorders(hSSFCell0, (PdfPCell) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      HSSFWorkbook hSSFWorkbook0 = new HSSFWorkbook();
      Poi2ItextUtil poi2ItextUtil0 = new Poi2ItextUtil(hSSFWorkbook0);
      HSSFSheet hSSFSheet0 = hSSFWorkbook0.createSheet("f");
      HSSFRow hSSFRow0 = hSSFSheet0.createRow(163);
      HSSFCell hSSFCell0 = hSSFRow0.createCell((short)0);
      // Undeclared exception!
      try {
        poi2ItextUtil0.resetRightBorder(hSSFCell0, (PdfPCell) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
