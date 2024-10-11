// ParameterBeanTest.java
package org.heal.module.search;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterBean}.
* It contains one unit test case for the {@link ParameterBean#size()} method.
*/
class ParameterBeanTest {
		
    ParameterBeanTest() {
    }

    @Test
    void getParameters2() {
        ParameterBean p = null;
        // ParameterBean(ParameterBean)
        // p = new ParameterBean(ParameterBean);
    }
	
    @Test
    void setParameters2() {
        ParameterBean p = null;
        p.setSourceCollection(new String[]{"SDS"});
        String[] s = p.getSourceCollection();
        assertEquals(0, s.length);
        p.setHidden(true);
        p.setDisease("SDS");
        p.setPrimaryArray("SDS");
        String[] s2 = p.getPrimaryArray();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("SDS");
        arrayList.add("N/L");
        assertEquals(2, s2.length);
        assertTrue(arrayList.size() > 0);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add(ArrayUtils.toString(s2, ","));
        arrayList2.add("SDS");
        arrayList2.add("N/L");
        assertEquals(2, arrayList2.size());
        assertTrue(arrayList2.size() > 0);
    }

    @Test
    void getParameters3() {
        ParameterBean p = null;
        // ParameterBean(ParameterBean)
        // p = new ParameterBean(ParameterBean);
        String[] s = p.getPrimaryArray();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("N/L");
        arrayList.add("SDS");
        assertEquals(2, s.length);
        assertTrue(arrayList.size() > 0);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add(ArrayUtils.toString(s, ","));
        arrayList2.add("SDS");
        arrayList2.add("N/L");
        assertEquals(2, arrayList2.size());
        assertTrue(arrayList2.size() > 0);
    }

    @Test
    void getParameters4() {
        ParameterBean p = null;
        // ParameterBean(ParameterBean)
        // p = new ParameterBean(ParameterBean);
        String[] s = p.getDisease();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("N/L");
        arrayList.add("SDS");
        assertEquals(2, s.length);
        assertTrue(arrayList.size() > 0);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add(ArrayUtils.toString(s, ","));
        arrayList2.add("SDS");
        arrayList2.add("N/L");
        assertEquals(2, arrayList2.size());
        assertTrue(arrayList2.size() > 0);
    }
}