/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.client.update.xmlbeans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Set;
import java.util.TreeSet;
import net.sourceforge.squirrel_sql.client.update.xmlbeans.ArtifactXmlBean;
import net.sourceforge.squirrel_sql.client.update.xmlbeans.ModuleXmlBean;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ModuleXmlBeanEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ModuleXmlBean moduleXmlBean0 = new ModuleXmlBean();
      TreeSet<ArtifactXmlBean> treeSet0 = new TreeSet<ArtifactXmlBean>();
      moduleXmlBean0.setArtifacts((Set<ArtifactXmlBean>) treeSet0);
      assertNull(moduleXmlBean0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      ModuleXmlBean moduleXmlBean0 = new ModuleXmlBean();
      moduleXmlBean0.setName((String) null);
      assertNull(moduleXmlBean0.getName());
  }

  @Test
  public void test2()  throws Throwable  {
      ModuleXmlBean moduleXmlBean0 = new ModuleXmlBean();
      Set<ArtifactXmlBean> set0 = moduleXmlBean0.getArtifacts();
      assertEquals(0, set0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      ModuleXmlBean moduleXmlBean0 = new ModuleXmlBean();
      String string0 = moduleXmlBean0.getName();
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      ModuleXmlBean moduleXmlBean0 = new ModuleXmlBean();
      moduleXmlBean0.addArtifact((ArtifactXmlBean) null);
      assertNull(moduleXmlBean0.getName());
  }
}
