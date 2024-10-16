/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.MissingResourceException;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DatabaseEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Config config0 = new Config();
      Database database0 = null;
      try {
        database0 = new Database(config0, (Connection) null, (DatabaseMetaData) null, "Crr: O.eVjZn[G4qw3", "Crr: O.eVjZn[G4qw3", "Crr: O.eVjZn[G4qw3", (SchemaMeta) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
