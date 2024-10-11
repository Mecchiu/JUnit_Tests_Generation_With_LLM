```java
package com.browsersoft.aacs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleUserMgr_6Test {

    @Test
    void testExportEmpty() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        String result = userMgr.export();
        assertEquals("", result);
    }

    @Test
    void testExportSingleUser() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        User user = new User("test@example.com", "testuser");
        userMgr.addUser(user);
        String expected = user.toString() + "\n";
        String result = userMgr.export();
        assertEquals(expected, result);
    }

    @Test
    void testExportMultipleUsers() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        User user1 = new User("test1@example.com", "testuser1");
        User user2 = new User("test2@example.com", "testuser2");
        userMgr.addUser(user1);
        userMgr.addUser(user2);
        String expected = user1.toString() + "\n" + user2.toString() + "\n";
        String result = userMgr.export();
        assertEquals(expected, result);
    }

    @Test
    void testExportNoUsers() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        userMgr.init();
        String result = userMgr.export();
        assertEquals("", result);
    }

    @Test
    void testExportWithExistingUsers() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        userMgr.init();
        userMgr.addUsers();
        String result = userMgr.export();
        assertFalse(result.isEmpty());
    }

    @Test
    void testExportAfterAddingUsers() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        userMgr.addUsers();
        String result = userMgr.export();
        assertFalse(result.isEmpty());
    }

    @Test
    void testExportAfterAddingSingleUser() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        User user = new User("test@example.com", "testuser");
        userMgr.addUser(user);
        String result = userMgr.export();
        assertTrue(result.contains(user.toString()));
    }

    @Test
    void testExportAfterAddingMultipleUsers() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        User user1 = new User("test1@example.com", "testuser1");
        User user2 = new User("test2@example.com", "testuser2");
        userMgr.addUser(user1);
        userMgr.addUser(user2);
        String result = userMgr.export();
        assertTrue(result.contains(user1.toString()));
        assertTrue(result.contains(user2.toString()));
    }

    @Test
    void testExportAfterDeletingUser() {
        SimpleUserMgr userMgr = new SimpleUserMgr();
        User user = new User("test@example.com", "testuser");
        userMgr.addUser(user);
        userMgr.delUser("test@example.com");
        String result = userMgr.export();
        assertEquals("", result);
    }
}
```
```