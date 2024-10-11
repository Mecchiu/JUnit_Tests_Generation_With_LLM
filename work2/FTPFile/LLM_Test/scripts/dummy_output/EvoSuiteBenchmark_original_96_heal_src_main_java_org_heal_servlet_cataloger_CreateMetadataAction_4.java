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
		
	static Map<String, String[]> params;
	static String url;
    static Map expectedValues;
    static String testPage =  "metadata";


	static {
		params = new HashMap();
		params.put("id", new String[] { "1" });
		params.put("taxonPaths", new String[] { "Tax" });
		params.put("taxid", new String[] { "Taxon1" });
		url = "/cataloger/createMetadata";
	 	expectedValues = new HashMap();
	    expectedValues.put("id", new String[] { "1" });
	    expectedValues.put("taxid", new String[] { "Tax1" });
	}

    static void addParam(Map map, String name, String value) {
        if (name == null) {
            return;
        }
        map.put(name, value);
    }


	@Test
	public void test_1_action_requires_login() throws ServletException, SQLException, IOException, ClassNotFoundException {
		HttpServletRequest req = (HttpServletRequest) RequestDispatcher
               .getRequestDispatcher(url).getMappingInfo().getRequest();

		Class<?> clazz = Class.forName("org.heal.module.metadata.CompleteMetadataBean");

		Object instance = clazz.getConstructor(Map.class)
               .newInstance(params);

        CompleteMetadataBean cmb = (CompleteMetadataBean) instance;

        checkValues(cmb, url, expectedValues, clazz);
        assertEquals(0, cmb.getCategories().size());

        Map map = new HashMap();

        Method name = cmb.getClass().getMethod("getId");
        addParam(map, "id", valueToString(cmb.getId()));
        addParam(map, "taxid", valueToString(cmb.getTaxid()));

        String actual = valueToString(name.invoke(cmb));
        String expected = url + "/?id=" + requestUuid();

        assertEquals(expected, actual);
    }

	@Test(expected = RuntimeException.class)
	public void test_2_action_requires_login_nonString() throws ServletException, IOException, ClassNotFoundException {
		HttpServletRequest req = (HttpServletRequest) RequestDispatcher
               .getRequestDispatcher(url).getMappingInfo().getRequest();

		CompleteMetadataBean cmb = (CompleteMetadataBean) Class.forName("org.heal.module.metadata.CompleteMetadataBean").newInstance();
		mapToCompleteMetadataBean(null, null);
		addParam(map, "id", valueToString(cmb.getId()));

		String actual = valueToString(Class.forName("org.heal.module.metadata.CompleteMetadataBean").getConstructor(Map.class).newInstance(null));
		String expected = url + "/?id=" + requestUuid();

		assertEquals(expected, actual);
	}

	@Test
	public void test_3_action() throws ServletException, SQLException, IOException, ClassNotFoundException {

        Class<?> clazz = Class.forName("org.heal.module.metadata.CompleteMetadataBean");

		HttpServletRequest req = (HttpServletRequest) RequestDispatcher
              .getRequestDispatcher(url).getMappingInfo().getRequest();
		Object instance = clazz.getConstructor(Map.class).newInstance(params);

		CompleteMetadataBean cmb = (CompleteMetadataBean) instance;
		checkValues(cmb, url, expectedValues, clazz);

	}

	@Test
	public void test_4_action_without_id() throws ServletException, SQLException, IOException {

        HttpServletRequest req = (HttpServletRequest) RequestDispatcher
              .getRequestDispatcher(url).getMappingInfo().getRequest();

        CompleteMetadataBean cmb = getCompleteMetadata();

        checkValues(cmb, url, expectedValues, clazz, "id", null);

    }

	@Test
	public void test_5_action_without_id_without_taxid() throws ServletException, SQLException, IOException {

        HttpServletRequest req = (HttpServletRequest) RequestDispatcher
              .getRequestDispatcher(url).getMappingInfo().getRequest();

        CompleteMetadataBean cmb = getCompleteMetadata();

        checkValues(cmb, url, expectedValues, clazz, "id", null);

        mapToCompleteMetadataBean(null, null);

    }

	static void mapToCompleteMetadataBean(HttpSession session, String id) throws SQLException {
		CompleteMetadataBean cmb = new CompleteMetadataBean();

        cmb.setId(id);

}
}