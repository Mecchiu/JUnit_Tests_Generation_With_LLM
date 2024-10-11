@Test
void testHasCloseElementsWithNullList() {
    List<Double> numbers = null;
    Double threshold = 0.5;
    assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
}

@Test
void testHasCloseElementsWithEmptyList() {
    List<Double> numbers = List.of();
    Double threshold = 0.5;
    assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
}

@Test
void testHasCloseElementsWithOneElement() {
    List<Double> numbers = List.of(1.0);
    Double threshold = 0.5;
    assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
}

@Test
void testHasCloseElementsWithTwoElementsBelowThreshold() {
    List<Double> numbers = List.of(1.0, 2.0);
    Double threshold = 2.0;
    assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
}

@Test
void testHasCloseElementsWithTwoElementsAboveThreshold() {
    List<Double> numbers = List.of(1.0, 2.0);
    Double threshold = 0.5;
    assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
}

@Test
void testHasCloseElementsWithThreeElementsBelowThreshold() {
    List<Double> numbers = List.of(1.0, 2.0, 3.0);
    Double threshold = 2.0;
    assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
}

@Test
void testHasCloseElementsWithThreeElementsAboveThreshold() {
    List<Double> numbers = List.of(1.0, 2.0, 3.0);
    Double threshold = 0.5;
    assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
}

@Test
void testHasCloseElementsWithMultipleElementsBelowThreshold() {
    List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
    Double threshold = 2.0;
    assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
}

@Test
void testHasCloseElementsWithMultipleElementsAboveThreshold() {
    List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
    Double threshold = 0.5;
    assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
}
}