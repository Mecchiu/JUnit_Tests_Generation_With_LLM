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
		
    @Test
    public void testSaveQueuedRecord1() throws Exception {
        QueueDAO dao = new QueueDAO();

        Connection conn = null;

        try {
            conn = dao.getOrConnect();

            final CompleteMetadataBean record = new CompleteMetadataBean(null, new Date());

            MetadataDAO.update(conn, record);

            assertTrue(dao.saveQueuedRecord(dao.createQueuedRecord(new Timestamp(System.currentTimeMillis()), "", TYPE_APPROVAL)));
        } finally {
            if (conn!= null) {
                dao.close(conn);
            }
        }
    }

    @Test
    public void testSaveQueuedRecord2() throws Exception {
        QueueDAO dao = new QueueDAO();

        Connection conn = null;

        try {
        	conn = dao.getOrConnect();

            final CompleteMetadataBean record = new CompleteMetadataBean(null, new Date());

            final CompleteMetadataBean approvedRecord = new CompleteMetadataBean(null, new Date());

            MetadataDAO.update(conn, record);

            MetadataDAO.update(conn, approvedRecord);

            assertTrue(dao.saveQueuedRecord(dao.createQueuedRecord(new Timestamp(System.currentTimeMillis()), "", TYPE_CATALOG)));

        } finally {
            if (conn!= null) {
                dao.close(conn);
            }
        }
    }

    @Test
    public void testDeleteQueuedRecord1() throws Exception {
        QueueDAO dao = new QueueDAO();

        Connection conn = null;

        try {
            conn = dao.getOrConnect();

            dao.deleteQueuedRecord(conn, new Object[]{dao.createQueuedRecord(new Timestamp(System.currentTimeMillis()), "record", TYPE_APPROVAL)} );

            assertTrue(dao.deleteQueuedRecord(conn, new Object[]{""}));

        } finally {
            if (conn!= null) {
                dao.close(conn);
            }
        }
    }

    @Test(expected = SQLException.class)
    public void testDeleteQueuedRecord2() throws Exception {
        QueueDAO dao = new QueueDAO();

        Connection conn = null;

        try {
            conn = dao.getOrConnect();

            dao.deleteQueuedRecord(conn, new Object[]{"delete", "test"});
        } finally {
            if (conn!= null) {
                dao.close(conn);
            }
        }
    }

}