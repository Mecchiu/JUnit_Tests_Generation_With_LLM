```java
class IconManager_6Test {
    
    @Test
    void testGetIcon_NullContent() {
        IconManager iconManager = IconManager.getInstance();
        Icon icon = iconManager.getIcon(null, 50, null);
        assertNull(icon);
    }

    @Test
    void testGetIcon_ErrorIcon() {
        IconManager iconManager = IconManager.getInstance();
        Icon errorIcon = iconManager.getErrorIcon(50);
        Icon icon = iconManager.getIcon(iconManager.getErrorIconContent(), 50, null);
        assertEquals(errorIcon, icon);
    }

    @Test
    void testGetIcon_WaitIcon() {
        IconManager iconManager = IconManager.getInstance();
        Icon waitIcon = iconManager.getWaitIcon(50);
        Icon icon = iconManager.getIcon(iconManager.getWaitIconContent(), 50, null);
        assertEquals(waitIcon, icon);
    }

    @Test
    void testGetIcon_ImmediateLoading() {
        IconManager iconManager = IconManager.getInstance();
        Icon icon = iconManager.getIcon(iconManager.getErrorIconContent(), 50, null);
        assertNotNull(icon);
    }

    @Test
    void testGetIcon_DelayedLoading() {
        IconManager iconManager = IconManager.getInstance();
        Icon icon = iconManager.getIcon(new ResourceURLContent(IconManager.class, "resources/icons/tango/image-missing.png"), 50, new Component() {
            @Override
            public void paint(Graphics g) {
            }
        });
        assertNotNull(icon);
    }

    @Test
    void testGetIcon_SameContentSameHeight() {
        IconManager iconManager = IconManager.getInstance();
        Icon icon1 = iconManager.getIcon(new ResourceURLContent(IconManager.class, "resources/icons/tango/image-missing.png"), 50, null);
        Icon icon2 = iconManager.getIcon(new ResourceURLContent(IconManager.class, "resources/icons/tango/image-missing.png"), 50, null);
        assertEquals(icon1, icon2);
    }

    @Test
    void testGetIcon_SameContentDifferentHeight() {
        IconManager iconManager = IconManager.getInstance();
        Icon icon1 = iconManager.getIcon(new ResourceURLContent(IconManager.class, "resources/icons/tango/image-missing.png"), 50, null);
        Icon icon2 = iconManager.getIcon(new ResourceURLContent(IconManager.class, "resources/icons/tango/image-missing.png"), 100, null);
        assertNotEquals(icon1, icon2);
    }

    @Test
    void testGetIcon_MultipleThreads() {
        IconManager iconManager = IconManager.getInstance();
        Icon icon1 = iconManager.getIcon(new ResourceURLContent(IconManager.class, "resources/icons/tango/image-missing.png"), 50, new Component() {
            @Override
            public void paint(Graphics g) {
            }
        });
        Icon icon2 = iconManager.getIcon(new ResourceURLContent(IconManager.class, "resources/icons/tango/image-missing.png"), 50, new Component() {
            @Override
            public void paint(Graphics g) {
            }
        });
        assertNotEquals(icon1, icon2);
    }

    @Test
    void testIsErrorIcon() {
        IconManager iconManager = IconManager.getInstance();
        Icon errorIcon = iconManager.getErrorIcon(50);
        assertTrue(iconManager.isErrorIcon(errorIcon));
    }

    @Test
    void testIsWaitIcon() {
        IconManager iconManager = IconManager.getInstance();
        Icon waitIcon = iconManager.getWaitIcon(50);
        assertTrue(iconManager.isWaitIcon(waitIcon));
    }
}
```
```