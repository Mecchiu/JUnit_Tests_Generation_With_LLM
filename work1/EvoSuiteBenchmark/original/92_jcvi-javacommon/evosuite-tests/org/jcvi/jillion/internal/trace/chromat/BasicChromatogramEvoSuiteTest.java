/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.internal.trace.chromat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.jcvi.jillion.core.pos.PositionSequence;
import org.jcvi.jillion.core.qual.QualitySequence;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.jcvi.jillion.internal.trace.chromat.BasicChromatogram;
import org.jcvi.jillion.internal.trace.chromat.DefaultChannel;
import org.jcvi.jillion.internal.trace.chromat.DefaultChannelGroup;
import org.jcvi.jillion.trace.chromat.Channel;
import org.jcvi.jillion.trace.chromat.ChannelGroup;
import org.jcvi.jillion.trace.chromat.Chromatogram;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BasicChromatogramEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      short[] shortArray0 = new short[17];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>((int) (short)0);
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      assertNotNull(basicChromatogram0);
      
      int int0 = basicChromatogram0.hashCode();
      assertEquals((-85796446), int0);
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      short[] shortArray0 = new short[17];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>((int) (short)0);
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      assertNotNull(basicChromatogram0);
      
      int int0 = basicChromatogram0.getNumberOfTracePositions();
      assertEquals(17, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      short[] shortArray0 = new short[17];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>((int) (short)0);
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      assertNotNull(basicChromatogram0);
      
      BasicChromatogram basicChromatogram1 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      boolean boolean0 = basicChromatogram1.equals((Object) basicChromatogram0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      short[] shortArray0 = new short[17];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>((int) (short)0);
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      basicChromatogram0.setProperties((Map<String, String>) hashMap0);
      assertEquals("{}", hashMap0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      short[] shortArray0 = new short[17];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>((int) (short)0);
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      BasicChromatogram basicChromatogram1 = new BasicChromatogram((Chromatogram) basicChromatogram0);
      assertEquals("", basicChromatogram1.getId());
  }

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      short[] shortArray0 = new short[17];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>((int) (short)0);
      BasicChromatogram basicChromatogram0 = null;
      try {
        basicChromatogram0 = new BasicChromatogram((String) null, "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * null parameter
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      short[] shortArray0 = new short[17];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>((int) (short)0);
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      assertNotNull(basicChromatogram0);
      
      boolean boolean0 = basicChromatogram0.equals((Object) "");
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      short[] shortArray0 = new short[17];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>((int) (short)0);
      hashMap0.put("", "");
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      assertNotNull(basicChromatogram0);
      
      QualitySequence qualitySequence0 = basicChromatogram0.getQualitySequence();
      assertNotNull(qualitySequence0);
      
      NucleotideSequence nucleotideSequence0 = basicChromatogram0.getNucleotideSequence();
      BasicChromatogram basicChromatogram1 = new BasicChromatogram("", nucleotideSequence0, qualitySequence0, positionSequence0, (ChannelGroup) defaultChannelGroup0);
      assertNotNull(basicChromatogram1);
      
      boolean boolean0 = basicChromatogram0.equals((Object) basicChromatogram1);
      assertEquals(false, boolean0);
  }
}
