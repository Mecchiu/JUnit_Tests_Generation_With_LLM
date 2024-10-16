/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.dao.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.shard.ShardMappingSqlQueryFactoryImpl;
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQueryFactory;
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQueryFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.RowMapper;
import interbase.interclient.ConnectionPoolModule;
import javax.sql.DataSource;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MappingSqlQueryFactoryUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MappingSqlQueryFactoryUtil mappingSqlQueryFactoryUtil0 = new MappingSqlQueryFactoryUtil();
      ShardMappingSqlQueryFactoryImpl shardMappingSqlQueryFactoryImpl0 = (ShardMappingSqlQueryFactoryImpl)MappingSqlQueryFactoryUtil.getMappingSqlQueryFactory();
      mappingSqlQueryFactoryUtil0.setMappingSqlQueryFactory((MappingSqlQueryFactory) shardMappingSqlQueryFactoryImpl0);
  }

  @Test
  public void test1()  throws Throwable  {
      ConnectionPoolModule connectionPoolModule0 = new ConnectionPoolModule();
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try {
        MappingSqlQueryFactoryUtil.getMappingSqlQuery((DataSource) connectionPoolModule0, "selectAllAction", intArray0, (RowMapper<String>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
