/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.plugininstaller.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.ActionRequestImpl;
import com.liferay.portlet.plugininstaller.action.InstallPluginAction;
import javax.portlet.ActionRequest;
import javax.portlet.filter.ActionRequestWrapper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InstallPluginActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      InstallPluginAction installPluginAction0 = new InstallPluginAction();
      ActionRequestImpl actionRequestImpl0 = new ActionRequestImpl();
      try {
        installPluginAction0.uninstall((ActionRequest) actionRequestImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      InstallPluginAction installPluginAction0 = new InstallPluginAction();
      ActionRequestImpl actionRequestImpl0 = new ActionRequestImpl();
      ActionRequestWrapper actionRequestWrapper0 = new ActionRequestWrapper((ActionRequest) actionRequestImpl0);
      // Undeclared exception!
      try {
        installPluginAction0.remoteDeploySourceForge("(cY);$9=pJq\f^", (ActionRequest) actionRequestWrapper0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      InstallPluginAction installPluginAction0 = new InstallPluginAction();
      ActionRequestImpl actionRequestImpl0 = new ActionRequestImpl();
      // Undeclared exception!
      try {
        installPluginAction0.reloadRepositories((ActionRequest) actionRequestImpl0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsValues
         */
      }
  }
}
