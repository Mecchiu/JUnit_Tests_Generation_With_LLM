// FileFollower_1Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains ten unit test cases for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_1Test {

		private static final Logger LOG = Logger.getLogger(FileFollower_1Test.class.getName());
		
		/**
		* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)}
		*
		* @throws IOException
		*/
		@Test
		void testRemoveOutputDestination_1() throws IOException {
				File file = new File("test/ghm/follow/test.txt");
				OutputDestination[] initialOutputDestinations = new OutputDestination[1];
				initialOutputDestinations[0] = new OutputDestination() {
						@Override
						public void print(String s) {
								LOG.info(s);
						}
						@Override
						public void clear() {
								LOG.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						LOG.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				fileFollower.removeOutputDestination(initialOutputDestinations[0]);
				assertEquals(0, fileFollower.getOutputDestinations().size());
		}
		
		/**
		* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)}
		*
		* @throws IOException
		*/
		@Test
		void testRemoveOutputDestination_2() throws IOException {
				File file = new File("test/ghm/follow/test.txt");
				OutputDestination[] initialOutputDestinations = new OutputDestination[1];
				initialOutputDestinations[0] = new OutputDestination() {
						@Override
						public void print(String s) {
								LOG.info(s);
						}
						@Override
						public void clear() {
								LOG.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						LOG.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				fileFollower.removeOutputDestination(initialOutputDestinations[0]);
				assertEquals(0, fileFollower.getOutputDestinations().size());
		}
		
		/**
		* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)}
		*
		* @throws IOException
		*/
		@Test
		void testRemoveOutputDestination_3() throws IOException {
				File file = new File("test/ghm/follow/test.txt");
				OutputDestination[] initialOutputDestinations = new OutputDestination[1];
				initialOutputDestinations[0] = new OutputDestination() {
						@Override
						public void print(String s) {
								LOG.info(s);
						}
						@Override
						public void clear() {
								LOG.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						LOG.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				fileFollower.removeOutputDestination(initialOutputDestinations[0]);
				assertEquals(0, fileFollower.getOutputDestinations().size());
		}
		
		/**
		* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)}
		*
		* @throws IOException
		*/
		@Test
		void testRemoveOutputDestination_4() throws IOException {
				File file = new File("test/ghm/follow/test.txt");
				OutputDestination[] initialOutputDestinations = new OutputDestination[1];
				initialOutputDestinations[0] = new OutputDestination() {
						@Override
						public void print(String s) {
								LOG.info(s);
						}
						@Override
						public void clear() {
								LOG.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						LOG.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				fileFollower.removeOutputDestination(initialOutputDestinations[0]);
				assertEquals(0, fileFollower.getOutputDestinations().size());
		}
		
		/**
		* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)}
		*
		* @throws IOException
		*/
		@Test
		void testRemoveOutputDestination_5() throws IOException {
				File file = new File("test/ghm/follow/test.txt");
				OutputDestination[] initialOutputDestinations = new OutputDestination[1];
				initialOutputDestinations[0] = new OutputDestination() {
						@Override
						public void print(String s) {
								LOG.info(s);
						}
						@Override
						public void clear() {
								LOG.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						LOG.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				fileFollower.removeOutputDestination(initialOutputDestinations[0]);
				assertEquals(0, fileFollower.getOutputDestinations().size());
		}
		
		/**
		* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)}
		*
		* @throws IOException
		*/
		@Test
		void testRemoveOutputDestination_6() throws IOException {
				File file = new File("test/ghm/follow/test.txt");
				OutputDestination[] initialOutputDestinations = new OutputDestination[1];
				initialOutputDestinations[0] = new OutputDestination() {
						@Override
						public void print(String s) {
								LOG.info(s);
						}
						@Override
						public void clear() {
								LOG.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						LOG.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				fileFollower.removeOutputDestination(initialOutputDestinations[0]);
				assertEquals(0, fileFollower.getOutputDestinations().size());
		}
		
		/**
		* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)}
		*
		* @throws IOException
		*/
		@Test
		void testRemoveOutputDestination_7() throws IOException {
				File file = new File("test/ghm/follow/test.txt");
				OutputDestination[] initialOutputDestinations = new OutputDestination[1];
				initialOutputDestinations[0] = new OutputDestination() {
						@Override
						public void print(String s) {
								LOG.info(s);
						}
						@Override
						public void clear() {
								LOG.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						LOG.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				fileFollower.removeOutputDestination(initialOutputDestinations[0]);
				assertEquals(0, fileFollower.getOutputDestinations().size());
		}
		
		/**
		* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)}
		*
		* @throws IOException
		*/
		@Test
		void testRemoveOutputDestination_8() throws IOException {
				File file = new File("test/ghm/follow/test.txt");
				OutputDestination[] initialOutputDestinations = new OutputDestination[1];
				initialOutputDestinations[0] = new OutputDestination() {
						@Override
						public void print(String s) {
								LOG.info(s);
						}
						@Override
						public void clear() {
								LOG.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						LOG.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				fileFollower.removeOutputDestination(initialOutputDestinations[0]);
				assertEquals(0, fileFollower.getOutputDestinations().size());
		}
		
		/**
		* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)}
		*
		* @throws IOException
		*/
		@Test
		void testRemoveOutputDestination_9() throws IOException {
				File file = new File("test/ghm/follow/test.txt");
				OutputDestination[] initialOutputDestinations = new OutputDestination[1];
				initialOutputDestinations[0] = new OutputDestination() {
						@Override
						public void print(String s) {
								LOG.info(s);
						}
						@Override
						public void clear() {
								LOG.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						LOG.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				fileFollower.removeOutputDestination(initialOutputDestinations[0]);
				assertEquals(0, fileFollower.getOutputDestinations().size());
		}
		
		/**
		* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)}
		*
		* @throws IOException
		*/
		@Test
		void testRemoveOutputDestination_10() throws IOException {
				File file = new File("test/ghm/follow/test.txt");
				OutputDestination[] initialOutputDestinations = new OutputDestination[1];
				initialOutputDestinations[0] = new OutputDestination() {
						@Override
						public void print(String s) {
								LOG.info(s);
						}
						@Override
						public void clear() {
								LOG.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						LOG.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				fileFollower.removeOutputDestination(initialOutputDestinations[0]);
				assertEquals(0, fileFollower.getOutputDestinations().size());
		}
		
}

// FileFollower_2Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging