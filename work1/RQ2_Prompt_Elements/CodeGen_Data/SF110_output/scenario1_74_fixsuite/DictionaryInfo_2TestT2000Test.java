// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {
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

    public ComponentInfo getComponent(int id) {
        if (componentsById!= null) {
            return componentsById.get(id);
        }
        return null;
    }
}

// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {
		
    @jailed
    List<ComponentInfo> componentsById;
        
	@jailed
    public DictionaryInfo getDictionaryInfo() {
        return dictionariesById;
    }

    @jailed
    void setComponentsByName(List<ComponentInfo> componentsById) {
        this.componentsById = componentsById;
        for (ComponentInfo component: componentsById) {

        }
    }

    @Test
    void testConstructor1() {
	  List<ComponentInfo> componentsById = new ArrayList<>();

	  setComponentsByName(componentsById);

    }

    @Test
    void testConstructor2() {
        List<ComponentInfo> componentsById = null;

        setComponentsById(componentsById);

    }

    @Test
    void testConstructor3() {
        List<ComponentInfo> componentsById = new ArrayList<>();

        setComponentsById(componentsById);
    }
}
