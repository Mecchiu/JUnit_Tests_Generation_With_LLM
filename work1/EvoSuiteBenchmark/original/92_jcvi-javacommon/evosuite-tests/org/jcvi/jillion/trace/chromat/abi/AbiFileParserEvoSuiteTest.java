/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.trace.chromat.abi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.jcvi.jillion.trace.TraceDecoderException;
import org.jcvi.jillion.trace.chromat.ChromatogramFileVisitor;
import org.jcvi.jillion.trace.chromat.abi.AbiChromatogramBuilder;
import org.jcvi.jillion.trace.chromat.abi.AbiFileParser;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbiFileParserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      AbiChromatogramBuilder.AbiChromatogramBuilderVisitor abiChromatogramBuilder_AbiChromatogramBuilderVisitor0 = new AbiChromatogramBuilder.AbiChromatogramBuilderVisitor("#g(Qev#-xw;k/yf_");
      try {
        AbiFileParser.parse((InputStream) byteArrayInputStream0, (ChromatogramFileVisitor) abiChromatogramBuilder_AbiChromatogramBuilderVisitor0);
        fail("Expecting exception: TraceDecoderException");
      } catch(TraceDecoderException e) {
        /*
         * could not read magic number
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = new File(">PE", ">PE");
      AbiChromatogramBuilder.AbiChromatogramBuilderVisitor abiChromatogramBuilder_AbiChromatogramBuilderVisitor0 = new AbiChromatogramBuilder.AbiChromatogramBuilderVisitor(">PE");
      try {
        AbiFileParser.parse(file0, (ChromatogramFileVisitor) abiChromatogramBuilder_AbiChromatogramBuilderVisitor0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * >PE/>PE (No such file or directory)
         */
      }
  }
}
