// ModifyMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyMetadataAction}.
* It contains one unit test case for the {@link ModifyMetadataAction#actionRequiresLogin()} method.
*/
class ModifyMetadataActionTest {
		@Test
		void
				testPerform(@SuppressWarnings("all")  HttpServletRequest request,
						@SuppressWarnings("all")  HttpServletResponse response)
						throws IOException, ServletException {

			Map<String, String> params = (Map<String, String>) request.getParameterMap().get(
					"operation");

			CompleteMetadataBean metadata =
					new CompleteMetadataBean("TestCatalog", "TestOperation",
							Collections.singleton("http://localhost:8080/catalog/catalog/TestCatalog?action=operation.operation"),
							null);

			final String modifiedOp = (String) params.get("type");
//			final String operation="operation";
			final String modifiedType = "test";

			final CompleteMetadataBean finalMetadata = metadata;
			final String modifiedTypeParam = (String) params.get("type");

			Map<String, String> paramsIn = (Map<String, String>) request.getParameterMap();
			String original = (String) paramsIn.get("original");
			if (original.isEmpty()){
				original = request.getParameter("original");
			}else{
				assertFalse("Missing param 'original'", original.isEmpty());
			}

			ModificationMetaBean metaBean =
					new ModificationMetaBean(original, finalMetadata,
							modifiedOp);

			final Map<String, String> modifiedOpParams = new HashMap<String, String>();
			modifiedOpParams.put("type", modifiedType);
			modifiedOpParams.put("original", original);
			Map<String, String> modifiedTypeMap= modifiedOpParams;
			if (modifiedTypeParam!= null)
				modifiedTypeMap = new HashMap<String, String>();

			modifyMetaBean(metaBean, modifiedOp, modifiedTypeMap);

			assertEquals("Type not modified", modifiedType, metaBean.getType());
			assertEquals("Original not modified", original, metaBean.getOriginal());

			authValidator(request); // AuthenticationTools.validateParameters(request)

			modifyMetaBean(metaBean, modifiedOp, modifiedTypeMap);

			assertEquals("Type modified", modifiedType, metaBean.getType());
			assertEquals("Original modified", original, metaBean.getOriginal());
		}

		private void modifyMetaBean(ModificationMetaBean original, String modifiedOp, Map<String, String> modifiedTypeMap) throws ServletException, IOException {
			original.setContextURL(null);
			original.clearContributors();
			original.clearCopyrightHolders();
			original.clearControlledVocabulary();
			original.clearRequirement();

			original.saveMetadata();

			HttpServletRequest request = AuthenticationTools.getHttpServletRequest(response);
			request.setAttribute(MetadataRecordModifier.MODIFIER_ATTR, new ModifyMetadataAction().getClass(),
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.NAME_ATTR, "TestCatalog",
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.TYPE_ATTR, modifiedOp,
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.CURRENT_URL_ATTR, original.getContextURL(),
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.CONTENT_TYPE_ATTR, original.getMetadataType(),
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.CONTENT_LINKER_ATTR, modifiedOp,
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.CONTENTS_OF_CONTENT_LINKER_ATTR, modifiedTypeMap,
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.OPERATION_NAME_ATTR, original.getOperationName(),
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.CREATOR_NAME_ATTR, original.getCreateOrUpdateUser(),
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.CREATOR_USER_ATTR, original.getCreateOrUpdateUser(),
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.USERS_WITH_OWNERS_ATTR, original.getUsers(),
					new HashMap<String, String>());
			request.setAttribute(MetadataRecordModifier.USERS_ATTR, Collections.singleton(original.getUser()),
					new HashMap<String, String>());
		}
}