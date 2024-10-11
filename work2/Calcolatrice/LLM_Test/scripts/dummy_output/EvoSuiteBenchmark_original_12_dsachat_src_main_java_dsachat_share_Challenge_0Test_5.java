// Challenge_0Test.java
package dsachat.share;

import java.io.Serializable;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Challenge}.
* It contains one unit test case for the {@link Challenge#roll()} method.
*/
class Challenge_0Test {
		
    private static final int TALENTS = 6;
    
    // Constructor
    public Challenge_0Test() {
    }
    
    /**
     * test roll()
     * test to be able to roll for a challenge
     */
    @Test
    public void testRoll()throws Exception {
		
        Hero h = Hero.newHero();
		Hero h_dud = Hero.newHero();
		Hero h_dud_dud = Hero.newHero();
		Hero h_new = getHero( (String)null);
		
		finalint ret = Challenge.roll();
		
		// check results
		if (ret > TALENTS) {
			fail("result > TALENTS\n");
		}
		assertEquals((int)ret, TALENTS);
		
		// check result from dud
    }
    
    private Hero getHero(String t) {
        Hero h = Hero.newHero();
        h.addTalent(t);
        return h;
    }
    
    /**
     * test roll fight
     * test to be able to roll for a challenge
     */
    @Test
    public void testRollFight() {
     
        Hero h_dud = Hero.newHero();
        
        h_dud.addWeapon(Weapon.newWeapon("dud", 10));
        
        finalint result = Challenge.rollFight();
        
        // check result
        if (result > TALENTS) {
			fail("result > TALENTS\n");
		}
		
		// check result from dud and h_dud
      
		// check result from dud
        if(result == Challenge.dice(10)) {
        	fail("result for dud :"+result);
        } 
        assertEquals((int)result, TALENTS);
    }
  
    /**
     * test roll talent
     * test to be able to roll for a challenge
     */
    @Test
    public void testRollTalent() {

        Hero h_dud = Hero.newHero();
        
        h_dud.addTalent(Talent.newTalent("dud", 10, 1));
        
        final int result = Challenge.rollTalent();
        
        if (result > TALENTS) {
			fail("result > TALENTS\n");
		}
		
		// check result from h_dud
        if(result == Challenge.dice(10)) {
        	fail("result for h_dud: " + result);
        }
        
        assertEquals((int)result, TALENTS);
    }
  
    /**
     * test roll attr
     * test to be able to roll for a challenge
     */
    @Test
    public void testRollAttr() {

        Hero h_dud = Hero.newHero();
        
        h_dud.addAttribute(Attribute.newAttribute("dud", 10, 2));
        
        final int result = Challenge.rollAttr();
        
        if (result > TALENTS) {
			fail("result > TALENTS\n");
		}
		
		// check result from h_dud
        if(result == Challenge.dice(10)) {
        	fail("result for h_dud  : " + result);
        }
        
        assertEquals((int)result, TALENTS);
    }
  
}