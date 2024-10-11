// IscubeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains one unit test case for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {

	/**
	* Constructor of {@link IscubeTest} class.
	*/
	public IscubeTest(){
	}
	
	/**
	* Tests {@link Iscube#iscube(int)}.
	*/
	@Test
	public void testIscube(){

		assertTrue(Iscube.iscube(100));
    assertTrue(Iscube.iscube(0));
    assertTrue(Iscube.iscube(-100));
    assertTrue(Iscube.iscube(180));
    assertTrue(Iscube.iscube(-180));
    assertTrue(Iscube.iscube(1000));
    assertTrue(Iscube.iscube(-1000));
    assertTrue(Iscube.iscube(1729));
    assertFalse(Iscube.iscube(200));
    assertFalse(Iscube.iscube(100.01));
    assertFalse(Iscube.iscube(1000000000));
    assertFalse(Iscube.iscube(-1000000000));
    assertFalse(Iscube.iscube(0.0000001));
	}
}
