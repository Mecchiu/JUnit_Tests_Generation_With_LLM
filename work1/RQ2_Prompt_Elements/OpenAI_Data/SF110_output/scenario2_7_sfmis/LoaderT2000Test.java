// LoaderTest.java
package com.hf.sfm.util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Loader}.
* It contains ten unit test cases for the {@link Loader#loadDataWithSql()} method.
*/
class LoaderTest {

	/**
	* Test case 1:
	*
	* Condition:
	*   - The query SQL is null.
	*
	* Expected:
	*   - The query SQL is null.
	*/
	@Test
	public void testCase1() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql(null);
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, loader.getQuerySql());
	}
	
	/**
	* Test case 2:
	*
	* Condition:
	*   - The query SQL is empty.
	*
	* Expected:
	*   - The query SQL is empty.
	*/
	@Test
	public void testCase2() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals("", loader.getQuerySql());
	}
	
	/**
	* Test case 3:
	*
	* Condition:
	*   - The query SQL is not empty.
	*
	* Expected:
	*   - The query SQL is not empty.
	*/
	@Test
	public void testCase3() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from table");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals("select * from table", loader.getQuerySql());
	}
	
	/**
	* Test case 4:
	*
	* Condition:
	*   - The query SQL is not empty.
	*   - The sort is null.
	*
	* Expected:
	*   - The query SQL is not empty.
	*   - The sort is null.
	*/
	@Test
	public void testCase4() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from table");
		loader.setSort(null);
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals("select * from table", loader.getQuerySql());
		assertEquals(null, loader.getSort());
	}
	
	/**
	* Test case 5:
	*
	* Condition:
	*   - The query SQL is not empty.
	*   - The sort is empty.
	*
	* Expected:
	*   - The query SQL is not empty.
	*   - The sort is empty.
	*/
	@Test
	public void testCase5() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from table");
		loader.setSort("");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals("select * from table", loader.getQuerySql());
		assertEquals("", loader.getSort());
	}
	
	/**
	* Test case 6:
	*
	* Condition:
	*   - The query SQL is not empty.
	*   - The sort is not empty.
	*
	* Expected:
	*   - The query SQL is not empty.
	*   - The sort is not empty.
	*/
	@Test
	public void testCase6() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from table");
		loader.setSort("id");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals("select * from table", loader.getQuerySql());
		assertEquals("id", loader.getSort());
	}
	
	/**
	* Test case 7:
	*
	* Condition:
	*   - The query SQL is not empty.
	*   - The sort is not empty.
	*   - The dir is null.
	*
	* Expected:
	*   - The query SQL is not empty.
	*   - The sort is not empty.
	*   - The dir is null.
	*/
	@Test
	public void testCase7() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from table");
		loader.setSort("id");
		loader.setDir(null);
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals("select * from table", loader.getQuerySql());
		assertEquals("id", loader.getSort());
		assertEquals(null, loader.getDir());
	}
	
	/**
	* Test case 8:
	*
	* Condition:
	*   - The query SQL is not empty.
	*   - The sort is not empty.
	*   - The dir is empty.
	*
	* Expected:
	*   - The query SQL is not empty.
	*   - The sort is not empty.
	*   - The dir is empty.
	*/
	@Test
	public void testCase8() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from table");
		loader.setSort("id");
		loader.setDir("");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals("select * from table", loader.getQuerySql());
		assertEquals("id", loader.getSort());
		assertEquals("", loader.getDir());
	}
	
	/**
	* Test case 9:
	*
	* Condition:
	*   - The query SQL is not empty.
	*   - The sort is not empty.
	*   - The dir is not empty.
	*
	* Expected:
	*   - The query SQL is not empty.
	*   - The sort is not empty.
	*   - The dir is not empty.
	*/
	@Test
	public void testCase9() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from table");
		loader.setSort("id");
		loader.setDir("asc");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals("select * from table", loader.getQuerySql());
		assertEquals("id", loader.getSort());
		assertEquals("asc", loader.getDir());
	}
	
	/**
	* Test case 10:
	*
	* Condition:
	*   - The query SQL is not empty.
	*   - The sort is not empty.
	*   - The dir is not empty.
	*   - The paging is false.
	*
	* Expected:
	*   - The query SQL is not empty.
	*   - The sort is not empty.
	*   - The dir is not empty.
	*   - The paging is false.
	*/
	@Test
	public void testCase10() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from table");
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(false);
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals("select * from table", loader.getQuerySql());
		assertEquals("id", loader.getSort());