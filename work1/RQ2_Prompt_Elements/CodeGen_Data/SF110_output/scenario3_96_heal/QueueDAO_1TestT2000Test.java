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
     * Unit test for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
     */
    @Test
    public void testSaveEmptyQueuedRecord() {
        queuedRecord = null;
        QueueDAO.saveQueuedRecord(queuedRecord);
        assertNull(queuedRecord.getId());
    }

    /**
     * Unit test for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
     */
    @Test
    public void testSaveQueuedRecord() {
        queuedRecord = new QueuedRecordBean();
        queuedRecord.setQueueDate(new Timestamp(new Date().getTime()));
        queuedRecord.setName("test");
        List<Queue> queues = new ArrayList<>();
        queue = new Queue("queue1");
        queues.add(queue);
        queues.add(queue);
        queues.add(queue);
        Integer count = CommonDAO.updateInDatabase("", "update_queued_records",
            new List[] {
                queuedRecord },
            queues,
            null);

        queuedRecord = null;
        queues = new ArrayList<>();
        queues.clear();
        queues.add(queue);
        queues.add(queue);
        queues.add(queue);
        count = CommonDAO.updateInDatabase("", "delete_queued_records",
            queues,
            null);

        assertEquals(1, count);
    }

    /**
     * Gets the complete metadata associated with the queue
     * @return complete metadata associated with the queue and an empty result set if the queue is not yet saved.
     */
    public CompleteMetadataBean getCompleteMetadata() {
        CompleteMetadataBean qmd = new CompleteMetadataBean();
        try (DataSource source = CommonDAO.openDataSource()) {
            Connection con = null;
            boolean res = false;
            try {
                con = source.getConnection();
                res = (this.getCompleteMetadata(con)!= null);
            } finally {
                CommonDAO.closeConnection(source, con);
            }
            if (res) {
                qmd = this.getCompleteMetadata(con);
            }
            return qmd;
        }
    }

    /**
     * Gets the complete metadata associated with the queue
     * @return complete metadata associated with the queue and an empty result set if the queue is not yet saved.
     *
     * @return the complete metadata associated with the queue, <null> if the queue is not yet saved.
     */
    private CompleteMetadataBean getCompleteMetadata(Connection con) {
        ResultSet rs = null;
        PreparedStatement qfQmd = null;
        try {
            qfQmd = con.prepareStatement("SELECT metadata from metadata WHERE metadata_data =?");
            qfQmd.setString(1, new Timestamp(new Date().getTime()).toString());
            rs = qfQmd.executeQuery();
            if (rs.next()) {
                return this.getCompleteMetadata(rs);
            } else {
                return null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            this.releaseConnection(con, rs, qfQmd);
        }
    }

    /**
     * Gets the complete metadata associated with the queue (no need for database)
     * @return the complete metadata associated with the queue and an empty result set if the queue is not yet saved.
     *
     * @return the complete metadata associated with the queue, <null> if the queue is not yet saved.
     */
    private CompleteMetadataBean getCompleteMetadata() {
        CompleteMetadataBean qmd = new CompleteMetadataBean();
        try (DataSource source = CommonDAO.openDataSource()) {
            Connection con = null;
            boolean res = false;
            try {
                con = source.getConnection();
                res = (this.getCompleteMetadata(con)!= null);
            } finally {
                CommonDAO.closeConnection(source, con);
            }
            if (res) {
                qmd = this.getCompleteMetadata(con);
            }
            return qmd;
        }
    }

    public List<Queue> getQueues() {
        QueueList ql = new QueueList("");
        int qs = this.getNumberOfQueues();
        if (qs > 0) {
            for (int i = 0; i < qs; i++) {
                ql.add(this.getQueue("q" + i));
            }
        }
        return ql;
    }

    /**
     * Gets number of non-queued records
     * @return number of non-queued records
     */
   	public int getNumberOfQueues() {
   	    PreparedStatement stmt = null;
   	    Connection con = null;
   	    ResultSet rs = null;
   	    try {
   	        con = this.getConnection();
   	
   	        stmt = con.prepareStatement("SELECT count(*) FROM queues");
   	        rs = stmt.executeQuery();
   	        if (rs.next()) {
   	            return rs.getInt("count(*)");
   	        } else {
   	            rs = null;
   	        }
   	    } catch (SQLException ex) {
   	        ex.printStackTrace();
   	    } finally {
   	        this.releaseConnection(con, rs, stmt);
   	    }
   	    return 0;
   	}
}

