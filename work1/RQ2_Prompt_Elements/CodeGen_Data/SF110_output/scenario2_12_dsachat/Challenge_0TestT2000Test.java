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
// Challenge.java
package dsachat.share;

import java.io.Serializable;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;

/**
 * This class represents a challenge.<br>
 * It is created by a client and sent to the server which executes the internal task.
 * <br>
 * A challenge can be a talent, spell, attribute or weapon.
 *
 * @author bernshausen
 */
public class Challenge implements Serializable {

    /**
     * execute this challenge
     * differ between talents, attributes or fight
     *
     * @return the result as string
     */
    public String roll() {
        if (t!= null)
            return rollTalent();
        if (attrib!= null)
            return rollAttr();
        if (w!= null) {
            return rollFight();
        }
        return " missing Talent, Spell,...";
    }
}

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
		
}

/**
 * Test class of Challenge_1Test.java
 * It contains one unit test case for the {@link Challenge_1#roll()} method.
*/
class Challenge_1Test {		
	/**
	 * Test that checks and rolls if the first unit is a talent
	 * @throws Exception - test fails with a random Exception.
	 */
	@Test
    public void testRoll() throws Exception
	{
		// test with a number of talents
		final int numTalents = 10+Math.abs(System.currentTimeMillis())%3;
		final Talent firstTalent 	= new Talent("Talent"+System.currentTimeMillis(), numTalents, 0);
		final Talent secondTalent 	= new Talent("Talent"+(System.currentTimeMillis()%3)+1, numTalents, 1);
		String r;
		rollTalent();
		switch(firstTalent.getAbility())
		{
			case Talent.ability_war :
			case Talent.ability_war_2 :
				r = "fail";
				break;
			default:
				r = "succeed";
		}
		//test with a number of attributes
		final int numAttributes = 10+Math.abs(System.currentTimeMillis())%3;
		final int indexOfAttribute 		=  Math.abs(System.currentTimeMillis()%3)+1;
		final Ability attrib 				= new Ability(indexOfAttribute, numAttributes, 0, 0);
		secondTalent.setAbility(attrib.getName());
		String s;
		string += "r: "+r+",\tattrib: "+attrib.getName();
		rollAttr();
		switch(attrib.getAbility())
		{
			case Ability.ability_damage :
				s = "fail";
				break;
			case Ability.ability_special_attribute:
				s = "succeed";
				break;
			default:
				s = "fail";
		}
		switch(s) {
			case "succeed":
			case "fail":
				rollFight();
				break;
			case "succeed_0" :
				break;
			default :
				break;
		}
		s = "r: "+r+",\ttag: "+attrib.getName();
		rollTalent();
		r="pass";
		switch(attrib.getIndex())
		{ 
			case Skill.index_attr
				s = "succeed_0";
				break;
			case Skill.index_power
				s = "fail_0";
				break;
			default :
				s = "pass";
				break;
		}
		s="pass";
		switch(s) {
			case "succeed_0" :
				break;
			default :
				break;
		}
		//checks with a number of weapons
		final int wNum = 10+Math.abs(System.currentTimeMillis())%3;
		final Weapon w 				= new Weapon("Weapon"+System.currentTimeMillis(), wNum, 0, 0);
		string += " wNum: "+wNum+"\thint: "+wNum;
		rollFight();
		switch(wNum)
		{
			case 11:
				break;
			case 12:
				r="pass";
				break;
			default :
				r="pass";
				
		}
		string+=",\twNum: "+wNum+"\t\tweapon: "+w+"\thint: "+wNum;
		rollFight();
		switch(wNum)
		{
			case 11:
				break;
			case 12:
				r="pass";
				break;
			default :
				r="pass";
				

		}
		if (s!= r) {
			// checks when first and second talents are the same
			final Ability otherAttrib = new Ability(indexOfAttribute, numAttributes, 0, 0);
			string += ",other attrib: "+otherAttrib.getName();
			s="pass";
			switch(otherAttrib.getAbility()) {
				case Ability.ability_damage :
					s = "succeed";
					break;
				case Ability.ability_special_attribute:
					s = "succeed_0";
					break;
				default:
					s = "pass";
				
			}
			switch(wNum)
			{
				case 11:
				case 12:
					r="pass";
					break;
			}
			r="pass";
			s="fail";
			switch(s) {
				case "succeed":
				case "fail":
				break;
				case "fail_0":
					s="pass";
					break;
				default :
					s="pass";
			}
			assertTrue(s.equals(r));
			fail("Tests do not pass because wNum: "+wNum+"\twindow is: "+wNum;
			
		}
		string += "\t\twindow is: "+wNum;
		rollFight();
		switch(attrib.getSpell())
		{
			case Talent.ability_skill_1 :
				s = "succeed";
				break;
			default:
				s = "fail";
		}
		assertTrue(s.equals(r));
		fail("Tests do not pass because attrib is: "+attrib.getName());
		
	}
}