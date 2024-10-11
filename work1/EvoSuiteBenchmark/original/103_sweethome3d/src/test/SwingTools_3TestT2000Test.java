```java
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class SwingTools_3Test {

    @Test
    void testGetDropableComponentBorder_MacOSXLeopardOrSuperior() {
        OperatingSystem.setMacOSXLeopardOrSuperior(true);
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof CompoundBorder);
        CompoundBorder compoundBorder = (CompoundBorder) border;
        assertTrue(compoundBorder.getInsideBorder() instanceof BevelBorder);
        assertTrue(compoundBorder.getOutsideBorder() instanceof EmptyBorder);
    }

    @Test
    void testGetDropableComponentBorder_OtherSystems() {
        OperatingSystem.setMacOSXLeopardOrSuperior(false);
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof SoftBevelBorder);
    }
}
```