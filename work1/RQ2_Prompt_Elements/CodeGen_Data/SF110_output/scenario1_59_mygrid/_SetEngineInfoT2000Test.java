// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
private static _SetEngineInfo typeDesc;
		static {
			_SetEngineInfo.typeDesc = new org.apache.axis.description.TypeDesc();
		}
	Test _Test() {
		return _SetEngineInfo.typeDesc;
	}
}
