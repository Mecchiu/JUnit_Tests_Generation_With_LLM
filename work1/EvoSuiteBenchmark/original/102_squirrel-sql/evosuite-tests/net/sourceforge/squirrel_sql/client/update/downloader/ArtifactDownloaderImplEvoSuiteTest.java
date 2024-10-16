/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.client.update.downloader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.List;
import net.sourceforge.squirrel_sql.client.update.UpdateUtil;
import net.sourceforge.squirrel_sql.client.update.UpdateUtilImpl;
import net.sourceforge.squirrel_sql.client.update.downloader.ArtifactDownloaderImpl;
import net.sourceforge.squirrel_sql.client.update.downloader.DefaultRetryStrategyImpl;
import net.sourceforge.squirrel_sql.client.update.downloader.RetryStrategy;
import net.sourceforge.squirrel_sql.client.update.downloader.event.DownloadStatusListener;
import net.sourceforge.squirrel_sql.client.update.gui.ArtifactStatus;
import net.sourceforge.squirrel_sql.fw.util.IProxySettings;
import net.sourceforge.squirrel_sql.fw.util.ProxySettings;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ArtifactDownloaderImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      boolean boolean0 = artifactDownloaderImpl0.isRemoteUpdateSite();
      assertEquals(true, boolean0);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
  }

  @Test
  public void test1()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      String string0 = artifactDownloaderImpl0.getFileSystemUpdatePath();
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
      assertNull(string0);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
  }

  @Test
  public void test2()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.setHost((String) null);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test3()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      ProxySettings proxySettings0 = new ProxySettings();
      artifactDownloaderImpl0.setProxySettings((IProxySettings) proxySettings0);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test4()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.setChannelName((String) null);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test5()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      String string0 = artifactDownloaderImpl0.getHost();
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertNull(string0);
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test6()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      UpdateUtilImpl updateUtilImpl0 = new UpdateUtilImpl();
      artifactDownloaderImpl0.setUtil((UpdateUtil) updateUtilImpl0);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test7()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      
      artifactDownloaderImpl0.setReleaseVersionWillChange(true);
      // Undeclared exception!
      try {
        artifactDownloaderImpl0.run();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.setPath((String) null);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test9()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.removeDownloadListener((DownloadStatusListener) null);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test10()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      String string0 = artifactDownloaderImpl0.getPath();
      assertNull(string0);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test11()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.setIsRemoteUpdateSite(true);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test12()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.getArtifactStatus();
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test13()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.addDownloadStatusListener((DownloadStatusListener) null);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test14()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      DefaultRetryStrategyImpl defaultRetryStrategyImpl0 = new DefaultRetryStrategyImpl();
      artifactDownloaderImpl0.setRetryStrategy((RetryStrategy) defaultRetryStrategyImpl0);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test15()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.setPort(1636);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test16()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.setArtifactStatus((List<ArtifactStatus>) null);
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
  }

  @Test
  public void test17()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.setFileSystemUpdatePath((String) null);
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test18()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.stopDownload();
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test19()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.getUtil();
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
  }

  @Test
  public void test20()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      boolean boolean0 = artifactDownloaderImpl0.isReleaseVersionWillChange();
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
      assertEquals(false, boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      artifactDownloaderImpl0.start();
      assertEquals(false, artifactDownloaderImpl0.isReleaseVersionWillChange());
      assertEquals(true, artifactDownloaderImpl0.isRemoteUpdateSite());
  }

  @Test
  public void test22()  throws Throwable  {
      ArtifactDownloaderImpl artifactDownloaderImpl0 = new ArtifactDownloaderImpl((List<ArtifactStatus>) null);
      // Undeclared exception!
      try {
        artifactDownloaderImpl0.run();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
