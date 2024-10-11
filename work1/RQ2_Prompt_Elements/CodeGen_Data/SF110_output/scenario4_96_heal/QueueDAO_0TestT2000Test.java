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

    public QueueDAO() {
    }

    public static final String TYPE_APPROVAL = new String("approval");

    public static final String TYPE_CATALOG = new String("catalog");

    private DataSource dataSource;

    private CommonDAO cd = new CommonDAO();

    private MetadataDAO md = new MetadataDAO();

    private static final String SELECT_QUEUE_BY_TYPE = "SELECT QueuedRecordId," + " MetadataId, Status, Comments FROM QueuedRecords WHERE Type LIKE?";

    private static final String INSERT_QUEUE_ENTRY = "INSERT INTO QueuedRecords" + " (Type, MetadataId, Status, Comments) VALUES (?,?,?,?)";

    private static final String UPDATE_QUEUE_ENTRY = "UPDATE QueuedRecords" + " SET Type =?, MetadataId =?, Status =?, Comments =? WHERE" + " QueuedRecordId =?";

    private static final String DELETE_QUEUE_ENTRY = "DELETE FROM QueuedRecords" + " WHERE QueuedRecordId =?";

    public void setDataSource(final DataSource dataSource);

    /**
     * @param type The type of QueuedRecordBeans to get.
     *
     * @return A List of QueuedRecordBeans.
     */
    public List<QueuedRecordBean> getQueueByType(final String type);

    /**
     * @return The List of QueuedRecordBeans representing the catalog queue.
     */
    public List<QueuedRecordBean> getCatalogQueue();

    /**
     * @return The List of QueuedRecordBeans representing the approval queue.
     */
    public List<QueuedRecordBean> getApprovalQueue();

    public List<QueuedRecordBean> getQueue(final String type, final Connection conn) throws SQLException;

    /**
     * Saves a {@link QueuedRecordBean} to the database.
     *
     * @param queuedRecord A non-null QueuedRecordBean to save.
     *
     * @return <code>true</code> if the save is successful, false otherwise.
     */
    public boolean saveQueuedRecord(final QueuedRecordBean queuedRecord);

    public void saveQueuedRecord(final QueuedRecordBean queuedRecord, final Connection conn) throws SQLException;

    public boolean enqueue(final String type, final String metadataId);

    public boolean dequeue(final String queuedRecordId);

    public void dequeue(final String queuedRecordId, final Connection conn) throws SQLException;

    public boolean markRecordApproved(final String metadataId);

    public boolean markRecordCataloged(final String metadataId);

    public boolean rejectRecord(final String metadataId);
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
		
    @Test
    public final void testGetQueueByType()
            throws Exception {
        final QueueDAO queueDAO = new QueueDAO_0();
        final QueuedRecordBean queuedRecord = queueDAO.getQueueByType("");
        
        assertEquals(1, queuedRecord.getId().longValue());
        assertNotNull(queuedRecord.getType());
        assertEquals(queueDAO.getType(), queuedRecord.getType());
    }
    
    /**
     * @throws Exception
     */
	@Test
	public final void testInsertQueue() throws Exception {
        final QueueDAO queueDAO = new QueueDAO_0();

        final Connection conn = queueDAO.getConnection();

        boolean result = true;

        try (
            final PreparedStatement insertQueue = conn.prepareStatement(insertQueue),
            final PreparedStatement insertApproval = conn.prepareStatement(insertApproval),
            final PreparedStatement insertCatalog = conn.prepareStatement(insertCatalog),
            final PreparedStatement insertApprovalRec = conn.prepareStatement(insertApprovalRec),
            ) {
            
            // test insert
            final List<String> testData = new ArrayList<>();
            final List<String> testCategory = new ArrayList<>();
            final List<String> testMetadataIds = new ArrayList<>();
            testData.add("test1");
            testCategory.add("test_category");
            testMetadataIds.add("test_meta_id");
            testData.add("test_other_data");
            testCategory.add("test1Cat1");
            testCategory.add("test2Cat1");
            testMetadataIds.add("test_meta_id1");

            insertQueue.setString(1, testData.get(0));
            insertQueue.setString(2, testMetadataIds.get(0));

            insertQueue.setString(3, testCategory.get(0));
            insertQueue.setString(4, testCategory.get(1));

            insertQueue.setString(5, testCategory.get(2));
            insertQueue.setString(6, testMetadataIds.get(1));
            insertApproval.setString(1, testCategory.get(3));
            insertApproval.setString(2, testCategory.get(4));

            insertApproval.setString(3, testCategory.get(3));
            insertApproval.setString(4, testCategory.get(4));

            insertApproval.setString(5, testMetadataIds.get(2));
            insertCatalog.setString(1, testCategory.get(1));
            insertCatalog.setString(2, testCategory.get(2));

            insertCatalog.setString(3, testMetadataIds.get(3));
            insertCatalog.setString(4, testMetadataIds.get(4));

            insertCatalog.setString(5, testMetadataIds.get(5));
            insertCatalog.setTimestamp(1, new Timestamp(0));
            insertCatalog.setTimestamp(2, new Timestamp(0));

            insertCatalog.executeUpdate();

            insertQueue.executeUpdate();

            insertApproval.executeUpdate();
            insertApprovalRec.executeUpdate();

            try (
                final ResultSet rs = insertQueue.executeQuery())
            {
                assertTrue(rs.next());
                System.err.println("testQueue: " + testData);
            }
            
            final int[] checkData = {1, 0, 2, 0, 3, 0, 4, 1, 1, 1, 2, 1, 2};
            assertEquals(checkData[0], queueDAO.getQueueByType("").getId().longValue());
            assertTrue(queueDAO.getQueueByType("").getComments().equals("qtest"));
            assertEquals(