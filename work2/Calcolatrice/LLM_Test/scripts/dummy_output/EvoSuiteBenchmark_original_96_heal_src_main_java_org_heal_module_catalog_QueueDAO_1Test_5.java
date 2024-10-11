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
		 * Tests the {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method with a metadata id field.
		 */
	@Test
		public void testSaveQueuedRecord_WithMetadataId() {
		MetadataDAO md = new MetadataDAO();
		CompleteMetadataBean completeBean = new CompleteMetadataBean();
		completeBean.setStatus("New".getBytes());

		String[] columns = {"MetadataId"};
		String[] values = {"id"};
		Connection conn = md.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(INSERT_QUEUE_ENTRY, columns);
		pstmt.setString(1, completeBean.getStatus());
		pstmt.setString(2, completeBean.getMetadataId()[0].toString());
		pstmt.executeUpdate();
		pstmt.close();
		
		boolean saved = md.getConnection()!=null;
		assertTrue("Connection should be valid here, but was:"+saved, saved);
		
		conn = md.getConnection();
		pstmt = conn.prepareStatement(UPDATE_QUEUE_ENTRY, columns);
		pstmt.setString(1, completeBean.getStatus());
		pstmt.setString(2, completeBean.getMetadataId()[0].toString());
		pstmt.setInt(columns.length+1, 1);
		pstmt.executeUpdate();
		pstmt.close();
		
		Connection connRetry = md.getConnection();
		saved = connRetry.isClosed();
		assertTrue("Connection should be invalid here, but was:"+saved, saved);

		pstmt = conn.prepareStatement(DELETE_QUEUE_ENTRY, columns);
		pstmt.setString(1, completeBean.getStatus());
		pstmt.setString(2, completeBean.getMetadataId()[0].toString());
		pstmt.close();
		
		boolean recvd = md.getConnection()==null;
		assertTrue("Connection is valid, but not for the same metadata-id", recvd);
		connRetry = md.getConnection();
		saved = connRetry.isClosed();
		assertTrue("Connection should be invalid here, but was:"+saved, saved);
	}

	@Test
	public void testSaveQueuedRecord() throws SQLException {
		String[] columns = {"MetadataId", "Type", "Comments"};
		CompleteMetadataBean metadata = new CompleteMetadataBean();
		metadata.setStatus("approved".getBytes());

		MetadataDAO md = new MetadataDAO();
		//System.out.println("Testing insert into metadata with metadata id: "
			//+metadata.getMetadataId().toString());
			
			Connection conn = md.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(INSERT_QUEUE_ENTRY, columns);
			pstmt.setString(1, metadata.getMetadataId()[0].toString());
			pstmt.setString(2, metadata.getType().toString());
			pstmt.executeUpdate();
			pstmt.close();
		
			Connection connRetry = md.getConnection();
			saved = connRetry.isClosed();
			//System.out.println("Testing update of metadata with metadata id: "
				//+metadata.getMetadataId()[0].toString());
			//connRetry.close();
			assertTrue("Connection should be valid here, but was:"+saved, saved);

			connRetry = md.getConnection();
			pstmt = connRetry.prepareStatement(UPDATE_QUEUE_ENTRY, columns);
			pstmt.setString(1, metadata.getStatus());
}
}