```java
    @Test
    void testShowDialog_FontSelected() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select Font");
        assertNotNull(selectedFont);
    }

    @Test
    void testShowDialog_FontNotSelected() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select Font");
        assertNull(selectedFont);
    }

    @Test
    void testShowDialog_TitleNotNull() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select Font");
        assertNotNull(selectedFont);
    }

    @Test
    void testShowDialog_TitleNull() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, null);
        assertNotNull(selectedFont);
    }

    @Test
    void testShowDialog_ComponentNotNull() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(new JPanel(), "Select Font");
        assertNotNull(selectedFont);
    }

    @Test
    void testShowDialog_ComponentNull() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select Font");
        assertNotNull(selectedFont);
    }

    @Test
    void testShowDialog_ModalTrue() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select Font");
        assertNotNull(selectedFont);
    }

    @Test
    void testShowDialog_ModalFalse() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select Font");
        assertNotNull(selectedFont);
    }

    @Test
    void testShowDialog_OkButtonPressed() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select Font");
        assertNotNull(selectedFont);
    }

    @Test
    void testShowDialog_CancelButtonPressed() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select Font");
        assertNull(selectedFont);
    }
}
```