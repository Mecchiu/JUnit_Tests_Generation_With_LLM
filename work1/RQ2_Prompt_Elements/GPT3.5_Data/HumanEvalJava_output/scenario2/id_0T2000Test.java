@Test
void testHasCloseElements() {
    // Test case 1: Empty list
    List<Double> emptyList = List.of();
    assertFalse(HasCloseElements.hasCloseElements(emptyList, 1.0));

    // Test case 2: List with one element
    List<Double> oneElementList = List.of(1.0);
    assertFalse(HasCloseElements.hasCloseElements(oneElementList, 1.0));

    // Test case 3: List with two elements that are not close
    List<Double> twoElementsNotCloseList = List.of(1.0, 3.0);
    assertFalse(HasCloseElements.hasCloseElements(twoElementsNotCloseList, 1.0));

    // Test case 4: List with two elements that are close
    List<Double> twoElementsCloseList = List.of(1.0, 1.5);
    assertTrue(HasCloseElements.hasCloseElements(twoElementsCloseList, 0.6));

    // Test case 5: List with three elements where two are close
    List<Double> threeElementsTwoCloseList = List.of(1.0, 1.5, 3.0);
    assertTrue(HasCloseElements.hasCloseElements(threeElementsTwoCloseList, 0.6));

    // Test case 6: List with three elements where all are close
    List<Double> threeElementsAllCloseList = List.of(1.0, 1.2, 1.4);
    assertTrue(HasCloseElements.hasCloseElements(threeElementsAllCloseList, 0.3));

    // Test case 7: List with three elements where none are close
    List<Double> threeElementsNoneCloseList = List.of(1.0, 2.0, 3.0);
    assertFalse(HasCloseElements.hasCloseElements(threeElementsNoneCloseList, 0.3));

    // Test case 8: List with four elements where two are close
    List<Double> fourElementsTwoCloseList = List.of(1.0, 1.5, 2.0, 3.0);
    assertTrue(HasCloseElements.hasCloseElements(fourElementsTwoCloseList, 0.6));

    // Test case 9: List with four elements where all are close
    List<Double> fourElementsAllCloseList = List.of(1.0, 1.2, 1.4, 1.6);
    assertTrue(HasCloseElements.hasCloseElements(fourElementsAllCloseList, 0.3));

    // Test case 10: List with four elements where none are close
    List<Double> fourElementsNoneCloseList = List.of(1.0, 2.0, 3.0, 4.0);
    assertFalse(HasCloseElements.hasCloseElements(fourElementsNoneCloseList, 0.3));
}
}