/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.documentlibrary.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.documentlibrary.util.LiferayVideoThumbnailConverter;
import com.xuggle.xuggler.IContainer;
import java.io.File;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LiferayVideoThumbnailConverterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("; ~U\"u\"#;Iyy3:[F", "; ~U\"u\"#;Iyy3:[F");
      LiferayVideoThumbnailConverter liferayVideoThumbnailConverter0 = new LiferayVideoThumbnailConverter("; ~U\"u\"#;Iyy3:[F", file0, "; ~U\"u\"#;Iyy3:[F", 1604, 1604, 1604);
      IContainer iContainer0 = liferayVideoThumbnailConverter0.getInputIContainer();
      assertNull(iContainer0);
  }
}
