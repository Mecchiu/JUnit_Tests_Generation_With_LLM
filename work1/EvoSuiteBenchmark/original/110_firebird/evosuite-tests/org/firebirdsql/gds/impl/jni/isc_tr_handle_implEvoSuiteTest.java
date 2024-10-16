/*
 * This file was automatically generated by EvoSuite
 */

package org.firebirdsql.gds.impl.jni;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.firebirdsql.gds.GDSException;
import org.firebirdsql.gds.impl.AbstractIscStmtHandle;
import org.firebirdsql.gds.impl.jni.isc_blob_handle_impl;
import org.firebirdsql.gds.impl.jni.isc_db_handle_impl;
import org.firebirdsql.gds.impl.jni.isc_tr_handle_impl;
import org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class isc_tr_handle_implEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      isc_tr_handle_impl0.getDbHandle();
      assertEquals(0, isc_tr_handle_impl0.getTransactionIdPtr());
      assertEquals(0, isc_tr_handle_impl0.getState());
  }

  @Test
  public void test1()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      // Undeclared exception!
      try {
        isc_tr_handle_impl0.addWarning((GDSException) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_tr_handle_impl0.registerStatementWithTransaction((AbstractIscStmtHandle) isc_stmt_handle_impl0);
      isc_tr_handle_impl0.forgetResultSets();
      assertEquals(0, isc_tr_handle_impl0.getState());
      assertEquals(0, isc_tr_handle_impl0.getTransactionIdPtr());
  }

  @Test
  public void test3()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl isc_stmt_handle_impl0 = new org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl();
      isc_tr_handle_impl0.unregisterStatementFromTransaction((AbstractIscStmtHandle) isc_stmt_handle_impl0);
      assertEquals(0, isc_tr_handle_impl0.getTransactionIdPtr());
      assertEquals(0, isc_tr_handle_impl0.getState());
  }

  @Test
  public void test4()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      isc_tr_handle_impl0.setTransactionIdPtr(4, 4);
      assertEquals(4, isc_tr_handle_impl0.getTransactionIdPtr());
      assertEquals(4, isc_tr_handle_impl0.getTransactionId());
  }

  @Test
  public void test5()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      int int0 = isc_tr_handle_impl0.getState();
      assertEquals(0, isc_tr_handle_impl0.getTransactionIdPtr());
      assertEquals(0, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      int int0 = isc_tr_handle_impl0.getTransactionId();
      assertEquals(0, isc_tr_handle_impl0.getTransactionIdPtr());
      assertEquals(0, isc_tr_handle_impl0.getState());
      assertEquals(0, int0);
  }

  @Test
  public void test7()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      // Undeclared exception!
      try {
        isc_tr_handle_impl0.unsetDbHandle();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      isc_tr_handle_impl0.setState((-1472));
      assertEquals(-1472, isc_tr_handle_impl0.getState());
  }

  @Test
  public void test9()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      isc_blob_handle_impl isc_blob_handle_impl0 = new isc_blob_handle_impl();
      isc_tr_handle_impl0.removeBlob(isc_blob_handle_impl0);
      assertEquals(0, isc_tr_handle_impl0.getState());
      assertEquals(0, isc_tr_handle_impl0.getTransactionIdPtr());
  }

  @Test
  public void test10()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      // Undeclared exception!
      try {
        isc_tr_handle_impl0.setDbHandle((isc_db_handle_impl) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      isc_blob_handle_impl isc_blob_handle_impl0 = new isc_blob_handle_impl();
      isc_tr_handle_impl0.addBlob(isc_blob_handle_impl0);
      assertEquals(0, isc_tr_handle_impl0.getTransactionIdPtr());
      assertEquals(0, isc_tr_handle_impl0.getState());
  }

  @Test
  public void test12()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      int int0 = isc_tr_handle_impl0.getTransactionIdPtr();
      assertEquals(0, int0);
      assertEquals(0, isc_tr_handle_impl0.getState());
  }

  @Test
  public void test13()  throws Throwable  {
      isc_tr_handle_impl isc_tr_handle_impl0 = new isc_tr_handle_impl();
      isc_tr_handle_impl0.forgetResultSets();
      assertEquals(0, isc_tr_handle_impl0.getTransactionIdPtr());
      assertEquals(0, isc_tr_handle_impl0.getState());
  }
}
