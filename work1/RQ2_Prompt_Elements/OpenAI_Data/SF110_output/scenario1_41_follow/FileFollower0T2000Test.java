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
* It contains ten unit test cases for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollowerTest {

		/**
		* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
		* This test case checks if the method returns true when the output destination is not null.
		*/
		@Test
		public void testAddOutputDestination_1() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				};
				assertTrue(fileFollower.addOutputDestination(outputDestination));
		}
		
		/**
		* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
		* This test case checks if the method returns false when the output destination is null.
		*/
		@Test
		public void testAddOutputDestination_2() {
				FileFollower fileFollower = new FileFollower();
				assertFalse(fileFollower.addOutputDestination(null));
		}
		
		/**
		* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
		* This test case checks if the method returns false when the output destination is null.
		*/
		@Test
		public void testAddOutputDestination_3() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				};
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertFalse(fileFollower.addOutputDestination(null));
		}
		
		/**
		* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
		* This test case checks if the method returns false when the output destination is null.
		*/
		@Test
		public void testAddOutputDestination_4() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				};
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertTrue(fileFollower.addOutputDestination(outputDestination));
		}
		
		/**
		* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
		* This test case checks if the method returns false when the output destination is null.
		*/
		@Test
		public void testAddOutputDestination_5() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				};
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertFalse(fileFollower.addOutputDestination(null));
				assertTrue(fileFollower.addOutputDestination(outputDestination));
		}
		
		/**
		* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
		* This test case checks if the method returns false when the output destination is null.
		*/
		@Test
		public void testAddOutputDestination_6() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				};
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertFalse(fileFollower.addOutputDestination(null));
		}
		
		/**
		* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
		* This test case checks if the method returns false when the output destination is null.
		*/
		@Test
		public void testAddOutputDestination_7() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				};
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertFalse(fileFollower.addOutputDestination(null));
				assertTrue(fileFollower.addOutputDestination(outputDestination));
		}
		
		/**
		* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
		* This test case checks if the method returns false when the output destination is null.
		*/
		@Test
		public void testAddOutputDestination_8() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				};
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertFalse(fileFollower.addOutputDestination(null));
		}
		
		/**
		* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
		* This test case checks if the method returns false when the output destination is null.
		*/
		@Test
		public void testAddOutputDestination_9() {
				FileFollower fileFollower = new FileFollower();
				OutputDestination outputDestination = new OutputDestination() {
						@Override
						public void write(String string) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				};
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertTrue(fileFollower.addOutputDestination(outputDestination));
				assertFalse(fileFollower.addOutputDestination(null));
				assertTrue(fileFollower.addOutputDestination(outputDestination));
		}
		
		/**
		*