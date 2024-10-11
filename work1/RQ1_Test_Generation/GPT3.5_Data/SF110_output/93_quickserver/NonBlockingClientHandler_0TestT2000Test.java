@Test
void testGetWakeupSelectorAfterRegisterWrite() {
    NonBlockingClientHandler.setWakeupSelectorAfterRegisterWrite(true);
    assertTrue(NonBlockingClientHandler.getWakeupSelectorAfterRegisterWrite());

    NonBlockingClientHandler.setWakeupSelectorAfterRegisterWrite(false);
    assertFalse(NonBlockingClientHandler.getWakeupSelectorAfterRegisterWrite());
}