// Test case for EditContextURLAction.actionRequiresLogin() method
class EditContextURLActionTest {

    @Test
    void testActionRequiresLogin() {
        EditContextURLAction editContextURLAction = new EditContextURLAction();
        assertTrue(editContextURLAction.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginFalse() {
        EditContextURLAction editContextURLAction = new EditContextURLAction();
        assertFalse(!editContextURLAction.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginNull() {
        EditContextURLAction editContextURLAction = null;
        assertThrows(NullPointerException.class, () -> {
            editContextURLAction.actionRequiresLogin();
        });
    }

    @Test
    void testActionRequiresLoginMultipleTimes() {
        EditContextURLAction editContextURLAction = new EditContextURLAction();
        assertTrue(editContextURLAction.actionRequiresLogin());
        assertTrue(editContextURLAction.actionRequiresLogin());
        assertTrue(editContextURLAction.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginMultipleTimesFalse() {
        EditContextURLAction editContextURLAction = new EditContextURLAction();
        assertFalse(!editContextURLAction.actionRequiresLogin());
        assertFalse(!editContextURLAction.actionRequiresLogin());
        assertFalse(!editContextURLAction.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithMetadata() {
        EditContextURLAction editContextURLAction = new EditContextURLAction();
        CompleteMetadataBean completeMetadataBean = new CompleteMetadataBean();
        ContextURLBean contextURLBean = new ContextURLBean();
        contextURLBean.setContextURL("http://example.com");
        completeMetadataBean.setContextURL(contextURLBean);
        assertFalse(!editContextURLAction.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithMetadataNull() {
        EditContextURLAction editContextURLAction = new EditContextURLAction();
        CompleteMetadataBean completeMetadataBean = null;
        assertFalse(!editContextURLAction.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithMetadataEmpty() {
        EditContextURLAction editContextURLAction = new EditContextURLAction();
        CompleteMetadataBean completeMetadataBean = new CompleteMetadataBean();
        assertFalse(!editContextURLAction.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithMetadataNoContextURL() {
        EditContextURLAction editContextURLAction = new EditContextURLAction();
        CompleteMetadataBean completeMetadataBean = new CompleteMetadataBean();
        assertFalse(!editContextURLAction.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithMetadataNoContextURLValue() {
        EditContextURLAction editContextURLAction = new EditContextURLAction();
        CompleteMetadataBean completeMetadataBean = new CompleteMetadataBean();
        ContextURLBean contextURLBean = new ContextURLBean();
        completeMetadataBean.setContextURL(contextURLBean);
        assertFalse(!editContextURLAction.actionRequiresLogin());
    }
}