// EngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains one unit test case for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {
		@org.junit.Test()
		public void testConstructor(){
			Engine self = new Engine();
			assertEquals(engines[0].getClass().getSimpleName(), self.getTypeDesc().getName());
		}

		@org.junit.Test()
		public void testGetTypeName(){
			Engine self = new Engine();
			assertEquals(engines[0].getTypeName(), self.getTypeDesc().getName());
		}

		@org.junit.Test()
		public void testGetTypeDesc(){
			Engine self = new Engine();
			assertEquals(engines[0].getTypeDesc(), self.getTypeDesc());
		}

		@org.junit.Test()
		public void testRam(){
			Engine self = new Engine();
			assertEquals(engines[0].getRAM(), self.getRam());
		}

		@org.junit.Test()
		public void testCPUSec(){
			Engine self = new Engine();
			assertEquals(engines[0].getCPUSec(), self.getCPUSec());
		}

		@org.junit.Test()
		public void testOS(){
			Engine self = new Engine();
			assertEquals(engines[0].getOS(), self.getOS());
		}

		@org.junit.Test()
		public void testToString(){
			Engine self = new Engine();
			assertEquals(engines[0].toString(), self.toString());
		}

		@org.junit.Test()
		public void testEquals(){
			Engine lhs = new Engine();
			Engine rhs = new Engine();
			assertTrue(lhs.equals(rhs));
			assertTrue(lhs == rhs);
			assertTrue(lhs.equals(lhs));
			assertFalse(lhs.equals(rhs));
			assertFalse(lhs == rhs);
			assertFalse(lhs.equals(null));
			assertFalse(lhs.equals("lala"));
			assertFalse(lhs.equals(1));
			assertFalse(lhs.equals(lhs.toString()));
			assertFalse(lhs.equals("I had a lot of hair"));
		}
}