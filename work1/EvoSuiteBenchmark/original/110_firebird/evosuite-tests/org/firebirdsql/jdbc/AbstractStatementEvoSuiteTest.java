/*
 * This file was automatically generated by EvoSuite
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.SQLException;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBPreparedStatement;
import org.firebirdsql.jdbc.FBStatement;
import org.firebirdsql.jdbc.InternalTransactionCoordinator;

@RunWith(EvoSuiteRunner.class)
public class AbstractStatementEvoSuiteTest {


  //Test case number: 0
  /*
   * 8 covered goals:
   * 1 org.firebirdsql.jdbc.AbstractStatement.isClosed()Z: root-Branch
   * 2 org.firebirdsql.jdbc.AbstractStatement.notifyStatementStarted()V: root-Branch
   * 3 org.firebirdsql.jdbc.AbstractStatement.<init>(Lorg/firebirdsql/gds/impl/GDSHelper;IIILorg/firebirdsql/jdbc/FBObjectListener$StatementListener;)V: I74 Branch 3 IFNULL L154 - true
   * 4 org.firebirdsql.jdbc.AbstractStatement.getSynchronizationObject()Ljava/lang/Object;: I4 Branch 7 IFNONNULL L178 - false
   * 5 org.firebirdsql.jdbc.AbstractStatement.notifyStatementStarted(Z)V: I3 Branch 12 IFEQ L235 - false
   * 6 org.firebirdsql.jdbc.AbstractStatement.closeResultSet(Z)V: I9 Branch 54 IFNULL L1326 - true
   * 7 org.firebirdsql.jdbc.AbstractStatement.closeResultSet(Z)V: I24 Branch 55 IFEQ L1331 - true
   * 8 org.firebirdsql.jdbc.AbstractStatement.checkValidity()V: I4 Branch 73 IFEQ L1506 - true
   */
  @Test
  public void test0()  throws Throwable  {
      FBStatement fBStatement0 = new FBStatement((GDSHelper) null, 427, (-316), 427, (FBObjectListener.StatementListener) null);
      assertNotNull(fBStatement0);
      
      // Undeclared exception!
      try {
        fBStatement0.executeQuery("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 org.firebirdsql.jdbc.AbstractStatement.getConnection()Ljava/sql/Connection;: root-Branch
   * 2 org.firebirdsql.jdbc.AbstractStatement.<init>(Lorg/firebirdsql/gds/impl/GDSHelper;IIILorg/firebirdsql/jdbc/FBObjectListener$StatementListener;)V: I74 Branch 3 IFNULL L154 - false
   * 3 org.firebirdsql.jdbc.AbstractStatement.isClosed()Z: root-Branch
   * 4 org.firebirdsql.jdbc.AbstractStatement.checkValidity()V: I4 Branch 73 IFEQ L1506 - true
   */
  @Test
  public void test1()  throws Throwable  {
      InternalTransactionCoordinator.MetaDataTransactionCoordinator internalTransactionCoordinator_MetaDataTransactionCoordinator0 = new InternalTransactionCoordinator.MetaDataTransactionCoordinator();
      FBPreparedStatement fBPreparedStatement0 = new FBPreparedStatement((GDSHelper) null, (-520), (-865), 0, (FBObjectListener.StatementListener) internalTransactionCoordinator_MetaDataTransactionCoordinator0, (FBObjectListener.BlobListener) internalTransactionCoordinator_MetaDataTransactionCoordinator0);
      fBPreparedStatement0.getConnection();
      assertEquals(false, fBPreparedStatement0.isCloseOnCompletion());
      assertEquals(0, fBPreparedStatement0.getResultSetHoldability());
      assertEquals(-520, fBPreparedStatement0.getResultSetType());
      assertEquals(-865, fBPreparedStatement0.getResultSetConcurrency());
      assertEquals(true, fBPreparedStatement0.isValid());
  }
}
