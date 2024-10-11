// SkjkasdkdTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Skjkasdkd}.
* It contains one unit test case for the {@link Skjkasdkd#skjkasdkd(List)} method.
*/
class SkjkasdkdTest {
private SkjkasdkdTest() {
		}
		
    // Test set
    @Test
    void sets() {
        List<Integer> list = ListUtils.createList();
        
        ListUtils.add(list, 50);
        
        Assert.assertEquals(2, list.size());
        
        list = ListUtils.createList();
        
        ListUtils.add(list, 32);
        
        Assert.assertEquals(3, list.size());
        
        list = ListUtils.createList();
        
        ListUtils.add(list, 32);
        
        Assert.assertEquals(4, list.size());
    }
}
