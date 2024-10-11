// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {
  
    @Test
    public void testGetBond() {
        List<JniInchiBond> tmpList = new ArrayList<>();
        for (int i = 0; i < 64; i++) {
            tmpList.add(new JniInchiBond(i, i));
        }
        ArrayList<JniInchiBond> resultList = new ArrayList<>();
        String testString =
                "   0" + 
                "   1" + 
                "   13" + 
                "   22" + 
                "   35";

        for (JniInchiBond bond : tmpList) {
            testString += bond.toString();
        }

        try {
            List<Object> result = getBond(0).parseFromString(testString);
            assertTrue(result.size() == tmpList.size());
            for (JniInchiBond bond : tmpList) {
                assertTrue(resultEqual(result, bond));
            }
        } catch (IllegalArgumentException e) {
            fail("IllegalArgumentException from getBond: " + e);
        }

        try {
            List<Object> result = getBond(1).parseFromString(testString);
            assertTrue(result.size() == tmpList.size());
            for (JniInchiBond bond : tmpList) {
                assertTrue(resultEqual(result, bond));
            }
        } catch (IllegalArgumentException e) {
            fail("IllegalArgumentException from getBond: " + e);
        }

        try {
            List<Object> result = getBond(13).parseFromString(testString);
            assertTrue(result.size() == tmpList.size());
            for (JniInchiBond bond : tmpList) {
                assertTrue(resultEqual(result, bond));
            }
        } catch (IllegalArgumentException e) {
            fail("IllegalArgumentException from getBond: " + e);
        }

        try {
            List<Object> result = getBond(22).parseFromString(testString);
            assertTrue(result.size() == tmpList.size());
            for (JniInchiBond bond : tmpList) {
                assertTrue(resultEqual(result, bond));
            }
        } catch (IllegalArgumentException e) {
            fail("IllegalArgumentException from getBond: " + e);
        }
    }
	  
    private boolean resultEqual(List<Object> a, JniInchiBond b) {
        boolean res = a.size() == b.length() &&
                        a.get(b.length()).equals(b);
        return res && 
               jniInchiBondMatchesList(a, b);
    }
    
    private boolean jniInchiBondMatchesList(List<Object> a, List<Object> b) {
        for (Object o : b) {
            if (!(o instanceof JniInchiBond)) return false;
        }
        return true;
    }
    
  
}