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
		/**
		 * Test method for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)}.
		 */
		@Test
		void testSaveQueuedRecord() {
			getQueueByType(TYPE_APPROVAL).get(Connection.getInstance());
			List<CompleteMetadataBean> cats = getCatalogQueue();
			List<CompleteMetadataBean> que = getApprovalQueue();
			assertTrue("Catalog queue empty.", catFilled(cats));
			assertTrue("Approval queue empty.", queFilled(que));
			Thread.sleep(2000);
			deleteQueue();
			getCATs();
			getCompleteMetadataById(cats);
			assertTrue("Catalog queue filled.", catFilled(cats));
		}
	}