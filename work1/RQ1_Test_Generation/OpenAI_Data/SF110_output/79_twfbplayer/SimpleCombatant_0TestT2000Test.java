// SimpleCombatant_0Test.java
package de.outstare.fortbattleplayer.model.impl;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
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
* It contains ten unit test cases for the {@link SimpleCombatant#_getMaxLP()} method.
*/
class SimpleCombatant_0Test {

		/**
		 * Test method for {@link SimpleCombatant#_getMaxLP()}.
		 */
		@Test
		void test_getMaxLP_0() {
				// given
				final SimpleCombatant fixture = new SimpleCombatant(CombatantSide.RED, new CombatantState(new Area(0, 0), 1, 1, false), 1, "", null, Weapon.BAYONET, "");
				// when
				final int result = fixture._getMaxLP();
				// then
				assertEquals(1, result);
		}
		
		/**
		 * Test method for {@link SimpleCombatant#_getMaxLP()}.
		 */
		@Test
		void test_getMaxLP_1() {
				// given
				final SimpleCombatant fixture = new SimpleCombatant(CombatantSide.RED, new CombatantState(new Area(0, 0), 1, 1, false), 1, "", null, Weapon.BAYONET, "");
				// when
				final int result = fixture._getMaxLP();
				// then
				assertEquals(1, result);
		}
		
		/**
		 * Test method for {@link SimpleCombatant#_getMaxLP()}.
		 */
		@Test
		void test_getMaxLP_2() {
				// given
				final SimpleCombatant fixture = new SimpleCombatant(CombatantSide.RED, new CombatantState(new Area(0, 0), 1, 1, false), 1, "", null, Weapon.BAYONET, "");
				// when
				final int result = fixture._getMaxLP();
				// then
				assertEquals(1, result);
		}
		
		/**
		 * Test method for {@link SimpleCombatant#_getMaxLP()}.
		 */
		@Test
		void test_getMaxLP_3() {
				// given
				final SimpleCombatant fixture = new SimpleCombatant(CombatantSide.RED, new CombatantState(new Area(0, 0), 1, 1, false), 1, "", null, Weapon.BAYONET, "");
				// when
				final int result = fixture._getMaxLP();
				// then
				assertEquals(1, result);
		}
		
		/**
		 * Test method for {@link SimpleCombatant#_getMaxLP()}.
		 */
		@Test
		void test_getMaxLP_4() {
				// given
				final SimpleCombatant fixture = new SimpleCombatant(CombatantSide.RED, new CombatantState(new Area(0, 0), 1, 1, false), 1, "", null, Weapon.BAYONET, "");
				// when
				final int result = fixture._getMaxLP();
				// then
				assertEquals(1, result);
		}
		
		/**
		 * Test method for {@link SimpleCombatant#_getMaxLP()}.
		 */
		@Test
		void test_getMaxLP_5() {
				// given
				final SimpleCombatant fixture = new SimpleCombatant(CombatantSide.RED, new CombatantState(new Area(0, 0), 1, 1, false), 1, "", null, Weapon.BAYONET, "");
				// when
				final int result = fixture._getMaxLP();
				// then
				assertEquals(1, result);
		}
		
		/**
		 * Test method for {@link SimpleCombatant#_getMaxLP()}.
		 */
		@Test
		void test_getMaxLP_6() {
				// given
				final SimpleCombatant fixture = new SimpleCombatant(CombatantSide.RED, new CombatantState(new Area(0, 0), 1, 1, false), 1, "", null, Weapon.BAYONET, "");
				// when
				final int result = fixture._getMaxLP();
				// then
				assertEquals(1, result);
		}
		
		/**
		 * Test method for {@link SimpleCombatant#_getMaxLP()}.
		 */
		@Test
		void test_getMaxLP_7() {
				// given
				final SimpleCombatant fixture = new SimpleCombatant(CombatantSide.RED, new CombatantState(new Area(0, 0), 1, 1, false), 1, "", null, Weapon.BAYONET, "");
				// when
				final int result = fixture._getMaxLP();
				// then
				assertEquals(1, result);
		}
		
		/**
		 * Test method for {@link SimpleCombatant#_getMaxLP()}.
		 */
		@Test
		void test_getMaxLP_8() {
				// given
				final SimpleCombatant fixture = new SimpleCombatant(CombatantSide.RED, new CombatantState(new Area(0, 0), 1, 1, false), 1, "", null, Weapon.BAYONET, "");
				// when
				final int result = fixture._getMaxLP();
				// then
				assertEquals(1, result);
		}
		
		/**
		 * Test method for {@link SimpleCombatant#_getMaxLP()}.
		 */
		@Test
		void test_getMaxLP_9() {
				// given
				final SimpleCombatant fixture = new SimpleCombatant(CombatantSide.RED, new CombatantState(new Area(0, 0), 1, 1, false), 1, "", null, Weapon.BAYONET, "");
				// when
				final int result = fixture._getMaxLP();
				// then
				assertEquals(1, result);
		}
		
}

// SimpleCombatant_1Test.java
package de.outstare.fortbattleplayer.model.impl;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import