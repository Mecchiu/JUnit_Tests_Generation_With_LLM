// Test case 1: Test if the method returns a non-null object
@Test
void testGetSequentialGroupNotNull() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnSequentialGroup fsg = gle.getSequentialGroup(Axis.HORIZONTAL, "comp1", "comp2");
    assertNotNull(fsg);
}

// Test case 2: Test if the method returns an object of type FunctionsOnSequentialGroup
@Test
void testGetSequentialGroupType() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnSequentialGroup fsg = gle.getSequentialGroup(Axis.HORIZONTAL, "comp1", "comp2");
    assertTrue(fsg instanceof FunctionsOnSequentialGroup);
}

// Test case 3: Test if the method returns an object that can set the group's gap size
@Test
void testGetSequentialGroupSetGapSize() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnSequentialGroup fsg = gle.getSequentialGroup(Axis.HORIZONTAL, "comp1", "comp2");
    fsg.setGapSize(10);
    assertEquals(10, fsg.getGapSize());
}

// Test case 4: Test if the method returns an object that can set the group's gap type
@Test
void testGetSequentialGroupSetGapType() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnSequentialGroup fsg = gle.getSequentialGroup(Axis.HORIZONTAL, "comp1", "comp2");
    fsg.setGapType(ComponentPlacement.UNRELATED);
    assertEquals(ComponentPlacement.UNRELATED, fsg.getGapType());
}

// Test case 5: Test if the method returns an object that can add a gap before the first component
@Test
void testGetSequentialGroupAddGapBeforeFirst() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnSequentialGroup fsg = gle.getSequentialGroup(Axis.HORIZONTAL, "comp1", "comp2");
    fsg.addGapBeforeFirst(10);
    assertEquals(10, fsg.getGapBeforeFirst());
}

// Test case 6: Test if the method returns an object that can add a gap after the last component
@Test
void testGetSequentialGroupAddGapAfterLast() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnSequentialGroup fsg = gle.getSequentialGroup(Axis.HORIZONTAL, "comp1", "comp2");
    fsg.addGapAfterLast(10);
    assertEquals(10, fsg.getGapAfterLast());
}

// Test case 7: Test if the method returns an object that can add a gap between two components
@Test
void testGetSequentialGroupAddGapBetween() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnSequentialGroup fsg = gle.getSequentialGroup(Axis.HORIZONTAL, "comp1", "comp2");
    fsg.addGapBetween(20);
    assertEquals(20, fsg.getGapBetween());
}

// Test case 8: Test if the method returns an object that can add a gap before the first component and between two components
@Test
void testGetSequentialGroupAddGapBeforeFirstAndBetween() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnSequentialGroup fsg = gle.getSequentialGroup(Axis.HORIZONTAL, "comp1", "comp2");
    fsg.addGapBeforeFirst(10);
    fsg.addGapBetween(20);
    assertEquals(10, fsg.getGapBeforeFirst());
    assertEquals(20, fsg.getGapBetween());
}

// Test case 9: Test if the method returns an object that can add a gap after the last component and between two components
@Test
void testGetSequentialGroupAddGapAfterLastAndBetween() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnSequentialGroup fsg = gle.getSequentialGroup(Axis.HORIZONTAL, "comp1", "comp2");
    fsg.addGapAfterLast(10);
    fsg.addGapBetween(20);
    assertEquals(10, fsg.getGapAfterLast());
    assertEquals(20, fsg.getGapBetween());
}

// Test case 10: Test if the method returns an object that can add a gap before the first component, after the last component, and between two components
@Test
void testGetSequentialGroupAddGapBeforeFirstAfterLastAndBetween() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnSequentialGroup fsg = gle.getSequentialGroup(Axis.HORIZONTAL, "comp1", "comp2");
    fsg.addGapBeforeFirst(10);
    fsg.addGapAfterLast(20);
    fsg.addGapBetween(30);
    assertEquals(10, fsg.getGapBeforeFirst());
    assertEquals(20, fsg.getGapAfterLast());
    assertEquals(30, fsg.getGapBetween());
}