/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.repository.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileEntrySoap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.dom4j.bean.BeanAttributeList;
import org.dom4j.bean.BeanElement;
import org.dom4j.bean.BeanMetaData;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FileEntrySoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      long long0 = fileEntrySoap0.getFileEntryId();
      assertEquals(0L, long0);
  }

  @Test
  public void test1()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      String string0 = fileEntrySoap0.getVersionUserName();
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setPrimaryKey(0L);
      assertEquals(0L, fileEntrySoap0.getRepositoryId());
  }

  @Test
  public void test3()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      long long0 = fileEntrySoap0.getRepositoryId();
      assertEquals(0L, long0);
  }

  @Test
  public void test4()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      String string0 = fileEntrySoap0.getVersion();
      assertNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      long long0 = fileEntrySoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test6()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      String string0 = fileEntrySoap0.getUserName();
      assertNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setExtension("ZK1^{>qi");
      assertEquals(0L, fileEntrySoap0.getVersionUserId());
  }

  @Test
  public void test8()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setSize(0L);
      assertNull(fileEntrySoap0.getUserName());
  }

  @Test
  public void test9()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setModifiedDate((Date) null);
      assertEquals(0L, fileEntrySoap0.getSize());
  }

  @Test
  public void test10()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setGroupId(0L);
      assertEquals(0L, fileEntrySoap0.getCompanyId());
  }

  @Test
  public void test11()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setVersionUserId(0L);
      assertEquals(0L, fileEntrySoap0.getRepositoryId());
  }

  @Test
  public void test12()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      Date date0 = fileEntrySoap0.getCreateDate();
      assertNull(date0);
  }

  @Test
  public void test13()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      long long0 = fileEntrySoap0.getFolderId();
      assertEquals(0L, long0);
  }

  @Test
  public void test14()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setDescription((String) null);
      assertEquals(0L, fileEntrySoap0.getGroupId());
  }

  @Test
  public void test15()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      long long0 = fileEntrySoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test16()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      String string0 = fileEntrySoap0.getTitle();
      assertNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      long long0 = fileEntrySoap0.getVersionUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test18()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setVersionUserName((String) null);
      assertNull(fileEntrySoap0.getUuid());
  }

  @Test
  public void test19()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      String string0 = fileEntrySoap0.getUuid();
      assertNull(string0);
  }

  @Test
  public void test20()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      Date date0 = fileEntrySoap0.getModifiedDate();
      assertNull(date0);
  }

  @Test
  public void test21()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      String string0 = fileEntrySoap0.getExtension();
      assertNull(string0);
  }

  @Test
  public void test22()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setCompanyId((-9L));
      assertEquals((-9L), fileEntrySoap0.getCompanyId());
  }

  @Test
  public void test23()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      String string0 = fileEntrySoap0.getMimeType();
      assertNull(string0);
  }

  @Test
  public void test24()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      long long0 = fileEntrySoap0.getGroupId();
      assertEquals(0L, long0);
  }

  @Test
  public void test25()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      long long0 = fileEntrySoap0.getSize();
      assertEquals(0L, long0);
  }

  @Test
  public void test26()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setVersion((String) null);
      assertNull(fileEntrySoap0.getUserName());
  }

  @Test
  public void test27()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      String string0 = fileEntrySoap0.getDescription();
      assertNull(string0);
  }

  @Test
  public void test28()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setUserName((String) null);
      assertEquals(0L, fileEntrySoap0.getGroupId());
  }

  @Test
  public void test29()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setRepositoryId(100L);
      assertEquals(100L, fileEntrySoap0.getRepositoryId());
  }

  @Test
  public void test30()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setCreateDate((Date) null);
      assertEquals(0L, fileEntrySoap0.getRepositoryId());
  }

  @Test
  public void test31()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setMimeType((String) null);
      assertNull(fileEntrySoap0.getExtension());
  }

  @Test
  public void test32()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      long long0 = fileEntrySoap0.getUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test33()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setUuid("2");
      assertNull(fileEntrySoap0.getDescription());
  }

  @Test
  public void test34()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setTitle("ZK1^{>qi");
      assertEquals("ZK1^{>qi", fileEntrySoap0.getTitle());
  }

  @Test
  public void test35()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setFolderId(0L);
      assertNull(fileEntrySoap0.getMimeType());
  }

  @Test
  public void test36()  throws Throwable  {
      FileEntrySoap fileEntrySoap0 = new FileEntrySoap();
      fileEntrySoap0.setUserId(0L);
      assertEquals(0L, fileEntrySoap0.getUserId());
  }

  @Test
  public void test37()  throws Throwable  {
      FileEntry[][] fileEntryArray0 = new FileEntry[1][5];
      // Undeclared exception!
      try {
        FileEntrySoap.toSoapModels(fileEntryArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test38()  throws Throwable  {
      ArrayList<FileEntry> arrayList0 = new ArrayList<FileEntry>();
      FileEntrySoap[] fileEntrySoapArray0 = FileEntrySoap.toSoapModels((List<FileEntry>) arrayList0);
      assertNotNull(fileEntrySoapArray0);
  }

  @Test
  public void test39()  throws Throwable  {
      Class<?> class0 = FileEntrySoap.class;
      BeanMetaData beanMetaData0 = BeanMetaData.get(class0);
      BeanAttributeList beanAttributeList0 = new BeanAttributeList((BeanElement) null, beanMetaData0);
      // Undeclared exception!
      try {
        FileEntrySoap.toSoapModels((List<FileEntry>) beanAttributeList0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * org.dom4j.bean.BeanAttribute cannot be cast to com.liferay.portal.kernel.repository.model.FileEntry
         */
      }
  }
}
