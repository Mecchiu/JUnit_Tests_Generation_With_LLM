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
* It contains one unit test case for the {@link Loader#loadDataWithSql()} method.
*/
class LoaderTest {
		
	/**
	 * 从 xml 解析 sql
	 */
	@Test
	public void loadDataWithSql() {
		
		//create a new load test object from the xml
		String loadFileSql = XMLPATH + "load.sql";
		Loader loader = new Loader(loadFileSql);

		//check if the loaded data is a array
		//TODO
		assertTrue(loadDataWithSql(loader)
				instanceof ArrayList);

			//run loadDataWithSql();
			//loadCount();

	}

	/**
	 * 获取总记录数
	 */
	@Test
	public void getCount(){
		Loader loader = new Loader("load.sql");
		List loadCount = loader.getCount();		
		List resultList = list(loadCount.size());
		assertTrue(resultList.size() == loadCount.size());
		assertTrue(loadCount.iterator().hasNext());
		//run getCount()
		loadCount.clear();
		loadCount.addAll(resultList );
		assertEquals(loadCount.size(),1);
	}	

	/**
	 * 获取sql中的字段名集合
	 */
	@Test
	public void getColsName(){
		Loader loader = new Loader(XMLPATH + "load.sql");
		HashMap<String, List<String>> map = loader.getColsName();

		assertNotNull(map);
		assertNotNull(map.get(sql));
		assertFalse(map.get(sql).isEmpty());
		List<String> list = map.get(sql);
		assertEquals(list.size(),1);
		assertEquals(list.get(0),sql);
	}

	/**
	 * 查询数据
	 */
	@Test
	public void getArrayResults(){
		String sql1 = "select * from arrayResults";
		String sql2 = "select * from arrayResults where arr_val is NOT null and arr_val = '1'";
		String sql3 = "select * from arrayResults where arr_val = '0'";
		String sql4 = "select * from arrayResults where arr_val = null";

		Loader loader = new Loader(XMLPATH + "load.xml");
		ArrayList arrayList = loader.getArrayResults();

		assertNotNull(arrayList);
		assertEquals(arrayList.size(),3);
		arrayList.iterator().next();
		assertTrue(arrayList.contains("1"));

		arrayList.iterator().next();
		assertTrue(arrayList.contains("2"));

		arrayList.iterator().next();
		assertTrue(arrayList.contains("3"));

		arrayList.iterator().remove();
		assertEquals(arrayList.size(),2);

		arrayList.iterator().next();
		assertTrue(arrayList.contains("4"));

		arrayList.iterator().next();
		assertTrue(arrayList.contains("5"));

		arrayList.iterator().remove();
		assertEquals(arrayList.size(),1);

		arrayList.iterator().next();
		assertTrue(arrayList.contains("6"));

		arrayList.iterator().next();
		assertTrue(arrayList.contains("7"));

		arrayList.iterator().remove();
		assertEquals(arrayList.size(),0);
	}	

	/**
	 * 查询数据
	 */
	private List loadXML(String loadFileSql) {
		List loaderList = new ArrayList();
 		List<HashMap<String, String>> loaderlist = getLoader(loadFileSql);
 		loaderlist.iterator().next();
		return loaderlist;
	}

	private List<HashMap<String,String>> getLoader(String loadFileSql) {
		return null;
	}

	private List loadFile(String loadFileSql) {
		return null;
	}

	
	
	
	
	
	
	

}