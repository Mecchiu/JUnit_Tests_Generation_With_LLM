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

	private static void createCompleteMetadataBean(String name) {
		CompleteMetadataBean completeMetadataBean = new CompleteMetadataBean();
		CompleteMetadataBean toBeDeletedCompleteMetadataBean = new CompleteMetadataBean();
		Map<String, Object> completeMetadataBeanAndProperties = new HashMap<>();
		completeMetadataBeanAndProperties.put("id", name);
		completeMetadataBeanAndProperties.put("created", String.format("2013-06-08T12:52:57.000"));
		completeMetadataBeanAndProperties.put("category", name);
		completeMetadataBean.setCompleteMetadataBeanAndProperties(completeMetadataBeanAndProperties);
		completeMetadataBeanAndProperties.clear();
		completeMetadataBeanAndProperties.put(MetadataDAO.FULLMATCH, new Integer(1));
		completeMetadataBeanAndProperties.put(MetadataDAO.SUMMATCH, new Integer(1));
		completeMetadataBeanAndProperties.put(MetadataDAO.LATESTVERSION, new Integer(1));
		completeMetadataBean.setCompleteMetadataBeanAndProperties(completeMetadataBeanAndProperties);
		CompleteMetadataBean completeMetadataBeanFromServer = new CompleteMetadataBean();
		Map<String, Object> completeMetadataBeanAndPropertiesFromServer = completeMetadataBeanFromServer.getCompleteMetadataBeanAndProperties();
		completeMetadataBeanAndPropertiesFromServer.put(MetadataDAO.FULLMATCH, new Integer(3));
		completeMetadataBeanAndPropertiesFromServer.put(MetadataDAO.LATESTVERSION, new Integer(3));
		completeMetadataBeanAndPropertiesFromServer.put(MetadataDAO.SUMMATCH, new Integer(5));
		completeMetadataBeanAndPropertiesFromServer.put(MetadataDAO.NODECOUNT, 1009);
		completeMetadataBeanAndPropertiesFromServer.put(MetadataDAO.UNKNOWN1, new Integer(50000));
		completeMetadataBeanAndPropertiesFromServer.put(MetadataDAO.UNKNOWN2, new Integer(20000));
		completeMetadataBeanAndPropertiesFromServer.put(MetadataDAO.UNKNOWN3, new Integer(20001));
		completeMetadataBeanAndProperties.putAll(completeMetadataBeanAndPropertiesFromServer);
		completeMetadataBean.setCompleteMetadataBeanAndProperties(completeMetadataBeanAndProperties);
		List<Map<String, Object>> completeMetadataBeansList = new ArrayList<>();
		completeMetadataBeansList.add(completeMetadataBean.getCompleteMetadataBeanAndProperties());
		createCompleteMetadataBean(name);
		completeMetadataBeanAndProperties.remove(MetadataDAO.FULLMATCH);
		completeMetadataBeanAndProperties.remove(MetadataDAO.LATESTVERSION);
		completeMetadataBeanAndProperties.remove(MetadataDAO.SUMMATCH);
		completeMetadataBeanAndProperties.remove(MetadataDAO.NODECOUNT);
		completeMetadataBeanAndProperties.remove(MetadataDAO.UNKNOWN1);
		completeMetadataBeanAndProperties.remove(MetadataDAO.UNKNOWN2);
		completeMetadataBeanAndProperties.remove(MetadataDAO.UNKNOWN3);
		Map<String, Object> toBeDeletedCompleteMetadataBeanAndProperties = completeMetadataBeanAndProperties.get(MetadataDAO.toBeDeletedCompleteMetadataBean);
		toBeDeletedCompleteMetadataBeanAndProperties.remove(MetadataDAO.FULLMATCH);
		toBeDeletedCompleteMetadataBeanAndProperties.remove(MetadataDAO.TZID);
		completeMetadataBeanAndProperties.remove(MetadataDAO.FULLMATCH);
		completeMetadataBeanAndPropertiesAndServer.put(MetadataDAO.toBeDeletedCompleteMetadataBean, toBeDeletedCompleteMetadataBean);
		createCompleteMetadataBean(name);	
		System.out.println("Totally processed " + completeMetadataBeansList.size() + " complete metadata beans");
		List<String> nonDeletedCompleteMetadataBeans = completeMetadataBeansList.stream()
				.filter(completeMetadataBean ->!completeMetadataBean.getCompleteMetadataBeanServer().getCompleteMetadataBeanAndProperties().containsKey(MetadataDAO.toBeDeletedCompleteMetadataBean.getCompleteMetadataBeanAndProperties().get(MetadataDAO.FULLMATCH)))
				.map(CompleteMetadataBeanDAO::getIncompleteMetadataBeanAndName)
				.filter(x ->!x.getCompleteMetadataBeanServer().getCompleteMetadataBe