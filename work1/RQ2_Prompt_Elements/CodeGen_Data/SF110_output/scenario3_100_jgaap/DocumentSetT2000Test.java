// DocumentSetTest.java


import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DocumentSet}.
* It contains one unit test case for the {@link DocumentSet#documentCount()} method.
*/
class DocumentSetTest {

	/**
	* Unit set for testing.
	*/
	public static class Basic {
		
    // Instance variables of type Basic
        public Hashtable<String,String> name2author;
    
		// Constructor
		public Basic(Hashtable<String,String> name2author) {
			
			// Map all the names to their author names (i.e. with a space)
			this.name2author = name2author;
		}

		// Getter
		public Hashtable<String, String> name2author() {
			return name2author;
		}
	}
	
	static String myName = "My first Document Set";
	public static Basic myDocumentSet;

	/**
	* Tests the initialization of a Basic Document Set.
	* All documents in a Basic Document Set are also stored using the
	* methods defined in the class under test.
	* @test 1
	*/
	@Test void testConstruction() {
		
		System.err.println("My first test case for " + this.getClass().getSimpleName());
		
		myDocumentSet = new Basic(myName);
	}
	
	/**
	* Tests the update of a Document Set using the
	* {@link DocumentSet#documentCount()} method.
	* @test 1
	*/
	@Test void testUpdate() {
		
		System.err.println("My first test case for " + this.getClass().getSimpleName());
		String key = "My first name of Document Set";
		String value = "value of value";
		Vector<String> names = new Vector<String>();
		names.addElement(key);
		names.addElement(value);
		myDocumentSet.update(key, name2author);
		names.setSize(2);
		assertEquals(names.elementAt(0), myDocumentSet.name2author.get(key));
		assertEquals(names.elementAt(1), myDocumentSet.name2author.get(value));
	}
	/**
	* Tests the deletion of a Document Set using the
	* {@link DocumentSet#documentCount()} method.
	* @test 1
	*/
	@Test void testDelete() {
		
		System.err.println("My first test case for " + this.getClass().getSimpleName());
		
		myDocumentSet.update(myName, name2author);
		myDocumentSet.delete(myName);
		assertEquals(myDocumentSet.documentCount(), 0);
	}
	/**
	* Tests the removal of a Document Set using the
	* {@link DocumentSet#documentCount()} method.
	* @test 1
	*/
	@Test void testDeleteFromNonExistingDocument() {
		
		System.err.println("My first test case for " + this.getClass().getSimpleName());
		
		myDocumentSet.update(myName, name2author);
		try {
			myDocumentSet.delete(myName+" not existing");
			fail("Document set with no documents was able to be deleted.");
		} catch (java.lang.IllegalArgumentException iae) {
			System.err.println("Caught expected illegal argument not thrown.");
			assertTrue(true);
		}
	}
	/**
	* Tests the update of a Document Set using the {@link DocumentSet#insert(String,Hashtable)}
	*  method.
	* @test 1
	*/
	@Test void testUpdateInsert2Names() {
		
		System.err.println("My first test case for " + this.getClass().getSimpleName());
		
		Hashtable<String,String> name1author = myName.split(" ")[0].split(" ")[1];		
		Hashtable<String,String> name2author = new Hashtable<String, String>();


		name2author.put(name1author, myName);
		myDocumentSet.insert(myName, name2author);
		name2author = myDocumentSet.lookup(myName);
		assertEquals(name2author.get(myName), myName);
	}	
	/**
	* Tests the update of a Document Set using the {@link DocumentSet#lookup(String)} methods.
	* @test 1
	*/
	@Test void testLookup2Names () {
		
		System.err.println("My first test case for " + this.getClass().getSimpleName());
		
		Hashtable<String,String> name1author = myName.split(" ")[0].split(" ")[1];		
		Hashtable<String,String> name2author = myName.split(" ")[0].split(" ")[1];		
		
		name2author.put(name1author, myName);
		myDocumentSet.update(myName, name2author);
		Hashtable<String,String> name2author = myDocumentSet.lookup(myName);
		assertEquals(name2author.get(myName), myName);
		myDocumentSet.lookup(myName);
		assertEquals(myDocumentSet.lookup(myName), myName);
	}
	
	/**
	* Tests the addition of a Document Set using the
	* {@link DocumentSet#insert(String,Hashtable)} method.
	* @test 1
	*/
	@Test void testInsert2Names () {
		
		System.err.println("My first test case for " + this.getClass().getSimpleName());
		
		Hashtable<String,String> name1author = myName.split(" ")[0].split(" ")[1];		
		Hashtable<String,String> name2author = new Hashtable<String, String>();
		name2author.put(name1author, myName);

		myDocumentSet.insert(myName, name2author);
		name2author = myDocumentSet.lookup(myName);
		assertEquals(name2author.get(myName), myName);
		myDocumentSet.insert(myName, name2author);
	}
	
	/**
	* Tests the removal of a Document Set using the
	* {@link DocumentSet#lookup(String)} method.
	* @test 1
	*/
	@Test void testLookup1 () {
		
		System.err.println("My first test case for " + this.getClass().getSimpleName());
		
		Hashtable<String,String> name1author = myName.split(" ")[0].split(" ")[1];		
		Hashtable<String,String> name2author = new Hashtable<String, String>();
		name2author.put(name1author, myName);

		myDocumentSet.update(myName, name2author);
		name2author = myDocumentSet.lookup(myName);
		assertEquals(name2author.get(myName), myName);
	}

}
