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

    private static final String SELECT_QUEUE_BY_TYPE = "SELECT QueuedRecordId," + " MetadataId, Status, Comments FROM QueuedRecords WHERE Type LIKE ?";

    private static final String INSERT_QUEUE_ENTRY = "INSERT INTO QueuedRecords" + " (Type, MetadataId, Status, Comments) VALUES (?, ?, ?, ?)";

    private static final String UPDATE_QUEUE_ENTRY = "UPDATE QueuedRecords" + " SET Type = ?, MetadataId = ?, Status = ?, Comments = ? WHERE" + " QueuedRecordId = ?";

    private static final String DELETE_QUEUE_ENTRY = "DELETE FROM QueuedRecords" + " WHERE QueuedRecordId = ?";

    public void setDataSource(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * @param type The type of QueuedRecordBeans to get.
     *
     * @return A List of QueuedRecordBeans.
     */
    public List<QueuedRecordBean> getQueueByType(final String type) {
        List<QueuedRecordBean> queue = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_QUEUE_BY_TYPE)) {
            ps.setString(1, type);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                QueuedRecordBean queuedRecord = new QueuedRecordBean();
                queuedRecord.setQueuedRecordId(rs.getInt("QueuedRecordId"));
                queuedRecord.setMetadata(md.getCompleteMetadata(rs.getString("MetadataId")));
                queuedRecord.setStatus(rs.getString("Status"));
                queuedRecord.setComments(rs.getString("Comments"));
                queue.add(queuedRecord);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return queue;
    }

    /**
     * @return The List of QueuedRecordBeans representing the catalog queue.
     */
    public List<QueuedRecordBean> getCatalogQueue() {
        return getQueueByType(TYPE_CATALOG);
    }

    /**
     * @return The List of QueuedRecordBeans representing the approval queue.
     */
    public List<QueuedRecordBean> getApprovalQueue() {
        return getQueueByType(TYPE_APPROVAL);
    }

    public List<QueuedRecordBean> getQueue(final String type, final Connection conn) throws SQLException {
        List<QueuedRecordBean> queue = new ArrayList<>();
        try (PreparedStatement ps = conn.prepareStatement(SELECT_QUEUE_BY_TYPE)) {
            ps.setString(1, type);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                QueuedRecordBean queuedRecord = new QueuedRecordBean();
                queuedRecord.setQueuedRecordId(rs.getInt("QueuedRecordId"));
                queuedRecord.setMetadata(md.getCompleteMetadata(rs.getString("MetadataId")));
                queuedRecord.setStatus(rs.getString("Status"));
                queuedRecord.setComments(rs.getString("Comments"));
                queue.add(queuedRecord);
            }
        }
        return queue;
    }

    /**
     * Saves a {@link QueuedRecordBean} to the database.
     *
     * @param queuedRecord A non-null QueuedRecordBean to save.
     *
     * @return <code>true</code> if the save is successful, false otherwise.
     */
    public boolean saveQueuedRecord(final QueuedRecordBean queuedRecord) {
        boolean success = false;
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_QUEUE_ENTRY)) {
            ps.setString(1, queuedRecord.getType());
            ps.setString(2, queuedRecord.getMetadata().getMetadataId());
            ps.setString(3, queuedRecord.getStatus());
            ps.setString(4, queuedRecord.getComments());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                success = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    public void saveQueuedRecord(final QueuedRecordBean queuedRecord, final Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(INSERT_QUEUE_ENTRY)) {
            ps.setString(1, queuedRecord.getType());
            ps.setString(2, queuedRecord.getMetadata().getMetadataId());
            ps.setString(3, queuedRecord.getStatus());
            ps.setString(4, queuedRecord.getComments());
            ps.executeUpdate();
        }
    }

    public boolean enqueue(final String type, final String metadataId) {
        boolean success = false;
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            CompleteMetadataBean metadata = md.getCompleteMetadata(metadataId);
            if (metadata != null) {
                QueuedRecordBean queuedRecord = new QueuedRecordBean();
                queuedRecord.setType(type);
                queuedRecord.setMetadata(metadata);
                queuedRecord.setStatus(QueuedRecordBean.STATUS_PENDING);
                success = saveQueuedRecord(queuedRecord);
            }
            if (success) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    public boolean dequeue(final String queuedRecordId) {
        boolean success = false;
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            dequeue(queuedRecordId, conn);
            conn.commit();
            success = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    public void dequeue(final String queuedRecordId, final Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(DELETE_QUEUE_ENTRY)) {
            ps.setInt(1, Integer.parseInt(queuedRecordId));
            ps.executeUpdate();
        }
    }

    public boolean markRecordApproved(final String metadataId) {
        boolean success = false;
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            List<QueuedRecordBean> queue = getQueueByType(TYPE_APPROVAL);
            for (QueuedRecordBean queuedRecord : queue) {
                if (queuedRecord.getMetadata().getMetadataId().equals(metadataId)) {
                    queuedRecord.setStatus(QueuedRecordBean.STATUS_APPROVED);
                    saveQueuedRecord(queuedRecord, conn);
                    success = true;
                    break;
                }
            }
            if (success) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    public boolean markRecordCataloged(final String metadataId) {
        boolean success = false;
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            List<QueuedRecordBean> queue = getQueueByType(TYPE_CATALOG);
            for (QueuedRecordBean queuedRecord : queue) {
                if (queuedRecord.getMetadata().getMetadataId().equals(metadataId)) {
                    queuedRecord.setStatus(QueuedRecordBean.STATUS_CATALOGED);
                    saveQueuedRecord(queuedRecord, conn);
                    success = true;
                    break;
                }
            }
            if (success) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    public boolean rejectRecord(final String metadataId) {
        boolean success = false;
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            List<QueuedRecordBean> queue = getQueueByType(TYPE_APPROVAL);
            for (QueuedRecordBean queuedRecord : queue) {
                if (queuedRecord.getMetadata().getMetadataId().equals(metadataId)) {
                    queuedRecord.setStatus(QueuedRecordBean.STATUS_REJECTED);
                    saveQueuedRecord(queuedRecord, conn);
                    success = true;
                    break;
                }
            }
            if (success) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }
}

// QueueDAO_0Test.java
package org.heal.module.catalog;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

/**
* Test class of {@link QueueDAO}.
* It contains ten unit test cases for the {@link QueueDAO#getQueueByType(String)} method.
*/
class QueueDAO_0Test {
    
    @Test
    void testGetCatalogQueue() {
        QueueDAO dao = new QueueDAO();
        List<QueuedRecordBean> queue = dao.getCatalogQueue();
        assertNotNull(queue);
        assertEquals(0, queue.size());
    }
    
    @Test
    void testGetApprovalQueue() {
        QueueDAO dao = new QueueDAO();
        List<QueuedRecordBean> queue = dao.getApprovalQueue();
        assertNotNull(queue);
        assertEquals(0, queue.size());
    }
    
    @Test
    void testGetQueueByTypeWithNullType() {
        QueueDAO dao = new QueueDAO();
