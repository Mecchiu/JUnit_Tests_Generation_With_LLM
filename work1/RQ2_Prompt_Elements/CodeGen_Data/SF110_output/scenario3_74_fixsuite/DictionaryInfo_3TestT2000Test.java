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
String TEST_NAME_1 = "dicom_info_v3";
    @Test
    void test() {
        assertTrue(TEST_NAME_1.equals("DICOM_3.0"));
    }

    class ComponentInfo {
        String component;

        public ComponentInfo(String component) {
            assertTrue(component.equals("Comp 1"));
            assertTrue(component.equals("Comp 2"));
        }
    }

    class SubDictionaryInfo extends DictionaryInfo {
        List<String> componentItemList;
		SubDictionaryInfo() {
			componentItemList = new ArrayList<String>();
		}

		public List<String> getComponentItemList() {
			return componentItemList;
		}
    }

    class SubDictionaryInfo_1 extends SubDictionaryInfo {}
    class SubDictionaryInfo_2 extends SubDictionaryInfo {}

    @Test
    void compare() {
		ComponentInfo componentInfo1 = new ComponentInfo("Comp 1");
		ComponentInfo componentInfo2 = new ComponentInfo("Comp 2");	

    	SubDictionaryInfo_1 comp1 = new SubDictionaryInfo_1();
    	SubDictionaryInfo_2 comp2 = new SubDictionaryInfo_2();

		assertTrue(comp1.compareTo(comp1) == 0);
		assertTrue(comp2.compareTo(comp2) == 1);
    }

	@Test
    void list() {
		List<String> componentItemList = new ArrayList<String>();

		ComponentInfo comp1 = new ComponentInfo("Comp 1");
		ComponentInfo comp2 = new ComponentInfo("Comp 2");

    	SubDictionaryInfo_1 comp1_1 = new SubDictionaryInfo_1();
    	SubDictionaryInfo_2 comp2_1 = new SubDictionaryInfo_2();

		assertTrue(getComponentItemList(comp1).equals(componentItemList));
		assertTrue(getComponentItemList(comp2).equals(componentItemList));
		assertTrue(getComponentItemList(comp1_1).size() == 1);
		assertTrue(getComponentItemList(comp2_1).size() == 1);

		assertTrue(comp1.getComponentItemList()!= comp2.getComponentItemList());
    }

    @Test
    void getListElementByName_1() {
        List<String> list = new ArrayList<String>();
        List<String> subdictionaryList = new ArrayList<String>();

        list.add("Comp 1");
        list.add("Comp 2");
        list.add("Comp 3");
        list.add("Comp 4");

        subdictionaryList.add("Comp 1");
        subdictionaryList.add("Comp 2");
        subdictionaryList.add("Comp 3");
        subdictionaryList.add("Comp 4");

        subdictionaryList.add("2nd Comp 1");
        subdictionaryList.add("3rd Comp 1");
        subdictionaryList.add("4th Comp 1");
        
        assertTrue(getListElementByName(list, "Comp 1")!= null);
		assertTrue(getListElementByName(list, "Comp 2")!= null);
        assertTrue(getListElementByName(list, "Comp 3")!= null);
		assertTrue(getListElementByName(list, "Comp 4")!= null);
		assertTrue(getListElementByName(list, "2nd Comp 1")!= null);
		assertTrue(getListElementByName(list, "3rd Comp 1")!= null);
		assertTrue(getListElementByName(list, "4th Comp 1") == null);

		assertTrue(getListElementByName(list, "Comp 1").getComponentItemList().equals(subdictionaryList));
        
		assertTrue(list == list);
		assertTrue(list == list.get(0));
        
        assertTrue(list.getComponentItemList().contains("2nd Comp 1"));
		assertTrue(list.getComponentItemList().contains("3rd Comp 1"));
		assertTrue(list.getComponentItemList().contains("4th Comp 1"));

        // Test adding multiple components
        assertTrue(subdictionaryList.size() == list.size());

        assertTrue(subdictionaryList.get(0).equals("Comp 3"));
        assertTrue(subdictionaryList.get(1).equals("Comp 4"));
        
        assertTrue(subdictionaryList.get(2).equals("Comp 1"));
        
        assertTrue(subdictionaryList.get(3).equals("Comp 2"));
        assertTrue(subdictionaryList.get(4).equals("Comp 2"));

        assertTrue(list.getComponentItemList().size() == 4);
        assertTrue(list == list.getComponentItemList());
        
        assertTrue(subdictionaryList.contains("2nd Comp 1"));	
        
    }

    public boolean same(DictionaryInfo dicomInfo1, DictionaryInfo dicomInfo2) {
    	boolean comp1 = dicomInfo1.getComponent("Comp 1");
        /* assertTrue(dicomInfo1.getComponent("Comp 1").equals("Comp 1"));*/
        boolean comp2 = dicomInfo1.getComponent("Comp 2");	
        /* assertTrue(dicomInfo1.getComponent("Comp 2").equals("Comp 2"));*/
        
	    boolean comp1_1 = dicomInfo1.getComponentItemWithName("Comp 1");
		boolean comp2_1 = dicomInfo1.getComponentItemWithName("Comp 2");
	
	    boolean same = true;
	    if(!comp1 &&!comp2 &&!comp1_1 &&!comp2_1) same = dicomInfo1.compareTo(dicomInfo2);
	    else if (comp1 && comp2 && comp1_1 && comp2_1) same = dicomInfo1.compareTo(dicomInfo2);
	    else if (comp1 && comp1_1 && comp2 && comp2_1) same = dicomInfo1.compareTo(dicomInfo2);
		else if (comp2 && comp1 && comp2_1) same = dicomInfo2.compareTo(dicomInfo1);
		else same = dicomInfo2.compareTo(dicomInfo1);
	    
	    if (same) return true;
	   else 
    	 	return false;
	}
    
    private boolean getListElementByName(List<String> list, String name) {
        boolean find = false;
        for (String str : list) {
            if (str!= null && str.trim().charAt(0) == '_') {
                find = true;
                break;
            }
        }
        return find;
    }

    private List<String> getComponentItemList(ComponentInfo compInfo) {
        List<String> listEntry = new ArrayList<String>();
        List<String> list = new ArrayList<String>();

        if (compInfo instanceof SubDictionaryInfo) {
            for (String element : ((SubDictionaryInfo) compInfo).componentItemList) {
                list.add(element);
            }
        } else {
            for (String element : compInfo.getComponentItemList()) {
                list.add(element);
            }
        }

        return list;
    }