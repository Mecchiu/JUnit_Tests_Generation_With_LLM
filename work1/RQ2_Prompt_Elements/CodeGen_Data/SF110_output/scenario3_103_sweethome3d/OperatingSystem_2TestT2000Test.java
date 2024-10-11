// OperatingSystem_2Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains one unit test case for the {@link OperatingSystem#isMacOSX()} method.
*/
class OperatingSystem_2Test {
/**
		 * Tests if the operating system is Mac OS X.
		 */
		@Test
		public void isMacOSX() {
			assertTrue(OperatingSystem._current.isMacOSX()); //TODO remove this from unit test code
		}
}

// OperatingSystem_3Test.java
class OperatingSystem_3Test {
    /**
     * Tests if the OperatingSystem does not throw an exception
     */
    @Test( expected = UnsupportedOperationException.class)
    public void testUnsupportedOperation() {
        _current.isMacOSX(); //TODO remove this from unit test code
    }

    /**
     * Tests if the OperatingSystem has a <code>checkPermissions</code> method
     * which returns the uid of the authenticated user
     */
    @Test
    public void testCheckPermissionsToUserWithUID() {
        assertEquals(UUID.randomUUID(), _current.checkPermissionsToUser("me")); //TODO remove this from unit test code
    }


    /**
     * Tests if the OperatingSystem has a <code>checkPermissions</code> method
     * which throws a NoSuchMethodException on method <code>checkPermissions</code>.
     */
    @Test( expected = NoSuchMethodException.class)
    public void testCheckPermissionsOnUserToNotGetPermissionSuccess() {
        try {
            _current.checkPermissions("1");
            assertTrue(false);
        }
        catch (NoSuchMethodException e) {
            boolean exceptionThrown = false 
                    ;
            try {
                _current.checkPermissionsToUser("me");
            }
            catch (AccessControlException ex) {
                exceptionThrown = true;
            }
            if (!exceptionThrown) {
                throw e;
            }
            else {
                assertTrue(false);
            }
        }
        catch (Exception e) {
            boolean exceptionThrown = false;
            try {
                _current.checkPermissionsToUser("me");
            }
            catch (AccessControlException ex) {
                exceptionThrown = true;
            }
            if (!exceptionThrown) {
                throw e;
            }
            else {
                assertTrue(false);
            }
        }
    }

    /**
     * Tests if the OperatingSystem has a <code>checkPermissions</code> method
     * which throws a NoSuchMethodException on method <code>checkPermissions</code>
     *.
     */
    @Test(expected = NoSuchMethodException.class)
    public void testCheckPermissionsOnUserReturnsUidMismatch() {
        try {
            _current.checkPermissions("1");
            assertTrue(false);
        }
        catch (NoSuchMethodException e) {
            boolean exceptionThrown = false;
            try {
                _current.checkPermissionsToUser("me", "me-123");
            }
            catch (AccessControlException ex) {
                exceptionThrown = true;
            }
            if (!exceptionThrown) {
                throw e;
            }
            else {
                assertTrue(false);
            }
        }
        catch (Exception e) {
            boolean exceptionThrown = false;
            try {
                _current.checkPermissionsToUser("me", "me");
            }
            catch (AccessControlException ex) {
                exceptionThrown = true;
            }
            if (!exceptionThrown) {
                throw e;
            }
            else {
                assertTrue(false);
            }
        }
    }

    /**
     * Tests if the OperatingSystem has a <code>checkPermissions</code> method
     * which throws a NoSuchMethodException on method <code>checkPermissions</code>
     *.
     */
    @Test(expected = NoSuchMethodException.class)
    public void testCheckPermissionsWhenNotUserIsNotLoggedIn() {
        try {
            _current.checkPermissions("me"); //TODO remove this from unit test code
        }
        catch (NoSuchMethodException e) {
            boolean exceptionThrown = false;
            try {
                _current.checkPermissions("me", "me-234");
            }
            catch (AccessControlException ex) {
                exceptionThrown = true;
            }
            if (!exceptionThrown) {
                throw e;
            }
            else {
                assertTrue(false);
            }
        }
        catch (Exception e) {
            boolean exceptionThrown = false;
            try {
                _current.checkPermissions("me", "me");
            }
            catch (AccessControlException ex) {
                exceptionThrown = true;
            }
            if (!exceptionThrown) {
                throw e;
            }
            else {
                assertTrue(false);
            }
        }
    }

    /**
     * Tests if the OperatingSystem has a <code>checkPermissions</code> method
     * which returns <code>-1</code> when uid is invalid.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckPermissionsToUserInvalidUID() {
        _current.checkPermissionsToUser(UUID.randomUUID().toString());
    }


    /**
     * Tests if the OperatingSystem has a <code>checkPermissions</code> method
     * which returns <code>0</code> when uid is equal null.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckPermissionsToUserNullUid() {
        try {
            _current.checkPermissionsToUser(null);
        }
        catch (UnsupportedOperationException e) {
            assertTrue(true);
        }
    }
}

// OperatingSystem.java
