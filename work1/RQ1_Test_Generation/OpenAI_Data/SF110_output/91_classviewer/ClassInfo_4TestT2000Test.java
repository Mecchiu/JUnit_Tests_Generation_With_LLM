// ClassInfo_4Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfo_4Test {

		private ClassInfo ci;
		
		private String[] interfaces;
		
		private String[] expected;
		
		private String[] actual;
		
		private String[] expected2;
		
		private String[] actual2;
		
		private String[] expected3;
		
		private String[] actual3;
		
		private String[] expected4;
		
		private String[] actual4;
		
		private String[] expected5;
		
		private String[] actual5;
		
		private String[] expected6;
		
		private String[] actual6;
		
		private String[] expected7;
		
		private String[] actual7;
		
		private String[] expected8;
		
		private String[] actual8;
		
		private String[] expected9;
		
		private String[] actual9;
		
		private String[] expected10;
		
		private String[] actual10;
		
		private String[] expected11;
		
		private String[] actual11;
		
		private String[] expected12;
		
		private String[] actual12;
		
		private String[] expected13;
		
		private String[] actual13;
		
		private String[] expected14;
		
		private String[] actual14;
		
		private String[] expected15;
		
		private String[] actual15;
		
		private String[] expected16;
		
		private String[] actual16;
		
		private String[] expected17;
		
		private String[] actual17;
		
		private String[] expected18;
		
		private String[] actual18;
		
		private String[] expected19;
		
		private String[] actual19;
		
		private String[] expected20;
		
		private String[] actual20;
		
		private String[] expected21;
		
		private String[] actual21;
		
		private String[] expected22;
		
		private String[] actual22;
		
		private String[] expected23;
		
		private String[] actual23;
		
		private String[] expected24;
		
		private String[] actual24;
		
		private String[] expected25;
		
		private String[] actual25;
		
		private String[] expected26;
		
		private String[] actual26;
		
		private String[] expected27;
		
		private String[] actual27;
		
		private String[] expected28;
		
		private String[] actual28;
		
		private String[] expected29;
		
		private String[] actual29;
		
		private String[] expected30;
		
		private String[] actual30;
		
		private String[] expected31;
		
		private String[] actual31;
		
		private String[] expected32;
		
		private String[] actual32;
		
		private String[] expected33;
		
		private String[] actual33;
		
		private String[] expected34;
		
		private String[] actual34;
		
		private String[] expected35;
		
		private String[] actual35;
		
		private String[] expected36;
		
		private String[] actual36;
		
		private String[] expected37;
		
		private String[] actual37;
		
		private String[] expected38;
		
		private String[] actual38;
		
		private String[] expected39;
		
		private String[] actual39;
		
		private String[] expected40;
		
		private String[] actual40;
		
		private String[] expected41;
		
		private String[] actual41;
		
		private String[] expected42;
		
		private String[] actual42;
		
		private String[] expected43;
		
		private String[] actual43;
		
		private String[] expected44;
		
		private String[] actual44;
		
		private String[] expected45;
		
		private String[] actual45;
		
		private String[] expected46;
		
		private String[] actual46;
		
		private String[] expected47;
		
		private String[] actual47;
		
		private String[] expected48;
		
		private String[] actual48;
		
		private String[] expected49;
		
		private String[] actual49;
		
		private String[] expected50;
		
		private String[] actual50;
		
		private String[] expected51;
		
		private String[] actual51;
		
		private String[] expected52;
		
		private String[] actual52;
		
		private String[] expected53;
		
		private String[] actual53;
		
		private String[] expected54;
		
		private String[] actual54;
		
		private String[] expected55;
		
		private String[] actual55;
		
		private String[] expected56;
		
		private String[] actual56;
		
		private String[] expected57;
		
		private String[] actual57;
		
		private String[] expected58;
		
		private String[] actual58;
		
		private String[] expected59;
		
		private String[] actual59;
		
		private String[] expected60;
		
		private String[] actual60;
		
		private String[] expected61;
		
		private String[] actual61;
		
		private String[] expected62;
		
		private String[] actual62;
		
		private String[] expected63;
		
		private String[] actual63;
		
		private String[] expected64;
		
		private String[] actual64;
		
		private String[] expected65;
		
		private String[] actual65;
		
		private String[] expected66;
		
		private String[] actual66;
		
		private String[] expected67;
		
		private String[] actual67;
		
		private String[] expected68;
		
		private String[] actual68;
		
		private String[] expected69;
		
		private String[] actual69;
		
		private String[] expected70;
		
		private String[] actual70;
		
		private String[] expected71;
		
		private String[] actual71;
		
		private String[] expected72;
		
		private String[] actual72;
		
		private String[] expected73;
		
		private String[] actual73;
		
		private String[] expected74;
		
		private String[] actual74;
		
		private String[] expected75;
		
		private String[] actual75;
		
		private String[] expected76;
		
		private String[] actual76;
		
		private String[] expected77;
		
		private String[] actual77;
		
		private String[] expected78;
		
		private String[] actual78;
		
		private String[] expected79;
		
		private String[] actual79;
		
		private String[] expected80;
		
		private String[] actual80;
		
		private String[] expected81;
		
		private String[] actual81;
		
		private String[] expected82;
		
		private String[] actual82;
		
		private String[] expected83;
	