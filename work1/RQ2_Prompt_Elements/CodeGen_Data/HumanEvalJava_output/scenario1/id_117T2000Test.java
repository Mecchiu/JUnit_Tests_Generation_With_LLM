// SelectWordsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains one unit test case for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {
// SelectWords.java
package scenario1;

import java.util.ArrayList;
import java.util.List;

class SelectWords {

    public static List<Object> selectWords(String s, int n) {
        List<Object> result = new ArrayList<>();
        String[] words = s.split(" ");
        for (String word : words) {
            int consonants = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c!= 'a' && c!= 'e' && c!= 'i' && c!= 'o' && c!= 'u' && c!= 'A' && c!= 'E' && c!= 'I' && c!= 'O' && c!= 'U') {
                    consonants++;
                }
            }
            if (consonants == n) {
                result.add(word);
            }
        }
        return result;
    }
}

// SelectWordsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains one unit test case for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {
		/**
		* Returns a new list of words.
		*
		* @return a new list.
		*/
        @Test
    public void returnWords() {}

		/**
		* {@link List#add(Object)} adds an element to a list.
		*
		* @throws NullPointerException for {@code s} if null or if an element cannot be added to a list.
		*/
        @Test
    public void addToList() throws NullPointerException {     	
        List<Object> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        assertNotNull("List must not be null", list);          	
        assertTrue("List's length must be 3", list.length() == 3);	 
		}

		/**
		* {@link List#addAll(java.util.List)} adds an array of elements to a list.
		* 
		* @throws NullPointerException for any null parameters.
		*/
        @Test
    public void addAllToList() throws NullPointerException { 	
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        assertTrue("list must be size 3", list.size() == 3);
        assertTrue("list must be size 2", list.get(2).equals("test2"));
        }

		/**
		* {@link List#remove(Object)} removes and returns an element from a list.
		*
		* @throws IndexOutOfBoundsException for an invalid index.
		* @throws NullPointerException for the list to be empty.
		*/
        @Test
    public void removeElement() throws IndexOutOfBoundsException {			
        List<Object> list = new ArrayList<>();
        list.add("test1");
        list.remove("test2");
        assertTrue("List is not empty", list.isEmpty());
        }

		/**
		* Lists are immutable.
		*/
        @Test
    public void listIsImmutable() {				
        List<Object> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add(Object.valueOf("test3"));
        assertTrue("List is immutable",!list.isImmutable());
        }

		/**
		* {@link List#copyOf(java.util.List)} copies the list.
		*/
        @Test
    public void copyOfList() {
        List<Object> list = new ArrayList<>();
        list.add("test1");
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        List<Object> copy = list.clone();
        assertEquals("List must have the same length", list.size(), copy.size());
        assertTrue("List's elements must be copied by the new list", list.equals(copy));
       }

		/**
		* {@link List#removeAll(java.util.Collection)} removes all elements from a list.
		*
		* @throws NullPointerException for the collection containing only null values.
		*/
        @Test
    public void removeAllCollection() throws NullPointerException { 	
        List<Object> listAll = new ArrayList<>(1);
        listAll.add(null);
        listAll.add(null);
        listAll.removeAll(listAll);
        assertTrue("listAll's size should be size 0", listAll.size() == 0);
       }
}