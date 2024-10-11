// DefaultFSPath_0Test.java
/*
 * DefaultFSPath.java
 *
 * Created on 18 September 2006, 00:25
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import net.sf.sugar.fspath.xpath.RegexFunctionResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultFSPath}.
* It contains ten unit test cases for the {@link DefaultFSPath#query(String)} method.
*/
class DefaultFSPath_0Test {

		private static final String TEST_DIR = "test/net/sf/sugar/fspath/";
		
		private static final String TEST_DIR_1 = TEST_DIR + "test1/";
		
		private static final String TEST_DIR_2 = TEST_DIR + "test2/";
		
		private static final String TEST_DIR_3 = TEST_DIR + "test3/";
		
		private static final String TEST_DIR_4 = TEST_DIR + "test4/";
		
		private static final String TEST_DIR_5 = TEST_DIR + "test5/";
		
		private static final String TEST_DIR_6 = TEST_DIR + "test6/";
		
		private static final String TEST_DIR_7 = TEST_DIR + "test7/";
		
		private static final String TEST_DIR_8 = TEST_DIR + "test8/";
		
		private static final String TEST_DIR_9 = TEST_DIR + "test9/";
		
		private static final String TEST_DIR_10 = TEST_DIR + "test10/";
		
		private static final String TEST_DIR_11 = TEST_DIR + "test11/";
		
		private static final String TEST_DIR_12 = TEST_DIR + "test12/";
		
		private static final String TEST_DIR_13 = TEST_DIR + "test13/";
		
		private static final String TEST_DIR_14 = TEST_DIR + "test14/";
		
		private static final String TEST_DIR_15 = TEST_DIR + "test15/";
		
		private static final String TEST_DIR_16 = TEST_DIR + "test16/";
		
		private static final String TEST_DIR_17 = TEST_DIR + "test17/";
		
		private static final String TEST_DIR_18 = TEST_DIR + "test18/";
		
		private static final String TEST_DIR_19 = TEST_DIR + "test19/";
		
		private static final String TEST_DIR_20 = TEST_DIR + "test20/";
		
		private static final String TEST_DIR_21 = TEST_DIR + "test21/";
		
		private static final String TEST_DIR_22 = TEST_DIR + "test22/";
		
		private static final String TEST_DIR_23 = TEST_DIR + "test23/";
		
		private static final String TEST_DIR_24 = TEST_DIR + "test24/";
		
		private static final String TEST_DIR_25 = TEST_DIR + "test25/";
		
		private static final String TEST_DIR_26 = TEST_DIR + "test26/";
		
		private static final String TEST_DIR_27 = TEST_DIR + "test27/";
		
		private static final String TEST_DIR_28 = TEST_DIR + "test28/";
		
		private static final String TEST_DIR_29 = TEST_DIR + "test29/";
		
		private static final String TEST_DIR_30 = TEST_DIR + "test30/";
		
		private static final String TEST_DIR_31 = TEST_DIR + "test31/";
		
		private static final String TEST_DIR_32 = TEST_DIR + "test32/";
		
		private static final String TEST_DIR_33 = TEST_DIR + "test33/";
		
		private static final String TEST_DIR_34 = TEST_DIR + "test34/";
		
		private static final String TEST_DIR_35 = TEST_DIR + "test35/";
		
		private static final String TEST_DIR_36 = TEST_DIR + "test36/";
		
		private static final String TEST_DIR_37 = TEST_DIR + "test37/";
		
		private static final String TEST_DIR_38 = TEST_DIR + "test38/";
		
		private static final String TEST_DIR_39 = TEST_DIR + "test39/";
		
		private static final String TEST_DIR_40 = TEST_DIR + "test40/";
		
		private static final String TEST_DIR_41 = TEST_DIR + "test41/";
		
		private static final String TEST_DIR_42 = TEST_DIR + "test42/";
		
		private static final String TEST_DIR_43 = TEST_DIR + "test43/";
		
		private static final String TEST_DIR_44 = TEST_DIR + "test44/";
		
		private static final String TEST_DIR_45 = TEST_DIR + "test45/";
		
		private static final String TEST_DIR_46 = TEST_DIR + "test46/";
		
		private static final String TEST_DIR_47 = TEST_DIR + "test47/";
		
		private static final String TEST_DIR_48 = TEST_DIR + "test48/";
		
		private static final String TEST_DIR_49 = TEST_DIR + "test49/";
		
		private static final String TEST_DIR_50 = TEST_DIR + "test50/";
		
		private static final String TEST_DIR_51 = TEST_DIR + "test51/";
		
		private static final String TEST_DIR_52 = TEST_DIR + "test52/";
		
		private static final String TEST_DIR_53 = TEST_DIR + "test53/";
		
		private static final String TEST_DIR_54 = TEST_DIR + "test54/";
		
		private static final String TEST_DIR_55 = TEST_DIR + "test55/";
		
		private static final String TEST_DIR_56 = TEST_DIR + "test56/";
		
		private static final String TEST_DIR_57 = TEST_DIR + "test57/";
		
		private static final String TEST_DIR_58 = TEST_DIR + "test58/";
		
		private static final String TEST_DIR_59 = TEST_DIR + "test59/";
		
		private static final String TEST_DIR_60 = TEST_DIR + "test60/";
		
		private static final String TEST_DIR_61 = TEST_DIR + "test61/";
		
		private static final String TEST_DIR_62 = TEST_DIR + "test62/";
		
		private static final String TEST_DIR_63 = TEST_DIR + "test63/";
		
		private static final String TEST_DIR_64 = TEST_DIR + "test64/";
		
		private static final String TEST_DIR_65 = TEST_DIR + "test65/";
		
		private static final String TEST_DIR_66 = TEST_DIR + "test66/";
		
		private static final String TEST_DIR_67 = TEST_DIR + "test67/";
		
		private static final String TEST_DIR_68 = TEST_DIR + "test68/";
		
		private static final String TEST_DIR_69 = TEST_DIR + "test69/";
		
		private static final String TEST_DIR_70 = TEST_DIR + "test70/";
		
		private static final String TEST_DIR_71 = TEST_DIR + "test71/";
		
		private static final String TEST_DIR_72 = TEST_DIR + "test72/";
		
		private static final String TEST_DIR_73 = TEST_DIR + "test73/";
		
		private static final String TEST_DIR_74 = TEST_DIR + "test74/";
		
		private static final String TEST_DIR_75 = TEST_DIR + "test75/";
		
		private static final String TEST_DIR_76 = TEST_DIR + "test76/";
		
		private static final String TEST_DIR_77 = TEST_DIR + "test77/";
		
		private static final String TEST_DIR_78 = TEST_DIR + "test78/";
		
		private static final String TEST_DIR_79 = TEST_DIR + "test79/