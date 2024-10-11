// Challenge_1Test.java
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
* It contains one unit test case for the {@link Challenge#dice(int)} method.
*/
class Challenge_1Test {
		
    @Test
    public void test(){
        //create a blank challenge
        Challenge challenge = new Challenge();
        
        //Test getHero()
        //assertEquals(challenge.getHero(), challenge.getTalent());

        //Test getAttr()
        String attr = "attr1";
        assertEquals(champion.getAttr(attr), challenge.getAttr(attr));
        
        //test getAttr()
        attr = "attr2";
        assertEquals(champion.getAttr(attr), challenge.getAttr(attr));

        //test getAttrFromClass
        assertEquals(champion.getAttrFromClass(Weapon.class, attr), challenge.getAttrFromClass(Weapon.class, attr));

        //test getTalent()
        Talent talent = new Talent();
        assertEquals(champion.getTalent(talent,attrib), challenge.getTalent(talent,attrib));
        
        //test getTalent()
        assertEquals(champion.getTalent(talent,attrib), challenge.getTalent(talent,attrib));

        
        //Test getTalentFromRole
        Talent tal = new Talent();
        assertEquals(champion.getTalentFromRole(talent,talent), challenge.getTalentFromRole(talent,talent));
        
        //test getTalentFromRole()
        assertEquals(champion.getTalentFromRole(talent,talent), challenge.getTalentFromRole(talent,talent));

        //test getSword()
        Weapon weapon = new Weapon();
        assertEquals(champion.getSword(weapon), challenge.getSword(weapon));

        //test getSword()
        assertEquals(champion.getSword(weapon), challenge.getSword(weapon));	

        //test getWeapon()
        assertEquals(champion.getWeapon(weapon), challenge.getWeapon(weapon));
        
        //test getTalent()
        assertEquals(champion.getTalent(talent,weapon), challenge.getTalent(talent,weapon));
    }
    
    
    /**
     * @Test
     */
    @Test
    public void getClassTest() {
        assertEquals("Challenge", Champion.class.getName());
    }
}