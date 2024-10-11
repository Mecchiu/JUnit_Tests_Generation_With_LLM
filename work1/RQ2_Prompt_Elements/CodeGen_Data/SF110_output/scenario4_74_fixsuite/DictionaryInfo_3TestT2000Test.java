// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {

    TestDictionaryInfo_3() {
    }

    @Test
    void testInitialConditions_4() {
        
        // Test basic conditions
        List<MessageInfo> messages = new ArrayList<>();
        messages.add(new MessageInfo("test.test.A"));
        messages.add(new MessageInfo("test.A.B.C"));
        messages.add(new MessageInfo("test.test.ATAGN", 'A', '0', '0', '1', '1', '1', '2', 0, 0, 2));
        MessageInfo messageInfo = DictionaryInfoDAOImpl.getInstance().getMessage(messages, '2');
        assertNotNull(messageInfo);
        assertFalse(messageInfo.isValid());

        // Test if we have a field with a given name
        // (there can be both a group and no group, as no group allows it)
        List<Integer> tags = new ArrayList<>();
        tags.add(1);
        // Tag is "A"
        TagInfo tagInfo = new TagInfo("A");
        TagName tagName = new TagName("A");
        FieldInfo fieldInfo = new FieldInfo("test.test.E", "TEST", tags, tagInfo, new String[]{"A", "B", "C"}, 0, 0, 0);
        List<FieldInfo> fields = new ArrayList<>(1);
        fields.add(fieldInfo);
        List<ComponentInfo> components = new ArrayList<>(1);
        components.add(new ComponentInfo("test"));
        List<ComponentInfo> componentsById = new ArrayList<>(1);
        componentsById.add(new ComponentInfo("cid", "cid", 0, 2, 5, 1, null, true, false));
        List<GroupInfo> groups = new ArrayList<>();
        groups.add(new GroupInfo(tagName));
        fieldInfo = new FieldInfo("test.A.B.C", "B", 1, 1, 0, 1, tags, 0, false, true, 1, false, 0, null, null, 1, 0, 0, 1, 0, false, 1, 0, 0, 1);
        fieldInfo = new FieldInfo("test.ATAGN", 'A', 0, 1, -1, 1, 2, 5, 1, 0, false, 0, 0, false, 2, 0, 0, -3, 1, -1, 1);
        componentsById.add(new ComponentInfo("A", Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), 1, new ListWrapper(1), fieldsById, 1, -1, -1, -1, 1));
        componentsById.add(new ComponentInfo("ATAGN", 'A', 0, -1, -2, 1, new ListWrapper(1), new ListWrapper(1), new ListWrapper(1), 1, new ListWrapper(0), fieldsById, 0, -1, -1, 0, 0, 1));
        componentsById.add(new ComponentInfo("A", Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), 2, new ListWrapper(1), fieldsById, 1, -1, -1, -1, 1));
        componentsById.add(new ComponentInfo("ATAGN", 'A', 0, -1, -2, 1, new ListWrapper(1), new ListWrapper(1), new ListWrapper(1), 1, new ListWrapper(0), fieldsById, 0, -1, -1, 0, 0, 1));
        componentsById.add(new ComponentInfo("A", Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), 2, new ListWrapper(1), fieldsById, 1, -1, -1, -1, 1));
        components