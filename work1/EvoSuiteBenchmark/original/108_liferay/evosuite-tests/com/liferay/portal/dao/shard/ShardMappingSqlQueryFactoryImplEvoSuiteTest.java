/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.dao.shard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.shard.ShardMappingSqlQueryFactoryImpl;
import com.liferay.portal.kernel.dao.jdbc.CountRowMapper;
import com.liferay.portal.kernel.dao.jdbc.RowMapper;
import interbase.interclient.DataSource;
import org.evosuite.testcase.TestCaseExecutor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ShardMappingSqlQueryFactoryImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ShardMappingSqlQueryFactoryImpl shardMappingSqlQueryFactoryImpl0 = new ShardMappingSqlQueryFactoryImpl();
      DataSource dataSource0 = new DataSource();
      int[] intArray0 = new int[4];
      CountRowMapper countRowMapper0 = new CountRowMapper();
      shardMappingSqlQueryFactoryImpl0.getMappingSqlQuery((javax.sql.DataSource) dataSource0, "dropTargetContext", intArray0, (RowMapper<Integer>) countRowMapper0);
  }
}
