/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.fw.sql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.beans.PropertyDescriptor;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollectionBeanInfo;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SQLDriverPropertyCollectionBeanInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SQLDriverPropertyCollectionBeanInfo sQLDriverPropertyCollectionBeanInfo0 = new SQLDriverPropertyCollectionBeanInfo();
      PropertyDescriptor[] propertyDescriptorArray0 = sQLDriverPropertyCollectionBeanInfo0.getPropertyDescriptors();
      assertNotNull(propertyDescriptorArray0);
  }
}
