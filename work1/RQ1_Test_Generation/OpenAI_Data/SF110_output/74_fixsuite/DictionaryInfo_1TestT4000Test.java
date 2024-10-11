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
		
		private ComponentInfo componentInfo;
		
		private List<ComponentInfo> components;
		
		private MessageInfo messageInfo;
		
		private List<MessageInfo> messages;
		
		private FieldInfo fieldInfo2;
		
		private GroupInfo groupInfo;
		
		private int id;
		
		private MessageInfo messageInfo2;
		
		private int id2;
		
		private String name2;
		
		private String name3;
		
		private String name4;
		
		private String name5;
		
		private String name6;
		
		private String name7;
		
		private String name8;
		
		private String name9;
		
		private String name10;
		
		private String name11;
		
		private String name12;
		
		private String name13;
		
		private String name14;
		
		private String name15;
		
		private String name16;
		
		private String name17;
		
		private String name18;
		
		private String name19;
		
		private String name20;
		
		private String name21;
		
		private String name22;
		
		private String name23;
		
		private String name24;
		
		private String name25;
		
		private String name26;
		
		private String name27;
		
		private String name28;
		
		private String name29;
		
		private String name30;
		
		private String name31;
		
		private String name32;
		
		private String name33;
		
		private String name34;
		
		private String name35;
		
		private String name36;
		
		private String name37;
		
		private String name38;
		
		private String name39;
		
		private String name40;
		
		private String name41;
		
		private String name42;
		
		private String name43;
		
		private String name44;
		
		private String name45;
		
		private String name46;
		
		private String name47;
		
		private String name48;
		
		private String name49;
		
		private String name50;
		
		private String name51;
		
		private String name52;
		
		private String name53;
		
		private String name54;
		
		private String name55;
		
		private String name56;
		
		private String name57;
		
		private String name58;
		
		private String name59;
		
		private String name60;
		
		private String name61;
		
		private String name62;
		
		private String name63;
		
		private String name64;
		
		private String name65;
		
		private String name66;
		
		private String name67;
		
		private String name68;
		
		private String name69;
		
		private String name70;
		
		private String name71;
		
		private String name72;
		
		private String name73;
		
		private String name74;
		
		private String name75;
		
		private String name76;
		
		private String name77;
		
		private String name78;
		
		private String name79;
		
		private String name80;
		
		private String name81;
		
		private String name82;
		
		private String name83;
		
		private String name84;
		
		private String name85;
		
		private String name86;
		
		private String name87;
		
		private String name88;
		
		private String name89;
		
		private String name90;
		
		private String name91;
		
		private String name92;
		
		private String name93;
		
		private String name94;
		
		private String name95;
		
		private String name96;
		
		private String name97;
		
		private String name98;
		
		private String name99;
		
		private String name100;
		
		private String name101;
		
		private String name102;
		
		private String name103;
		
		private String name104;
		
		private String name105;
		
		private String name106;
		
		private String name107;
		
		private String name108;
		
		private String name109;
		
		private String name110;
		
		private String name111;
		
		private String name112;
		
		private String name113;
		
		private String name114;
		
		private String name115;
		
		private String name116;
		
		private String name117;
		
		private String name118;
		
		private String name119;
		
		private String name120;
		
		private String name121;
		
		private String name122;
		
		private String name123;
		
		private String name124;
		
		private String name125;
		
		private String name126;
		
		private String name127;
		
		private String name128;
		
		private String name129;
		
		private String name130;
		
		private String name131;
		
		private String name132;
		
		private String name133;
		
		private String name134;
		
		private String name135;
		
		private String name136;
		
		private String name137;
		
		private String name138;
		
		private String name139;
		
		private String name140;
		
		private String name141;
		
		private String name142;
		
		private String name143;
		
		private String name144;
		
		private String name145;
		
		private String name146;
		
		private String name147;
		
		private String name148;
		
		private String name149;
		
		private String name150;
		
		private String name151;
		
		private String name152;
		
		private String name153;
		
		private String name154;
		
		private String name155;
		
		private String name156;
		
		private String name157;
		
		private String name158;
		
		private String name159;
		
		private String name160;
		
		private String name161;
		
		private String name162;
		
		private String name163;
		
		private String name164;
		
		private String name165;
		
		private String name166;
		
		private String name167;
		
		private String name168;
		
		private String name169;
		
		private String name170;
		
		private String name171;
		
		private String name172;
		
		private String name173;
		
		private String name174;
		
		private String name175;
		
		private String name176;
		
		private String name177;
		
		private String name178;
		
		private String name179;
		
		private String name180;
		
		private String name181;
		
		private String name182;
		
		private String name183;
		
		private String name184;
		
		private String name185;
		
		private String name186;
		
		private String name187;
		
		private String name188;
		
		private String name189;
		
		private String name190;
		
		private String name191;
		
		private String name192;
		
		private String name193;
		
		private String name194;
		
		private String name195;
		
		private String name196;
		
		private String name197;
		
		private String name198;
		
		private String name199;
		
		private String name200;
		
		private String name201;
		
		private String name202;
		
		private String name203;
		
		private String name204;
		
		private String name205;
		
		private String name206;
		
		private String name207;
		
		private String name208;
		
		private String name209;
		
		private String name210;
		
		private String name211;
		
		private String name212;
		
		private String name213;
		
		private String name214;
		
		private String name215;
		
		private String name216;
		
		private String name217;
		
		private String name218;
		
		private String name219;
		
		private String name220;
		
		private String name221;
		
		private String name222;
		
		private String name223;
		
		private String name224;
		
		private String name225;
		
		private String name226;
		
		private String name227;
		
		private String name228;
		
		private String name229;
		
		private String name230;
		
		private String name231;
		
		private String name232;
		
		private String name233;
		
		private String name234;
		
		private String name235;
		
		private String name236;
		
		private String name237;
		
		private String name238;
		
		private String name239;
		
		private String name240;
		
		private String name241;
		
		private String name242;
		
		private String name243;
		
		private String name244;
		
		private String name245;
		
		private String name246;
		
		private String name247;
		
		private String name248;
		
		private String name249;
		
		private String name250;
		
		private String name251;
		
		private String name252;
		
		private String name253;
		
		private String name254;
		
		private String name255;
		
		private String name256;
		
		private String name257;
		
		private String name258;
		
		private String name259;
		
		private String name260;
		
		private String name261;
		
		private String name262;
		
		private String name263;
		
		private String name264;
		
		private String name265;
		
		private String name266;
		
		private String name267;
		
		private String name268;
		
		private String name269;
		
		private String name270;
		
		private String name271;
		
		private String name272;
		
		private String name273;
		
		private String name274;
		
		private String name275;
		
		private String name276;
		
		private String name277;
		
		private String name278;
		
		private String name279;
		
		private String name280;
		
		private String name281;
		
		private String name282;
		
		private String name283;
		
		private String name284;
		
		private String name285;
		
		private String name286;
		
		private String name287;
		
		private String name288;
		
		private String name289;
		
		private String name290;
		
		private String name291;
		
		private String name292;
		
		private String name293;
		
		private String name294;
		
		private String name295;
		
		private String name296;
		
		private String name297;
		
		private String name298;
		
		private String name299;
		
		private String name300;
		
		private String name301;
		
		private String name302;
		
		private String name303;
		
		private String name304;
		
		private String name305;
		
		private String name306;
		
		private String name307;
		
		private String name308;
		
		private String name309;
		
		private String name310;
		
		private String name311;
		
		private String name312;
		
		private String name313;
		
		private String name314;
		
		private String name315;
		
		private String name316;
		
		private String name317;
		
		private String name318;
		
		private String name319;
		
		private String name320;
		
		private String name321;
		
		private String name322;
		
		private String name323;
		
		private String name324;
		
		private String name325;
		
		private String name326;
		
		private String name327;
		
		private String name328;
		
		private String name329;
		
		private String name330;
		
		private String name331;
		
		private String name332;
		
		private String name333;
		
		private String name334;
		
		private String name335;
		