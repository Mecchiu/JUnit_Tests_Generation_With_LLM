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
		
    // -------------------------------------------------------------------------
    /**
     * We do not have an {@link HttpServletRequest} instance yet, so we will
     * initialize it with <em>an empty</em> {@link HttpSession}.
    */
    private static final HttpServletRequest request = new HttpServletRequest();
    private static final HttpSession session = request.getSession();
    // -------------------------------------------------------------------------

    /**
     * @return <code>true</code>
     */
    static boolean actionRequiresLogin() {
        return session!= null && session.getAttribute(AuthenticationTools.AUTH_TOKEN)!= null;
    }

    // -------------------------------------------------------------------------
    /**
     * This method performs the <code>perform</code> request, which we have
     * initiated in the constructor.
     *
     * @param cmb
    * @return a {@link Map} from <code>id</code> to <code>class</code>
	 * represented as a {@link List};
     */
    private static Map createMetadataFromCompleteBean(CompleteMetadataBean cmb) throws SQLException {
		return new HashMap();
	}

    private static Map createMetadataFromList(List objects) throws ServletException {
		return new HashMap();
    }

    // -------------------------------------------------------------------------
    /**
     * This method performs the action, which we have initialized in the
     * constructor, without a {@link HttpSession} to keep the {@link HttpServletRequest}s
     * unchanged.
     *
     * @see Action#actionRequiresLogin()
     */
    private static void clearIds(CompleteMetadataBean cmb) throws ServletException {
        clearIdsFromList(cmb.getList());
        cmb.clearVersion();
        cmb.clearId();
    }

    private static void clearIdsFromList(List objects) throws ServletException {
		Iterator iterator = objects.iterator();
		while (iterator.hasNext()) {
            CompleteMetadataBean cmb = (CompleteMetadataBean) iterator.next();
            cmb.clearVersion();
            cmb.clearId();
        }
    }

    private static void clearRequestFields(RequestDispatcher rd) {
        Set<String> keys = rd.getRequestDispatcherNames();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
        	String key = (String)iterator.next();
        	if (!rd.isRenderParameter(key)) {
        		rd.forward(request, response, this, key);
        	}
        }
    }

    // -------------------------------------------------------------------------
    /**
     * Tests {@link CreateMetadataAction#actionRequiresLogin()}
     */
    @Test
    public void test() throws ServletException {
        assertFalse(actionRequiresLogin());
    }

    // -------------------------------------------------------------------------
    /**
     * This method performs the action, which we have initialized in the
     * constructor, without a {@link HttpSession}. To be tested.
     */
    private static Object action(int taxon, String id, String method, Map parameters) throws SQLException {
        CompleteMetadataBean cmb = new CompleteMetadataBean();
        cmb.setVersion(5);
        cmb.setMethod(method);
        MetadataDAO mdDAO = new MetadataDAO(TaxonDAO.getInstance());
        cmb.setId(new Long(TaxonDAO.getInstance().getTaxonId(taxon)));
        Iterator iterator = parameters.values().iterator();
        while (iterator.hasNext()) {
            cmb.addParameter((String) iterator.next());
        }
        cmb.setDate(new Date());
        CompleteMetadataBean cmb2 = createMetadataFromCompleteBean(cmb);
        // Remove the id, so that the record is not deleted
        cmb2.setVersion(5);
        // Create the correct taxon path
        TaxonPathBean taxonPath = new TaxonPathBean();
        taxonPath.setTaxon("C");
        Iterator iterator2 = cmb2.getTaxonPaths().iterator();
        while (iterator2.hasNext()) {
            taxonPath.addPath(iterator2.next());
        }
        return mdDAO.createMetadata(cmb2);
    }

    private static Method setMethod;

    private static Map getParameters(Map<String,String> parameters) {
        Map<String, String> toReturn = new HashMap<String, String>();
        Iterator iterator = parameters.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            toReturn.put((String) entry.getKey(), (String) entry.getValue());
        }
    return toReturn;
}
}