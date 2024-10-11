@Test
void testGetToolTipText_InsideScrollArea() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertEquals("Scroll Area Tooltip", tooltip);
}

@Test
void testGetToolTipText_OutsideScrollArea() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 150, 150, 0, false));
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_NullToolTipText() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_MouseEventHandlingBackground() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");
    aboutPanel.setMouseEventHandling(AboutPanel.MOUSE_BACKGROUND);

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_MouseEventHandlingScrollArea() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");
    aboutPanel.setMouseEventHandling(AboutPanel.MOUSE_SCROLLAREA);

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertEquals("Scroll Area Tooltip", tooltip);
}

@Test
void testGetToolTipText_MouseEventHandlingDisabled() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");
    aboutPanel.setMouseEventHandling(AboutPanel.MOUSE_DISABLED);

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_NullMouseEvent() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");

    String tooltip = aboutPanel.getToolTipText(null);
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_NullScrollArea() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_EmptyScrollAreaToolTipText() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("");

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertEquals("", tooltip);
}