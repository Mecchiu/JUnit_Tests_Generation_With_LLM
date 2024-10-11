Here's the source code for the SpecialfilterTest class:

```
class SpecialfilterTest {

    @Test
    void testEmptyList() {
        List<Object> nums = Arrays.asList();
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testNoNumbersGreaterThanTen() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testNumbersGreaterThanTenButNotSpecial() {
        List<Object> nums = Arrays.asList(11, 12, 13, 14, 15);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testNumbersGreaterThanTenAndSpecial() {
        List<Object> nums = Arrays.asList(19, 31, 57, 93);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(4, result);
    }

    @Test
    void testNumbersGreaterThanTenAndNotOdd() {
        List<Object> nums = Arrays.asList(22, 24, 26, 28);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testNumbersGreaterThanTenAndNotSpecial() {
        List<Object> nums = Arrays.asList(11, 13, 15, 17, 21, 23, 25, 27);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testNumbersGreaterThanTenAndNotSpecialButOdd() {
        List<Object> nums = Arrays.asList(31, 35, 37, 39);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testNumbersGreaterThanTenAndSpecialButNotOdd() {
        List<Object> nums = Arrays.asList(12, 14, 16, 18, 91, 92, 94, 96, 98);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testNumbersGreaterThanTenAndSpecialButNotEndingInOdd() {
        List<Object> nums = Arrays.asList(13, 15, 17, 19, 91, 93, 95, 97);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testNumbersGreaterThanTenAndSpecialButNotStartingWithOdd() {
        List<Object> nums = Arrays.asList(31, 35, 37, 39, 12, 14, 16, 18);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
}
```

This test class contains ten unit test cases for the `specialfilter` method of the `Specialfilter` class. Each test case tests a different scenario, such as an empty list, a list with no numbers greater than ten, a list with numbers greater than ten but not special, and so on. The `assertEquals` method is used to check that the actual result of the `specialfilter` method matches the expected result.