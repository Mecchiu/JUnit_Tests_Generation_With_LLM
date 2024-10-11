// Test cases for ModifyMetadataAction#actionRequiresLogin() method
class ModifyMetadataActionTest {

    @Test
    void testActionRequiresLogin() {
        ModifyMetadataAction action = new ModifyMetadataAction();
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionDoesNotRequireLogin() {
        ModifyMetadataAction action = new ModifyMetadataAction();
        assertFalse(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithNullAuthentication() {
        ModifyMetadataAction action = new ModifyMetadataAction();
        AuthenticationTools.setAuthentication(null);
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithValidAuthentication() {
        ModifyMetadataAction action = new ModifyMetadataAction();
        AuthenticationTools.setAuthentication("validUser");
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithInvalidAuthentication() {
        ModifyMetadataAction action = new ModifyMetadataAction();
        AuthenticationTools.setAuthentication("invalidUser");
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithEmptyAuthentication() {
        ModifyMetadataAction action = new ModifyMetadataAction();
        AuthenticationTools.setAuthentication("");
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithWhitespaceAuthentication() {
        ModifyMetadataAction action = new ModifyMetadataAction();
        AuthenticationTools.setAuthentication("   ");
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithMixedCaseAuthentication() {
        ModifyMetadataAction action = new ModifyMetadataAction();
        AuthenticationTools.setAuthentication("VaLiDuSeR");
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithSpecialCharactersAuthentication() {
        ModifyMetadataAction action = new ModifyMetadataAction();
        AuthenticationTools.setAuthentication("!@#$%^&*()");
        assertTrue(action.actionRequiresLogin());
    }
}