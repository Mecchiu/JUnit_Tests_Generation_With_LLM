/*
 * This file was automatically generated by EvoSuite
 */

package ch.bfh.egov.nutzenportfolio.persistence.auswahlfeld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ch.bfh.egov.nutzenportfolio.persistence.auswahlfeld.AuswahlfeldIbatisDao;
import ch.bfh.egov.nutzenportfolio.tos.Auswahlfeld;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AuswahlfeldIbatisDaoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.delete(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.update(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.insert(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getByNaOpNu((Auswahlfeld) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.insertAssignment(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getLinkedPaCustomizings(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Integer integer0 = new Integer((-1754));
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getAnzahlAbstufungen(integer0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.insertNaOpNuAssignment((Auswahlfeld) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.deleteNaOpNuAssignments(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.deleteGewichtungen(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Integer integer0 = new Integer(1836);
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getAnzahlGewichtungen(integer0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.deleteNaOpNuAssignmentsByNutzenkriterium(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getByName(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getSelectedByNaOpNuId(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Integer integer0 = new Integer(859);
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getRealisierbarkeitStatus(integer0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.deleteAssignments(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getAuswahlFelder(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getGewichtungStatus((Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getAbstufungStatus((Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test19()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getLinkedNaOpNuCustomizings(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getByProjektId(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test21()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getById(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      AuswahlfeldIbatisDao auswahlfeldIbatisDao0 = new AuswahlfeldIbatisDao();
      Auswahlfeld auswahlfeld0 = new Auswahlfeld();
      // Undeclared exception!
      try {
        auswahlfeldIbatisDao0.getSelectedByPaId(auswahlfeld0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * No SqlMapClient specified
         */
      }
  }
}
