// ClassInfo_3Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_3Test {

		private ClassInfo myClassInfo;
		
		private String[] cMethods;
		
		private String[] fndMethods;
		
		private String[] cConstructors;
		
		private String[] fndConstructors;
		
		private String[] cInterfaces;
		
		private String[] fndInterfaces;
		
		private String[] cFields;
		
		private String[] fndFields;
		
		private String[] cPackages;
		
		private String[] fndPackages;
		
		private String[] cClasses;
		
		private String[] fndClasses;
		
		private String[] cSuperClasses;
		
		private String[] fndSuperClasses;
		
		private String[] cSuperPackages;
		
		private String[] fndSuperPackages;
		
		private String[] cSuperInterfaces;
		
		private String[] fndSuperInterfaces;
		
		private String[] cSuperFields;
		
		private String[] fndSuperFields;
		
		private String[] cSuperMethods;
		
		private String[] fndSuperMethods;
		
		private String[] cSuperConstructors;
		
		private String[] fndSuperConstructors;
		
		private String[] cSuperClasses2;
		
		private String[] fndSuperClasses2;
		
		private String[] cSuperPackages2;
		
		private String[] fndSuperPackages2;
		
		private String[] cSuperInterfaces2;
		
		private String[] fndSuperInterfaces2;
		
		private String[] cSuperFields2;
		
		private String[] fndSuperFields2;
		
		private String[] cSuperMethods2;
		
		private String[] fndSuperMethods2;
		
		private String[] cSuperConstructors2;
		
		private String[] fndSuperConstructors2;
		
		private String[] cSuperClasses3;
		
		private String[] fndSuperClasses3;
		
		private String[] cSuperPackages3;
		
		private String[] fndSuperPackages3;
		
		private String[] cSuperInterfaces3;
		
		private String[] fndSuperInterfaces3;
		
		private String[] cSuperFields3;
		
		private String[] fndSuperFields3;
		
		private String[] cSuperMethods3;
		
		private String[] fndSuperMethods3;
		
		private String[] cSuperConstructors3;
		
		private String[] fndSuperConstructors3;
		
		private String[] cSuperClasses4;
		
		private String[] fndSuperClasses4;
		
		private String[] cSuperPackages4;
		
		private String[] fndSuperPackages4;
		
		private String[] cSuperInterfaces4;
		
		private String[] fndSuperInterfaces4;
		
		private String[] cSuperFields4;
		
		private String[] fndSuperFields4;
		
		private String[] cSuperMethods4;
		
		private String[] fndSuperMethods4;
		
		private String[] cSuperConstructors4;
		
		private String[] fndSuperConstructors4;
		
		private String[] cSuperClasses5;
		
		private String[] fndSuperClasses5;
		
		private String[] cSuperPackages5;
		
		private String[] fndSuperPackages5;
		
		private String[] cSuperInterfaces5;
		
		private String[] fndSuperInterfaces5;
		
		private String[] cSuperFields5;
		
		private String[] fndSuperFields5;
		
		private String[] cSuperMethods5;
		
		private String[] fndSuperMethods5;
		
		private String[] cSuperConstructors5;
		
		private String[] fndSuperConstructors5;
		
		private String[] cSuperClasses6;
		
		private String[] fndSuperClasses6;
		
		private String[] cSuperPackages6;
		
		private String[] fndSuperPackages6;
		
		private String[] cSuperInterfaces6;
		
		private String[] fndSuperInterfaces6;
		
		private String[] cSuperFields6;
		
		private String[] fndSuperFields6;
		
		private String[] cSuperMethods6;
		
		private String[] fndSuperMethods6;
		
		private String[] cSuperConstructors6;
		
		private String[] fndSuperConstructors6;
		
		private String[] cSuperClasses7;
		
		private String[] fndSuperClasses7;
		
		private String[] cSuperPackages7;
		
		private String[] fndSuperPackages7;
		
		private String[] cSuperInterfaces7;
		
		private String[] fndSuperInterfaces7;
		
		private String[] cSuperFields7;
		
		private String[] fndSuperFields7;
		
		private String[] cSuperMethods7;
		
		private String[] fndSuperMethods7;
		
		private String[] cSuperConstructors7;
		
		private String[] fndSuperConstructors7;
		
		private String[] cSuperClasses8;
		
		private String[] fndSuperClasses8;
		
		private String[] cSuperPackages8;
		
		private String[] fndSuperPackages8;
		
		private String[] cSuperInterfaces8;
		
		private String[] fndSuperInterfaces8;
		
		private String[] cSuperFields8;
		
		private String[] fndSuperFields8;
		
		private String[] cSuperMethods8;
		
		private String[] fndSuperMethods8;
		
		private String[] cSuperConstructors8;
		
		private String[] fndSuperConstructors8;
		
		private String[] cSuperClasses9;
		
		private String[] fndSuperClasses9;
		
		private String[] cSuperPackages9;
		
		private String[] fndSuperPackages9;
		
		private String[] cSuperInterfaces9;
		
		private String[] fndSuperInterfaces9;
		
		private String[] cSuperFields9;
		
		private String[] fndSuperFields9;
		
		private String[] cSuperMethods9;
		
		private String[] fndSuperMethods9;
		
		private String[] cSuperConstructors9;
		
		private String[] fndSuperConstructors9;
		
		private String[] cSuperClasses10;
		
		private String[] fndSuperClasses10;
		
		private String[] cSuperPackages10;
		
		private String[] fndSuperPackages10;
		
		private String[] cSuperInterfaces10;
		
		private String[] fndSuperInterfaces10;
		
		private String[] cSuperFields10;
		
		private String[] fndSuperFields10;
		
		private String[] cSuperMethods10;
		
		private String[] fndSuperMethods10;
		
		private String[] cSuperConstructors10;
		
		private String[] fndSuperConstructors10;
	