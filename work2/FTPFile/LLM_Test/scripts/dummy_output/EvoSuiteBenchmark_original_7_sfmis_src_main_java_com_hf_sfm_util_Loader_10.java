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
	 * Test method for {@link Loader#loadDataWithSql()}.
	 */
	@Test
  public void testLoadDataWithSql() throws Exception {
		BasePara basePara = new BasePara();
		String[][] params = {{"a"}, {"b}};
		{
			// Sqlが制限に意図があるため探索が行われる。
			// 毎の場合に探索してください。

			Session session = ConnectionPool.getSession();
			Query query = session.createQuery("select a, b from t");
			//返回抽出できる。

			BasePara para = basePara;
			para.setFilepath(XMLPATH + "loadDataWithSql.xml");
			para.setParam(params);
			para.setSql(SQL_LOAD_DATA_BEFORE);

			Object result = query.iterate();
			if (result!= null) {
				QueryResult res1 = (QueryResult) result;
				assertEquals(ParseStatus.E_SENT, res1.getStatus());
				assertEquals(params, res1.getObjects());
			}
		}
	}

	/**
	 * シグナルの削除
	 */
	private static final Object lock = new Object();

	public void waitForDelete(int n) throws InterruptedException {
		synchronized (lock) {
			for (int i = 0; i < n; i++) {
				lock.wait(500);
			}
		}
	}
}