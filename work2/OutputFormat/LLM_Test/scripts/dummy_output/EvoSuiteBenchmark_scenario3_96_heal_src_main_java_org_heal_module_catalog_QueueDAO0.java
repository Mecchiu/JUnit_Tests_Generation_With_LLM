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
* It contains ten unit test cases for the {@link QueueDAO#getQueueByType(String)} method.
*/
class QueueDAOTest {
		
	/**
	* Test case for {@link QueueDAO#getQueueByType(String)} method.
	* It tests the case when the type is null.
	*/
	@Test
	public void testGetQueueByType_NullType() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link QueueDAO#getQueueByType(String)} method.
	* It tests the case when the type is empty.
	*/
	@Test
	public void testGetQueueByType_EmptyType() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link QueueDAO#getQueueByType(String)} method.
	* It tests the case when the type is not empty.
	*/
	@Test
	public void testGetQueueByType_NonEmptyType() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link QueueDAO#getQueueByType(String)} method.
	* It tests the case when the type is not empty and the queue is empty.
	*/
	@Test
	public void testGetQueueByType_NonEmptyType_EmptyQueue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link QueueDAO#getQueueByType(String)} method.
	* It tests the case when the type is not empty and the queue is not empty.
	*/
	@Test
	public void testGetQueueByType_NonEmptyType_NonEmptyQueue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link QueueDAO#getQueueByType(String)} method.
	* It tests the case when the type is not empty and the queue is not empty and the queue contains one record.
	*/
	@Test
	public void testGetQueueByType_NonEmptyType_NonEmptyQueue_OneRecord() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link QueueDAO#getQueueByType(String)} method.
	* It tests the case when the type is not empty and the queue is not empty and the queue contains two records.
	*/
	@Test
	public void testGetQueueByType_NonEmptyType_NonEmptyQueue_TwoRecords() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link QueueDAO#getQueueByType(String)} method.
	* It tests the case when the type is not empty and the queue is not empty and the queue contains three records.
	*/
	@Test
	public void testGetQueueByType_NonEmptyType_NonEmptyQueue_ThreeRecords() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link QueueDAO#getQueueByType(String)} method.
	* It tests the case when the type is not empty and the queue is not empty and the queue contains four records.
	*/
	@Test
	public void testGetQueueByType_NonEmptyType_NonEmptyQueue_FourRecords() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for {@link QueueDAO#getQueueByType(String)} method.
	* It tests the case when the type is not empty and the queue is not empty and the queue contains five records.
	*/
	@Test
	public void testGetQueueByType_NonEmptyType_NonEmptyQueue_FiveRecords() {
		// TODO: implement this test case
	}
}