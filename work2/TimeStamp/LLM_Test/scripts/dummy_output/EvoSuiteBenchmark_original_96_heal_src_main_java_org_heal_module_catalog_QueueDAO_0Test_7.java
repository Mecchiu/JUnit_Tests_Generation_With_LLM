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
    public void testGetQueueByType(){
        QueueDAO queueDAO = new QueueDAO();
        List<String> types = new ArrayList<>();
        types.add("APPROVAL");
        types.add("CATALOG");
        QueueBeanQueueBean queueBean = null;
        QueueBeanManager queueManager = null;
        String queue = null;
        Connection conn = null;
        try{
            conn = (Connection)dataSource.getConnection();
            preparedStatement = conn.prepareStatement(SELECT_QUEUE_BY_TYPE);

            for(String type:types){
                preparedStatement.setString(1, type);
                ResultSet resultSet = preparedStatement.executeQuery();
                queue = null;
                while(resultSet.next()){
                    queue = resultSet.getString("QueueId");
                }
            }
        }
        catch (SQLException ex) {
            fail("Could not get QueuedRecordBean from queueDAO");
        }
            
        conn.close();
        queueManager.close();
        queueDAO.close();
        
        if(queue == null) {
            return;
        }

        queueManager = new QueueBeanManager(conn, queue);
        queueBean = queueManager.getQueueBean(queue);
        Connection conn2 = null;
        try{
            preparedStatement = conn.prepareStatement(INSERT_QUEUE_ENTRY);
            preparedStatement.setString(1, queue);
            preparedStatement.executeUpdate();
            
            preparedStatement = conn.prepareStatement(UPDATE_QUEUE_ENTRY);
            preparedStatement.setString(1, queue);
            preparedStatement.setString(2, COMPLETE_METADATA_ID);
            preparedStatement.executeUpdate();
            conn2 = conn;
        }
        finally {
            if(conn2!= null) {
                conn2.close();
            }
        }
        MetadataDAO mdDAO = new MetadataDAO();
        completeMetadataBean = mdDAO.getCompleteMetadata(queue);
        CompleteMetadataBean completeMetadata = completeMetadataBean.getCopy();
        CompleteMetadataBean complete = completeMetadataBean.copy(completeMetadataBean.getType(), completeMetadataBean.getComments());
        assertEquals("getCompleteMetadata() method must return the complete metadata if this method executed with the same parameters", completeMetadataBean, completeMetadata);
    }
    
    @Test
    public void testApproveRecord(){
        QueueDAO queueManager = new QueueDAO();
        QueueBeanManager queueManager2 = new QueueBeanManager(queueManager.getConnection(), queueManager.getQueueByType("CATALOG"));
        QueueBeanManager queueManager3 = new QueueBeanManager(queueManager.getConnection(), queueManager.getQueueByType("APPROVAL"));
        Connection conn = null;
        try{
            Connection conn2 = null;
            preparedStatement = conn.prepareStatement(INSERT_QUEUE_ENTRY);
            preparedStatement.setString(1, "AQ");
            preparedStatement.executeUpdate();
            conn2 = conn;
        }
        catch (SQLException ex) {
            fail("Problem executing INSERT_QUEUE_ENTRY: %s", ex.getMessage());
        }
        assertNotNull("Error", conn);
        assertNotNull("Error", conn2);
            
        preparedStatement = conn.prepareStatement(UPDATE_QUEUE_ENTRY);
            preparedStatement.setString(1, "AAQ");
            preparedStatement.setString(2, "Approve_");
            preparedStatement.setTimestamp(3, new Timestamp(new Date().getTime() - 12 * 60 * 1000l));
            preparedStatement.executeUpdate();
}
}