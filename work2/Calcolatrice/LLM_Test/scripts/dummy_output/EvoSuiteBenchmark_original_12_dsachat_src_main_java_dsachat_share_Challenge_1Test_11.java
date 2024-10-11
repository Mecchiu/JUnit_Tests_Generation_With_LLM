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
		/**
		 * generate new challenge
		 */
		public Challenge_1Test() { }
		
		/**
		 * generate a new challenge for talents
		 * @param talentName the short variant
		 * @param h the hero
		 */
		public Challenge_1Test(String talentName, Hero h) {
			String talent;
			if (talentName.equals("talent_"+System.currentTimeMillis())) {
				talent = talentName.substring(7);
			}
			Talent t = buildTalent(talent);
			t.setHero(h);
			talent = h.getString("talent");
			if (talentName.contains("talent_"+System.currentTimeMillis())) {
				String[] tal = talentName.split("talent_");
				t.setTalent(Talent_1_2.get(tal[5]));
				t.setString(tal[1],tal[2],"talent_"+System.currentTimeMillis());
				//t.setString(tal[5],tal[5],"sce_"+System.currentTimeMillis());
			}
			c1 = t;
			assertEquals(t,c1.getTalent());
			c2 = t;
			assertEquals(t,c2.getTalent());
			c3 = t;
			assertEquals(Talent_1_2.get(tal[1]), c3.getTalent());
		}
                
    public static void main(String[] args)throws Exception{
        new Challenge();
    }

	public int getChallengeSize() {
		//System.out.println(c1.getTo());
		return 19;
	}
	public void setResponse(String response) {
		// System.out.println(c1.getTo());
	}
	
	public void testRollAttack() {
			t = c1.getTalent();
			assertTrue(c1.isAttrFromHero());
			int skill = 0;
			while(skill<25){
					assertTrue("the skill of the talent should >25",skill<25);
					skill++;
			}
	}
	
	public void testRollSkill() {
			c3=c2.getTalent();
			assertTrue(c2.isAttrFromHero());
			int skill = 0;
			Skill sk = Skill_1.get(c2.getString("skill"));
			while( skill<8){
					assertTrue("the skill of the talent should >8",skill<8);
					sk=Skill_1.get(c2.getString("skill"));
					skill++;
			}
	}
	public void testRollWep() {
			Vector<Weapon> wep = new Vector<Weapon>();
}
}