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
    void test1() throws HeroException {
		
		Hero hero = new Hero();
                
                hero.insertAttribute("id", "1");
                
		//check it throws if no id attribute
                assertThrows(InvalidKeyException.class, () -> hero.getAttrShort("id"));
                
                //check it throws if id attribute does not exists
                Document doc = new Document(hero.getElement());
                Vector <Element> elements = doc.getRoot().getElementsByTag("attribute");
                assertDoesNotContain(elements, hero.getElement());
                
		// check it throws if value of id is wrong
                assertThrows(IllegalArgumentException.class, () -> hero.getAttrValue("this stuff does not exist"));
		
                //check it throws if value of id is NULL
                assertThrows(IllegalArgumentException.class, () -> hero.getAttrValue(null));
                
		//check it throws if value of id is 0
		assertThrows(IllegalArgumentException.class, () -> hero.getAttrValue("id"));
                
		//check it throws if value of id is null
                assertThrows(IllegalArgumentException.class, () -> hero.getAttrValue(null));
                
		//check it throws if value of id is not valid integer
                assertThrows(IllegalArgumentException.class, () -> hero.getAttrValue("id"));
                
                //check it throws if value of id is invalid integer
                assertThrows(IllegalArgumentException.class, () -> hero.getAttrValue("id"));
                
                //check it throws if value of id is invalid boolean
                assertThrows(IllegalArgumentException.class, () -> hero.getAttrValue("id"));
                
                //check it throws if value of id is not value of character
                assertThrows(IllegalArgumentException.class, () -> hero.getAttrValue("id"));
                
                //check it throws if value of id is not valid boolean
                assertThrows(IllegalArgumentException.class, () -> hero.getAttrValue("id"));
                
		//check it throws if the value is NULL
                Vector <Element> children = hero.getElement().getElements();
                Iterator <Element> childrenIter = children.iterator();
                Element child = childrenIter.next();
                assertThrows(IllegalArgumentException.class, () -> child.getText());
                
		//check it throws if a value is null
                Vector <Element> children2 = hero.getElement().getElements();
                children2.elementAt(0).getText();
                assertThrows(IllegalArgumentException.class, () -> children2.elementAt(0).getText());
                
		//check it throws if a value is a wrong primitive
                assertThrows(IllegalArgumentException.class, () -> hero.getAttrValue(12));
                
        }
        
		
}
