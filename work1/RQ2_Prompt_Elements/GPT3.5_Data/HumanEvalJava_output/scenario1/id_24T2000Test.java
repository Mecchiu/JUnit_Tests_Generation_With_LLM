@Test
void testLargestDivisor() {
    assertEquals(5, LargestDivisor.largestDivisor(10));
    assertEquals(3, LargestDivisor.largestDivisor(9));
    assertEquals(1, LargestDivisor.largestDivisor(1));
    assertEquals(2, LargestDivisor.largestDivisor(4));
    assertEquals(1, LargestDivisor.largestDivisor(7));
    assertEquals(4, LargestDivisor.largestDivisor(12));
    assertEquals(1, LargestDivisor.largestDivisor(13));
    assertEquals(3, LargestDivisor.largestDivisor(15));
    assertEquals(5, LargestDivisor.largestDivisor(25));
    assertEquals(2, LargestDivisor.largestDivisor(6));
}
}