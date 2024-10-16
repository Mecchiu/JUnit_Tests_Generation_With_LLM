/*
 * This file was automatically generated by EvoSuite
 */

package org.pdfsam.console.business.pdf.handlers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import org.junit.BeforeClass;
import org.pdfsam.console.business.dto.PageRotation;
import org.pdfsam.console.business.dto.PdfFile;
import org.pdfsam.console.business.dto.commands.AbstractParsedCommand;
import org.pdfsam.console.business.dto.commands.RotateParsedCommand;
import org.pdfsam.console.business.dto.commands.SetViewerParsedCommand;
import org.pdfsam.console.business.pdf.handlers.RotateCmdExecutor;
import org.pdfsam.console.exceptions.console.ConsoleException;
import org.pdfsam.console.exceptions.console.EncryptException;

@RunWith(EvoSuiteRunner.class)
public class RotateCmdExecutorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RotateCmdExecutor rotateCmdExecutor0 = new RotateCmdExecutor();
      rotateCmdExecutor0.clean();
      assertEquals(false, rotateCmdExecutor0.hasChanged());
  }

  @Test
  public void test1()  throws Throwable  {
      RotateCmdExecutor rotateCmdExecutor0 = new RotateCmdExecutor();
      try {
        rotateCmdExecutor0.execute((AbstractParsedCommand) null);
        fail("Expecting exception: ConsoleException");
      } catch(ConsoleException e) {
        /*
         * CLS005 - Bad command.
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      RotateCmdExecutor rotateCmdExecutor0 = new RotateCmdExecutor();
      SetViewerParsedCommand setViewerParsedCommand0 = new SetViewerParsedCommand();
      try {
        rotateCmdExecutor0.execute((AbstractParsedCommand) setViewerParsedCommand0);
        fail("Expecting exception: ConsoleException");
      } catch(ConsoleException e) {
        /*
         * CLS005 - Bad command.
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      RotateCmdExecutor rotateCmdExecutor0 = new RotateCmdExecutor();
      PdfFile[] pdfFileArray0 = new PdfFile[5];
      PdfFile pdfFile0 = new PdfFile("org.apache.log4j.Categor", "org.apache.log4j.Categor");
      pdfFileArray0[0] = pdfFile0;
      pdfFileArray0[1] = pdfFile0;
      pdfFileArray0[2] = pdfFile0;
      PageRotation pageRotation0 = new PageRotation();
      pdfFileArray0[3] = pdfFileArray0[2];
      pdfFileArray0[4] = pdfFileArray0[3];
      RotateParsedCommand rotateParsedCommand0 = new RotateParsedCommand(pdfFileArray0, (File) null, "org.apache.log4j.Categor", pageRotation0, true, true, '-');
      try {
        rotateCmdExecutor0.execute((AbstractParsedCommand) rotateParsedCommand0);
        fail("Expecting exception: EncryptException");
      } catch(EncryptException e) {
      }
  }
}
