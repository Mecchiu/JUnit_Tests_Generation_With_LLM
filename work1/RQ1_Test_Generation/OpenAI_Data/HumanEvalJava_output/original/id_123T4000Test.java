// GetOddCollatzTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {

	/**
	* Test case for {@link GetOddCollatz#getOddCollatz(int)} method.
	* It tests the method with a positive integer n.
	* The expected result is a sorted list that has the odd numbers in collatz sequence.
	*/
	@Test
	void testGetOddCollatz() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		List<Integer> actual = GetOddCollatz.getOddCollatz(14);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetOddCollatz#getOddCollatz(int)} method.
	* It tests the method with a positive integer n.
	* The expected result is a sorted list that has the odd numbers in collatz sequence.
	*/
	@Test
	void testGetOddCollatz2() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(5);
		List<Integer> actual = GetOddCollatz.getOddCollatz(5);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetOddCollatz#getOddCollatz(int)} method.
	* It tests the method with a positive integer n.
	* The expected result is a sorted list that has the odd numbers in collatz sequence.
	*/
	@Test
	void testGetOddCollatz3() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		List<Integer> actual = GetOddCollatz.getOddCollatz(12);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetOddCollatz#getOddCollatz(int)} method.
	* It tests the method with a positive integer n.
	* The expected result is a sorted list that has the odd numbers in collatz sequence.
	*/
	@Test
	void testGetOddCollatz4() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = GetOddCollatz.getOddCollatz(1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetOddCollatz#getOddCollatz(int)} method.
	* It tests the method with a positive integer n.
	* The expected result is a sorted list that has the odd numbers in collatz sequence.
	*/
	@Test
	void testGetOddCollatz5() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		expected.add(21);
		expected.add(23);
		expected.add(25);
		expected.add(27);
		expected.add(29);
		expected.add(31);
		expected.add(33);
		expected.add(35);
		expected.add(37);
		expected.add(39);
		expected.add(41);
		expected.add(43);
		expected.add(45);
		expected.add(47);
		expected.add(49);
		expected.add(51);
		expected.add(53);
		expected.add(55);
		expected.add(57);
		expected.add(59);
		expected.add(61);
		expected.add(63);
		expected.add(65);
		expected.add(67);
		expected.add(69);
		expected.add(71);
		expected.add(73);
		expected.add(75);
		expected.add(77);
		expected.add(79);
		expected.add(81);
		expected.add(83);
		expected.add(85);
		expected.add(87);
		expected.add(89);
		expected.add(91);
		expected.add(93);
		expected.add(95);
		expected.add(97);
		expected.add(99);
		expected.add(101);
		expected.add(103);
		expected.add(105);
		expected.add(107);
		expected.add(109);
		expected.add(111);
		expected.add(113);
		expected.add(115);
		expected.add(117);
		expected.add(119);
		expected.add(121);
		expected.add(123);
		expected.add(125);
		expected.add(127);
		expected.add(129);
		expected.add(131);
		expected.add(133);
		expected.add(135);
		expected.add(137);
		expected.add(139);
		expected.add(141);
		expected.add(143);
		expected.add(145);
		expected.add(147);
		expected.add(149);
		expected.add(151);
		expected.add(153);
		expected.add(155);
		expected.add(157);
		expected.add(159);
		expected.add(161);
		expected.add(163);
		expected.add(165);
		expected.add(167);
		expected.add(169);
		expected.add(171);
		expected.add(173);
		expected.add(175);
		expected.add(177);
		expected.add(179);
		expected.add(181);
		expected.add(183);
		expected.add(185);
		expected.add(187);
		expected.add(189);
		expected.add(191);
		expected.add(193);
		expected.add(195);
		expected.add(197);
		expected.add(199);
		expected.add(201);
		expected.add(203);
		expected.add(205);
		expected.add(207);
		expected.add(209);
		expected.add(211);
		expected.add(213);
		expected.add(215);
		expected.add(217);
		expected.add(219);
		expected.add(221);
		expected.add(223);
		expected.add(225);
		expected.add(227);
		expected.add(229);
		expected.add(231);
		expected.add(233);
		expected.add(235);
		expected.add(237);
		expected.add(239);
		expected.add(241);
		expected.add(243);
		expected.add(245);
		expected.add(247);
		expected.add(249);
		expected.add(251);
		expected.add(253);
		expected.add(255);
		expected.add(257);
		expected.add(259);
		expected.add(261);
		expected.add(263);
		expected.add(265);
		expected.add(267);
		expected.add(269);
		expected.add(271);
		expected.add(273);
		expected.add(275);
		expected.add(277);
		expected.add(279);
		expected.add(281);
		expected.add(283);
		expected.add(285);
		expected.add(287);
		expected.add(289);
		expected.add(291);
		expected.add(293);
		expected.add(295);
		expected.add(297);
		expected.add(299);
		expected.add(301);
		expected.add(303);
		expected.add(305);
		expected.add(307);
		expected.add(309);
		expected.add(311);
		expected.add(313);
		expected.add(315);
		expected.add(317);
		expected.add(319);
		expected.add(321);
		expected.add(323);
		expected.add(325);
		expected.add(327);
		expected.add(329);
		expected.add(331);
		expected.add(333);
		expected.add(335);
		expected.add(337);
		expected.add(339);
		expected.add(341);
		expected.add(343);
		expected.add(345);
		expected.add(347);
		expected.add(349);
		expected.add(351);
		expected.add(353);
		expected.add(355);
		expected.add(357);
		expected.add(359);
		expected.add(361);
		expected.add(363);
		expected.add(365);
		expected.add(367);
		expected.add(369);
		expected.add(371);
		expected.add(373);
		expected.add(375);
		expected.add(377);
		expected.add(379);
		expected.add(381);
		expected.add(383);
		expected.add(385);
		expected.add(387);
		expected.add(389);
		expected.add(391);
		expected.add(393);
		expected.add(395);
		expected.add(397);
		expected.add(399);
		expected.add(401);
		expected.add(403);
		expected.add(405);
		expected.add(407);
		expected.add(409);
		expected.add(411);
		expected.add(413);
		expected.add(415);
		expected.add(417);
		expected.add(419);
		expected.add(421);
		expected.add(423);
		expected.add(425);
		expected.add(427);
		expected.add(429);
		expected.add(431);
		expected.add(433);
		expected.add(435);
		expected.add(437);
		expected.add(439);
		expected.add(441);
		expected.add(443);
		expected.add(445);
		expected.add(447);
		expected.add(449);
		expected.add(451);
		expected.add(453);
		expected.add(455);
		expected.add(457);
		expected.add(459);
		expected.add(461);
		expected.add(463);
		expected.add(465);
		expected.add(467);
		expected.add(469);
		expected.add(471);
		expected.add(473);
		expected.add(475);
		expected.add(477);
		expected.add(479);
		expected.add(481);
		expected.add(483);
		expected.add(485);
		expected.add(487);
		expected.add(489);
		expected.add(491);
		expected.add(493);
		expected.add(495);
		expected.add(497);
		expected.add(499);
		expected.add(501);
		expected.add(503);
		expected.add(505);
		expected.add(507);
		expected.add(509);
		expected.add(511);
		expected.add(513);
		expected.add(515);
		expected.add(517);
		expected.add(519);
		expected.add(521);
		expected.add(523);
		expected.add(525);
		expected.add(527);
		expected.add(529);
		expected.add(531);
		expected.add(533);
		expected.add(535);
		expected.add(537);
		expected.add(539);
		expected.add(541);
		expected.add(543);
		expected.add(545);
		expected.add(547);
		expected.add(549);
		expected.add(551);
		expected.add(553);
		expected.add(555);
		expected.add(557);
		expected.add(559);
		expected.add(561);
		expected.add(563);
		expected.add(565);
		expected.add(567);
		expected.add(569);
		expected.add(571);
		expected.add(573);
		expected.add(575);
		expected.add(577);
		expected.add(579);
		expected.add(581);
		expected.add(583);
		expected.add(585);
		expected.add(587);
		expected.add(589);
		expected.add(591);
		expected.add(593);
		expected.add(595);
		expected.add(597);
		expected.add(599);
		expected.add(601);
		expected.add(603);
		expected.add(605);
		expected.add(607);
		expected.add(609);
		expected.add(611);
		expected.add(613);
		expected.add(615);
		expected.add(617);
		expected.add(619);
		expected.add(621);
		expected.add(623);
		expected.add(625);
		expected.add(627);
		expected.add(629);
		expected.add(631);
		expected.add(633);
		expected.add(635);
		expected.add(637);
		expected.add(639);
		expected.add(641);
		expected.add(643);
		expected.add(645);
		expected.add(647);
		expected.add(649);
		expected.add(651);
		expected.add(653);
		expected.add(655);
		expected.add(657);
		expected.add(659);
		expected.add(661);
		expected.add(663);
		expected.add(665);
		expected.add(667);
		expected.add(669);
		expected.add(671);
		expected.add(673);
		expected.add(675);
		expected.add(677);
		expected.add(679);
		expected.add(681);
		expected.add(683);
		expected.add(685);
		expected.add(687);
		expected.add(689);
		expected.add(691);
		expected.add(693);
		expected.add(695);
		expected.add(697);
		expected.add(699);
		expected.add(701);
		expected.add(703);
		expected.add(705);
		expected.add(707);
		expected.add(709);
		expected.add(711);
		expected.add(713);
		expected.add(715);
		expected.add(717);
		expected.add(