// FieldInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains one unit test case for the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
*/
class FieldInfo_0Test {
// FieldInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a Field as defined by the FIX specification.
 *
 * @author jramoyo
 */
public class FieldInfo implements FixInfo {

    public boolean isRequiredInComponent(ComponentInfo component) {
        if (requiringComponents!= null) {
            return requiringComponents.contains(component);
        } else {
            return false;
        }
    }
}

// FieldInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains one unit test case for the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
*/
class FieldInfo_0Test {
		/**
		 * Tests if required in component with a given name is true.
		 * @param componentName
		 * @return
		 */
    public boolean isRequiredInComponent(String componentName) {
        for (FixInfo otherFixInfo : this.getFixes()) {
            if (otherFixInfo.isRequiredInComponent(componentName)) {
                return true;
            }
        }
        return false;
    }

		/**
		 * Unit test for {@link FieldInfo#isRequiredInComponent(String)}.
		 * @throws Exception
		 */
	@Test
    void test_01() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqString()}.
		 * @throws Exception
		 */
	@Test
    void test_02() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#isRequired(String)}.
		 * @throws Exception
		 */
	@Test
    void test_03() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getString(String)}.
		 * @throws Exception
		 */
	@Test
    void test_04() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getString(String, String)}.
		 * @throws Exception
		 */
	@Test
    void test_05() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getString(Integer, String)}.
		 * @throws Exception
		 */
	@Test
    void test_06() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getString(String, Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_07() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getString(Integer, String)}.
		 * @throws Exception
		 */
	@Test
    void test_08() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getString(Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_09() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getFixes()}.
		 * @throws Exception
		 */
	@Test
    void test_10() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqCount()}.
		 * @throws Exception
		 */
	@Test
    void test_11() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqId()}.
		 * @throws Exception
		 */
	@Test
    void test_12() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqString(Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_13() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqString(Integer, String)}.
		 * @throws Exception
		 */
	@Test
    void test_14() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqString(String, Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_15() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqString(Integer, Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_16() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqInteger(String)}.
		 * @throws Exception
		 */
	@Test
    void test_17() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqInteger(Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_18() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqStringList(Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_19() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqStringList(String, Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_20() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getReqStringList(Integer, Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_21() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#isMultiValue()}.
		 * @throws Exception
		 */
	@Test 
    void test_22() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getMultiValueStringList()}.
		 * @throws Exception
		 */
	@Test
    void test_23() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#isRequired(Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_24() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getRequiredInt(String)}.
		 * @throws Exception
		 */
	@Test
    void test_25() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getMultiValueString(Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_26() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#isRequiredInteger(Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_27() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getInteger(String)}.
		 * @throws Exception
		 */
	@Test
    void test_28() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getInteger(Integer)}.
		 * @throws Exception
		 */
	@Test
    void test_29() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#isOptional(String)}.
		 * @throws Exception
		 */
	@Test
    void test_30() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getOptionalString(String)}.
		 * @throws Exception
		 */
	@Test
    void test_31() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getNullable(String)}.
		 * @throws Exception
		 */
	@Test
    void test_32() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getRequiredStrList(String)}.
		 * @throws Exception
		 */
	@Test
    void test_33() throws Exception {

    }

	/**
		 * Unit test for {@link FieldInfo#getInvalidStrList(int)}.
		 * @throws Exception
		 */
	@Test
    void test_34() throws Exception {