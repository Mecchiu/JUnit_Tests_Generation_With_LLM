/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.speedmanager.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.activities.VuzeActivitiesEntry;
import com.aelitis.azureus.core.speedmanager.SpeedManagerLimitEstimate;
import com.aelitis.azureus.core.speedmanager.SpeedManagerPingZone;
import com.aelitis.azureus.core.speedmanager.impl.SpeedManagerImpl;
import com.aelitis.azureus.core.speedmanager.impl.SpeedManagerPingMapperImpl;
import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.testcase.TestCaseExecutor;
import org.gudy.azureus2.core3.util.IndentWriter;
import org.gudy.azureus2.core3.util.Timer;
import org.gudy.azureus2.plugins.ui.tables.TableCellRefreshListener;
import org.gudy.azureus2.plugins.ui.tables.TableColumnExtraInfoListener;
import org.gudy.azureus2.ui.swt.views.columnsetup.ColumnTC_Info;
import org.gudy.azureus2.ui.swt.views.tableitems.peers.PiecesItem;
import org.gudy.azureus2.ui.swt.views.tableitems.pieces.BlocksItem;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SpeedManagerPingMapperImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 888, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      speedManagerPingMapperImpl0.addPing(888, 888, 16908294, false);
      SpeedManagerPingMapperImpl.region speedManagerPingMapperImpl_region0 = speedManagerPingMapperImpl0.addPingSupport(0, 768, 1527, 0);
      int int0 = speedManagerPingMapperImpl_region0.getDownloadEndBytesPerSec();
      assertEquals(0.0, speedManagerPingMapperImpl0.getCurrentMetricRating(), 0.01D);
      assertEquals("x=0,y=1,w=2,h=768", speedManagerPingMapperImpl_region0.getString());
      assertEquals(15000, speedManagerPingMapperImpl_region0.getMetric());
      assertEquals(196863, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "SystemTray.menu.stopalltransfers", 0, true, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingMapperImpl.pingValue speedManagerPingMapperImpl_pingValue0 = speedManagerPingMapperImpl0.new pingValue(0, (-1238), 1668113523);
      SpeedManagerPingMapperImpl.region speedManagerPingMapperImpl_region0 = speedManagerPingMapperImpl0.new region(speedManagerPingMapperImpl_pingValue0, speedManagerPingMapperImpl_pingValue0);
      assertNotNull(speedManagerPingMapperImpl_region0);
      
      String string0 = speedManagerPingMapperImpl_region0.getString();
      assertEquals(true, speedManagerPingMapperImpl0.isActive());
      assertNotNull(string0);
      assertEquals(25715, speedManagerPingMapperImpl_region0.getMetric());
      assertEquals("x=0,y=64298,w=1,h=1", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "<ot2{S7G,mR0j9CI$V*", 3, true, true);
      speedManagerPingMapperImpl0.addPingSupport(3, 0, 130, 3);
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.addPing(3, (-832), (-389564586), true);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.gudy.azureus2.core3.util.DisplayFormatters
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 888, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingZone[] speedManagerPingZoneArray0 = speedManagerPingMapperImpl0.getZones();
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
      assertNotNull(speedManagerPingZoneArray0);
  }

  @Test
  public void test4()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      speedManagerPingMapperImpl0.reset();
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
  }

  @Test
  public void test5()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate0 = (SpeedManagerPingMapperImpl.limitEstimate)speedManagerPingMapperImpl0.getEstimatedUploadCapacityBytesPerSec();
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getBytesPerSec());
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getHits());
      assertEquals(0.0F, speedManagerPingMapperImpl_limitEstimate0.getMetricRating(), 0.01F);
      assertNotNull(speedManagerPingMapperImpl_limitEstimate0);
      assertEquals(0L, speedManagerPingMapperImpl_limitEstimate0.getWhen());
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
      assertEquals((-0.1F), speedManagerPingMapperImpl_limitEstimate0.getEstimateType(), 0.01F);
  }

  @Test
  public void test6()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      speedManagerPingMapperImpl0.getLastBadUploadLimit();
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
  }

  @Test
  public void test7()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate0 = (SpeedManagerPingMapperImpl.limitEstimate)speedManagerPingMapperImpl0.getEstimatedDownloadLimit(false);
      assertEquals(0.0F, speedManagerPingMapperImpl_limitEstimate0.getMetricRating(), 0.01F);
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getBytesPerSec());
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getHits());
      assertEquals(0L, speedManagerPingMapperImpl_limitEstimate0.getWhen());
      assertNotNull(speedManagerPingMapperImpl_limitEstimate0);
      assertEquals((-0.1F), speedManagerPingMapperImpl_limitEstimate0.getEstimateType(), 0.01F);
  }

  @Test
  public void test8()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerLimitEstimate[] speedManagerLimitEstimateArray0 = speedManagerPingMapperImpl0.getBadDownloadHistory();
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
      assertNotNull(speedManagerLimitEstimateArray0);
  }

  @Test
  public void test9()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 888, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      boolean boolean0 = speedManagerPingMapperImpl0.isActive();
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "<ot2{S7G,mR0j9CI$V*", 1, true, true);
      assertNotNull(speedManagerPingMapperImpl0);
      
      speedManagerPingMapperImpl0.getLastBadDownloadLimit();
      assertEquals(true, speedManagerPingMapperImpl0.isActive());
  }

  @Test
  public void test11()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1039, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      speedManagerPingMapperImpl0.getName();
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
  }

  @Test
  public void test12()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, (String) null, 0, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerLimitEstimate[] speedManagerLimitEstimateArray0 = speedManagerPingMapperImpl0.getBadUploadHistory();
      assertNotNull(speedManagerLimitEstimateArray0);
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
  }

  @Test
  public void test13()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "<ot2{S7G,mR0j9CI$V*", 1, true, true);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate0 = (SpeedManagerPingMapperImpl.limitEstimate)speedManagerPingMapperImpl0.getEstimatedDownloadCapacityBytesPerSec();
      assertEquals(true, speedManagerPingMapperImpl0.isActive());
      assertNotNull(speedManagerPingMapperImpl_limitEstimate0);
      assertEquals(0L, speedManagerPingMapperImpl_limitEstimate0.getWhen());
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getBytesPerSec());
      assertEquals((-0.1F), speedManagerPingMapperImpl_limitEstimate0.getEstimateType(), 0.01F);
      assertEquals(0.0F, speedManagerPingMapperImpl_limitEstimate0.getMetricRating(), 0.01F);
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getHits());
  }

  @Test
  public void test14()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, (String) null, 0, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingMapperImpl.pingValue speedManagerPingMapperImpl_pingValue0 = speedManagerPingMapperImpl0.new pingValue(0, (-2032), (-2032));
      String string0 = speedManagerPingMapperImpl_pingValue0.getString();
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
      assertNotNull(string0);
      assertEquals("x=0,y=63504,m=63504", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 888, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      IndentWriter indentWriter0 = new IndentWriter((PrintWriter) null);
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.generateEvidence(indentWriter0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.gudy.azureus2.core3.util.DisplayFormatters
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "<ot2{S7G,mR0j9CI$V*", 1, true, true);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate0 = speedManagerPingMapperImpl0.getNullLimit();
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate1 = (SpeedManagerPingMapperImpl.limitEstimate)speedManagerPingMapperImpl0.adjustForPersistence(speedManagerPingMapperImpl_limitEstimate0, speedManagerPingMapperImpl_limitEstimate0, speedManagerPingMapperImpl_limitEstimate0, true);
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate1.getHits());
      assertNotNull(speedManagerPingMapperImpl_limitEstimate1);
      assertEquals((-0.1F), speedManagerPingMapperImpl_limitEstimate1.getEstimateType(), 0.01F);
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate1.getBytesPerSec());
      assertEquals(0.0F, speedManagerPingMapperImpl_limitEstimate1.getMetricRating(), 0.01F);
      assertEquals(true, speedManagerPingMapperImpl0.isActive());
      assertEquals(0L, speedManagerPingMapperImpl_limitEstimate1.getWhen());
      assertNotSame(speedManagerPingMapperImpl_limitEstimate1, speedManagerPingMapperImpl_limitEstimate0);
  }

  @Test
  public void test17()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      int[][] intArray0 = new int[5][1];
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate0 = speedManagerPingMapperImpl0.new limitEstimate(1563, (double) 129, (-261.1974628342058), 17170438, (long) 17170438, intArray0);
      speedManagerPingMapperImpl_limitEstimate0.getSegments();
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
      assertEquals(17170438L, speedManagerPingMapperImpl_limitEstimate0.getWhen());
      assertEquals(1563, speedManagerPingMapperImpl_limitEstimate0.getBytesPerSec());
      assertEquals((-1.0F), speedManagerPingMapperImpl_limitEstimate0.getMetricRating(), 0.01F);
      assertEquals(129.0F, speedManagerPingMapperImpl_limitEstimate0.getEstimateType(), 0.01F);
      assertEquals(17170438, speedManagerPingMapperImpl_limitEstimate0.getHits());
  }

  @Test
  public void test18()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1039, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      int[][] intArray0 = new int[6][9];
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate0 = speedManagerPingMapperImpl0.new limitEstimate(1039, 110.0, (double) 1039, (-1086), (long) (-1086), intArray0);
      speedManagerPingMapperImpl_limitEstimate0.setMetricRating(1.5F);
      assertEquals(1.5F, speedManagerPingMapperImpl_limitEstimate0.getMetricRating(), 0.01F);
  }

  @Test
  public void test19()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "AB)NUKq*dpn31b:@%[y", 0, false, false);
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.setEstimatedUploadCapacityBytesPerSec(0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 888, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      File file0 = new File((File) null, "");
      speedManagerPingMapperImpl0.loadHistory(file0);
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
      assertEquals(0.0, speedManagerPingMapperImpl0.getCurrentMetricRating(), 0.01D);
  }

  @Test
  public void test21()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "<ot2{S7G,mR0j9CI$V*", 3, true, true);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate0 = speedManagerPingMapperImpl0.getNullLimit();
      Map<Object, Object> map0 = speedManagerPingMapperImpl0.saveLimit(speedManagerPingMapperImpl_limitEstimate0);
      LinkedList<Object> linkedList0 = speedManagerPingMapperImpl0.loadLimits((Map) map0, "<ot2{S7G,mR0j9CI$V*");
      assertNotNull(linkedList0);
      
      String string0 = speedManagerPingMapperImpl0.getLimitString((List) linkedList0);
      assertEquals(5, map0.size());
      assertEquals(true, speedManagerPingMapperImpl0.isActive());
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getHits());
      assertEquals((-0.1F), speedManagerPingMapperImpl_limitEstimate0.getEstimateType(), 0.01F);
      assertEquals(0L, speedManagerPingMapperImpl_limitEstimate0.getWhen());
      assertNotNull(string0);
      assertEquals(0.0F, speedManagerPingMapperImpl_limitEstimate0.getMetricRating(), 0.01F);
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getBytesPerSec());
  }

  @Test
  public void test22()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "EaZ\"TWbHR1qyF4FN", 0, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      VuzeActivitiesEntry vuzeActivitiesEntry0 = new VuzeActivitiesEntry(435L, "EaZ\"TWbHR1qyF4FN", "EaZ\"TWbHR1qyF4FN");
      Map<String, Object> map0 = vuzeActivitiesEntry0.toMap();
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.loadLimit(map0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1039, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate0 = speedManagerPingMapperImpl0.loadLimit((Map) null);
      assertNotNull(speedManagerPingMapperImpl_limitEstimate0);
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getHits());
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getBytesPerSec());
      assertEquals(0.0F, speedManagerPingMapperImpl_limitEstimate0.getMetricRating(), 0.01F);
      assertEquals(0L, speedManagerPingMapperImpl_limitEstimate0.getWhen());
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
      assertEquals((-0.1F), speedManagerPingMapperImpl_limitEstimate0.getEstimateType(), 0.01F);
  }

  @Test
  public void test24()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      Map<Object, Object> map0 = speedManagerPingMapperImpl0.saveLimit((SpeedManagerPingMapperImpl.limitEstimate) null);
      Timer timer0 = new Timer("", 0);
      List<Object> list0 = timer0.getEvents();
      speedManagerPingMapperImpl0.saveLimits((Map) map0, "", (List) list0);
      assertEquals(6, map0.size());
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
  }

  @Test
  public void test25()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "j3V.5N>FkdobWLoN", 1579, true, true);
      ColumnTC_Info columnTC_Info0 = new ColumnTC_Info("j3V.5N>FkdobWLoN");
      List<TableColumnExtraInfoListener> list0 = columnTC_Info0.getColumnExtraInfoListeners();
      speedManagerPingMapperImpl0.saveLimits((Map) null, "j3V.5N>FkdobWLoN", (List) list0);
  }

  @Test
  public void test26()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "<ot2{S7G,mR0j9CI$V*", 1, false, false);
      PiecesItem piecesItem0 = null;
      try {
        piecesItem0 = new PiecesItem("<ot2{S7G,mR0j9CI$V*");
        fail("Expecting exception: ThreadDeath");
      } catch(ThreadDeath e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      speedManagerPingMapperImpl0.addSpeed(0, 129);
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
  }

  @Test
  public void test28()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 888, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      speedManagerPingMapperImpl0.addPing(888, 888, 0, false);
      assertEquals(0.0, speedManagerPingMapperImpl0.getCurrentMetricRating(), 0.01D);
  }

  @Test
  public void test29()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "|hdK\u0001QNe->MHx:z<+a", 0, true, true);
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.addPing(0, 1857, 1, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "<ot2{S7G,mR0j9CI$V*", 1, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      speedManagerPingMapperImpl0.addPing(1, (-832), (-389564586), false);
      int[][] intArray0 = speedManagerPingMapperImpl0.getHistory();
      assertNotNull(intArray0);
      assertEquals(0.0, speedManagerPingMapperImpl0.getCurrentMetricRating(), 0.01D);
  }

  @Test
  public void test31()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "@,", 1261, true, true);
      assertNotNull(speedManagerPingMapperImpl0);
      
      speedManagerPingMapperImpl0.adjustForPersistence((SpeedManagerPingMapperImpl.limitEstimate) null, (SpeedManagerPingMapperImpl.limitEstimate) null, (SpeedManagerPingMapperImpl.limitEstimate) null, true);
      assertEquals(true, speedManagerPingMapperImpl0.isActive());
  }

  @Test
  public void test32()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 1, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate0 = (SpeedManagerPingMapperImpl.limitEstimate)speedManagerPingMapperImpl0.getEstimatedUploadLimit(true);
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getBytesPerSec());
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
      assertEquals((-0.1F), speedManagerPingMapperImpl_limitEstimate0.getEstimateType(), 0.01F);
      assertEquals(0.0F, speedManagerPingMapperImpl_limitEstimate0.getMetricRating(), 0.01F);
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getHits());
      assertNotNull(speedManagerPingMapperImpl_limitEstimate0);
      assertEquals(0L, speedManagerPingMapperImpl_limitEstimate0.getWhen());
  }

  @Test
  public void test33()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "SystemTray.menu.stopalltransfers", 0, true, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate0 = speedManagerPingMapperImpl0.getEstimatedLimit(true);
      assertNotNull(speedManagerPingMapperImpl_limitEstimate0);
      
      int[][] intArray0 = new int[5][6];
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate1 = speedManagerPingMapperImpl0.new limitEstimate((-1238), (double) (-1238), (double) 0, (-504), (long) (-504), intArray0);
      SpeedManagerPingMapperImpl.limitEstimate speedManagerPingMapperImpl_limitEstimate2 = (SpeedManagerPingMapperImpl.limitEstimate)speedManagerPingMapperImpl0.adjustForPersistence(speedManagerPingMapperImpl_limitEstimate0, speedManagerPingMapperImpl_limitEstimate0, speedManagerPingMapperImpl_limitEstimate1, true);
      assertEquals(-1238, speedManagerPingMapperImpl_limitEstimate1.getBytesPerSec());
      assertNotSame(speedManagerPingMapperImpl_limitEstimate0, speedManagerPingMapperImpl_limitEstimate2);
      assertEquals((-0.1F), speedManagerPingMapperImpl_limitEstimate0.getEstimateType(), 0.01F);
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate0.getHits());
      assertEquals(-504, speedManagerPingMapperImpl_limitEstimate1.getHits());
      assertNotNull(speedManagerPingMapperImpl_limitEstimate2);
      assertEquals((-504L), speedManagerPingMapperImpl_limitEstimate1.getWhen());
      assertEquals(0.0F, speedManagerPingMapperImpl_limitEstimate0.getMetricRating(), 0.01F);
      assertEquals(0, speedManagerPingMapperImpl_limitEstimate2.getBytesPerSec());
      assertEquals(0L, speedManagerPingMapperImpl_limitEstimate0.getWhen());
      assertEquals(true, speedManagerPingMapperImpl0.isActive());
  }

  @Test
  public void test34()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "VcT&->m%x5tt'OY", 61443, true, true);
      speedManagerPingMapperImpl0.addPingSupport(1492, 61443, 61443, 8197);
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.addPing(61443, 61443, 61443, false);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.gudy.azureus2.core3.util.DisplayFormatters
         */
      }
  }

  @Test
  public void test35()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "@,", 1261, true, true);
      assertNotNull(speedManagerPingMapperImpl0);
      
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.setEstimatedDownloadCapacityBytesPerSec(204, 1724.9822F);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test36()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "dH,J<'nrUO@wUSA*O", 0, true, true);
      assertNotNull(speedManagerPingMapperImpl0);
      
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.setEstimatedDownloadCapacityBytesPerSec(0, (-1106.5876F));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test37()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "s3", 0, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.setEstimatedUploadCapacityBytesPerSec((-1272), 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test38()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "", 888, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      String string0 = speedManagerPingMapperImpl0.getLimitStr((List) null, false);
      assertEquals(false, speedManagerPingMapperImpl0.isActive());
      assertNotNull(string0);
  }

  @Test
  public void test39()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "<ot2{S7G,mR0j9CI$V*", 3, true, true);
      assertNotNull(speedManagerPingMapperImpl0);
      
      LinkedList<SpeedManagerLimitEstimate> linkedList0 = new LinkedList<SpeedManagerLimitEstimate>();
      String string0 = speedManagerPingMapperImpl0.getLimitStr((List) linkedList0, false);
      assertNotNull(string0);
      assertEquals(true, speedManagerPingMapperImpl0.isActive());
  }

  @Test
  public void test40()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, (String) null, 941, false, false);
      BlocksItem blocksItem0 = new BlocksItem();
      List<Object> list0 = blocksItem0.getCellAddedListeners();
      speedManagerPingMapperImpl0.getLimitStr((List) list0, false);
  }

  @Test
  public void test41()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, (String) null, 0, false, false);
      assertNotNull(speedManagerPingMapperImpl0);
      
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.destroy();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.gudy.azureus2.core3.logging.Logger
         */
      }
  }

  @Test
  public void test42()  throws Throwable  {
      SpeedManagerPingMapperImpl speedManagerPingMapperImpl0 = new SpeedManagerPingMapperImpl((SpeedManagerImpl) null, "Y\"mth?9504m&U", 0, false, true);
      assertNotNull(speedManagerPingMapperImpl0);
      
      // Undeclared exception!
      try {
        speedManagerPingMapperImpl0.destroy();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
