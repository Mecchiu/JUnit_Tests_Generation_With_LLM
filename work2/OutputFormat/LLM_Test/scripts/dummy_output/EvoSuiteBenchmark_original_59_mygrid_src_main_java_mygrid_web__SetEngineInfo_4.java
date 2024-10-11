// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
		{
			_SetEngineInfo o = new _SetEngineInfo();
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo()", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setName("test");
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(name=test)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setCpu(6654.2);
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(cpu=6654.2)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setRam(654.2);
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(ram=654.2)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setOs("linux");
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(os=linux)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setName("unknown");
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(name=unknown)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setCpu(1.2);
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(cpu=1.2)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setRam(1.2);
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(ram=1.2)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setOs("unknown");
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(os=unknown)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setName("unknown");
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(name=unknown)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setCpu(0);
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(cpu=0)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setRam(0);
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(ram=0)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setOs("unknown");
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(os=unknown)", s);
        }
		{
			_SetEngineInfo o = new _SetEngineInfo();
            o.setName("unknown");
            java.lang.String s = o.getTypeDesc();
            assertEquals("$SetEngineInfo(name=unknown)", s);
        }
}