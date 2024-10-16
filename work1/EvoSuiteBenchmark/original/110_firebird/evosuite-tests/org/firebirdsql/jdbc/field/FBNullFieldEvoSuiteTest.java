/*
 * This file was automatically generated by EvoSuite
 */

package org.firebirdsql.jdbc.field;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.jdbc.field.FBNullField;
import org.firebirdsql.jdbc.field.FieldDataProvider;

@RunWith(EvoSuiteRunner.class)
public class FBNullFieldEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.firebirdsql.jdbc.field.FBNullField.getFloat()F: root-Branch
   * 2 org.firebirdsql.jdbc.field.FBNullField.<init>(Lorg/firebirdsql/gds/XSQLVAR;Lorg/firebirdsql/jdbc/field/FieldDataProvider;I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 233);
      // Undeclared exception!
      try {
        fBNullField0.getFloat();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.firebirdsql.jdbc.field.FBNullField.getBigDecimal()Ljava/math/BigDecimal;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 0);
      // Undeclared exception!
      try {
        fBNullField0.getBigDecimal(26);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.firebirdsql.jdbc.field.FBNullField.setLong(J)V: root-Branch
   * 2 org.firebirdsql.jdbc.field.FBNullField.setDummyObject()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, (-1));
      // Undeclared exception!
      try {
        fBNullField0.setLong(987L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.firebirdsql.jdbc.field.FBNullField.getBinaryStream()Ljava/io/InputStream;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 0);
      // Undeclared exception!
      try {
        fBNullField0.getCharacterStream();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.firebirdsql.jdbc.field.FBNullField.getInt()I: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 1561);
      // Undeclared exception!
      try {
        fBNullField0.getInt();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.firebirdsql.jdbc.field.FBNullField.getByte()B: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 0);
      // Undeclared exception!
      try {
        fBNullField0.getByte();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.firebirdsql.jdbc.field.FBNullField.getTimestamp()Ljava/sql/Timestamp;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 0);
      // Undeclared exception!
      try {
        fBNullField0.getTimestamp();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.firebirdsql.jdbc.field.FBNullField.setBigDecimal(Ljava/math/BigDecimal;)V: I4 Branch 3 IF_ACMPNE L181 - true
   */
  @Test
  public void test7()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 0);
      BigDecimal bigDecimal0 = new BigDecimal(0);
      // Undeclared exception!
      try {
        fBNullField0.setBigDecimal(bigDecimal0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.firebirdsql.jdbc.field.FBNullField.setAsciiStream(Ljava/io/InputStream;I)V: I4 Branch 4 IF_ACMPNE L197 - true
   */
  @Test
  public void test8()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try {
        fBNullField0.setAsciiStream((InputStream) pipedInputStream0, 1365);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 org.firebirdsql.jdbc.field.FBNullField.setBytes([B)V: I4 Branch 8 IF_ACMPNE L233 - false
   */
  @Test
  public void test9()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 0);
      // Undeclared exception!
      try {
        fBNullField0.setBytes((byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 org.firebirdsql.jdbc.field.FBNullField.setDate(Ljava/sql/Date;Ljava/util/Calendar;)V: I4 Branch 9 IF_ACMPNE L243 - true
   * 2 org.firebirdsql.jdbc.field.FBNullField.setDummyObject()V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 0);
      Date date0 = new Date((-105L));
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(8192, 0, 35);
      // Undeclared exception!
      try {
        fBNullField0.setDate(date0, (Calendar) gregorianCalendar0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 org.firebirdsql.jdbc.field.FBNullField.setTimestamp(Ljava/sql/Timestamp;)V: I4 Branch 14 IF_ACMPNE L283 - false
   */
  @Test
  public void test11()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 0);
      // Undeclared exception!
      try {
        fBNullField0.setTimestamp((Timestamp) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 org.firebirdsql.jdbc.field.FBNullField.setString(Ljava/lang/String;)V: I4 Branch 15 IF_ACMPNE L292 - false
   * 2 org.firebirdsql.jdbc.field.FBNullField.<init>(Lorg/firebirdsql/gds/XSQLVAR;Lorg/firebirdsql/jdbc/field/FieldDataProvider;I)V: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      FBNullField fBNullField0 = new FBNullField(xSQLVAR0, (FieldDataProvider) null, 1800);
      // Undeclared exception!
      try {
        fBNullField0.setString((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
