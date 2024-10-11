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
		void testSAVE_QUEUED_RECORD() {
			Util.clearTestDatabase();
			DataSource ds = new JdbcDataSource(true);
			ComplexMetadataBean complex= md.getComplexMetadata("foo");
			List<CompleteMetadataBean> all= md.createCompleteMetadata(ds, COMPLEX_METADATA_NAME, complex);
			ComplexMetadataBean complex2= md.getComplexMetadata("foo2");
			List<CompleteMetadataBean> all2= md.createCompleteMetadata(ds, COMPLEX_METADATA_NAME2, complex2);
			String qrecord= md.getMetadata("foo");
			String qrecord2= md.getMetadata("foo2");
			
			assertFalse(all.size()==0);
			assertFalse(all2.size()==0);
			
			CompleteMetadataBean metadata= all.get(0);
			metadata.setMetadataName("fooLast");
			all.remove(metadata);
			all2.remove(metadata2);
			CompleteMetadataBean complexmetadata= complex.getComplexMetadata(COMPLEX_METADATA_NAME);
			List<CompleteMetadataBean> allcomplex= md.getComplexMetadata(DS_COMPLEX_METADATA_NAME);
			allcomplex.remove(complexmetadata);
			COMPLEX_METADATA_NAME= null;
			ds.setConnection(null);
			dismissJdbcConnection(ds);
			com.mysql.cj.jdbc.Connection connection_= ds.getConnection();
			ComplexMetadataBean complexMetadata2= complexmetadata.getComplexMetadata(COMPLEX_METADATA_NAME2);
			List<CompleteMetadataBean> list_= md.createCompleteMetadata(ds, COMPLEX_METADATA_NAME, complexMetadata2);
			CompleteMetadataBean metadata1= all.get(0);
			assertTrue(list_.size()==0);
			assertTrue(metadata1.getMetadataName().equals("fooLast"));
			
			metadata= all2.get(0);
			metadata.setMetadataName("fooLast");
			all2.remove(metadata);
			all2.remove(metadata2);
			list_= md.createCompleteMetadata(ds, COMPLEX_METADATA_NAME2, complexMetadata2);
			assertTrue(list_.size()==0);
			metadata1= all.get(0);
			assertTrue(metadata1.getMetadataName().equals("fooLast"));

			String[] values_record= {
					"RecordId1",
					"RecordId2",
					"RecordId3",
					"RecordId4",
					"RecordId5",
					"RecordId6",
					"RecordId7",
					"RecordId8",
					"RecordId9",
					"RecordId10"
			};
			
			// Create a "record" object
			Integer recordId1= 1;
			Integer recordId2= 2;
			Integer recordId3= 8;
			Integer recordId4= 7;
			Integer recordId5= 5;
			Integer recordId6= 16;
			Integer recordId7= 12;
			Integer recordId8= 11;
			Integer recordId9= 2;
			Integer recordId10= 9;
			
			PreparedStatement insert1= connection_.prepareStatement(INSERT_QUEUE_ENTRY);
			PreparedStatement insert2= connection_.prepareStatement(UPDATE_QUEUE_ENTRY);
			PreparedStatement insert3= connection_.prepareStatement(DELETE_QUEUE_ENTRY);
			
			insert1.setString(1, "RecordId1");
			insert1.setString(2, "");
			insert1.setString(3, values_record[0]);
			insert1.setString(4, values_record[4]);
}
}