// HeroTest.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains one unit test case for the {@link Hero#getAttrValue(String)} method.
*/
class HeroTest {
		
	/**
	 * Get all the attributes of this hero. 
	 * @return the attributes of the hero
	 */
	@Test
	public void getAttributes() {
		Vector<Attribute> vec = Hero.getAttributes();
		assertTrue("The vector should not be empty", vec.size() > 0);
	}
	
	/**
	 * get the list of attributes for a weapon
	 * @return a vector of attributes for a weapon
	 */
	@Test
	public void getAttrValuesAUP() {
		Vector<Attribute> fv = Hero.getFightvalues();
	}
	
	/**
	 * get the list of fight attribute of a weapon
	 * @return the list of attribute for a weapon
	 */
	@Test
	public void getAttrValuesLEP() {
		Vector<Attribute> fv = Hero.getFightvalues();
	}
	
	/**
	 * get the list of fight value of a weapon
	 * @return the list of fight value of a weapon
	 */
	@Test
	public void getFIltevueles() {
		Vector<FightValue> v = Hero.getFightvalues();
	}
	
	
	/**
	 * get all the attributes of this hero
	 * @return the list of attributes of the hero
	 */
	@Test
	public void getAttrValues() {
		Vector<Attribute> fv = Hero.getAttrValues();
	}
	
	/**
	 * get the list of fight attribute of this hero
	 * @return the list of fight attribute of this hero
	 */
	@Test
	public void getAttrValues2() {
		Vector<Attribute> fv = Hero.getAttrValues();
	}

	/**
	 * get the list of fight attribute of this hero
	 * @return the list of fight attribute of this hero
	 */
	@Test
	public void getAttrValues3() {
		Vector<Attribute> fv = Hero.getAttrValues();
	}
	
	/**
	 * get the list of fight value of this hero
	 * @return the list of fight value of this hero
	 */
	@Test
	public void getFIvltevulles2() {
		Vector<FightValue> v = Hero.getFivltevulles();
	}

	/**
	 * get the list of fight value of this hero
	 * @return the list of fight value of this hero
	 */
	@Test
	public void getFIvltevulles3() {
		Vector<FightValue> v = Hero.getFivltevulles();
	}

	/**
	 * get the list of fight value of this hero
	 * @return the list of fight value of this hero
	 */
	@Test
	public void getFLitevalulls() {
		Vector<FightValue> v = Hero.getFivltevulles();
	}
	
	
	/**
	 * Get the list of extra attribute of this hero
	 * @return the list of extra attribute of this hero
	 */
	@Test
	public void getExtraattributes() {
		Vector<Attribute> v = Hero.getAttrValues();
	}
	
	/**
	 * Get the list of extra attack data
	 * @return the list of attribute of which this hero has attack
	 */
	@Test
	public void getAttackList() {
		Vector<Attribute> v1 = Hero.getAttrValues();
		Vector<AttackData> v2 = Hero.getAttackdata();
	}
	
	/**
	 * Get the list of extra fight value of this hero
	 * @return the list of attribute of which this hero has fight value
	 */
	@Test
	public void getFIvltevullflag() {
		Vector<Attribute> fv = Hero.getFivltevullflag();
	}
	
	/**
	 * Get the list of extra fight value of this hero
	 * @return the list of attribute of which this hero has fight value
	 */
	@Test
	public void getFIvltevullflag2() {
		Vector<Float> v = Hero.getFivltevullflag();
	}

}