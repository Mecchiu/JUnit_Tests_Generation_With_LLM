```java
class SimpleCombatant_1Test {

    @Test
    void testGetCurrentLP_MaxHealthEqualsCurrentHealth() {
        // Arrange
        CombatantState initialState = new CombatantStateImpl(100, true, new AreaImpl(0, 0));
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.BLUE, initialState, 100, "Player1", CharacterClass.SOLDIER, new WeaponImpl("Gun", 10, 20), "City1");

        // Act
        int currentLP = combatant._getCurrentLP();

        // Assert
        assertEquals(100, currentLP);
    }

    @Test
    void testGetCurrentLP_MaxHealthGreaterThanCurrentHealth() {
        // Arrange
        CombatantState initialState = new CombatantStateImpl(50, true, new AreaImpl(0, 0));
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.RED, initialState, 100, "Player2", CharacterClass.SNIPER, new WeaponImpl("Sniper Rifle", 30, 50), "City2");

        // Act
        int currentLP = combatant._getCurrentLP();

        // Assert
        assertEquals(50, currentLP);
    }

    @Test
    void testGetCurrentLP_MaxHealthLessThanCurrentHealth() {
        // Arrange
        CombatantState initialState = new CombatantStateImpl(80, true, new AreaImpl(0, 0));
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.GREEN, initialState, 70, "Player3", CharacterClass.DUELANT, new WeaponImpl("Sword", 5, 10), "City3");

        // Act
        int currentLP = combatant._getCurrentLP();

        // Assert
        assertEquals(80, currentLP);
    }

    @Test
    void testGetCurrentLP_HealthZero() {
        // Arrange
        CombatantState initialState = new CombatantStateImpl(0, true, new AreaImpl(0, 0));
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.YELLOW, initialState, 100, "Player4", CharacterClass.MEDIC, new WeaponImpl("Healing Gun", 0, 0), "City4");

        // Act
        int currentLP = combatant._getCurrentLP();

        // Assert
        assertEquals(0, currentLP);
    }

    @Test
    void testGetCurrentLP_NegativeHealth() {
        // Arrange
        CombatantState initialState = new CombatantStateImpl(-10, true, new AreaImpl(0, 0));
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.BLUE, initialState, 100, "Player5", CharacterClass.SOLDIER, new WeaponImpl("Gun", 10, 20), "City5");

        // Act
        int currentLP = combatant._getCurrentLP();

        // Assert
        assertEquals(-10, currentLP);
    }

    @Test
    void testGetCurrentLP_MaxHealthZero() {
        // Arrange
        CombatantState initialState = new CombatantStateImpl(0, true, new AreaImpl(0, 0));
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.RED, initialState, 0, "Player6", CharacterClass.SNIPER, new WeaponImpl("Sniper Rifle", 30, 50), "City6");

        // Act
        int currentLP = combatant._getCurrentLP();

        // Assert
        assertEquals(0, currentLP);
    }

    @Test
    void testGetCurrentLP_MaxHealthNegative() {
        // Arrange
        CombatantState initialState = new CombatantStateImpl(20, true, new AreaImpl(0, 0));
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.GREEN, initialState, -30, "Player7", CharacterClass.DUELANT, new WeaponImpl("Sword", 5, 10), "City7");

        // Act
        int currentLP = combatant._getCurrentLP();

        // Assert
        assertEquals(20, currentLP);
    }

    @Test
    void testGetCurrentLP_MaxHealthEqualsCurrentHealth_ZeroHealth() {
        // Arrange
        CombatantState initialState = new CombatantStateImpl(0, true, new AreaImpl(0, 0));
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.YELLOW, initialState, 0, "Player8", CharacterClass.MEDIC, new WeaponImpl("Healing Gun", 0, 0), "City8");

        // Act
        int currentLP = combatant._getCurrentLP();

        // Assert
        assertEquals(0, currentLP);
    }

    @Test
    void testGetCurrentLP_MaxHealthEqualsCurrentHealth_NegativeHealth() {
        // Arrange
        CombatantState initialState = new CombatantStateImpl(-5, true, new AreaImpl(0, 0));
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.BLUE, initialState, -5, "Player9", CharacterClass.SOLDIER, new WeaponImpl("Gun", 10, 20), "City9");

        // Act
        int currentLP = combatant._getCurrentLP();

        // Assert
        assertEquals(-5, currentLP);
    }

    @Test
    void testGetCurrentLP_MaxHealthZero_CurrentHealthNegative() {
        // Arrange
        CombatantState initialState = new CombatantStateImpl(-10, true, new AreaImpl(0, 0));
        SimpleCombatant combatant = new SimpleCombatant(CombatantSide.RED, initialState, 0, "Player10", CharacterClass.SNIPER, new WeaponImpl("Sniper Rifle", 30, 50), "City10");

        // Act
        int currentLP = combatant._getCurrentLP();

        // Assert
        assertEquals(-10, currentLP);
    }
}
```
```