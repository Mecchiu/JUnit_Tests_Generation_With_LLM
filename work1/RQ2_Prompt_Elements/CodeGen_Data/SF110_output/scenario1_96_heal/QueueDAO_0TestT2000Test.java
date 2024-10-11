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
// QueueDAO.java
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

/**
 * A DAO for managing queues stored in the database
 */
public class QueueDAO implements Serializable {

    public List<QueuedRecordBean> getQueueByType(final String type) {
        List<QueuedRecordBean> result = null;
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            result = getQueue(type, conn);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null!= conn) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}

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
		
	Connection conn;

	String sql = "select * from queue where type = '0'";
	PreparedStatement prepStmt;

	@Test
	void getQueueByName() throws SQLException {
		
		/* Prepare SQL result */
		ResultSet rs = CommonDAO.executeQuery(conn, sql);

		
		/* Result */
		java.io.Reader resultReader = new InputStreamReader(rs.getBinaryStream(1));
		java.sql.Statement stmt = conn.createStatement();
		java.sql.ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

		/* Get Result */
		List<CompleteMetadataBean> recordBean = new ArrayList<CompleteMetadataBean>();
		CompleteMetadataBean meta = null;
		Object obj = null;
		while (rs.next()) {
		    meta = new CompleteMetadataBean();
		    obj = rs.getObject(1);
		    if(obj!= null){
		    	meta = Convert.convert(CompleteMetadataBean.class, obj);
		    }
		}
		
		/* Set Result */
		for(int i=0 ; i < columnCount ; i++){
			meta.set(rsmd.getColumnLabel(i+1), rsmi.getString(i+1));
		}
		
		/* Get Result */
    	System.out.println("Result: ");
		System.out.println(resultReader);
		System.out.println();
		System.out.println(recordBean);
		
		/* Verify Result */
		for(int i=0 ; i < recordBean.size() ; i++) {
			
			CompleteMetadataBean record = recordBean.get(i);
			CompleteMetadataBean readResult = new CompleteMetadataBean();
			CompleteMetadataBean readMetaData = new CompleteMetadataBean();

			readMetaData.set(record.get("name"));
			readMetaData.set(record.get("desc"));
			readMetaData.set(record.get("priority"));
			readResult.set("id", Integer.toString(record.get("id")));
			readResult.set("name", readMetaData.get("name"));
			readResult.set("desc", readMetaData.get("desc"));
			readResult.set("queue_id", Integer.toString(0));
			record.put("queue_id", Integer.toString(i));
			System.out.println("Result: ");
			System.out.println(recordResult);
			System.out.println();
			
			System.out.println("Record ID["+i+"] = "
			+ record.get("id") + " - "
			+ record.get("name") + " - "
			+ record.get("desc"));
			System.out.println();
		}
	}
	
	public void setUp() throws Exception {
			conn = dataSource.getConnection();
			prepStmt  = conn.prepareStatement(sql);
}
	
	public void tearDown() throws Exception {
		if (null!= conn &&! CommonDAO.dropStatement(conn)) {
			conn.close();
		}
	}
	
	/*
	* Test getQueueBean for the empty table.
	*/
    @Test
    public void testGetQueueBean() {
        Exception ex = null;

        try {
			conn.prepareStatement("select * from queue").executeQuery();
            fail("The test should not include the table");
        } catch (SQLException e) {
            ex = e;
        }

        assertEquals("The data source is not correctly used.",
                    1, stmt.executeQuery("select * from queue").getResultSet().next());

        conn.close();
    }
    
    /*
   * Test getTableDataSets() for the empty table.
   */
    @Test
    public void testGetTableDataSets2() {
        try {
            conn.prepareStatement("select * from queue").executeQuery();

            fail("The test should not include the table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.prepareStatement("select id from queue").executeQuery();
            fail("The test should not include the table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.prepareStatement("select priority from queue").executeQuery();
            fail("The test should not include the table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.prepareStatement("select queue_id from queue where name = '0'").executeQuery();
            fail("The test should not include the table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.prepareStatement("select id from queue where name = '10'").executeQuery();
            fail("The test should not include the table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.prepareStatement("select id from queue where priority = '2'").executeQuery();
            fail("The test should not include the table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.prepareStatement("select id from queue where queue_id = 10").executeQuery();
            fail("The test should not include the table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.prepareStatement("select queue_id from queue where queue_id > 0").executeQuery();
            fail("The test should not include the table");
        } catch (SQLException e) {
            e.printStackTrace();
        }