```java
package de.outstare.fortbattleplayer.model.impl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCombatant_0Test {

    @Test
    void test_getMaxLP_returnsMaxHealth() {
        // Arrange
        int maxHealth = 100;
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.BLUE, new CombatantState(new Area(0, 0), 100, true), maxHealth, "Test", CharacterClass.SOLDIER, new Weapon("TestWeapon", 10, 20), "TestCity");

        // Act
        int result = combatant._getMaxLP();

        // Assert
        assertEquals(maxHealth, result);
    }
}
```
```