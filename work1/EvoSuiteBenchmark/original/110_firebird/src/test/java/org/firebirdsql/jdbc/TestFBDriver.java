/*
 * Firebird Open Source J2ee connector - jdbc driver
 *
 * Distributable under LGPL license.
 * You may obtain a copy of the License at http://www.gnu.org/copyleft/lgpl.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * LGPL License for more details.
 *
 * This file was created by members of the firebird development team.
 * All individual contributions remain the Copyright (C) of those
 * individuals.  Contributors to this file are either listed here or
 * can be obtained from a CVS history command.
 *
 * All rights reserved.
 */

package org.firebirdsql.jdbc;

import java.sql.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.TimeZone;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.firebirdsql.common.FBTestBase;

import static org.firebirdsql.common.FBTestProperties.*;

/**
 * Test suite for the FBDriver class implementation.
 *
 * @author <a href="mailto:rrokytskyy@users.sourceforge.net">Roman Rokytskyy</a>
 * @version 1.0
 */
public class TestFBDriver extends FBTestBase {

    private Connection connection;
    private Driver driver;

    public TestFBDriver(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestFBDriver.class);
    }

    protected void setUp() throws Exception {
       super.setUp();
        Class.forName(org.firebirdsql.jdbc.FBDriver.class.getName());
        driver = DriverManager.getDriver(getUrl());
    }

    protected void tearDown() throws Exception
    {
       super.tearDown();
    }

    public void testAcceptsURL() throws Exception {
        assertTrue(driver.acceptsURL(getUrl()));
    }

    public void testConnect() throws Exception {
        if (log != null) log.info(getUrl());
        connection = driver.connect(getUrl(), getDefaultPropertiesForConnection());
        assertTrue("Connection is null", connection != null);
        connection.close();
    }

    public void testJdbcCompliant() {
        // current driver is not JDBC compliant.
        assertTrue(driver.jdbcCompliant());
    }
    
    /**
     * This method tests if driver correctly handles warnings returned from
     * database. We use SQL dialect mismatch between client and server to 
     * make server return us a warning.
     */
    public void testWarnings() throws Exception {
        Properties info = (Properties)getDefaultPropertiesForConnection().clone();
        info.setProperty("set_db_sql_dialect", "1");
        
        try {
	        // open connection and convert DB to SQL dialect 1
	        Connection dialect1Connection = 
	            DriverManager.getConnection(getUrl(), info);
	            
            try {
    	        Statement stmt = dialect1Connection.createStatement();
    	        
    	        // execute select statement, driver will pass SQL dialect 3 
    	        // for this statement and database server will return a warning
    	        stmt.executeQuery("SELECT 1 as col1 FROM rdb$database");
    	        
    	        stmt.close();
    	        
    	        SQLWarning warning = dialect1Connection.getWarnings();
    	        
    	        assertTrue("Connection should have at least one warning.", 
    	            warning != null);
    	            
    	        dialect1Connection.clearWarnings();
    	        
    	        assertTrue("After clearing no warnings should be present.",
    	            dialect1Connection.getWarnings() == null);
            } finally {	            
                dialect1Connection.close();
            }
        } finally {
        
	        info.setProperty("set_db_sql_dialect", "3");
	        
	        Connection dialect3Connection = 
	            DriverManager.getConnection(getUrl(), info);
	            
	        dialect3Connection.close();
        }
    }
    
    public void testDialect1() throws Exception {
        Properties info = (Properties)getDefaultPropertiesForConnection().clone();
        info.setProperty("isc_dpb_sql_dialect", "1");
        
        Connection dialect1Connection = DriverManager.getConnection(getUrl(), info);
        try {
            
            Statement stmt = dialect1Connection.createStatement();
            try {
                ResultSet rs = stmt.executeQuery("SELECT  cast(\"today\" as date) - 7 FROM rdb$database");
                assertTrue("Should have at least one row.", rs.next());
            } catch(SQLException ex) {
                ex.printStackTrace();
                fail("In dialect doublequotes are allowed.");
            } finally {
                stmt.close();
            }
            
        } finally {
            dialect1Connection.close();
        }
    }
    
    public void testGetSQLState() throws Exception {
        Connection connection = getConnectionViaDriverManager();
        
        try {
            Statement stmt = connection.createStatement();
            try {
                stmt.executeQuery("select * from");
                fail("Expected exception to be thrown");
            } catch(SQLException ex) {
                String sqlState = ex.getSQLState();
                assertNotNull("getSQLState() method does not return value", sqlState);
            } finally {
                stmt.close();
            }
        } finally {
            connection.close();
        }
    }
    
    public void testLongRange() throws Exception
    {
        Connection c = getConnectionViaDriverManager();
        try 
        {
            Statement s = c.createStatement();
            try 
            {
                s.execute("CREATE TABLE LONGTEST (LONGID DECIMAL(18) NOT NULL PRIMARY KEY)");
                try 
                {
                    s.execute("INSERT INTO LONGTEST (LONGID) VALUES (" + Long.MAX_VALUE + ")");
                    ResultSet rs = s.executeQuery("SELECT LONGID FROM LONGTEST");
                    try 
                    {
                         
                        assertTrue("Should have one row!", rs.next());
                        assertTrue("Retrieved wrong value!", rs.getLong(1) == Long.MAX_VALUE);
                    }
                    finally
                    {
                        rs.close();
                    } // end of try-finally
                    s.execute("DELETE FROM LONGTEST");
                    s.execute("INSERT INTO LONGTEST (LONGID) VALUES (" + Long.MIN_VALUE + ")");
                    rs = s.executeQuery("SELECT LONGID FROM LONGTEST");
                    try 
                    {
                         
                        assertTrue("Should have one row!", rs.next());
                        assertTrue("Retrieved wrong value!", rs.getLong(1) == Long.MIN_VALUE);
                    }
                    finally
                    {
                        rs.close();
                    } // end of try-finally
                    
                    
                }
                finally
                {
                    s.execute("DROP TABLE LONGTEST");
                } // end of try-finally
                

            }
            finally
            {
                s.close();
            } // end of try-catch
            

        }
        finally
        {
            c.close();
        } // end of try-catch
        
    }

    private static final TimeZone timeZoneUTC = TimeZone.getTimeZone("UTC");
    
    public void testDate() throws Exception
    {
        Connection c = getConnectionViaDriverManager();
        try 
        {
            Statement s = c.createStatement();
            try 
            {
                s.execute("CREATE TABLE DATETEST (DATEID INTEGER NOT NULL PRIMARY KEY, TESTDATE TIMESTAMP)");
                PreparedStatement ps = c.prepareStatement("INSERT INTO DATETEST (DATEID, TESTDATE) VALUES (?,?)");
                Calendar cal = new GregorianCalendar(timeZoneUTC);
                Timestamp x = Timestamp.valueOf("1917-02-17 20:59:31");
                try 
                {
                    ps.setInt(1, 1);
                    ps.setTimestamp(2, x, cal);
                    ps.execute();
                }
                finally
                {
                    ps.close();
                } // end of finally
                
                try 
                {
                    ResultSet rs = s.executeQuery("SELECT TESTDATE FROM DATETEST WHERE DATEID=1");
                    try 
                    {
                         
                        assertTrue("Should have one row!", rs.next());
                        Timestamp x2 = rs.getTimestamp(1, cal);
                        assertTrue("Retrieved wrong value! expected: " + x + ", actual: " + x2, x.equals(x2));
                    }
                    finally
                    {
                        rs.close();
                    } // end of try-finally
                }
                finally
                {
                    s.execute("DROP TABLE DATETEST");
                } // end of try-finally
            }
            finally
            {
                s.close();
            } // end of try-catch
        }
        finally
        {
            c.close();
        } // end of try-catch
        
    }

    
    /**
     * This test checks if transaction is rolled back when connection is closed, 
     * but still has an active transaction associated with it.
     * 
     * @throws Exception if something went wrong.
     */
    public void testClose() throws Exception {
        connection = getConnectionViaDriverManager();
        try {
            Statement stmt = connection.createStatement();
            
            stmt.executeUpdate("CREATE TABLE test(id INTEGER, test_value INTEGER)");
            stmt.executeUpdate("INSERT INTO test VALUES (1, 1)");
            
            connection.setAutoCommit(false);
            
            stmt.executeUpdate("UPDATE test SET test_value = 2 WHERE id = 1");
            
            stmt.close();
        } finally {        
            connection.close();
        }
        
        connection = getConnectionViaDriverManager();
        try {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT test_value FROM test WHERE id = 1");
            
            assertTrue("Should have at least one row", rs.next());
            assertTrue("Value should be 1.", rs.getInt(1) == 1);
            assertTrue("Should have only one row.", !rs.next());
            
            rs.close();
            stmt.executeUpdate("DROP TABLE test");
            stmt.close();
        } finally {
            connection.close();
        }
    }

    public void testDummyPacketIntervalConnect() throws Exception {
        if (log != null) log.info(getUrl());
        Properties props = getDefaultPropertiesForConnection();
        props.setProperty("soTimeout", "2000");
        connection = driver.connect(getUrl(), props);
        assertTrue("Connection is null", connection != null);
        connection.close();
    }

}

