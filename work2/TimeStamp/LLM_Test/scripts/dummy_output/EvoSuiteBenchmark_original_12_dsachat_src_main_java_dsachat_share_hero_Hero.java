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
     * Test class
     */
    private class ElementTest extends Mock {

        private Element e;

        public ElementTest(Element element) {
            this.e = element;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    @Test
    public void testGetAttrValue(){
    	final Attribute a = Mock.mock(Attribute.class, "a");
    	final Element e = Mock.mock(Element.class, "i");
        Mock.mock(a, "returns").setValue(new HashSet<>(Arrays.asList(new Character[]{Character.valueOf('a'), Character.valueOf('b'), Character.valueOf('c')})));
        assertTrue(a.getValue().contains(Character.valueOf('a')));
        assertTrue(a.getValue().contains(Character.valueOf('b')));
        assertTrue(a.getValue().contains(Character.valueOf('c')));
    	
        Mock.mock(Element.class, "returns").setValue(new HashSet<>(Arrays.asList(new Character[]{Character.valueOf('a'), Character.valueOf('b'), Character.valueOf('c')})));
        assertTrue(a.getValue().contains(Character.valueOf('b')));
        assertTrue(a.getValue().contains(Character.valueOf('c')));
    }
	
    @Test
    public void testSearchFV() {
        final ElementTest e = new ElementTest(Mock.mock(Element.class, "i"));
        Mock.mock(e, "returns").setValue(Mock.mock(FightValue.class, "a"));
        Mock.mock(e, "returns").setValue(Mock.mock(FightValue.class, "b"));
        Mock.mock(e, "returns").setValue(Mock.mock(FightValue.class, "c"));
        
		FightValue fv1 = Mock.mock(e, "returns").getFightValue();
		assertEquals('b', fv1.getName());
		assertEquals(1, fv1.getAttrValue("a"));
		
		FightValue fv2 = Mock.mock(e, "returns").getFightValue();
		assertEquals('c', fv2.getName());
		assertEquals(2, fv2.getAttrValue("a"));
		
		FightValue fv3 = Mock.mock(e, "returns").getFightValue();
		assertEquals('d', fv3.getName());
		assertEquals(3, fv3.getAttrValue("a"));
    }

}