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
		
    Hashtable hash;

    Vector<Hashtable> hashSet;
    Vector<Vector<Integer>> documents;

	public void setupOld() throws Exception {
		hash = new Hashtable();
		hash.put("document","The Document",1);
		hash.put("author","E.D.",1);
		hash.put("words","The words",1);
		hash.put(1,"The first word",1);
		hash.put(2,"The second word",1);
		hash.put(6,"First",1);
		hash.put(7,"Second",1);
		hash.put(9,"Third",1);
		hash.put(10, "There", 1);
		hash.put(11, "Isn't", 1);
		hash.put(12, "A Letter", 1);
		hash.put(13,"Letter",1);
		hash.put(14,"This ",1);
		hash.put(15,"isn't",1);
		hash.put(16,"It",1);
		hash.put(17,"is",1);
		hash.put(18,"it",1);
		hash.put(18,"Then",1);
		hash.put(19,"is",1);
		hash.put(20,"That",1);
		hash.put(21,"Isn\'t",1);
		hash.put(22,"Not",1);
		hash.put(23,"It",1);
		hash.put(24,"This",1);
		hashSet = new Vector<Vector<Integer>>();
		Hashtable h = new Hashtable();
		Vector<Integer> hv = new Vector<Integer>();
		h.put(1,hv);
		hv.add(1);
		h.put(2,hv);
		hv.add(2);
		h.put(3,hv);
		hashSet.addAll(h);
		Vector<Integer> v = new Vector<Integer>();
		v.add(3);
		v.add(2);
		v.add(4);
		hashSet.add(v);
		Vector<Integer> v0 = new Vector<Integer>();
		v0.add(3);
		v0.add(4);
		hashSet.add(v0);
		vectorAdd(hashSet);
		hashSet = new Vector<Vector<Integer>>();
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(3);
		v1.add(4);
		v1.add(5);
		hashSet.add(v1);
		v1.add(6);
		v1.add(7);
		hashSet.add(v1);
	}

    public void newDoc() {
		documents = new Vector<Vector<Integer>>();
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(11);
		v.add(2);
		v.add(12);
		hashSet.add(v);
	}

	public void testCount() {
		//System.out.println("DocumentSet");
		assertEquals(1,documents.size());
		//System.out.println("DocumentSet : " + documents);
		vectorToString("DocumentSet");
	}

    public void testEquals() {
        //System.out.println("DocumentSet");
        DocumentSet d = new DocumentSet();
        //System.out.println("One is a Vector");
        Vector temp = new Vector<Integer>();
        temp.add(1);
        temp.add(0);
        Vector v1 = temp;
        //System.out.println("One is a Vector : " + v1);
        v1.add(2);
        Vector v2 = new Vector<Integer>();
        v2.add(1);
        v2.add(0);
        Vector v3 = new Vector<Integer>();
        temp.clear();
        vectorToString(temp);
        Vector v1a = new Vector<Integer>();
        vectorAdd(temp);
        vectorToString(v1);
        v1.add(10);
        vectorToString(v1a);

        v1a.add(1);
        vectorToString(v1);
        //System.out.println("One equals its copy: " + v1.toString());
        v2.addSize(1);
        vectorToString(v2);
        v2.addSize(3);
        vectorToString(v2);
        v.addSize(3);
        vectorToString(v);

        v.addSize(3);
        vectorToString(v);

        temp.addSize(3);
        temp.clear();
        vectorToString(temp);
        temp.addSize(3);
        vectorToString(temp);
        v2.addSize(2);
        vectorToString(v2);
        v2.addSize(3);
        vectorToString(v2);
        v.addSize(2);
        vectorToString(v);

        v.addSize(1);
        v2.add(5);
        vectorToString (v2);
        v2.clear();
        v.add(4);
        vectorToString(v);
    }

    private void vectorAdd(Vector d) {
        Vector v = new Vector();
        Hashtable H = new Hashtable();
        Hashtable h = new Hashtable();
        hash = new Hashtable();
        vectorAdd1(v,d);
        assertEquals(1,v.size());
        Hashtable ht = new Hashtable();
        assertEquals(v,ht);
    }

    private void vectorAdd1(Vector v,Vector v1) {
}
}