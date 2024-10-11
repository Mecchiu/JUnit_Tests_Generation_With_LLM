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
		public QueueDAO_0Test() {
		}

		@Test
		public void testGetQueueByType() {
			// Given
			MetadataDAO md = new MetadataDAO();
			dataSource = md.initDataSource();

			// When
			List<CompleteMetadataBean> list = md.getCompleteDatabaseMetadata(null);

			// Then
			assertNotNull(list);
			assertEquals(2, list.size());
		}

		@Test
		public void testEnqueue() {
			// Given
			String metadataId = null;
			MetadataDAO md = new MetadataDAO();
			dataSource = md.initDataSource();

			try {
				// When
				md.makeMetadata(metadataId, null);

				// Then
				QueuedRecordBean queuedRecord = md.getQueue(TYPE_APPROVAL, dataSource);
				CompleteMetadataBean meta = md.getCompleteDatabaseMetadata(queuedRecord.getMetadataId());
				assertNotNull(meta);
				List<Object> records = md.getApprovedRecords(meta.getMetadataId(), dataSource);
				assertEquals(1, records.size());
			} finally {
				if (dataSource!= null) {
					dataSource.close();
				}
			}
		}

		@Test
		public void testDequeue() {
			// Given
			String metadataId = null;
			MetadataDAO md = new MetadataDAO();
			dataSource = md.initDataSource();

			try {
				// When
				md.makeMetadata(metadataId, null);

				// Then
				queuedRecord = md.getQueue(TYPE_CATALOG, dataSource);
				CompleteMetadataBean meta = md.getCompleteDatabaseMetadata(queuedRecord.getMetadataId());
				assertNotNull(meta);
				List<Object> records = md.getCatalogRecords(meta.getMetadataId(), dataSource);
				assertEquals(1, records.size());
				List<Object> records2 = md.getApprovedRecords(meta.getMetadataId(), dataSource);
				assertEquals(1, records2.size());
			} finally {
				if (dataSource!= null) {
					dataSource.close();
				}
			}
		}

		@Test
		public void testMarkApproved() {
			// Given
			String metadataId = null;
			MetadataDAO md = new MetadataDAO();
			dataSource = md.initDataSource();

			try {
				// When
				md.makeMetadata(metadataId, null);

				// Then
				QueuedRecordBean queuedRecord = md.getQueue(TYPE_APPROVAL, dataSource);
				CompleteMetadataBean meta = md.getCompleteDatabaseMetadata(queuedRecord.getMetadataId());
				assertNotNull(meta);

				// Marking the queue as approved
				md.markRecordApproved(meta.getMetadataId(), dataSource);

				List<Object> records = md.getCatalogRecords(meta.getMetadataId(), dataSource);
				assertEquals(1, records.size());
			} finally {
				if (dataSource!= null) {
					dataSource.close();
				}
			}
		}

		@Test
		public void testMarkCatalogized() {
			// Given
			String metadataId = null;
			MetadataDAO md = new MetadataDAO();
			dataSource = md.initDataSource();

}
}