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
		private final String TEST_TYPE = "type";

String getQueueByType(String TYPE_PATTERN) {
	String pattern = String.format("%s%s", ":", TYPE_PATTERN.toCharArray());
	for (String pattern1 : CommonDAO.QUEUE_PATTERNS) {
		if (pattern.compareTo(pattern1.toUpperCase()) == 0) {
			return "("+pattern1+")";
		}
	}
	return "";
}
	@Test
	public void getQueueByType_01() {
        List<QueuedRecordBean> resultList = new ArrayList<QueuedRecordBean>();
        DataSource ds = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String testTypePattern = "Type";
        ps = cd.prepareStatement(SELECT_QUEUE_BY_TYPE);
        ps.setString(1, testTypePattern);

        con = null;
        rs = null;
        cd.setDataSource(ds);
        ps.execute();

        while (rs.next()) {
            String type = rs.getString(1);
            CompletionInfo info = cd.getCompletion(type);
            TestCompletionResult result = null;

            if (TestCompletionResult.NO_COMPLETION == info.getCompletionStatus()) {
                continue;
            }
            String queueIdString = rs.getString(2);
            String metadataIdString = rs.getString(3);

            System.out.println("type  = "+type);
            System.out.println("metadata id  = "+metadataIdString);

            String testMetadataId = md.lookupCompletionMetadata(metadataIdString);
            String testType = getQueueByType(testMetadataId);

            result = new TestCompletionResult();
            result.setType(type);
            result.setDescription(queueIdString);
            result.getStatus().clear();
            result.getComment().clear();

            Timestamp completionTime = new Timestamp(rdb.getTimestampMillis());
            result.setCompletionTime(completionTime);

            Quesque.updateCompletion(dbr, info.getCompletionTime(), result);

            resultList.add(result);
        }

        try {
            System.out.println("Result list : "+resultList);
        }
        catch (Exception  e) {
            e.printStackTrace();
            fail("Error thrown");
        }
    }

	@Test
	public void getQueueByType_00() {
		DataSource ds = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		TestCompletionResult result = null;
		String testName = TEST_TYPE+"Queue";

        CompletionInfo info = new CompletionInfo(CompleteMetadataBean.COMPLETION_TYPE, "CATALOG", new Date(), TEST_NAME);
        info.setCompletionStatus(CompleteMetadataBean.COMPLETION_STATUS_SUCCESS);

        Quesque.addCompletionInfo(dbr, info);

        String testTypePattern = getQueueByType(TEST_TYPE);
        try {
            ps = cd.prepareStatement(INSERT_QUEUE_ENTRY);
            ps.setString(1, testTypePattern);
            ps.setString(2, TEST_NAME);
            ps.setDate(3, new Date());
            ps.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
            ps.executeUpdate();

        }
        catch (Exception  e) {
            e.printStackTrace();
        }

        boolean hasQueues = getQueueByType(TEST_TYPE);
        boolean testHasQueues = testTypePattern.equals(getQueueByType(TEST_TYPE))||(testTypePattern.equals(":"));
}
}