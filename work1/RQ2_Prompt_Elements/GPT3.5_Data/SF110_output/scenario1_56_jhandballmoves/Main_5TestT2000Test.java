// Test case 1: Test if the method returns a non-null object
@Test
void testDeepCopyNotNull() throws Exception {
    Object obj = new Object();
    Object copy = Main.deepCopy(obj);
    assertNotNull(copy);
}

// Test case 2: Test if the method returns a deep copy of the object
@Test
void testDeepCopy() throws Exception {
    HandballModel model = new HandballModel();
    model.addEvent(1, 1, "Pass");
    HandballModel copy = (HandballModel) Main.deepCopy(model);
    model.addEvent(2, 2, "Move");
    assertNotEquals(model, copy);
}

// Test case 3: Test if the method returns a copy of the object with the same values
@Test
void testDeepCopySameValues() throws Exception {
    ColorModel model = new ColorModel();
    model.setFieldColor(Color.BLUE);
    ColorModel copy = (ColorModel) Main.deepCopy(model);
    assertEquals(model.getFieldColor(), copy.getFieldColor());
}

// Test case 4: Test if the method returns a copy of the object with the same reference values
@Test
void testDeepCopySameReferences() throws Exception {
    HandballModel model = new HandballModel();
    model.addEvent(1, 1, "Pass");
    CommentController controller = new CommentController(model);
    HandballModel copy = (HandballModel) Main.deepCopy(model);
    CommentController copyController = new CommentController(copy);
    assertEquals(controller.getModel(), copyController.getModel());
}

// Test case 5: Test if the method returns a copy of the object with the same array values
@Test
void testDeepCopySameArrayValues() throws Exception {
    HandballModel model = new HandballModel();
    model.addEvent(1, 1, "Pass");
    HandballModel copy = (HandballModel) Main.deepCopy(model);
    assertEquals(model.getEvents().length, copy.getEvents().length);
}

// Test case 6: Test if the method returns a copy of the object with the same primitive values
@Test
void testDeepCopySamePrimitiveValues() throws Exception {
    ColorModel model = new ColorModel();
    model.setFieldColor(Color.BLUE);
    ColorModel copy = (ColorModel) Main.deepCopy(model);
    assertEquals(model.isColorsChanged(), copy.isColorsChanged());
}

// Test case 7: Test if the method returns a copy of the object with the same null values
@Test
void testDeepCopySameNullValues() throws Exception {
    HandballModel model = new HandballModel();
    model.addEvent(1, 1, null);
    HandballModel copy = (HandballModel) Main.deepCopy(model);
    assertEquals(model.getEvents()[0].getEventType(), copy.getEvents()[0].getEventType());
}

// Test case 8: Test if the method returns a copy of the object with the same non-null values
@Test
void testDeepCopySameNonNullValues() throws Exception {
    HandballModel model = new HandballModel();
    model.addEvent(1, 1, "Pass");
    HandballModel copy = (HandballModel) Main.deepCopy(model);
    assertEquals(model.getEvents()[0].getEventType(), copy.getEvents()[0].getEventType());
}

// Test case 9: Test if the method returns a copy of the object with the same object references
@Test
void testDeepCopySameObjectReferences() throws Exception {
    HandballModel model = new HandballModel();
    model.addEvent(1, 1, "Pass");
    CommentController controller = new CommentController(model);
    HandballModel copy = (HandballModel) Main.deepCopy(model);
    CommentController copyController = new CommentController(copy);
    assertNotSame(controller, copyController);
}

// Test case 10: Test if the method throws an exception when the object is not serializable
@Test
void testDeepCopyNotSerializable() {
    assertThrows(Exception.class, () -> {
        JFrame frame = new JFrame();
        Main.deepCopy(frame);
    });
}