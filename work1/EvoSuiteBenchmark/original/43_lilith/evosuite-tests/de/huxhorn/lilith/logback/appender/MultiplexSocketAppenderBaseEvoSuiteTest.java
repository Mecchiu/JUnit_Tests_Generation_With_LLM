/*
 * This file was automatically generated by EvoSuite
 */

package de.huxhorn.lilith.logback.appender;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.huxhorn.lilith.logback.appender.AccessMultiplexSocketAppender;
import de.huxhorn.lilith.logback.appender.ClassicMultiplexSocketAppender;
import de.huxhorn.lilith.logback.appender.ClassicXmlMultiplexSocketAppender;
import de.huxhorn.lilith.logback.appender.ZeroDelimitedClassicXmlMultiplexSocketAppender;

@RunWith(EvoSuiteRunner.class)
public class MultiplexSocketAppenderBaseEvoSuiteTest {


  //Test case number: 0
  /*
   * 7 covered goals:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.getRemoteHostsList()Ljava/util/List;: root-Branch
   * 2 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.<init>()V: root-Branch
   * 3 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.<init>(Lde/huxhorn/lilith/sender/WriteByteStrategy;)V: root-Branch
   * 4 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setPort(I)V: root-Branch
   * 5 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setEncoder(Lde/huxhorn/sulky/codec/Encoder;)V: root-Branch
   * 6 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setQueueSize(I)V: root-Branch
   * 7 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.<init>(Lde/huxhorn/lilith/sender/WriteByteStrategy;I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ClassicMultiplexSocketAppender classicMultiplexSocketAppender0 = new ClassicMultiplexSocketAppender();
      // Undeclared exception!
      try {
        classicMultiplexSocketAppender0.getRemoteHostsList();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.getQueueSize()I: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ClassicMultiplexSocketAppender classicMultiplexSocketAppender0 = new ClassicMultiplexSocketAppender();
      int int0 = classicMultiplexSocketAppender0.getQueueSize();
      assertEquals(10000, classicMultiplexSocketAppender0.getPort());
      assertEquals(1000, int0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setReconnectionDelay(I)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      ClassicXmlMultiplexSocketAppender classicXmlMultiplexSocketAppender0 = new ClassicXmlMultiplexSocketAppender();
      classicXmlMultiplexSocketAppender0.setReconnectionDelay((-1342));
      assertEquals(-1342, classicXmlMultiplexSocketAppender0.getReconnectionDelay());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.isDebug()Z: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      AccessMultiplexSocketAppender accessMultiplexSocketAppender0 = new AccessMultiplexSocketAppender();
      accessMultiplexSocketAppender0.isDebug();
      assertEquals(10010, accessMultiplexSocketAppender0.getPort());
      assertEquals(1000, accessMultiplexSocketAppender0.getQueueSize());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.getReconnectionDelay()I: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      ClassicMultiplexSocketAppender classicMultiplexSocketAppender0 = new ClassicMultiplexSocketAppender();
      int int0 = classicMultiplexSocketAppender0.getReconnectionDelay();
      assertEquals(10000, classicMultiplexSocketAppender0.getPort());
      assertEquals(0, int0);
      assertEquals(1000, classicMultiplexSocketAppender0.getQueueSize());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.getPort()I: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      AccessMultiplexSocketAppender accessMultiplexSocketAppender0 = new AccessMultiplexSocketAppender();
      int int0 = accessMultiplexSocketAppender0.getPort();
      assertEquals(10010, int0);
      assertEquals(1000, accessMultiplexSocketAppender0.getQueueSize());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setApplicationIdentifier(Ljava/lang/String;)V: root-Branch
   * 2 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.getApplicationIdentifier()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      ZeroDelimitedClassicXmlMultiplexSocketAppender zeroDelimitedClassicXmlMultiplexSocketAppender0 = new ZeroDelimitedClassicXmlMultiplexSocketAppender();
      zeroDelimitedClassicXmlMultiplexSocketAppender0.setApplicationIdentifier("de.huxhorn.lilith.logback.appender.ClassicXmlMultiplexSocketAppender[null]");
      assertEquals(11000, zeroDelimitedClassicXmlMultiplexSocketAppender0.getPort());
      assertEquals(1000, zeroDelimitedClassicXmlMultiplexSocketAppender0.getQueueSize());
  }

  //Test case number: 7
  /*
   * 6 covered goals:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setRemoteHostsList(Ljava/util/List;)V: I4 Branch 4 IFEQ L154 - false
   * 2 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setDebug(Z)V: root-Branch
   * 3 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setRemoteHosts(Ljava/lang/String;)V: I19 Branch 1 IFEQ L133 - true
   * 4 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setRemoteHosts(Ljava/lang/String;)V: I19 Branch 1 IFEQ L133 - false
   * 5 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setRemoteHosts(Ljava/lang/String;)V: I35 Branch 2 IFGT L137 - false
   * 6 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setRemoteHosts(Ljava/lang/String;)V: I39 Branch 3 IFGT L137 - false
   */
  @Test
  public void test7()  throws Throwable  {
      ClassicMultiplexSocketAppender classicMultiplexSocketAppender0 = new ClassicMultiplexSocketAppender();
      classicMultiplexSocketAppender0.setDebug(true);
      classicMultiplexSocketAppender0.setRemoteHosts("Em.W:MwN|0:Zk%!8");
      assertEquals(true, classicMultiplexSocketAppender0.isDebug());
      assertEquals(1000, classicMultiplexSocketAppender0.getQueueSize());
  }

