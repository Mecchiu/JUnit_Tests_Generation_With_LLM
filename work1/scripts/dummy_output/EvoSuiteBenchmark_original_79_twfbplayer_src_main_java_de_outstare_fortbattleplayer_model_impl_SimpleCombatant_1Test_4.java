// SimpleCombatant_1Test.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCombatant}.
* It contains one unit test case for the {@link SimpleCombatant#_getCurrentLP()} method.
*/
class SimpleCombatant_1Test {
		
    /**
     * Test method for {@link de.outstare.fortbattleplayer.model.impl.SimpleCombatant#getState()}.
     */
    @Test
    public void testGetState() {
        final SimpleCombatant _combatant = new SimpleCombatant();

        assertEquals(CombatantState.CombatantLocked, _combatant.getState());

        final CharacterClass c = new CharacterClass();

        _combatant.addObserver(c);

        assertEquals(CombatantState.Attack, _combatant.getState());
    }

    /**
     * Test method for {@link de.outstare.fortbattleplayer.model.impl.SimpleCombatant#getMaxHP(de.outstare.fortbattleplayer.model.Area)}.
     */
    @Test
    public void testGetMaxHP(final Area area) {
        final SimpleCombatant _combatant = new SimpleCombatant();

        _combatant.addObserver(new Set());

        try {
            _combatant.getMaxHP(area);
        } catch (OutOfBoundsException e) {
            return;
        }

	fail("Test FAILED: _combatant.getMaxHP(area); expected OutOfBoundsException");
    }

    /**
     * Test method for {@link de.outstare.fortbattleplayer.model.impl.SimpleCombatant#addObserver(de.outstare.fortbattleplayer.model.Combatant)}.
     */
    @Test
    public void testAddObserver(final Combatant observer) {
        final SimpleCombatant _combatant = new SimpleCombatant();

        _combatant.addObserver(observer);

        try {
            _combatant.addObserver(null);
        } catch (NullPointerException e) {
            fail("Test FAILED: _combatant.addObserver(object == null);");
        }

        try {
            _combatant.addObserver(new CombatantObserver());
        } catch (IllegalArgumentException e) {
            return;
        }

        fail("Test FAILED: _combatant.addObserver(observer == null);");
    }

    /**
     * Test method for {@link de.outstare.fortbattleplayer.model.impl.SimpleCombatant#getSide()}.
     */
    @Test
    public void testGetSide() {
        final Set<CombatantSide> _combatants = new HashSet<>(2);

        final SimpleCombatant _combatant = new SimpleCombatant();

        _combatant.addObserver(new Set());

        _combatant.addObserver(null);

        _combatants.add(CombatantSide.Attack);
        _combatants.add(CombatantSide.Defender);

        assertEquals(CombatantSide.Attack, _combatant.getSide());

        _combatants.add(CombatantSide.Critical);
        _combatants.add(CombatantSide.Toxic);

        assertEquals(CombatantSide.Critical, _combatant.getSide());

        _combatants.add(CombatantSide.Defender); // Only one should be visible...

        assertEquals(CombatantSide.Critical, _combatant.getSide());

        _combatant.addObserver(new Set());

        assertEquals(CombatantSide.Critical, _combatants.iterator().next());

        final Set<CombatantSide> _combatantsForSameSide = new HashSet<>(2);

        _combatantsForSameSide.add(CombatantSide.Critical);
        _combatantsForSameSide.add(CombatantSide.Defender);

        _combatantsForSameSide.add(CombatantSide.Critical);
        _combatantsForSameSide.add(CombatantSide.Toxic);

        assertEquals(CombatantSide.Critical, _combatantsForSameSide.iterator().next());
    }

    /**
     * Test method for {@link de.outstare.fortbattleplayer.model.impl.SimpleCombatant#setSide(java.lang.String)}.
     */
    @Test
    public void testSetSide() {
        final Set<CombatantSide> _combatants = new HashSet<>(2);

        final SimpleCombatant _combatant = new SimpleCombatant();

        _combatant.addObserver(new Set());

        _combatant.addObserver(null);

        _combatants.add(CombatantSide.Attack);
        _combatants.add(CombatantSide.Defender);

        _combatant.setSide("Attack");

        assertEquals("Attack", _combatant.getSide());

        _combatants.add(CombatantSide.Critical);

        assertEquals("Critical", _combatants.iterator().next());

        _combatant.setSide("Critical");

        assertEquals(CombatantSide.Critical, _combatants.iterator().next());

        _combatant.setSide(null);

        assertEquals(null, _combatants.iterator().next());
        assertEquals(null, _combatant.getSide());
    }

    /**
     * Class for testing damage calculation with WeaponData.
     */
    private class WeaponDataCalculationTest extends AbstractCharacterClassCalculationTester<Weapon> {
        
        @Override
        protected void update(final WeaponData data, final CharacterClass attacker, final CharacterClass defender, final CombatantObserver observer) {
            final int _damage = data.calculate(defender);
            System.out.println("Defender: " + defender);
            System.out.println("Attacker: " + attacker);
            System.out.println("Result " + _damage);
        }
    }
    
}