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
	 * @throws java.lang.Exception
	 */
    @Test
	public void test_loadArray(){
		LoadClass loadTest = new LoadClass();
		loadTest.loadArray();
		
	}
}



/**
* Load class of {@link Loader}.
* It contains one unit test case for the {@link Loader#parseXML()} method.
*/
class LoadClass {
        
        @Test
		public void test_parseXML() throws DocumentException, ParseException{
//                List list = ParseUtilUtils.getList(XMLPATH+"test_parse_list.sql");
			List<List<Object>> list = ParseUtilUtils.getList(XMLPATH+"test_parse_list.sql");
			assertEquals(2,list.size());
			
			List list1 = ParseUtilUtils.getListWithFieldNames(XMLPATH+"test_parse_withFieldNames.sql");
			
			assertEquals(3,list1.size());
			
			List result1 = ParseUtilUtils.getResultList(XMLPATH+"test_parse_withResultList.sql");
			assertEquals(2,result1.size());
			assertTrue("1. 字节类型是不是数据",result1.contains(Double.TYPE));
			
			
		}

}