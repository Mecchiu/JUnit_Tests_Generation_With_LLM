@Test
void testActionRequiresLogin() {
    ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
    assertTrue(action.actionRequiresLogin(), "actionRequiresLogin should return true");
    // Test with a user that is not logged in
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession()).thenReturn(session);
    when(session.getAttribute("user")).thenReturn(null);
    assertTrue(action.execute(request, response), "execute should return true when user is not logged in");
    // Test with a user that is logged in
    User user = new User("testuser", "password");
    when(session.getAttribute("user")).thenReturn(user);
    assertFalse(action.execute(request, response), "execute should return false when user is logged in");
}
}