// StartState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains one unit test case for the {@link StartState#toObject()} method.
*/
class StartState_1Test {
		private final int _value0;

		private final int _value1;

		public StartState_1Test (int pValue0, int pValue1) {
				_value0 = pValue0;
				_value1 = pValue1;
		}

		@Test
		public void test(){
				assertEquals(new StartState(_value0,_value1),new StartState(StartState.class));
				assertCompare(_value0,new StartState(_value0), 1);
				assertSubCompare(new StartState(_value0,_value1),new StartState(StartState.class));
				}

		@Test
		void testForEmpty() {
				assertThrows(NullPointerException.class, 
						() -> new StartState(this, 0));
				}

		private static final class StartState {
				private final int value;

                public StartState(IPostOperator pValue) {
                        this._value = pValue.get();
				}

				private int _value;

                public int get() {
                        return _value;
                }

				public void set(int pValue) {
						this._value = pValue;
				}       	
        }
}


// End of file