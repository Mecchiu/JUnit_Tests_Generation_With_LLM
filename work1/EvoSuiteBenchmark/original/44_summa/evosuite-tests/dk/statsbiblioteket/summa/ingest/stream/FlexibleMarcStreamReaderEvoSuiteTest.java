/*
 * This file was automatically generated by EvoSuite
 */

package dk.statsbiblioteket.summa.ingest.stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import dk.statsbiblioteket.summa.ingest.stream.FlexibleMarcStreamReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import org.archive.io.ReplayInputStream;
import org.junit.BeforeClass;
import org.marc4j.MarcException;
import org.marc4j.converter.CharConverter;
import org.marc4j.converter.impl.UnicodeToIso6937;

@RunWith(EvoSuiteRunner.class)
public class FlexibleMarcStreamReaderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      UnicodeToIso6937 unicodeToIso6937_0 = new UnicodeToIso6937();
      FlexibleMarcStreamReader flexibleMarcStreamReader0 = new FlexibleMarcStreamReader((InputStream) null, (CharConverter) unicodeToIso6937_0);
      byte[] byteArray0 = new byte[10];
      flexibleMarcStreamReader0.getDataAsString(byteArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2044);
      FlexibleMarcStreamReader flexibleMarcStreamReader0 = new FlexibleMarcStreamReader((InputStream) pipedInputStream0, "UTF8");
      // Undeclared exception!
      try {
        flexibleMarcStreamReader0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * Remove not supported
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[29];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)3, 1815);
      FlexibleMarcStreamReader flexibleMarcStreamReader0 = new FlexibleMarcStreamReader((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try {
        flexibleMarcStreamReader0.next();
        fail("Expecting exception: MarcException");
      } catch(MarcException e) {
        /*
         * unable to parse record length
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      FlexibleMarcStreamReader flexibleMarcStreamReader0 = new FlexibleMarcStreamReader((InputStream) null, (String) null);
      byte[] byteArray0 = new byte[12];
      String string0 = flexibleMarcStreamReader0.getDataAsString(byteArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      FlexibleMarcStreamReader flexibleMarcStreamReader0 = new FlexibleMarcStreamReader((InputStream) pipedInputStream0, "MARC8");
      assertEquals(false, flexibleMarcStreamReader0.hasNext());
  }

  @Test
  public void test5()  throws Throwable  {
      FlexibleMarcStreamReader flexibleMarcStreamReader0 = new FlexibleMarcStreamReader((InputStream) null, "ISO88591");
      assertNotNull(flexibleMarcStreamReader0);
      
      byte[] byteArray0 = new byte[18];
      String string0 = flexibleMarcStreamReader0.getDataAsString(byteArray0);
      assertNotNull(string0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)33, (int) (byte)33);
      FlexibleMarcStreamReader flexibleMarcStreamReader0 = new FlexibleMarcStreamReader((InputStream) byteArrayInputStream0, "M3Na");
      assertNotNull(flexibleMarcStreamReader0);
      
      boolean boolean0 = flexibleMarcStreamReader0.hasNext();
      assertEquals(true, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ReplayInputStream replayInputStream0 = new ReplayInputStream(byteArray0, (long) (byte)0, "&art");
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) replayInputStream0, (InputStream) replayInputStream0);
      FlexibleMarcStreamReader flexibleMarcStreamReader0 = new FlexibleMarcStreamReader((InputStream) sequenceInputStream0, "&art");
      assertNotNull(flexibleMarcStreamReader0);
      
      boolean boolean0 = flexibleMarcStreamReader0.hasNext();
      assertEquals(false, boolean0);
  }
}
