java
package glengineer;

import glengineer.GroupLayoutEngineer;
import glengineer.agents.Axis;
import glengineer.agents.FunctionsOnSequentialGroup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupLayoutEngineer_3Test {

    @Test
    void testGetSequentialGroup() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new Container(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));

        FunctionsOnSequentialGroup functions = gle.getSequentialGroup(Axis.HORIZONTAL, "COMP1", "COMP3");

        assertNotNull(functions);
    }

    @Test
    void testGetSequentialGroup_ComponentNotFound() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new Container(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));

        assertThrows(IllegalArgumentException.class, () -> gle.getSequentialGroup(Axis.HORIZONTAL, "COMP1", "COMP3"));
    }

    @Test
    void testGetSequentialGroup_GroupNotFound() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new Container(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));

        assertThrows(IllegalArgumentException.class, () -> gle.getSequentialGroup(Axis.HORIZONTAL, "COMP1", "COMP2"));
    }
}
