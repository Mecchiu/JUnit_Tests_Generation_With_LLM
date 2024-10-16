/*
 * This file was automatically generated by EvoSuite
 */

package db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import db.DBEntityManagerFactory;
import db.DBException;
import javax.persistence.PersistenceException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DBEntityManagerFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      try {
        DBEntityManagerFactory.getInstance();
        fail("Expecting exception: DBException");
      } catch(DBException e) {
        /*
         * Keine Instanz vorhanden
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        DBEntityManagerFactory.createEntityManagerFactory();
        fail("Expecting exception: PersistenceException");
      } catch(PersistenceException e) {
        /*
         * org.hibernate.AnnotationException: java.lang.NoSuchMethodException: org.hibernate.validator.ClassValidator.<init>(java.lang.Class, java.util.ResourceBundle, org.hibernate.validator.MessageInterpolator, java.util.Map, org.hibernate.annotations.common.reflection.ReflectionManager)
         */
      }
  }
}
