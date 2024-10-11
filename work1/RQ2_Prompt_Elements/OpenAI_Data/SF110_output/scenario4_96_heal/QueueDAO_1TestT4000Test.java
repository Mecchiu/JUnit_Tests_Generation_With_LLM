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
* It contains ten unit test cases for the {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
*/
class QueueDAO_1Test {

	/**
	* Test case 1 for method saveQueuedRecord.
	* The test case aims to test the situation that the queuedRecord is null.
	* The expected result is that the method will throw a NullPointerException.
	*/
	@Test
	public void testSaveQueuedRecord_1()
		throws Exception {
		QueueDAO fixture = new QueueDAO();
		fixture.setDataSource(new DataSource() {
			public Connection getConnection() throws SQLException {
				return null;
			}
			public Connection getConnection(String username, String password) throws SQLException {
				return null;
			}
			public PrintWriter getLogWriter() throws SQLException {
				return null;
			}
			public int getLoginTimeout() throws SQLException {
				return 0;
			}
			public void setLogWriter(PrintWriter out) throws SQLException {
			}
			public void setLoginTimeout(int seconds) throws SQLException {
			}
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				return false;
			}
			public <T> T unwrap(Class<T> iface) throws SQLException {
				return null;
			}
		});
		fixture.cd = new CommonDAO();
		fixture.md = new MetadataDAO();
		QueuedRecordBean queuedRecord = null;

		boolean result = fixture.saveQueuedRecord(queuedRecord);

		assertTrue(result);
	}

	/**
	* Test case 2 for method saveQueuedRecord.
	* The test case aims to test the situation that the queuedRecord is not null.
	* The expected result is that the method will return true.
	*/
	@Test
	public void testSaveQueuedRecord_2()
		throws Exception {
		QueueDAO fixture = new QueueDAO();
		fixture.setDataSource(new DataSource() {
			public Connection getConnection() throws SQLException {
				return null;
			}
			public Connection getConnection(String username, String password) throws SQLException {
				return null;
			}
			public PrintWriter getLogWriter() throws SQLException {
				return null;
			}
			public int getLoginTimeout() throws SQLException {
				return 0;
			}
			public void setLogWriter(PrintWriter out) throws SQLException {
			}
			public void setLoginTimeout(int seconds) throws SQLException {
			}
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				return false;
			}
			public <T> T unwrap(Class<T> iface) throws SQLException {
				return null;
			}
		});
		fixture.cd = new CommonDAO();
		fixture.md = new MetadataDAO();
		QueuedRecordBean queuedRecord = new QueuedRecordBean();

		boolean result = fixture.saveQueuedRecord(queuedRecord);

		assertTrue(result);
	}

	/**
	* Test case 3 for method saveQueuedRecord.
	* The test case aims to test the situation that the queuedRecord is not null.
	* The expected result is that the method will return true.
	*/
	@Test
	public void testSaveQueuedRecord_3()
		throws Exception {
		QueueDAO fixture = new QueueDAO();
		fixture.setDataSource(new DataSource() {
			public Connection getConnection() throws SQLException {
				return null;
			}
			public Connection getConnection(String username, String password) throws SQLException {
				return null;
			}
			public PrintWriter getLogWriter() throws SQLException {
				return null;
			}
			public int getLoginTimeout() throws SQLException {
				return 0;
			}
			public void setLogWriter(PrintWriter out) throws SQLException {
			}
			public void setLoginTimeout(int seconds) throws SQLException {
			}
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				return false;
			}
			public <T> T unwrap(Class<T> iface) throws SQLException {
				return null;
			}
		});
		fixture.cd = new CommonDAO();
		fixture.md = new MetadataDAO();
		QueuedRecordBean queuedRecord = new QueuedRecordBean();

		boolean result = fixture.saveQueuedRecord(queuedRecord);

		assertTrue(result);
	}

	/**
	* Test case 4 for method saveQueuedRecord.
	* The test case aims to test the situation that the queuedRecord is not null.
	* The expected result is that the method will return true.
	*/
	@Test
	public void testSaveQueuedRecord_4()
		throws Exception {
		QueueDAO fixture = new QueueDAO();
		fixture.setDataSource(new DataSource() {
			public Connection getConnection() throws SQLException {
				return null;
			}
			public Connection getConnection(String username, String password) throws SQLException {
				return null;
			}
			public PrintWriter getLogWriter() throws SQLException {
				return null;
			}
			public int getLoginTimeout() throws SQLException {
				return 0;
			}
			public void setLogWriter(PrintWriter out) throws SQLException {
			}
			public void setLoginTimeout(int seconds) throws SQLException {
			}
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				return false;
			}
			public <T> T unwrap(Class<T> iface) throws SQLException {
				return null;
			}
		});
		fixture.cd = new CommonDAO();
		fixture.md = new MetadataDAO();
		QueuedRecordBean queuedRecord = new QueuedRecordBean();

		boolean result = fixture.saveQueuedRecord(queuedRecord);

		assertTrue(result);
	}

	/**
	* Test case 5 for method saveQueuedRecord.
	* The test case aims to test the situation that the queuedRecord is not null.
	* The expected result is that the method will return true.
	*/
	@Test
	public void testSaveQueuedRecord_5()
		throws Exception {
		QueueDAO fixture = new QueueDAO();
		fixture.setDataSource(new DataSource() {
			public Connection getConnection() throws SQLException {
				return null;
			}
			public Connection getConnection(String username, String password) throws SQLException {
				return null;
			}
			public PrintWriter getLogWriter() throws SQLException {
				return null;
			}
			public int getLoginTimeout() throws SQLException {
				return 0;
			}
			public void setLogWriter(PrintWriter out) throws SQLException {
			}
			public void setLoginTimeout(int seconds) throws SQLException {
			}
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				return false;
			}
			public <T> T unwrap(Class<T> iface) throws SQLException {
				return null;
			}
		});
		fixture.cd = new CommonDAO();
		fixture.md = new MetadataDAO();
		QueuedRecordBean queuedRecord = new QueuedRecordBean();

		boolean result = fixture.saveQueuedRecord(queuedRecord);

		assertTrue(result);
	}

	/**
	* Test case 6 for method saveQueuedRecord.
	* The test case aims to test the situation that the queuedRecord is not null.
	* The expected result is that the method will return true.
	*/
	@Test
	public void testSaveQueuedRecord_6()
		throws Exception {
		QueueDAO fixture = new QueueDAO();
		fixture.setDataSource(new DataSource() {
			public Connection getConnection() throws SQLException {
				return null;
			}
			public Connection getConnection(String username, String password) throws SQLException {
				return null;
			}
			public PrintWriter getLogWriter() throws SQLException {
				return null;
			}
			public int getLoginTimeout() throws SQLException {
				return 0;
			}
			public void setLogWriter(PrintWriter out) throws SQLException {
			}
			public void setLoginTimeout(int seconds) throws SQLException {
			}
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				return false;
			}
			public <T> T unwrap(Class<T> iface) throws SQLException {
				return null;
			}
		});
		fixture.cd = new CommonDAO();
		fixture.md = new MetadataDAO();
		QueuedRecordBean queuedRecord = new QueuedRecordBean();

		boolean result = fixture.saveQueuedRecord(queuedRecord);

		assertTrue(result);
	}

	/**
	* Test case 7 for method saveQueuedRecord.
	* The test case aims to test the situation that the queuedRecord is not null.
	* The expected result is that the method will return true.
	*/
	@Test
	public void testSaveQueuedRecord_7()
		throws Exception {
		QueueDAO fixture = new QueueDAO();
		fixture.setDataSource(new DataSource() {
			public Connection getConnection() throws SQLException {
				return null;
			}
			public Connection getConnection(String username, String password) throws SQLException {
				return null;
			}
			public PrintWriter getLogWriter() throws SQLException {
				return null;
			}
			public int getLoginTimeout() throws SQLException {
				return 0;
			}
			public void setLogWriter(PrintWriter out) throws SQLException {
			}
			public void setLoginTimeout(int seconds) throws SQLException {
			}
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				return false;
			}
			public <T> T unwrap(Class<T> iface) throws SQLException {
				return null;
			}
		});
		fixture.cd = new CommonDAO();
		fixture.md = new MetadataDAO();
		QueuedRecordBean queuedRecord = new QueuedRecordBean();

		boolean result = fixture.saveQueuedRecord(queuedRecord);

		assertTrue(result);
	}

	/**
	* Test case 8 for method saveQueuedRecord.
	* The test case aims to test the situation that the queuedRecord is not null.
	* The expected result is that the method will return true.
	*/
	@Test
	public void testSaveQueuedRecord_8()
		throws Exception {
		QueueDAO fixture = new QueueDAO();
		fixture.setDataSource(new DataSource() {
			public Connection getConnection() throws SQLException {
				return null;
			}
			public Connection getConnection(String username, String password) throws SQLException {
				return null;
			}
			public PrintWriter getLogWriter() throws SQLException {
				return null;
			}
			public int getLoginTimeout() throws SQLException {
				return 0;
			}
			public void setLogWriter(PrintWriter out) throws SQLException {
			}
			public void setLoginTimeout(int seconds) throws SQLException {
			}
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				return false;
			}
			public <T> T unwrap(Class<T> iface) throws SQLException {
				return null;
			}
		});
		fixture.cd = new CommonDAO();
		fixture.md = new MetadataDAO();
		QueuedRecordBean queuedRecord = new QueuedRecordBean();

		boolean result = fixture.saveQueuedRecord(queuedRecord);

		assertTrue(result);
	}

	/**
	* Test case 9 for method saveQueuedRecord.
	* The test case aims to test the situation that the queuedRecord is not null.
	* The expected result is that the method will return true.
	*/
	@Test
	public void testSaveQueuedRecord_9()
		throws Exception {
		QueueDAO fixture = new QueueDAO();
		fixture.setDataSource(new DataSource() {
			public Connection getConnection() throws SQLException {
				return null;
			}
			public Connection getConnection(String username, String password) throws SQLException {
				return null;
			}
			public PrintWriter getLogWriter() throws SQLException {
				return null;
			}
			public int getLoginTimeout() throws SQLException {
				return 0;
			}
			public void setLogWriter(PrintWriter out) throws SQLException {
			}
			public void setLoginTimeout(int seconds) throws SQLException {
			}
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				return false;
			}
			public <T> T unwrap(Class<T> iface) throws SQLException {
				return null;
			}
		});
		fixture.cd = new CommonDAO();
		fixture.md = new MetadataDAO();
		QueuedRecordBean queuedRecord = new QueuedRecordBean();

		boolean result = fixture.saveQueuedRecord(queuedRecord);

		assertTrue(result);
	}

	/**
	* Test case 10 for method saveQueuedRecord.
	* The test case aims to test the situation that the queuedRecord is not null.
	* The expected result is that the method will return true.
	*/
	@Test
	public void testSaveQueuedRecord_10()
		throws Exception {
		QueueDAO fixture = new QueueDAO();
		fixture.setDataSource(new DataSource() {
			public Connection getConnection() throws SQLException {
				return null;
			}
			public Connection getConnection(String username, String password) throws SQ