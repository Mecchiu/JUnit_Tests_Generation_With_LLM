```java
    @Test
    void testCreateDialog_WithOkListener() {
        JFontChooser fontChooser = new JFontChooser();
        ActionListener okListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // OK button action
            }
        };
        JDialog dialog = fontChooser.createDialog(new JPanel(), "Choose Font", true, okListener, null);
        assertNotNull(dialog);
    }

    @Test
    void testCreateDialog_WithCancelListener() {
        JFontChooser fontChooser = new JFontChooser();
        ActionListener cancelListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cancel button action
            }
        };
        JDialog dialog = fontChooser.createDialog(new JPanel(), "Choose Font", true, null, cancelListener);
        assertNotNull(dialog);
    }

    @Test
    void testCreateDialog_WithOkAndCancelListeners() {
        JFontChooser fontChooser = new JFontChooser();
        ActionListener okListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // OK button action
            }
        };
        ActionListener cancelListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cancel button action
            }
        };
        JDialog dialog = fontChooser.createDialog(new JPanel(), "Choose Font", true, okListener, cancelListener);
        assertNotNull(dialog);
    }

    @Test
    void testCreateDialog_WithoutListeners() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JPanel(), "Choose Font", true, null, null);
        assertNotNull(dialog);
    }

    @Test
    void testCreateDialog_WithNullComponent() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Choose Font", true, null, null);
        assertNotNull(dialog);
    }

    @Test
    void testCreateDialog_WithEmptyTitle() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JPanel(), "", true, null, null);
        assertNotNull(dialog);
    }

    @Test
    void testCreateDialog_WithNullTitle() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JPanel(), null, true, null, null);
        assertNotNull(dialog);
    }

    @Test
    void testCreateDialog_WithNonModal() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JPanel(), "Choose Font", false, null, null);
        assertNotNull(dialog);
    }

    @Test
    void testCreateDialog_WithNullChooserPane() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JPanel(), "Choose Font", true, null, null);
        assertNotNull(dialog);
    }

    @Test
    void testCreateDialog_Visibility() {
        JFontChooser fontChooser = new JFontChooser();
        ActionListener okListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // OK button action
            }
        };
        JDialog dialog = fontChooser.createDialog(new JPanel(), "Choose Font", true, okListener, null);
        dialog.setVisible(true);
        assertTrue(dialog.isVisible());
    }
```
