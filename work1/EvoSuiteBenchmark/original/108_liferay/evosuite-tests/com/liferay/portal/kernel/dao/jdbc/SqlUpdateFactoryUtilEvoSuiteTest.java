/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.dao.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.shard.ShardSqlUpdateFactoryImpl;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactory;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import interbase.interclient.ConnectionPoolModule;
import javax.sql.DataSource;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SqlUpdateFactoryUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ConnectionPoolModule connectionPoolModule0 = new ConnectionPoolModule();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try {
        SqlUpdateFactoryUtil.getSqlUpdate((DataSource) connectionPoolModule0, "2)", intArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SqlUpdateFactoryUtil sqlUpdateFactoryUtil0 = new SqlUpdateFactoryUtil();
      ShardSqlUpdateFactoryImpl shardSqlUpdateFactoryImpl0 = (ShardSqlUpdateFactoryImpl)SqlUpdateFactoryUtil.getSqlUpdateFactory();
      sqlUpdateFactoryUtil0.setSqlUpdateFactory((SqlUpdateFactory) shardSqlUpdateFactoryImpl0);
  }
}
