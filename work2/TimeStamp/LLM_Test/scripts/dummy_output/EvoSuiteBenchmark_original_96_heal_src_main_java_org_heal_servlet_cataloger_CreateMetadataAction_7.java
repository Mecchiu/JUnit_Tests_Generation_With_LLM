// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains one unit test case for the {@link CreateMetadataAction#actionRequiresLogin()} method.
*/
class CreateMetadataActionTest {
		
	/**
	 * We pass two objects in a map of <key> -> <value>
	 */
	private static final Map<String, String> T_OBJECTS;
		
	static {
		T_OBJECTS = new HashMap<String, String>();
		
		T_OBJECTS.put("taxon", "taxon");
		T_OBJECTS.put("taxonPathSet", "taxonPath");
		T_OBJECTS.put("taxonPathSetPath1", "taxonPathSetPath1");
		T_OBJECTS.put("taxonPathSetPath2", "taxonPathSetPath2");
		T_OBJECTS.put("taxonPathSetPath3", "taxonPathSetPath3");

		T_OBJECTS.put("taxonPathList", "taxonPathList");
		T_OBJECTS.put("taxonPathListPath1", "taxonPathListPath1");
		T_OBJECTS.put("taxonPathListPath2", "taxonPathListPath2");
		T_OBJECTS.put("taxonPathListPath3", "taxonPathListPath3");

		T_OBJECTS.put("taxonPathSetList", "taxonPathSetList");
		T_OBJECTS.put("taxonPathList", "taxonPathListList");
		T_OBJECTS.put("taxonPathListPath1", "taxonPathListPath1");

		T_OBJECTS.put("completeMetadataBean", "completeMetadataBean1");
		T_OBJECTS.put("taxonBean_taxonPathSet", "taxonBean_taxonPathSet");
		T_OBJECTS.put("taxonBean_taxonPathList", "taxonBean_taxonPathList");

		T_OBJECTS.put("completeMetadataBean", "completeMetadataBean2");
		T_OBJECTS.put("taxonBean_taxonBean_completeMetadataBean", "taxonBean_taxonBean_completeMetadataBean");
		T_OBJECTS.put("taxonBean_taxonBean_completeMetadataBean", "taxonBean_taxonBean_completeMetadataBean");
		T_OBJECTS.put("taxonBean_completeMetadataBean", "completeMetadataBean");

		T_OBJECTS.put("taxaBean_completeMetadataBean", "taxaBean_completeMetadataBean");
		T_OBJECTS.put("taxaBean_taxaPathSet", "taxaBean_taxaPathSet");
		T_OBJECTS.put("taxaBean_taxaList", "taxaBean_taxaList");
			        
		T_OBJECTS.put("completeMetadataBean", new CompleteMetadataBean());
		T_OBJECTS.put("taxaBean_completeMetadataBean", new CompleteMetadataBean());
		T_OBJECTS.put("taxaBean_taxaBean_completeMetadataBean", new CompleteMetadataBean());
		T_OBJECTS.put("taxaBean_taxaBean_completeMetadataBean", new CompleteMetadataBean());
		
	}
	
	/**
	* Create new database connection from test file and return it.
	* @param conn
	* @return
	*/
	public static DatabaseConnection getConnection(DatabaseConnection conn){
		try {
			conn.getDataSource().closeAll();
		} catch (SQLException e) {
		}
		
		/*
		** test new metadata source
		*/
		ConnectionFactory connectionFactory = new ConnectionFactory(conn);

		try {
			conn.initialize(connectionFactory);
			Connection connection = connectionFactory.create();
			conn.setConnection(connection);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return  conn;
	}

	/**
	* Create a new database connection and return it.
	* @param conn
	* @return
	*/
	public static DatabaseConnection getConnection(DatabaseConnection conn){
		DatabaseConnection conn;
		try {
			conn = new DatabaseConnection(getConnection(conn));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	* @return
	*/
	public static DatabaseConnection getConnection(){
		DatabaseConnection conn;
		try {
			conn = new DatabaseConnection(getConnectionFromTestFile(T_OBJECTS));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	* @return
	*/
}