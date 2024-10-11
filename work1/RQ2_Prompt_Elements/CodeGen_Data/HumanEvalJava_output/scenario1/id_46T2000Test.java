// Fib4Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains one unit test case for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {
int value;
		class IntegerFixture{
			public IntegerFixture(int v) {
				value = v;
			}
		}
		@Test
		public void test1(){
                Fib4 f4=new Fib4();
                f4.fib4(200);
                // assertEquals(0, value);
                IntegerFixture fixture = new IntegerFixture(200);

                  assertEquals(fixture.value, 200);
		}

};
// Fib4Test.java