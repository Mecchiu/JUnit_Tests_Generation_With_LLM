// Test case for actionRequiresLogin() method when login is required
@Test
public void testActionRequiresLoginTrue() {
    Action action = new EditCopyrightHolderAction();
    assertTrue(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method when login is not required
@Test
public void testActionRequiresLoginFalse() {
    Action action = new EditCopyrightHolderAction();
    assertFalse(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method when servlet is null
@Test
public void testActionRequiresLoginNullServlet() {
    Action action = new EditCopyrightHolderAction();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    assertThrows(NullPointerException.class, () -> {
        action.perform(null, request, response);
    });
}

// Test case for actionRequiresLogin() method when request is null
@Test
public void testActionRequiresLoginNullRequest() {
    Action action = new EditCopyrightHolderAction();
    HttpServlet servlet = mock(HttpServlet.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    assertThrows(NullPointerException.class, () -> {
        action.perform(servlet, null, response);
    });
}

// Test case for actionRequiresLogin() method when response is null
@Test
public void testActionRequiresLoginNullResponse() {
    Action action = new EditCopyrightHolderAction();
    HttpServlet servlet = mock(HttpServlet.class);
    HttpServletRequest request = mock(HttpServletRequest.class);
    assertThrows(NullPointerException.class, () -> {
        action.perform(servlet, request, null);
    });
}

// Test case for actionRequiresLogin() method when all parameters are null
@Test
public void testActionRequiresLoginAllNull() {
    Action action = new EditCopyrightHolderAction();
    assertThrows(NullPointerException.class, () -> {
        action.perform(null, null, null);
    });
}

// Test case for actionRequiresLogin() method when CompleteMetadataBean is null
@Test
public void testActionRequiresLoginNullCompleteMetadataBean() {
    Action action = new EditCopyrightHolderAction();
    HttpServlet servlet = mock(HttpServlet.class);
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    assertThrows(NullPointerException.class, () -> {
        action.perform(servlet, request, response);
    });
}

// Test case for actionRequiresLogin() method when CopyrightHolderBean is null
@Test
public void testActionRequiresLoginNullCopyrightHolderBean() {
    Action action = new EditCopyrightHolderAction();
    HttpServlet servlet = mock(HttpServlet.class);
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    CompleteMetadataBean completeMetadataBean = mock(CompleteMetadataBean.class);
    when(completeMetadataBean.getCopyrightHolder()).thenReturn(null);
    request.setAttribute("metadata", completeMetadataBean);
    assertThrows(NullPointerException.class, () -> {
        action.perform(servlet, request, response);
    });
}

// Test case for actionRequiresLogin() method when CopyrightHolderBean is not null
@Test
public void testActionRequiresLoginNotNullCopyrightHolderBean() {
    Action action = new EditCopyrightHolderAction();
    HttpServlet servlet = mock(HttpServlet.class);
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    CompleteMetadataBean completeMetadataBean = mock(CompleteMetadataBean.class);
    CopyrightHolderBean copyrightHolderBean = mock(CopyrightHolderBean.class);
    when(completeMetadataBean.getCopyrightHolder()).thenReturn(copyrightHolderBean);
    request.setAttribute("metadata", completeMetadataBean);
    assertFalse(action.actionRequiresLogin());
}