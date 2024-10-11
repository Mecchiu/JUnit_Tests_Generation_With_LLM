@Test
void testActionRequiresLogin() {
    // Create a new instance of the EditCopyrightHolderAction
    Action editAction = new EditCopyrightHolderAction();
    
    // Test that the action requires login
    assertTrue(editAction.actionRequiresLogin());
}
}