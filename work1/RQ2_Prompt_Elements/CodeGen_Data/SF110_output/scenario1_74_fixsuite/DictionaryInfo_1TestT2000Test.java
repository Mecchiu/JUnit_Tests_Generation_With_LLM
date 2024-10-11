// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {
// DictionaryInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class DictionaryInfo {

    public FieldInfo getField(String name) {
        if (fieldsByName!= null) {
            return fieldsByName.get(name);
        }
        return null;
    }
}

// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {
		   	/**
				*
				* @throws java.lang.UnsupportedOperationException
				* @throws java.io.IOException
				*/
	public static void main(String[] args) throws java.lang.Exception, java.io.IOException {
		   		List <String> strings = new ArrayList <String> ();
		   		strings.add("FIX.20");
		   		strings.add("FIX.32");
		   		strings.add("FIX.42");
		   		strings.add("FIX.48");
		   		strings.add("FIX.48S");
		   		strings.add("FIX.4X");
		   		strings.add("FIX.6X");
		   		strings.add("FIX.8X");
		   		strings.add("FIX.9X");
		   		strings.add("FIX.11X");
		   		strings.add("FIX.12X");
		   		strings.add("FIX.14X");
		   		for (String string : strings) {
				   	System.out.print(string);
		   	}
		   }
}

