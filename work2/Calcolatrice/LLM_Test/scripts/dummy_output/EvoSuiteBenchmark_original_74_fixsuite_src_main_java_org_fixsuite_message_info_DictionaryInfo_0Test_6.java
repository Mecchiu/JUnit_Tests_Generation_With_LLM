// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {
		  
    /**
     * Tests a field using {@link DictionaryInfo#getField}
     */
    @Test
    public void getField_0() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("0.00");
        
        FieldInfo field = dictionaryInfo.getField(4);
        FieldInfo expected = field.getComponents().get(0);
        
        assertEquals( expected, field );
    }
    
    /**
     * Tests a field using {@link DictionaryInfo#getField}
     * and it is not contained in list of expected object
     */
    @Test
    public void getField_1() {
    	List<FieldInfo> list = new ArrayList<>();
        list.add( new FieldInfo(1) );
        list.add( new FieldInfo(2) );
        list.add( new FieldInfo(3) );
        list.add( new FieldInfo(4) );
        
        DictionaryInfo dictionaryInfo = new DictionaryInfo("0.00");
        dictionaryInfo.setComponents( list);
               
        FieldInfo result = dictionaryInfo.getField(4);
        
        assertEquals( "dictionary.0.1.1", result );
        assertEquals( 0, result.getComponents().size() );
    }
    
    /**
     * Tests a field using {@link DictionaryInfo#getField}
     */
    @Test
    public void replaceAsGroup_0() {
        String expected = "0.00";
        String name = "f1";
        
        DictionaryInfo dictionaryInfo = new DictionaryInfo("0.00");
        dictionaryInfo.setId( 3 );
        dictionaryInfo.setName( name);
        
        FieldInfo field = dictionaryInfo.getField(name);
        list = new ArrayList<>();
        list.add( field );
        dictionaryInfo.setFields( list );
        
        String replaceField = dictionaryInfo.getComponents().get(0).getName().replaceAll( name, expected) ;
        dictionaryInfo.setComponents( new ArrayList<ComponentInfo>() );
        dictionaryInfo.setComponents().add( new ComponentInfo(expected) );
        
        FieldInfo result = dictionaryInfo.getField(name);
        
        assertEquals( expected, result.getName());
        assertEquals( expected, result.getComponents().get(0).getName());
        assertEquals( expected, result.getName());
    }
    
    /**
     * Tests a message given an id
     *
     * @param id - An id number
     * @return a message given an id
     */
    public MessageInfo getMessage(int id) {
        return DictionaryInfo.getMessage( DictionaryInfo_0Test.class).getMessages().get(id);
    }
    
    /**
     * Tests a message given an id
     * It is not contained in list of expected object
     */
    @Test
    public void replaceAsGroup_1() {
        MessageInfo message = DictionaryInfo_0Test.getMessage( 4);
        
        list = new ArrayList<>();
        list.add( message );
        list.add( new FieldInfo( message.getId()) );
        
        DictionaryInfo dictionaryInfo = new DictionaryInfo("0.00");
        dictionaryInfo.setComponents( list);
               
        MessageInfo result = dictionaryInfo.getMessage( message.getId());
        
        assertTrue( "dictionary.0.1.1", result.getId().equals( message.getId() ) && result.getComponents().size() == 2 );
        assertTrue( "dictionary.0.1.2", result.getFields().get(0).getName().equals( message.getField("name") ) );
    }
    
    /**
     * Tests a message given an id
     * It is not contained in list of expected object
     */
    @Test
    public void replaceAsGroup_2() {
        MessageInfo message = DictionaryInfo_0Test.getMessage( 4);
        
        list = new ArrayList<>();
        list.add( message );
}
}