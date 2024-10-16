/*
 * This file was automatically generated by EvoSuite
 */

package com.eteks.sweethome3d.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.swing.JPEGImagesToVideo;
import java.io.File;
import java.io.IOException;
import javax.media.protocol.DataSource;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JPEGImagesToVideoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JPEGImagesToVideo jPEGImagesToVideo0 = new JPEGImagesToVideo();
      // Undeclared exception!
      try {
        jPEGImagesToVideo0.createVideoFile((-740), (-740), (-740), (DataSource) null, (File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
