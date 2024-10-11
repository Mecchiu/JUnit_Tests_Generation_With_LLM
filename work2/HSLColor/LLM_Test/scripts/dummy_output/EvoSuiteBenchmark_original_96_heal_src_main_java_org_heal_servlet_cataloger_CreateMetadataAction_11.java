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
		private static final String USER_ID = "userid";
        private static final String LABEL = "label";
        private static final String ID = "id";
        private static final String DATE_BEFORE = "dateBefore";
        private static final String DATE_AFTER = "dateAfter";

        public static void clearIds(CompleteMetadataBean cmb) throws ServletException {
            Date date = (Date) cmb.getPropertyValues().get(DATE_BEFORE);
            if (date!= null && date.getTime()!= 0d) {
                Iterator<Map.Entry<String, Object>> entries = cmb.getProperties().entrySet().iterator();
                while (entries.hasNext()) {
                    Map.Entry<String, Object> entry = entries.next();
                    final Map map = new HashMap();
                    map.put(entry.getKey(), entry.getValue());
                    cmb.setProperty(date.getTime(), map);
                }
            }
        }


		@Test
		public void actionRequiresLogin() throws ServletException {
			CompleteMetadataBean cmb = new CompleteMetadataBean();
			MetadataDAO mdDAO = new MetadataDAO();
			// We must not clear any ids from an existing complete object
			clearIds(cmb);
			cmb.setLabel(LABEL);
			cmb.setProperty(DATE_BEFORE, 0);
			cmb.setProperty(DATE_AFTER, 0);
			cmb.setPropertyValues(Map.of("name", "foo", "value1", "test1"));
			cmb.setPropertyValues(Map.of("name", "foo", "value2", "test2"));
			MetadataDAO mdDAO2 = new MetadataDAO(true, true);
			MetadataDAO mdDAO3 = new MetadataDAO(true, true);
			CompleteMetadataBean md3 = mdDAO3.queryCompleteObject("test3");

			CompleteMetadataBean md4 = mdDAO.queryCompleteObject("test4", cmb);
			Map<String, Object> msMap = md4.getPropertyValues();
			Iterator<Map.Entry<String, Object>> entries = msMap.entrySet().iterator();
			while (entries.hasNext()) {
				Map.Entry<String, Object> entry = entries.next();
				String key = entry.getKey();
				Object value = entry.getValue();
				assertTrue("Field 'name' was not present", msMap.isEmpty() && msMap.containsKey(key));
				assertTrue("Field 'value1' was not present", msMap.isEmpty() && msMap.get(key) instanceof Map);
				assertTrue("Field 'value' was not present", msMap.get(key) instanceof Map);
				assertTrue("Wrong type for 'value'", value instanceof Map);
				Map map = (Map)value;
				assertTrue("Wrong type for 'value1'", map.get("value1") instanceof String);
				assertTrue("Wrong type for 'value2'", map.get("value2") instanceof Map);
				cmb.setProperty(value.toString(), msMap);
				mdDAO2.executeUpdate("update test3 set 'value' = value1 where name = 'foo'");
				cmb.setProperty(value.toString(), msMap);
				mdDAO3.updateCompleteObject("test3", cmb);
			}
			for(TaxonBean tb : mdDAO3.queryAllTaxons()) {
				cmb.setLabel(tb.getLabel());
				cmb.setProperty("dateBefore", date(2001, 9, 20).getTime());
				cmb.setProperty("dateAfter", date(2001, 9, 19).getTime());
			}
			cmb.setPropertyValues(List.of(msMap));
			CreateMetadataAction acmd = new CreateMetadataAction();
			cmb.setPropertyValues(Map.of(ID, cmb.getId()));
			Action action = acmd.actionRequiresLogin();
			assertFalse("Field 'ID' cannot be null", action.actionRequiresLogin());

            // We must not clear ids from an existing complete object
 			clearIds(cmb);
			cmb.setLabel(LABEL);
			cmb.setProperty(DATE_BEFORE, 0);
			cmb.setProperty(DATE_AFTER, 0);
			List<Map> valsList = List.of(cmb, md1, md2, md3, md4);
            assertEquals(valsList.size(), 2);

			valsList.remove(0);
			valsList.remove(1);


			Map metadataBean = mdDAO.queryAllMetadataBeans(cmb);

// 			if (metadataBean.size() ==0) {
// 				LOGGER.error("Metadata beans cannot be empty");
// 			}

}
}