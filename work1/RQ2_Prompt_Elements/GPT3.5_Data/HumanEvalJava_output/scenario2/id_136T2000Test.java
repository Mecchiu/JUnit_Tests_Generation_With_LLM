// Test case 1: Test with a list containing both negative and positive integers
@Test
void testLargestSmallestIntegers1() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(-10);
    lst.add(5);
    lst.add(3);
    lst.add(-20);
    lst.add(8);
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(-10);
    expected.add(3);
    assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
}

// Test case 2: Test with a list containing only negative integers
@Test
void testLargestSmallestIntegers2() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(-10);
    lst.add(-5);
    lst.add(-3);
    lst.add(-20);
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(-3);
    expected.add(null);
    assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
}

// Test case 3: Test with a list containing only positive integers
@Test
void testLargestSmallestIntegers3() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(10);
    lst.add(5);
    lst.add(3);
    lst.add(20);
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(null);
    expected.add(3);
    assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
}

// Test case 4: Test with an empty list
@Test
void testLargestSmallestIntegers4() {
    List<Object> lst = new ArrayList<Object>();
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(null);
    expected.add(null);
    assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
}

// Test case 5: Test with a list containing only one negative integer
@Test
void testLargestSmallestIntegers5() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(-10);
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(-10);
    expected.add(null);
    assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
}

// Test case 6: Test with a list containing only one positive integer
@Test
void testLargestSmallestIntegers6() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(10);
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(null);
    expected.add(10);
    assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
}

// Test case 7: Test with a list containing only zero
@Test
void testLargestSmallestIntegers7() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(0);
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(null);
    expected.add(null);
    assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
}

// Test case 8: Test with a list containing both negative and positive integers, but no negative integer
@Test
void testLargestSmallestIntegers8() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(10);
    lst.add(5);
    lst.add(3);
    lst.add(20);
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(null);
    expected.add(3);
    assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
}

// Test case 9: Test with a list containing both negative and positive integers, but no positive integer
@Test
void testLargestSmallestIntegers9() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(-10);
    lst.add(-5);
    lst.add(-3);
    lst.add(-20);
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(-3);
    expected.add(null);
    assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
}

// Test case 10: Test with a list containing both negative and positive integers, but all integers are the same
@Test
void testLargestSmallestIntegers10() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(5);
    lst.add(5);
    lst.add(5);
    lst.add(5);
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(null);
    expected.add(null);
    assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
}
}