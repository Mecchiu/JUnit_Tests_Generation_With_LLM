@Test
void testActionRequiresLogin() {
    // Create a new instance of the EditCopyrightHolderAction
    Action action = new EditCopyrightHolderAction();
    
    // Test that the action requires login
    assertTrue(action.actionRequiresLogin());
}
}