// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfoTest {
		
	@Test
	void testGetField() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = dictionaryInfo.getField("Account");
		assertEquals(fieldInfo.getName(), "Account");
		assertEquals(fieldInfo.getTag(), 1);
		assertEquals(fieldInfo.getType(), "STRING");
		assertEquals(fieldInfo.getDescription(), "Account mnemonic as agreed between buy and sell sides, e.g. broker and institution or investor/intermediary and fund manager.");
		assertEquals(fieldInfo.getEnumValues().size(), 0);
		assertEquals(fieldInfo.getEnumValues().isEmpty(), true);
		assertEquals(fieldInfo.getEnumValues().get(0), null);
		assertEquals(fieldInfo.getEnumValues().get(1), null);
		assertEquals(fieldInfo.getEnumValues().get(2), null);
		assertEquals(fieldInfo.getEnumValues().get(3), null);
		assertEquals(fieldInfo.getEnumValues().get(4), null);
		assertEquals(fieldInfo.getEnumValues().get(5), null);
		assertEquals(fieldInfo.getEnumValues().get(6), null);
		assertEquals(fieldInfo.getEnumValues().get(7), null);
		assertEquals(fieldInfo.getEnumValues().get(8), null);
		assertEquals(fieldInfo.getEnumValues().get(9), null);
		assertEquals(fieldInfo.getEnumValues().get(10), null);
		assertEquals(fieldInfo.getEnumValues().get(11), null);
		assertEquals(fieldInfo.getEnumValues().get(12), null);
		assertEquals(fieldInfo.getEnumValues().get(13), null);
		assertEquals(fieldInfo.getEnumValues().get(14), null);
		assertEquals(fieldInfo.getEnumValues().get(15), null);
		assertEquals(fieldInfo.getEnumValues().get(16), null);
		assertEquals(fieldInfo.getEnumValues().get(17), null);
		assertEquals(fieldInfo.getEnumValues().get(18), null);
		assertEquals(fieldInfo.getEnumValues().get(19), null);
		assertEquals(fieldInfo.getEnumValues().get(20), null);
		assertEquals(fieldInfo.getEnumValues().get(21), null);
		assertEquals(fieldInfo.getEnumValues().get(22), null);
		assertEquals(fieldInfo.getEnumValues().get(23), null);
		assertEquals(fieldInfo.getEnumValues().get(24), null);
		assertEquals(fieldInfo.getEnumValues().get(25), null);
		assertEquals(fieldInfo.getEnumValues().get(26), null);
		assertEquals(fieldInfo.getEnumValues().get(27), null);
		assertEquals(fieldInfo.getEnumValues().get(28), null);
		assertEquals(fieldInfo.getEnumValues().get(29), null);
		assertEquals(fieldInfo.getEnumValues().get(30), null);
		assertEquals(fieldInfo.getEnumValues().get(31), null);
		assertEquals(fieldInfo.getEnumValues().get(32), null);
		assertEquals(fieldInfo.getEnumValues().get(33), null);
		assertEquals(fieldInfo.getEnumValues().get(34), null);
		assertEquals(fieldInfo.getEnumValues().get(35), null);
		assertEquals(fieldInfo.getEnumValues().get(36), null);
		assertEquals(fieldInfo.getEnumValues().get(37), null);
		assertEquals(fieldInfo.getEnumValues().get(38), null);
		assertEquals(fieldInfo.getEnumValues().get(39), null);
		assertEquals(fieldInfo.getEnumValues().get(40), null);
		assertEquals(fieldInfo.getEnumValues().get(41), null);
		assertEquals(fieldInfo.getEnumValues().get(42), null);
		assertEquals(fieldInfo.getEnumValues().get(43), null);
		assertEquals(fieldInfo.getEnumValues().get(44), null);
		assertEquals(fieldInfo.getEnumValues().get(45), null);
		assertEquals(fieldInfo.getEnumValues().get(46), null);
		assertEquals(fieldInfo.getEnumValues().get(47), null);
		assertEquals(fieldInfo.getEnumValues().get(48), null);
		assertEquals(fieldInfo.getEnumValues().get(49), null);
		assertEquals(fieldInfo.getEnumValues().get(50), null);
		assertEquals(fieldInfo.getEnumValues().get(51), null);
		assertEquals(fieldInfo.getEnumValues().get(52), null);
		assertEquals(fieldInfo.getEnumValues().get(53), null);
		assertEquals(fieldInfo.getEnumValues().get(54), null);
		assertEquals(fieldInfo.getEnumValues().get(55), null);
		assertEquals(fieldInfo.getEnumValues().get(56), null);
		assertEquals(fieldInfo.getEnumValues().get(57), null);
		assertEquals(fieldInfo.getEnumValues().get(58), null);
		assertEquals(fieldInfo.getEnumValues().get(59), null);
		assertEquals(fieldInfo.getEnumValues().get(60), null);
		assertEquals(fieldInfo.getEnumValues().get(61), null);
		assertEquals(fieldInfo.getEnumValues().get(62), null);
		assertEquals(fieldInfo.getEnumValues().get(63), null);
		assertEquals(fieldInfo.getEnumValues().get(64), null);
		assertEquals(fieldInfo.getEnumValues().get(65), null);
		assertEquals(fieldInfo.getEnumValues().get(66), null);
		assertEquals(fieldInfo.getEnumValues().get(67), null);
		assertEquals(fieldInfo.getEnumValues().get(68), null);
		assertEquals(fieldInfo.getEnumValues().get(69), null);
		assertEquals(fieldInfo.getEnumValues().get(70), null);
		assertEquals(fieldInfo.getEnumValues().get(71), null);
		assertEquals(fieldInfo.getEnumValues().get(72), null);
		assertEquals(fieldInfo.getEnumValues().get(73), null);
		assertEquals(fieldInfo.getEnumValues().get(74), null);
		assertEquals(fieldInfo.getEnumValues().get(75), null);
		assertEquals(fieldInfo.getEnumValues().get(76), null);
		assertEquals(fieldInfo.getEnumValues().get(77), null);
		assertEquals(fieldInfo.getEnumValues().get(78), null);
		assertEquals(fieldInfo.getEnumValues().get(79), null);
		assertEquals(fieldInfo.getEnumValues().get(80), null);
		assertEquals(fieldInfo.getEnumValues().get(81), null);
		assertEquals(fieldInfo.getEnumValues().get(82), null);
		assertEquals(fieldInfo.getEnumValues().get(83), null);
		assertEquals(fieldInfo.getEnumValues().get(84), null);
		assertEquals(fieldInfo.getEnumValues().get(85), null);
		assertEquals(fieldInfo.getEnumValues().get(86), null);
		assertEquals(fieldInfo.getEnumValues().get(87), null);
		assertEquals(fieldInfo.getEnumValues().get(88), null);
		assertEquals(fieldInfo.getEnumValues().get(89), null);
		assertEquals(fieldInfo.getEnumValues().get(90), null);
		assertEquals(fieldInfo.getEnumValues().get(91), null);
		assertEquals(fieldInfo.getEnumValues().get(92), null);
		assertEquals(fieldInfo.getEnumValues().get(93), null);
		assertEquals(fieldInfo.getEnumValues().get(94), null);
		assertEquals(fieldInfo.getEnumValues().get(95), null);
		assertEquals(fieldInfo.getEnumValues().get(96), null);
		assertEquals(fieldInfo.getEnumValues().get(97), null);
		assertEquals(fieldInfo.getEnumValues().get(98), null);
		assertEquals(fieldInfo.getEnumValues().get(99), null);
		assertEquals(fieldInfo.getEnumValues().get(100), null);
		assertEquals(fieldInfo.getEnumValues().get(101), null);
		assertEquals(fieldInfo.getEnumValues().get(102), null);
		assertEquals(fieldInfo.getEnumValues().get(103), null);
		assertEquals(fieldInfo.getEnumValues().get(104), null);
		assertEquals(fieldInfo.getEnumValues().get(105), null);
		assertEquals(fieldInfo.getEnumValues().get(106), null);
		assertEquals(fieldInfo.getEnumValues().get(107), null);
		assertEquals(fieldInfo.getEnumValues().get(108), null);
		assertEquals(fieldInfo.getEnumValues().get(109), null);
		assertEquals(fieldInfo.getEnumValues().get(110), null);
		assertEquals(fieldInfo.getEnumValues().get(111), null);
		assertEquals(fieldInfo.getEnumValues().get(112), null);
		assertEquals(fieldInfo.getEnumValues().get(113), null);
		assertEquals(fieldInfo.getEnumValues().get(114), null);
		assertEquals(fieldInfo.getEnumValues().get(115), null);
		assertEquals(fieldInfo.getEnumValues().get(116), null);
		assertEquals(fieldInfo.getEnumValues().get(117), null);
		assertEquals(fieldInfo.getEnumValues().get(118), null);
		assertEquals(fieldInfo.getEnumValues().get(119), null);
		assertEquals(fieldInfo.getEnumValues().get(120), null);
		assertEquals(fieldInfo.getEnumValues().get(121), null);
		assertEquals(fieldInfo.getEnumValues().get(122), null);
		assertEquals(fieldInfo.getEnumValues().get(123), null);
		assertEquals(fieldInfo.getEnumValues().get(124), null);
		assertEquals(fieldInfo.getEnumValues().get(125), null);
		assertEquals(fieldInfo.getEnumValues().get(126), null);
		assertEquals(fieldInfo.getEnumValues().get(127), null);
		assertEquals(fieldInfo.getEnumValues().get(128), null);
		assertEquals(fieldInfo.getEnumValues().get(129), null);
		assertEquals(fieldInfo.getEnumValues().get(130), null);
		assertEquals(fieldInfo.getEnumValues().get(131), null);
		assertEquals(fieldInfo.getEnumValues().get(132), null);
		assertEquals(fieldInfo.getEnumValues().get(133), null);
		assertEquals(fieldInfo.getEnumValues().get(134), null);
		assertEquals(fieldInfo.getEnumValues().get(135), null);
		assertEquals(fieldInfo.getEnumValues().get(136), null);
		assertEquals(fieldInfo.getEnumValues().get(137), null);
		assertEquals(fieldInfo.getEnumValues().get(138), null);
		assertEquals(fieldInfo.getEnumValues().get(139), null);
		assertEquals(fieldInfo.getEnumValues().get(140), null);
		assertEquals(fieldInfo.getEnumValues().get(141), null);
		assertEquals(fieldInfo.getEnumValues().get(142), null);
		assertEquals(fieldInfo.getEnumValues().get(143), null);
		assertEquals(fieldInfo.getEnumValues().get(144), null);
		assertEquals(fieldInfo.getEnumValues().get(145), null);
		assertEquals(fieldInfo.getEnumValues().get(146), null);
		assertEquals(fieldInfo.getEnumValues().get(147), null);
		assertEquals(fieldInfo.getEnumValues().get(148), null);
		assertEquals(fieldInfo.getEnumValues().get(149), null);
		assertEquals(fieldInfo.getEnumValues().get(150), null);
		assertEquals(fieldInfo.getEnumValues().get(151), null);
		assertEquals(fieldInfo.getEnumValues().get(152), null);
		assertEquals(fieldInfo.getEnumValues().get(153), null);
		assertEquals(fieldInfo.getEnumValues().get(154), null);
		assertEquals(fieldInfo.getEnumValues().get(155), null);
		assertEquals(fieldInfo.getEnumValues().get(156), null);
		assertEquals(fieldInfo.getEnumValues().get(157), null);
		assertEquals(fieldInfo.getEnumValues().get(158), null);
		assertEquals(fieldInfo.getEnumValues().get(159), null);
		assertEquals(fieldInfo.getEnumValues().get(160), null);
		assertEquals(fieldInfo.getEnumValues().get(161), null);
		assertEquals(fieldInfo.getEnumValues().get(162), null);
		assertEquals(fieldInfo.getEnumValues().get(163), null);
		assertEquals(fieldInfo.getEnumValues().get(164), null);
		assertEquals(fieldInfo.getEnumValues().get(165), null);
		assertEquals(fieldInfo.getEnumValues().get(166), null);
		assertEquals(fieldInfo.getEnumValues().get(167), null);
		assertEquals(fieldInfo.getEnumValues().get(168), null);
		assertEquals(fieldInfo.getEnumValues().get(169), null);
		assertEquals(fieldInfo.getEnumValues().get(170), null);
		assertEquals(fieldInfo.getEnumValues().get(171), null);
		assertEquals(fieldInfo.getEnumValues().get(172), null);
		assertEquals(fieldInfo.getEnumValues().get(173), null);
		assertEquals(fieldInfo.getEnumValues().get(174), null);
		assertEquals(fieldInfo.getEnumValues().get(175), null);
		assertEquals(fieldInfo.getEnumValues().get(176), null);
		assertEquals(fieldInfo.getEnumValues().get(177), null);
		assertEquals(fieldInfo.getEnumValues().get(178), null);
		assertEquals(fieldInfo.getEnumValues().get(179), null);
		assertEquals(fieldInfo.getEnumValues().get(180), null);
		assertEquals(fieldInfo.getEnumValues().get(181), null);
}
}