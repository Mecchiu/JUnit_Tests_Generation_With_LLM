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

    /**
     * @param type The type of QueuedRecordBeans to get.
     * @return A List of QueuedRecordBeans.
     */
    public List<QueuedRecordBean> getQueueByType(final String type) {
        List<QueuedRecordBean> result = null;
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            result = getQueue(type, conn);
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
     * Test method for {@link QueueDAO#getQueueBy(String,String)}.
     */
    @Test
    void testGetQueueBy() {
		
        DataSource dataSource = CommonDAO.getInstance(dataSourceJdbcUrl);
        QueueDAO queueDAO = new QueueDAO(dataSource);
        MetadataDAO metadataDAO = new MetadataDAO(dataSource);
        CompleteMetadataBean completeMetadataBean = metadataDAO
       .getCompleteMetadata(new Date());
        List<String> queues = queueDAO.getQueueBy(completeMetadataBean
       .getType(), completeMetadataBean.getRecord());
        //System.out.println(queues.size());
        assertEquals(1, queues.size());
        assertNotNull("No record found for type " + completeMetadataBean.getType(), queues
       .get(0));
    }

}
