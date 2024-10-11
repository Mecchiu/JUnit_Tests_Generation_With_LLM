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