// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains one unit test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {
// EnumeratedProperties.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Extension of {@link java.util.Properties} which allows one to specify property values which are
 * Lists of Strings.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class EnumeratedProperties extends Properties {

    /**
     * Returns the List value of the property with the supplied key. Note that one can call
     * getEnumeratedProperty() for a given key successfully if and only if setEnumeratedProperty()
     * for that key was called some time beforehand. All members of the list returned will be
     * Strings.
     *
     * @param key lookup of the enumerated property to be retrieved.
     * @return list containing String values
     */
    public List<String> getEnumeratedProperty(String key) {
        ArrayList<String> values = new ArrayList<String>();
        int i = 0;
        String value;
        while ((value = this.getProperty(key + delimiter + i++))!= null) {
            values.add(value);
        }
        return values;
    }
}

// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains one unit test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {
		
	public EnumeratedPropertiesTest() {
	}
	
	@Test
    public void listOfStrings() {
		//Given
		Properties p = new Properties();
		p.setProperty("a", "A");
		p.setProperty("b","B");
		p.setProperty("c","C");
		List<String> stringList = new ArrayList<String>();
		stringList.add("a");
		stringList.add("b");
		p.setProperty("D",stringList);

		p.store(fileName,"persons.properties");

		//When
		List<String> list = p.getEnumeratedProperty("D");

		//Then
		assertEquals("A","B");
		assertEquals("C","D");
		assertEquals("D","B");
		assertEquals(list,new ArrayList<String>());

	}
	
	@Test
    public void listOfListOfStrings() {
		//Given
		Properties p = new Properties();
		p.setProperty("a","A");
		p.setProperty("b","B");
		p.setProperty("c","C");
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		p.setProperty("D",list);

		p.store(fileName,"persons.properties");

		//When
		List<String> list = p.getEnumeratedProperty("D");

		//Then
		assertEquals("A","B");
		assertEquals("C","D");
		assertEquals(list,new ArrayList<String>());

	}
	
	@Test
    public void listOfStringsWithDelimiter() {
		//Given
		Properties p = new Properties();
		p.setProperty("a","A");
		p.setProperty("b","B");
		p.setProperty("c","C");
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		p.setProperty("d","a");
		p.setProperty("e","d");
		p.setProperty("f","e");
		p.setProperty("g",list);

		p.store(fileName,"persons.properties");

		//When
		List<String> list = p.getEnumeratedProperty("f");
		List<String> list2 = p.getEnumeratedProperty("g");
		
		//Then
		
		assertEquals("a","A");
		assertEquals("b","B");
		assertEquals("c","c");
		assertEquals(list,new ArrayList<String>());
		assertEquals(list,new ArrayList<String>());
		assertEquals(list2,new ArrayList<String>());
		assertEquals(list,new ArrayList<String>());
		assertEquals(list2,new ArrayList<String>());
		
                assertEquals(list,p.getEnumeratedProperty("b","b"));
                assertEquals(list,p.getEnumeratedProperty("d","b"));
                assertEquals(list,p.getEnumeratedProperty("e","d"));
                assertEquals(list,p.getEnumeratedProperty("f","e"));
                assertEquals(list,p.getEnumeratedProperty("g","e"));
                assertEquals(list,p.getEnumeratedProperty("h","e"));
                assertEquals(list,p.getEnumeratedProperty("i","e"));
                assertEquals(list,p.getEnumeratedProperty("j","e"));
                assertEquals(list,p.getEnumeratedProperty("k","e"));
                assertEquals(list,p.getEnumeratedProperty("l","e"));
                assertEquals(list,p.getEnumeratedProperty("m","e"));
                assertEquals(list,p.getEnumeratedProperty("n","e"));
                assertEquals(list,p.getEnumeratedProperty("o","e"));
                assertEquals(list,p.getEnumeratedProperty("p","e"));
                assertEquals(list,p.getEnumeratedProperty("q","e"));
                assertEquals(list,p.getEnumeratedProperty("r","e"));
                assertEquals(list,p.getEnumeratedProperty("s","e"));
                assertEquals(list,p.getEnumeratedProperty("t","e"));
                assertEquals(list,p.getEnumeratedProperty("u","e"));
                assertEquals(list,p.getEnumeratedProperty("v","e"));
                assertEquals(list,p.getEnumeratedProperty("w","e"));
                assertEquals(list,p.getEnumeratedProperty("x","e"));
                assertEquals(list2,p.getEnumeratedProperty("y","e"));
                assertEquals(list,p.getEnumeratedProperty("z","e"));
                
		System.out.println("========= done");
	}
    
}
