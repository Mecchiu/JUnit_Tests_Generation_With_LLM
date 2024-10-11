// Test cases for CancelEditMetadataAction.actionRequiresLogin()

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CancelEditMetadataActionTest {

    @Test
    void testActionRequiresLoginReturnsFalse() {
        CancelEditMetadataAction action = new CancelEditMetadataAction();
        assertFalse(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginReturnsTrue() {
        CancelEditMetadataAction action = new CancelEditMetadataAction();
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginReturnsFalseWhenLoggedIn() {
        CancelEditMetadataAction action = new CancelEditMetadataAction();
        HttpSession session = mock(HttpSession.class);
        when(session.getAttribute("user")).thenReturn("testuser");
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getSession()).thenReturn(session);
        assertFalse(action.actionRequiresLogin(request));
    }

    @Test
    void testActionRequiresLoginReturnsTrueWhenNotLoggedIn() {
        CancelEditMetadataAction action = new CancelEditMetadataAction();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getSession()).thenReturn(mock(HttpSession.class));
        assertTrue(action.actionRequiresLogin(request));
    }

    @Test
    void testActionRequiresLoginReturnsFalseWhenLoggedInAndNotAdmin() {
        CancelEditMetadataAction action = new CancelEditMetadataAction();
        HttpSession session = mock(HttpSession.class);
        when(session.getAttribute("user")).thenReturn("testuser");
        when(session.getAttribute("isAdmin")).thenReturn(false);
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getSession()).thenReturn(session);
        assertFalse(action.actionRequiresLogin(request));
    }

    @Test
    void testActionRequiresLoginReturnsTrueWhenNotLoggedInAndNotAdmin() {
        CancelEditMetadataAction action = new CancelEditMetadataAction();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getSession()).thenReturn(mock(HttpSession.class));
        assertTrue(action.actionRequiresLogin(request));
    }

    @Test
    void testActionRequiresLoginReturnsTrueWhenLoggedInAndAdmin() {
        CancelEditMetadataAction action = new CancelEditMetadataAction();
        HttpSession session = mock(HttpSession.class);
        when(session.getAttribute("user")).thenReturn("testuser");
        when(session.getAttribute("isAdmin")).thenReturn(true);
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getSession()).thenReturn(session);
        assertTrue(action.actionRequiresLogin(request));
    }

    @Test
    void testActionRequiresLoginReturnsTrueWhenNotLoggedInAndAdmin() {
        CancelEditMetadataAction action = new CancelEditMetadataAction();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getSession()).thenReturn(mock(HttpSession.class));
        assertTrue(action.actionRequiresLogin(request));
    }

    @Test
    void testActionRequiresLoginReturnsTrueWhenSessionIsNull() {
        CancelEditMetadataAction action = new CancelEditMetadataAction();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getSession()).thenReturn(null);
        assertTrue(action.actionRequiresLogin(request));
    }
}