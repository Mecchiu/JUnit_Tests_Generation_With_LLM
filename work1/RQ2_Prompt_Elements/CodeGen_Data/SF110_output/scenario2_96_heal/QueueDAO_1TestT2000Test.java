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
// QueueDAO.java
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

/**
 * A DAO for managing queues stored in the database
 */
public class QueueDAO implements Serializable {

    /**
     * Saves a {@link QueuedRecordBean} to the database.
     *
     * @param queuedRecord A non-null QueuedRecordBean to save.
     * @return <code>true</code> if the save is successful, false otherwise.
     */
    public boolean saveQueuedRecord(final QueuedRecordBean queuedRecord) {
        boolean result = false;
        if (null == queuedRecord) {
            throw new IllegalArgumentException("queuedRecord argument must be non-null");
        }
        if (null == queuedRecord.getType()) {
            throw new IllegalArgumentException("Cannot save a QueuedRecordBean without a type");
        }
        if (null == queuedRecord.getShortMetadata() || null == queuedRecord.getShortMetadata().getMetadataId()) {
            throw new IllegalArgumentException("Cannot save a queued record without a metadataId");
        }
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            saveQueuedRecord(queuedRecord, conn);
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null!= conn) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}

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
		final static DataSource dataSource = CommonDAO.getInstance(CommonDAO.NAMESPACE_DAO_NAME, CommonDAO.NAMESPACE_VERSION);
		final static String TABLE = "HEAL_CATALOG_QUEUED";
		final static int VERSION = 10;
        
		/**
     * Constructor for an empty {@link QueueDAO} based on the passed {@link DataSource}
     *
     * @param dataSource The DataSource being used by this DAO to create the table.
     */
    public QueueDAO_1Test(final DataSource dataSource) {
        this.dataSource = dataSource;
    }


	/**
     * Retrieves all {@link QueuedRecordBean} from the database by supplying them to a
	 * {@link PreparedStatement}.  The PreparedStatement must be executed with the Connection
	 * passed to the method. This statement MUST produce the correct metadata, and can take the
	 * form of a {@link CompleteMetadataBean}
	 *
	 * @param stmt A non-null Statement to retreive all {@link QueuedRecordBean} from the database.
	 * @param conn The Connection object that provides the connection
	 *               to the database.
	 */
    public void getAllQueuedRecordsByStatement(final PreparedStatement stmt, final Connection conn) {
		Connection c = null;
		List<QueueRecord> list = null;
		try {
			c = conn;
			if (null == stmt || null == c) {
				throw new IllegalArgumentException("Statement argument is null");
			}
			if (! c.isClosed()) {
				if(stmt instanceof PreparedStatement) {
					list = new ArrayList<QueueRecord>();
					if (stmt == stmt) {
						if (stmt instanceof PreparedStatement) {
							PreparedStatement preparedStatement = (PreparedStatement) stmt;
							ResultSet rs = preparedStatement.executeQuery();
							while (rs.next()) {
								list.add(new QueuedRecordBean(new CompleteMetadataBean(), rs.getInt("TYPE"), rs.getInt("METADATA_ID"), rs.getTimestamp("TS"), rs.getString("RECORD_DESCRIPTION"), rs.getString("RECORD_NAME"), rs.getConnection().getMetaData().getTable(TABLE)), c));
							}
							return;
						} else {
							PreparedStatement query = stmt;
							ResultSet rs = query.executeQuery();
							List<QueueRecord> qrList = new ArrayList<QueueRecord>();
							while (rs.next()) {
								qrList.add(new QueuedRecordBean(new CompleteMetadataBean(), rs.getInt("TYPE"), rs.getInt("METADATA_ID"), rs.getTimestamp("TS"), rs.getString("RECORD_DESCRIPTION"), rs.getString("RECORD_NAME"), rs.getConnection().getMetaData().getTable(TABLE), c));
							}
							stmt = query;
							conn = query.getConnection();
							list = qrList;
						}
						
					} else {
						if (stmt == null || null == stmt.getConnection()) {
							throw new IllegalStateException("PreparedStatement.getConnection() is required.");
						}
						ResultSet rs = stmt.executeQuery();
						List<QueueRecord> qrList = null;
						if (rs!= null && rs.getMetaData().getTable(TABLE).equalsIgnoreCase(TABLE)) {
							qrList = new ArrayList<QueueRecord>();
							if (rs!= null) {
								qrList = rs.unwrap(List.class);
							}
							
						}
						while (rs.next()) {
							list = qrList;
							list.add(new QueuedRecordBean(new CompleteMetadataBean(), rs.getInt("TYPE"), rs.getInt("METADATA_ID"), rs.getTimestamp("TS"), rs.getString("RECORD_DESCRIPTION"), rs.getString("RECORD_NAME"), rs.getConnection().getMetaData().getTable(TABLE), c));
						}
						
					}
					
				} else {
					throw new IllegalArgumentException("PreparedStatement is null.");
				}
			} else {
				throw new IllegalStateException("Connection is null. Make sure the Connection has been created with a Connection using the Connection(DataSource) constructor");
			}
		} catch (Exception e) {
			// This exception is not expected due to the way of creating a Statement.
			throw new RuntimeException(e);
		} finally {
			if (null!= stmt) {
				stmt.close();
				c.close();
			}
		}
	}
	
	public void getAllQueuedRecordsByStatement(final PreparedStatement stmt, final ResultSet rs) {
		getAllQueuedRecordsByStatement(stmt, null, rs);
	}

	public void getAllQueuedRecordsByStatement(final PreparedStatement stmt, final Connection conn, final ResultSet rs) {
		getAllQueuedRecordsByStatement(stmt, conn, rs);
	}

	public void getAllQueuedRecordsByStatement(final PreparedStatement stmt,