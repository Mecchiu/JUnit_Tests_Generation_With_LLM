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
		
	private static final int EXPECTED_SIZE = 2;
	
	private static final Timestamp TIMESTAMP = new Timestamp(
			System.currentTimeMillis() / 1000);
	
	private static final int ADMIN_USER_ID = 1;
	private static final int CATALOG_USER_ID = 2;
	
	@Test
	void saveQueuedRecord_1() {
	
		List<QueuedRecordBean> list = new ArrayList<>(1);
		QueuedRecordBean b = new QueuedRecordBean(CompleteMetadataBean.fromXML("test.xml"),  "test-queued-record-id",  new Timestamp(0L),  "test-user",  TIMESTAMP,  null, "test-record-text",  "test-record-comments",    new ArrayList<>(0),  null, null, null);
		
		list.add(b);
		try {
			conn.setAutoCommit(false);
			
			conn.createStatement().execute("DELETE FROM QueuedRecords");
			
			conn.createStatement().execute("insert into QueuedRecords "
					+ "(ApprovalStatus, Comments) "
					+ "values (?,?)",
					new String[]{"approval"});
			
			conn.commit();
			conn.commit();
			
		} catch (SQLException e) {
			
			conn.rollback();
			throw e;
		}

		MetadataDAO md = new MetadataDAO();
		CompleteMetadataBean mdBean = md.getCompleteMetadata("test-queued-record-id", null, true, null);
		
		QueuedRecordBean queued1 = new QueuedRecordBean(mdBean, "test-queued-record-id",  new Timestamp(0L),  "test-user",  TIMESTAMP,  null, "test-record-text",  "test-record-comments",    new ArrayList<>(0),  null, null, null);
		conn.createStatement().executeIgnoreException("INSERT INTO QueuedRecords (QueueRecordId) VALUES ($1)", queued1.getId());
		
		List<QueuedRecordBean> queued2 = new ArrayList<>(2);
		queued2.add(queued1);
		
		conn.createStatement().execute(INSERT_QUEUE_ENTRY, qued2);
		
		Connection conn1 = md.getConnection("test-queued-record-id", null);
		
		conn1.setAutoCommit(true);
		
		conn1.createStatement().execute(UPDATE_QUEUE_ENTRY, queued1.getId());
		
		Connection conn2 = conn1;
		conn2.setAutoCommit(true);
		conn2.setVisible(false);
		
		conn2.commit();
		
		conn2.commit();
		
		conn1.commit();
		conn1.commit();
		
		assertNotNull(conn1);
		assertNotNull(list);
		assertTrue(list.size()!= EXPECTED_SIZE);
		assertEquals(1, list.size());
		QueuedRecordBean queued2rec = list.get(0);
		assertEquals(queued1.getApprovalStatus(), queued2rec.getApprovalStatus());
		assertEquals(queued1.getComments(),	queued2rec.getComments());
		assertEquals(TIMESTAMP, queued2rec.getLastModification());
		
		conn2.commit();
		conn2.commit();
		
		conn1.commit();
		conn1.commit();
		
		conn2.setAutoCommit(true);
		conn1.setAutoCommit(true);
		
		conn2.createStatement().executeIgnoreException("DELETE FROM QueuedRecords");
		
}
}