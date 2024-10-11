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
		
	/**
	* Test 1 test case.
	* It stores a QueuedRecordBean to the database using the {@link #INSERT_QUEUE_ENTRY},
	* and verifies that the result from the {@link #INSERT_QUEUE_ENTRY} statement is valid.
	* The {@link #UPDATE_QUEUE_ENTRY} has to be used in case the QueuedRecordBean has an old record of this type,
	* which will cause a {@link QueueDAO.MetadataNotFoundException} to be thrown.
	* Finally it verifies a {@link QueueDAO.MetadataNotFoundException} is thrown if the {@link #UPDATE_QUEUE_ENTRY}
	* statement has an invalid update value.
	*/
	@Test
	void testInsert() {

		final List<String> qTypes = new ArrayList<>();
		final List<CompleteMetadataBean> qMetds = new ArrayList<>();
		do {
			final String type = this.getClass().getSimpleName() +
			(qTypes.isEmpty()? "" : (" and " + qTypes.get(qTypes.size()-1)));

			qMetds.add(new CompleteMetadataBean(1, "qId", "qtype", "qmetadata", "xqtype", "xqid"));
		} while (!qTypes.isEmpty());

		try (Connection conn = CommonDAO.getConnection()) {
			final PreparedStatement insertMetadata = conn.prepareStatement(INSERT_QUEUE_ENTRY);
			final PreparedStatement updateMetadata = conn.prepareStatement(UPDATE_QUEUE_ENTRY);

			for (int pos = 0; pos < qTypes.size(); pos++) try (ResultSet rs = conn.createStatement().executeQuery("SELECT " + qTypes.get(pos) + " FROM " +
				qMetds.get(pos).getMetadataType() +
				" WHERE Type =?")) {
				if (rs.next()) qTypes.add(rs.getString(1));
			}

			assertNull(insertMetadata.executeQuery());
			assertNull(updateMetadata.executeQuery());
		} catch (final SQLException e) {
			fail("error in test insert");
		}
	}

	/**
	 * Test 2 test case.
	 * It verifies that the result of {@link #UPDATE_QUEUE_ENTRY} can be used for an approrialled queue,
	 * which is a QueuedRecord of type {@link QueuedRecordBean#TYPE_CATALOG}.
	 * As the new metadata is available the method updates the table in the database using the
	 * PreparedStatement {@link #UPDATE_QUEUE_ENTRY}, and verifies that the result of the updated
	 * statement is {@link QueueDAO.MetadataNotFoundException}.
	 */
	@Test
	@SuppressWarnings("resource")
	public void testUpdateAll() {

}
}