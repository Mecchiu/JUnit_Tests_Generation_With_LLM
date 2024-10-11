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
  public void getQueueByType() {
    String type = "_queue";

    String[] split = type.split("_");
    type = split [0];

    QueueDAO queueDAO = new QueueDAO();
    List<QueuedRecordBean> queuedRecordBeans = queueDAO.getQueueByType(type);
    
    assertNotNull(queuedRecordBeans);
    assertTrue(queuedRecordBeans.size() > 0);

    boolean foundApprovalRecord = false;

    // Make sure that the requested type is there
    boolean found = false;
    for (final QueuedRecordBean queuedRecordBean : queuedRecordBeans) {
      if (queuedRecordBean.getStatus().equalsIgnoreCase(TYPE_APPROVAL) || queuedRecordBean.getStatus().equalsIgnoreCase(TYPE_CATALOG) ) {
        foundApprovalRecord = true;
      }
    }
    assertTrue(foundApprovalRecord);
  }

  @Test
  public void testGetQueueByType() {

    QueueDAO queueDAO = new QueueDAO();
    String[] split = "_queue";

    String expectedResult = "";
    String expectedType = split[0].substring(1, split[0].length() - 1);

    List<QueuedRecordBean> queuedRecordBeans = queueDAO.getQueueByType(expectedType);
    for (QueuedRecordBean queuedRecordBean : queuedRecordBeans) {
      expectedResult += (queuedRecordBean.getStatus() + "/" + queuedRecordBean.getMetadataId() + "/" + queuedRecordBean.getComments());
    }

    assertEquals(expectedResult, CD.getString(queueDAO, "SELECT QueuedRecords.Types"));
  }

}