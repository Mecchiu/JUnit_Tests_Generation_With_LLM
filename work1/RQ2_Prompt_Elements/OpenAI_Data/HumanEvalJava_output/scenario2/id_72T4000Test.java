// WillItFlyTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {

	@Test
	void testWillItFly() {
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 10));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 20));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 30));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 40));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 50));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 60));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 70));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 80));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 90));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 100));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 110));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 120));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 130));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 140));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 150));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 160));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 170));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 180));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 190));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 200));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 210));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 220));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 230));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 240));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 250));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 260));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 270));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 280));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 290));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 300));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 310));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 320));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 330));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 340));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 350));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 360));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 370));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 380));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 390));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 400));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 410));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 420));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 430));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 440));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 450));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 460));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 470));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 480));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 490));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 500));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 510));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 520));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 530));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 540));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 550));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 560));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 570));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 580));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 590));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 600));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 610));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 620));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 630));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 640));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 650));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 660));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 670));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 680));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 690));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 700));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 710));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 720));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 730));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 740));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 750));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 760));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 770));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 780));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 790));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 800));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 810));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 820));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 830));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 840));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 850));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 860));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 870));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 880));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 890));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 900));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 910));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 920));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 930));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 940));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 950));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 960));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 970));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 980));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 990));
		assertFalse(WillItFly.will