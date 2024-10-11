// IscubeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {

		@Test
		void test_iscube_0() {
			assertTrue(Iscube.iscube(0));
		}
		
		@Test
		void test_iscube_1() {
			assertTrue(Iscube.iscube(1));
		}
		
		@Test
		void test_iscube_8() {
			assertTrue(Iscube.iscube(8));
		}
		
		@Test
		void test_iscube_27() {
			assertTrue(Iscube.iscube(27));
		}
		
		@Test
		void test_iscube_64() {
			assertTrue(Iscube.iscube(64));
		}
		
		@Test
		void test_iscube_125() {
			assertTrue(Iscube.iscube(125));
		}
		
		@Test
		void test_iscube_216() {
			assertTrue(Iscube.iscube(216));
		}
		
		@Test
		void test_iscube_343() {
			assertTrue(Iscube.iscube(343));
		}
		
		@Test
		void test_iscube_512() {
			assertTrue(Iscube.iscube(512));
		}
		
		@Test
		void test_iscube_729() {
			assertTrue(Iscube.iscube(729));
		}
		
		@Test
		void test_iscube_1000() {
			assertTrue(Iscube.iscube(1000));
		}
		
		@Test
		void test_iscube_2147483647() {
			assertFalse(Iscube.iscube(2147483647));
		}
		
		@Test
		void test_iscube_negative_1() {
			assertTrue(Iscube.iscube(-1));
		}
		
		@Test
		void test_iscube_negative_8() {
			assertTrue(Iscube.iscube(-8));
		}
		
		@Test
		void test_iscube_negative_27() {
			assertTrue(Iscube.iscube(-27));
		}
		
		@Test
		void test_iscube_negative_64() {
			assertTrue(Iscube.iscube(-64));
		}
		
		@Test
		void test_iscube_negative_125() {
			assertTrue(Iscube.iscube(-125));
		}
		
		@Test
		void test_iscube_negative_216() {
			assertTrue(Iscube.iscube(-216));
		}
		
		@Test
		void test_iscube_negative_343() {
			assertTrue(Iscube.iscube(-343));
		}
		
		@Test
		void test_iscube_negative_512() {
			assertTrue(Iscube.iscube(-512));
		}
		
		@Test
		void test_iscube_negative_729() {
			assertTrue(Iscube.iscube(-729));
		}
		
		@Test
		void test_iscube_negative_1000() {
			assertTrue(Iscube.iscube(-1000));
		}
		
		@Test
		void test_iscube_negative_2147483647() {
			assertFalse(Iscube.iscube(-2147483647));
		}
		
		@Test
		void test_iscube_2147483648() {
			assertFalse(Iscube.iscube(2147483648));
		}
		
		@Test
		void test_iscube_negative_2147483648() {
			assertFalse(Iscube.iscube(-2147483648));
		}
		
		@Test
		void test_iscube_2147483649() {
			assertFalse(Iscube.iscube(2147483649));
		}
		
		@Test
		void test_iscube_negative_2147483649() {
			assertFalse(Iscube.iscube(-2147483649));
		}
		
		@Test
		void test_iscube_2147483650() {
			assertFalse(Iscube.iscube(2147483650));
		}
		
		@Test
		void test_iscube_negative_2147483650() {
			assertFalse(Iscube.iscube(-2147483650));
		}
		
		@Test
		void test_iscube_2147483651() {
			assertFalse(Iscube.iscube(2147483651));
		}
		
		@Test
		void test_iscube_negative_2147483651() {
			assertFalse(Iscube.iscube(-2147483651));
		}
		
		@Test
		void test_iscube_2147483652() {
			assertFalse(Iscube.iscube(2147483652));
		}
		
		@Test
		void test_iscube_negative_2147483652() {
			assertFalse(Iscube.iscube(-2147483652));
		}
		
		@Test
		void test_iscube_2147483653() {
			assertFalse(Iscube.iscube(2147483653));
		}
		
		@Test
		void test_iscube_negative_2147483653() {
			assertFalse(Iscube.iscube(-2147483653));
		}
		
		@Test
		void test_iscube_2147483654() {
			assertFalse(Iscube.iscube(2147483654));
		}
		
		@Test
		void test_iscube_negative_2147483654() {
			assertFalse(Iscube.iscube(-2147483654));
		}
		
		@Test
		void test_iscube_2147483655() {
			assertFalse(Iscube.iscube(2147483655));
		}
		
		@Test
		void test_iscube_negative_2147483655() {
			assertFalse(Iscube.iscube(-2147483655));
		}
		
		@Test
		void test_iscube_2147483656() {
			assertFalse(Iscube.iscube(2147483656));
		}
		
		@Test
		void test_iscube_negative_2147483656() {
			assertFalse(Iscube.iscube(-2147483656));
		}
		
		@Test
		void test_iscube_2147483657() {
			assertFalse(Iscube.iscube(2147483657));
		}
		
		@Test
		void test_iscube_negative_2147483657() {
			assertFalse(Iscube.iscube(-2147483657));
		}
		
		@Test
		void test_iscube_2147483658() {
			assertFalse(Iscube.iscube(2147483658));
		}
		
		@Test
		void test_iscube_negative_2147483658() {
			assertFalse(Iscube.iscube(-2147483658));
		}
		
		@Test
		void test_iscube_2147483659() {
			assertFalse(Iscube.iscube(2147483659));
		}
		
		@Test
		void test_iscube_negative_2147483659() {
			assertFalse(Iscube.iscube(-2147483659));
		}
		
		@Test
		void test_iscube_2147483660() {
			assertFalse(Iscube.iscube(2147483660));
		}
		
		@Test
		void test_iscube_negative_2147483660() {
			assertFalse(Iscube.iscube(-2147483660));
		}
		
		@Test
		void test_iscube_2147483661() {
			assertFalse(Iscube.iscube(2147483661));
		}
		
		@Test
		void test_iscube_negative_2147483661() {
			assertFalse(Iscube.iscube(-2147483661));
		}
		
		@Test
		void test_iscube_2147483662() {
			assertFalse(Iscube.iscube(2147483662));
		}
		
		@Test
		void test_iscube_negative_2147483662() {
			assertFalse(Iscube.iscube(-2147483662));
		}
		
		@Test
		void test_iscube_2147483663() {
			assertFalse(Iscube.iscube(2147483663));
		}
		
		@Test
		void test_iscube_negative_2147483663() {
			assertFalse(Iscube.iscube(-2147483663));
		}
		
		@Test
		void test_iscube_2147483664() {
			assertFalse(Iscube.iscube(2147483664));
		}
		
		@Test
		void test_iscube_negative_2147483664() {
			assertFalse(Iscube.iscube(-2147483664));
		}
		
		@Test
		void test_iscube_2147483665() {
			assertFalse(Iscube.iscube(2147483665));
		}
		
		@Test
		void test_iscube_negative_2147483665() {
			assertFalse(Iscube.iscube(-2147483665));
		}
		
		@Test
		void test_iscube_2147483666() {
			assertFalse(Iscube.iscube(2147483666));
		}
		
		@Test
		void test_iscube_negative_2147483666() {
			assertFalse(Iscube.iscube(-2147483666));
		}
		
		@Test
		void test_iscube_2147483667() {
			assertFalse(Iscube.iscube(2147483667));
		}
		
		@Test
		void test_iscube_negative_2147483667() {
			assertFalse(Iscube.iscube(-2147483667));
		}
		
		@Test
		void test_iscube_2147483668() {
			assertFalse(Iscube.iscube(2147483668));
		}
		
		@Test
		void test_iscube_negative_2147483668() {
			assertFalse(Iscube.iscube(-2147483668));
		}
		
		@Test
		void test_iscube_2147483669() {
			assertFalse(Iscube.iscube(2147483669));
		}
		
		@Test
		void test_iscube_negative_2147483669() {
			assertFalse(Iscube.iscube(-2147483669));
		}
		
		@Test
		void test_iscube_2147483670() {
			assertFalse(Iscube.iscube(2147483670));
		}
		
		@Test
		void test_iscube_negative_2147483670() {
			assertFalse(Iscube.iscube(-2147483670));
		}
		
		@Test
		void test_iscube_2147483671() {
			assertFalse(Iscube.iscube(2147483671));
		}
		
		@Test
		void test_iscube_negative_2147483671() {
			assertFalse(Iscube.iscube(-2147483671));
		}
		
		@Test
		void test_iscube_2147483672() {
			assertFalse(Iscube.iscube(2147483672));
		}
		
		@Test
		void test_iscube_negative_2147483672() {
			assertFalse(Iscube.iscube(-2147483672));
		}
		
		@Test
		void test_iscube_2147483673() {
			assertFalse(Iscube.iscube(2147483673));
		}
		
		@Test
		void test_iscube_negative_2147483673() {
			assertFalse(Iscube.iscube(-2147483673));
		}
		
		@Test
		void test_iscube_2147483674() {
			assertFalse(Iscube.iscube(2147483674));
		}
		
		@Test
		void test_iscube_negative_2147483674() {
			assertFalse(Iscube.iscube(-2147483674));
		}
		
		@Test
		void test_iscube_2147483675() {
			assertFalse(Iscube.iscube(2147483675));
		}
		
		@Test
		void test_iscube_negative_2147483675() {
			assertFalse(Iscube.iscube(-2147483675));
		}
		
		@Test
		void test_iscube_2147483676() {
			assertFalse(Iscube.iscube(2147483676));
		}
		
		@Test
		void test_iscube_negative_2147483676() {
			assertFalse(Iscube.iscube(-2147483676));
		}
		
		@Test
		void test_iscube_2147483677() {
			assertFalse(Iscube.iscube(2147483677));
		}
		
		@Test
		void test_iscube_negative_2147483677() {
			assertFalse(Iscube.iscube(-2147483677));
		}
		
		@Test
		void test_iscube_2147483678() {
			assertFalse(Iscube.iscube(2147483678));
		}
		
		@Test
		void test_iscube_negative_2147483678() {
			assertFalse(Iscube.iscube(-2147483678));
		}
		
		@