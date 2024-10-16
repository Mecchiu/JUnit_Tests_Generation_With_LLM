/*
 * This file was automatically generated by EvoSuite
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fr.unice.gfarce.interGraph.ModifTableStockage;
import fr.unice.gfarce.interGraph.TableStockage;
import java.awt.HeadlessException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ModifTableStockageEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Object[][] objectArray0 = new Object[2][4];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.colonneMail();
      assertEquals(2, tableStockage1.getRowCount());
      assertNotNull(tableStockage1);
  }

  @Test
  public void test1()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try {
        modifTableStockage0.ajouterLigne();
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[7] = ";r";
      Object[][] objectArray0 = new Object[4][9];
      objectArray0[0] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.ajouterLigne();
      assertEquals(5, tableStockage1.getRowCount());
      assertNotNull(tableStockage1);
      assertEquals(8, tableStockage1.getColumnCount());
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[11][10];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.supprimerColonne(0);
      assertNotNull(tableStockage1);
      assertEquals(0, tableStockage1.getColumnCount());
      assertEquals(11, tableStockage1.getRowCount());
  }

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[9];
      Object[][] objectArray0 = new Object[4][4];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      objectArray0[2] = (Object[]) stringArray0;
      objectArray0[3] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.supprimerLigne(0);
      assertNotNull(tableStockage1);
      
      TableStockage tableStockage2 = modifTableStockage0.supprimerLigne(1);
      assertNotNull(tableStockage2);
      
      modifTableStockage0.supprimerLigne(0);
      TableStockage tableStockage3 = modifTableStockage0.supprimerLigne(0);
      assertNotNull(tableStockage3);
      assertEquals(9, tableStockage3.getColumnCount());
      assertEquals(0, tableStockage3.getRowCount());
  }

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[9];
      Object[][] objectArray0 = new Object[4][4];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      objectArray0[2] = (Object[]) stringArray0;
      objectArray0[3] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.supprimerLigne(1);
      assertNotNull(tableStockage1);
      assertEquals(3, tableStockage1.getRowCount());
  }

  @Test
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[9];
      Object[][] objectArray0 = new Object[4][4];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      objectArray0[2] = (Object[]) stringArray0;
      objectArray0[3] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try {
        modifTableStockage0.separerColonne(0);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[3] = ",8f\"XYwt'X%MG";
      Object[][] objectArray0 = new Object[1][5];
      objectArray0[0] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.supprimerColonne(2);
      assertNotNull(tableStockage1);
      
      ModifTableStockage modifTableStockage1 = new ModifTableStockage(tableStockage1);
      // Undeclared exception!
      try {
        modifTableStockage1.separerColonne(2);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[7] = "UwHUrN{ UoTtvEI";
      Object[][] objectArray0 = new Object[1][6];
      objectArray0[0] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.separerColonne(7);
      assertNotNull(tableStockage1);
      assertEquals(1, tableStockage1.getRowCount());
  }

  @Test
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "3\"[M5 (}tsG-Gl";
      Object[][] objectArray0 = new Object[1][6];
      objectArray0[0] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      stringArray0[0] = "?fmH9iU;=|";
      TableStockage tableStockage1 = modifTableStockage0.separerColonne(0);
      assertEquals(1, tableStockage1.getRowCount());
      assertNotNull(tableStockage1);
  }

  @Test
  public void test10()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try {
        modifTableStockage0.fusionnerColonnes((-373));
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "";
      stringArray0[2] = "";
      Object[][] objectArray0 = new Object[2][4];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.fusionnerColonnes(1);
      assertEquals(2, tableStockage1.getRowCount());
      assertEquals(6, tableStockage1.getColumnCount());
      assertNotNull(tableStockage1);
  }

  @Test
  public void test12()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try {
        modifTableStockage0.selectMail();
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "$/nCK<n>NWFw8?r}\"{";
      stringArray0[1] = "$/nCK<n>NWFw8?r}\"{";
      stringArray0[2] = "Envoyer E-Mail a:";
      Object[][] objectArray0 = new Object[5][10];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try {
        modifTableStockage0.selectMail();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
