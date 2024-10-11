// DictionaryInfo_4Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfo_4Test {
		
	@Test
    public void testGetMessage() {
		FieldInfo dummy = new FieldInfo(null, null, "this is message test");
		System.out.println(dummy); // throws ClassCastException

		dummy.setTagNumber(3);

        String name = null;

		List<MessageInfo> items = new ArrayList<MessageInfo>();

		dummy.addField(new FieldInfo("ID", "field_id", name));
		List<String> names = new ArrayList<String>();
		names.add("Name");

		dummy.addFacet(new FacetInfo("ID", "tagNumber", "Facet1", "Facet2"));

		dummy.addMessage(new MessageInfo("Message1"));
		dummy.addMessage(new MessageInfo("Message2"));

		items.add(dummy);

        List<FieldInfo> fields = new ArrayList<FieldInfo>();
        fields.add(dummy);

        List<FacetInfo> facets = new ArrayList<FacetInfo>();
        facets.add("Facet1");
        facets.add("Facet2");

        FieldInfo result = new FieldInfo(null, fields, name);

        System.out.printf("%n%n");

        assertFalse("Message1 tag is set.", result.getTags().containsKey(new Tag("Facet1", "")));
        assertTrue("Message2 facet is not set.", result.getFacetByName("") == null); 
        assertTrue("Message3 facet not set", result.getFacetByTagNumber(new Tag("Facet1")) == null);

    }
}