```java
class ConditionalBorder_0Test {

    @Test
    void testGetBorderInsets_WithZeroThickness() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    @Test
    void testGetBorderInsets_WithPositiveThickness() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(2, insets.top);
        assertEquals(2, insets.left);
        assertEquals(2, insets.bottom);
        assertEquals(2, insets.right);
    }

    @Test
    void testGetBorderInsets_WithPositiveInnerThickness() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
        Insets insets = border.getBorderInsets(null);
        assertEquals(3, insets.top);
        assertEquals(3, insets.left);
        assertEquals(3, insets.bottom);
        assertEquals(3, insets.right);
    }

    @Test
    void testGetBorderInsets_WithNegativeThickness() {
        assertThrows(IllegalArgumentException.class, () -> new ConditionalBorder(Color.BLACK, -1, 0));
    }

    @Test
    void testGetBorderInsets_WithNegativeInnerThickness() {
        assertThrows(IllegalArgumentException.class, () -> new ConditionalBorder(Color.BLACK, 2, -1));
    }

    @Test
    void testGetBorderInsets_WithNegativeThicknessAndInnerThickness() {
        assertThrows(IllegalArgumentException.class, () -> new ConditionalBorder(Color.BLACK, -1, -1));
    }

    @Test
    void testGetBorderInsets_WithZeroThicknessAndPositiveInnerThickness() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0, 1);
        Insets insets = border.getBorderInsets(null);
        assertEquals(1, insets.top);
        assertEquals(1, insets.left);
        assertEquals(1, insets.bottom);
        assertEquals(1, insets.right);
    }

    @Test
    void testGetBorderInsets_WithPositiveThicknessAndNegativeInnerThickness() {
        assertThrows(IllegalArgumentException.class, () -> new ConditionalBorder(Color.BLACK, 2, -1));
    }

    @Test
    void testGetBorderInsets_WithZeroThicknessAndNegativeInnerThickness() {
        assertThrows(IllegalArgumentException.class, () -> new ConditionalBorder(Color.BLACK, 0, -1));
    }

    @Test
    void testGetBorderInsets_WithNegativeThicknessAndZeroInnerThickness() {
        assertThrows(IllegalArgumentException.class, () -> new ConditionalBorder(Color.BLACK, -1, 0));
    }
}
```
```