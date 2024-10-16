/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.io.delta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.io.delta.ByteChannelReader;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import org.jruby.util.io.NullChannel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ByteChannelReaderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NullChannel nullChannel0 = new NullChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) nullChannel0, 394);
      assertNotNull(byteChannelReader0);
      
      int int0 = byteChannelReader0.remaining();
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      FileDescriptor fileDescriptor0 = FileDescriptor.in;
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = fileInputStream0.getChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) fileChannel0, 0);
      boolean boolean0 = byteChannelReader0.hasRemaining();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      NullChannel nullChannel0 = new NullChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) nullChannel0, 394);
      assertNotNull(byteChannelReader0);
      
      ByteBuffer byteBuffer0 = byteChannelReader0.getBuffer();
      assertNotNull(byteBuffer0);
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=394]", byteBuffer0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      NullChannel nullChannel0 = new NullChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) nullChannel0, 1966);
      assertNotNull(byteChannelReader0);
      
      // Undeclared exception!
      try {
        byteChannelReader0.get(1966);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      NullChannel nullChannel0 = new NullChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) nullChannel0);
      assertNotNull(byteChannelReader0);
      
      try {
        byteChannelReader0.ensureData(149);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Unexpected EOF
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      NullChannel nullChannel0 = new NullChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) nullChannel0, 966);
      assertNotNull(byteChannelReader0);
      
      int int0 = byteChannelReader0.skip(1604);
      assertEquals(0, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      NullChannel nullChannel0 = new NullChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) nullChannel0, 394);
      assertNotNull(byteChannelReader0);
      
      // Undeclared exception!
      try {
        byteChannelReader0.get();
        fail("Expecting exception: BufferUnderflowException");
      } catch(BufferUnderflowException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      FileDescriptor fileDescriptor0 = FileDescriptor.in;
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = fileInputStream0.getChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) fileChannel0, 0);
      byteChannelReader0.ensureData(0);
      assertEquals(false, byteChannelReader0.hasRemaining());
  }

  @Test
  public void test8()  throws Throwable  {
      FileDescriptor fileDescriptor0 = FileDescriptor.in;
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = fileInputStream0.getChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) fileChannel0, 0);
      try {
        byteChannelReader0.ensureData(632);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Unexpected EOF
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      NullChannel nullChannel0 = new NullChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) nullChannel0, 1966);
      assertNotNull(byteChannelReader0);
      
      byteChannelReader0.maybeRead(1966);
      assertEquals(false, byteChannelReader0.hasRemaining());
      assertEquals(0, byteChannelReader0.remaining());
  }

  @Test
  public void test10()  throws Throwable  {
      FileDescriptor fileDescriptor0 = FileDescriptor.in;
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = fileInputStream0.getChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) fileChannel0, 0);
      byteChannelReader0.maybeRead(632);
      assertEquals(0, byteChannelReader0.remaining());
  }

  @Test
  public void test11()  throws Throwable  {
      FileDescriptor fileDescriptor0 = FileDescriptor.in;
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = fileInputStream0.getChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) fileChannel0, 0);
      byteChannelReader0.maybeRead(0);
      assertEquals(false, byteChannelReader0.hasRemaining());
  }

  @Test
  public void test12()  throws Throwable  {
      NullChannel nullChannel0 = new NullChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) nullChannel0, 966);
      assertNotNull(byteChannelReader0);
      
      byteChannelReader0.resizeBuffer(1604);
      assertEquals(0, byteChannelReader0.remaining());
      assertEquals(false, byteChannelReader0.hasRemaining());
  }

  @Test
  public void test13()  throws Throwable  {
      NullChannel nullChannel0 = new NullChannel();
      ByteChannelReader byteChannelReader0 = new ByteChannelReader((ReadableByteChannel) nullChannel0);
      assertNotNull(byteChannelReader0);
      
      byteChannelReader0.resizeBuffer(149);
      assertEquals(0, byteChannelReader0.remaining());
      assertEquals(false, byteChannelReader0.hasRemaining());
  }
}
