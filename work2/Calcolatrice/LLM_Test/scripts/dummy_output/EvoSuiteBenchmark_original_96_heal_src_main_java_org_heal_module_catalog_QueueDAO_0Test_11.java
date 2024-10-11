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
		/**
         * Tests {@link QueueDAO#getQueueByType(String)} method.
         */
        @Test
        void getQueueByType() {
            // Set up an instance of QueueDAO.
            QueueDAO queueDAO = new QueueDAO();

            // Test if the QueueDAO was created with a null DataSource parameter.
            assertNull(queueDAO.getQueueByType(""));

            // Get non-null data source with all of the fields set
            queueDAO = new QueueDAO();
            queueDAO.setDataSource(null);
            final String queue1 = queueDAO.getQueueByType(QueueType.QUEUE.toString());
            final String queue2 = queueDAO.getQueueByType(QueueType.QUEUE.toString());
            queueDAO.deleteQueueByType(QueueType.QUEUE.toString());

            assertNull("QueueDAO.getQueueByType should have thrown an exception.", queueDAO.getQueueByType(QueueType.QUEUE.toString()));
            assertEquals(queue1, queue2);
        }

        /**
         * Tests {@link QueueDAO#insertQueueEntry(String, String, Integer)} and all of its public methods.
         */
        @Test
        void insertQueueEntry() {
            // Set up an instance of QueueDAO.
            QueueDAO queueDAO = new QueueDAO();

            // Test if the QueueDAO was created with a null DataSource parameter.
            assertNull(queueDAO.insertQueueEntry("", null, null));
            assertNull(queueDAO.insertQueueEntry("", null, null));
            assertNull(queueDAO.insertQueueEntry("", "", 0));

            // Get non-null data source with all of the fields set
            queueDAO = new QueueDAO();
            queueDAO.setDataSource(null);
            final String queue1 = queueDAO.insertQueueEntry("", QueueType.QUEUE.toString(), null);
            final String queue2 = queueDAO.insertQueueEntry("", QueueType.QUEUE.toString(), null);
            queueDAO.deleteQueueByType(QueueType.QUEUE.toString());

            assertNotNull("QueueDAO.insertQueueEntry should have thrown an exception.", queueDAO.insertQueueEntry(queue1, QueueType.QUEUE.toString(), 2));
            assertNull(queueDAO.insertQueueEntry(queue1, QueueType.QUEUE.toString(), 2));
            queueDAO.deleteQueueByType(QueueType.QUEUE.toString());

            assertNull(queueDAO.insertQueueEntry(queue1, QueueType.QUEUE.toString(), null));
            assertNotNull(queueDAO.insertQueueEntry(queue1, QueueType.QUEUE.toString(), null));

            // Test if the QueueDAO was created with a null DataSource parameter.
            queueDAO = new QueueDAO();
            queueDAO.setDataSource(null);

            assertNull(queueDAO.insertQueueEntry("", null, 4));
            assertNull(queueDAO.insertQueueEntry("", null, 4));
            assertNull(queueDAO.insertQueueEntry("", QueueType.QUEUE.toString(), 6));

            assertNotNull("QueueDAO.insertQueueEntry should have thrown an exception.", queueDAO.insertQueueEntry(queue1, null, 1));
            assertNotNull("QueueDAO.insertQueueEntry should not have thrown an exception.", queueDAO.insertQueueEntry(queue1, null, 4));
            queueDAO.deleteQueueByType(QueueType.QUEUE.toString());

            assertNull(queueDAO.insertQueueEntry(queue1, QueueType.QUEUE.toString(), 4));
            assertNotNull(queueDAO.insertQueueEntry(queue1, QueueType.QUEUE.toString(), 6));
}
}