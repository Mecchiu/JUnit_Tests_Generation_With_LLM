/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.diskmanager.cache.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.diskmanager.cache.CacheFileManagerException;
import com.aelitis.azureus.core.diskmanager.cache.impl.CacheFileManagerImpl;
import com.aelitis.azureus.core.diskmanager.cache.impl.CacheFileWithoutCache;
import com.aelitis.azureus.core.diskmanager.file.FMFile;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZMetaData;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageDecoder;
import java.io.File;
import java.nio.ByteBuffer;
import org.gudy.azureus2.core3.torrent.TOTorrentFile;
import org.gudy.azureus2.core3.util.DirectByteBuffer;
import org.gudy.azureus2.core3.util.DirectByteBufferPool;
import org.gudy.azureus2.pluginsimpl.local.utils.PooledByteBufferImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CacheFileWithoutCacheEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      PooledByteBufferImpl pooledByteBufferImpl0 = new PooledByteBufferImpl(2047);
      DirectByteBuffer directByteBuffer0 = pooledByteBufferImpl0.getBuffer();
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.write(directByteBuffer0, (long) 2047);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache((CacheFileManagerImpl) null, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.flushCache();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      TOTorrentFile tOTorrentFile0 = cacheFileWithoutCache0.getTorrentFile();
      assertNull(tOTorrentFile0);
  }

  @Test
  public void test3()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.setStorageType(1564);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.renameFile("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.exists();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.compareLength(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      cacheFileWithoutCache0.clearCache();
  }

  @Test
  public void test8()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.moveFile((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.setLength(971L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.close();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.setPieceComplete((-1305), (DirectByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.delete();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.read((DirectByteBuffer) null, (-349L), (short)1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.isOpen();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.getStorageType();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.setAccessMode(50);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache((CacheFileManagerImpl) null, (FMFile) null, (TOTorrentFile) null);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.setAccessMode(1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      DirectByteBuffer[] directByteBufferArray0 = new DirectByteBuffer[1];
      BTMessageDecoder bTMessageDecoder0 = new BTMessageDecoder();
      ByteBuffer byteBuffer0 = bTMessageDecoder0.destroy();
      AZMetaData aZMetaData0 = new AZMetaData((-690), byteBuffer0, (-690), (byte)0);
      DirectByteBuffer directByteBuffer0 = aZMetaData0.getMetadata();
      directByteBufferArray0[0] = directByteBuffer0;
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.read(directByteBufferArray0, 10000L, (short) (byte)0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte)1, (byte)1);
      DirectByteBuffer[] directByteBufferArray0 = new DirectByteBuffer[1];
      directByteBufferArray0[0] = directByteBuffer0;
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.write(directByteBufferArray0, (long) (byte)1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      BTMessageDecoder bTMessageDecoder0 = new BTMessageDecoder();
      ByteBuffer byteBuffer0 = bTMessageDecoder0.destroy();
      DirectByteBuffer directByteBuffer0 = new DirectByteBuffer(byteBuffer0);
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.writeAndHandoverBuffer(directByteBuffer0, 2L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      CacheFileManagerImpl cacheFileManagerImpl0 = new CacheFileManagerImpl();
      CacheFileWithoutCache cacheFileWithoutCache0 = new CacheFileWithoutCache(cacheFileManagerImpl0, (FMFile) null, (TOTorrentFile) null);
      DirectByteBuffer[] directByteBufferArray0 = new DirectByteBuffer[1];
      byte[] byteArray0 = new byte[9];
      PooledByteBufferImpl pooledByteBufferImpl0 = new PooledByteBufferImpl(byteArray0);
      DirectByteBuffer directByteBuffer0 = pooledByteBufferImpl0.getBuffer();
      directByteBufferArray0[0] = directByteBuffer0;
      // Undeclared exception!
      try {
        cacheFileWithoutCache0.writeAndHandoverBuffers(directByteBufferArray0, (long) (byte)33);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
