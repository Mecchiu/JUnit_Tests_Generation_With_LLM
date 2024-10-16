/*
 * This file was automatically generated by EvoSuite
 */

package com.gbshape.dbe.mysql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.gbshape.dbe.mysql.MysqlTableStructure;
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
public class MysqlTableStructureEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        mysqlTableStructure0.addUnique((HttpServletRequest) null, dBDataBean0, "=QX4[yDpkei|u,/<Izq", "=QX4[yDpkei|u,/<Izq");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        mysqlTableStructure0.dropPrimary((HttpServletRequest) null, dBDataBean0, "W", "W", "W");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      // Undeclared exception!
      try {
        mysqlTableStructure0.truncate((HttpServletRequest) null, (DBDataBean) null, "EJg>");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        mysqlTableStructure0.addIndex((HttpServletRequest) null, dBDataBean0, "FR", "FR");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        mysqlTableStructure0.dropIndex((HttpServletRequest) null, dBDataBean0, "r", "r", "r");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        mysqlTableStructure0.dropUnique((HttpServletRequest) null, dBDataBean0, "9%QcsUr3YT1/", "9%QcsUr3YT1/", "9%QcsUr3YT1/");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        mysqlTableStructure0.alterDrop((HttpServletRequest) null, dBDataBean0, "org.apache.struts.util.PrLpertyMessageResourcesFactory", "org.apache.struts.util.PrLpertyMessageResourcesFactory");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      // Undeclared exception!
      try {
        mysqlTableStructure0.drop((HttpServletRequest) null, dBDataBean0, "I");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      TableStatusBean tableStatusBean0 = mysqlTableStructure0.getStatus(dBDataBean0, "FR", false);
      assertEquals("FR", tableStatusBean0.getTableName());
  }

  @Test
  public void test9()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      TableStatusBean tableStatusBean0 = mysqlTableStructure0.getStatus(dBDataBean0, "", true);
      assertEquals("", tableStatusBean0.getAutoIncrement());
  }

  @Test
  public void test10()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      TableStructureBean tableStructureBean0 = mysqlTableStructure0.getStructure(dBDataBean0, "");
      assertEquals("", tableStructureBean0.getTableName());
  }

  @Test
  public void test11()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      ColumnForm columnForm0 = new ColumnForm();
      columnForm0.setNotnull("");
      ColumnBean columnBean0 = new ColumnBean();
      ArrayList<Object> arrayList0 = mysqlTableStructure0.alterModify((HttpServletRequest) null, dBDataBean0, "", columnBean0, columnForm0);
      assertNotNull(arrayList0);
      assertEquals("[ALTER TABLE `` CHANGE `` ``    DEFAULT '' ]", arrayList0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      ColumnForm columnForm0 = new ColumnForm();
      columnForm0.setNotnull("");
      ArrayList<Object> arrayList0 = mysqlTableStructure0.alterAdd((HttpServletRequest) null, dBDataBean0, "", columnForm0);
      assertEquals("[ALTER TABLE `` ADD ``   ]", arrayList0.toString());
      assertNotNull(arrayList0);
  }

  @Test
  public void test13()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      ColumnBean columnBean0 = new ColumnBean();
      createTableXmlBean0.addColumn(columnBean0);
      ArrayList<Object> arrayList0 = mysqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertNotNull(arrayList0);
      assertEquals("[CREATE TABLE `` ()]", arrayList0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      createTableXmlBean0.addColumn((ColumnBean) null);
      ArrayList<Object> arrayList0 = mysqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertEquals("[CREATE TABLE `` ()]", arrayList0.toString());
      assertNotNull(arrayList0);
  }

  @Test
  public void test15()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      ColumnBean columnBean0 = new ColumnBean();
      createTableXmlBean0.addColumn(columnBean0);
      columnBean0.setName("=QX4[yDpkei|u,/<Izq");
      columnBean0.setNullable(true);
      ArrayList<Object> arrayList0 = mysqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertEquals("[CREATE TABLE `` (`=QX4[yDpkei|u,/<Izq`   NULL )]", arrayList0.toString());
      assertNotNull(arrayList0);
  }

  @Test
  public void test16()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      ColumnBean columnBean0 = new ColumnBean();
      createTableXmlBean0.addColumn(columnBean0);
      columnBean0.setName("=QX4[yDpkei|u,/<Izq");
      columnBean0.setDefaultValue("=QX4[yDpkei|u,/<Izq");
      ArrayList<Object> arrayList0 = mysqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertNotNull(arrayList0);
      assertEquals("[CREATE TABLE `` (`=QX4[yDpkei|u,/<Izq`   NOT NULL  default '=QX4[yDpkei|u,/<Izq' )]", arrayList0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      ColumnBean columnBean0 = new ColumnBean();
      createTableXmlBean0.addColumn(columnBean0);
      columnBean0.setName("=QX4[yDpkei|u,/<Izq");
      columnBean0.setIndex(true);
      createTableXmlBean0.addColumn(columnBean0);
      ArrayList<Object> arrayList0 = mysqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertEquals("[CREATE TABLE `` (`=QX4[yDpkei|u,/<Izq`   NOT NULL ,`=QX4[yDpkei|u,/<Izq`   NOT NULL , INDEX  (`=QX4[yDpkei|u,/<Izq`,`=QX4[yDpkei|u,/<Izq`))]", arrayList0.toString());
      assertNotNull(arrayList0);
  }

  @Test
  public void test18()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      createTableXmlBean0.setComment("=ifugDi;ZCN(mK r");
      ArrayList<Object> arrayList0 = mysqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertNotNull(arrayList0);
      assertEquals("[CREATE TABLE `` () COMMENT = '=ifugDi;ZCN(mK r' ]", arrayList0.toString());
  }

  @Test
  public void test19()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      ColumnBean columnBean0 = new ColumnBean();
      ArrayList<Object> arrayList0 = columnBean0.getConstraintList();
      // Undeclared exception!
      try {
        mysqlTableStructure0.changePrimary((HttpServletRequest) null, dBDataBean0, "processFrwardConfig(", (ArrayList) arrayList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      MysqlTableStructure mysqlTableStructure0 = new MysqlTableStructure();
      DBDataBean dBDataBean0 = new DBDataBean();
      CreateTableXmlBean createTableXmlBean0 = new CreateTableXmlBean();
      ArrayList<Object> arrayList0 = mysqlTableStructure0.create((HttpServletRequest) null, dBDataBean0, createTableXmlBean0);
      assertNotNull(arrayList0);
      
      // Undeclared exception!
      try {
        mysqlTableStructure0.changePrimary((HttpServletRequest) null, dBDataBean0, "=ifugDi;ZCN(mK r", (ArrayList) arrayList0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to com.gbshape.dbe.struts.bean.ColumnBean
         */
      }
  }
}
