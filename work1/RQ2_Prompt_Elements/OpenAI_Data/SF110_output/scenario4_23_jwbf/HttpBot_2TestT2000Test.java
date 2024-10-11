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
		private static final String URL_NOT_FOUND_68 = "http://www.google.