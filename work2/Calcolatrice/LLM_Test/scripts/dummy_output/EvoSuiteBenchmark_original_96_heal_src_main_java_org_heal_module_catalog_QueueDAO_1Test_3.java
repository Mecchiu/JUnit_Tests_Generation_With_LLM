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
		public static final String NAME = "QueueDAO_1Test";
		
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	

	private QueueDAO cd = new QueueDAO();

	private static final String SELECT_QUEUE_BY_TYPE = "SELECT QueuedRecordId," + " MetadataId, Status, Comments FROM QueuedRecords WHERE Type LIKE?";

	private static final String INSERT_QUEUE_ENTRY = "INSERT INTO QueuedRecords" + " (Type, MetadataId, Status, Comments) VALUES (?,?,?,?)";

	private static final String UPDATE_QUEUE_ENTRY = "UPDATE QueuedRecords" + " SET Type =?, MetadataId =?, Status =?, Comments =? WHERE" + " QueuedRecordId =?";

	private static final String DELETE_QUEUE_ENTRY = "DELETE FROM QueuedRecords" + " WHERE QueuedRecordId =?";

	private static final String DELETE_QUEUE_ENTRY_CATALOG = "DELETE FROM QueuedRecords" + " WHERE QueuedRecordId =?";

	private static final String MATCH_QUEUE_ENTRY = "(?=ID__IS).*" + "ID\\((\\d+), (\\d+)\\)";

	private static final String UPDATE_QUEUE_ENTRY_FORCE_UPDATE = "UPDATE QueuedRecords" + " SET Status =?, Comments =? WHERE QueuedRecordId =?";

	private static final String UPDATE_QUEUE_ENTRY_FORCE_UPDATE_CATALOG = "UPDATE QueuedRecords" + " SET Status =?, Comments =? WHERE QueuedRecordId =?";

	private static final String UPDATE_QUEUE_ENTRY_FORCE_DELETE = "DELETE FROM QueuedRecords" + " WHERE QueuedRecordId =?" + " and (Status =?)";

	private static final String UPDATE_QUEUE_ENTRY_FORCE_DELETE_CATALOG = "DELETE FROM QueuedRecords" + " WHERE QueuedRecordId =?";

	private static final String DELETE_QUEUE_ENTRY_FORCE_DELETE = "DELETE FROM QueuedRecords" + " WHERE QueuedRecordId =?" + " and (Status!=?)";

	private static final String DELETE_QUEUE_ENTRY_CATALOG_FORCE_DELETE = "DELETE FROM QueuedRecords" + " WHERE QueuedRecordId =?" + " and Status =?";


	@Test
	void testDelete(DataSource d1);

	@Test
	void testInsert(DataSource d1);

	@Test
	void testUpdate(DataSource d1);

	@Test
	void testGetByQueueType(DataSource d1, String type);

	@Test
	void testSaveQueuedRecord(DataSource d1, String type, String metadata);

	@Test
	void testGetAllByQueueType(DataSource d1, String type);

	@Test
	void testDeleteByQueueType(DataSource d1, String type, Connection conn);

	@Test
	void testUpdateByQueueType(DataSource d1, String type, Connection conn, String t, String tl, String tc);

	@Test
	void testUpdateByIdByQueueType(DataSource d1, String type, Connection conn, String t, String tl, String tc);

	@Test
	void testMerge(DataSource d1, String queue1, String queue2);

	@Test
	void testGetById(DataSource d1);

	public static void main(String... args) throws Exception {

		// TODO Auto-generated method stub

	}

	@Test
	void testInsert(DataSource d1);

	@Test
	void testUpdate(DataSource d1);

}