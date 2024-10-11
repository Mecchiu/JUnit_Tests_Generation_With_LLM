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
	* <p>
	* This test case is used to test the {@link Loader#loadDataWithSql()} method.
	*
	* <p>
	* The test case is passed if the method returns a list of data.
	*/
	@Test
	public void testLoadDataWithSql1() {
		Loader loader = new Loader();
		loader.setFilepath("sqlfolder/test.xml");
		loader.setSql("test");
		loader.setStart(0);
		loader.setLimit(10);
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(true);
		loader.setQueryValue("");
		loader.parseXML();
		loader.getCount();
		loader.getColsName();
		loader.getQuerySql();
		List list = loader.loadDataWithSql();
		assertNotNull(list);
	}
	
	/**
	* Test case 2:
	*
	* <p>
	* This test case is used to test the {@link Loader#loadDataWithSql()} method.
	*
	* <p>
	* The test case is passed if the method returns a list of data.
	*/
	@Test
	public void testLoadDataWithSql2() {
		Loader loader = new Loader();
		loader.setFilepath("sqlfolder/test.xml");
		loader.setSql("test");
		loader.setStart(0);
		loader.setLimit(10);
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(true);
		loader.setQueryValue("");
		loader.parseXML();
		loader.getCount();
		loader.getColsName();
		loader.getQuerySql();
		List list = loader.loadDataWithSql();
		assertNotNull(list);
	}
	
	/**
	* Test case 3:
	*
	* <p>
	* This test case is used to test the {@link Loader#loadDataWithSql()} method.
	*
	* <p>
	* The test case is passed if the method returns a list of data.
	*/
	@Test
	public void testLoadDataWithSql3() {
		Loader loader = new Loader();
		loader.setFilepath("sqlfolder/test.xml");
		loader.setSql("test");
		loader.setStart(0);
		loader.setLimit(10);
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(true);
		loader.setQueryValue("");
		loader.parseXML();
		loader.getCount();
		loader.getColsName();
		loader.getQuerySql();
		List list = loader.loadDataWithSql();
		assertNotNull(list);
	}
	
	/**
	* Test case 4:
	*
	* <p>
	* This test case is used to test the {@link Loader#loadDataWithSql()} method.
	*
	* <p>
	* The test case is passed if the method returns a list of data.
	*/
	@Test
	public void testLoadDataWithSql4() {
		Loader loader = new Loader();
		loader.setFilepath("sqlfolder/test.xml");
		loader.setSql("test");
		loader.setStart(0);
		loader.setLimit(10);
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(true);
		loader.setQueryValue("");
		loader.parseXML();
		loader.getCount();
		loader.getColsName();
		loader.getQuerySql();
		List list = loader.loadDataWithSql();
		assertNotNull(list);
	}
	
	/**
	* Test case 5:
	*
	* <p>
	* This test case is used to test the {@link Loader#loadDataWithSql()} method.
	*
	* <p>
	* The test case is passed if the method returns a list of data.
	*/
	@Test
	public void testLoadDataWithSql5() {
		Loader loader = new Loader();
		loader.setFilepath("sqlfolder/test.xml");
		loader.setSql("test");
		loader.setStart(0);
		loader.setLimit(10);
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(true);
		loader.setQueryValue("");
		loader.parseXML();
		loader.getCount();
		loader.getColsName();
		loader.getQuerySql();
		List list = loader.loadDataWithSql();
		assertNotNull(list);
	}
	
	/**
	* Test case 6:
	*
	* <p>
	* This test case is used to test the {@link Loader#loadDataWithSql()} method.
	*
	* <p>
	* The test case is passed if the method returns a list of data.
	*/
	@Test
	public void testLoadDataWithSql6() {
		Loader loader = new Loader();
		loader.setFilepath("sqlfolder/test.xml");
		loader.setSql("test");
		loader.setStart(0);
		loader.setLimit(10);
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(true);
		loader.setQueryValue("");
		loader.parseXML();
		loader.getCount();
		loader.getColsName();
		loader.getQuerySql();
		List list = loader.loadDataWithSql();
		assertNotNull(list);
	}
	
	/**
	* Test case 7:
	*
	* <p>
	* This test case is used to test the {@link Loader#loadDataWithSql()} method.
	*
	* <p>
	* The test case is passed if the method returns a list of data.
	*/
	@Test
	public void testLoadDataWithSql7() {
		Loader loader = new Loader();
		loader.setFilepath("sqlfolder/test.xml");
		loader.setSql("test");
		loader.setStart(0);
		loader.setLimit(10);
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(true);
		loader.setQueryValue("");
		loader.parseXML();
		loader.getCount();
		loader.getColsName();
		loader.getQuerySql();
		List list = loader.loadDataWithSql();
		assertNotNull(list);
	}
	
	/**
	* Test case 8:
	*
	* <p>
	* This test case is used to test the {@link Loader#loadDataWithSql()} method.
	*
	* <p>
	* The test case is passed if the method returns a list of data.
	*/
	@Test
	public void testLoadDataWithSql8() {
		Loader loader = new Loader();
		loader.setFilepath("sqlfolder/test.xml");
		loader.setSql("test");
		loader.setStart(0);
		loader.setLimit(10);
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(true);
		loader.setQueryValue("");
		loader.parseXML();
		loader.getCount();
		loader.getColsName();
		loader.getQuerySql();
		List list = loader.loadDataWithSql();
		assertNotNull(list);
	}
	
	/**
	* Test case 9:
	*
	* <p>
	* This test case is used to test the {@link Loader#loadDataWithSql()} method.
	*
	* <p>
	* The test case is passed if the method returns a list of data.
	*/
	@Test
	public void testLoadDataWithSql9() {
		Loader loader = new Loader();
		loader.setFilepath("sqlfolder/test.xml");
		loader.setSql("test");
		loader.setStart(0);
		loader.setLimit(10);
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(true);
		loader.setQueryValue("");
		loader.parseXML();
		loader.getCount();
		loader.getColsName();
		loader.getQuerySql();
		List list = loader.loadDataWithSql();
		assertNotNull(list);
	}
	
	/**
	* Test case 10:
	*
	* <p>
	* This test case is used to test the {@link Loader#loadDataWithSql()} method.
	*
	* <p>
	* The test case is passed if the method returns a list of data.
	*/
	@Test
	public void testLoadDataWithSql10() {
		Loader loader = new Loader();
		loader.setFilepath("sqlfolder/test.xml");
		loader.setSql("test");
		loader.setStart(0);
		loader.setLimit(10);
		loader.setSort("id");
		loader.setDir("asc");
		loader.setPaging(true);
		loader.setQueryValue("");
		loader.parseXML();
		loader.getCount();
		loader.getColsName();
		loader.getQuerySql();
		List list = loader.loadDataWithSql();
		assertNotNull(list);
	}
}