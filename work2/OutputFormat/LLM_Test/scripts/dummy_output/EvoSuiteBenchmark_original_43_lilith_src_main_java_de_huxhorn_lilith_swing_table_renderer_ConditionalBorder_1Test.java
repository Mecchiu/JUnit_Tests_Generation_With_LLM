package de.huxhorn.lilith.swing.table.renderer;
java
class ConditionalBorder_1Test {

    @Test
    void testGetBorderInsets() {
        // Test case 1
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
        Component component1 = new Component() {};
        Insets insets1 = new Insets(0, 0, 0, 0);
        Insets result1 = border.getBorderInsets(component1, insets1);
        assertEquals(3, result1.left);
        assertEquals(3, result1.top);
        assertEquals(3, result1.right);
        assertEquals(3, result1.bottom);

        // Test case 2
        ConditionalBorder border2 = new ConditionalBorder(Color.RED, 1, 0);
        Component component2 = new Component() {};
        Insets insets2 = new Insets(0, 0, 0, 0);
        Insets result2 = border2.getBorderInsets(component2, insets2);
        assertEquals(1, result2.left);
        assertEquals(1, result2.top);
        assertEquals(1, result2.right);
        assertEquals(1, result2.bottom);

        // Add more test cases as needed
    }
}
