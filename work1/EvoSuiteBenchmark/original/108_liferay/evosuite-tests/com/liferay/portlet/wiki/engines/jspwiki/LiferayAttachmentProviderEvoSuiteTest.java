/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.wiki.engines.jspwiki;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.ecyrd.jspwiki.QueryItem;
import com.ecyrd.jspwiki.WikiEngine;
import com.ecyrd.jspwiki.WikiPage;
import com.ecyrd.jspwiki.attachment.Attachment;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portlet.wiki.engines.jspwiki.LiferayAttachmentProvider;
import java.io.InputStream;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LiferayAttachmentProviderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LiferayAttachmentProvider liferayAttachmentProvider0 = new LiferayAttachmentProvider();
      List<Attachment> list0 = liferayAttachmentProvider0.getVersionHistory((Attachment) null);
      assertEquals(1, list0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      LiferayAttachmentProvider liferayAttachmentProvider0 = new LiferayAttachmentProvider();
      Date date0 = new Date();
      List<Attachment> list0 = liferayAttachmentProvider0.listAllChanged(date0);
      assertNotNull(list0);
      assertEquals(1372782917414L, date0.getTime());
  }

  @Test
  public void test2()  throws Throwable  {
      LiferayAttachmentProvider liferayAttachmentProvider0 = new LiferayAttachmentProvider();
      UnsyncByteArrayInputStream unsyncByteArrayInputStream0 = (UnsyncByteArrayInputStream)liferayAttachmentProvider0.getAttachmentData((Attachment) null);
      liferayAttachmentProvider0.putAttachmentData((Attachment) null, (InputStream) unsyncByteArrayInputStream0);
      assertEquals(true, unsyncByteArrayInputStream0.markSupported());
  }

  @Test
  public void test3()  throws Throwable  {
      LiferayAttachmentProvider liferayAttachmentProvider0 = new LiferayAttachmentProvider();
      Collection<Attachment> collection0 = liferayAttachmentProvider0.listAttachments((WikiPage) null);
      assertEquals(true, collection0.isEmpty());
  }

  @Test
  public void test4()  throws Throwable  {
      LiferayAttachmentProvider liferayAttachmentProvider0 = new LiferayAttachmentProvider();
      QueryItem[] queryItemArray0 = new QueryItem[20];
      Collection<Attachment> collection0 = liferayAttachmentProvider0.findAttachments(queryItemArray0);
      assertEquals(true, collection0.isEmpty());
  }

  @Test
  public void test5()  throws Throwable  {
      LiferayAttachmentProvider liferayAttachmentProvider0 = new LiferayAttachmentProvider();
      liferayAttachmentProvider0.deleteVersion((Attachment) null);
      assertEquals("com.liferay.portlet.wiki.engines.jspwiki.LiferayAttachmentProvider", liferayAttachmentProvider0.getProviderInfo());
  }

  @Test
  public void test6()  throws Throwable  {
      LiferayAttachmentProvider liferayAttachmentProvider0 = new LiferayAttachmentProvider();
      String string0 = liferayAttachmentProvider0.getProviderInfo();
      assertEquals("com.liferay.portlet.wiki.engines.jspwiki.LiferayAttachmentProvider", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      LiferayAttachmentProvider liferayAttachmentProvider0 = new LiferayAttachmentProvider();
      liferayAttachmentProvider0.deleteAttachment((Attachment) null);
      assertEquals("com.liferay.portlet.wiki.engines.jspwiki.LiferayAttachmentProvider", liferayAttachmentProvider0.getProviderInfo());
  }

  @Test
  public void test8()  throws Throwable  {
      LiferayAttachmentProvider liferayAttachmentProvider0 = new LiferayAttachmentProvider();
      liferayAttachmentProvider0.moveAttachmentsForPage("$^d~bJHI;E?$5", "$^d~bJHI;E?$5");
      assertEquals("com.liferay.portlet.wiki.engines.jspwiki.LiferayAttachmentProvider", liferayAttachmentProvider0.getProviderInfo());
  }

  @Test
  public void test9()  throws Throwable  {
      LiferayAttachmentProvider liferayAttachmentProvider0 = new LiferayAttachmentProvider();
      Properties properties0 = new Properties();
      liferayAttachmentProvider0.initialize((WikiEngine) null, properties0);
      assertEquals("{}", properties0.toString());
  }
}
