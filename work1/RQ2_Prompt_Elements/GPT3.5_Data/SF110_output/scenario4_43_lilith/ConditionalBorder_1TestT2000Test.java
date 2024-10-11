// Test case 1: Test getBorderInsets() with null component and null insets
@Test
public void testGetBorderInsets_NullComponent_NullInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Insets insets = border.getBorderInsets(null, null);
    assertNotNull(insets);
    assertEquals(2, insets.top);
    assertEquals(2, insets.bottom);
    assertEquals(2, insets.left);
    assertEquals(2, insets.right);
}

// Test case 2: Test getBorderInsets() with null component and non-null insets
@Test
public void testGetBorderInsets_NullComponent_NonNullInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Insets insets = new Insets(1, 1, 1, 1);
    Insets result = border.getBorderInsets(null, insets);
    assertSame(insets, result);
    assertEquals(2, insets.top);
    assertEquals(2, insets.bottom);
    assertEquals(2, insets.left);
    assertEquals(2, insets.right);
}

// Test case 3: Test getBorderInsets() with non-null component and null insets
@Test
public void testGetBorderInsets_NonNullComponent_NullInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {};
    Insets insets = border.getBorderInsets(component, null);
    assertNotNull(insets);
    assertEquals(2, insets.top);
    assertEquals(2, insets.bottom);
    assertEquals(2, insets.left);
    assertEquals(2, insets.right);
}

// Test case 4: Test getBorderInsets() with non-null component and non-null insets
@Test
public void testGetBorderInsets_NonNullComponent_NonNullInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {};
    Insets insets = new Insets(1, 1, 1, 1);
    Insets result = border.getBorderInsets(component, insets);
    assertSame(insets, result);
    assertEquals(2, insets.top);
    assertEquals(2, insets.bottom);
    assertEquals(2, insets.left);
    assertEquals(2, insets.right);
}

// Test case 5: Test getBorderInsets() with zero thickness and inner thickness
@Test
public void testGetBorderInsets_ZeroThicknessAndInnerThickness() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0, 0);
    Component component = new Component() {};
    Insets insets = border.getBorderInsets(component);
    assertNotNull(insets);
    assertEquals(0, insets.top);
    assertEquals(0, insets.bottom);
    assertEquals(0, insets.left);
    assertEquals(0, insets.right);
}

// Test case 6: Test getBorderInsets() with non-zero thickness and zero inner thickness
@Test
public void testGetBorderInsets_NonZeroThicknessAndZeroInnerThickness() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 0);
    Component component = new Component() {};
    Insets insets = border.getBorderInsets(component);
    assertNotNull(insets);
    assertEquals(2, insets.top);
    assertEquals(2, insets.bottom);
    assertEquals(2, insets.left);
    assertEquals(2, insets.right);
}

// Test case 7: Test getBorderInsets() with zero thickness and non-zero inner thickness
@Test
public void testGetBorderInsets_ZeroThicknessAndNonZeroInnerThickness() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0, 2);
    Component component = new Component() {};
    Insets insets = border.getBorderInsets(component);
    assertNotNull(insets);
    assertEquals(2, insets.top);
    assertEquals(2, insets.bottom);
    assertEquals(2, insets.left);
    assertEquals(2, insets.right);
}

// Test case 8: Test getBorderInsets() with non-zero thickness and non-zero inner thickness
@Test
public void testGetBorderInsets_NonZeroThicknessAndNonZeroInnerThickness() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {};
    Insets insets = border.getBorderInsets(component);
    assertNotNull(insets);
    assertEquals(3, insets.top);
    assertEquals(3, insets.bottom);
    assertEquals(3, insets.left);
    assertEquals(3, insets.right);
}

// Test case 9: Test getBorderInsets() with negative thickness and inner thickness
@Test
public void testGetBorderInsets_NegativeThicknessAndInnerThickness() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, -2, 1);
    Component component = new Component() {};
    Insets insets = border.getBorderInsets(component);
    assertNotNull(insets);
    assertEquals(1, insets.top);
    assertEquals(1, insets.bottom);
    assertEquals(1, insets.left);
    assertEquals(1, insets.right);
}

// Test case 10: Test getBorderInsets() with thickness and negative inner thickness
@Test
public void testGetBorderInsets_ThicknessAndNegativeInnerThickness() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, -1);
    Component component = new Component() {};
    Insets insets = border.getBorderInsets(component);
    assertNotNull(insets);
    assertEquals(1, insets.top);
    assertEquals(1, insets.bottom);
    assertEquals(1, insets.left);
    assertEquals(1, insets.right);
}
}