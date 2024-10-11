// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {

		private DictionaryInfo dictionaryInfo;
		
		private FieldInfo fieldInfo;
		
		private TreeMap<Integer, FieldInfo> fieldsByTagNumber;
		
		private TreeMap<String, FieldInfo> fieldsByName;
		
		private List<FieldInfo> fields;
		
		private int tagNumber;
		
		private String name;
		
		private String type;
		
		private String description;
		
		private String value;
		
		private String enumType;
		
		private String[] enums;
		
		private String[] enumsDescriptions;
		
		private String[] enumsValues;
		
		private String[] enumsValuesDescriptions;
		
		private String[] enumsValuesDescriptions2;
		
		private String[] enumsValuesDescriptions3;
		
		private String[] enumsValuesDescriptions4;
		
		private String[] enumsValuesDescriptions5;
		
		private String[] enumsValuesDescriptions6;
		
		private String[] enumsValuesDescriptions7;
		
		private String[] enumsValuesDescriptions8;
		
		private String[] enumsValuesDescriptions9;
		
		private String[] enumsValuesDescriptions10;
		
		private String[] enumsValuesDescriptions11;
		
		private String[] enumsValuesDescriptions12;
		
		private String[] enumsValuesDescriptions13;
		
		private String[] enumsValuesDescriptions14;
		
		private String[] enumsValuesDescriptions15;
		
		private String[] enumsValuesDescriptions16;
		
		private String[] enumsValuesDescriptions17;
		
		private String[] enumsValuesDescriptions18;
		
		private String[] enumsValuesDescriptions19;
		
		private String[] enumsValuesDescriptions20;
		
		private String[] enumsValuesDescriptions21;
		
		private String[] enumsValuesDescriptions22;
		
		private String[] enumsValuesDescriptions23;
		
		private String[] enumsValuesDescriptions24;
		
		private String[] enumsValuesDescriptions25;
		
		private String[] enumsValuesDescriptions26;
		
		private String[] enumsValuesDescriptions27;
		
		private String[] enumsValuesDescriptions28;
		
		private String[] enumsValuesDescriptions29;
		
		private String[] enumsValuesDescriptions30;
		
		private String[] enumsValuesDescriptions31;
		
		private String[] enumsValuesDescriptions32;
		
		private String[] enumsValuesDescriptions33;
		
		private String[] enumsValuesDescriptions34;
		
		private String[] enumsValuesDescriptions35;
		
		private String[] enumsValuesDescriptions36;
		
		private String[] enumsValuesDescriptions37;
		
		private String[] enumsValuesDescriptions38;
		
		private String[] enumsValuesDescriptions39;
		
		private String[] enumsValuesDescriptions40;
		
		private String[] enumsValuesDescriptions41;
		
		private String[] enumsValuesDescriptions42;
		
		private String[] enumsValuesDescriptions43;
		
		private String[] enumsValuesDescriptions44;
		
		private String[] enumsValuesDescriptions45;
		
		private String[] enumsValuesDescriptions46;
		
		private String[] enumsValuesDescriptions47;
		
		private String[] enumsValuesDescriptions48;
		
		private String[] enumsValuesDescriptions49;
		
		private String[] enumsValuesDescriptions50;
		
		private String[] enumsValuesDescriptions51;
		
		private String[] enumsValuesDescriptions52;
		
		private String[] enumsValuesDescriptions53;
		
		private String[] enumsValuesDescriptions54;
		
		private String[] enumsValuesDescriptions55;
		
		private String[] enumsValuesDescriptions56;
		
		private String[] enumsValuesDescriptions57;
		
		private String[] enumsValuesDescriptions58;
		
		private String[] enumsValuesDescriptions59;
		
		private String[] enumsValuesDescriptions60;
		
		private String[] enumsValuesDescriptions61;
		
		private String[] enumsValuesDescriptions62;
		
		private String[] enumsValuesDescriptions63;
		
		private String[] enumsValuesDescriptions64;
		
		private String[] enumsValuesDescriptions65;
		
		private String[] enumsValuesDescriptions66;
		
		private String[] enumsValuesDescriptions67;
		
		private String[] enumsValuesDescriptions68;
		
		private String[] enumsValuesDescriptions69;
		
		private String[] enumsValuesDescriptions70;
		
		private String[] enumsValuesDescriptions71;
		
		private String[] enumsValuesDescriptions72;
		
		private String[] enumsValuesDescriptions73;
		
		private String[] enumsValuesDescriptions74;
		
		private String[] enumsValuesDescriptions75;
		
		private String[] enumsValuesDescriptions76;
		
		private String[] enumsValuesDescriptions77;
		
		private String[] enumsValuesDescriptions78;
		
		private String[] enumsValuesDescriptions79;
		
		private String[] enumsValuesDescriptions80;
		
		private String[] enumsValuesDescriptions81;
		
		private String[] enumsValuesDescriptions82;
		
		private String[] enumsValuesDescriptions83;
		
		private String[] enumsValuesDescriptions84;
		
		private String[] enumsValuesDescriptions85;
		
		private String[] enumsValuesDescriptions86;
		
		private String[] enumsValuesDescriptions87;
		
		private String[] enumsValuesDescriptions88;
		
		private String[] enumsValuesDescriptions89;
		
		private String[] enumsValuesDescriptions90;
		
		private String[] enumsValuesDescriptions91;
		
		private String[] enumsValuesDescriptions92;
		
		private String[] enumsValuesDescriptions93;
		
		private String[] enumsValuesDescriptions94;
		
		private String[] enumsValuesDescriptions95;
		
		private String[] enumsValuesDescriptions96;
		
		private String[] enumsValuesDescriptions97;
		
		private String[] enumsValuesDescriptions98;
		
		private String[] enumsValuesDescriptions99;
		
		private String[] enumsValuesDescriptions100;
		
		private String[] enumsValuesDescriptions101;
		
		private String[] enumsValuesDescriptions102;
		
		private String[] enumsValuesDescriptions103;
		
		private String[] enumsValuesDescriptions104;
		
		private String[] enumsValuesDescriptions105;
		
		private String[] enumsValuesDescriptions106;
		
		private String[] enumsValuesDescriptions107;
		
		