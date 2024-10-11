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

		private static final Logger log = Logger.getLogger(FileFollower_1Test.class.getName());
		
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
								log.info(s);
						}
						@Override
						public void clear() {
								log.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						log.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						log.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				assertTrue(fileFollower.removeOutputDestination(initialOutputDestinations[0]));
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
								log.info(s);
						}
						@Override
						public void clear() {
								log.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						log.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						log.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				assertTrue(fileFollower.removeOutputDestination(initialOutputDestinations[0]));
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
								log.info(s);
						}
						@Override
						public void clear() {
								log.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						log.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						log.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				assertTrue(fileFollower.removeOutputDestination(initialOutputDestinations[0]));
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
								log.info(s);
						}
						@Override
						public void clear() {
								log.info("clear");
						}
				};
				FileFollower fileFollower = new FileFollower(file, initialOutputDestinations);
				fileFollower.start();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						log.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				fileFollower.stop();
				try {
						Thread.sleep(1000);
				} catch (InterruptedException e) {
						log.log(Level.SEVERE, "InterruptedException while sleeping", e);
				}
				assertTrue(fileFollower.removeOutputDestination(initialOutputDestinations[0]));
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
								log.info(s);
						}
						@Override
						public void clear() {
								log.info("clear");
						}
				};
				FileFollower