/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.zip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.zip.ZipReaderImpl;
import de.schlichtherle.io.ArchiveDetector;
import de.schlichtherle.io.DefaultArchiveDetector;
import de.schlichtherle.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ZipReaderImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultArchiveDetector defaultArchiveDetector0 = (DefaultArchiveDetector)File.getDefaultArchiveDetector();
      File file0 = new File("", (ArchiveDetector) defaultArchiveDetector0);
      ZipReaderImpl zipReaderImpl0 = new ZipReaderImpl((java.io.File) file0);
      zipReaderImpl0.getEntryAsByteArray("");
      assertEquals("ear|jar|war|zip", defaultArchiveDetector0.getSuffixes());
  }

  @Test
  public void test1()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 461);
      ZipReaderImpl zipReaderImpl0 = null;
      try {
        zipReaderImpl0 = new ZipReaderImpl((InputStream) pushbackInputStream0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      java.io.File file0 = new java.io.File(".", ".");
      ZipReaderImpl zipReaderImpl0 = new ZipReaderImpl(file0);
      // Undeclared exception!
      try {
        zipReaderImpl0.getEntries();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class de.schlichtherle.io.ArchiveControllers
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultArchiveDetector defaultArchiveDetector0 = (DefaultArchiveDetector)File.getDefaultArchiveDetector();
      File file0 = new File("bDOZ", (ArchiveDetector) defaultArchiveDetector0);
      ZipReaderImpl zipReaderImpl0 = new ZipReaderImpl((java.io.File) file0);
      String string0 = zipReaderImpl0.getEntryAsString("/mnt/fastdata/ac1gf/SF110/dist/108_liferay/bDOZ");
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultArchiveDetector defaultArchiveDetector0 = (DefaultArchiveDetector)File.getDefaultArchiveDetector();
      File file0 = new File("", (ArchiveDetector) defaultArchiveDetector0);
      ZipReaderImpl zipReaderImpl0 = new ZipReaderImpl((java.io.File) file0);
      InputStream inputStream0 = zipReaderImpl0.getEntryAsInputStream((String) null);
      assertNull(inputStream0);
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultArchiveDetector defaultArchiveDetector0 = (DefaultArchiveDetector)File.getDefaultArchiveDetector();
      File file0 = new File("bDOZ", (ArchiveDetector) defaultArchiveDetector0);
      ZipReaderImpl zipReaderImpl0 = new ZipReaderImpl((java.io.File) file0);
      String string0 = zipReaderImpl0.getEntryAsString("bDOZ");
      assertNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      java.io.File file0 = new java.io.File(".", ".");
      ZipReaderImpl zipReaderImpl0 = new ZipReaderImpl(file0);
      InputStream inputStream0 = zipReaderImpl0.getEntryAsInputStream(".");
      assertNull(inputStream0);
  }

  @Test
  public void test7()  throws Throwable  {
      DefaultArchiveDetector defaultArchiveDetector0 = (DefaultArchiveDetector)File.getDefaultArchiveDetector();
      File file0 = new File("", (ArchiveDetector) defaultArchiveDetector0);
      ZipReaderImpl zipReaderImpl0 = new ZipReaderImpl((java.io.File) file0);
      String string0 = zipReaderImpl0.getEntryAsString("");
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      DefaultArchiveDetector defaultArchiveDetector0 = (DefaultArchiveDetector)File.getDefaultArchiveDetector();
      File file0 = new File("bDOZ", (ArchiveDetector) defaultArchiveDetector0);
      ZipReaderImpl zipReaderImpl0 = new ZipReaderImpl((java.io.File) file0);
      List<String> list0 = zipReaderImpl0.getFolderEntries("bDOZ");
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultArchiveDetector defaultArchiveDetector0 = (DefaultArchiveDetector)File.getDefaultArchiveDetector();
      File file0 = new File("", (ArchiveDetector) defaultArchiveDetector0);
      ZipReaderImpl zipReaderImpl0 = new ZipReaderImpl((java.io.File) file0);
      List<String> list0 = zipReaderImpl0.getFolderEntries("");
      assertEquals(true, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultArchiveDetector defaultArchiveDetector0 = ArchiveDetector.NULL;
      File file0 = defaultArchiveDetector0.createFile("/", "/");
      ZipReaderImpl zipReaderImpl0 = new ZipReaderImpl((java.io.File) file0);
      List<String> list0 = zipReaderImpl0.getFolderEntries("/");
      assertNotNull(list0);
      assertEquals(3, list0.size());
  }
}
