// DictionaryInfo_4Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfo_4Test {

	class MessageInfo {
		byte		field1b;
		List<Integer> field1;
		String text = "field1";
		TreeMap<String, String> data = new TreeMap<String, String>();
		private String  id;
	public
	List<Integer>  field1 ;
	public
	TreeMap<String, String> data ;
		public  String  getId() {		return id; }
		public    void  setId(String id) { 		this.id = id; }
		
	}
	private
	MessageInfo () {}

	@Test
	public
	void
	getMessage() {
		//System.out.println("field1[0] = " + field1b);
	
	}
}
// DictionaryInfo_4Test_2Test.java
// ---------------------------------------------------------------------------
// End of DictionaryInfo_4Test.java
// ---------------------------------------------------------------------------
// DictionaryInfo_4Test_3Test.java
// ---------------------------------------------------------------------------
// End of DictionaryInfo_4Test_2Test.java

