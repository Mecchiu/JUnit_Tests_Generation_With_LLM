// IntersectionTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains one unit test case for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {

    @Test void testIntersection() {
        List<Integer> interval1 = List.of(1);
        List<Integer> interval2 = List.of(1, 2);

        Intersection result1 = Intersection.intersection(interval1, interval2);

        assertNotNull(result1);
    }
}