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
		
	
	@Test
	public void getAttrValue()
		throws Exception {
	
	
		
		Hero h1 = new Hero("Name", new FightValue(5), new FightValue(20));
		Hero h2 = new Hero("Name", new FightValue(4), new FightValue(10));
		fighter1 = new FightValue(1);
		fighter2 = new FightValue(1);
		fighter3 = new FightValue(2);
		fighter4 = new FightValue(1);
		fighter5 = new FightValue(2);
		fighter6 = new FightValue(1);
		fighter7 = new FightValue(3);
		fighter8 = new FightValue(1);
	
		h1.addAttrValue(fighter1);
		h1.addAttrValue(fighter2);
		h1.addAttrValue(fighter3);
		h1.addAttrValue(fighter4);
		h1.addAttrValue(fighter5);
		h1.addAttrValue(fighter6);
		h1.addAttrValue(fighter7);
		h1.addAttrValue(fighter8);
		
		fighter1.addFightValue(fighter2);
		fighter1.addFightValue(fighter3);
		fighter1.addFightValue(fighter6);
		fighter1.addFightValue(fighter7);
		fighter1.addFightValue(fighter8);
		fighter1.addFightValue(fighter2);
		fighter1.addFightValue(fighter3);
		fighter1.addFightValue(fighter4);
		
		fighter2.addFightValue(fighter3);
		fighter2.addFightValue(fighter5);
		fighter2.addFightValue(fighter6);
		fighter2.addFightValue(fighter7);
		fighter2.addFightValue(fighter8);
		fighter2.addFightValue(fighter3);
		fighter2.addFightValue(fighter4);
		
		fighter3.addFightValue(fighter5);
		fighter3.addFightValue(fighter6);
		fighter3.addFightValue(fighter7);
		fighter3.addFightValue(fighter8);
		fighter3.addFightValue(fighter4);
		
		fighter4.addFightValue(fighter5);
		fighter4.addFightValue(fighter6);
		fighter4.addFightValue(fighter7);
		fighter4.addFightValue(fighter8);
		fighter4.addFightValue(fighter5);
		fighter5.addFightValue(fighter6);
		fighter5.addFightValue(fighter7);
		fighter5.addFightValue(fighter8);
		fighter5.addFightValue(fighter6);
		fighter6.addFightValue(fighter7);
		fighter6.addFightValue(fighter8);
		fighter6.addFightValue(fighter5);
		fighter7.addFightValue(fighter6);
		fighter7.addFightValue(fighter8);
		fighter7.addFightValue(fighter5);
		fighter8.addFightValue(fighter6);
		fighter8.addFightValue(fighter7);
		fighter8.addFightValue(fighter8);

		fighter1.addFightValue(fighter2);
		fighter1.addFightValue(fighter3);
		fighter1.addFightValue(fighter4);
		fighter1.addFightValue(fighter5);
		fighter1.addFightValue(fighter6);
		fighter1.addFightValue(fighter7);
		fighter1.addFightValue(fighter8);
		fighter1.addFightValue(fighter2);
		fighter1.addFightValue(fighter3);
		fighter1.addFightValue(fighter4);
		fighter1.addFightValue(fighter5);
		fighter1.addFightValue(fighter6);
		fighter1.addFightValue(fighter7);
		fighter1.addFightValue(fighter8);
		fighter1.addFightValue(fighter2);
		fighter1.addFightValue(fighter3);
		fighter1.addFightValue(fighter4);
		fighter1.addFightValue(fighter5);
		fighter1.addFightValue(fighter6);
		fighter1.addFightValue(fighter7);
		fighter1.addFightValue(fighter8);
		fighter1.addFightValue(fighter2);
		fighter1.addFightValue(fighter3);
		fighter1.addFightValue(fighter4);
		fighter1.addFightValue(fighter5);
		fighter1.addFightValue(fighter6);
		fighter1.addFightValue(fighter7);

		fighter2.addFightValue(fighter3);
		fighter2.addFightValue(fighter5);
		fighter2.addFightValue(fighter6);
}
}