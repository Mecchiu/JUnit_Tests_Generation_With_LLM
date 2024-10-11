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
		
    static class MetadataRecordModifier implements MetadataModifier {

        @Override
        public void modify(CompleteMetadataBean metadata, Map map) {
            metadata.put("hello", "world");
        }
    }

    static class ContextURLModifier implements MetadataModifier {

        @Override
        public void modify(CompleteMetadataBean metadata, Map map) {
            if (map.get("path") == null) {
                System.err.print("Path doesn't exist!");
            } else {
                metadata.put("context", map.get("path"));
            }
        }
    }

    static class ContributedVocabularyModifier implements MetadataModifier {

        @Override
        public void modify(CompleteMetadataBean metadata, Map map) {
            if (map.get("vocabulary") == null) {
                System.err.print("Vocabulary doesn't exist!");
            } else {
                metadata.put("contributedTo", map.get("vocabulary"));
            }
        }
    }

    static class ContributorRecordModifier implements MetadataModifier {

        @Override
        public void modify(CompleteMetadataBean metadata, Map map) {
            if (map.get("contributorid") == null) {
                System.err.print("Contributor id doesn't exist!");
            } else {
                metadata.put("contributorid", map.get("contributorid"));
            }
        }
    }

    static class ControlledVocabularyRecordModifier implements MetadataModifier {

        @Override
        public void modify(CompleteMetadataBean metadata, Map map) {
            if (map.get("controlledvocabulary") == null) {
                System.err.print("Controlled vocabulary doesn't exist!");
            } else {
                metadata.put("controlledvocabulary", map.get("controlledvocabulary"));
            }
        }
    }

    static class RequirementRecordModifier implements MetadataModifier {

        @Override
        public void modify(CompleteMetadataBean metadata, Map map) {
            if (map.get("requirementid") == null) {
                System.err.print("Requirement id doesn't exist!");
            } else {
                metadata.put("requirementid", map.get("requirementid"));
            }
        }
    }

    public void test(final String type) throws Exception {
        this.test(new MetadataRecordModifier(), null, null, Collections.<MetadataModifier>singleton(new CompleteMetadataBean()), type);
    }

    public void test(final String type, final String version) throws Exception {
        this.test(new MetadataRecordModifier(), new ContextURLModifier(), new ContributedVocabularyModifier(), Collections.<MetadataModifier>singleton(new CompleteMetadataBean()), type);
    }

    public void test(final String type, final String version, final String typeOtherVersion, final Map map, final String versionOther) throws Exception {
        Map<String, Map<String, String>> data = new HashMap<>();
        data.put("hello", Collections.singletonMap("type", type));
        data.put("some", null);
        data.put("world", Collections.singletonMap("type", "foo"));
        this.test(new ContextURLModifier(), new ContributedVocabularyModifier(), new ContributorRecordModifier(), data, typeOtherVersion, Collections.singleton(new ContributorRecordModifier()), versionOther);
    }

    /**
     * Check whether this test case requires the login process.
     */
    private boolean testRequiresLogin() {
        return
            this.actionRequiresLogin();
    }

    public static void main(String[] args) throws Exception {

        new ModifyMetadataActionTest().test("foo");
    }
}