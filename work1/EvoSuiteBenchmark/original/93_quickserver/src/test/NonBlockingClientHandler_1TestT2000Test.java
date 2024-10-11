```java
    @Test
    void testGetWakeupSelectorAfterRegisterRead() {
        NonBlockingClientHandler.setWakeupSelectorAfterRegisterRead(true);
        assertTrue(NonBlockingClientHandler.getWakeupSelectorAfterRegisterRead());

        NonBlockingClientHandler.setWakeupSelectorAfterRegisterRead(false);
        assertFalse(NonBlockingClientHandler.getWakeupSelectorAfterRegisterRead());
    }
}
```