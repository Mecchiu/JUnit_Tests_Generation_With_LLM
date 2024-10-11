// HttpBot_2Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains ten unit test cases for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_2Test {

		private static final String URL = "http://www.google.com/";
		private static final String URL_NOT_FOUND = "http://www.google.com/notfound";
		private static final String URL_NOT_FOUND_2 = "http://www.google.com/notfound2";
		private static final String URL_NOT_FOUND_3 = "http://www.google.com/notfound3";
		private static final String URL_NOT_FOUND_4 = "http://www.google.com/notfound4";
		private static final String URL_NOT_FOUND_5 = "http://www.google.com/notfound5";
		private static final String URL_NOT_FOUND_6 = "http://www.google.com/notfound6";
		private static final String URL_NOT_FOUND_7 = "http://www.google.com/notfound7";
		private static final String URL_NOT_FOUND_8 = "http://www.google.com/notfound8";
		private static final String URL_NOT_FOUND_9 = "http://www.google.com/notfound9";
		private static final String URL_NOT_FOUND_10 = "http://www.google.com/notfound10";
		
		private static final String URL_NOT_FOUND_11 = "http://www.google.com/notfound11";
		private static final String URL_NOT_FOUND_12 = "http://www.google.com/notfound12";
		private static final String URL_NOT_FOUND_13 = "http://www.google.com/notfound13";
		private static final String URL_NOT_FOUND_14 = "http://www.google.com/notfound14";
		private static final String URL_NOT_FOUND_15 = "http://www.google.com/notfound15";
		private static final String URL_NOT_FOUND_16 = "http://www.google.com/notfound16";
		private static final String URL_NOT_FOUND_17 = "http://www.google.com/notfound17";
		private static final String URL_NOT_FOUND_18 = "http://www.google.com/notfound18";
		private static final String URL_NOT_FOUND_19 = "http://www.google.com/notfound19";
		private static final String URL_NOT_FOUND_20 = "http://www.google.com/notfound20";
		
		private static final String URL_NOT_FOUND_21 = "http://www.google.com/notfound21";
		private static final String URL_NOT_FOUND_22 = "http://www.google.com/notfound22";
		private static final String URL_NOT_FOUND_23 = "http://www.google.com/notfound23";
		private static final String URL_NOT_FOUND_24 = "http://www.google.com/notfound24";
		private static final String URL_NOT_FOUND_25 = "http://www.google.com/notfound25";
		private static final String URL_NOT_FOUND_26 = "http://www.google.com/notfound26";
		private static final String URL_NOT_FOUND_27 = "http://www.google.com/notfound27";
		private static final String URL_NOT_FOUND_28 = "http://www.google.com/notfound28";
		private static final String URL_NOT_FOUND_29 = "http://www.google.com/notfound29";
		private static final String URL_NOT_FOUND_30 = "http://www.google.com/notfound30";
		
		private static final String URL_NOT_FOUND_31 = "http://www.google.com/notfound31";
		private static final String URL_NOT_FOUND_32 = "http://www.google.com/notfound32";
		private static final String URL_NOT_FOUND_33 = "http://www.google.com/notfound33";
		private static final String URL_NOT_FOUND_34 = "http://www.google.com/notfound34";
		private static final String URL_NOT_FOUND_35 = "http://www.google.com/notfound35";
		private static final String URL_NOT_FOUND_36 = "http://www.google.com/notfound36";
		private static final String URL_NOT_FOUND_37 = "http://www.google.com/notfound37";
		private static final String URL_NOT_FOUND_38 = "http://www.google.com/notfound38";
		private static final String URL_NOT_FOUND_39 = "http://www.google.com/notfound39";
		private static final String URL_NOT_FOUND_40 = "http://www.google.com/notfound40";
		
		private static final String URL_NOT_FOUND_41 = "http://www.google.com/notfound41";
		private static final String URL_NOT_FOUND_42 = "http://www.google.com/notfound42";
		private static final String URL_NOT_FOUND_43 = "http://www.google.com/notfound43";
		private static final String URL_NOT_FOUND_44 = "http://www.google.com/notfound44";
		private static final String URL_NOT_FOUND_45 = "http://www.google.com/notfound45";
		private static final String URL_NOT_FOUND_46 = "http://www.google.com/notfound46";
		private static final String URL_NOT_FOUND_47 = "http://www.google.com/notfound47";
		private static final String URL_NOT_FOUND_48 = "http://www.google.com/notfound48";
		private static final String URL_NOT_FOUND_49 = "http://www.google.com/notfound49";
		private static final String URL_NOT_FOUND_50 = "http://www.google.com/notfound50";
		
		private static final String URL_NOT_FOUND_51 = "http://www.google.com/notfound51";
		private static final String URL_NOT_FOUND_52 = "http://www.google.com/notfound52";
		private static final String URL_NOT_FOUND_53 = "http://www.google.com/notfound53";
		private static final String URL_NOT_FOUND_54 = "http://www.google.com/notfound54";
		private static final String URL_NOT_FOUND_55 = "http://www.google.com/notfound55";
		private static final String URL_NOT_FOUND_56 = "http://www.google.com/notfound56";
		private static final String URL_NOT_FOUND_57 = "http://www.google.com/notfound57";
		private static final String URL_NOT_FOUND_58 = "http://www.google.com/notfound58";
		private static final String URL_NOT_FOUND_59 = "http://www.google.com/notfound59";
		private static final String URL_NOT_FOUND_60 = "http://www.google.com/notfound60";
		
		private static final String URL_NOT_FOUND_61 = "http://www.google.com/notfound61";
		private static final String URL_NOT_FOUND_62 = "http://www.google.com/notfound62";
		private static final String URL_NOT_FOUND_63 = "http://www.google.com/notfound63";
		private static final String URL_NOT_FOUND_64 = "http://www.google.com/notfound64";
		private static final String URL_NOT_FOUND_65 = "http://www.google.com/notfound65";
		private static final String URL_NOT_FOUND_66 = "http://www.google.com/notfound66";
		private static final String URL_NOT_FOUND_67 = "http://www.google.com/notfound67";
		private static final String URL_NOT_FOUND_68 = "http://www.google.com/notfound68";
		private static final String URL_NOT_FOUND_69 = "http://www.google.com/notfound69";
		private static final String URL_NOT_FOUND_70 = "http://www.google.com/notfound70";
		
		private static final String URL_NOT_FOUND_71 = "http://www.google.com/notfound71";
		private static final String URL_NOT_FOUND_72 = "http://www.google.com/notfound72";
		private static final String URL_NOT_FOUND_73 = "http://www.google.com/notfound73";
		private static final String URL_NOT_FOUND_74 = "http://www.google.com/notfound74";
		private static final String URL_NOT_FOUND_75 = "http://www.google.com/notfound75";
		private static final String URL_NOT_FOUND_76 = "http://www.google.com/notfound76";
		private static final String URL_NOT_FOUND_77 = "http://www.google.com/notfound77";
		private static final String URL_NOT_FOUND_78 = "http://www.google.com/notfound78";
		private static final String URL_NOT_FOUND_79 = "http://www.google.com/notfound79";
		private static final String URL_NOT_FOUND_80 = "http://www.google.com/notfound80";
		
		private static final String URL_NOT_FOUND_81 = "http://www.google.com/notfound81";
		private static final String URL_NOT_FOUND_82 = "http://www.google.com/notfound82";
		private static final String URL_NOT_FOUND_83 = "http://www.google.com/notfound83";
		private static final String URL_NOT_FOUND_84 = "http://www.google.com/notfound84";
		private static final String URL_NOT_FOUND_85 = "http://www.google.com/notfound85";
		private static final String URL_NOT_FOUND_86 = "http://www.google.com/notfound86";
		private static final String URL_NOT_FOUND_87 = "http://www.google.com/notfound87";
		private static final String URL_NOT_FOUND_88 = "http://www.google.com/notfound88";
		private static final String URL_NOT_FOUND_89 = "http://www.google.com/notfound89";
		private static final String URL_NOT_FOUND_90 = "http://www.google.com/notfound90";
		
		private static final String URL_NOT_FOUND_91 = "http://www.google.com/notfound91";
		private static final String URL_NOT_FOUND_92 = "http://www.google.com/notfound92";
		private static final String URL_NOT_FOUND_93 = "http://www.google.com/notfound93";
		private static final String URL_NOT_FOUND_94 = "http://www.google.com/notfound94";
		private static final String URL_NOT_FOUND_95 = "http://www.google.com/notfound95";
		private static final String URL_NOT_FOUND_96 = "http://www.google.com/notfound96";
		private static final String URL_NOT_FOUND_97 = "http://www.google.com/notfound97";
		private static final String URL_NOT_FOUND_98 = "http://www.google.com/notfound98";
		private static final String URL_NOT_FOUND_99 = "http://www.google.com/notfound99";
		private static final String URL_NOT_FOUND_100 = "http://www.google.com/notfound100";
		
		private static final String URL_NOT_FOUND_101 = "http://www.google.com/notfound101";
		private static final String URL_NOT_FOUND_102 = "http://www.google.com/notfound102";
		private static final String URL_NOT_FOUND_103 = "http://www.google.com/notfound103";
		private static final String URL_NOT_FOUND_104 = "http://www.google.com/notfound104";
		private static final String URL_NOT_FOUND_105 = "http://www.google.com/notfound105";
		private static final String URL_NOT_FOUND_106 = "http://www.google.com/notfound106";
		private static final String URL_NOT_FOUND_107 = "http://www.google.com/notfound107";
		private static final String URL_NOT_FOUND_108 = "http://www.google.com/notfound108";
		private static final String URL_NOT_FOUND_109 = "http://www.google.com/notfound109";
		private static final String URL_NOT_FOUND_110 = "http://www.google.com/notfound110";
		
		private static final String URL_NOT_FOUND_111 = "http://www.google.com/notfound111";
		private static final String URL_NOT_FOUND_112 = "http://www.google.com/notfound112";
		private static final String URL_NOT_FOUND_113 = "http://www.google.com/notfound113";
		private static final String URL_NOT_FOUND_114 = "http://www.google.com/notfound114";
		private static final String URL_NOT_FOUND_115 = "http://www.google.com/notfound115";
		private static final String URL_NOT_FOUND_116 = "http://www.google.com/notfound116";
		private static final String URL_NOT_FOUND_117 = "http://www.google.com/notfound117";
		private static final String URL_NOT_FOUND_118 = "http://www.google.com/notfound118";
		private static final String URL_NOT_FOUND_119 = "http://www.google.com/notfound119";
		private static final String URL_NOT_FOUND_120 = "http://www.google.com/notfound120";
		
		private static final String URL_NOT_FOUND_121 = "http://www.google.com/notfound121";
		private static final String URL_NOT_FOUND_122 = "http://www.google.com/notfound122";
		private static final String URL_NOT_FOUND_123 = "http://www.google.com/notfound123";
		private static final String URL_NOT_FOUND_124 = "http://www.google.com/notfound124";
		private static final String URL_NOT_FOUND_125 = "http://www.google.com/notfound125";
		private static final String URL_NOT_FOUND_126 = "http://www.google.com/notfound126";
		private static final String URL_NOT_FOUND_127 = "http://www.google.com/notfound127";
		private static final String URL_NOT_FOUND_128 = "http://www.google.com/notfound128";
		private static final String URL_NOT_FOUND_129 = "http://www.google.com/notfound129";
		private static final String URL_NOT_FOUND_130 = "http://www.google.com/notfound130";
		
		private static final String URL_NOT_FOUND_131 = "http://www.google.com/notfound131";
		private static final String URL_NOT_FOUND_132 = "http://www.google.com/notfound132";
		private static final String URL_NOT_FOUND_133 = "http://www.google.com/notfound133";
		private static final String URL_NOT_FOUND_134 = "http://www.google.com/notfound134";
		private static final String URL_NOT_FOUND_135 = "http://www.google.com/notfound135";
		private static final String URL_NOT_FOUND_136 = "http://www.google.com/notfound136";
