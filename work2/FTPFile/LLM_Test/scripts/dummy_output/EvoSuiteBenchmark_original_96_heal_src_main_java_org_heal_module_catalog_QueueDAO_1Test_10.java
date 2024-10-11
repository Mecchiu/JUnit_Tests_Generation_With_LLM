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
    void test_Save_1() throws SQLException, Exception{
        
        //Setup

        Connection conn = dataSource.getConnection();
        PreparedStatement insertQueuedRecordStatement = conn.prepareStatement(INSERT_QUEUE_ENTRY);

        insertQueuedRecordStatement.executeUpdate();

        DataSource metadataDataSource = CommonDAO.getMDS_JDBCDataSource();
        CompleteMetadataBean metadata = (CompleteMetadataBean) metadataDataSource.getConnection().getMetaData().getMetadata(CompleteMetadataBean.TYPE);        
        String metadataId = "1";
        metadata.setMetadataId(metadataId);

        CompleteMetadataBean newCompleteMetadata = (CompleteMetadataBean) metadata.clone();

        newCompleteMetadata.setQueueType("admin");
        newCompleteMetadata.setStartDate(new Date("2014-04-27"));
        newCompleteMetadata.setEndDate(new Date("2014-04-27"));

        metadataDataSource.addConnection(newCompleteMetadata);

    //Test

        assertTrue(newCompleteMetadata.getQueueType().compareToIgnoreCase("admin") == 0);

    }
    
    @Test
    void test_Save_2() throws Exception{

        //Setup

        Connection conn = dataSource.getConnection();

        PreparedStatement insertQueuedRecordStatement = conn.prepareStatement(INSERT_QUEUE_ENTRY);

        insertQueuedRecordStatement.executeUpdate();
        insertQueuedRecordStatement.close();

        final PreparedStatement insertQueuedRecordSetByTypeStatement = conn.prepareStatement(SELECT_QUEUE_BY_TYPE);

        PreparedStatement insertQueuedRecordSetByTypeStatement2 = conn.prepareStatement(INSERT_QUEUE_ENTRY);

        //Create table
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("CREATE TABLE QueuedRecords ( MetadataId  VARCHAR NOT NULL, Status     VARCHAR NOT NULL, Comments     VARCHAR NOT NULL, PRIMARY KEY  (MetadataId, Status))");
        stmt.close();

        //Insert and save QueuedRecordBean
        PreparedStatement insertQueuedRecordSetByTypeStatementStatement = conn.prepareStatement(INSERT_QUEUE_ENTRY);
       
        Date start = new Timestamp(System.currentTimeMillis());
        insertQueuedRecordSetByTypeStatementStatement.setTimestamp(1, start);
        insertQueuedRecordSetByTypeStatementStatement.executeUpdate();
        insertQueuedRecordSetByTypeStatementStatement.close();

        //Insert and save QueuedRecordBean
        PreparedStatement insertQueuedRecordSetByTypeStatementGetListByStatus = conn.prepareStatement(INSERT_QUEUE_ENTRY);
        PreparedStatement insertQueuedRecordSetByTypeStatementGetLastById = conn.prepareStatement(SELECT_QUEUE_BY_TYPE);

        Date end = new Timestamp(System.currentTimeMillis());
        insertQueuedRecordSetByTypeStatementGetListByStatus.setTimestamp(1, start);
        insertQueuedRecordSetByTypeStatementGetListByStatus.setTimestamp(2, end);
        insertQueuedRecordSetByTypeStatementGetListByStatus.executeUpdate();
        insertQueuedRecordSetByTypeStatementGetListByStatus.close();

        //Insert and save QueuedRecordBean
        PreparedStatement insertQueuedRecordSetByTypeStatementGetListByStatusById = conn.prepareStatement(INSERT_QUEUE_ENTRY);
        PreparedStatement insertQueuedRecordSetByTypeStatementGetLastById = conn.prepareStatement(SELECT_QUEUE_BY_TYPE);

        Date end2 = new Timestamp(System.currentTimeMillis());
        insertQueuedRecordSetByTypeStatementGetListByStatusById.setTimestamp(1, start);
        insertQueuedRecordSetByTypeStatementGetListByStatusById.setTimestamp(2, end2);
}
}