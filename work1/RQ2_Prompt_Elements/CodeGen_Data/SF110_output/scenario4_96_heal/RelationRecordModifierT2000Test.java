// RelationRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.CompleteMetadataBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RelationRecordModifier}.
* It contains one unit test case for the {@link RelationRecordModifier#actionRequiresLogin()} method.
*/
class RelationRecordModifierTest {

  /**
  * Asserts that nothing is added or removed
  * than "this is a comment".
  */
  @Test
  void testRemoveAndAdd() {
      RelationBean br = new RelationBean();
      br.setId("1");


      List records = new List();
      List r = new List();
      r = new List();
      br.records.add(records);
      br.records.add(r);
      br.records.add(records);

      br.updated = 7;
      br.changes.add("this is a comment");

      List expected = new List();
      expected.add("-11");
      expected.add("-10");
      expected.add("-9");
      expected.add("-8");
      expected.add("-7");
      expected.add("-6");
      expected.add("-5");      
      expected.add("-4");
      expected.add("-3");
      expected.add("-2");
      expected.add("-1");
      expected.add("1");      

      RelationBean result = new RelationBean();
      result.records = br.records;
      result.updated = br.updated;
      result.changes = br.changes;
      expected.iterator().next();
      assertEquals(expected, result.records);
      assertEquals(expected.size(), result.records.size());
  }

  /**
  * Asserts that only the changes are added
  */
  @Test
  void testSaveAndRollback() {
      RelationBean br = new RelationBean();
      br.setId("1");


      List records = new List();
      List r = new List();
      r = new List();
      br.records.add(records);
      br.records.add(r);
      br.records.add(records);

      br.changes.add("a=b");

      List expected = new List();
      expected.add("a=b");

      RelationBean result = new RelationBean();
      result.records = br.records;
      result.changes = br.changes;
      expected.iterator().next();
      assertEquals(expected, result.records);
      assertEquals(expected.size(), result.records.size());
      br.updated = 7;
      br.changes.clear();
      RelationBean result1 = new RelationBean();
      result.changes = br.changes;
      assertEquals(expected.size(), result.changes.size());      
  }

  /**
  * Asserts that only the changes are added
  * than the new one.
  */
  @Test
  void testRollbackAndAdd() {
      RelationBean br = new RelationBean();
      br.setId("1");


      List records = new List();
      List r = new List();
      r = new List();
      br.records.add(records);
      br.records.add(r);
      br.records.add(records);

      br.changes.add("a=b");


      List expected = new List();
      expected.add("a=b");

      RelationBean result = new RelationBean();
      result.records = br.records;
      result.changes = br.changes;
      expected.iterator().next();
      assertEquals(expected, result.records);
      assertEquals(expected.size(), br.records.size());      
  }

  /**
  * Asserts that only the changes are added
  */
  @Test
  void testCreateAndRollback() {
      RelationBean br = new RelationBean();
      br.setId("1");


      List records = new List();
      List r = new List();
      r = new List();
      br.records.add(records);
      br.records.add(r);
      br.records.add(records);

      br.changes.add("a=b");


  	final CompleteMetadataBean cb = new CompleteMetadataBean();
	  cb.setId("a");
	  cb.setName("b");
	  cb.setDescription("c");
	  cb.setUnit(1D);
	  cb.setDefaultValue("d");

	  br.changes.add(cb);
      br.updated = 7;
      br.changes.remove("a=b*");

      
      List expected = new List();
      expected.add("-a=b");
      expected.add("-d=c");

      
      RelationBean result = new RelationBean();
      result.records = br.records;
      result.changes = br.changes;
      expected.iterator().next();
      assertEquals(expected, result.records);
      assertEquals(expected.size(), result.records.size());      

  }

  
  /**
  * Asserts that the old relation doesn't exist
  */
  @Test
  void testCreateNewOldRecord() throws Exception {
      
      RelationBean br = new RelationBean();
      br.setId("1");

      List records = new List();
      List r = new List();
      r = new List();
      br.records.add(records);
      br.records.add(r);
      br.records.add(records);

      br.changes.add("a=b");

      final CompleteMetadataBean cb = new CompleteMetadataBean();
      cb.setId("b");
      cb.setName("c");
      cb.setDescription("d");