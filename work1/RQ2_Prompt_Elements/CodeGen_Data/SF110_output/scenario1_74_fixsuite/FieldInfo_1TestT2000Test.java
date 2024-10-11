// FieldInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains one unit test case for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfo_1Test {

    private static final List<String> validValues = new ArrayList<>();
    
	static {
        List<String> allFields = new ArrayList<String>(){{
            add("field-name");
            add("field-desc");
            add("field-type-code");
            add("field-group-code");
            add("field-type-name");
        }};
        List<String> allTypes = new ArrayList<String>(){{
            add("application-encoding");
        }};
        List<String> allGroups = new ArrayList<String>(){{
            add("group-name");
            add("group-name");
        }};

        String firstKey = allFields.get(0);
        String secondKey = allTypes.get(0);
        allFields.add("field-name2");
        allEncoding.add("UTF-8");
        allTypes.add("group1");
        allGroups.add("group2");

        for ( String key : allFields ) {
        	validValues.add(key);
        }
        for ( String type : allTypes ) {
        	validValues.add(type);
        }
        for ( String group : allGroups ) {
        	validValues.add(group);
        }
        
        
    }};
    
    @Test
    public void shouldCreateInstanceWithValidValues() {
        FieldInfo fi = new FieldInfo();
        assertNotNull(fi);
        assertTrue(!fi.isValidValue(anyValue()));
        assertFalse(fi.isValidValue(notValidValue()));
        assertTrue(fi.isValidValue(String.format("unknown$")));
        
    }
    
    private static String anyValue() {
        return FieldInfo_1.class.getName().replaceFirst("${name}", ""),
                String.format("${desc}", "description"),
                String.format("${type}", "application-encoding"),
                String.format("${group}", "group-name"),
                Integer.valueOf(allFields.size()).toString(),
                Integer.toString(allEncoding.size()),
                Integer.toString(allGroups.size()),
                FieldInfo_1.class.getName().replaceAll("${name}", ""),
                FieldInfo_1.class.getName().replaceAll("${desc}", "")
        		.replaceAll("${type}", "").replaceAll("${group}", "")
        		.replaceAll("${enc_int}", "").replaceAll("${field_name}", "")
               .replaceAll("^([a-zA-Z0-9_]{1})([a-zA-Z0-9_]{1})([a-zA-Z0-9_]{1})([a-zA-Z0-9_]{1})$", ""),
                FieldInfo_2.class.getName().replaceAll("${name}", "").replaceAll("${desc}", "")
               .replaceAll("^([a-zA-Z0-9_]{1})([a-zA-Z0-9_]{0,3})([a-zA-Z0-9_]{2,3})$", ""),
                FieldInfo_3.class.getName().replaceAll("${desc}", "").replaceAll("^([a-zA-Z0-9_]{1,3})$", ""),
                FieldInfo_4.class.getName().replaceAll("${field_name}", "").replaceAll("@$", "$"),
                FieldInfo_5.class.getName().replaceAll("${desc}", "", true).replaceAll("@$", "$"),
                FieldInfo_6.class.getName().replaceAll("${desc}", "").replaceAll("@$", "$"),
                FieldInfo_7.class.getName().replaceAll("${desc}", "").replaceAll("@$", "$"),
                FieldInfo_8.class.getName().replaceAll("${desc}", "").replaceAll("@$", "$"),
                FieldInfo_9.class.getName().replaceAll("${desc}", "").replaceAll("@$", "$"),
                FieldInfo_10.class.getName().replaceAll("${desc}", "").replaceAll("@$", "$")
        		.replaceAll("^(.*)$", "$1"),
                List.class.getName().replaceAll("^$", ".").replaceAll("\\$", ".") }
               .format(validValues), true);
    }
    
    private static String validValues = "";
    
    private static String validEncoding = "";

    private static String validValues_1_1 =
            "\t\t<field-name>
                    \t\t\t<label>${field_name_label}</label>
                        \t\t\t<description>${field_name_description}</description>
                    \t\t</field-name>\n"
           , "  \t\t<field-name>
                    \t\t\t<label>${field_name_label}</label>\n"
            "\t\t\t<description>${field_name_description}</description>\n"
            " \t\t</field-name>\n";

    private static String validValues_1_10 =
           		"  \t\t<field-name>\n"
                   , "  \t\t\t<label>${field_name_label}</label>\n"
                   , "  \t\t\t<description>${field_name_description}</description>\n"
                    "\t\t\t</field-name>\n";
    
    private static String validValues_1_2 =
            "  \t\t<field-name>\n"
                   , "  \t\t\t<label>${field_name_label}</label>\n"
                   , "  \t\t\t<description>${field_name_description}</description>\n"
                    "\t\t\t</field-name>\n";
    
    private static String validValues_0_5 =
            "  \t\t<field-name>\n"
                   , "  \t\t\t<label>${field_name_label}</label>\n"
                   , "  \t\t\t<description>${field_name_description}</description>\n"
                    "\t\t\t</field-name>\n";
    
}

