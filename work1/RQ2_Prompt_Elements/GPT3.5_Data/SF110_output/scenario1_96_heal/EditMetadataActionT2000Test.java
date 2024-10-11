// Test case 1: Test if actionRequiresLogin() returns true when user is not logged in
@Test
public void testActionRequiresLoginWhenUserNotLoggedIn() {
    // Create a mock HttpServletRequest object with no user session
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession(false)).thenReturn(null);

    // Create an instance of EditMetadataAction
    EditMetadataAction editMetadataAction = new EditMetadataAction();

    // Assert that actionRequiresLogin() returns true
    assertTrue(editMetadataAction.actionRequiresLogin());
}

// Test case 2: Test if actionRequiresLogin() returns true when user is logged in
@Test
public void testActionRequiresLoginWhenUserLoggedIn() {
    // Create a mock HttpServletRequest object with a user session
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(false)).thenReturn(session);

    // Create an instance of EditMetadataAction
    EditMetadataAction editMetadataAction = new EditMetadataAction();

    // Assert that actionRequiresLogin() returns true
    assertTrue(editMetadataAction.actionRequiresLogin());
}

// Test case 3: Test if actionRequiresLogin() returns true when user session is expired
@Test
public void testActionRequiresLoginWhenUserSessionExpired() {
    // Create a mock HttpServletRequest object with an expired user session
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(false)).thenReturn(session);
    when(session.isNew()).thenReturn(false);
    when(session.getLastAccessedTime()).thenReturn(System.currentTimeMillis() - (30 * 60 * 1000)); // Set last accessed time to 30 minutes ago

    // Create an instance of EditMetadataAction
    EditMetadataAction editMetadataAction = new EditMetadataAction();

    // Assert that actionRequiresLogin() returns true
    assertTrue(editMetadataAction.actionRequiresLogin());
}

// Test case 4: Test if actionRequiresLogin() returns false when user session is not expired
@Test
public void testActionRequiresLoginWhenUserSessionNotExpired() {
    // Create a mock HttpServletRequest object with a valid user session
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(false)).thenReturn(session);
    when(session.isNew()).thenReturn(false);
    when(session.getLastAccessedTime()).thenReturn(System.currentTimeMillis() - (10 * 60 * 1000)); // Set last accessed time to 10 minutes ago

    // Create an instance of EditMetadataAction
    EditMetadataAction editMetadataAction = new EditMetadataAction();

    // Assert that actionRequiresLogin() returns false
    assertFalse(editMetadataAction.actionRequiresLogin());
}

// Test case 5: Test if actionRequiresLogin() returns true when user session is not expired but user is not authenticated
@Test
public void testActionRequiresLoginWhenUserNotAuthenticated() {
    // Create a mock HttpServletRequest object with a valid user session but no authentication
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(false)).thenReturn(session);
    when(session.isNew()).thenReturn(false);
    when(session.getLastAccessedTime()).thenReturn(System.currentTimeMillis() - (10 * 60 * 1000)); // Set last accessed time to 10 minutes ago
    when(AuthenticationTools.isAuthenticated(request)).thenReturn(false);

    // Create an instance of EditMetadataAction
    EditMetadataAction editMetadataAction = new EditMetadataAction();

    // Assert that actionRequiresLogin() returns true
    assertTrue(editMetadataAction.actionRequiresLogin());
}

// Test case 6: Test if actionRequiresLogin() returns false when user session is not expired and user is authenticated
@Test
public void testActionRequiresLoginWhenUserAuthenticated() {
    // Create a mock HttpServletRequest object with a valid user session and authentication
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(false)).thenReturn(session);
    when(session.isNew()).thenReturn(false);
    when(session.getLastAccessedTime()).thenReturn(System.currentTimeMillis() - (10 * 60 * 1000)); // Set last accessed time to 10 minutes ago
    when(AuthenticationTools.isAuthenticated(request)).thenReturn(true);

    // Create an instance of EditMetadataAction
    EditMetadataAction editMetadataAction = new EditMetadataAction();

    // Assert that actionRequiresLogin() returns false
    assertFalse(editMetadataAction.actionRequiresLogin());
}

// Test case 7: Test if actionRequiresLogin() returns true when user session is not expired but user is not authorized
@Test
public void testActionRequiresLoginWhenUserNotAuthorized() {
    // Create a mock HttpServletRequest object with a valid user session but no authorization
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(false)).thenReturn(session);
    when(session.isNew()).thenReturn(false);
    when(session.getLastAccessedTime()).thenReturn(System.currentTimeMillis() - (10 * 60 * 1000)); // Set last accessed time to 10 minutes ago
    when(AuthenticationTools.isAuthenticated(request)).thenReturn(true);
    when(AuthenticationTools.isAuthorized(request)).thenReturn(false);

    // Create an instance of EditMetadataAction
    EditMetadataAction editMetadataAction = new EditMetadataAction();

    // Assert that actionRequiresLogin() returns true
    assertTrue(editMetadataAction.actionRequiresLogin());
}

// Test case 8: Test if actionRequiresLogin() returns false when user session is not expired and user is authorized
@Test
public void testActionRequiresLoginWhenUserAuthorized() {
    // Create a mock HttpServletRequest object with a valid user session and authorization
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(false)).thenReturn(session);
    when(session.isNew()).thenReturn(false);
    when(session.getLastAccessedTime()).thenReturn(System.currentTimeMillis() - (10 * 60 * 1000)); // Set last accessed time to 10 minutes ago
    when(AuthenticationTools.isAuthenticated(request)).thenReturn(true);
    when(AuthenticationTools.isAuthorized(request)).thenReturn(true);

    // Create an instance of EditMetadataAction
    EditMetadataAction editMetadataAction = new EditMetadataAction();

    // Assert that actionRequiresLogin() returns false
    assertFalse(editMetadataAction.actionRequiresLogin());
}

// Test case 9: Test if actionRequiresLogin() returns true when user session is not expired but user is not authenticated or authorized
@Test
public void testActionRequiresLoginWhenUserNotAuthenticatedOrAuthorized() {
    // Create a mock HttpServletRequest object with a valid user session but no authentication or authorization
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(false)).thenReturn(session);
    when(session.isNew()).thenReturn(false);
    when(session.getLastAccessedTime()).thenReturn(System.currentTimeMillis() - (10 * 60 * 1000)); // Set last accessed time to 10 minutes ago
    when(AuthenticationTools.isAuthenticated(request)).thenReturn(false);
    when(AuthenticationTools.isAuthorized(request)).thenReturn(false);

    // Create an instance of EditMetadataAction
    EditMetadataAction editMetadataAction = new EditMetadataAction();

    // Assert that actionRequiresLogin() returns true
    assertTrue(editMetadataAction.actionRequiresLogin());
}

// Test case 10: Test if actionRequiresLogin() returns true when HttpServletRequest object is null
@Test
public void testActionRequiresLoginWhenHttpServletRequestIsNull() {
    // Create an instance of EditMetadataAction
    EditMetadataAction editMetadataAction = new EditMetadataAction();

    // Assert that actionRequiresLogin() returns true
    assertTrue(editMetadataAction.actionRequiresLogin());
}