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
		public void getQueueByType_1() {
				DataSource dataSource = CDBUtils_0.getDataSource();
				List<String> queueTypeList = new ArrayList<>();
				
				queueTypeList.add("approval");
				queueTypeList.add("catalog");
			
				String selectQueueByType = selectQueueByType(queueTypeList);
				int actual = cd.getCount(selectQueueByType, dataSource);
				int expected = 12;
				
				assertEquals(expected, actual);
		}
		
		@Test
		public void getQueueByType_2() {
				DataSource dataSource = CDBUtils_0.getDataSource();
				List<String> queueTypeList = new ArrayList<>();
				
				queueTypeList.add("approval");
				queueTypeList.add("catalog");
			
				String selectQueueByType = selectQueueByType(queueTypeList);
				int actual = cd.getCount(selectQueueByType, dataSource);
				int expected = 11;
				
				assertEquals(expected, actual);
		}		
		
		@Test
		public void getQueue_1() {
				DataSource dataSource = CDBUtils_0.getDataSource();
				List<String> queueTypeList = new ArrayList<>();
				
				queueTypeList.add("approval");
				queueTypeList.add("catalog");
			
				String selectQueueByType = selectQueueByType(queueTypeList);
				String actual = getQueue(QueueType.APPROVAL, dataSource);
				String expected = "aproval/catalog/" + "12";
				
				assertEquals(expected, actual);
		}
		
		@Test
		public void getQueue_2() {
				DataSource dataSource = CDBUtils_0.getDataSource();
				List<String> queueTypeList = new ArrayList<>();
				
				queueTypeList.add("approval");
				queueTypeList.add("catalog");
			
				String selectQueueByType = selectQueueByType(queueTypeList);
				String actual = getQueue(QueueType.CATALOG, dataSource);
				String expected = "catalog";
				
				assertEquals(expected, actual);
		}		
		
		@Test
		public void getQueue_3() {
				DataSource dataSource = CDBUtils_0.getDataSource();
				List<String> queueTypeList = new ArrayList<>();
				
				queueTypeList.add("approval");
				queueTypeList.add("catalog");
			
				String selectQueueByType = selectQueueByType(queueTypeList);
				String actual = getQueue(QueueType.APPROVAL, dataSource);
				String expected = "aproval/catalog/" + "12";
				
				assertEquals(expected, actual);
		}		
		
		private String selectQueueByType(final List<String> queueTypeList) throws SQLException {
				String selectQueueByType = "SELECT QueuedRecordId," + " MetadataId, Status, Comments";
				Connection conn = CDBUtils_0.getConnection(dataSource);
				PreparedStatement stmt = conn.prepareStatement(selectQueueByType);

			//	int id, String metadataId, String status, String comments
			for (int i = 0; i < queueTypeList.size(); i++) {
				stmt.setString(i + 1, queueTypeList.get(i));
				//id, metadataId, status, comment
				stmt.setString(i + 2, queueTypeList.get(i) + "");
			}
				ResultSet rs = stmt.executeQuery();
				ArrayList queued = new ArrayList();
				
}
}