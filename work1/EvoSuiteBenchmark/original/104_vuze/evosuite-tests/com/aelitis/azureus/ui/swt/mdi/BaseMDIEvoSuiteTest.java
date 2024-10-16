/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.ui.swt.mdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.ui.common.viewtitleinfo.ViewTitleInfo;
import com.aelitis.azureus.ui.mdi.MdiEntry;
import com.aelitis.azureus.ui.mdi.MdiEntryCreationListener;
import com.aelitis.azureus.ui.mdi.MdiEntryLoadedListener;
import com.aelitis.azureus.ui.mdi.MdiListener;
import com.aelitis.azureus.ui.swt.mdi.MdiEntrySWT;
import com.aelitis.azureus.ui.swt.mdi.TabbedEntry;
import com.aelitis.azureus.ui.swt.mdi.TabbedMDI;
import com.aelitis.azureus.ui.swt.views.ViewTitleInfoBetaP;
import com.aelitis.azureus.ui.swt.views.skin.Browse;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.gudy.azureus2.ui.swt.plugins.UISWTViewEventListener;
import org.gudy.azureus2.ui.swt.pluginsimpl.UISWTViewCore;
import org.gudy.azureus2.ui.swt.pluginsimpl.UISWTViewImpl;
import org.gudy.azureus2.ui.swt.views.ConfigView;
import org.gudy.azureus2.ui.swt.views.MySharesView;
import org.gudy.azureus2.ui.swt.views.MyTorrentsView;
import org.gudy.azureus2.ui.swt.views.ScrapeInfoView;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BaseMDIEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
  } 


  @Test
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          tabbedMDI0.removeListener((MdiEntryLoadedListener) null);
          assertEquals("MDI", tabbedMDI0.getUpdateUIName());
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          MdiEntrySWT mdiEntrySWT0 = tabbedMDI0.getCurrentEntrySWT();
          // Undeclared exception!
          try {
            tabbedMDI0.removeItem((MdiEntry) mdiEntrySWT0);
            fail("Expecting exception: NullPointerException");
          } catch(NullPointerException e) {
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          tabbedMDI0.setupPluginViews();
          assertEquals(false, tabbedMDI0.isVisible());
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          ConfigView configView0 = new ConfigView();
          // Undeclared exception!
          try {
            tabbedMDI0.createEntryFromEventListener("$CmDK9KB5V>@Hf", (UISWTViewEventListener) configView0, "$CmDK9KB5V>@Hf", false, (Object) "Max Downloads");
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class org.gudy.azureus2.core3.internat.MessageText
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          String[] stringArray0 = new String[7];
          tabbedMDI0.setPreferredOrder(stringArray0);
          String[] stringArray1 = tabbedMDI0.getPreferredOrder();
          assertSame(stringArray1, stringArray0);
          assertNotNull(stringArray1);
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test5()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          tabbedMDI0.removeListener((MdiListener) null);
          assertEquals(false, tabbedMDI0.isVisible());
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test6()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          MdiEntry mdiEntry0 = tabbedMDI0.getCurrentEntry();
          assertNull(mdiEntry0);
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test7()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          ViewTitleInfoBetaP viewTitleInfoBetaP0 = null;
          try {
            viewTitleInfoBetaP0 = new ViewTitleInfoBetaP();
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class org.gudy.azureus2.core3.util.SimpleTimer
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test8()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          UISWTViewCore uISWTViewCore0 = tabbedMDI0.getCoreViewFromID("password enabled");
          // Undeclared exception!
          try {
            tabbedMDI0.createEntryFromView("password enabled", uISWTViewCore0, "password enabled", (Object) "com/aelitis/azureus/ui/skin/", false, true, true);
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class org.gudy.azureus2.ui.swt.Utils
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test9()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          // Undeclared exception!
          try {
            tabbedMDI0.createWelcomeSection();
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class org.gudy.azureus2.core3.internat.MessageText
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          tabbedMDI0.addListener((MdiEntryLoadedListener) null);
          tabbedMDI0.triggerEntryLoadedListeners((MdiEntry) null);
          assertEquals("MDI", tabbedMDI0.getUpdateUIName());
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          // Undeclared exception!
          try {
            tabbedMDI0.closeEntry("browse");
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class com.aelitis.azureus.util.ConstantsVuze
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test12()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          // Undeclared exception!
          try {
            tabbedMDI0.createEntryFromView("@z_T*,;5%T0)S", (UISWTViewCore) null, "@z_T*,;5%T0)S", (Object) "essential", false, false, false);
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class org.gudy.azureus2.ui.swt.Utils
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          // Undeclared exception!
          try {
            tabbedMDI0.getEntrySWT("browse");
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class com.aelitis.azureus.util.ConstantsVuze
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test14()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          UISWTViewCore uISWTViewCore0 = tabbedMDI0.getCoreViewFromID((String) null);
          assertNull(uISWTViewCore0);
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test15()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          ScrapeInfoView scrapeInfoView0 = new ScrapeInfoView();
          // Undeclared exception!
          try {
            tabbedMDI0.createEntryFromEventListener("password enabled", (UISWTViewEventListener) scrapeInfoView0, "password enabled", false, (Object) "AZ_STAT_REQ");
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class org.gudy.azureus2.core3.internat.MessageText
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test16()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          tabbedMDI0.registerEntry("6282\"q+", (MdiEntryCreationListener) null);
          assertEquals(false, tabbedMDI0.isVisible());
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test17()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          // Undeclared exception!
          try {
            tabbedMDI0.entryExists("browse");
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class com.aelitis.azureus.util.ConstantsVuze
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test18()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          ScrapeInfoView scrapeInfoView0 = new ScrapeInfoView();
          // Undeclared exception!
          try {
            tabbedMDI0.createEntryFromEventListener("password enabled", (UISWTViewEventListener) scrapeInfoView0, "com/aelitis/azureus/ui/skin/", false, (Object) "AZ_STAT_REQ");
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class org.gudy.azureus2.core3.internat.MessageText
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test19()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          boolean boolean0 = tabbedMDI0.loadEntryByID("&cN'>iv)dYyJ", true, false, (Object) null);
          assertEquals(false, boolean0);
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test20()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          tabbedMDI0.loadCloseables();
          assertEquals(false, tabbedMDI0.isVisible());
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test21()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          MySharesView mySharesView0 = new MySharesView();
          // Undeclared exception!
          try {
            tabbedMDI0.createEntryFromSkinRef("ElgZPx'mi5o4M|zM", "ElgZPx'mi5o4M|zM", "ElgZPx'mi5o4M|zM", (String) null, (ViewTitleInfo) mySharesView0, (Object) null, false, (String) null);
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class org.gudy.azureus2.ui.swt.Utils
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test22()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          MyTorrentsView myTorrentsView0 = new MyTorrentsView();
          UISWTViewImpl uISWTViewImpl0 = null;
          try {
            uISWTViewImpl0 = new UISWTViewImpl((String) null, "d=", (UISWTViewEventListener) myTorrentsView0, (Object) null);
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class org.gudy.azureus2.core3.internat.MessageText
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test23()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          List<MdiEntry> list0 = tabbedMDI0.getChildrenOf((String) null);
          assertEquals(0, list0.size());
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test24()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          ScrapeInfoView scrapeInfoView0 = new ScrapeInfoView();
          // Undeclared exception!
          try {
            tabbedMDI0.createEntryFromEventListener("password enabled", (UISWTViewEventListener) scrapeInfoView0, "password enabled", false, (Object) "AZ_STAT_REQ");
            fail("Expecting exception: NoClassDefFoundError");
          } catch(NoClassDefFoundError e) {
            /*
             * Could not initialize class org.gudy.azureus2.core3.internat.MessageText
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test25()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          TabbedMDI tabbedMDI0 = new TabbedMDI();
          String[] stringArray0 = tabbedMDI0.getPreferredOrder();
          assertNotNull(stringArray0);
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }
}
