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
		
		private String[] enumsAbbreviations;
		
		private String[] enumsValues;
		
		private String[] enumsAbbreviationsValues;
		
		private String[] enumsAbbreviationsDescriptions;
		
		private String[] enumsValuesDescriptions;
		
		private String[] enumsAbbreviationsValuesDescriptions;
		
		private String[] enumsAbbreviationsValuesDescriptions2;
		
		private String[] enumsAbbreviationsValuesDescriptions3;
		
		private String[] enumsAbbreviationsValuesDescriptions4;
		
		private String[] enumsAbbreviationsValuesDescriptions5;
		
		private String[] enumsAbbreviationsValuesDescriptions6;
		
		private String[] enumsAbbreviationsValuesDescriptions7;
		
		private String[] enumsAbbreviationsValuesDescriptions8;
		
		private String[] enumsAbbreviationsValuesDescriptions9;
		
		private String[] enumsAbbreviationsValuesDescriptions10;
		
		private String[] enumsAbbreviationsValuesDescriptions11;
		
		private String[] enumsAbbreviationsValuesDescriptions12;
		
		private String[] enumsAbbreviationsValuesDescriptions13;
		
		private String[] enumsAbbreviationsValuesDescriptions14;
		
		private String[] enumsAbbreviationsValuesDescriptions15;
		
		private String[] enumsAbbreviationsValuesDescriptions16;
		
		private String[] enumsAbbreviationsValuesDescriptions17;
		
		private String[] enumsAbbreviationsValuesDescriptions18;
		
		private String[] enumsAbbreviationsValuesDescriptions19;
		
		private String[] enumsAbbreviationsValuesDescriptions20;
		
		private String[] enumsAbbreviationsValuesDescriptions21;
		
		private String[] enumsAbbreviationsValuesDescriptions22;
		
		private String[] enumsAbbreviationsValuesDescriptions23;
		
		private String[] enumsAbbreviationsValuesDescriptions24;
		
		private String[] enumsAbbreviationsValuesDescriptions25;
		
		private String[] enumsAbbreviationsValuesDescriptions26;
		
		private String[] enumsAbbreviationsValuesDescriptions27;
		
		private String[] enumsAbbreviationsValuesDescriptions28;
		
		private String[] enumsAbbreviationsValuesDescriptions29;
		
		private String[] enumsAbbreviationsValuesDescriptions30;
		
		private String[] enumsAbbreviationsValuesDescriptions31;
		
		private String[] enumsAbbreviationsValuesDescriptions32;
		
		private String[] enumsAbbreviationsValuesDescriptions33;
		
		private String[] enumsAbbreviationsValuesDescriptions34;
		
		private String[] enumsAbbreviationsValuesDescriptions35;
		
		private String[] enumsAbbreviationsValuesDescriptions36;
		
		private String[] enumsAbbreviationsValuesDescriptions37;
		
		private String[] enumsAbbreviationsValuesDescriptions38;
		
		private String[] enumsAbbreviationsValuesDescriptions39;
		
		private String[] enumsAbbreviationsValuesDescriptions40;
		
		private String[] enumsAbbreviationsValuesDescriptions41;
		
		private String[] enumsAbbreviationsValuesDescriptions42;
		
		private String[] enumsAbbreviationsValuesDescriptions43;
		
		private String[] enumsAbbreviationsValuesDescriptions44;
		
		private String[] enumsAbbreviationsValuesDescriptions45;
		
		private String[] enumsAbbreviationsValuesDescriptions46;
		
		private String[] enumsAbbreviationsValuesDescriptions47;
		
		private String[] enumsAbbreviationsValuesDescriptions48;
		
		private String[] enumsAbbreviationsValuesDescriptions49;
		
		private String[] enumsAbbreviationsValuesDescriptions50;
		
		private String[] enumsAbbreviationsValuesDescriptions51;
		
		private String[] enumsAbbreviationsValuesDescriptions52;
		
		private String[] enumsAbbreviationsValuesDescriptions53;
		
		private String[] enumsAbbreviationsValuesDescriptions54;
		
		private String[] enumsAbbreviationsValuesDescriptions55;
		
		private String[] enumsAbbreviationsValuesDescriptions56;
		
		private String[] enumsAbbreviationsValuesDescriptions57;
		
		private String[] enumsAbbreviationsValuesDescriptions58;
		
		private String[] enumsAbbreviationsValuesDescriptions59;
		
		private String[] enumsAbbreviationsValuesDescriptions60;
		
		private String[] enumsAbbreviationsValuesDescriptions61;
		
		private String[] enumsAbbreviationsValuesDescriptions62;
		
		private String[] enumsAbbreviationsValuesDescriptions63;
		
		private String[] enumsAbbreviationsValuesDescriptions64;
		
		private String[] enumsAbbreviationsValuesDescriptions65;
		
		private String[] enumsAbbreviationsValuesDescriptions66;
		
		private String[] enumsAbbreviationsValuesDescriptions67;
		
		private String[] enumsAbbreviationsValuesDescriptions68;
		
		private String[] enumsAbbreviationsValuesDescriptions69;
		
		private String[] enumsAbbreviationsValuesDescriptions70;
		
		private String[] enumsAbbreviationsValuesDescriptions71;
		
		private String[] enumsAbbreviationsValuesDescriptions72;
		
		private String[] enumsAbbreviationsValuesDescriptions73;
		
		private String[] enumsAbbreviationsValuesDescriptions74;
		
		private String[] enumsAbbreviationsValuesDescriptions75;
		
		private String[] enumsAbbreviationsValuesDescriptions76;
		
		private String[] enumsAbbreviationsValuesDescriptions77;
		
		private String[] enumsAbbreviationsValuesDescriptions78;
		
		private String[] enumsAbbreviationsValuesDescriptions79;
		
		private String[] enumsAbbreviationsValuesDescriptions80;
		
		private String[] enumsAbbreviationsValuesDescriptions81;
		
		private String[] enumsAbbreviationsValuesDescriptions82;
		
		private String[] enumsAbbreviationsValuesDescriptions83;
		
		private String[] enumsAbbreviationsValuesDescriptions84;
		
		private String[] enumsAbbreviationsValuesDescriptions85;
		
		private String[] enumsAbbreviationsValuesDescriptions86;
		
		private String[] enumsAbbreviationsValuesDescriptions87;
		
		private String[] enumsAbbreviationsValuesDescriptions88;
		
		private String[] enumsAbbreviationsValuesDescriptions89;
		
		private String[] enumsAbbreviationsValuesDescriptions90;
		
		private String[] enumsAbbreviationsValuesDescriptions91;
		
		private String[] enumsAbbreviationsValuesDescriptions92;
		
		private String[] enumsAbbreviationsValuesDescriptions93;
		
		private String[] enumsAbbreviationsValuesDescriptions94;
		
		private String[] enumsAbbreviationsValuesDescriptions95;
		
		private String[] enumsAbbreviationsValuesDescriptions96;
		
		private String[] enumsAbbreviationsValuesDescriptions97;
		
		private String[] enumsAbbreviationsValuesDescriptions98;
		
		private String[] enumsAbbreviationsValuesDescriptions99;
		
		private String[] enumsAbbreviationsValuesDescriptions100;
		
		private String[] enumsAbbreviationsValuesDescriptions101;
		
		private String[] enumsAbbreviationsValuesDescriptions102;
		
		private String[] enumsAbbreviationsValuesDescriptions103;
		
		private String[] enumsAbbreviationsValuesDescriptions104;
		
		private String[] enumsAbbreviationsValuesDescriptions105;
		
		private String[] enumsAbbreviationsValuesDescriptions106;
		
		private String[] enumsAbbreviationsValuesDescriptions107;
		
		private String[] enumsAbbreviationsValuesDescriptions108;
		
		private String[] enumsAbbreviationsValuesDescriptions109;
		
		private String[] enumsAbbreviationsValuesDescriptions110;
		
		private String[] enumsAbbreviationsValuesDescriptions111;
		
		private String[] enumsAbbreviationsValuesDescriptions112;
		
		private String[] enumsAbbreviationsValuesDescriptions113;
		
		private String[] enumsAbbreviationsValuesDescriptions114;
		
		private String[] enumsAbbreviationsValuesDescriptions115;
		
		private String[] enumsAbbreviationsValuesDescriptions116;
		
		private String[] enumsAbbreviationsValuesDescriptions117;
		
		private String[] enumsAbbreviationsValuesDescriptions118;
		
		private String[] enumsAbbreviationsValuesDescriptions119;
		
		private String[] enumsAbbreviationsValuesDescriptions120;
		
		private String[] enumsAbbreviationsValuesDescriptions121;
		
		private String[] enumsAbbreviationsValuesDescriptions122;
		
		private String[] enumsAbbreviationsValuesDescriptions123;
		
		private String[] enumsAbbreviationsValuesDescriptions124;
		
		private String[] enumsAbbreviationsValuesDescriptions125;
		
		private String[] enumsAbbreviationsValuesDescriptions126;
		
		private String[] enumsAbbreviationsValuesDescriptions127;
		
		private String[] enumsAbbreviationsValuesDescriptions128;
		
		private String[] enumsAbbreviationsValuesDescriptions129;
		
		private String[] enumsAbbreviationsValuesDescriptions130;
		
		private String[] enumsAbbreviationsValuesDescriptions131;
		
		private String[] enumsAbbreviationsValuesDescriptions132;
		
		private String[] enumsAbbreviationsValuesDescriptions133;
		
		private String[] enumsAbbreviationsValuesDescriptions134;
		
		private String[] enumsAbbreviationsValuesDescriptions135;
		
		private String[] enumsAbbreviationsValuesDescriptions136;
		
		private String[] enumsAbbreviationsValuesDescriptions137;
		
		private String[] enumsAbbreviationsValuesDescriptions138;
		
		private String[] enumsAbbreviationsValuesDescriptions139;
		
		private String[] enumsAbbreviationsValuesDescriptions140;
		
		private String[] enumsAbbreviationsValuesDescriptions141;
		
		private String[] enumsAbbreviationsValuesDescriptions142;
		
		private String[] enumsAbbreviationsValuesDescriptions143;
		
		private String[] enumsAbbreviationsValuesDescriptions144;
		
		private String[] enumsAbbreviationsValuesDescriptions145;
		
		private String[] enumsAbbreviationsValuesDescriptions146;
		
		private String[] enumsAbbreviationsValuesDescriptions147;
		
		private String[] enumsAbbreviationsValuesDescriptions148;
		
		private String[] enumsAbbreviationsValuesDescriptions149;
		
		private String[] enumsAbbreviationsValuesDescriptions150;
		
		private String[] enumsAbbreviationsValuesDescriptions151;
		
		private String[] enumsAbbreviationsValuesDescriptions152;
		
		private String[] enumsAbbreviationsValuesDescriptions153;
		
		private String[] enumsAbbreviationsValuesDescriptions154;
		
		private String[] enumsAbbreviationsValuesDescriptions155;
		
		private String[] enumsAbbreviationsValuesDescriptions156;
		
		private String[] enumsAbbreviationsValuesDescriptions157;
		
		private String[] enumsAbbreviationsValuesDescriptions158;
		
		private String[] enumsAbbreviationsValuesDescriptions159;
		
		private String[] enumsAbbreviationsValuesDescriptions160;
		
		private String[] enumsAbbreviationsValuesDescriptions161;
		
		private String[] enumsAbbreviationsValuesDescriptions162;
		
		private String[] enumsAbbreviationsValuesDescriptions163;
		
		private String[] enumsAbbreviationsValuesDescriptions164;
		
		private String[] enumsAbbreviationsValuesDescriptions165;
		
		private String[] enumsAbbreviationsValuesDescriptions166;
		
		private String[] enumsAbbreviationsValuesDescriptions167;
		
		private String[] enumsAbbreviationsValuesDescriptions168;
		
		private String[] enumsAbbreviationsValuesDescriptions169;
		
		private String[] enumsAbbreviationsValuesDescriptions170;
		
		private String[] enumsAbbreviationsValuesDescriptions171;
		
		private String[] enumsAbbreviationsValuesDescriptions172;
		
		private String[] enumsAbbreviationsValuesDescriptions173;
		
		private String[] enumsAbbreviationsValuesDescriptions174;
		
		private String[] enumsAbbreviationsValuesDescriptions175;
		
		private String[] enumsAbbreviationsValuesDescriptions176;
		
		private String[] enumsAbbreviationsValuesDescriptions177;
		
		private String[] enumsAbbreviationsValuesDescriptions178;
		
		private String[] enumsAbbreviationsValuesDescriptions