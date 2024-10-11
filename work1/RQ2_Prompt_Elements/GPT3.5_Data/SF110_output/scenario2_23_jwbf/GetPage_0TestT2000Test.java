// Here is an example of how you can write unit tests for the GetPage class.

@Test
void testHasMoreMessagesReturnsTrueWhenCalledFirstTime() {
    GetPage getPage = new GetPage();
    assertTrue(getPage.hasMoreMessages());
}

@Test
void testHasMoreMessagesReturnsFalseWhenCalledSecondTime() {
    GetPage getPage = new GetPage();
    getPage.hasMoreMessages();
    assertFalse(getPage.hasMoreMessages());
}

@Test
void testHasMoreMessagesReturnsFalseWhenCalledMultipleTimes() {
    GetPage getPage = new GetPage();
    getPage.hasMoreMessages();
    getPage.hasMoreMessages();
    getPage.hasMoreMessages();
    assertFalse(getPage.hasMoreMessages());
}

@Test
void testHasMoreMessagesReturnsTrueWhenCalledAfterReset() {
    GetPage getPage = new GetPage();
    getPage.hasMoreMessages();
    getPage.reset();
    assertTrue(getPage.hasMoreMessages());
}

@Test
void testHasMoreMessagesReturnsFalseWhenCalledAfterResetAndSecondCall() {
    GetPage getPage = new GetPage();
    getPage.hasMoreMessages();
    getPage.reset();
    getPage.hasMoreMessages();
    assertFalse(getPage.hasMoreMessages());
}

@Test
void testHasMoreMessagesReturnsFalseWhenCalledAfterResetAndMultipleCalls() {
    GetPage getPage = new GetPage();
    getPage.hasMoreMessages();
    getPage.reset();
    getPage.hasMoreMessages();
    getPage.hasMoreMessages();
    getPage.hasMoreMessages();
    assertFalse(getPage.hasMoreMessages());
}

@Test
void testHasMoreMessagesReturnsFalseWhenCalledAfterAllMessagesAreRead() {
    GetPage getPage = new GetPage();
    getPage.hasMoreMessages();
    getPage.hasMoreMessages();
    getPage.hasMoreMessages();
    getPage.hasMoreMessages();
    getPage.hasMoreMessages();
    assertFalse(getPage.hasMoreMessages());
}

@Test
void testHasMoreMessagesReturnsFalseWhenCalledWithoutCallingHasMoreMessagesFirst() {
    GetPage getPage = new GetPage();
    assertFalse(getPage.hasMoreMessages());
}

@Test
void testHasMoreMessagesReturnsFalseWhenCalledAfterExceptionIsThrown() {
    GetPage getPage = new GetPage();
    getPage.hasMoreMessages();
    getPage.process(new HttpAction() {
        @Override
        public String getResponseAsString() throws ProcessException {
            throw new ProcessException("Test exception");
        }
    });
    assertFalse(getPage.hasMoreMessages());
}

@Test
void testHasMoreMessagesReturnsTrueWhenCalledAfterExceptionIsThrownAndReset() {
    GetPage getPage = new GetPage();
    getPage.hasMoreMessages();
    getPage.process(new HttpAction() {
        @Override
        public String getResponseAsString() throws ProcessException {
            throw new ProcessException("Test exception");
        }
    });
    getPage.reset();
    assertTrue(getPage.hasMoreMessages());
}