// PlayerConfiguration_2Test.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {

		/**
		 * Test case for {@link PlayerConfiguration#showShootline()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowShootline() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowShootline(true);
				// when
				final boolean result = config.showShootline();
				// then
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showShootline()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowShootline2() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowShootline(false);
				// when
				final boolean result = config.showShootline();
				// then
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showShootline()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowShootline3() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowShootline(true);
				// when
				final boolean result = config.showShootline();
				// then
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showShootline()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowShootline4() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowShootline(false);
				// when
				final boolean result = config.showShootline();
				// then
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showShootline()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowShootline5() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowShootline(true);
				// when
				final boolean result = config.showShootline();
				// then
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showShootline()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowShootline6() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowShootline(false);
				// when
				final boolean result = config.showShootline();
				// then
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showShootline()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowShootline7() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowShootline(true);
				// when
				final boolean result = config.showShootline();
				// then
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showShootline()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowShootline8() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowShootline(false);
				// when
				final boolean result = config.showShootline();
				// then
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showShootline()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowShootline9() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowShootline(true);
				// when
				final boolean result = config.showShootline();
				// then
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showShootline()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowShootline10() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowShootline(false);
				// when
				final boolean result = config.showShootline();
				// then
				assertFalse(result);
		}
		
}

// PlayerConfiguration_3Test.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#showMoveTargets()} method.
*/
class PlayerConfiguration_3Test {
		
		/**
		 * Test case for {@link PlayerConfiguration#showMoveTargets()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowMoveTargets() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowMoveTargets(true);
				// when
				final boolean result = config.showMoveTargets();
				// then
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showMoveTargets()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowMoveTargets2() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowMoveTargets(false);
				// when
				final boolean result = config.showMoveTargets();
				// then
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showMoveTargets()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowMoveTargets3() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowMoveTargets(true);
				// when
				final boolean result = config.showMoveTargets();
				// then
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showMoveTargets()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowMoveTargets4() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowMoveTargets(false);
				// when
				final boolean result = config.showMoveTargets();
				// then
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showMoveTargets()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowMoveTargets5() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowMoveTargets(true);
				// when
				final boolean result = config.showMoveTargets();
				// then
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showMoveTargets()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowMoveTargets6() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowMoveTargets(false);
				// when
				final boolean result = config.showMoveTargets();
				// then
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showMoveTargets()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowMoveTargets7() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowMoveTargets(true);
				// when
				final boolean result = config.showMoveTargets();
				// then
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showMoveTargets()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowMoveTargets8() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowMoveTargets(false);
				// when
				final boolean result = config.showMoveTargets();
				// then
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showMoveTargets()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowMoveTargets9() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowMoveTargets(true);
				// when
				final boolean result = config.showMoveTargets();
				// then
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link PlayerConfiguration#showMoveTargets()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testShowMoveTargets10() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setShowMoveTargets(false);
				// when
				final boolean result = config.showMoveTargets();
				// then
				assertFalse(result);
		}
		
}

// PlayerConfiguration_4Test.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#isPaused()} method.
*/
class PlayerConfiguration_4Test {
		
		/**
		 * Test case for {@link PlayerConfiguration#isPaused()}
		 * 
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testIsPaused() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setState(PlayerState.PAUSE);
				// when
				final boolean result = config.isPaused();
				// then
				assert