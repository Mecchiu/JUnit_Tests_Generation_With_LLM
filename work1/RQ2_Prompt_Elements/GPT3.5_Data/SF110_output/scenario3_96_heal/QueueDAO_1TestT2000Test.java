// QueueDAO_1Test.java
package org.heal.module.catalog;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Test class of {@link QueueDAO}.
 * It contains ten unit test cases for the {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
 */
class QueueDAO_1Test {

    @Test
    void testSaveQueuedRecord_Success() {
        // Arrange
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        QueueDAO queueDAO = mock(QueueDAO.class);
        when(queueDAO.saveQueuedRecord(queuedRecord)).thenReturn(true);

        // Act
        boolean result = queueDAO.saveQueuedRecord(queuedRecord);

        // Assert
        assertTrue(result);
    }

    @Test
    void testSaveQueuedRecord_Failure() {
        // Arrange
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        QueueDAO queueDAO = mock(QueueDAO.class);
        when(queueDAO.saveQueuedRecord(queuedRecord)).thenReturn(false);

        // Act
        boolean result = queueDAO.saveQueuedRecord(queuedRecord);

        // Assert
        assertFalse(result);
    }

    @Test
    void testSaveQueuedRecord_NullQueuedRecord() {
        // Arrange
        QueueDAO queueDAO = new QueueDAO();

        // Act
        boolean result = queueDAO.saveQueuedRecord(null);

        // Assert
        assertFalse(result);
    }

    @Test
    void testSaveQueuedRecord_NullMetadata() {
        // Arrange
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        QueueDAO queueDAO = new QueueDAO();

        // Act
        boolean result = queueDAO.saveQueuedRecord(queuedRecord);

        // Assert
        assertFalse(result);
    }

    @Test
    void testSaveQueuedRecord_NullMetadataId() {
        // Arrange
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        CompleteMetadataBean metadata = new CompleteMetadataBean();
        metadata.setId(null);
        queuedRecord.setMetadata(metadata);
        QueueDAO queueDAO = new QueueDAO();

        // Act
        boolean result = queueDAO.saveQueuedRecord(queuedRecord);

        // Assert
        assertFalse(result);
    }

    @Test
    void testSaveQueuedRecord_NullMetadataName() {
        // Arrange
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        CompleteMetadataBean metadata = new CompleteMetadataBean();
        metadata.setName(null);
        queuedRecord.setMetadata(metadata);
        QueueDAO queueDAO = new QueueDAO();

        // Act
        boolean result = queueDAO.saveQueuedRecord(queuedRecord);

        // Assert
        assertFalse(result);
    }

    @Test
    void testSaveQueuedRecord_NullMetadataVersion() {
        // Arrange
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        CompleteMetadataBean metadata = new CompleteMetadataBean();
        metadata.setVersion(null);
        queuedRecord.setMetadata(metadata);
        QueueDAO queueDAO = new QueueDAO();

        // Act
        boolean result = queueDAO.saveQueuedRecord(queuedRecord);

        // Assert
        assertFalse(result);
    }

    @Test
    void testSaveQueuedRecord_NullMetadataType() {
        // Arrange
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        CompleteMetadataBean metadata = new CompleteMetadataBean();
        metadata.setType(null);
        queuedRecord.setMetadata(metadata);
        QueueDAO queueDAO = new QueueDAO();

        // Act
        boolean result = queueDAO.saveQueuedRecord(queuedRecord);

        // Assert
        assertFalse(result);
    }

    @Test
    void testSaveQueuedRecord_NullMetadataSource() {
        // Arrange
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        CompleteMetadataBean metadata = new CompleteMetadataBean();
        metadata.setSource(null);
        queuedRecord.setMetadata(metadata);
        QueueDAO queueDAO = new QueueDAO();

        // Act
        boolean result = queueDAO.saveQueuedRecord(queuedRecord);

        // Assert
        assertFalse(result);
    }

    @Test
    void testSaveQueuedRecord_NullMetadataTimestamp() {
        // Arrange
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        CompleteMetadataBean metadata = new CompleteMetadataBean();
        metadata.setTimestamp(null);
        queuedRecord.setMetadata(metadata);
        QueueDAO queueDAO = new QueueDAO();

        // Act
        boolean result = queueDAO.saveQueuedRecord(queuedRecord);

        // Assert
        assertFalse(result);
    }
}