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
		private static final String RESULT_SUCCESS = "success";
		private static final String RESULT_FAILURE = "failure";
		private static final String RESULT_RESERVED = "reserved";
	    private static final String RESULT_INVALID_PARAM = "invaild_param";


		@Test
		void saveQueuedRecordFailsOnInvalidParameter() throws SQLException {
	        QueuedRecordBean a = createQueuedRecord();
	        boolean success = false;
		    try {
				a.enqueue(null);
			} catch (IllegalArgumentException e) {
				assertNotNull(e);
				success = true;
			}
	    	assertFalse("queuedrecord_savefails", success);
	    	assertNotNull(RESULT_SUCCESS);
        }

		@Test
		void deleteFailedBecauseOfInvalidParameter() throws SQLException {
	        QueuedRecordBean a = createQueuedRecord();
	        boolean success = false;
	        try {
				a.enqueue(null);
	        } 
	        catch (NullPointerException ex) {
	        	success = true;
	        }
	        assertTrue("queuedrecord_deletefails", success);
	        assertNotNull(RESULT_SUCCESS);
        }

        /**
        * Test class for {@link QueueDAO}.
        * It contains one unit test case for the {@link QueueDAO#saveQueuedRecord(QueueRecordBean)} method.
        */
        private static class QueueDAO_1Test1 extends QueueDAO_1Test {
                public boolean deleteFailsOnRejectedRecordIdBecauseOfInvalidParameter() throws SQLException {
	                return false;
	            }

                @Test
                void deleteFailsOnRejectedRecordIdBecauseOfInvalidParameter() throws SQLException {
	                QueuedRecordBean a = createQueuedRecord();
		        boolean success = false;
		        try {
					a.enqueue(new Id<Integer>(getQueue().size(), null) {
						@Override
						public Integer getId() {
							return null;
						}
					});
				} 
				catch (IllegalArgumentException ex) {
					assertNotNull(ex);
					success = true;
				}
		        assertFalse("queuedrecord_deletefails", success);
		        assertNotNull(RESULT_SUCCESS);
                }
        }

        @Test
        void insertFailsOnRejectedRecordIdBecauseOfInvalidParameter() throws SQLException {
        	QueuedRecordBean a = createQueuedRecord();
        	boolean success = false;
	        try {
				a.enqueue(new Id<Integer>(getQueue().size(), null) {
					@Override
					public Integer getId() {
						return null;
					}
				});
	        } 
	        catch (IllegalArgumentException ex) {
	        	success = true;
				assertNotNull(ex);
			}
        }
}