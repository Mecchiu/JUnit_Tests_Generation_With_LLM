/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.bookmarks.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.bookmarks.model.impl.BookmarksFolderCacheModel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.DebugGraphics;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BookmarksFolderCacheModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BookmarksFolderCacheModel bookmarksFolderCacheModel0 = new BookmarksFolderCacheModel();
      // Undeclared exception!
      try {
        bookmarksFolderCacheModel0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      BookmarksFolderCacheModel bookmarksFolderCacheModel0 = new BookmarksFolderCacheModel();
      String string0 = bookmarksFolderCacheModel0.toString();
      assertEquals("{uuid=null, folderId=0, groupId=0, companyId=0, userId=0, userName=null, createDate=0, modifiedDate=0, resourceBlockId=0, parentFolderId=0, name=null, description=null}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      BookmarksFolderCacheModel bookmarksFolderCacheModel0 = new BookmarksFolderCacheModel();
      bookmarksFolderCacheModel0.uuid = "";
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      bookmarksFolderCacheModel0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(0L, bookmarksFolderCacheModel0.userId);
  }

  @Test
  public void test3()  throws Throwable  {
      BookmarksFolderCacheModel bookmarksFolderCacheModel0 = new BookmarksFolderCacheModel();
      PrintStream printStream0 = DebugGraphics.logStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      bookmarksFolderCacheModel0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(0L, bookmarksFolderCacheModel0.resourceBlockId);
  }

  @Test
  public void test4()  throws Throwable  {
      BookmarksFolderCacheModel bookmarksFolderCacheModel0 = new BookmarksFolderCacheModel();
      bookmarksFolderCacheModel0.userName = "";
      PrintStream printStream0 = DebugGraphics.logStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      bookmarksFolderCacheModel0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(0L, bookmarksFolderCacheModel0.folderId);
  }
}
