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

	/**
	 * Test to ensure that the implementation of {@link ModifyMetadataAction}
	 * has the correct parameters from {@code MetadataRecorder} passed to the {@link Action}
	 * as a {@code parameterMap}.
	 */
	@Test
	public void testModifyMetadata() {

        String data = "data=" +
            "metadata=" +
            "metadata_contributor=" +
            "metadata_copyrightHolder=" +
            "metadata_controlledVocabulary=" +
            "metadata_requirement=" +
            "metadata_requirements=" +
            "metadata_contributor_license_holder=";

        CompleteMetadataBean expectedMetadata = new CompleteMetadataBean(
            "metadata",
        createMap(data),
        "metadata_contributor",
        "metadata_copyrightHolder",
        "metadata_controlledVocabulary",
        "metadata_requirement",
        "metadata_requirements",
        "metadata_contributor_license_holder"
            );
		
        CompleteMetadataBean modifiedMetadata = ModifyMetadataAction.actionRequiresLogin()?
            new CompleteMetadataBean(
                "metadata",
                createMap("data=" +
                    "metadata=" +
                    "metadata_contributor=" +
                    "metadata_copyrightHolder=" +
                    "metadata_controlledVocabulary=" +
                    "metadata_requirement=" +
                "metadata_requirements="),
                "metadata_contributor",
                "metadata_copyrightHolder",
                "metadata_controlledVocabulary",
                "metadata_requirement",
                "metadata_requirements",
                "metadata_contributor_license_holder"
                ) :
            expectedMetadata;

        Map<String, Object> parameterMap = new HashMap<String, Object>();

        assertEquals("data=metadata=metadata_contributor=\"metadata_copyrightHolder=metadata_controlledVocabulary=metadata_requirement=metadata_requirements=metadata_contributor_license_holder=metadata_contributor_license_holder\"",
                    AuthenticationTools.getRequestParameterMapString(
                        parameterMap,
                    createRequest(),
                    createResponse()));

        assertEquals(expectedMetadata, modifiedMetadata);
        // assertEquals(expectedMetadata, modifiedMetadata);

	}

	/**
	 * Create a {@link Map} containing the data from the {@code request} to be passed as parameters 
	 * to {@code createRequest}.
	 *
	 * @return the {@link Map} created by {@code createRequest}
	 * @throws ServletException   if the request is unsuccessfull
	 * @throws IOException        if the request fails to be made
	 */
	private Map<String, Object> createMap(String data) throws ServletException, IOException {

        return Collections.singletonMap("request", data);
	}

	/**
	 * Creates a {@link HttpServletRequest} with the {@code expectedParameters} and returns it.
	 *
	 * @return the {@link HttpServletRequest} created by {@code createRequest}
	 */
	private HttpServletRequest createRequest() {

        return Config.getInstance().newRequest();
	}

	/**
	 * Creates a {@link HttpServletResponse} with the {@code expectedParameters} and returns it.
	 *
	 * @return the {@link HttpServletResponse} created by {@code createResponse}
	 */
	private HttpServletResponse createResponse() {

        return Config.getInstance().newResponse();
	}

	/**
	 * Creates a {@link ServletException} and returns it.
	 *
	 * @return the {@link ServletException} created by {@code createException}
	 */
	private ServletException createException() {

        return Config.getInstance().newException();
	}

	/**
	 * Create a {@link CompleteMetadataBean} from the {@code testParameters}.
	 *
	 * @param testParameters an additional {@code Map} of the {@code request} parameters
	 *                 as an {@code Entry} of type {@code String}
	 * @return a {@link CompleteMetadataBean} constructed from {@code testParameters}
	 */
	private static CompleteMetadataBean createMetadataBean(Map<String, Object> testParameters) {

        CompleteMetadataBean metadata = new CompleteMetadataBean(
                "metadata",
                createMap(makeData(testParameters)),
                "metadata_contributor",
                "metadata_copyrightHolder",
                "metadata_controlledVocabulary",
                "metadata_requirement",
                "metadata_requirements",
                "metadata_contributor_license_holder"
                );
        log.debug(metadata);
        return metadata;
	}
	
	/**
	 * @return a {@link Map} of the test cases parameters.
	 */
	private static Map<String,Object> makeData(Map<String, Object> parameters) {
	
		Map<String, Object> modifiedParameters = new HashMap<String, Object>();
		
		modifiedParameters.put("metadata", parameters.get("metadata"));
		modifiedParameters.put("metadata_contributor", parameters.get("metadata_contributor"));
		modifiedParameters.put("metadata_copyrightHolder", parameters.get("metadata_copyrightHolder"));
		modifiedParameters.put("metadata_controlledVocabulary", parameters.get("metadata_controlledVocabulary"));
		modifiedParameters.put("metadata_requirement", parameters.get("metadata_requirement"));
		modifiedParameters.put("metadata_requirements", parameters.get("metadata_requirements")