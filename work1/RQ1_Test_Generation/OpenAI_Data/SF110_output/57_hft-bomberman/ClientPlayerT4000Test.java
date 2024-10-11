// ClientPlayerTest.java
package client;

import java.awt.Point;
import org.apache.log4j.Logger;
import sound.SoundPlayer;
import common.Actor;
import common.Constants;
import common.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPlayer}.
* It contains ten unit test cases for the {@link ClientPlayer#canBowlBombs()} method.
*/
class ClientPlayerTest {

		private Logger logger = Logger.getLogger(ClientPlayerTest.class);
		
		private int bombsPlanted = 0;
		
		private int bombDiameter = Constants.BOMB_DIAMETER;
		
		private int maxBombs = Constants.MIN_BOMBS;
		
		private long lastPlant;
		
		/**
		 * Creates a new ClientPlayer that starts on a fixed position.
		 *
		 * @param position
		 *            The starting location for this player.
		 */
		public ClientPlayerTest(Point position, int id) {
				super(position);
				this.id = id;
		}
		
		/*
		 * (non-Javadoc)
		 * 
		 * @see common.Actor#preUpdate()
		 */
		@Override
		protected void preUpdate() {
				// if (!moveVector.equals(previousMoveVector)) {
				setChanged();
				// }
		}
		
		/**
		 * Plants a bomb on the battlefield. The bomb will be located at the current
		 * position. If the user can bowl bombs the bomb get a moveVector. This will
		 * trigger a notification for the observers.
		 */
		public void plantBomb() {
				long time = System.currentTimeMillis();
				if ((bombsPlanted >= maxBombs) || (time - lastPlant < 100)) {
						return;
				}
				lastPlant = time;
				setChanged();
				Point posClone = (Point) getPosition().clone();
				ClientBomb bomb = new ClientBomb(posClone, this);
				bomb.setId(BomberClient.getInstance().getNextId());
				bomb.setDiameter(bombDiameter);
				bomb.setRemote(false);
				Point moveVec = new Point(0, 0);
				if (bowlBombs) {
						bomb.setStopped(false);
						if (getDirection() == 1) {
								moveVec.y = -Actor.MOVE_DELTA * speed;
						} else if (getDirection() == 2) {
								moveVec.y = Actor.MOVE_DELTA * speed;
						} else if (getDirection() == 3) {
								moveVec.x = -Actor.MOVE_DELTA * speed;
						} else if (getDirection() == 4) {
								moveVec.x = Actor.MOVE_DELTA * speed;
						}
				} else {
						bomb.setStopped(true);
				}
				bomb.setMoveVector(moveVec);
				bombsThatSpawnedOnMe.add(bomb);
				notifyObservers(bomb);
				SoundPlayer.getInstance().bWerfen();
				/*
				 * This needs synchronization to prevent lost updates. A lost update
				 * could occur when another thread changes the bombsPlanted variable
				 * between the read/write operation of the increment.
				 */
				synchronized (this) {
						bombsPlanted = bombsPlanted + 1;
				}
		}
		
		/*
		 * (non-Javadoc)
		 * 
		 * @see common.Player#die()
		 */
		@Override
		public void die() {
				super.die();
				SoundPlayer.getInstance().stirbt();
				logger.info("#" + getId() + " died");
		}
		
		/**
		 * Increases the maximum number of bombs this player can plant by one. If
		 * the player can already plant MAX_BOMDS bombs, this method will do
		 * nothing.
		 */
		public void increaseMaxBombs() {
				if (maxBombs < Constants.MAX_BOMBS) {
						maxBombs = maxBombs + 1;
				}
		}
		
		/**
		 * Resets the maximum number of bombs this player can plant by one.
		 */
		public void resetMaxBombs() {
				maxBombs = Constants.MIN_BOMBS;
		}
		
		/**
		 * Notifies this player that a previously planted bomb has exploded. This
		 * will decrease the count of currently planted bombs.
		 */
		public void plantedBombExploded() {
				/*
				 * This needs synchronization to prevent lost updates. A lost update
				 * could occur when another thread changes the bombsPlanted variable
				 * between the read/write operation of the decrement.
				 */
				synchronized (this) {
						bombsPlanted = bombsPlanted - 1;
				}
		}
		
		/**
		 * Increases the diameter of the bomb, that this player can plant.
		 */
		public void increaseBombDiameter() {
				bombDiameter += 2;
		}
		
		/**
		 * Resets the diameter of the bomb, that this player can plant.
		 */
		public void resetBombDiameter() {
				bombDiameter = Constants.BOMB_DIAMETER;
		}
		
		/**
		 * Sets, that player can bowl bombs
		 */
		public void setBowlBombs() {
				bowlBombs = true;
		}
		
		/**
		 * Sets, that player can't bowl bombs
		 */
		public void resetBowlBombs() {
				bowlBombs = false;
		}
		
		/**
		 * Returns weather the player can bowl bombs
		 *
		 * @return boolean can bowl bombs
		 */
		public boolean canBowlBombs() {
				return bowlBombs;
		}
		
		/**
		 * Test case 1 for {@link ClientPlayer#canBowlBombs()}.
		 * Tests if the player can bowl bombs.
		 */
		@Test
		public void testCanBowlBombs1() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		 * Test case 2 for {@link ClientPlayer#canBowlBombs()}.
		 * Tests if the player can't bowl bombs.
		 */
		@Test
		public void testCanBowlBombs2() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		 * Test case 3 for {@link ClientPlayer#canBowlBombs()}.
		 * Tests if the player can bowl bombs.
		 */
		@Test
		public void testCanBowlBombs3() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		 * Test case 4 for {@link ClientPlayer#canBowlBombs()}.
		 * Tests if the player can't bowl bombs.
		 */
		@Test
		public void testCanBowlBombs4() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		 * Test case 5 for {@link ClientPlayer#canBowlBombs()}.
		 * Tests if the player can bowl bombs.
		 */
		@Test
		public void testCanBowlBombs5() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		 * Test case 6 for {@link ClientPlayer#canBowlBombs()}.
		 * Tests if the player can't bowl bombs.
		 */
		@Test
		public void testCanBowlBombs6() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		 * Test case 7 for {@link ClientPlayer#canBowlBombs()}.
		 * Tests if the player can bowl bombs.
		 */
		@Test
		public void testCanBowlBombs7() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		 * Test case 8 for {@link ClientPlayer#canBowlBombs()}.
		 * Tests if the player can't bowl bombs.
		 */
		@Test
		public void testCanBowlBombs8() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
		
		/**
		 * Test case 9 for {@link ClientPlayer#canBowlBombs()}.
		 * Tests if the player can bowl bombs.
		 */
		@Test
		public void testCanBowlBombs9() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.setBowlBombs();
				assertTrue(player.canBowlBombs());
		}
		
		/**
		 * Test case 10 for {@link ClientPlayer#canBowlBombs()}.
		 * Tests if the player can't bowl bombs.
		 */
		@Test
		public void testCanBowlBombs10() {
				ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
				player.resetBowlBombs();
				assertFalse(player.canBowlBombs());
		}
}</code></pre>
</div>
</div>

</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span>
</pre></div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Test-Report">Test Report<a class="anchor-link" href="#Test-Report">&#182;</a></h2><p>The test report is generated by the <code>pytest</code> library. This is a HTML-based report and can be found in the <code>reports</code> directory as <code>report.html</code>.</p>
<p>The report contains a summary of the test run and shows the outcome of each test case (successful/error/failed).</p>
<p>The following figure shows the summary of the test run.</p>
<p><img src="img/test_report_summary.png" alt="test_report_summary.png" style="width: 100%; max-width: 100%"></p>
<p>The following figure shows the details of a test case.</p>
<p><img src="img/test_report_details.png" alt="test_report_details.png" style="width: 100%; max-width: 100%"></p>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Test-Coverage">Test Coverage<a class="anchor-link" href="#Test-Coverage">&#182;</a></h2><p>The test coverage is generated by the <code>pytest-cov</code> library. This is a HTML-based report and can be found in the <code>reports</code> directory as <code>htmlcov/index.html</code>.</p>
<p>The report contains a summary of the test coverage and shows the coverage of each module.</p>
<p>The following figure shows the summary of the test coverage.</p>
<p><img src="img/test_coverage_summary.png" alt="test_coverage_summary.png" style="width: 100%; max-width: 100%"></p>
<p>The following figure shows the details of a module.</p>
<p><img src="img/test_coverage_details.png" alt="test_coverage_details.png" style="width: 100%; max-width: 100%"></p>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="References">References<a class="anchor-link" href="#References">&#182;</a></h2><ul>
<li><a href="https://docs.python.org/3/library/unittest.html">https://docs.python.org/3/library/unittest.html</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#organizing-test-code">https://docs.python.org/3/library/unittest.html#organizing-test-code</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-discovery">https://docs.python.org/3/library/unittest.html#test-discovery</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#command-line-options">https://docs.python.org/3/library/unittest.html#command-line-options</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#unittest.TestCase.debug">https://docs.python.org/3/library/unittest.html#unittest.TestCase.debug</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#un