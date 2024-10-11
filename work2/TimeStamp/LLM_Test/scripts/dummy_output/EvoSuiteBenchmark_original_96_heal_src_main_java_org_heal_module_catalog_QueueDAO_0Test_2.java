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

}
}