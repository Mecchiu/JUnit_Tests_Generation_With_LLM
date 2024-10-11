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
		
	private Loader loader;
		
/**
 * @Test
 */
	@Test
	public void testLoad()
	{
		try {
			loader= new Loader();
			loader.loadDataWithSql();
//			loadFile();
			collectToMap();
			run.setParams(params);
			collectToMap();
			generateResultFile(loader.queryForPaging(), flag);
		}
		catch(Exception e){  System.err.println("Error occurred loading data." +e);}
	}
}