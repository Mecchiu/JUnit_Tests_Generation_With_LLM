/*
 * This file was automatically generated by EvoSuite
 */

package org.javathena.core.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.javathena.core.data.Skill;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SkillEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Skill skill0 = new Skill((short)990, (short)990);
      skill0.setId((short) (-1042));
      assertEquals(-1042, skill0.getId());
  }

  @Test
  public void test1()  throws Throwable  {
      Skill skill0 = new Skill((short) (-1864), (short)473);
      short short0 = skill0.getId();
      assertEquals((short)0, short0);
  }

  @Test
  public void test2()  throws Throwable  {
      Skill skill0 = new Skill((short) (-1864), (short)473);
      skill0.setFlag((short)473);
      assertEquals(473, skill0.getFlag());
  }

  @Test
  public void test3()  throws Throwable  {
      Skill skill0 = new Skill((short)990, (short)990);
      short short0 = skill0.getLv();
      assertEquals((short)0, short0);
  }

  @Test
  public void test4()  throws Throwable  {
      Skill skill0 = new Skill((short)990, (short)990);
      skill0.setLv((short)0);
      assertEquals(0, skill0.getLv());
  }

  @Test
  public void test5()  throws Throwable  {
      Skill skill0 = new Skill((short)990, (short)990);
      short short0 = skill0.getFlag();
      assertEquals((short)0, short0);
  }
}
