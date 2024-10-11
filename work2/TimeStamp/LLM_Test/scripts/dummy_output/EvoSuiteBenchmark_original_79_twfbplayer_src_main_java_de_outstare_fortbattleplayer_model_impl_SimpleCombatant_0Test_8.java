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
		 * A static method for creating an instance to test with.
		 *
		 * @return the static method
		 */
	@Test
	public void _getMaxLP() {
		final Set<SectorBonus> sectors = new HashSet<>();
    final Set<Attack> attacks = new HashSet<>();
    final CharacterClass c = new CharacterClass("CharacterClass");
	final String weapon = "Weapon(lps = 10, hps = 10)";
    final String weaponType = "Axe(lps = 10, hps = 10)";
    final Set<Warfighting> warfighting = new HashSet<>();
	
		SimpleCombatant s = new SimpleCombatant(c,weapon,weaponType,sectors,attacks, warfighting);
		
		int maxLP = s._getMaxLP();
					
		assertTrue((s.isValid())
				&&(s._getMaxLP() > 0));
		
		System.out.println();

    //System.out.println("Max HP: " + s._getMaxLP());
		System.out.println("\nAttack set size: "+attacks.size());
		System.out.println("\nUnit attacks: " + attacks.size());

		assertEquals(2, attacks.size());
		
		assertTrue(attacks.contains(new Attack(Attack.SLOT_STOP)));
    assertTrue(attacks.contains(new Attack(Attack.SLOT_LAST)));
    assertTrue(attacks.contains(new Attack(Attack.SLOT_FIRST)));
		
		assertTrue(s._getMaxLP()==2) ;
		
		System.out.println("\nTOTAL attack slot size: " + attacks.size());
	}

	/**
	 * Some testing cases.
	 * @throws java.io.IOException 
	 */
	@Test
	public void SimpleCombatantTester_1() throws Exception {
    final CharacterClass c = new CharacterClass("CharacterClass");
	final Set<SectorBonus> sectors= new HashSet<>();
    final Set<Attack> attacks = new HashSet<>();
    final Set<Warfighting> warfighting = new HashSet<>();
	final Weapon temp_weapon = new Weapon("Weapon", "Axe", "Tac", 15, Weapon.WEAPON_STAFF);
	final WeaponData temp_weaponData = new WeaponData(temp_weapon,"Axe");
	final Set<WeaponData> temp_attackList = new HashSet<>();

		final Weapon temp_weapon2 = new Weapon("Weapon", "Axe", "Tac", 15, Weapon.WEAPON_STAFF2);
		final WeaponData temp_weaponData2 = new WeaponData(temp_weapon2,"Axe");
		final Set<WeaponData> temp_attackList2 = new HashSet<>();		
   		final Set<Attack> temp_attack = new HashSet<>();
	
   		temp_weapon.setData(temp_weaponData);
			temp_weapon.setData(temp_weaponData2);
    			
    				setSectorBonus(temp_weapon.getSectorBonus(), new SectorBonus(temp_weapon.getSectorBonus().getName()));
    				setAttackData(temp_weapon.getAttackData(), temp_weaponData2);
    				setAttackData(temp_weapon.getAttackData(), temp_weaponData2, temp_attack);
    						
    					temp_weapon.addAttack(temp_attack);
   				temp_attack2=temp_weapon2.getDamage(temp_weaponData2);
  		try{	
   					temp_attack2 = temp_weapon2.getDamage(temp_weapon);
   						}
  				catch(Exception e){	
   						fail();
   					}
   					final Combatant temp_combatant = new Combatant("Combatant", "Axe(lps: "+temp_weaponData2.getDamage()+", hps: "+temp_weaponData2.getHealth()+")");
   					temp_combatant.addAttack(temp_attack2);
    
    				temp_combatant.addDamage(temp_weapon, temp_weaponData2);
    				temp_weaponData.addTarget(temp_combatant.getName());
    				assertEquals(2, temp_weaponData.getAttackList().size());
    				assertTrue(temp_weaponData.getAttackList().contains(temp_attack));
    				System.out.println("\nWE APO: "+temp_weaponData.getAttackList().contains(temp_attack));
    				
    				temp_weaponData.addTarget(temp_combatant.getName());
    				assertEquals(2, temp_weaponData.getAttributeList().size());
    				final AttributeData temp_weaponAttribute = temp_weaponData.getAttributeList().get(0);	
    				final AttributeData temp_combatantAttribute = temp_combatant.getAttributeList().get(0);
    				assertEquals(temp_weaponAttribute.getValue(), 15);
    							
    				temp_combatant.setState(Combatant.STATE_NONE);
    				System.out.println("\nTEST 1S 1D: " + temp_combatant.isValid());
    				
    				System.out.println();
    				
    				assertTrue(temp_combatant.isValid());

 				assertTrue(temp_combatant.canContain(temp_weapon, temp_combatant)==false);
    
   				     	
   				    	
    				    temp_weapon.addAttack(temp_combatant.getName());
    				    temp_weaponsList.add(temp_weapon);
    				    
    				    final Attack temp_attack2_1=new Attack("Dummy attack 2");  // 1st Dummy attack
    				    final WeaponData temp_weaponData_1=new WeaponData(temp_weapon,"Sword(lhs:0,uhs:0)");
    				    temp_weapon.setAttackData(temp_weaponData_1);
    				    
    				    temp_combatant.addAttack(temp_combatant.getName(),temp_attack2_1);		
		
}
}