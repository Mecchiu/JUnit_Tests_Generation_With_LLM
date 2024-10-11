// QueueDAOTest.java
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
* It contains ten unit test cases for the {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
*/
class QueueDAOTest {

		/**
		* Test case for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
		* It tests the case when the queuedRecord argument is null.
		* It expects an IllegalArgumentException.
		*/
		@Test
		void testSaveQueuedRecord_NullQueuedRecord() {
				assertThrows(IllegalArgumentException.class, () -> {
						QueueDAO queueDAO = new QueueDAO();
						queueDAO.saveQueuedRecord(null);
				});
		}
		
		/**
		* Test case for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
		* It tests the case when the type of the queuedRecord argument is null.
		* It expects an IllegalArgumentException.
		*/
		@Test
		void testSaveQueuedRecord_NullType() {
				assertThrows(IllegalArgumentException.class, () -> {
						QueueDAO queueDAO = new QueueDAO();
						QueuedRecordBean queuedRecord = new QueuedRecordBean();
						queueDAO.saveQueuedRecord(queuedRecord);
				});
		}
		
		/**
		* Test case for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
		* It tests the case when the shortMetadata of the queuedRecord argument is null.
		* It expects an IllegalArgumentException.
		*/
		@Test
		void testSaveQueuedRecord_NullShortMetadata() {
				assertThrows(IllegalArgumentException.class, () -> {
						QueueDAO queueDAO = new QueueDAO();
						QueuedRecordBean queuedRecord = new QueuedRecordBean();
						queuedRecord.setType(QueuedRecordBean.Type.ADD);
						queueDAO.saveQueuedRecord(queuedRecord);
				});
		}
		
		/**
		* Test case for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
		* It tests the case when the metadataId of the shortMetadata of the queuedRecord argument is null.
		* It expects an IllegalArgumentException.
		*/
		@Test
		void testSaveQueuedRecord_NullMetadataId() {
				assertThrows(IllegalArgumentException.class, () -> {
						QueueDAO queueDAO = new QueueDAO();
						QueuedRecordBean queuedRecord = new QueuedRecordBean();
						queuedRecord.setType(QueuedRecordBean.Type.ADD);
						queuedRecord.setShortMetadata(new ShortMetadataBean());
						queueDAO.saveQueuedRecord(queuedRecord);
				});
		}
		
		/**
		* Test case for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
		* It tests the case when the queuedRecord argument is valid.
		* It expects the method to return true.
		*/
		@Test
		void testSaveQueuedRecord_ValidQueuedRecord() {
				QueueDAO queueDAO = new QueueDAO();
				QueuedRecordBean queuedRecord = new QueuedRecordBean();
				queuedRecord.setType(QueuedRecordBean.Type.ADD);
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setMetadataId(1);
				queuedRecord.setShortMetadata(shortMetadata);
				assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
		}
		
		/**
		* Test case for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
		* It tests the case when the queuedRecord argument is valid.
		* It expects the method to return true.
		*/
		@Test
		void testSaveQueuedRecord_ValidQueuedRecord() {
				QueueDAO queueDAO = new QueueDAO();
				QueuedRecordBean queuedRecord = new QueuedRecordBean();
				queuedRecord.setType(QueuedRecordBean.Type.ADD);
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setMetadataId(1);
				queuedRecord.setShortMetadata(shortMetadata);
				assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
		}
		
		/**
		* Test case for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
		* It tests the case when the queuedRecord argument is valid.
		* It expects the method to return true.
		*/
		@Test
		void testSaveQueuedRecord_ValidQueuedRecord() {
				QueueDAO queueDAO = new QueueDAO();
				QueuedRecordBean queuedRecord = new QueuedRecordBean();
				queuedRecord.setType(QueuedRecordBean.Type.ADD);
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setMetadataId(1);
				queuedRecord.setShortMetadata(shortMetadata);
				assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
		}
		
		/**
		* Test case for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
		* It tests the case when the queuedRecord argument is valid.
		* It expects the method to return true.
		*/
		@Test
		void testSaveQueuedRecord_ValidQueuedRecord() {
				QueueDAO queueDAO = new QueueDAO();
				QueuedRecordBean queuedRecord = new QueuedRecordBean();
				queuedRecord.setType(QueuedRecordBean.Type.ADD);
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setMetadataId(1);
				queuedRecord.setShortMetadata(shortMetadata);
				assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
		}
		
		/**
		* Test case for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
		* It tests the case when the queuedRecord argument is valid.
		* It expects the method to return true.
		*/
		@Test
		void testSaveQueuedRecord_ValidQueuedRecord() {
				QueueDAO queueDAO = new QueueDAO();
				QueuedRecordBean queuedRecord = new QueuedRecordBean();
				queuedRecord.setType(QueuedRecordBean.Type.ADD);
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setMetadataId(1);
				queuedRecord.setShortMetadata(shortMetadata);
				assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
		}
		
		/**
		* Test case for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
		* It tests the case when the queuedRecord argument is valid.
		* It expects the method to return true.