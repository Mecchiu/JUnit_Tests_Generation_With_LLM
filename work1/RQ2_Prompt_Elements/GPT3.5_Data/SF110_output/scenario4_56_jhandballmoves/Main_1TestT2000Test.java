// Test case 1: Test if the window instance is not null
@Test
void testGetWindowNotNull() {
    assertNotNull(Main.getWindow());
}

// Test case 2: Test if the window instance is of type JFrame
@Test
void testGetWindowType() {
    assertTrue(Main.getWindow() instanceof JFrame);
}

// Test case 3: Test if the window title is set correctly
@Test
void testGetWindowTitle() {
    assertEquals("Handball Moves Visualizer", Main.getWindow().getTitle());
}

// Test case 4: Test if the window is visible
@Test
void testGetWindowVisibility() {
    assertTrue(Main.getWindow().isVisible());
}

// Test case 5: Test if the window is resizable
@Test
void testGetWindowResizable() {
    assertTrue(Main.getWindow().isResizable());
}

// Test case 6: Test if the window has a default close operation set
@Test
void testGetWindowCloseOperation() {
    assertEquals(JFrame.EXIT_ON_CLOSE, Main.getWindow().getDefaultCloseOperation());
}

// Test case 7: Test if the window has a menu bar
@Test
void testGetWindowMenuBar() {
    assertNotNull(Main.getWindow().getJMenuBar());
}

// Test case 8: Test if the window has a tool bar
@Test
void testGetWindowToolBar() {
    assertNotNull(Main.getWindow().getComponent(1));
}

// Test case 9: Test if the window has a desktop pane
@Test
void testGetWindowDesktopPane() {
    assertNotNull(Main.getWindow().getComponent(0));
}

// Test case 10: Test if the window has a status bar
@Test
void testGetWindowStatusBar() {
    assertNotNull(Main.getWindow().getComponent(2));
}