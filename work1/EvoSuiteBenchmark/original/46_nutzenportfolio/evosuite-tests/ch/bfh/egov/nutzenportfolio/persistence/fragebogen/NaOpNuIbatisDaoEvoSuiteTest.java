/*
 * This file was automatically generated by EvoSuite
 */

package ch.bfh.egov.nutzenportfolio.persistence.fragebogen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ch.bfh.egov.nutzenportfolio.persistence.fragebogen.NaOpNuIbatisDao;
import ch.bfh.egov.nutzenportfolio.tos.NaOpNu;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NaOpNuIbatisDaoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NaOpNuIbatisDao naOpNuIbatisDao0 = new NaOpNuIbatisDao();
      // Undeclared exception!
      try {
        naOpNuIbatisDao0.getByEmail((NaOpNu) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      NaOpNuIbatisDao naOpNuIbatisDao0 = new NaOpNuIbatisDao();
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try {
        naOpNuIbatisDao0.deleteAssignments(integer0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      NaOpNuIbatisDao naOpNuIbatisDao0 = new NaOpNuIbatisDao();
      NaOpNu naOpNu0 = new NaOpNu();
      // Undeclared exception!
      try {
        naOpNuIbatisDao0.getPaResultat(naOpNu0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      NaOpNuIbatisDao naOpNuIbatisDao0 = new NaOpNuIbatisDao();
      // Undeclared exception!
      try {
        naOpNuIbatisDao0.getNaOpNuResultat((NaOpNu) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      NaOpNuIbatisDao naOpNuIbatisDao0 = new NaOpNuIbatisDao();
      Long long0 = new Long((-1468L));
      // Undeclared exception!
      try {
        naOpNuIbatisDao0.getByUID(long0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      NaOpNuIbatisDao naOpNuIbatisDao0 = new NaOpNuIbatisDao();
      NaOpNu naOpNu0 = new NaOpNu();
      // Undeclared exception!
      try {
        naOpNuIbatisDao0.insertNaOpNuResultat(naOpNu0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }
}
