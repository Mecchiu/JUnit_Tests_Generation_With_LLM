// ClassInfo_2Test.java
//5-5-04  Added recursive search to find all interfaces.   ___JSH
//7-30-04 Switched to TreeList to keep from getting interfaces twice in list.  ___JSH
//8-01-04 Handled exceptions with fields.   ___JSH
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_2Test {

		private ClassInfo myClassInfo;
		
		private String[] cMethods;
		
		private String[] fndMethods;
		
		private String[] tempArray;
		
		private String[] data;
		
		private String[] tempArray2;
		
		private String[] data2;
		
		private String[] tempArray3;
		
		private String[] data3;
		
		private String[] tempArray4;
		
		private String[] data4;
		
		private String[] tempArray5;
		
		private String[] data5;
		
		private String[] tempArray6;
		
		private String[] data6;
		
		private String[] tempArray7;
		
		private String[] data7;
		
		private String[] tempArray8;
		
		private String[] data8;
		
		private String[] tempArray9;
		
		private String[] data9;
		
		private String[] tempArray10;
		
		private String[] data10;
		
		private String[] tempArray11;
		
		private String[] data11;
		
		private String[] tempArray12;
		
		private String[] data12;
		
		private String[] tempArray13;
		
		private String[] data13;
		
		private String[] tempArray14;
		
		private String[] data14;
		
		private String[] tempArray15;
		
		private String[] data15;
		
		private String[] tempArray16;
		
		private String[] data16;
		
		private String[] tempArray17;
		
		private String[] data17;
		
		private String[] tempArray18;
		
		private String[] data18;
		
		private String[] tempArray19;
		
		private String[] data19;
		
		private String[] tempArray20;
		
		private String[] data20;
		
		private String[] tempArray21;
		
		private String[] data21;
		
		private String[] tempArray22;
		
		private String[] data22;
		
		private String[] tempArray23;
		
		private String[] data23;
		
		private String[] tempArray24;
		
		private String[] data24;
		
		private String[] tempArray25;
		
		private String[] data25;
		
		private String[] tempArray26;
		
		private String[] data26;
		
		private String[] tempArray27;
		
		private String[] data27;
		
		private String[] tempArray28;
		
		private String[] data28;
		
		private String[] tempArray29;
		
		private String[] data29;
		
		private String[] tempArray30;
		
		private String[] data30;
		
		private String[] tempArray31;
		
		private String[] data31;
		
		private String[] tempArray32;
		
		private String[] data32;
		
		private String[] tempArray33;
		
		private String[] data33;
		
		private String[] tempArray34;
		
		private String[] data34;
		
		private String[] tempArray35;
		
		private String[] data35;
		
		private String[] tempArray36;
		
		private String[] data36;
		
		private String[] tempArray37;
		
		private String[] data37;
		
		private String[] tempArray38;
		
		private String[] data38;
		
		private String[] tempArray39;
		
		private String[] data39;
		
		private String[] tempArray40;
		
		private String[] data40;
		
		private String[] tempArray41;
		
		private String[] data41;
		
		private String[] tempArray42;
		
		private String[] data42;
		
		private String[] tempArray43;
		
		private String[] data43;
		
		private String[] tempArray44;
		
		private String[] data44;
		
		private String[] tempArray45;
		
		private String[] data45;
		
		private String[] tempArray46;
		
		private String[] data46;
		
		private String[] tempArray47;
		
		private String[] data47;
		
		private String[] tempArray48;
		
		private String[] data48;
		
		private String[] tempArray49;
		
		private String[] data49;
		
		private String[] tempArray50;
		
		private String[] data50;
		
		private String[] tempArray51;
		
		private String[] data51;
		
		private String[] tempArray52;
		
		private String[] data52;
		
		private String[] tempArray53;
		
		private String[] data53;
		
		private String[] tempArray54;
		
		private String[] data54;
		
		private String[] tempArray55;
		
		private String[] data55;
		
		private String[] tempArray56;
		
		private String[] data56;
		
		private String[] tempArray57;
		
		private String[] data57;
		
		private String[] tempArray58;
		
		private String[] data58;
		
		private String[] tempArray59;
		
		private String[] data59;
		
		private String[] tempArray60;
		
		private String[] data60;
		
		private String[] tempArray61;
		
		private String[] data61;
		
		private String[] tempArray62;
		
		private String[] data62;
		
		private String[] tempArray63;
		
		private String[] data63;
		
		private String[] tempArray64;
		
		private String[] data64;
		
		private String[] tempArray65;
		
		private String[] data65;
		
		private String[] tempArray66;
		
		private String[] data66;
		
		private String[] tempArray67;
		
		private String[] data67;
		
		private String[] tempArray68;
		
		private String[] data68;
		
		private String[] tempArray69;
		
		private String[] data69;
		
		private String[] tempArray70;
		
		private String[] data70;
		
		private String[] tempArray71;
		
		private String[] data71;
		
		private String[] tempArray72;
		
		private String[] data72;
		
		private String[] tempArray73;
		
		private String[] data73;
		
		private String[] tempArray74;
		
		private String[] data74;
		
		private String[] tempArray75;
		
		private String[] data75;
		
		private String[] tempArray76;
		
		private String[] data76;
		
		private String[] tempArray77;
		
		private String[] data77;
		
		private String[] tempArray78;
		
		private String[] data78;
		
		private String[] tempArray79;
		
