/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.client.session.sqlfilter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.squirrel_sql.client.session.IObjectTreeAPI;
import net.sourceforge.squirrel_sql.client.session.sqlfilter.SQLFilterSheet;
import net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectInfo;
import net.sourceforge.squirrel_sql.fw.sql.IDatabaseObjectInfo;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SQLFilterSheetEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DatabaseObjectInfo databaseObjectInfo0 = new DatabaseObjectInfo("", "", "");
      SQLFilterSheet sQLFilterSheet0 = SQLFilterSheet.createSheet((IObjectTreeAPI) null, (IDatabaseObjectInfo) databaseObjectInfo0);
      assertNull(sQLFilterSheet0);
  }
}
