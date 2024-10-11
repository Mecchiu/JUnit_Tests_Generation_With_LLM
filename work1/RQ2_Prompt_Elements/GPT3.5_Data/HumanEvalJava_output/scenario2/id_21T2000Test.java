@Test
void testRescaleToUnit() {
    // Test case 1: List with two elements
    List<Double> numbers1 = new ArrayList<Double>();
    numbers1.add(10.0);
    numbers1.add(20.0);
    List<Double> expected1 = new ArrayList<Double>();
    expected1.add(0.0);
    expected1.add(1.0);
    assertEquals(expected1, RescaleToUnit.rescaleToUnit(numbers1));

    // Test case 2: List with three elements
    List<Double> numbers2 = new ArrayList<Double>();
    numbers2.add(5.0);
    numbers2.add(10.0);
    numbers2.add(15.0);
    List<Double> expected2 = new ArrayList<Double>();
    expected2.add(0.0);
    expected2.add(0.5);
    expected2.add(1.0);
    assertEquals(expected2, RescaleToUnit.rescaleToUnit(numbers2));

    // Test case 3: List with repeated elements
    List<Double> numbers3 = new ArrayList<Double>();
    numbers3.add(5.0);
    numbers3.add(5.0);
    numbers3.add(5.0);
    List<Double> expected3 = new ArrayList<Double>();
    expected3.add(0.0);
    expected3.add(0.0);
    expected3.add(0.0);
    assertEquals(expected3, RescaleToUnit.rescaleToUnit(numbers3));

    // Test case 4: List with negative elements
    List<Double> numbers4 = new ArrayList<Double>();
    numbers4.add(-10.0);
    numbers4.add(0.0);
    numbers4.add(10.0);
    List<Double> expected4 = new ArrayList<Double>();
    expected4.add(0.0);
    expected4.add(0.5);
    expected4.add(1.0);
    assertEquals(expected4, RescaleToUnit.rescaleToUnit(numbers4));

    // Test case 5: List with decimal elements
    List<Double> numbers5 = new ArrayList<Double>();
    numbers5.add(1.5);
    numbers5.add(2.5);
    numbers5.add(3.5);
    List<Double> expected5 = new ArrayList<Double>();
    expected5.add(0.0);
    expected5.add(0.5);
    expected5.add(1.0);
    assertEquals(expected5, RescaleToUnit.rescaleToUnit(numbers5));

    // Test case 6: List with one element
    List<Double> numbers6 = new ArrayList<Double>();
    numbers6.add(10.0);
    List<Double> expected6 = new ArrayList<Double>();
    expected6.add(0.0);
    assertEquals(expected6, RescaleToUnit.rescaleToUnit(numbers6));

    // Test case 7: List with null elements
    List<Double> numbers7 = new ArrayList<Double>();
    numbers7.add(null);
    numbers7.add(null);
    List<Double> expected7 = new ArrayList<Double>();
    expected7.add(null);
    expected7.add(null);
    assertEquals(expected7, RescaleToUnit.rescaleToUnit(numbers7));

    // Test case 8: List with empty elements
    List<Double> numbers8 = new ArrayList<Double>();
    List<Double> expected8 = new ArrayList<Double>();
    assertEquals(expected8, RescaleToUnit.rescaleToUnit(numbers8));

    // Test case 9: List with elements in descending order
    List<Double> numbers9 = new ArrayList<Double>();
    numbers9.add(10.0);
    numbers9.add(5.0);
    numbers9.add(0.0);
    List<Double> expected9 = new ArrayList<Double>();
    expected9.add(1.0);
    expected9.add(0.5);
    expected9.add(0.0);
    assertEquals(expected9, RescaleToUnit.rescaleToUnit(numbers9));

    // Test case 10: List with elements in random order
    List<Double> numbers10 = new ArrayList<Double>();
    numbers10.add(5.0);
    numbers10.add(10.0);
    numbers10.add(2.0);
    numbers10.add(15.0);
    List<Double> expected10 = new ArrayList<Double>();
    expected10.add(0.16666666666666666);
    expected10.add(0.5);
    expected10.add(0.0);
    expected10.add(1.0);
    assertEquals(expected10, RescaleToUnit.rescaleToUnit(numbers10));
}
}