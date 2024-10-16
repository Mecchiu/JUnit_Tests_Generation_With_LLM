/*
 * This file was automatically generated by EvoSuite
 */

package de.huxhorn.lilith.log4j.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.huxhorn.lilith.data.eventsource.EventWrapper;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.lilith.log4j.xml.Log4jImportCallable;
import de.huxhorn.sulky.buffers.AppendOperation;
import de.huxhorn.sulky.buffers.SerializingFileBuffer;
import java.io.File;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class Log4jImportCallableEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("Q&tKnqQXYm@Zg");
      Log4jImportCallable log4jImportCallable0 = new Log4jImportCallable(file0, (AppendOperation<EventWrapper<LoggingEvent>>) null);
      log4jImportCallable0.getBuffer();
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = new File("Ig7fpRIED");
      SerializingFileBuffer<EventWrapper<LoggingEvent>> serializingFileBuffer0 = new SerializingFileBuffer<EventWrapper<LoggingEvent>>(file0);
      Log4jImportCallable log4jImportCallable0 = new Log4jImportCallable(file0, (AppendOperation<EventWrapper<LoggingEvent>>) serializingFileBuffer0);
      File file1 = log4jImportCallable0.getInputFile();
      assertSame(file0, file1);
  }

  @Test
  public void test2()  throws Throwable  {
      File file0 = new File("Ig7fpRIED");
      SerializingFileBuffer<EventWrapper<LoggingEvent>> serializingFileBuffer0 = new SerializingFileBuffer<EventWrapper<LoggingEvent>>(file0);
      Log4jImportCallable log4jImportCallable0 = new Log4jImportCallable(file0, (AppendOperation<EventWrapper<LoggingEvent>>) serializingFileBuffer0);
      try {
        log4jImportCallable0.call();
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * '/mnt/fastdata/ac1gf/SF110/dist/43_lilith/Ig7fpRIED' is not a file!
         */
      }
  }
}
