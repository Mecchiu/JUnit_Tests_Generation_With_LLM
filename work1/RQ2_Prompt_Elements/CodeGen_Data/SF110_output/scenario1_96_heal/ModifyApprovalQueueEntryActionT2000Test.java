// ModifyApprovalQueueEntryActionTest.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.module.catalog.QueuedRecordBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyApprovalQueueEntryAction}.
* It contains one unit test case for the {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyApprovalQueueEntryActionTest {
private final static QueuedRecordBean currentRecord = new QueuedRecordBean();
	/** private constructor */
	private ModifyApprovalQueueEntryActionTest() { }

	/**
	* Tests {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
	*/
	@Test
	public void testMustLogin() {
		// arrange
		final QueuedRecordBean savedRecord = new QueuedRecordBean();
		currentRecord.setApprovalRecordId(savedRecord.getApprovalRecordId());
		currentRecord.setApplication("java");
	
	// act
	boolean requireLoginResult = true;
	
	// assert
	assertTrue("Must require login in addOrUpdateApprovalQueueEntry", requireLoginResult);
	}

	/**
	* Tests adding an updated record.
	* It also tests {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
	*/
	@Test
	public void testUpdateRecord() {
	// arrange
		final QuequeuedRecordBean newRecord = new QuequeuedRecordBean();
	currentRecord.setApprovalRecordId(newRecord.getApprovalRecordId());
	newRecord.setApplication("java");
	newRecord.setDescription("Java Server for java");
	newRecord.setName("New Software");
	newRecord.setQueueId("myQueueId");
	currentRecord.setCurrentVersion("currentVersion");
	currentRecord.setUpdatedAt(System.currentTimeMillis());
					
	// act
	boolean requireLoginResult = true;
	boolean updatedResult = true;
	
	// assert
	assertTrue("Must require login in updateRecord", requireLoginResult);
	assertTrue("Must update the record with an updated object",updatedResult);
	assertEquals("Error message was not found", "Name is required", newRecord.getErrorMessage());
	
	}
	
	/**
	* Tests a valid update.
	* It also tests {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
	*/
	@Test
	public void testUpdate() {
	// arrange
		final QuequeuedRecordBean newRecord = new QuequeuedRecordBean();
	currentRecord.setApprovalRecordId(newRecord.getApprovalRecordId());
	newRecord.setApplication("java");
	newRecord.setDescription("Java Server for java");
	newRecord.setName("New Software");
	newRecord.setQueueId("myQueueId");
	currentRecord.setCurrentVersion("currentVersion");
					
	// act
	boolean requireLoginResult = true;
	boolean updatedResult = true;
	
	// assert
	assertTrue("Must require login in updateRecord", requireLoginResult);
	assertTrue("Must update the record with an updated object",updatedResult);
	assertEquals("Error message was not found", "Name is required", newRecord.getErrorMessage());
	
	}

					
	
	
	/**
	* Tests deleting an updated record.
	* It also tests {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
	*/
	@Test
	public void testDelete() {
	// arrange
		final QuequeuedRecordBean deletedRecord = new QuequeuedRecordBean();
	currentRecord.setApprovalRecordId(deletedRecord.getApprovalRecordId());
	currentRecord.setApplication("java");
	currentRecord.setDescription("Java Server for java");
	currentRecord.setName("New Software");
	currentRecord.setQueueId("myQueueId");
	currentRecord.setCurrentVersion("currentVersion");
					
	// act
	boolean requireLoginResult = true;
	boolean updatedResult = true;
	
	// assert
	assertTrue("Must require login in deleteRecord", requireLoginResult);
	assertTrue("Must update the record with an updated object",updatedResult);
	assertEquals("Error message was not found", "A record cannot be deleted when it was created with a queue", deletedRecord.getDescription());
	assertEquals("Error message was not found", "A record cannot be deleted when it was created with a queue",deletedRecord.getName());
	assertEquals("Error message was not found", "The name of the record",deletedRecord.getName());
	assertEquals("Error message was not found", "The queueId",deletedRecord.getQueueId());
	
	}
					
					
					}





}
