// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
public static final java.lang.String TEST_CLASS_DIR = "/" + "mygrid/web/bundle/jpa/";
		private _SetEngineInfo _setEngineInfo;
		private String name;
		private java.lang.String _name;
		private Number cpu;
		private Number ram;
		private java.lang.String _os;
		private java.lang.String _osName;
		private TestE_SetEngineInfo test_e_SetEngineInfo;
		private java.lang.Class _forClass;
		
		/**
		* Initialize the test's fields.
		*/
		@org.junit.Before
		public void initialize() {
				_setEngineInfo = new  _SetEngineInfo();
				_setEngineInfo.setName("TestingSetEngine");
				_setEngineInfo.setCpu(10.6d);
				_setEngineInfo.setRam(0L);
				_setEngineInfo.setOs("linux");
				_setEngineInfo.setOSName("Linux");
		}
	/**
	* Set test parameters.
	*/
	public void setTEST_CLASS_DIR(java.lang.String testClassDir) {
		_setEngineInfo.setTEST_CLASS_DIR(testClassDir);
	}	

	@Test
	public void testGetTypeDesc() {
				_forClass = this.getClass();
		_setEngineInfo.getTypeDesc().setName(_setEngineInfo.getName());
		_setEngineInfo.getTypeDesc().setCpu(_setEngineInfo.getCpu());
		_setEngineInfo.getTypeDesc().setRam(_setEngineInfo.getRam());
		_setEngineInfo.getTypeDesc().setOS(_setEngineInfo.getOs());
	}



  
  
  /**
   * set up is executed for every test.
   * It's the second argument that is passed to this init
   * method via the one variable of class _setEngineInfo.
   */
  @org.junit.After
  public void cleanup() {  
		_setEngineInfo.deactivateClass();
  }
	
	public java.lang.String getName() {
		return
			java.lang.String.valueOf(test_e_SetEngineInfo.getName());
	}


	public int getCount() {
		_setEngineInfo = ( _SetEngineInfo ) (_forClass);
	
		String count = null;
		
		// We'll set the name here.
		try {
			// Count all set items.
			int count_ = 0;

			// Get the set values.
			cpu = test_e_SetEngineInfo.cpu;
			ram = test_e_SetEngineInfo.ram;
			os = test_e_SetEngineInfo.os;
			osName = test_e_SetEngineInfo.osName;			

			return count_;
		} 
		catch (Exception e1) {
			System.out.println("UnoServiceTestCase.setUpClass()");
			System.out.println(e1.getMessage());
			return count;
		}
	}

	public java.lang.String get_Name() {
		if (name!= null)
			return name;
		System.out.println("UnoServiceTestCase.get_Name()");
		return _setEngineInfo.getName();
	}

	public void setName(java.lang.String name) {
		_name = name;
	}

	public java.lang.String get_CPU() {
		Integer cpu_ = test_e_SetEngineInfo.cpu;
		System.out.println("UnoServiceTestCase.set_CPU() - " + cpu_);
		return cpu_== null?"Not set":cpu_.toString();
	}

	public void set_CPU(String cpu) {
		_setEngineInfo.setCpu(Float.parseFloat(cpu));
	}

	public java.lang.String get_RAM() {
		Float ram_ = test_e_SetEngineInfo.ram;
		System.out.println("UnoServiceTestCase.set_RAM() - " + ram_ );
		return ram_== null?"Not set":ram_.toString();
	}

	public void set_RAM(Float ram) {
		_setEngineInfo.setRam(Long.parseLong(ram.toString()));
		
		}

	public java.lang.String get_OS() {
		return
			java.lang.String.valueOf(test_e_SetEngineInfo.getOS());
	}

	public void set_OS(java.lang.String os) {
		_setEngineInfo.setOs(os);
		
	}

	public java.lang.String getOS() {
		return _setEngineInfo.getOS();
	}

	public java.lang.String get_OS_Name() {
		return
			java.lang.String.valueOf(test_e_SetEngineInfo.getOSName());
	}

	public void set_OS_Name(java.lang.String osm) {
		_setEngineInfo.setOSName(osm);
	}
		

}
