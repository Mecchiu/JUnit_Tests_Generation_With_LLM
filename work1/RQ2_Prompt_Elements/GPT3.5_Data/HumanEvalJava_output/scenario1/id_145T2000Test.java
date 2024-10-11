import java.util.ArrayList;
import java.util.Arrays;

class OrderByPointsTest {

    @Test
    void testOrderByPoints() {
        List<Object> nums = new ArrayList<>(Arrays.asList(123, -456, 789, 0, 12, -34, 56));
        List<Object> expected = new ArrayList<>(Arrays.asList(-456, 56, -34, 123, 12, 0, 789));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
        
        nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        expected = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
        
        nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
        expected = new ArrayList<>(Arrays.asList(90, 80, 70, 60, 50, 40, 30, 20, 10));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
        
        nums = new ArrayList<>(Arrays.asList(111, 222, 333, 444, 555, 666, 777, 888, 999));
        expected = new ArrayList<>(Arrays.asList(999, 888, 777, 666, 555, 444, 333, 222, 111));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
        
        nums = new ArrayList<>(Arrays.asList(-111, -222, -333, -444, -555, -666, -777, -888, -999));
        expected = new ArrayList<>(Arrays.asList(-999, -888, -777, -666, -555, -444, -333, -222, -111));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
        
        nums = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        expected = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
        
        nums = new ArrayList<>(Arrays.asList(123456789, 987654321, 111111111, 999999999));
        expected = new ArrayList<>(Arrays.asList(999999999, 987654321, 111111111, 123456789));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
        
        nums = new ArrayList<>(Arrays.asList(-123456789, -987654321, -111111111, -999999999));
        expected = new ArrayList<>(Arrays.asList(-999999999, -987654321, -111111111, -123456789));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
        
        nums = new ArrayList<>(Arrays.asList(123, -456, 789, 0, 12, -34, 56, 789, -456, 123));
        expected = new ArrayList<>(Arrays.asList(-456, 56, -34, 123, 123, 12, 0, 789, 789, -456));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
        
        nums = new ArrayList<>(Arrays.asList(123, -456, 789, 0, 12, -34, 56, 789, -456, 123, 0, 0, 0));
        expected = new ArrayList<>(Arrays.asList(-456, 56, -34, 123, 123, 12, 0, 0, 0, 789, 789, -456));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
}