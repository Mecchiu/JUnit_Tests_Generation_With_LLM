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
		* Tests that login is required and the {@link Action} is executed.
		*/
	@Test
	void testLoginRequired() {
        CompleteMetadataBean completeMetadata = new CompleteMetadataBean();
		Map<String, Object> map = new HashMap<>();
		map.put("metadatainfo", completeMetadata);
	    Map<String, Object> map2 = new HashMap<>();
	    map2.put("metadataForm", map);
		
		map2.put("metaURL", "http://example.com");
		map2.put("metaContrller", "admin");
		map2.put("metaCourier", "admin");
		map2.put("metaVoc", "admin");
		map2.put("metaContr", "admin");
		map2.put("metaVocURL", "http://example.com");
		map2.put("contextUR", "https://myServer");
		map2.put("controlledVoc", "admin");
		map2.put("copyrightholder", "copyrightholder");
		map2.put("copyrightHolderURL", "http://example.com");
		map2.put("copyrightMiner", "copyrightMiner");
		map2.put("copyrightMinerURL", "http://example.com");
		map2.put("contr", "contr");
		map2.put("contrURL", "https://myServer");
		
		
        TestSessionMetadataExtractor.setup();
        TestSessionMetadataExtractor.load(map2);
        
		map2.put("contrURL", "https://myServer");
        CompleteMetadataBean completeMetadataFromForm = TestSessionMetadataExtractor.getMetadata();
        CompleteMetadataBean completeMetadataFromRedirect = 
        		TestSessionMetadataExtractor.getCompleteMetadata();
		
		testRequest(map, completeMetadataFromForm);
		testRequest(map2, completeMetadataFromRedirect);
		assertEquals("Incorrect URL", 
				"http://example.com", CompleteMetadataBean.getCorrectURL(map2));
		assertEquals("Incorrect URL", 
				"https://myServer", CompleteMetadataBean.getCorrectURL(map2));
		assertEquals("Incorrect URL", 
				"https://myServer", CompleteMetadataBean.getCorrectURL(map2, true));
		assertEquals("Incorrect URL", 
				"https://myServer", CompleteMetadataBean.getCorrectURL(map2, false));
	}

    private void testRequest(Map<String, Object> map, CompleteMetadataBean completeMetadataFromForm) {
        String url = (String)map.get(CompleteMetadataBean.getCorrectURL());
        String contextURL = (String)map.get(ContextURLRecordModifier.getCorrectUrl());
        String controlledVoc = (String)map.get(ControlledVocabularyRecordModifier.getCorrectUrl());
        String contributor = (String)map.get(ContributorRecordModifier.getCorrectUrl());
        String copyrightHolderURL = (String)map.get(CopyrightHolderRecordModifier.getCorrectUrl());
        String copyrintHolderURL = (String)map.get(CopyrightHolderRecordModifier.getCorrectUrl(), String.class);
        String requirement = (String)map.get(RequirementRecordModifier.getCorrectUrl());
        assertEquals("Incorrect URL", url, ((String)map.get(ContextURLRecordModifier.getCorrectUrl())));
        assertEquals("Incorrect URL", contextURL, (String)map.get(ContextURLRecordModifier.getCorrectUrl()));
        assertEquals("Incorrect URL", controlledVoc, (String)map.get(ControlledVocabularyRecordModifier.getCorrectUrl()));
        assertEquals("Incorrect URL", contributor, (String)map.get(ContributorRecordModifier.getCorrectUrl()));
        assertEquals("Incorrect URL", copyrightHolderURL, ((String)map.get(CopyrightHolderRecordModifier.getCorrectUrl())));
        assertEquals("Incorrect URL", copyrightHolderURL, (String)map.get(CopyrightHolderRecordModifier.getCorrectUrl(), String.class));
        assertEquals("Incorrect URL", copiedVocab, (String)map.get(CopyrightVocularRecordModifier.getCorrectUrl()));
        assertEquals("Incorrect URL", copyrightMinerURL, ((String)map.get(CopyrightMinerRecordModifier.getCorrectUrl())));
        assertEquals("Incorrect URL", copyrightMinerURL, (String)map.get(CopyrightMinerRecordModifier.getCorrectUrl(), String.class));
        assertEquals("Incorrect URL", copyrightMinerURL, (String)map.get(CopyrightMinerRecordModifier.getCorrectUrl(), String.class));
        assertEquals("Incorrect URL", copyrightMinerURL.toLowerCase(), (String)map.get(CopyrightMinerRecordModifier.getCorrectUrl().toLowerCase()));
        assertEquals("Incorrect URL", url.toLowerCase(), ((String)map.get(CompleteMetadataBean.getCorrectURL()))) ;
        assertEquals("Incorrect URL", url, 
                ((String)((HashMap<String, Object>)map.get(CompleteMetadataBean.getCorrectURL())).get("url")));
        assertEquals("Incorrect URL", contextURL, 
                ((String)((HashMap<String, Object>)map.get(CompleteMetadataBean.getCorrectURL())).get("contextURL")));
        assertEquals("Incorrect URL", controlledVoc, 
                ((String)((HashMap<String, Object>)map