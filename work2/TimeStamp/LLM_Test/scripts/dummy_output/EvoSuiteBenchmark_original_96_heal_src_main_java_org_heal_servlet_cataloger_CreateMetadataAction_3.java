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
	 * This unit test case provides a set of tests for both
	 * {@link CreateMetadataAction} and {@link CreateMetadataBean}.
	 */
	@Test
	public void testActions() throws IOException, SQLException {
		CompleteMetadataBean cmb = new CompleteMetadataBean();
		MetadataDAO dao = new MetadataDAO();
		final Map<String, String> params = new HashMap<>();
		params.put(CompleteMetadataBean.IS_COLLECTABLE, "true");
		params.put(CompleteMetadataBean.IS_FASTA_COLLECTABLE, "true");
		params.put(CompleteMetadataBean.IS_CATALOG_COLLECTABLE, "true");
        cmb.setCatsAndTaxaMap(new HashMap<String, List<TaxonBean>>());
		cmb.setCompleteMetadataBean(cmb);

		boolean actionRequiresLogin = CreateMetadataAction.actionRequiresLogin();
		assertTrue("createMetadataAction() requires login.", actionRequiresLogin);
		assertEquals("Expected call return", actionRequiresLogin, cmb.requireLogin());
		assertEquals("Expected call return", cmb.getCompleteMetadataBean().getCatsAndTaxaMap(), cmb.getCompleteMetadataBean().toMap());
        /*
        * First, try creating a metadata record but not passing in an IS_FASTA_COLLECTABLE or
        * IS_CATALOG_COLLECTABLE flag.  The test should fail if this creates a metadata record
        * without those parameters.
        */
        {
            boolean action2Required = true;
            try {
                    String[] catsAndTaxa = new String[]{"A", "B"};
                    cmb = new CompleteMetadataBean(null, 1, catsAndTaxa, false);
                    cmb = (CompleteMetadataBean) dao.create(cmb, params);
                    
                fail();
            } catch(IllegalArgumentException e) {
                action2Required = false;
            }
            
			if (!action2Required) {
            assertEquals("Expected call return", actionRequiresLogin, cmb.requireLogin());
            }
		}
		
        /*
        * Second, try creating a metadata record but passing in an IS_FASTA_COLLECTABLE or
        * IS_CATALOG_COLLECTABLE flag.  The test should fail if this creates a metadata record
        * and an IS_FASTA_COLLECTABLE flag was specified.
        */
        try {
            cmb = new CompleteMetadataBean(null, 1, null, true);
            cmb = (CompleteMetadataBean) dao.create(cmb, params);
            
        fail();
        } catch(IllegalArgumentException e) {
            
        }
	}
}