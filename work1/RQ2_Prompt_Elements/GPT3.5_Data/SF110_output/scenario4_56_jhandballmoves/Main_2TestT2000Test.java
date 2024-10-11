// Test case 1: Test if getField() method returns a non-null object
@Test
void testGetFieldNotNull() {
    assertNotNull(Main.getField());
}

// Test case 2: Test if getField() method returns an object of type Field
@Test
void testGetFieldInstance() {
    assertTrue(Main.getField() instanceof Field);
}

// Test case 3: Test if getField() method returns the same instance every time it is called
@Test
void testGetFieldSameInstance() {
    Field field1 = Main.getField();
    Field field2 = Main.getField();
    assertSame(field1, field2);
}

// Test case 4: Test if getField() method returns an object with a non-null background color
@Test
void testGetFieldBackgroundColor() {
    assertNotNull(Main.getField().getBackground());
}

// Test case 5: Test if getField() method returns an object with a preferred size of 800x600
@Test
void testGetFieldPreferredSize() {
    assertEquals(new Dimension(800, 600), Main.getField().getPreferredSize());
}

// Test case 6: Test if getField() method returns an object with a non-null MouseController
@Test
void testGetFieldMouseController() {
    assertNotNull(Main.getField().getMouseController());
}

// Test case 7: Test if getField() method returns an object with a non-null CommentController
@Test
void testGetFieldCommentController() {
    assertNotNull(Main.getField().getCommentController());
}

// Test case 8: Test if getField() method returns an object with a non-null TableHandballModel
@Test
void testGetFieldTableHandballModel() {
    assertNotNull(Main.getField().getTableHandballModel());
}

// Test case 9: Test if getField() method returns an object with a non-null PlayerToolBar
@Test
void testGetFieldPlayerToolBar() {
    assertNotNull(Main.getField().getPlayerToolBar());
}

// Test case 10: Test if getField() method returns an object with a non-null JToolBar
@Test
void testGetFieldJToolBar() {
    assertNotNull(Main.getField().getJToolBar());
}