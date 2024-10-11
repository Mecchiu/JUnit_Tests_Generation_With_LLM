// Test case 1: Test if getCloseAction() returns a non-null object
@Test
void testGetCloseActionNotNull() {
    assertNotNull(Main.getCloseAction());
}

// Test case 2: Test if getCloseAction() returns an instance of CloseAction
@Test
void testGetCloseActionInstance() {
    assertTrue(Main.getCloseAction() instanceof CloseAction);
}

// Test case 3: Test if getCloseAction() returns the same instance every time it is called
@Test
void testGetCloseActionSameInstance() {
    CloseAction closeAction1 = Main.getCloseAction();
    CloseAction closeAction2 = Main.getCloseAction();
    assertSame(closeAction1, closeAction2);
}

// Test case 4: Test if the CloseAction instance returned by getCloseAction() has the correct name
@Test
void testGetCloseActionName() {
    assertEquals("Close", Main.getCloseAction().getValue("Name"));
}

// Test case 5: Test if the CloseAction instance returned by getCloseAction() has the correct mnemonic key
@Test
void testGetCloseActionMnemonic() {
    assertEquals('C', Main.getCloseAction().getValue("MnemonicKey"));
}

// Test case 6: Test if the CloseAction instance returned by getCloseAction() has the correct tooltip text
@Test
void testGetCloseActionTooltip() {
    assertEquals("Close the current move", Main.getCloseAction().getValue("ShortDescription"));
}

// Test case 7: Test if the CloseAction instance returned by getCloseAction() has the correct icon
@Test
void testGetCloseActionIcon() {
    assertNotNull(Main.getCloseAction().getValue("SmallIcon"));
}

// Test case 8: Test if the CloseAction instance returned by getCloseAction() has the correct accelerator key
@Test
void testGetCloseActionAccelerator() {
    assertEquals("control W", Main.getCloseAction().getValue("AcceleratorKey"));
}

// Test case 9: Test if the CloseAction instance returned by getCloseAction() has the correct enabled state
@Test
void testGetCloseActionEnabled() {
    assertTrue(Main.getCloseAction().isEnabled());
}

// Test case 10: Test if the CloseAction instance returned by getCloseAction() has the correct selection state
@Test
void testGetCloseActionSelected() {
    assertFalse(Main.getCloseAction().isSelected());
}