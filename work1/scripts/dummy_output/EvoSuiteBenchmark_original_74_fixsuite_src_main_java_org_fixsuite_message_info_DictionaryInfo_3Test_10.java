// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {
		
    final private static String FIX_VERSION_1 = "1.0";
    final private static String FIX_VERSION_2 = "2.0";
		
    final private static List<Integer> TAG_NUMBERS = new ArrayList<Integer>();

    static {
        TAG_NUMBERS.add(Integer.valueOf(3));
        TAG_NUMBERS.add(Integer.valueOf(2));
        TAG_NUMBERS.add(Integer.valueOf(4));
        TAG_NUMBERS.add(Integer.valueOf(5));
        TAG_NUMBERS.add(Integer.valueOf(6));
    }
    
    @Test
    public void test() {
        System.out.println("Test : DictionaryInfo");
				
		DictionaryInfo info = new DictionaryInfo();
		info.setVersion(FIX_VERSION_1);
        assertEquals(DictionaryInfo.VERSION,info.getVersion());
        
        info.setVersion(FIX_VERSION_2);
        assertEquals(DictionaryInfo.VERSION,info.getVersion());
        
        info.setVersion(null);
        assertNull(info.getVersion());
		
    }
    
    @Test
    public void testInit() {
        System.out.println("Test : DictionaryInfo.init");
				
		DictionaryInfo.init();
		
    }

    @Test
    public void testGetFieldTagNumber() {
        System.out.println("Test : DictionaryInfo.getFieldTagNumber");
				
		for(Integer number:TAG_NUMBERS) {
			DictionaryInfo dictionaryInfo = new DictionaryInfo();
			dictionaryInfo.setVersion(FIX_VERSION_1);
			List<FieldInfo> fields;
			try {
				fields = dictionaryInfo.getFields();
			}
			catch (Exception ex) {
				ex.printStackTrace();
				return;
			}
			assertNotNull(fields);
			assertFalse(fields.isEmpty());
			assertEquals(1,fields.size());
			FieldInfo fieldInfo = fields.get(0);
			assertNotNull(fieldInfo);
			assertNotNull(fieldInfo.getTagNumber());
			assertEquals(Integer.valueOf(number),fieldInfo.getTagNumber().intValue()) ;
		}
		
    }
    
    @Test
    public void testGetFieldByTagNumber() {
        System.out.println("Test : DictionaryInfo.getFieldByTagNumber");
				
		for(Integer number:TAG_NUMBERS) {
			DictionaryInfo dictionaryInfo = new DictionaryInfo();
			dictionaryInfo.setVersion(FIX_VERSION_1);
			List<FieldInfo> messages;
			try {
				messages = dictionaryInfo.getMessages();
			}
			catch (Exception ex) {
				ex.printStackTrace();
				return;
			}
			assertNotNull(messages);
			assertFalse(messages.isEmpty());
			assertEquals(1,messages.size());

			MessageInfo messageInfo = messages.get(0);
			assertNotNull(messageInfo);
			FieldInfo fieldInfo = messageInfo.getField(number);
			assertNotNull(fieldInfo);
			assertNotNull(fieldInfo.getTagNumber());
			assertEquals(Integer.valueOf(number),fieldInfo.getTagNumber().intValue());
			
		}
		
    }
    
    @Test
    public void testGetMessageByTagNumber() {
        System.out.println("Test : getMessageByTagNumber");
				
}
}