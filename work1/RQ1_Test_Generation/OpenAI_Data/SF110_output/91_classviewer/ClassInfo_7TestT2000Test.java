// ClassInfo_7Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfo_7Test {

		private ClassInfo myClassInfo;
		
		private String[] cMethods;
		
		private String[] fndMethods;
		
		private String[] index;
		
		private String tempStr;
		
		private String[] tempArray;
		
		private String[] tempArray2;
		
		private String[] tempArray3;
		
		private String[] tempArray4;
		
		private String[] tempArray5;
		
		private String[] tempArray6;
		
		private String[] tempArray7;
		
		private String[] tempArray8;
		
		private String[] tempArray9;
		
		private String[] tempArray10;
		
		private String[] tempArray11;
		
		private String[] tempArray12;
		
		private String[] tempArray13;
		
		private String[] tempArray14;
		
		private String[] tempArray15;
		
		private String[] tempArray16;
		
		private String[] tempArray17;
		
		private String[] tempArray18;
		
		private String[] tempArray19;
		
		private String[] tempArray20;
		
		private String[] tempArray21;
		
		private String[] tempArray22;
		
		private String[] tempArray23;
		
		private String[] tempArray24;
		
		private String[] tempArray25;
		
		private String[] tempArray26;
		
		private String[] tempArray27;
		
		private String[] tempArray28;
		
		private String[] tempArray29;
		
		private String[] tempArray30;
		
		private String[] tempArray31;
		
		private String[] tempArray32;
		
		private String[] tempArray33;
		
		private String[] tempArray34;
		
		private String[] tempArray35;
		
		private String[] tempArray36;
		
		private String[] tempArray37;
		
		private String[] tempArray38;
		
		private String[] tempArray39;
		
		private String[] tempArray40;
		
		private String[] tempArray41;
		
		private String[] tempArray42;
		
		private String[] tempArray43;
		
		private String[] tempArray44;
		
		private String[] tempArray45;
		
		private String[] tempArray46;
		
		private String[] tempArray47;
		
		private String[] tempArray48;
		
		private String[] tempArray49;
		
		private String[] tempArray50;
		
		private String[] tempArray51;
		
		private String[] tempArray52;
		
		private String[] tempArray53;
		
		private String[] tempArray54;
		
		private String[] tempArray55;
		
		private String[] tempArray56;
		
		private String[] tempArray57;
		
		private String[] tempArray58;
		
		private String[] tempArray59;
		
		private String[] tempArray60;
		
		private String[] tempArray61;
		
		private String[] tempArray62;
		
		private String[] tempArray63;
		
		private String[] tempArray64;
		
		private String[] tempArray65;
		
		private String[] tempArray66;
		
		private String[] tempArray67;
		
		private String[] tempArray68;
		
		private String[] tempArray69;
		
		private String[] tempArray70;
		
		private String[] tempArray71;
		
		private String[] tempArray72;
		
		private String[] tempArray73;
		
		private String[] tempArray74;
		
		private String[] tempArray75;
		
		private String[] tempArray76;
		
		private String[] tempArray77;
		
		private String[] tempArray78;
		
		private String[] tempArray79;
		
		private String[] tempArray80;
		
		private String[] tempArray81;
		
		private String[] tempArray82;
		
		private String[] tempArray83;
		
		private String[] tempArray84;
		
		private String[] tempArray85;
		
		private String[] tempArray86;
		
		private String[] tempArray87;
		
		private String[] tempArray88;
		
		private String[] tempArray89;
		
		private String[] tempArray90;
		
		private String[] tempArray91;
		
		private String[] tempArray92;
		
		private String[] tempArray93;
		
		private String[] tempArray94;
		
		private String[] tempArray95;
		
		private String[] tempArray96;
		
		private String[] tempArray97;
		
		private String[] tempArray98;
		
		private String[] tempArray99;
		
		private String[] tempArray100;
		
		private String[] tempArray101;
		
		private String[] tempArray102;
		
		private String[] tempArray103;
		
		private String[] tempArray104;
		
		private String[] tempArray105;
		
		private String[] tempArray106;
		
		private String[] tempArray107;
		
		private String[] tempArray108;
		
		private String[] tempArray109;
		
		private String[] tempArray110;
		
		private String[] tempArray111;
		
		private String[] tempArray112;
		
		private String[] tempArray113;
		
		private String[] tempArray114;
		
		private String[] tempArray115;
		
		private String[] tempArray116;
		
		private String[] tempArray117;
		
		private String[] tempArray118;
		
		private String[] tempArray119;
		
		private String[] tempArray120;
		
		private String[] tempArray121;
		
		private String[] tempArray122;
		
		private String[] tempArray123;
		
		private String[] tempArray124;
		
		private String[] tempArray125;
		
		private String[] tempArray126;
		
		private String[] tempArray127;
		
		private String[] tempArray128;
		
		private String[] tempArray129;
		
		private String[] tempArray130;
		
		private String[] tempArray131;
		
		private String[] tempArray132;
		
		private String[] tempArray133;
		
		private String[] tempArray134;
		
		private String[] tempArray135;
		
		private String[] tempArray136;
		
		private String[] tempArray137;
		
		private String[] tempArray138;
		
		private String[] tempArray139;
		
		private String[] tempArray140;
		
		private String[] tempArray141;
		
		private String[] tempArray142;
		
		private String[] tempArray143;
		
		private String[] tempArray144;
		
		private String[] tempArray145;
		
		private String[] tempArray146;
		
		private String[] tempArray147;
		
		private String[] tempArray148;
		
		private String[] tempArray149;
		
		private