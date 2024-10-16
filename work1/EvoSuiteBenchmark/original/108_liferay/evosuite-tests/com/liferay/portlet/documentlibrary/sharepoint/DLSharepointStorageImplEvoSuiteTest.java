/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.documentlibrary.sharepoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.sharepoint.SharepointRequest;
import com.liferay.portlet.documentlibrary.sharepoint.DLSharepointStorageImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DLSharepointStorageImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DLSharepointStorageImpl dLSharepointStorageImpl0 = new DLSharepointStorageImpl();
      SharepointRequest sharepointRequest0 = new SharepointRequest("");
      try {
        dLSharepointStorageImpl0.getFolderTree(sharepointRequest0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
        /*
         * String index out of range: -1
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DLSharepointStorageImpl dLSharepointStorageImpl0 = new DLSharepointStorageImpl();
      SharepointRequest sharepointRequest0 = new SharepointRequest(",wgln4ENx[Re:w");
      try {
        dLSharepointStorageImpl0.getDocumentInputStream(sharepointRequest0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
        /*
         * String index out of range: -1
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DLSharepointStorageImpl dLSharepointStorageImpl0 = new DLSharepointStorageImpl();
      SharepointRequest sharepointRequest0 = new SharepointRequest("");
      try {
        dLSharepointStorageImpl0.createFolder(sharepointRequest0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
        /*
         * String index out of range: -1
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DLSharepointStorageImpl dLSharepointStorageImpl0 = new DLSharepointStorageImpl();
      // Undeclared exception!
      try {
        dLSharepointStorageImpl0.getFolderTree((Folder) null, "SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DLSharepointStorageImpl dLSharepointStorageImpl0 = new DLSharepointStorageImpl();
      try {
        dLSharepointStorageImpl0.getDocumentTree((SharepointRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      DLSharepointStorageImpl dLSharepointStorageImpl0 = new DLSharepointStorageImpl();
      // Undeclared exception!
      try {
        dLSharepointStorageImpl0.getFileEntryTree((FileEntry) null, "+xWuJ+?)}>j'LlGdW");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
