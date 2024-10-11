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
		
    //
    private final static Logger LOG = Logger.getLogger(SimpleCombatant_0Test.class.getName());

    /**
     * Test method for {@link de.outstare.fortbattleplayer.model.impl.SimpleCombatant#_getMaxLP()}.
     */
    @Test
    public void _getMaxLP(){
        Set<CombatantObserver> old = new HashSet<CombatantObserver>();
        CombatantState cs = new CombatantState();
        Area area = new Area("Area"+1, cs);
        Combatant cs1 = new SimpleCombatant();
        Combatant si = new SimpleCombatant("SectorBonus"+1, cs1, cs);
        Combatant sidec = new CombatantSide("SectorBonus"+1, cs1, cs);

        CombatantObserver co1 = new CombatantObserver("Old", old);
        old.add(co1) ;

        CombatantObserver co2 = new CombatantObserver("Co3", new HashSet<CombatantObserver>());
        old.add(co2);

        CombatantObserver co3 = new CombatantObserver("Co4", new HashSet<CombatantObserver>());
        old.add(co3);
        old.add(co2);
        
        CombatantObserver ca = new CombatantObserver("Ch2", new HashSet<CombatantObserver>());
        old.add(ca);

        Combatant cs2 = new SimpleCombatant("SectorBonus" + 1, cs, cs1);
        Combatant sidec2 = new CombatantSide ("SectorBonus" + 1, cs, cs1, cs2);
        Combatant cs3 = new SimpleCombatant("SectorBonus" + 1, cs1, cs);
        Combatant sidec3 = new CombatantSide ("SectorBonus" + 1, cs1, cs);
        Combatant cs4 = new SimpleCombatant("SectorBonus" + 1, cs, cs2, cs3);
        Combatant sidec4 = new CombatantSide ("SectorBonus" + 1, cs, cs3, cs4);

        Combatant cs5 = new SimpleCombatant("SectorBonus" + 1, cs2, cs3);
        Combatant sidec5 = new CombatantSide ("SectorBonus" + 1, cs2, cs3);
        Combatant cs6 = new SimpleCombatant("SectorBonus" + 1, cs, cs2, cs);
        Combatant sidec6 = new CombatantSide ("SectorBonus" + 1, cs3, cs);

        Combatant cc1 = new SimpleCombatant("SectorBonus"+1, cs3, cs);
        Combatant cc2 = new SimpleCombatant("SectorBonus"+1, cs3, cs2);
        Combatant cc3 = new SimpleCombatant("SectorBonus"+1, cs6, cc);
        Combatant cc4 = new SimpleCombatant("SectorBonus"+1, cs, cs3, cc1, cc2);
        Combatant cc5 = new SimpleCombatant("SectorBonus"+1, cs, cs5,cc3, cc4);
        Combatant cc6 = new SimpleCombatant("SectorBonus"+1, cs, cs2,cc1, cc3, cc5);
		
		CombatantObserver ca1 = new CombatantObserver("SectorBonus"+1, cs );
		
		CombatantObserver ca2 = new CombatantObserver("SectorBonus"+1, cs1 );
		
		CombatantObserver cb = new CombatantObserver("SectorBonus"+1, cs2 );
    
    }
}