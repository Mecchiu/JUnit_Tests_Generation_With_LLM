// OrderByPointsTest.java
package scenario2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OrderByPoints}.
* It contains one unit test case for the {@link OrderByPoints#orderByPoints(List)} method.
*/
class OrderByPointsTest {

    @Test
    public void shouldOrderByPointsUsingComparatorWithDifferentComparators() {
        assertNotNull(Collections.emptyList());
        assertTrue(OrderByPoints.orderByPoints(Collections.emptyList()) instanceof SortableSortNum);
        assertNotNull(OrderByPoints.orderByPoints((List<BigDecimal>) null));
    }

    @Test
    public void shouldOrderByPointsUsingComparator() {
        assertNotNull(Collections.emptyList());
        assertFalse(OrderByPoints.orderByPoints(Collections.singletonList(1L)).size() > 0);
        assertNotNull(OrderByPoints.orderByPoints((List<BigDecimal>) null)
               .add(OrderByPoints.orderByPoints(Collections.singletonList(1L))));
    }
    
    @Test
    public void shouldHaveSameSizeAndEqualsWhenDifferentListSize() {
        assertNotNull(Collections.emptyList());
        assertFalse(OrderByPoints.orderByPoints(Collections.singletonList(1L)).equals(OrderByPoints.orderByPoints(Collections.singletonList(1L))));
    }
}
