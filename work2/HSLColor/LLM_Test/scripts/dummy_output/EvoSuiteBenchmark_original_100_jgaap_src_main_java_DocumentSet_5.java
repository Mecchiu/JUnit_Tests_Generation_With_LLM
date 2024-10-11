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
		
	
    Vector<Document> documents;
    
    /**
     *  Constructors.
     */
    DocumentSetTest() {
    }
	
    /**
     *  Constructor.
     *  Adds a document to the vector which is returned.
     */
    DocumentSetTest(Document d) {
    //	System.out.println("\t\t\t    DocumentSetTest.DocumentSetTest(d): " + d + "    : " + this);
        documents = new Vector<Document>();
        documents.add(d);
    }

    /**
     *  Constructor.
     */
    Vector<Document> createTests() {
        return new Vector<Document>() {
            @Override
            public Vector hash(Vector v) {
                return new Vector() {
                    @Override
                    public boolean add(Document d) {
                        return test(d);
                    }
                    public boolean test(Document d) {
                        return (d.code().equals(CodeUtils.commonWord(d.code())));
                    }
                };
            }
        };
    }
    
    /*
        Test methods
    */
    



	/**
	 * Returns the number of documents currently registered in this set of documents*
	 */
	public int documentCount() {
		return documents.size();
	}
	
//    /**
//    * Returns a vector of documents sorted by frequency, most common first.
//    * 
//    * @param n number of documents to return.
//    */
//	public Vector<Document> mostCommon(int n) {
//      Hashtable<Document, Integer> f = new Hashtable<Document, Integer>();
//        Set<Document> set= new HashSet<Document>();
//        for (Document a : documents) {
//            set.add(a);
//        }
//        Collections.sort(set, f);
//        Vector<Document> set1 = new Vector<Document>();
//        set1.addAll(set);
//        set1.shuffle(true);
//        return set1;
//    }
	
//	/**
//	 * Checks that a vector of documents being tested contains a total number
//	 * of documents expected.
//	 *
//	 * @param expected number of documents expected.
//	 * @param actual number of documents currently registered in this set of documents
//	 */
//    public void check(int expected, int actual) {
//        Vector<Document> newDocs= createTests();
//        assertEquals("Error(s) in test", expected, actual);
//        for (int i = 0; i < newDocs.size() ; i++) {
//            String text= newDocs.get(i).text;
//            Vector<Character> characters= newDocs.get(i).code();
//            Vector<Character> subChars= newVector(characters);
//            characters= removeLeadingWhitespace(characters);
//            //assertEquals("Error: test 0", text, newDocs.get(iter).text);
//            assertEquals("Error: test 1", text, characters.get(0).toString());
//        }
//    }
//
//	public int removeLeadingWhitespace(Vector<Character> subChars) {
//	return newText(subChars)
//           .length()
//			.code().length()
//            - 
//			subChars
//           .toString().toCharArray().length;
//    }
	
    /**
     *  Generates a new, random, random, and unique list of strings, without duplicates.
     *  The list is truncated between 2 times 10 and 20.  The list is also returned.
     */
    public String removeLeadingWhitespace(StringTokenizer s) { 
        int last = s.length()-1;
        StringTokenizer tok = new Tokenizer(s," ");
        List<String> strList= new ArrayList<String>();
        while (tok.hasMoreTokens()) {
            String t = tok.nextToken();
            if (Character.isWhitespace(t)) {
                tok.previousToken();
            }
            strList.add(t);
        }
        String previous= null;
        String newStr=null;
        List<Character> code= new Vector<Character>();
        int max=0;
        int i=0;
        while (i <strList.size()-1) { 
            max= (max + 10) + 1;
            if (max == 10) { 
		max= 20;
	            previous= null;
            }
            else if (strList.size() == 10) { 
                previous = String.valueOf(strList.get(i));
                i= 0;
            }
            else if (i == 0) { 
                code= newVector(new Character[max]);
            }else{ 
                newStr= newStringBuilder().toString();
                for (String m: strList) { 
                    newStr.append(m, last);
                }
                if (previous!= null && newStr.startsWith(previous)) {
                    code= newVector(code);
                    while (i < strList.size()) {
                        code.add(strList.get(i) );
						i++;
                    }
                }
                else {
                    code= newVector(code);
                }
            }
        }
		return newStr;
	}
    
    private Vector<Character> newVector(Vector<Character> characters) {
        Vector<Character> newChars = new Vector<Character>();
}
}