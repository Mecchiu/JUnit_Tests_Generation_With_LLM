/*
 * This file was automatically generated by EvoSuite
 */

package org.firebirdsql.jdbc.field;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.SQLException;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.jdbc.field.FBCachedLongVarCharField;
import org.firebirdsql.jdbc.field.FieldDataProvider;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FBCachedLongVarCharFieldEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBCachedLongVarCharField fBCachedLongVarCharField0 = new FBCachedLongVarCharField(xSQLVAR0, (FieldDataProvider) null, 0);
      assertNull(fBCachedLongVarCharField0.getAlias());
  }
}
