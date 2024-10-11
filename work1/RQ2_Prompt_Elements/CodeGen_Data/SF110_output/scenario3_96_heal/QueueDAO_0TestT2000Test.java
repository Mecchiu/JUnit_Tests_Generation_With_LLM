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
private QueueDAO queueDAO = new QueueDAO();
	/**
	 * This method tests method {@link QueueDAO#getQueueByType(String)}
	 * @throws SQLException 
	 */
	@Test
	public void testgetQueueByType(){
		assertNotNull(queueDAO.getQueueByType("daoTest"));
	}

		/**
	 * This method tests method {@link QueueDAO#getQueueByType(String)}
	 * @throws SQLException 
	 * @throws java.sql.Types
	 * @throws java.lang.Exception 
	 */
	@Test
	public void testaddOneRecord(){
		List<QueuedRecordBean> list = new ArrayList<List<QueuedRecordBean>>();
		try (Connection con = CommonDAO.connect("jdbc/queueDAO_0");
				PreparedStatement pst = con.prepareStatement("insert into catmaid_queue (id, name, queue_title, created_time, deleted_time, type, status, creator_id, created_by, updated_by, updated_time) values(?,?,?,?,?,?,?,?,?,?)"
		));
		) {
			pst.setString(1, "foo");
			pst.setString(2, "");
			pst.setString(3, "");
			pst.setString(4, "");
			pst.setString(5, "");
			pst.setString(6, "catmaid");
			pst.setString(7, ""); // queue_title
			pst.setString(8, ""); // status
			pst.setString(9, ""); // creator_id
			pst.setString(10, ""); // created_by
			pst.setString(11, ""); // updated_by
			pst.setString(12, "");
			pst.execute();
			ResultSet rs=pst.getGeneratedKeys();
			assertNotNull(rs.next());
			QueuedRecordBean queueBean = new QueuedRecordBean();
			queueBean.setKey(Integer.parseInt(rs.getString(1)));
			queueBean.setType("test");
			queueBean.setName("test");
			queueBean.setQueueTitle("test");
			queueBean.setState(QueueRecordState.UNDEFINED.toString());
			queueBean.setUpdatedTime(new Date());
			queueBean.setDeletedTime(new Date());
			list.add(queueBean);
			
			pst.setString(1, "");
			pst.setString(2, queueBean.getQueueTitle());
			pst.setString(3, queueBean.getState().toString());
			pst.setString(4, queueBean.getKey());
			pst.setString(5, queueBean.getKey());
			pst.setString(6, queueBean.getKey());
			pst.setString(7, queueBean.getName());
			pst.setString(8, queueBean.getName());
			pst.setString(9, queueBean.getQueueTitle());
			pst.setDate(10, new Timestamp(queueBean.getUpdatedTime().getTime()));
			pst.setString(11, "");
			pst.setString(12, "");
			pst.execute();
			rs = pst.getGeneratedKeys();
			assertNotNull(rs.next());
			Integer newQueueID = Integer.parseInt(rs.getString(1));
			pst.close();
			con.close();
			
			assertEquals(queueBean.getQueueID(), newQueueID);
			assertEquals(queueBean.getName(), newQueueID);
			
			assertNull(list.get(0));
			assertNull(queueBean.getQueueID());
			assertNull(queueBean.getName());
			assertNull(queueBean.getState());
			assertNull(queueBean.getCreated_by());
			assertNull(queueBean.getUpdated_by());
			
			assertNull(list.get(1));
			assertNull(queueBean.getQueueTitle());
			assertNull(queueBean.getState());
			assertNull(queueBean.getCreated_time());
			assertNull(queueBean.getDeleted_time());
		}
		catch (SQLException exception) {
			fail("Failed to create db conenction : ");
			exception.printStackTrace();
			assertEquals(
					"Error 1: DB connection Error when creating PreparedStatement.\n" +
					"Message : Unable to load all the data associated with the Queue data \n" +
					"Message : Cannot get the Connection for the DB connection.",
					exception.getMessage());
		}
		finally {
			con.close();
		}
	}
}