```java
class IconManager_5Test {
    
    @Test
    void testGetIcon_NullContent_ReturnsEmptyIcon() {
        IconManager iconManager = IconManager.getInstance();
        Icon icon = iconManager.getIcon(null, null);
        assertNotNull(icon);
        assertEquals(0, icon.getIconWidth());
        assertEquals(0, icon.getIconHeight());
    }

    @Test
    void testGetIcon_ErrorContent_ReturnsErrorIcon() {
        IconManager iconManager = IconManager.getInstance();
        Icon errorIcon = iconManager.getErrorIcon();
        Icon icon = iconManager.getIcon(iconManager.getErrorIconContent(), null);
        assertNotNull(icon);
        assertEquals(errorIcon, icon);
    }

    @Test
    void testGetIcon_WaitContent_ReturnsWaitIcon() {
        IconManager iconManager = IconManager.getInstance();
        Icon waitIcon = iconManager.getWaitIcon();
        Icon icon = iconManager.getIcon(iconManager.getWaitIconContent(), null);
        assertNotNull(icon);
        assertEquals(waitIcon, icon);
    }

    @Test
    void testGetIcon_ExistingContent_ReturnsIcon() {
        IconManager iconManager = IconManager.getInstance();
        Content content = new ResourceURLContent(IconManager.class, "resources/icons/tango/image-missing.png");
        Icon icon = iconManager.getIcon(content, null);
        assertNotNull(icon);
        assertNotEquals(iconManager.getErrorIcon(), icon);
        assertNotEquals(iconManager.getWaitIcon(), icon);
    }

    @Test
    void testGetIcon_ExistingContentWithHeight_ReturnsScaledIcon() {
        IconManager iconManager = IconManager.getInstance();
        Content content = new ResourceURLContent(IconManager.class, "resources/icons/tango/image-missing.png");
        int height = 50;
        Icon icon = iconManager.getIcon(content, height, null);
        assertNotNull(icon);
        assertEquals(height, icon.getIconHeight());
    }

    @Test
    void testGetIcon_ExistingContentWithWaitingComponent_ReturnsIcon() {
        IconManager iconManager = IconManager.getInstance();
        Content content = new ResourceURLContent(IconManager.class, "resources/icons/tango/image-missing.png");
        Component waitingComponent = new Component() {
            @Override
            public void paint(Graphics g) {
            }
        };
        Icon icon = iconManager.getIcon(content, waitingComponent);
        assertNotNull(icon);
        assertNotEquals(iconManager.getErrorIcon(), icon);
        assertNotEquals(iconManager.getWaitIcon(), icon);
    }

    @Test
    void testGetIcon_ErrorContentWithHeight_ReturnsScaledErrorIcon() {
        IconManager iconManager = IconManager.getInstance();
        int height = 50;
        Icon errorIcon = iconManager.getErrorIcon(height);
        Icon icon = iconManager.getIcon(iconManager.getErrorIconContent(), height, null);
        assertNotNull(icon);
        assertEquals(height, icon.getIconHeight());
        assertEquals(errorIcon, icon);
    }

    @Test
    void testGetIcon_WaitContentWithHeight_ReturnsScaledWaitIcon() {
        IconManager iconManager = IconManager.getInstance();
        int height = 50;
        Icon waitIcon = iconManager.getWaitIcon(height);
        Icon icon = iconManager.getIcon(iconManager.getWaitIconContent(), height, null);
        assertNotNull(icon);
        assertEquals(height, icon.getIconHeight());
        assertEquals(waitIcon, icon);
    }

    @Test
    void testIsErrorIcon_ErrorIcon_ReturnsTrue() {
        IconManager iconManager = IconManager.getInstance();
        Icon errorIcon = iconManager.getErrorIcon();
        assertTrue(iconManager.isErrorIcon(errorIcon));
    }

    @Test
    void testIsWaitIcon_WaitIcon_ReturnsTrue() {
        IconManager iconManager = IconManager.getInstance();
        Icon waitIcon = iconManager.getWaitIcon();
        assertTrue(iconManager.isWaitIcon(waitIcon));
    }
}
```
