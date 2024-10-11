// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {
		
	final private DictionaryInfo self;
	final private static int LENGTH= 10;
	
	public DictionaryInfo_2Test(DictionaryInfo self) {
		this.self = self;
	}

	final int getFieldCount(){
		return (int)Math.ceil((float)self.count()/LENGTH);
	}

	final boolean countExceedsLength(){
		return (self.count() > LENGTH);
	}

	final int getMessageCount(){
		return (int)Math.ceil(self.count()/LENGTH / 2.0);
	}

	final boolean countExceedsMessageCount(){
		if (self.count() >= LENGTH){
			return true;
		}
		else{
			return false;
		}
}

@Test
public void countExceedsMessageCount(){
	assertTrue(countExceedsMessageCount());
}

@Test
public void countExceedsFieldCount(){
	assertTrue(countExceedsFieldCount());
}

	final private MessageInfo getByTagNumber(int tagNumber){
        if (messagesByName.containsKey(tagNumber)){
            return messagesByName.get(tagNumber);
        }
		else if (messagesById.containsKey(tagNumber)){
			return messagesById.get(tagNumber);
		}
		else if (fieldsByTagNumber.containsKey(tagNumber)){
			return fieldsByTagNumber.get(tagNumber);
		}
		return null;
	}

	public final boolean isTagNumber(int tagNumber) {
		return self.getTagNumber() == tagNumber;
	}

	public final boolean equalsTagList(String tagList) {
		return self.equalsTagList(tagList);
	}

	final private List<FieldInfo> getFieldsByTagNumber(int tagNumber){
        if (fieldsByTagNumber.containsKey(tagNumber)){
			return fieldsByTagNumber.get(tagNumber);
		}
		else if (fieldsById.containsKey(tagNumber)){
    		return fieldsById.get(tagNumber);
		}
		else if (componentsByName.containsKey(tagNumber)){
			return componentsByName.get(tagNumber);
		}
		return null;
	}

	final private List<FieldInfo> getFieldsByName(String fieldName){
        if (fieldsByName.containsKey(fieldName)){
			return fieldsByName.get(fieldName);
		}
		else if (fieldsById.containsKey(fieldName)){
			return fieldsById.get(fieldName);
		}
		else if (containsComponentByName(fieldName)){
			return componentsByName.get(fieldName);
		}
		return new ArrayList<>();
	}

	final private List<ComponentInfo> getComponents(){
		List<String>  componentsLst = new ArrayList<>();
		List<Integer>  idsList = new ArrayList<>();
		for (int i = 1; i < getComponentCount(); i++){
			componentsLst.add(i + "");
			idsList.add(self.getComponent(i).getId());
		}
		return  componentsByName.values();
	}

	final private boolean containsComponentByName(String componentName){
		for (String s : componentsByName.keySet()){
			if (componentsByName.get(s).equals(componentName)){
				return true;
			}
		}
		return false;
	}

	final private boolean containsComponentById(int id){
		for (String s : componentsByName.keySet()) {
			if (componentsByName.get(s).getId() == id){
				return true;
			}
		}
		return false;
	}

}