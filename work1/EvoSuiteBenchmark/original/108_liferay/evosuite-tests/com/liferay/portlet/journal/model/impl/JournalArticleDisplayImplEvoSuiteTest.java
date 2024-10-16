/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.journal.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.journal.model.impl.JournalArticleDisplayImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JournalArticleDisplayImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-14L), (long) 0, (-14L), (-14L), (long) 0, "@", (double) 0, "@", "@", "@", stringArray0, (String) null, (String) null, "@", "@", true, (long) 0, "@", 0, 0, true, true);
      String string0 = journalArticleDisplayImpl0.getUrlTitle();
      assertEquals((-14L), journalArticleDisplayImpl0.getCompanyId());
      assertEquals(0L, journalArticleDisplayImpl0.getUserId());
      assertNotNull(string0);
      assertEquals(0L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(0.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(0L, journalArticleDisplayImpl0.getId());
      assertEquals((-14L), journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals((-14L), journalArticleDisplayImpl0.getGroupId());
  }

  @Test
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[3];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-1348L), (-1348L), (-1348L), (-1348L), (-1348L), "%LFX :1)M:Wg)9q%", (double) (-1348L), "%LFX :1)M:Wg)9q%", "%LFX :1)M:Wg)9q%", "%LFX :1)M:Wg)9q%", stringArray0, (String) null, (String) null, (String) null, (String) null, true, (-1348L), (String) null, 434, 434, true, true);
      journalArticleDisplayImpl0.setCurrentPage(434);
      assertEquals((-1348L), journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals((-1348L), journalArticleDisplayImpl0.getSmallImageId());
      assertEquals((-1348L), journalArticleDisplayImpl0.getUserId());
      assertEquals((-1348L), journalArticleDisplayImpl0.getCompanyId());
      assertEquals(434, journalArticleDisplayImpl0.getCurrentPage());
      assertEquals((-1348L), journalArticleDisplayImpl0.getGroupId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals((-1348L), journalArticleDisplayImpl0.getId());
  }

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      boolean boolean0 = journalArticleDisplayImpl0.isCacheable();
      assertEquals(1097.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(1097L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(1097L, journalArticleDisplayImpl0.getId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(true, boolean0);
      assertEquals(1097L, journalArticleDisplayImpl0.getUserId());
      assertEquals(1097L, journalArticleDisplayImpl0.getCompanyId());
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[2];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(7L, 7L, 7L, 7L, 7L, "", (double) 7L, "", "", "", stringArray0, "", (String) null, "", "", false, 7L, "", (-1635), (-1635), false, false);
      boolean boolean0 = journalArticleDisplayImpl0.isSmallImage();
      assertEquals(7L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(7L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(7L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(7.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(7L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(7L, journalArticleDisplayImpl0.getUserId());
      assertEquals(7L, journalArticleDisplayImpl0.getId());
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      journalArticleDisplayImpl0.setNumberOfPages(19);
      assertEquals(1097.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(1097L, journalArticleDisplayImpl0.getId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(1097L, journalArticleDisplayImpl0.getUserId());
      assertEquals(1097L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(1097L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(19, journalArticleDisplayImpl0.getNumberOfPages());
      assertEquals(1097L, journalArticleDisplayImpl0.getGroupId());
  }

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[3];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-1348L), (-1348L), (-1348L), (-1348L), (-1348L), "%LFX :1)M:Wg)9q%", (double) (-1348L), "%LFX :1)M:Wg)9q%", "%LFX :1)M:Wg)9q%", "%LFX :1)M:Wg)9q%", stringArray0, (String) null, (String) null, (String) null, (String) null, true, (-1348L), (String) null, 434, 434, true, true);
      long long0 = journalArticleDisplayImpl0.getResourcePrimKey();
      assertEquals((-1348L), journalArticleDisplayImpl0.getCompanyId());
      assertEquals((-1348L), journalArticleDisplayImpl0.getGroupId());
      assertEquals((-1348.0), journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals((-1348L), journalArticleDisplayImpl0.getId());
      assertEquals((-1348L), journalArticleDisplayImpl0.getUserId());
      assertEquals((-1348L), journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals((-1348L), long0);
  }

  @Test
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      String string0 = journalArticleDisplayImpl0.getStructureId();
      assertEquals(1097.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(1097L, journalArticleDisplayImpl0.getUserId());
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertNull(string0);
      assertEquals(1097L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(1097L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(1097L, journalArticleDisplayImpl0.getId());
      assertEquals(1097L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
  }

  @Test
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      String string0 = journalArticleDisplayImpl0.getSmallImageURL();
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(1097L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(1097L, journalArticleDisplayImpl0.getUserId());
      assertEquals(1097L, journalArticleDisplayImpl0.getSmallImageId());
      assertNotNull(string0);
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1097L, journalArticleDisplayImpl0.getId());
      assertEquals(1097L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(1097.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
  }

  @Test
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[27];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-6L), (-6L), (-6L), (-6L), (-6L), "]cwN", (double) (-6L), "]cwN", "]cwN", "]cwN", stringArray0, (String) null, (String) null, (String) null, (String) null, false, (-6L), (String) null, 0, 0, false, false);
      String string0 = journalArticleDisplayImpl0.getTitle();
      assertEquals((-6L), journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals((-6L), journalArticleDisplayImpl0.getGroupId());
      assertEquals(false, journalArticleDisplayImpl0.isSmallImage());
      assertEquals((-6L), journalArticleDisplayImpl0.getCompanyId());
      assertNotNull(string0);
      assertEquals((-6L), journalArticleDisplayImpl0.getUserId());
      assertEquals((-6L), journalArticleDisplayImpl0.getId());
      assertEquals((-6.0), journalArticleDisplayImpl0.getVersion(), 0.01D);
  }

  @Test
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[14];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1L, 1L, 1L, 1L, 1L, "9Llj4tS- jk#vfX", (double) 1L, (String) null, (String) null, (String) null, stringArray0, "9Llj4tS- jk#vfX", "9Llj4tS- jk#vfX", "9Llj4tS- jk#vfX", (String) null, true, 1L, "9Llj4tS- jk#vfX", (-8), (-8), true, true);
      boolean boolean0 = journalArticleDisplayImpl0.isPaginate();
      assertEquals(1.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(true, boolean0);
      assertEquals(1L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(1L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(1L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(1L, journalArticleDisplayImpl0.getUserId());
      assertEquals(1L, journalArticleDisplayImpl0.getId());
  }

  @Test
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[2];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((long) 176, (long) 176, (long) 176, 868L, 868L, "WX#cJM\")#@m\"`}%s", (double) 868L, "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", stringArray0, "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", true, 868L, "WX#cJM\")#@m\"`}%s", 176, 176, true, true);
      journalArticleDisplayImpl0.setSmallImageId(868L);
      assertEquals(176L, journalArticleDisplayImpl0.getId());
      assertEquals(176L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(868L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(868L, journalArticleDisplayImpl0.getUserId());
      assertEquals(868.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(176L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(868L, journalArticleDisplayImpl0.getSmallImageId());
  }

  @Test
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-14L), (long) 0, (-14L), (-14L), (long) 0, "@", (double) 0, "@", "@", "@", stringArray0, (String) null, (String) null, "@", "@", true, (long) 0, "@", 0, 0, true, true);
      long long0 = journalArticleDisplayImpl0.getGroupId();
      assertEquals(0L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals((-14L), journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals((-14L), journalArticleDisplayImpl0.getCompanyId());
      assertEquals(0L, journalArticleDisplayImpl0.getId());
      assertEquals(0L, journalArticleDisplayImpl0.getUserId());
      assertEquals((-14L), long0);
      assertEquals(0.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[2];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((long) 176, (long) 176, (long) 176, 868L, 868L, "WX#cJM\")#@m\"`}%s", (double) 868L, "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", stringArray0, "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", true, 868L, "WX#cJM\")#@m\"`}%s", 176, 176, true, true);
      journalArticleDisplayImpl0.setStructureId("WX#cJM\")#@m\"`}%s");
      assertEquals(176L, journalArticleDisplayImpl0.getId());
      assertEquals(868L, journalArticleDisplayImpl0.getUserId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(176L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(176L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(868L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(868L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(868.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      int int0 = journalArticleDisplayImpl0.getCurrentPage();
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1097L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(1097L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(19, int0);
      assertEquals(1097L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(1097L, journalArticleDisplayImpl0.getId());
      assertEquals(1097.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
  }

  @Test
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      long long0 = journalArticleDisplayImpl0.getUserId();
      assertEquals(1097L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(1097L, long0);
      assertEquals(1097L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(1097L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(1097.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1097L, journalArticleDisplayImpl0.getId());
  }

  @Test
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[27];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-6L), (-6L), (-6L), (-6L), (-6L), "]cwN", (double) (-6L), "]cwN", "]cwN", "]cwN", stringArray0, (String) null, (String) null, (String) null, (String) null, false, (-6L), (String) null, 0, 0, false, false);
      journalArticleDisplayImpl0.setTemplateId("]cwN");
      assertEquals((-6L), journalArticleDisplayImpl0.getCompanyId());
      assertEquals((-6L), journalArticleDisplayImpl0.getGroupId());
      assertEquals(false, journalArticleDisplayImpl0.isSmallImage());
      assertEquals((-6.0), journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals((-6L), journalArticleDisplayImpl0.getSmallImageId());
      assertEquals((-6L), journalArticleDisplayImpl0.getUserId());
      assertEquals((-6L), journalArticleDisplayImpl0.getId());
      assertEquals((-6L), journalArticleDisplayImpl0.getResourcePrimKey());
  }

  @Test
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[2];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((long) 176, (long) 176, (long) 176, 868L, 868L, "WX#cJM\")#@m\"`}%s", (double) 868L, "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", stringArray0, "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", true, 868L, "WX#cJM\")#@m\"`}%s", 176, 176, true, true);
      String string0 = journalArticleDisplayImpl0.getDescription();
      assertEquals(868.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(868L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertNotNull(string0);
      assertEquals(868L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(176L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(176L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(868L, journalArticleDisplayImpl0.getUserId());
      assertEquals(176L, journalArticleDisplayImpl0.getId());
  }

  @Test
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[27];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-6L), (-6L), (-6L), (-6L), (-6L), "]cwN", (double) (-6L), "]cwN", "]cwN", "]cwN", stringArray0, (String) null, (String) null, (String) null, (String) null, false, (-6L), (String) null, 0, 0, false, false);
      journalArticleDisplayImpl0.setSmallImage(false);
      assertEquals((-6L), journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals((-6L), journalArticleDisplayImpl0.getCompanyId());
      assertEquals((-6.0), journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals((-6L), journalArticleDisplayImpl0.getId());
      assertEquals(false, journalArticleDisplayImpl0.isSmallImage());
      assertEquals((-6L), journalArticleDisplayImpl0.getUserId());
      assertEquals((-6L), journalArticleDisplayImpl0.getSmallImageId());
      assertEquals((-6L), journalArticleDisplayImpl0.getGroupId());
  }

  @Test
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[14];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1L, 1L, 1L, 1L, 1L, "9Llj4tS- jk#vfX", (double) 1L, (String) null, (String) null, (String) null, stringArray0, "9Llj4tS- jk#vfX", "9Llj4tS- jk#vfX", "9Llj4tS- jk#vfX", (String) null, true, 1L, "9Llj4tS- jk#vfX", (-8), (-8), true, true);
      String string0 = journalArticleDisplayImpl0.getArticleId();
      assertEquals(1L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(1L, journalArticleDisplayImpl0.getUserId());
      assertEquals(1L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(1L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(1L, journalArticleDisplayImpl0.getId());
      assertEquals(1L, journalArticleDisplayImpl0.getCompanyId());
      assertNotNull(string0);
      assertEquals(1.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
  }

  @Test
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      journalArticleDisplayImpl0.setCacheable(true);
      assertEquals(1097L, journalArticleDisplayImpl0.getId());
      assertEquals(1097L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(true, journalArticleDisplayImpl0.isCacheable());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1097L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(1097.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(1097L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(1097L, journalArticleDisplayImpl0.getUserId());
  }

  @Test
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      String string0 = journalArticleDisplayImpl0.getType();
      assertEquals(1097L, journalArticleDisplayImpl0.getId());
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertNotNull(string0);
      assertEquals(1097.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1097L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(1097L, journalArticleDisplayImpl0.getUserId());
      assertEquals(1097L, journalArticleDisplayImpl0.getSmallImageId());
  }

  @Test
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[27];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-6L), (-6L), (-6L), (-6L), (-6L), "]cwN", (double) (-6L), "]cwN", "]cwN", "]cwN", stringArray0, (String) null, (String) null, (String) null, (String) null, false, (-6L), (String) null, 0, 0, false, false);
      journalArticleDisplayImpl0.setPaginate(false);
      assertEquals(false, journalArticleDisplayImpl0.isSmallImage());
      assertEquals((-6L), journalArticleDisplayImpl0.getCompanyId());
      assertEquals((-6L), journalArticleDisplayImpl0.getId());
      assertEquals((-6L), journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals((-6L), journalArticleDisplayImpl0.getGroupId());
      assertEquals((-6L), journalArticleDisplayImpl0.getUserId());
      assertEquals(false, journalArticleDisplayImpl0.isPaginate());
      assertEquals((-6L), journalArticleDisplayImpl0.getSmallImageId());
  }

  @Test
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-14L), (long) 0, (-14L), (-14L), (long) 0, "@", (double) 0, "@", "@", "@", stringArray0, (String) null, (String) null, "@", "@", true, (long) 0, "@", 0, 0, true, true);
      String string0 = journalArticleDisplayImpl0.getContent();
      assertEquals((-14L), journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(0.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(0L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals((-14L), journalArticleDisplayImpl0.getGroupId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(0L, journalArticleDisplayImpl0.getId());
      assertEquals((-14L), journalArticleDisplayImpl0.getCompanyId());
      assertEquals(0L, journalArticleDisplayImpl0.getUserId());
      assertNull(string0);
  }

  @Test
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      long long0 = journalArticleDisplayImpl0.getSmallImageId();
      assertEquals(1097L, journalArticleDisplayImpl0.getUserId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1097L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(1097.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(1097L, long0);
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(1097L, journalArticleDisplayImpl0.getId());
      assertEquals(1097L, journalArticleDisplayImpl0.getGroupId());
  }

  @Test
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      long long0 = journalArticleDisplayImpl0.getId();
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1097L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(1097L, long0);
      assertEquals(1097L, journalArticleDisplayImpl0.getUserId());
      assertEquals(1097.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
  }

  @Test
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[3];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-1348L), (-1348L), (-1348L), (-1348L), (-1348L), "%LFX :1)M:Wg)9q%", (double) (-1348L), "%LFX :1)M:Wg)9q%", "%LFX :1)M:Wg)9q%", "%LFX :1)M:Wg)9q%", stringArray0, (String) null, (String) null, (String) null, (String) null, true, (-1348L), (String) null, 434, 434, true, true);
      journalArticleDisplayImpl0.setContent("%LFX :1)M:Wg)9q%");
      assertEquals((-1348.0), journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals((-1348L), journalArticleDisplayImpl0.getId());
      assertEquals((-1348L), journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals((-1348L), journalArticleDisplayImpl0.getCompanyId());
      assertEquals((-1348L), journalArticleDisplayImpl0.getUserId());
      assertEquals((-1348L), journalArticleDisplayImpl0.getSmallImageId());
      assertEquals((-1348L), journalArticleDisplayImpl0.getGroupId());
  }

  @Test
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[27];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((-6L), (-6L), (-6L), (-6L), (-6L), "]cwN", (double) (-6L), "]cwN", "]cwN", "]cwN", stringArray0, (String) null, (String) null, (String) null, (String) null, false, (-6L), (String) null, 0, 0, false, false);
      int int0 = journalArticleDisplayImpl0.getNumberOfPages();
      assertEquals((-6L), journalArticleDisplayImpl0.getId());
      assertEquals((-6L), journalArticleDisplayImpl0.getGroupId());
      assertEquals((-6L), journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(0, int0);
      assertEquals((-6.0), journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals((-6L), journalArticleDisplayImpl0.getUserId());
      assertEquals((-6L), journalArticleDisplayImpl0.getCompanyId());
      assertEquals((-6L), journalArticleDisplayImpl0.getResourcePrimKey());
  }

  @Test
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[14];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1L, 1L, 1L, 1L, 1L, "9Llj4tS- jk#vfX", (double) 1L, (String) null, (String) null, (String) null, stringArray0, "9Llj4tS- jk#vfX", "9Llj4tS- jk#vfX", "9Llj4tS- jk#vfX", (String) null, true, 1L, "9Llj4tS- jk#vfX", (-8), (-8), true, true);
      String string0 = journalArticleDisplayImpl0.getTemplateId();
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(1L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(1L, journalArticleDisplayImpl0.getUserId());
      assertEquals(1L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertNull(string0);
      assertEquals(1L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(1L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(1L, journalArticleDisplayImpl0.getId());
  }

  @Test
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[2];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((long) 176, (long) 176, (long) 176, 868L, 868L, "WX#cJM\")#@m\"`}%s", (double) 868L, "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", stringArray0, "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", true, 868L, "WX#cJM\")#@m\"`}%s", 176, 176, true, true);
      long long0 = journalArticleDisplayImpl0.getCompanyId();
      assertEquals(868L, journalArticleDisplayImpl0.getSmallImageId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(868L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(176L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(176L, long0);
      assertEquals(868L, journalArticleDisplayImpl0.getUserId());
      assertEquals(176L, journalArticleDisplayImpl0.getId());
      assertEquals(868.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
  }

  @Test
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl(1097L, 1097L, 1097L, 1097L, 1097L, "&TJ+Y6bE5eT", (double) 1097L, "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", "&TJ+Y6bE5eT", stringArray0, (String) null, "&TJ+Y6bE5eT", (String) null, "&TJ+Y6bE5eT", true, 1097L, "&TJ+Y6bE5eT", 19, 19, true, true);
      double double0 = journalArticleDisplayImpl0.getVersion();
      assertEquals(1097L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(1097L, journalArticleDisplayImpl0.getUserId());
      assertEquals(1097.0, double0, 0.01D);
      assertEquals(1097L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(1097L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(1097L, journalArticleDisplayImpl0.getId());
  }

  @Test
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[2];
      JournalArticleDisplayImpl journalArticleDisplayImpl0 = new JournalArticleDisplayImpl((long) 176, (long) 176, (long) 176, 868L, 868L, "WX#cJM\")#@m\"`}%s", (double) 868L, "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", stringArray0, "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", "WX#cJM\")#@m\"`}%s", true, 868L, "WX#cJM\")#@m\"`}%s", 176, 176, true, true);
      journalArticleDisplayImpl0.setSmallImageURL("WX#cJM\")#@m\"`}%s");
      assertEquals(true, journalArticleDisplayImpl0.isSmallImage());
      assertEquals(868.0, journalArticleDisplayImpl0.getVersion(), 0.01D);
      assertEquals(868L, journalArticleDisplayImpl0.getUserId());
      assertEquals(176L, journalArticleDisplayImpl0.getId());
      assertEquals(868L, journalArticleDisplayImpl0.getGroupId());
      assertEquals(176L, journalArticleDisplayImpl0.getResourcePrimKey());
      assertEquals(176L, journalArticleDisplayImpl0.getCompanyId());
      assertEquals(868L, journalArticleDisplayImpl0.getSmallImageId());
  }
}
