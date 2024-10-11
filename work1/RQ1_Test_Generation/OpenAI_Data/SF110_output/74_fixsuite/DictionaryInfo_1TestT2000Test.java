// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {

		private DictionaryInfo dictionaryInfo;
		
		private FieldInfo fieldInfo;
		
		private TreeMap<String, FieldInfo> fieldsByName;
		
		private String name;
		
		private FieldInfo result;
		
		private List<FieldInfo> fields;
		
		private TreeMap<Integer, FieldInfo> fieldsByTagNumber;
		
		private int tagNumber;
		
		private TreeMap<String, ComponentInfo> componentsByName;
		
		private TreeMap<Integer, ComponentInfo> componentsById;
		
		private TreeMap<String, MessageInfo> messagesByName;
		
		private TreeMap<Integer, MessageInfo> messagesById;
		
		private String version;
		
		private int loadCount;
		
		private boolean result2;
		
		private List<ComponentInfo> components;
		
		private List<MessageInfo> messages;
		
		private ComponentInfo componentInfo;
		
		private MessageInfo messageInfo;
		
		private int id;
		
		private String name2;
		
		private int id2;
		
		private String name3;
		
		private int id3;
		
		private String name4;
		
		private int id4;
		
		private String name5;
		
		private int id5;
		
		private String name6;
		
		private int id6;
		
		private String name7;
		
		private int id7;
		
		private String name8;
		
		private int id8;
		
		private String name9;
		
		private int id9;
		
		private String name10;
		
		private int id10;
		
		private String name11;
		
		private int id11;
		
		private String name12;
		
		private int id12;
		
		private String name13;
		
		private int id13;
		
		private String name14;
		
		private int id14;
		
		private String name15;
		
		private int id15;
		
		private String name16;
		
		private int id16;
		
		private String name17;
		
		private int id17;
		
		private String name18;
		
		private int id18;
		
		private String name19;
		
		private int id19;
		
		private String name20;
		
		private int id20;
		
		private String name21;
		
		private int id21;
		
		private String name22;
		
		private int id22;
		
		private String name23;
		
		private int id23;
		
		private String name24;
		
		private int id24;
		
		private String name25;
		
		private int id25;
		
		private String name26;
		
		private int id26;
		
		private String name27;
		
		private int id27;
		
		private String name28;
		
		private int id28;
		
		private String name29;
		
		private int id29;
		
		private String name30;
		
		private int id30;
		
		private String name31;
		
		private int id31;
		
		private String name32;
		
		private int id32;
		
		private String name33;
		
		private int id33;
		
		private String name34;
		
		private int id34;
		
		private String name35;
		
		private int id35;
		
		private String name36;
		
		private int id36;
		
		private String name37;
		
		private int id37;
		
		private String name38;
		
		private int id38;
		
		private String name39;
		
		private int id39;
		
		private String name40;
		
		private int id40;
		
		private String name41;
		
		private int id41;
		
		private String name42;
		
		private int id42;
		
		private String name43;
		
		private int id43;
		
		private String name44;
		
		private int id44;
		
		private String name45;
		
		private int id45;
		
		private String name46;
		
		private int id46;
		
		private String name47;
		
		private int id47;
		
		private String name48;
		
		private int id48;
		
		private String name49;
		
		private int id49;
		
		private String name50;
		
		private int id50;
		
		private String name51;
		
		private int id51;
		
		private String name52;
		
		private int id52;
		
		private String name53;
		
		private int id53;
		
		private String name54;
		
		private int id54;
		
		private String name55;
		
		private int id55;
		
		private String name56;
		
		private int id56;
		
		private String name57;
		
		private int id57;
		
		private String name58;
		
		private int id58;
		
		private String name59;
		
		private int id59;
		
		private String name60;
		
		private int id60;
		
		private String name61;
		
		private int id61;
		
		private String name62;
		
		private int id62;
		
		private String name63;
		
		private int id63;
		
		private String name64;
		
		private int id64;
		
		private String name65;
		
		private int id65;
		
		private String name66;
		
		private int id66;
		
		private String name67;
		
		private int id67;
		
		private String name68;
		
		private int id68;
		
		private String name69;
		
		private int id69;
		
		private String name70;
		
		private int id70;
		
		private String name71;
		
		private int id71;
		
		private String name72;
		
		private int id72;
		
		private String name73;
		
		private int id73;
		
		private String name74;
		
		private int id74;
		
		private String name75;
		
		private int id75;
		
		private String name76;
		
		private int id76;
		
		private String name77;
		
		private int id77;
		
		private String name78;
		
		private int id78;
		
		private String name79;
		
		private int id79;
		
		private String name80