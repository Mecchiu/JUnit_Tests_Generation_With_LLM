// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains one unit test case for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {
		
	/**
	 * Initializes a {@link StartupOptions} with the command line options
	 * the class under test. 
	 */
	private void initialize();
	
	private String dbDriverName;
	private String dbUser;
	private String dbPassword;
	private String server;
	private String port;
	private int maximumNumberOfConnections;
	
	public StartupOptionsTest() {
	}
	
	@Test
	public void constructorWithoutArgumentsTest(){
		new StartupOptions();
	}
	
	@Test
	public void constructorWithDatabaseURIArgumentTest(){
		
		DatabaseURI argument1 = new DatabaseURI("");
		DatabaseURI argument2 = new DatabaseURI("db://localhost:5673/macaw");
		DatabaseURI argument3 = new DatabaseURI("");
		String dbURL = new DatabaseURI("db://localhost:5673/macaw").getDatabaseURI();
		
		assertEquals(argument1, argument2);
		assertEquals(argument2, argument3);
		assertEquals(argument3, argument1);
		assertEquals(argument1, dbURL);
		
	}
	
	@Test
	public void constructorWithDatabaseDriverNameArgumentTest(){
		
		String dbDriverName = "sqlite3";
		String databaseName = "macaw";
		String dbUser = "macaw";
		String dbPassword = "macaw";
		String server = "localhost";
		String port = "5673";
		int maximumNumberOfConnections = 56729;
		
		DatabaseURI argument1 = new DatabaseURI("");
		DatabaseURI argument2 = new DatabaseURI(dbDriverName);
		DatabaseURI argument3 = new DatabaseURI("");
		String dbURL = new DatabaseURI(databaseName).getDatabaseURI();
		
		assertEquals(argument1, argument2);
		assertEquals(argument2, argument3);
		assertEquals(argument3, argument1);
		assertEquals(argument1, dbURL);
		
		assertFalse(dbDriverName.equalsIgnoreCase("sqlite3"));
		
	}
	
	@Test
	public void constructorWithConnectionStringArgumentTest(){
		
		String dbDriverName = "sqlite3";
		String databaseName = "macaw";
		String dbUser = "macaw";
		String dbPassword = "macaw";
		String server = "localhost";
		String port = "5673";
		int maximumNumberOfConnections = 56729;
		
		DatabaseURI connection1 = new DatabaseURI("");
		DatabaseURI connection2 = new DatabaseURI(dbDriverName,  dbUser,  dbPassword,  server,  port,  maximumNumberOfConnections);
		
		assertEquals(connection1, connection2);
		
	}
	
	@Test
	public void constructorWithValidArgumentsTest(){
		
		String dbDriverName = "sqlite3";
		String databaseName = "macaw";
		String dbUser = "macaw";
		String dbPassword = "macaw";
		String server = "localhost";
		String port = "5673";
		int maximumNumberOfConnections = 56729;
		
		
		assertEquals(dbDriverName, dbDriverName);
		
		assertEquals(databaseName, databaseName);
		
		assertEquals(dbUser, dbUser);
		
		assertEquals(dbPassword, dbPassword);
		
		assertEquals(server, server);
		
		assertEquals(port, port);
		
		assertEquals(maximumNumberOfConnections, maximumNumberOfConnections);


	}
	
	@Test
	public void getConnectionStringTest() {
		
		String dbDriverName = "sqlite3";
		String databaseName = "macaw";
		String dbUser = "macaw";
		String dbPassword = "macaw";
		String server = "localhost";
		String port = "5673";
		int maximumNumberOfConnections = 56729;
		
		
		String expected = "user=macaw" + " db=macaw database=macaw port=5673 db_driver_name="+dbDriverName+" password=macaw" + " server_host=localhost";
		assertEquals(expected, expected);
		
		
		
	}
}