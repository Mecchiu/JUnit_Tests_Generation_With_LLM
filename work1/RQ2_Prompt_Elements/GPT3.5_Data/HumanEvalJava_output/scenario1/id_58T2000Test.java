// Here's an example of how you can write unit tests for the Common class

@Test
void testCommon() {
    List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
    List<Object> l2 = Arrays.asList(2, 4, 6, 8, "10");
    List<Object> expected = Arrays.asList(2, 4);
    List<Object> actual = Common.common(l1, l2);
    assertEquals(expected, actual);
}

@Test
void testCommonWithEmptyLists() {
    List<Integer> l1 = Collections.emptyList();
    List<Object> l2 = Collections.emptyList();
    List<Object> expected = Collections.emptyList();
    List<Object> actual = Common.common(l1, l2);
    assertEquals(expected, actual);
}

@Test
void testCommonWithNullLists() {
    List<Integer> l1 = null;
    List<Object> l2 = null;
    List<Object> expected = Collections.emptyList();
    List<Object> actual = Common.common(l1, l2);
    assertEquals(expected, actual);
}

@Test
void testCommonWithOneEmptyList() {
    List<Integer> l1 = Arrays.asList(1, 2, 3);
    List<Object> l2 = Collections.emptyList();
    List<Object> expected = Collections.emptyList();
    List<Object> actual = Common.common(l1, l2);
    assertEquals(expected, actual);
}

@Test
void testCommonWithOneNullList() {
    List<Integer> l1 = Arrays.asList(1, 2, 3);
    List<Object> l2 = null;
    List<Object> expected = Collections.emptyList();
    List<Object> actual = Common.common(l1, l2);
    assertEquals(expected, actual);
}

@Test
void testCommonWithDuplicateValues() {
    List<Integer> l1 = Arrays.asList(1, 2, 2, 3, 4, 5);
    List<Object> l2 = Arrays.asList(2, 2, 4, 6, 8, "10");
    List<Object> expected = Arrays.asList(2, 4);
    List<Object> actual = Common.common(l1, l2);
    assertEquals(expected, actual);
}

@Test
void testCommonWithMixedTypes() {
    List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
    List<Object> l2 = Arrays.asList(2, 4, 6, 8, "10", true);
    List<Object> expected = Arrays.asList(2, 4);
    List<Object> actual = Common.common(l1, l2);
    assertEquals(expected, actual);
}

@Test
void testCommonWithNegativeValues() {
    List<Integer> l1 = Arrays.asList(-5, -4, -3, -2, -1);
    List<Object> l2 = Arrays.asList(-2, -1, 0, 1, 2);
    List<Object> expected = Arrays.asList(-2, -1);
    List<Object> actual = Common.common(l1, l2);
    assertEquals(expected, actual);
}

@Test
void testCommonWithLargeLists() {
    List<Integer> l1 = new ArrayList<Integer>();
    List<Object> l2 = new ArrayList<Object>();
    for (int i = 0; i < 100000; i++) {
        l1.add(i);
        l2.add(i + 1);
    }
    List<Object> expected = Collections.emptyList();
    List<Object> actual = Common.common(l1, l2);
    assertEquals(expected, actual);
}

@Test
void testCommonWithLargeCommonSubset() {
    List<Integer> l1 = new ArrayList<Integer>();
    List<Object> l2 = new ArrayList<Object>();
    for (int i = 0; i < 100000; i++) {
        l1.add(i);
        if (i % 2 == 0) {
            l2.add(i);
        }
    }
    List<Object> expected = l2;
    List<Object> actual = Common.common(l1, l2);
    assertEquals(expected, actual);
}
}