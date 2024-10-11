// QueueDAO_0Test.java
package org.heal.module.catalog;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.util.CommonDAO;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QueueDAO}.
* It contains one unit test case for the {@link QueueDAO#getQueueByType(String)} method.
*/
class QueueDAO_0Test {
		
	@Test
	void test1() {
		
		String table = "QueuedRecords";
		Connection conn = null;
		String query = null;
		ResultSet resultSet = null;

		try {
            conn = jdbcUtil.getNamedConnection("Connection to test");

			dataSource = jdbcUtil.getNamedDataSource("DataSource to test");
			DataSource dataSourceTest = jdbcUtil.getDataSource();
			SimpleDateFormat sdf = new SimpleDateFormat();
			Date date = sdf.parse("2013-10-12");

			// test that the table exists
			query = "SELECT " + table + " FROM " + table;
			resultSet = conn.createStatement().executeQuery(query);
			assertTrue(resultSet.next());

			// test that the table is of type Catalog
			assertEquals(table, ((CompleteMetadataBean) md).getMetadataID());

			// test that the table has a single record
			query = "SELECT * FROM " + table + " WHERE " + table + "." + table + "." + "Status =?";
			resultSet = conn.createStatement().executeQuery(query);
			assertTrue(resultSet.next());
			
			// test that the record has the correct metadata IDs
			query = "SELECT * FROM " + table + " WHERE " + table + "." + table + "." + "MetadataId =?";
			resultSet = conn.createStatement().executeQuery(query);
			assertEquals((String) resultSet.next(), (String) CommonDAO.META.getMetadataId());

			// test that the record is in the catalog
			QueryListener listener = new QueryListener();
			listener.onBeforeQuery(query, null, null);
			
			resultSet = conn.createStatement().executeQuery(query);
			List<Object[]> list = new ArrayList<>(1);
			list.add(new Object[] { "Categories", "catalog" });
			listener.onAfterQuery(resultSet, list, null);
			resultSet = conn.createStatement().executeQuery(query);
			assertTrue(resultSet.next());

			// test that the record is approved and queued
			Connection conn2 = null;
			try {
                conn2 = jdbcUtil.getSqlClient().getConnection(conn);
                conn2.createStatement().execute("CREATE TABLE " + table + " ("
						+ " ID SERIAL,"
						+ "Status VARCHAR(50),"
						+ "Comments TEXT"  + " ) ");

                conn2.createStatement().execute("INSERT INTO " + " " + table + "  ("                    
					+ " ID,"  + "Status," 
					+ "Comments"
		            + ") VALUES (" + " (9),"  + "A,'queued'),   "  + " (10),   "   + " (11),  " + " (12);");

                listener.onQuery(query, "A queued", "queued");

				resultSet = conn2.createStatement().executeQuery(query);

                assertTrue(resultSet.next());
				listener.onQuery(query, "A queued","approved");

				resultSet = conn2.createStatement().executeQuery(query);

                listener.onQuery(query, "A queued","reject");

            } catch (SQLException sqex) {
                sqex.printStackTrace();
            }

            resultSet.close();      // close the statement
			conn.close();       // close the connection
			conn2.close();       // close the conn
			assertTrue(listener.hasListener());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

    }
}