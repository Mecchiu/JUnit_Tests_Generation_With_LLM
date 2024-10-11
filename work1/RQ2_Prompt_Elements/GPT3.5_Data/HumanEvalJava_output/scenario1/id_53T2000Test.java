@Test
void testAddPositiveNumbers() {
    int result = Add.add(2, 3);
    assertEquals(5, result);
}

@Test
void testAddNegativeNumbers() {
    int result = Add.add(-2, -3);
    assertEquals(-5, result);
}

@Test
void testAddZero() {
    int result = Add.add(0, 0);
    assertEquals(0, result);
}

@Test
void testAddMaxValue() {
    int result = Add.add(Integer.MAX_VALUE, 1);
    assertEquals(Integer.MIN_VALUE, result);
}

@Test
void testAddMinValue() {
    int result = Add.add(Integer.MIN_VALUE, -1);
    assertEquals(Integer.MAX_VALUE, result);
}

@Test
void testAddPositiveAndNegativeNumbers() {
    int result = Add.add(5, -3);
    assertEquals(2, result);
}

@Test
void testAddPositiveNumberAndZero() {
    int result = Add.add(5, 0);
    assertEquals(5, result);
}

@Test
void testAddNegativeNumberAndZero() {
    int result = Add.add(-5, 0);
    assertEquals(-5, result);
}

@Test
void testAddLargeNumbers() {
    int result = Add.add(1000000, 2000000);
    assertEquals(3000000, result);
}

@Test
void testAddLargeNegativeNumbers() {
    int result = Add.add(-1000000, -2000000);
    assertEquals(-3000000, result);
}
}