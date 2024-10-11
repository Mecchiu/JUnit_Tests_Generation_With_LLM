@Test
void testLargestDivisor() {
    assertEquals(4, LargestDivisor.largestDivisor(12));
    assertEquals(3, LargestDivisor.largestDivisor(9));
    assertEquals(1, LargestDivisor.largestDivisor(1));
    assertEquals(1, LargestDivisor.largestDivisor(2));
    assertEquals(2, LargestDivisor.largestDivisor(4));
    assertEquals(5, LargestDivisor.largestDivisor(25));
    assertEquals(10, LargestDivisor.largestDivisor(100));
    assertEquals(7, LargestDivisor.largestDivisor(14));
    assertEquals(1, LargestDivisor.largestDivisor(17));
    assertEquals(1, LargestDivisor.largestDivisor(31));
}
}