/*
 * This file was automatically generated by EvoSuite
 */

package com.gbshape.dbe.sqlserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.gbshape.dbe.sqlserver.SqlserverSequenceStructure;
import com.gbshape.dbe.struts.bean.DBDataBean;
import com.gbshape.dbe.struts.form.SequenceForm;
import javax.servlet.http.HttpServletRequest;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SqlserverSequenceStructureEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SqlserverSequenceStructure sqlserverSequenceStructure0 = new SqlserverSequenceStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      sqlserverSequenceStructure0.drop((HttpServletRequest) null, dBDataBean0, "ERROR");
  }

  @Test
  public void test1()  throws Throwable  {
      SqlserverSequenceStructure sqlserverSequenceStructure0 = new SqlserverSequenceStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      SequenceForm sequenceForm0 = new SequenceForm();
      sqlserverSequenceStructure0.create((HttpServletRequest) null, dBDataBean0, sequenceForm0);
  }

  @Test
  public void test2()  throws Throwable  {
      SqlserverSequenceStructure sqlserverSequenceStructure0 = new SqlserverSequenceStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      sqlserverSequenceStructure0.getList(dBDataBean0);
  }
}
