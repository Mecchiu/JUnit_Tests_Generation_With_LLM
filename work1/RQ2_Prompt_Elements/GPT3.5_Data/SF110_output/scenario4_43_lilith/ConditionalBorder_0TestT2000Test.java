// Test case 1: Test getBorderInsets() with a component having no insets
@Test
public void testGetBorderInsets_noInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {
        @Override
        public Insets getInsets() {
            return new Insets(0, 0, 0, 0);
        }
    };
    Insets insets = border.getBorderInsets(component);
    assertEquals(2, insets.top);
    assertEquals(2, insets.left);
    assertEquals(3, insets.bottom);
    assertEquals(2, insets.right);
}

// Test case 2: Test getBorderInsets() with a component having non-zero insets
@Test
public void testGetBorderInsets_nonZeroInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {
        @Override
        public Insets getInsets() {
            return new Insets(1, 2, 3, 4);
        }
    };
    Insets insets = border.getBorderInsets(component);
    assertEquals(3, insets.top);
    assertEquals(4, insets.left);
    assertEquals(4, insets.bottom);
    assertEquals(6, insets.right);
}

// Test case 3: Test getBorderInsets() with a null component
@Test
public void testGetBorderInsets_nullComponent() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    assertThrows(NullPointerException.class, () -> {
        border.getBorderInsets(null);
    });
}

// Test case 4: Test getBorderInsets() with a component having null insets
@Test
public void testGetBorderInsets_nullInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {
        @Override
        public Insets getInsets() {
            return null;
        }
    };
    Insets insets = border.getBorderInsets(component);
    assertEquals(2, insets.top);
    assertEquals(2, insets.left);
    assertEquals(3, insets.bottom);
    assertEquals(2, insets.right);
}

// Test case 5: Test getBorderInsets() with a component having negative insets
@Test
public void testGetBorderInsets_negativeInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {
        @Override
        public Insets getInsets() {
            return new Insets(-1, -2, -3, -4);
        }
    };
    Insets insets = border.getBorderInsets(component);
    assertEquals(1, insets.top);
    assertEquals(2, insets.left);
    assertEquals(3, insets.bottom);
    assertEquals(4, insets.right);
}

// Test case 6: Test getBorderInsets() with a component having zero insets
@Test
public void testGetBorderInsets_zeroInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {
        @Override
        public Insets getInsets() {
            return new Insets(0, 0, 0, 0);
        }
    };
    Insets insets = border.getBorderInsets(component);
    assertEquals(2, insets.top);
    assertEquals(2, insets.left);
    assertEquals(3, insets.bottom);
    assertEquals(2, insets.right);
}

// Test case 7: Test getBorderInsets() with a component having large insets
@Test
public void testGetBorderInsets_largeInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {
        @Override
        public Insets getInsets() {
            return new Insets(100, 200, 300, 400);
        }
    };
    Insets insets = border.getBorderInsets(component);
    assertEquals(102, insets.top);
    assertEquals(202, insets.left);
    assertEquals(303, insets.bottom);
    assertEquals(202, insets.right);
}

// Test case 8: Test getBorderInsets() with a component having small insets
@Test
public void testGetBorderInsets_smallInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {
        @Override
        public Insets getInsets() {
            return new Insets(1, 1, 1, 1);
        }
    };
    Insets insets = border.getBorderInsets(component);
    assertEquals(2, insets.top);
    assertEquals(2, insets.left);
    assertEquals(3, insets.bottom);
    assertEquals(2, insets.right);
}

// Test case 9: Test getBorderInsets() with a component having equal insets
@Test
public void testGetBorderInsets_equalInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {
        @Override
        public Insets getInsets() {
            return new Insets(2, 2, 2, 2);
        }
    };
    Insets insets = border.getBorderInsets(component);
    assertEquals(4, insets.top);
    assertEquals(4, insets.left);
    assertEquals(5, insets.bottom);
    assertEquals(4, insets.right);
}

// Test case 10: Test getBorderInsets() with a component having different top and bottom insets
@Test
public void testGetBorderInsets_differentTopBottomInsets() {
    ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
    Component component = new Component() {
        @Override
        public Insets getInsets() {
            return new Insets(1, 2, 3, 2);
        }
    };
    Insets insets = border.getBorderInsets(component);
    assertEquals(3, insets.top);
    assertEquals(4, insets.left);
    assertEquals(4, insets.bottom);
    assertEquals(4, insets.right);
}
}