  //Test case number: 8
  /*
   * 5 covered goals:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setRemoteHosts(Ljava/lang/String;)V: I19 Branch 1 IFEQ L133 - false
   * 2 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setRemoteHosts(Ljava/lang/String;)V: I35 Branch 2 IFGT L137 - false
   * 3 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setRemoteHosts(Ljava/lang/String;)V: I39 Branch 3 IFGT L137 - false
   * 4 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setRemoteHosts(Ljava/lang/String;)V: I19 Branch 1 IFEQ L133 - true
   * 5 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setRemoteHostsList(Ljava/util/List;)V: I4 Branch 4 IFEQ L154 - true
   */
  @Test
  public void test8()  throws Throwable  {
      ClassicMultiplexSocketAppender classicMultiplexSocketAppender0 = new ClassicMultiplexSocketAppender();
      classicMultiplexSocketAppender0.setRemoteHosts("Em.W:MwN|0:Zk%!8");
      assertEquals(1000, classicMultiplexSocketAppender0.getQueueSize());
      assertEquals(10000, classicMultiplexSocketAppender0.getPort());
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.start()V: I4 Branch 5 IFNE L166 - false
   * 2 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.start()V: I13 Branch 6 IFNE L169 - true
   * 3 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.start()V: I36 Branch 7 IFNULL L175 - true
   * 4 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.start()V: I64 Branch 9 IF_ICMPGE L181 - true
   * 5 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.start()V: I86 Branch 10 IFNE L186 - true
   */
  @Test
  public void test9()  throws Throwable  {
      ClassicMultiplexSocketAppender classicMultiplexSocketAppender0 = new ClassicMultiplexSocketAppender(true);
      classicMultiplexSocketAppender0.start();
      assertEquals(1000, classicMultiplexSocketAppender0.getQueueSize());
      assertEquals(10000, classicMultiplexSocketAppender0.getPort());
  }

  //Test case number: 10
  /*
   * 7 covered goals:
   * 1 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.stop()V: I4 Branch 11 IFNE L217 - false
   * 2 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.<init>()V: root-Branch
   * 3 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.<init>(Lde/huxhorn/lilith/sender/WriteByteStrategy;)V: root-Branch
   * 4 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setPort(I)V: root-Branch
   * 5 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setEncoder(Lde/huxhorn/sulky/codec/Encoder;)V: root-Branch
   * 6 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.setQueueSize(I)V: root-Branch
   * 7 de.huxhorn.lilith.logback.appender.MultiplexSocketAppenderBase.<init>(Lde/huxhorn/lilith/sender/WriteByteStrategy;I)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      AccessMultiplexSocketAppender accessMultiplexSocketAppender0 = new AccessMultiplexSocketAppender();
      accessMultiplexSocketAppender0.stop();
      assertEquals(10010, accessMultiplexSocketAppender0.getPort());
      assertEquals(1000, accessMultiplexSocketAppender0.getQueueSize());
  }
}
