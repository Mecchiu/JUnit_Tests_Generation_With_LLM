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

	public LoaderTest() {
        
    }

		/**
	 *
	 */
	@Test
    public void testLoadedData() {
        
    }

    /**
     * 获取sql解析出来的记录数
     */
    public void getCountSql(String flag);

    /**
     * 查询sql解析出来的记录数
     */
    public void getCount(List<List> count);

	/**
	 * <p>
	 * 获取sql
	 * @return
	 */
    public Query getParams(Query flag, String[][] params);

	/**
	 * parse xml
	 */
	public void parseXML() {
		// TODO Auto-generated method stub
		
	}
}
