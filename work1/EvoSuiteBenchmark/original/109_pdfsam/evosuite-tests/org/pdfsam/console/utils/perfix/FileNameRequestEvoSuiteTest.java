/*
 * This file was automatically generated by EvoSuite
 */

package org.pdfsam.console.utils.perfix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.pdfsam.console.utils.perfix.FileNameRequest;

@RunWith(EvoSuiteRunner.class)
public class FileNameRequestEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FileNameRequest fileNameRequest0 = new FileNameRequest((Integer) 0, (Integer) 0, "KkIl|6F37eF@g?x4}");
      fileNameRequest0.setBookmarkName("KkIl|6F37eF@g?x4}");
      assertEquals("KkIl|6F37eF@g?x4}", fileNameRequest0.getBookmarkName());
  }

  @Test
  public void test1()  throws Throwable  {
      FileNameRequest fileNameRequest0 = new FileNameRequest((Integer) 0, (Integer) 0, "KkIl|6F37eF@g?x4}");
      Integer integer0 = fileNameRequest0.getPageNumber();
      fileNameRequest0.setFileNumber(integer0);
      assertEquals(0.0F, integer0.floatValue(), 0.01F);
  }

  @Test
  public void test2()  throws Throwable  {
      FileNameRequest fileNameRequest0 = new FileNameRequest(0, 0, "");
      assertEquals("", fileNameRequest0.getBookmarkName());
  }

  @Test
  public void test3()  throws Throwable  {
      FileNameRequest fileNameRequest0 = new FileNameRequest((Integer) 0, (Integer) 0, "KkIl|6F37eF@g?x4}");
      String string0 = fileNameRequest0.getBookmarkName();
      assertEquals("KkIl|6F37eF@g?x4}", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      FileNameRequest fileNameRequest0 = new FileNameRequest((Integer) 0, (Integer) 0, "");
      Integer integer0 = fileNameRequest0.getFileNumber();
      assertEquals(0L, integer0.longValue());
  }

  @Test
  public void test5()  throws Throwable  {
      FileNameRequest fileNameRequest0 = new FileNameRequest();
      boolean boolean0 = fileNameRequest0.isEmpty();
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      FileNameRequest fileNameRequest0 = new FileNameRequest((Integer) 0, (Integer) 0, "");
      boolean boolean0 = fileNameRequest0.isEmpty();
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      Integer integer0 = new Integer((-550));
      FileNameRequest fileNameRequest0 = new FileNameRequest(integer0, integer0, "G(B");
      boolean boolean0 = fileNameRequest0.isEmpty();
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      FileNameRequest fileNameRequest0 = new FileNameRequest((Integer) 0, (Integer) 0, "");
      Integer integer0 = fileNameRequest0.getPageNumber();
      FileNameRequest fileNameRequest1 = new FileNameRequest();
      assertEquals(true, fileNameRequest1.isEmpty());
      
      fileNameRequest1.setPageNumber(integer0);
      boolean boolean0 = fileNameRequest1.isEmpty();
      assertEquals(false, fileNameRequest1.isEmpty());
      assertEquals(false, boolean0);
  }
}
