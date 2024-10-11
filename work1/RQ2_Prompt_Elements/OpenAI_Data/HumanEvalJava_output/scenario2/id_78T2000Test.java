// HexKeyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {
	@Test
			void testHexKey1() {
				assertEquals(0, HexKey.hexKey(""));
			}

			@Test
			void testHexKey2() {
				assertEquals(0, HexKey.hexKey("0"));
			}

			@Test
			void testHexKey3() {
				assertEquals(1, HexKey.hexKey("1"));
			}

			@Test
			void testHexKey4() {
				assertEquals(1, HexKey.hexKey("2"));
			}

			@Test
			void testHexKey5() {
				assertEquals(1, HexKey.hexKey("3"));
			}

			@Test
			void testHexKey6() {
				assertEquals(1, HexKey.hexKey("4"));
			}

			@Test
			void testHexKey7() {
				assertEquals(1, HexKey.hexKey("5"));
			}

			@Test
			void testHexKey8() {
				assertEquals(1, HexKey.hexKey("6"));
			}

			@Test
			void testHexKey9() {
				assertEquals(1, HexKey.hexKey("7"));
			}

			@Test
			void testHexKey10() {
				assertEquals(1, HexKey.hexKey("8"));
			}

			@Test
			void testHexKey11() {
				assertEquals(1, HexKey.hexKey("9"));
			}

			@Test
			void testHexKey12() {
				assertEquals(1, HexKey.hexKey("A"));
			}

			@Test
			void testHexKey13() {
				assertEquals(1, HexKey.hexKey("B"));
			}

			@Test
			void testHexKey14() {
				assertEquals(1, HexKey.hexKey("C"));
			}

			@Test
			void testHexKey15() {
				assertEquals(1, HexKey.hexKey("D"));
			}

			@Test
			void testHexKey16() {
				assertEquals(1, HexKey.hexKey("E"));
			}

			@Test
			void testHexKey17() {
				assertEquals(1, HexKey.hexKey("F"));
			}

			@Test
			void testHexKey18() {
				assertEquals(2, HexKey.hexKey("10"));
			}

			@Test
			void testHexKey19() {
				assertEquals(2, HexKey.hexKey("11"));
			}

			@Test
			void testHexKey20() {
				assertEquals(2, HexKey.hexKey("12"));
			}

			@Test
			void testHexKey21() {
				assertEquals(2, HexKey.hexKey("13"));
			}

			@Test
			void testHexKey22() {
				assertEquals(2, HexKey.hexKey("14"));
			}

			@Test
			void testHexKey23() {
				assertEquals(2, HexKey.hexKey("15"));
			}

			@Test
			void testHexKey24() {
				assertEquals(2, HexKey.hexKey("16"));
			}

			@Test
			void testHexKey25() {
				assertEquals(2, HexKey.hexKey("17"));
			}

			@Test
			void testHexKey26() {
				assertEquals(2, HexKey.hexKey("18"));
			}

			@Test
			void testHexKey27() {
				assertEquals(2, HexKey.hexKey("19"));
			}

			@Test
			void testHexKey28() {
				assertEquals(2, HexKey.hexKey("1A"));
			}

			@Test
			void testHexKey29() {
				assertEquals(2, HexKey.hexKey("1B"));
			}

			@Test
			void testHexKey30() {
				assertEquals(2, HexKey.hexKey("1C"));
			}

			@Test
			void testHexKey31() {
				assertEquals(2, HexKey.hexKey("1D"));
			}

			@Test
			void testHexKey32() {
				assertEquals(2, HexKey.hexKey("1E"));
			}

			@Test
			void testHexKey33() {
				assertEquals(2, HexKey.hexKey("1F"));
			}

			@Test
			void testHexKey34() {
				assertEquals(2, HexKey.hexKey("20"));
			}

			@Test
			void testHexKey35() {
				assertEquals(2, HexKey.hexKey("21"));
			}

			@Test
			void testHexKey36() {
				assertEquals(2, HexKey.hexKey("22"));
			}

			@Test
			void testHexKey37() {
				assertEquals(2, HexKey.hexKey("23"));
			}

			@Test
			void testHexKey38() {
				assertEquals(2, HexKey.hexKey("24"));
			}

			@Test
			void testHexKey39() {
				assertEquals(2, HexKey.hexKey("25"));
			}

			@Test
			void testHexKey40() {
				assertEquals(2, HexKey.hexKey("26"));
			}

			@Test
			void testHexKey41() {
				assertEquals(2, HexKey.hexKey("27"));
			}

			@Test
			void testHexKey42() {
				assertEquals(2, HexKey.hexKey("28"));
			}

			@Test
			void testHexKey43() {
				assertEquals(2, HexKey.hexKey("29"));
			}

			@Test
			void testHexKey44() {
				assertEquals(2, HexKey.hexKey("2A"));
			}

			@Test
			void testHexKey45() {
				assertEquals(2, HexKey.hexKey("2B"));
			}

			@Test
			void testHexKey46() {
				assertEquals(2, HexKey.hexKey("2C"));
			}

			@Test
			void testHexKey47() {
				assertEquals(2, HexKey.hexKey("2D"));
			}

			@Test
			void testHexKey48() {
				assertEquals(2, HexKey.hexKey("2E"));
			}

			@Test
			void testHexKey49() {
				assertEquals(2, HexKey.hexKey("2F"));
			}

			@Test
			void testHexKey50() {
				assertEquals(2, HexKey.hexKey("30"));
			}

			@Test
			void testHexKey51() {
				assertEquals(2, HexKey.hexKey("31"));
			}

			@Test
			void testHexKey52() {
				assertEquals(2, HexKey.hexKey("32"));
			}

			@Test
			void testHexKey53() {
				assertEquals(2, HexKey.hexKey("33"));
			}

			@Test
			void testHexKey54() {
				assertEquals(2, HexKey.hexKey("34"));
			}

			@Test
			void testHexKey55() {
				assertEquals(2, HexKey.hexKey("35"));
			}

			@Test
			void testHexKey56() {
				assertEquals(2, HexKey.hexKey("36"));
			}

			@Test
			void testHexKey57() {
				assertEquals(2, HexKey.hexKey("37"));
			}

			@Test
			void testHexKey58() {
				assertEquals(2, HexKey.hexKey("38"));
			}

			@Test
			void testHexKey59() {
				assertEquals(2, HexKey.hexKey("39"));
			}

			@Test
			void testHexKey60() {
				assertEquals(2, HexKey.hexKey("3A"));
			}

			@Test
			void testHexKey61() {
				assertEquals(2, HexKey.hexKey("3B"));
			}

			@Test
			void testHexKey62() {
				assertEquals(2, HexKey.hexKey("3C"));
			}

			@Test
			void testHexKey63() {
				assertEquals(2, HexKey.hexKey("3D"));
			}

			@Test
			void testHexKey64() {
				assertEquals(2, HexKey.hexKey("3E"));
			}

			@Test
			void testHexKey65() {
				assertEquals(2, HexKey.hexKey("3F"));
			}

			@Test
			void testHexKey66() {
				assertEquals(2, HexKey.hexKey("40"));
			}

			@Test
			void testHexKey67() {
				assertEquals(2, HexKey.hexKey("41"));
			}

			@Test
			void testHexKey68() {
				assertEquals(2, HexKey.hexKey("42"));
			}

			@Test
			void testHexKey69() {
				assertEquals(2, HexKey.hexKey("43"));
			}

			@Test
			void testHexKey70() {
				assertEquals(2, HexKey.hexKey("44"));
			}

			@Test
			void testHexKey71() {
				assertEquals(2, HexKey.hexKey("45"));
			}

			@Test
			void testHexKey72() {
				assertEquals(2, HexKey.hexKey("46"));
			}

			@Test
			void testHexKey73() {
				assertEquals(2, HexKey.hexKey("47"));
			}

			@Test
			void testHexKey74() {
				assertEquals