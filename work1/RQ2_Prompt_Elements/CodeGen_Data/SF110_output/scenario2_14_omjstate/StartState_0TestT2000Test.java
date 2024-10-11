// StartState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains one unit test case for the {@link StartState#getSingleton()} method.
*/
class StartState_0Test {
private static final StartState SINGLETON = new StartState();

        /**
         * Test method for {@link StartState#getSingleton()}.
         * @throws java.lang.AssertionFailedException
         *             when an error occurs in before method in class {@link StartState}.
         */
		@Test
		public void testGetSingleton() throws AssertionFailedException {
			assertFalse(SINGLETON.equals(null));
			assertFalse(SINGLETON.equals(new Object()));
			assertFalse(SINGLETON.equals(SINGLETON));
			assertFalse(SINGLETON.equals(SINGLETON("a")));
			assertTrue(SINGLETON.equals(SINGLETON("a", new String[]{"a"}, "a")));
			assertFalse(SINGLETON.equals(SINGLETON("this")));
			assertFalse(SINGLETON.equals(SINGLETON("a", "a")));
			assertFalse(SINGLETON.equals(SINGLETON("something")));
			assertFalse(SINGLETON.equals(SINGLETON("a", null)));
		}

		/**
         * Test method for {@link StartState#hashCode()}.
         * @throws java.lang.AssertionFailedException
         *             when an error occurs in hashCode on any of the parameter types.
         */
		@Test
        public void testHashCode() throws AssertionFailedException{
			assertEquals(SINGLETON.hashCode(), SINGLETON.hashCode());
		}

		/**
         * Test method for {@link StartState#toString()}.
         * @throws java.lang.AssertionFailedException
         *             when an error occurs in toString on any of the parameter types.
         */
        public void testToString() throws AssertionFailedException {
            assertEquals(new StartState().toString(), new StartState().toString());
        }

        /**
         * Test method for {@link StartState#equals(java.lang.Object)}.
         */
		@Test
        public void testEqualsObject() {
            assertTrue(SINGLETON.equals(new Object()));
            assertFalse(new StartState().equals(new Object()));
        }

        /**
         * Test method for {@link StartState#hashCode()}.
         */
        public void testHashCode() {
			assertEquals(SINGLETON.hashCode(), SINGLETON.hashCode());
		}

        /**
         * Test method for {@link StartState#toString()}.
         */
        public void testToString() {
            assertEquals("Start " + SINGLETON, new StartState().toString());
        }

        /**
         * Test method for {@link StartState#createState()}.
         * Creation date: (12/02/01 8:20:28 PM)
         * @throws java.lang.AssertionFailedException
         *             when an error occurs in createState method in class {@link StartState}.
         */
        @Test
		public void testCreateState() throws AssertionFailedException{
			assertNotNull(new StartState("").createState());
		}

        /**
         * Test method for {@link StartState#createState(java.lang.String[], java.lang.String[])}.
         * Creation date: (11/20/01 09:23:58 PM)
         * @throws java.lang.AssertionFailedException
         *             when an error occurs in createState method in class {@link StartState}.
         */
        @Test
        public void testCreateState() throws AssertionFailedException {
			System.out.println(new StartState("a", null).createState(null));
			assertNotNull(new StartState("a", null).createState(null));
		}

	}

// SINGLETON_0Test.java 
