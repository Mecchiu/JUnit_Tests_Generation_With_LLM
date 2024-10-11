// QueueDAO_1Test.java
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
* It contains one unit test case for the {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
*/
class QueueDAO_1Test {
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

    public boolean saveQueuedRecord(final QueuedRecordBean queuedRecord) {
        boolean result = false;
        if (null == queuedRecord) {
            throw new IllegalArgumentException("queuedRecord argument must be non-null");
        }
        if (null == queuedRecord.getType()) {
            throw new IllegalArgumentException("Cannot save a QueuedRecordBean without a type");
        }
        if (null == queuedRecord.getShortMetadata() || null == queuedRecord.getShortMetadata().getMetadataId()) {
            throw new IllegalArgumentException("Cannot save a queued record without a metadataId");
        }
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            saveQueuedRecord(queuedRecord, conn);
            result = true;
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

// QueueDAO_1Test.java
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
* It contains one unit test case for the {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
*/
class QueueDAO_1Test {
		
	/**
	* Constructor.
	*/
	public QueueDAO_1Test() {
	}

	/**
	* Simple testing to ensure a QueuedRecordBean can be saved using the {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
	*/
	@Test
	void QueueDAO_1Test_Simple_1() {
		String cid = "cid1";
		String status = "status1";
		boolean deleted = true;
		CompleteMetadataBean metadata = new CompleteMetadataBean();
    	metadata.setCid(cid);
    	metadata.setMetadataId("100");
    	metadata.setDeleted(deleted);
    	metadata.setStatus(status);
		metadata.setDt1(new Date());
    	metadata.setDt2(null);
    	metadata.setCreatedt(null);
    	metadata.setDt3(null);
    	metadata.setDt4(null);

		QueueRecordBean bean = new QueueRecordBean();
		bean.getMetadata().addMetadata(metadata);
	    
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            conn.setAutoCommit(false);

            // The test for successful operation
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Queue (cid, shortMetadata) VALUES (?,?)");
            pstmt.setString(1, cid);
            pstmt.setObject(2, bean);
            pstmt.executeUpdate();


            // The test for an unsuccessful operation
            pstmt = conn.prepareStatement("INSERT INTO Queue (cid, shortMetadata, deleted) VALUES (?,?,?)");
            pstmt.setString(1, cid);
            pstmt.setObject(2, bean);
            pstmt.setObject(3, new Object());
            pstmt.executeUpdate();
			
            conn.commit();
            
        } catch (SQLException se) {
            se.printStackTrace();
			fail();	
        } finally {
            CommonDAO.returnConnection(conn);
        }

        assertTrue("Error while running the test: saveQueuedRecord", result);

        // Verify data
        ResultSet rs = conn.getMetaData().getColumnPrivileges(cid, "cid", null);
        boolean found = false;
        while (rs.next()) {
            String columnPrivilege = rs.getString(1);
            String privilege = rs.getString(2).toUpperCase();
            found = found || columnPrivilege.equals("CODE");
        }
        assertTrue("Error while running the test: getColumnPrivileges", found);
        assertTrue("Error while running the test: getColumnPrivileges", result);

        // Now remove the user
        conn = null;
		deleteUser(cid);

        conn = dataSource.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Queue WHERE cid=?");
            ps.setString(1, cid);
            result = ps.executeUpdate();
            assertTrue("Error while running the test: before deletion of the user", result);

        } catch (SQLException se) {
            se.printStackTrace();
            fail();
        } finally {
            try {
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        conn = dataSource.getConnection();
        deleteUser(cid);
        rs = conn.getMetaData().getColumnPrivileges(cid, "cid", null);
        boolean found5 = false;
        boolean found6 = false;
		while (rs.next()) {
            String columnPrivilege = rs.getString(1).toUpperCase();
            found5 = found5 || columnPrivilege.equals("T");
            found6 = found6|| columnPrivilege.equals("F");
        }
		assertFalse("Error while running the test: getColumnPrivileges", found5);
		assertTrue("Error while running the test: getColumnPrivileges", found6);
	}

    /* 
     * Remove the user from the database.
     * The user is also deleted from the database, and is now hidden from the 
     * database from further operations.
     */
	private void deleteUser(final String cid) {
		Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM AuthenticationUsers WHERE cid=?");
            ps.setString(1, cid);
            int result = ps.executeUpdate();
            assertTrue("Error while running the test: before deletion of the user", result);
            
            // This will only happen if there was a problem with the user already there
            // or if the user wasn't in there
            PreparedStatement ps2 = conn.prepareStatement("DELETE FROM AuthenticationUsers WHERE cid=?");
            ps2.setString(1, cid);
            result = ps2.executeUpdate();
			assertTrue("Error while running the test: after deletion of the user", result);
			
        } catch (SQLException se) {
            se.printStackTrace();
			fail();
        } finally