// Loader_0Test.java
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
class Loader_0Test {

		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* @throws DocumentException 
		*/
		@Test
		void testLoadDataWithSql_0() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.loadDataWithSql();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
				assertEquals(0, loader.getRs().size());
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* @throws DocumentException 
		*/
		@Test
		void testLoadDataWithSql_1() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.loadDataWithSql();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
				assertEquals(0, loader.getRs().size());
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* @throws DocumentException 
		*/
		@Test
		void testLoadDataWithSql_2() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.loadDataWithSql();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
				assertEquals(0, loader.getRs().size());
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* @throws DocumentException 
		*/
		@Test
		void testLoadDataWithSql_3() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.loadDataWithSql();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
				assertEquals(0, loader.getRs().size());
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* @throws DocumentException 
		*/
		@Test
		void testLoadDataWithSql_4() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.loadDataWithSql();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
				assertEquals(0, loader.getRs().size());
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* @throws DocumentException 
		*/
		@Test
		void testLoadDataWithSql_5() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.loadDataWithSql();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
				assertEquals(0, loader.getRs().size());
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* @throws DocumentException 
		*/
		@Test
		void testLoadDataWithSql_6() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.loadDataWithSql();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
				assertEquals(0, loader.getRs().size());
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* @throws DocumentException 
		*/
		@Test
		void testLoadDataWithSql_7() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.loadDataWithSql();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
				assertEquals(0, loader.getRs().size());
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* @throws DocumentException 
		*/
		@Test
		void testLoadDataWithSql_8() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.loadDataWithSql();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
				assertEquals(0, loader.getRs().size());
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* @throws DocumentException 
		*/
		@Test
		void testLoadDataWithSql_9() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.loadDataWithSql();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
				assertEquals(0, loader.getRs().size());
		}
		
}

// Loader_1Test.java
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
* It contains ten unit test cases for the {@link Loader#getCount()} method.
*/
class Loader_1Test {
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* @throws DocumentException 
		*/
		@Test
		void testGetCount_0() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.getCount();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
		}
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* @throws DocumentException 
		*/
		@Test
		void testGetCount_1() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.getCount();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
		}
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* @throws DocumentException 
		*/
		@Test
		void testGetCount_2() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue(null);
				
				// Act
				loader.getCount();
				
				// Assert
				assertEquals(0, loader.getTotalCount());
		}
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* @throws DocumentException 
		*/
		@Test
		void testGetCount_3() throws DocumentException {
				// Arrange
				Loader loader = new Loader();
				loader.setSql("select * from t_user");
				loader.setPaging(false);
				loader.setStart(0);
				loader.setLimit(0);
				loader.setSort("");
				loader.setDir("");
				loader.setPas(null);
				loader.setQuerySql(null);
				loader.setQueryValue