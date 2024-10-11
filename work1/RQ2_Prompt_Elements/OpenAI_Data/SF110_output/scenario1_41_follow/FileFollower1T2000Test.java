// FileFollowerTest.java
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
class FileFollowerTest {

		/**
		* Test case 1 for {@link FileFollower#removeOutputDestination(OutputDestination)}
		* This test case tests the method with a null value.
		*/
		@Test
		void testRemoveOutputDestination1() {
				FileFollower fileFollower = new FileFollower();
				assertFalse(fileFollower.removeOutputDestination(null));
		}
		
		/**
		* Test case 2 for {@link FileFollower#removeOutputDestination(OutputDestination)}
		* This test case tests the method with a non-null value.
		*/
		@Test
		void testRemoveOutputDestination2() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								// do nothing
						}
				};
				assertFalse(fileFollower.removeOutputDestination(outputDestination));
		}
		
		/**
		* Test case 3 for {@link FileFollower#removeOutputDestination(OutputDestination)}
		* This test case tests the method with a non-null value.
		*/
		@Test
		void testRemoveOutputDestination3() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								// do nothing
						}
				};
				fileFollower.addOutputDestination(outputDestination);
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
		}
		
		/**
		* Test case 4 for {@link FileFollower#removeOutputDestination(OutputDestination)}
		* This test case tests the method with a non-null value.
		*/
		@Test
		void testRemoveOutputDestination4() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								// do nothing
						}
				};
				fileFollower.addOutputDestination(outputDestination);
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
				assertFalse(fileFollower.removeOutputDestination(outputDestination));
		}
		
		/**
		* Test case 5 for {@link FileFollower#removeOutputDestination(OutputDestination)}
		* This test case tests the method with a non-null value.
		*/
		@Test
		void testRemoveOutputDestination5() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								// do nothing
						}
				};
				fileFollower.addOutputDestination(outputDestination);
				fileFollower.addOutputDestination(outputDestination);
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
				assertFalse(fileFollower.removeOutputDestination(outputDestination));
		}
		
		/**
		* Test case 6 for {@link FileFollower#removeOutputDestination(OutputDestination)}
		* This test case tests the method with a non-null value.
		*/
		@Test
		void testRemoveOutputDestination6() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								// do nothing
						}
				};
				fileFollower.addOutputDestination(outputDestination);
				fileFollower.addOutputDestination(outputDestination);
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
				assertFalse(fileFollower.removeOutputDestination(outputDestination));
		}
		
		/**
		* Test case 7 for {@link FileFollower#removeOutputDestination(OutputDestination)}
		* This test case tests the method with a non-null value.
		*/
		@Test
		void testRemoveOutputDestination7() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								// do nothing
						}
				};
				fileFollower.addOutputDestination(outputDestination);
				fileFollower.addOutputDestination(outputDestination);
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
				assertFalse(fileFollower.removeOutputDestination(outputDestination));
		}
		
		/**
		* Test case 8 for {@link FileFollower#removeOutputDestination(OutputDestination)}
		* This test case tests the method with a non-null value.
		*/
		@Test
		void testRemoveOutputDestination8() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								// do nothing
						}
				};
				fileFollower.addOutputDestination(outputDestination);
				fileFollower.addOutputDestination(outputDestination);
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
				assertFalse(fileFollower.removeOutputDestination(outputDestination));
		}
		
		/**
		* Test case 9 for {@link FileFollower#removeOutputDestination(OutputDestination)}
		* This test case tests the method with a non-null value.
		*/
		@Test
		void testRemoveOutputDestination9() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								// do nothing
						}
				};
				fileFollower.addOutputDestination(outputDestination);
				fileFollower.addOutputDestination(outputDestination);
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
				assertTrue(fileFollower.removeOutputDestination(outputDestination));
				assertFalse(fileFollower.removeOutputDestination(outputDestination));
		}
		
		/**
		* Test case 10 for {@link FileFollower#removeOutputDestination(OutputDestination)}
		* This test case