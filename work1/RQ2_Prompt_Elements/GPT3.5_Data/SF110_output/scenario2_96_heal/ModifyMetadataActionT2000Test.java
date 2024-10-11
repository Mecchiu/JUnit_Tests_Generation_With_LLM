// Test case for actionRequiresLogin() method when user is logged in
@Test
void testActionRequiresLoginLoggedIn() {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession().getAttribute("user")).thenReturn("testUser");
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin(request));
}

// Test case for actionRequiresLogin() method when user is not logged in
@Test
void testActionRequiresLoginNotLoggedIn() {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession().getAttribute("user")).thenReturn(null);
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin(request));
}

// Test case for actionRequiresLogin() method when user is logged in as admin
@Test
void testActionRequiresLoginAdmin() {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession().getAttribute("user")).thenReturn("admin");
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin(request));
}

// Test case for actionRequiresLogin() method when user is logged in as guest
@Test
void testActionRequiresLoginGuest() {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession().getAttribute("user")).thenReturn("guest");
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin(request));
}

// Test case for actionRequiresLogin() method when user is logged in as moderator
@Test
void testActionRequiresLoginModerator() {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession().getAttribute("user")).thenReturn("moderator");
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin(request));
}

// Test case for actionRequiresLogin() method when user is logged in as reviewer
@Test
void testActionRequiresLoginReviewer() {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession().getAttribute("user")).thenReturn("reviewer");
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin(request));
}

// Test case for actionRequiresLogin() method when user is logged in as author
@Test
void testActionRequiresLoginAuthor() {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession().getAttribute("user")).thenReturn("author");
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin(request));
}

// Test case for actionRequiresLogin() method when user is logged in as editor
@Test
void testActionRequiresLoginEditor() {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession().getAttribute("user")).thenReturn("editor");
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin(request));
}

// Test case for actionRequiresLogin() method when user is logged in as publisher
@Test
void testActionRequiresLoginPublisher() {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession().getAttribute("user")).thenReturn("publisher");
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin(request));
}

// Test case for actionRequiresLogin() method when user is logged in as subscriber
@Test
void testActionRequiresLoginSubscriber() {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession().getAttribute("user")).thenReturn("subscriber");
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin(request));
}