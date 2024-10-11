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
	*   - The query sql is null.
	*
	* Expected:
	*   - The query sql is null.
	*/
	@Test
	public void testCase1() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql(null);
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, rows);
	}
	
	/**
	* Test case 2:
	*
	* Condition:
	*   - The query sql is empty.
	*
	* Expected:
	*   - The query sql is empty.
	*/
	@Test
	public void testCase2() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, rows);
	}
	
	/**
	* Test case 3:
	*
	* Condition:
	*   - The query sql is not empty.
	*
	* Expected:
	*   - The query sql is not empty.
	*/
	@Test
	public void testCase3() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from user");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, rows);
	}
	
	/**
	* Test case 4:
	*
	* Condition:
	*   - The query sql is not empty.
	*
	* Expected:
	*   - The query sql is not empty.
	*/
	@Test
	public void testCase4() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from user");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, rows);
	}
	
	/**
	* Test case 5:
	*
	* Condition:
	*   - The query sql is not empty.
	*
	* Expected:
	*   - The query sql is not empty.
	*/
	@Test
	public void testCase5() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from user");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, rows);
	}
	
	/**
	* Test case 6:
	*
	* Condition:
	*   - The query sql is not empty.
	*
	* Expected:
	*   - The query sql is not empty.
	*/
	@Test
	public void testCase6() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from user");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, rows);
	}
	
	/**
	* Test case 7:
	*
	* Condition:
	*   - The query sql is not empty.
	*
	* Expected:
	*   - The query sql is not empty.
	*/
	@Test
	public void testCase7() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from user");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, rows);
	}
	
	/**
	* Test case 8:
	*
	* Condition:
	*   - The query sql is not empty.
	*
	* Expected:
	*   - The query sql is not empty.
	*/
	@Test
	public void testCase8() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from user");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, rows);
	}
	
	/**
	* Test case 9:
	*
	* Condition:
	*   - The query sql is not empty.
	*
	* Expected:
	*   - The query sql is not empty.
	*/
	@Test
	public void testCase9() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from user");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, rows);
	}
	
	/**
	* Test case 10:
	*
	* Condition:
	*   - The query sql is not empty.
	*
	* Expected:
	*   - The query sql is not empty.
	*/
	@Test
	public void testCase10() {
		// Given
		Loader loader = new Loader();
		loader.setQuerySql("select * from user");
		
		// When
		List rows = loader.loadDataWithSql();
		
		// Then
		assertEquals(null, rows);
	}
}