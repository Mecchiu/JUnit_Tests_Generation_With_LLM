
package scenario1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FindClosestElementsTest {
   @Test
   void testEmptyList() {
    List<Double> numbers = new ArrayList<Double>();
    List<Double> expected = new ArrayList<Double>();
    List<Double> actual = FindClosestElements.findClosestElements(numbers);
    assertEquals(expected, actual);
   }
   @Test
   void testOneElementList() {
    List<Double> numbers = new ArrayList<Double>();
    numbers.add(5.0);
    List<Double> expected = new ArrayList<Double>();
    expected.add(5.0);
    List<Double> actual = FindClosestElements.findClosestElements(numbers);
    assertEquals(expected, actual);
   }
   @Test
   void testTwoElementsList() {
    List<Double> numbers = new ArrayList<Double>();
    numbers.add(5.0);
    numbers.add(10.0);
    List<Double> expected = new ArrayList<Double>();
    expected.add(5.0);
    expected.add(10.0);
    List<Double> actual = FindClosestElements.findClosestElements(numbers);
    assertEquals(expected, actual);
   }
   @Test
   void testMultipleElementsNoDuplicatesList() {
    List<Double> numbers = new ArrayList<Double>();
    numbers.add(5.0);
    numbers.add(10.0);
    numbers.add(3.0);
    numbers.add(8.0);
    numbers.add(1.0);
    List<Double> expected = new ArrayList<Double>();
    expected.add(3.0);
    expected.add(5.0);
    List<Double> actual = FindClosestElements.findClosestElements(numbers);
    assertEquals(expected, actual);
   }
   @Test
   void testMultipleElementsWithDuplicatesList() {
    List<Double> numbers = new ArrayList<Double>();
    numbers.add(5.0);
    numbers.add(10.0);
    numbers.add(3.0);
    numbers.add(8.0);
    numbers.add(1.0);
    numbers.add(3.0);
    numbers.add(8.0);
    List<Double> expected = new ArrayList<Double>();
    expected.add(3.0);
    expected.add(3.0);
    List<Double> actual = FindClosestElements.findClosestElements(numbers);
    assertEquals(expected, actual);
   }
   @Test
   void testNegativeElementsList() {
    List<Double> numbers = new ArrayList<Double>();
    numbers.add(-5.0);
    numbers.add(-10.0);
    numbers.add(-3.0);
    numbers.add(-8.0);
    numbers.add(-1.0);
    List<Double> expected = new ArrayList<Double>();
    expected.add(-10.0);
    expected.add(-8.0);
    List<Double> actual = FindClosestElements.findClosestElements(numbers);
    assertEquals(expected, actual);
   }
   @Test
   void testDecimalElementsList() {
    List<Double> numbers = new ArrayList<Double>();
    numbers.add(5.5);
    numbers.add(10.2);
    numbers.add(3.7);
    numbers.add(8.9);
    numbers.add(1.3);
    List<Double> expected = new ArrayList<Double>();
    expected.add(3.7);
    expected.add(5.5);
    List<Double> actual = FindClosestElements.findClosestElements(numbers);
    assertEquals(expected, actual);
   }
   @Test
   void testLargeElementsList() {
    List<Double> numbers = new ArrayList<Double>();
}
}