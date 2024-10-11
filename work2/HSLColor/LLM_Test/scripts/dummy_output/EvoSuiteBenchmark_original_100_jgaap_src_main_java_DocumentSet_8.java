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
		private DocumentSet set;
		private DocumentSet set_copy;
		
		
		/**
		* Runs each test case of the test. It first gets the list of documents
		*  that the test sets' documents were registered with.  Then it
		*  removes the documents whose registration failed so that they are not
		*  expected to exist in (and remain) the set.  This test method
		*  can fail in certain circumstances.
		*  Test case methods can be called in any order.
		*  Test cases are run to determine if the list of documents has been correctly
		*  dynamically populated.
		*/
		public void run() {
			// List of all the documents present in any test case.
			Vector<Document> v = null;

			test_case0();
			test_case1();
			test_case2();
			test_case3();
			test_case4();
			test_case5();
			test_case6();
			test_case7();
		}
		
// 		private void test_case(int testNum) {
// 			// Get all set documents
// 			Vector<Document> alldocs = new Vector<Document>();
// 			Vector<Document> out = set.getDocumentSet();
// 			
// 			Document currentDoc;
// 			set.register(currentDoc);
// 			
// 			// Make a backup copy of the document set for test method chaining
// 			DocumentSet set2 = new DocumentSet(currentDoc);
// 			
// 			// Loop test for each test case in sequence by number
// 			
// 			for (int t = 0; t < (testNum-1); t++) {
// 				// Get next set document
// 				currentDoc = out.get(out.size() - 1);
// 				
// 				// Make a backup copy of the document set for test method chaining
// 				set2 = new DocumentSet(currentDoc);
// 			}
// 			
// 			out.add(set);
// 			out.add(set_copy);
// 			
// 			if (alldocs.size()!= out.size()) {
// 				System.out.println("The set has " + alldocs.size() +
// 						" documents, but the document set has " + out.size() +
// 						" documents");
// 				out.clear();
// 			}
// 			
// 			Vector<Document> doc_list = new Vector<Document>();
// 			doc_list.setSize(set.documentCount());
// 			
// 			// Get first and last set document
// 			set.register(currentDoc);
// 			set_copy.register(currentDoc);
// 
// 		}
		
// 		private void test_case0() {
// 			// Create the list of documents from the original set
// 			set = new DocumentSet(null);
// 			
// 			// Add a placeholder to every registered document so that if
// 			// a duplicate occurs, the second occurrence will be removed
// 			Vector<Document> list = set.getDocumentSet();
// 			list.insertElementAt(new Document(), list.size() - 3);
// 			
// 			// Get current set
// 			Vector<Document> list_1 = set.getDocumentSet();
// 			
// 			// Get a list of other set's documents
// 			Vector<Document> list_2 = list.getVector();
// 			list_2.setSize(list_1.size());
// 			
// 			// Check if the list has the expected set contents
// 			assertTrue("There was a mismatch in the list",
// 			        list_1.equals(list));
// 		}
// 		
// 		private void test_case1() {
// 			// First run this loop to see what documents are available
// 			Vector<Document> list = set.getDocumentSet();
// 			
// 			// Make a backup copy of the table used for the documents
// 			DocumentSet list_copy = new DocumentSet();
// 			
// 			// Iterate through the set
// 			for (int i = 0; i < list.size(); i++) {
// 				set_copy.register(list.get(i), i);
// 			}
// 			
// 			// Add a document twice
// 			Document d = list.get(0);
// 			list_copy.register(d, list.size() - 1);
// 			list.insertElementAt(d, list.size() - 2);
// 			
// 			// Make a backup copy of the list
// 			list_copy.register(list.get(0), 0);
// 			
// 			// Check for any differences when getting the documents
// 			assertTrue("The document set and that list have different entries:",
// 			        list.equals(list_copy));
// 		}
// 		
// 		/**
// 		 * Tests that all documents are present in the list returned from
// 		 * a call to <code>getDocument(t)
}