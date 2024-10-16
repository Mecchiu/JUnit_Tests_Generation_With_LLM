/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.dao.orm.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.orm.jpa.LockModeTranslator;
import com.liferay.portal.kernel.dao.orm.LockMode;
import javax.persistence.LockModeType;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LockModeTranslatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LockModeTranslator lockModeTranslator0 = new LockModeTranslator();
      assertNotNull(lockModeTranslator0);
  }

  @Test
  public void test1()  throws Throwable  {
      LockMode lockMode0 = LockMode.UPGRADE;
      LockModeTranslator.translate(lockMode0);
  }

  @Test
  public void test2()  throws Throwable  {
      LockMode lockMode0 = LockMode.READ;
      LockModeType lockModeType0 = LockModeTranslator.translate(lockMode0);
      assertEquals("READ", lockModeType0.name());
  }

  @Test
  public void test3()  throws Throwable  {
      LockMode lockMode0 = LockMode.WRITE;
      LockModeType lockModeType0 = LockModeTranslator.translate(lockMode0);
      assertEquals(LockModeType.WRITE, lockModeType0);
  }
}
