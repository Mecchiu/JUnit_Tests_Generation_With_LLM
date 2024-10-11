// Test case for actionRequiresLogin() method when login is required
@Test
void testActionRequiresLoginTrue() {
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertTrue(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method when login is not required
@Test
void testActionRequiresLoginFalse() {
    ModifyMetadataAction action = new ModifyMetadataAction();
    assertFalse(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method with null authentication tools
@Test
void testActionRequiresLoginNullAuthenticationTools() {
    ModifyMetadataAction action = new ModifyMetadataAction();
    AuthenticationTools.setInstance(null);
    assertTrue(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method with authentication tools that do not require login
@Test
void testActionRequiresLoginNoLoginRequired() {
    ModifyMetadataAction action = new ModifyMetadataAction();
    AuthenticationTools.setInstance(new AuthenticationTools() {
        @Override
        public boolean isLoginRequired(HttpServletRequest request) {
            return false;
        }
    });
    assertFalse(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method with authentication tools that require login
@Test
void testActionRequiresLoginLoginRequired() {
    ModifyMetadataAction action = new ModifyMetadataAction();
    AuthenticationTools.setInstance(new AuthenticationTools() {
        @Override
        public boolean isLoginRequired(HttpServletRequest request) {
            return true;
        }
    });
    assertTrue(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method with null request
@Test
void testActionRequiresLoginNullRequest() {
    ModifyMetadataAction action = new ModifyMetadataAction();
    AuthenticationTools.setInstance(new AuthenticationTools() {
        @Override
        public boolean isLoginRequired(HttpServletRequest request) {
            return true;
        }
    });
    assertFalse(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method with null session
@Test
void testActionRequiresLoginNullSession() {
    ModifyMetadataAction action = new ModifyMetadataAction();
    AuthenticationTools.setInstance(new AuthenticationTools() {
        @Override
        public boolean isLoginRequired(HttpServletRequest request) {
            return true;
        }
    });
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getSession(false)).thenReturn(null);
    assertFalse(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method with session that does not require login
@Test
void testActionRequiresLoginSessionNoLoginRequired() {
    ModifyMetadataAction action = new ModifyMetadataAction();
    AuthenticationTools.setInstance(new AuthenticationTools() {
        @Override
        public boolean isLoginRequired(HttpServletRequest request) {
            return true;
        }
    });
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(false)).thenReturn(session);
    when(session.getAttribute("loginRequired")).thenReturn(false);
    assertFalse(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method with session that requires login
@Test
void testActionRequiresLoginSessionLoginRequired() {
    ModifyMetadataAction action = new ModifyMetadataAction();
    AuthenticationTools.setInstance(new AuthenticationTools() {
        @Override
        public boolean isLoginRequired(HttpServletRequest request) {
            return true;
        }
    });
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(false)).thenReturn(session);
    when(session.getAttribute("loginRequired")).thenReturn(true);
    assertTrue(action.actionRequiresLogin());
}

// Test case for actionRequiresLogin() method with exception thrown
@Test
void testActionRequiresLoginException() {
    ModifyMetadataAction action = new ModifyMetadataAction();
    AuthenticationTools.setInstance(new AuthenticationTools() {
        @Override
        public boolean isLoginRequired(HttpServletRequest request) {
            throw new RuntimeException("Test Exception");
        }
    });
    assertTrue(action.actionRequiresLogin());
}