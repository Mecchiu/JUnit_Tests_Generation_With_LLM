// SimpleUserMgr_3Test.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains one unit test case for the {@link SimpleUserMgr#export()} method.
*/
class SimpleUserMgr_3Test {
		//constructor 
	public SimpleUserMgr_3Test(String in) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		String env = System.getenv("APPLICATION_ID");
		int id = Integer.parseInt(env);
		Properties p = new Properties();
		p
		.load(new ClassLoader() {
			public String toString() {
				return getClass().getName();

			}
		});

		//System.out.println("id : " + id);
		
		this.jdbm = new SimpleUserMgr(p);
	}

	/** get the number of users */
	public int numUsers();

	/** get the number of users */
	public int numUsers();
	public int numUsers_2();
	public int numUsers_3();
	public void testEnum();
	public void test_1();

	/*public void testEnum1();*/
	public void test_2();
	
	/*public void testEnum_2();*/
	
	/*public void testElements();*/
	
	/**
	* get the number of users
	* @return Integer
	*/
	public int getNumUsers();

	public int getNumUsers_1();
	public int getNumUsers_2();
	public int getNumUsers_3();
	
	public String getEnumString();

	/**
	
	* test if there are 4 users
	*/
	public void testTest();

	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {

		//TestEnum.test();

		SimpleUserMgr_3Test userMgr = new SimpleUserMgr_3Test(null);
		
		// test if there are 4 users
		//System.out.println(userMgr.numUsers() + "==" + userMgr.getNumUsers());
	}
	
	
	protected JDBMEnumeration jdbmEnumer;

	protected HashSet<String> hashSet = new HashSet<>();
	protected Vector<Vector<String>> vect = new Vector<>();
	protected Vector<String> vect_2 = new Vector<>();
	protected Vector<Vector<String>> vect_3 = new Vector<>();
	protected Vector<String> vect2 = new Vector<>();

	protected boolean found;
	protected boolean found;
	protected boolean found2;
	protected boolean found3;
	protected boolean found4;
	protected boolean found5;
	protected boolean found_1;
	protected boolean found4_1;
	
	protected int getId();
	
	protected String getEnumString();
	protected void getString1();
	
	// Get UserMgr methods
	
	protected void initEnum();
	
	
	protected void getNumUsers();
	
	protected void getNumUsers_1();
	protected void getNumUsers_2();
	protected void getNumUsers_3();
	
	public HashSet<String> getHashSet();

	
	// Get Vector functions

	private Vector<Vector<String>> getVector(String ve) throws IOException {
		Vector<Vector<String>> v = new Vector<>();
		Vector<String> vec = new Vector<>();
		
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(ve);
		if (in!= null) {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ((line = br.readLine())!= null) {
				vec.add(createVector(line));
			}
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return(vec);
		}
		
		return(v);
	}

	private Vector<Vector<String>> createVector(String ve) throws IOException {
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(ve);
		if (in!= null) {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ((line = br.readLine())!= null) {
				vect.add(createVector(line));
			}
			
			return vect;
		}
		
		return vect;

	}

	protected Vector<Vector<String>> getVector2() {
		Vector<Vector<String>> v = new Vector<>();
		Vector<String> vec = new Vector<>();
		vec.add("value_1");
		vec.add("value_2");
		vec.add("value_3");
		vec.add("value_4");
		vec.add("value_5");
		vec.add("value_6");
		vec.add("value_7");
		vect2.add(vec);
		vect.add(vect2);
		vect.add(vect3);
		vect2.add(vect3);
		vect2.add(vect4);
		vect2.add(vect4);
		vect.add(vect2);
		vect2.add(vect3);
		vect.add(vect2);
		vect.add(vect4);
		vect.add(vect4);
		vect.add(vect5);
		vect2.add(vect5);
		vect2.add(vect5);
		vect2.add(vect6);
		vect3.add(vect6);
		vect3.add(vect6);
		vect3.add(vect6);
		vect4.add(vect6);
		vect3.add(vect6);
		vect3.add(vect6);
		vect4.add(vect5);
		vect20 = vect4;
		vect20.add(vect6);
		vect20.add(vect6);

		return(vect2);

	}

	protected Vector<Vector<String>> getVector3() {
		Vector<Vector<String>> v = new Vector<>();
		Vector<String> vec = new Vector<>();
		vec.add("value_1");
		vec.add("value_2");
		vec.add("value_3");
		vec.add("value_4");
		//vec.add("value_5");
		vec.add("value_6");
		vect3.add(vec);
		vect.add(vect3);
}
}