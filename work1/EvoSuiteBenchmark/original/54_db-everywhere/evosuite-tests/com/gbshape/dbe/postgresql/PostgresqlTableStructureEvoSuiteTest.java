/*
 * This file was automatically generated by EvoSuite
 */

package com.gbshape.dbe.postgresql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.gbshape.dbe.postgresql.PostgresqlTableStructure;
import com.gbshape.dbe.struts.bean.ColumnBean;
import com.gbshape.dbe.struts.bean.DBDataBean;
import com.gbshape.dbe.struts.bean.TableStatusBean;
import com.gbshape.dbe.struts.bean.TableStructureBean;
import com.gbshape.dbe.struts.form.ColumnForm;
import com.gbshape.dbe.xml.CreateTableXmlBean;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PostgresqlTableStructureEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        postgresqlTableStructure0.dropUnique((HttpServletRequest) null, dBDataBean0, "", "", "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        postgresqlTableStructure0.dropPrimary((HttpServletRequest) null, dBDataBean0, ".9", ".9", ".9");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        postgresqlTableStructure0.dropIndex((HttpServletRequest) null, dBDataBean0, "[\t/", "[\t/", "[\t/");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        postgresqlTableStructure0.alterDrop((HttpServletRequest) null, dBDataBean0, "varchar", "varchar");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        postgresqlTableStructure0.addIndex((HttpServletRequest) null, dBDataBean0, "n", "n");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      // Undeclared exception!
      try {
        postgresqlTableStructure0.drop((HttpServletRequest) null, (DBDataBean) null, "Ov2A~qi(6a~D`'4#D<:");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        postgresqlTableStructure0.addUnique((HttpServletRequest) null, dBDataBean0, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        postgresqlTableStructure0.truncate((HttpServletRequest) null, dBDataBean0, "C9-t");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      TableStatusBean tableStatusBean0 = postgresqlTableStructure0.getStatus(dBDataBean0, "C9-t", false);
      assertEquals("C9-t", tableStatusBean0.getTableName());
  }

  @Test
  public void test9()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      TableStatusBean tableStatusBean0 = postgresqlTableStructure0.getStatus(dBDataBean0, "  F5re en() for ", true);
      assertEquals("  F5re en() for ", tableStatusBean0.getTableName());
  }

  @Test
  public void test10()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      TableStructureBean tableStructureBean0 = postgresqlTableStructure0.getStructure(dBDataBean0, "' doesn't map to an existing object");
      assertEquals("' doesn't map to an existing object", tableStructureBean0.getTableName());
      assertNotNull(tableStructureBean0);
  }

  @Test
  public void test11()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      // Undeclared exception!
      try {
        postgresqlTableStructure0.getStructure((DBDataBean) null, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      ColumnForm columnForm0 = new ColumnForm();
      columnForm0.setDataType("varchar");
      ColumnBean columnBean0 = new ColumnBean();
      // Undeclared exception!
      try {
        postgresqlTableStructure0.alterModify((HttpServletRequest) null, dBDataBean0, "' doesn't map to an existing object", columnBean0, columnForm0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * StringEquals is not supposed to work on a null caller
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      ColumnBean columnBean0 = new ColumnBean();
      ColumnForm columnForm0 = new ColumnForm();
      columnForm0.setNotnull("to");
      ArrayList<Object> arrayList0 = postgresqlTableStructure0.alterModify((HttpServletRequest) null, (DBDataBean) null, "to", columnBean0, columnForm0);
      assertNotNull(arrayList0);
      assertEquals("[ALTER TABLE to CHANGE      DEFAULT '' ]", arrayList0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      ColumnForm columnForm0 = new ColumnForm();
      columnForm0.setDataType("varchar");
      // Undeclared exception!
      try {
        postgresqlTableStructure0.alterAdd((HttpServletRequest) null, dBDataBean0, "varchar", columnForm0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * StringEquals is not supposed to work on a null caller
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      ColumnForm columnForm0 = new ColumnForm();
      columnForm0.setDefaultValue("ENUM");
      // Undeclared exception!
      try {
        postgresqlTableStructure0.alterAdd((HttpServletRequest) null, dBDataBean0, "ENUM", columnForm0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * StringEquals is not supposed to work on a null caller
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      ColumnForm columnForm0 = new ColumnForm();
      columnForm0.setNotnull("ENUM");
      ArrayList<Object> arrayList0 = postgresqlTableStructure0.alterAdd((HttpServletRequest) null, dBDataBean0, "ENUM", columnForm0);
      assertEquals("[ALTER TABLE ENUM ADD    ]", arrayList0.toString());
      assertNotNull(arrayList0);
  }

  @Test
  public void test17()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      createTableXmlBean0.addColumn((ColumnBean) null);
      ArrayList<Object> arrayList0 = postgresqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertNotNull(arrayList0);
      assertEquals("[CREATE TABLE  ()]", arrayList0.toString());
  }

  @Test
  public void test18()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      ColumnBean columnBean0 = new ColumnBean();
      createTableXmlBean0.addColumn(columnBean0);
      ArrayList<Object> arrayList0 = postgresqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertNotNull(arrayList0);
      assertEquals("[CREATE TABLE  ()]", arrayList0.toString());
  }

  @Test
  public void test19()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      ColumnBean columnBean0 = new ColumnBean();
      createTableXmlBean0.addColumn(columnBean0);
      columnBean0.setName("Cannot add nodes (o an attribute node!");
      createTableXmlBean0.addColumn(columnBean0);
      ArrayList<Object> arrayList0 = postgresqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertEquals("[CREATE TABLE  (Cannot add nodes (o an attribute node!   NOT NULL ,Cannot add nodes (o an attribute node!   NOT NULL )]", arrayList0.toString());
      assertNotNull(arrayList0);
  }

  @Test
  public void test20()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      ColumnBean columnBean0 = new ColumnBean();
      columnBean0.setKey(true);
      createTableXmlBean0.addColumn(columnBean0);
      columnBean0.setName("Cannot add nodes (o an attribute node!");
      createTableXmlBean0.addColumn(columnBean0);
      ArrayList<Object> arrayList0 = postgresqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertNotNull(arrayList0);
      assertEquals("[CREATE TABLE  (Cannot add nodes (o an attribute node!   NOT NULL ,Cannot add nodes (o an attribute node!   NOT NULL , PRIMARY KEY  (Cannot add nodes (o an attribute node!,Cannot add nodes (o an attribute node!))]", arrayList0.toString());
  }

  @Test
  public void test21()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      createTableXmlBean0.setComment("  F5re en() for ");
      ArrayList<Object> arrayList0 = postgresqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertNotNull(arrayList0);
      assertEquals("[CREATE TABLE  () COMMENT = '  F5re en() for ' ]", arrayList0.toString());
  }

  @Test
  public void test22()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      ColumnBean columnBean0 = new ColumnBean();
      ArrayList<Object> arrayList0 = columnBean0.getConstraintList();
      createTableXmlBean0.setColumns(arrayList0);
      createTableXmlBean0.addColumn(columnBean0);
      // Undeclared exception!
      try {
        postgresqlTableStructure0.changePrimary((HttpServletRequest) null, dBDataBean0, "Cannot add nodes (o an attribute node!", (ArrayList) arrayList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      PostgresqlTableStructure postgresqlTableStructure0 = new PostgresqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      ColumnBean columnBean0 = new ColumnBean();
      columnBean0.setKey(true);
      ArrayList<Object> arrayList0 = columnBean0.getConstraintList();
      createTableXmlBean0.setColumns(arrayList0);
      createTableXmlBean0.addColumn(columnBean0);
      columnBean0.setName("Cannot add nodes (o an attribute node!");
      createTableXmlBean0.addColumn(columnBean0);
      // Undeclared exception!
      try {
        postgresqlTableStructure0.changePrimary((HttpServletRequest) null, dBDataBean0, "Cannot add nodes (o an attribute node!", (ArrayList) arrayList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
