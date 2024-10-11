java
package com.browsersoft.aacs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleUserMgr_4Test {

    @Test
    void testGetNamesbyOrg_EmptyOrg() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("");
        assertEquals(0, names.length);
    }

    @Test
    void testGetNamesbyOrg_NonExistingOrg() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("NonExistingOrg");
        assertEquals(0, names.length);
    }

    @Test
    void testGetNamesbyOrg_ExistingOrgWithNoUsers() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("ExistingOrgWithNoUsers");
        assertEquals(0, names.length);
    }

    @Test
    void testGetNamesbyOrg_ExistingOrgWithUsers() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("ExistingOrgWithUsers");
        assertEquals(3, names.length);
        assertEquals("User1", names[0]);
        assertEquals("User2", names[1]);
        assertEquals("User3", names[2]);
    }

    @Test
    void testGetNamesbyOrg_NullOrg() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg(null);
        assertEquals(0, names.length);
    }

    @Test
    void testGetNamesbyOrg_OrgWithSpecialCharacters() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("OrgWithSpecialCharacters");
        assertEquals(2, names.length);
        assertEquals("User1", names[0]);
        assertEquals("User2", names[1]);
    }

    @Test
    void testGetNamesbyOrg_OrgWithSpaces() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("Org With Spaces");
        assertEquals(1, names.length);
        assertEquals("User1", names[0]);
    }

    @Test
    void testGetNamesbyOrg_OrgWithNumbers() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("Org123");
        assertEquals(1, names.length);
        assertEquals("User1", names[0]);
    }

    @Test
    void testGetNamesbyOrg_OrgWithMixedCharacters() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String[] names = userMgr.getNamesbyOrg("Org!@#123");
        assertEquals(1, names.length);
        assertEquals("User1", names[0]);
    }
}
