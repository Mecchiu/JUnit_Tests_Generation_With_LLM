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

	static final String RESOURCE_DIRECTORY 		= "/WEB-INF/"



		+ "cataloger/";
	static final String INITIAL_NAME 				= "InitialName";
	static final String NAME 						= "name";
	static final String FULL_PATH 					= "FullPath";
	static final String FULL_NAME 					= "FullName";
	static final String LATITUDE 					= "Latitude";
	static final String LONGITUDE 					= "Longitude";
	static final String LOST 						= "Lost";
	static final String PROBABILITIES 				= "Probabilities";
	static final String START_DATE 				= "StartDate";
	static final String END_DATE 					= "EndDate";
	static final String YEAR 						= "Year";
	static final String TIME_ZONE 					= "TimeZone";
	static final String STREET 					= "Street";
          static final String CITY  					= "City";
          static final String STATE_PROVINCE 			= "StateProvince";
          static final String CITY 						= "City";
          static final String STATE_CODE 				= "State";

  static final Map<String,String> FORM_PARAMETERS 	= new HashMap<String,String>();
  static final Map<String,List<String>> FORM_PARAMETERS_SINGLE_VALUE = new HashMap<String,List<String>>();
  static final String FORM_PARAMETER_STRING 	= "value";
  static final String FORM_PARAMETER_BOOLEAN  = "boolean";
  static final String FORM_PARAMETER_MAP	= "parameters";
  static final String FORM_PARAMETER_ARRAY	= "array";

  static final Map<String,String> POST_PARAMETERS 	= new HashMap<String,String>();
  static final Map<String,List<String>> POST_PARAMETERS_SINGLE_VALUE = new HashMap<String,List<String>>();
  static final String POST_PARAMETER_STRING 	= "value";
  static final String POST_PARAMETER_BOOLEAN  = "boolean";
  static final String POST_PARAMETER_MAP	= "parameters";
  static final String POST_PARAMETER_ARRAY	= "array";


  /**
	 * Create empty metadata record.
	 * 
	 * @postcondition  Check if metadata record is not found
	 */
	public void fillMetadataRecordWithEmptyData() {
		List<CompletionBean> result = MetaDataDAO.getMetadataRecordFromResource
			(this.getClass().getName()
			, ResourceType.MetadataRecord);
		assertNotNull(
			"Resource does not contain this record: "+this.getClass().getName(),
			result);
		assertTrue(
			"Resource does not contain this record",
			result.size() == 0);
	}

	/**
	 * Fill metadata record with data from POST parameter.
	 * 
	 * @param recordId 				String id of the metadata record
	 * @param fields 					Map of field values
	 * @param POST_PARAMETERS_SINGLE_VALUE  - POST parameter for individual field value 
	 * @return  				List of completion beans
	 * @throws NameNotFoundException 	If record found but resource does not exist
	 * @throws SQLException 			If database is not available
	 * @throws ClassNotFoundException 	If resource classnot found
	 * @throws Exception					If some other unexpected exception occured
	 */
	public List<CompletionBean> fillMetadataRecordWithPostParamters (
		int recordId,
		Map<String, String> fields,
		Map<String, List<String>> POST_PARAMETERS_SINGLE_VALUE ) 
			throws ClassNotFoundException, NameNotFoundException, SQLException,
			ClassNotFoundException, Exception {
		List<String> values = POST_PARAMETERS_SINGLE_VALUE.get(String.valueOf(recordId));
		List<CompletionBean> result = new ArrayList<CompletionBean>(values.size());
		for (String v : values) {
		  CompletionBean bean = new CompletionBean();
		  bean.setName(v);
		  bean.setResource(this.getClass().getName());
		  bean.setResourceID(recordId);
		  try {
		    bean.setType(this.getClass().getName());
		  }
		  catch (ClassNotFoundException e) {
		    e.printStackTrace();
		  }
		  try {
		    bean.setValue(v);
		  }
		  catch (ClassNotFoundException e) {
		    e.printStackTrace();
		  }
		  if (StringUtils.isNotEmpty(this.getClass().getName())) {
			try {
				bean.setParameter(this.getClass().getName(), fields);
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		  }
		  result.add(bean);
		}
		return result;
	}

  /**
	 * Test creating metadata record from POST parameter, which matches the POST_PARAMETERS_SINGLE_VALUE map with fields: {0} as values.
	 * 
	 * @throws NameNotFoundException 	If resource found but no metadata record found
	 * @