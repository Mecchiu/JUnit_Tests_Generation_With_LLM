/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.internal.trace.chromat.scf.header;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.jcvi.jillion.internal.trace.chromat.scf.header.DefaultSCFHeader;
import org.jcvi.jillion.internal.trace.chromat.scf.header.DefaultSCFHeaderCodec;
import org.jcvi.jillion.internal.trace.chromat.scf.header.SCFHeader;
import org.jcvi.jillion.internal.trace.chromat.scf.header.SCFHeaderDecoderException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultSCFHeaderCodecEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultSCFHeaderCodec defaultSCFHeaderCodec0 = DefaultSCFHeaderCodec.INSTANCE;
      DefaultSCFHeader defaultSCFHeader0 = new DefaultSCFHeader();
      ByteBuffer byteBuffer0 = defaultSCFHeaderCodec0.encode((SCFHeader) defaultSCFHeader0);
      assertEquals(0.0, byteBuffer0.getDouble(), 0.01D);
      assertNotNull(byteBuffer0);
      assertEquals(0.0F, byteBuffer0.getFloat(), 0.01F);
      assertEquals(128, byteBuffer0.capacity());
      assertEquals(29539, byteBuffer0.getShort());
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultSCFHeaderCodec defaultSCFHeaderCodec0 = DefaultSCFHeaderCodec.INSTANCE;
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try {
        defaultSCFHeaderCodec0.decode(dataInputStream0);
        fail("Expecting exception: SCFHeaderDecoderException");
      } catch(SCFHeaderDecoderException e) {
        /*
         * Error parsing Header
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultSCFHeaderCodec defaultSCFHeaderCodec0 = DefaultSCFHeaderCodec.valueOf("INSTANCE");
      // Undeclared exception!
      try {
        defaultSCFHeaderCodec0.decode((DataInputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * input stream can not be null
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultSCFHeaderCodec defaultSCFHeaderCodec0 = DefaultSCFHeaderCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try {
        defaultSCFHeaderCodec0.decode(dataInputStream0);
        fail("Expecting exception: SCFHeaderDecoderException");
      } catch(SCFHeaderDecoderException e) {
        /*
         * Error parsing Header
         */
      }
  }
}
