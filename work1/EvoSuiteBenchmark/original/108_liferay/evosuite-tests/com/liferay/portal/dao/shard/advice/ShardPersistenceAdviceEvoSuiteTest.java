/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.dao.shard.advice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.shard.advice.ShardAdvice;
import com.liferay.portal.dao.shard.advice.ShardPersistenceAdvice;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ShardPersistenceAdviceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ShardPersistenceAdvice shardPersistenceAdvice0 = new ShardPersistenceAdvice();
      shardPersistenceAdvice0.setShardAdvice((ShardAdvice) null);
  }
}
