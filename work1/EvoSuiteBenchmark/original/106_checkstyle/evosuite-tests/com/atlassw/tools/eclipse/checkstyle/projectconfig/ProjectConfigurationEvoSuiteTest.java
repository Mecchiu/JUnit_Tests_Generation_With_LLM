/*
 * This file was automatically generated by EvoSuite
 */

package com.atlassw.tools.eclipse.checkstyle.projectconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.atlassw.tools.eclipse.checkstyle.projectconfig.ProjectConfiguration;
import java.util.List;
import java.util.ResourceBundle;
import org.eclipse.core.resources.IProject;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ProjectConfigurationEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ProjectConfiguration projectConfiguration0 = null;
      try {
        projectConfiguration0 = new ProjectConfiguration((IProject) null, (List) null, (List) null, (List) null, false);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.atlassw.tools.eclipse.checkstyle.projectconfig.PluginFilters
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      ProjectConfiguration projectConfiguration0 = null;
      try {
        projectConfiguration0 = new ProjectConfiguration((IProject) null, (List) list0, (List) list0, (List) list0, false);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.atlassw.tools.eclipse.checkstyle.projectconfig.PluginFilters
         */
      }
  }
}
