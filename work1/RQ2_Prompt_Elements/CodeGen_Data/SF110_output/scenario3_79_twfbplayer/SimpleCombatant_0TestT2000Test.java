// SimpleCombatant_0Test.java
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
* It contains one unit test case for the {@link SimpleCombatant#_getMaxLP()} method.
*/
class SimpleCombatant_0Test {
/**
		 * Test this class in JUnit framework (i.e. JUnit testng)
		 */

	@SuppressWarnings("unused")
		private static final Logger log = Logger.getLogger(SimpleCombatant_0Test.class.getName());

        @Test
        public final void test_0Constructor() {
            // we can't create a combatant using an empty area or side
            try {
                new SimpleCombatant();
                fail();
            }
            catch (IllegalStateException e) {
				// expected
            }
        }

        @Test
        public final void test_00GetMaxLP() {
            // the max value of HP, i.e. the maximal number of hits a character can hit
            assertEquals(36, new SimpleCombatant()._getMaxLP().intValue());
        }

        // this is the test case that is run inside the tests
        protected final SimpleCombatant() {}

        public @CombatantData final static String ID = "ID";
        public final void test_01GetMaxLP() {
        	Combatant s1 = new SimpleCombatant(ID, CharacterClass.getClassification(CombatantSide.RIGHT));
            assertEquals(CombatantSide.RIGHT.getMaxLp(), s1.getMaxLP().intValue());
        }
        
        public final void test_10IsInitialized() {
        	Combatant s1 = new SimpleCombatant(ID, CombatantSide.RIGHT);
            assertTrue(s1.isInitialized());
        }
    }
    
	public static Combatant toCombatantObj(final UnitFactory unitFactory) {
        return unitFactory.makeCombatant(new SimpleCombatant_0Test());
	}
	
	public static class Combatant_0Test implements Combatant.Observer<CombatantSide>, Comparable<Combatant_0Test> 
	{

		/**
		 * Default constructor
		 */
        public Combatant_0Test() {
			// empty default constructor
		}

		/**
		 * Default constructor for CombatantType
		 * @param side the side to initialize the unit from
		 * @throws IllegalArgumentException if the side is null or not supported
		 */
        public Combatant_0Test(final CombatantSide side) {
			assertNotNull(side);
			_combatantSide = side;
		}

		/** {@inheritDoc} */
		@Override
		public int compareTo(final Combatant_0Test otherValue) {
			if (_combatantSide == null) {
				throw new IllegalArgumentException("CombatantSide is null, which should not happen");
			}
			else if (<warning descr="Condition 'otherValue._combatantSide == null'">otherValue._combatantSide == null</warning>) {
				throw new IllegalArgumentException("'otherValue' should not happen");
			}
			else if (_combatantSide == otherValue._combatantSide) {
				return 0;
			}
			else {
				return -1;
			}
		}

		@Override
		public int hashCode() {
            // not necessary for now
			return 0;
		}

		@Override
		public boolean equals(final Object x) {
			return x instanceof Combatant_0Test && (_combatantSide == null? (x instanceof Combatant) : _combatantSide == null? (x instanceof CombatantSide) : getClass().equals(((Combatant_0Test)x).getClass()));
		}

		@Override
		public Set<CombatantSide> getSectors() {
			// we don't support sector objects
			return null;
		}

		protected final CombatantSide _combatantSide;

		protected final Combatant _combatant;

		protected static final Set<CombatantSide> COMBATANT_SIDES = new HashSet<>();
		static {
			COMBATANT_SIDES.add(CombatantSide.RIGHT);
		}

		static {
			Combatant_0Test[] unitToClass = Combatant_0Test.class.getEnumConstants();
			for (Combatant_0Test unit: unitToClass) {
				CombatantSide side = unitFactory().isInSector(unit)? CombatantSide.RIGHT : CombatantSide.LEFT;
				CombatantCombatant _combatantCombatant = new CombatantCombatant(side);
				Combatant_0TestImpl_0.COMBATANT_SIDES.add(_combatantCombatant.getCombatantSide());
			}
		}

		/**
		 * Sole constructor
		 * @param side the side to initialize the unit from, which should not be passed as null
		 */
		public Combatant_0Test(final CombatantSide side) {
			assertNotNull(side);
			_combatantSide = side;
			_combatant = Combatant_0TestImpl.toCombatantObj(this);
		}

	    @Override
		public void combatantInitialized(final CombatantState _combatantState) {
			// if the state was changed on the side it is no longer valid.
			if (CombatantSide.RIGHT == _combatant.getCombatantSide()) {
				return; // do nothing
			}

			// this test should not be called after the side that was locked was created
			for (CombatantSide side: Combatant_0TestImpl.COMBATANT_SIDES ) {
				if (CombatantSide.RIGHT == side) {
					_combatantState.setResolveMode();
					break; // break; we'll create a new side and continue
				}
			}
		}
        
        private static final String ID = "ID";
        public final void test_01GetMaxLP() {
        	Combatant s1 = new Combatant_0Test(CombatantSide.RIGHT);
            assertEquals(CombatantSide.RIGHT.getMaxLp(), s1.getMaxLP().intValue());
        }
        
        public final void test_10IsInitialized() {
        	Combatant s1 = new Combatant_0Test(CombatantSide.RIGHT);
        	assertTrue(s1.isInitialized());
        }
        
        public @CombatantData final static String ID = "ID";
		public final void test_11IsInitialized() {
			