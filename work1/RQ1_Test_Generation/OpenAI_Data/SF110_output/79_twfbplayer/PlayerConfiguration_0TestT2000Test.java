// PlayerConfiguration_0Test.java
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
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_0Test {

		/**
		 * Test method for {@link PlayerConfiguration#copy()}.
		 * @throws CloneNotSupportedException
		 */
		@Test
		void testCopy() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.ROUND_DELAY = 1;
				config.PLAYER_DELAY = 2;
				config.ACTION_DELAY = 3;
				config.setShowMoveTargets(true);
				config.setShowShootline(true);
				final PlayerConfigurationListener listener = new PlayerConfigurationListener() {
						@Override
						public void changedShowMoveTarget(final boolean show) {
						}

						@Override
						public void changedShowShootingLine(final boolean show) {
						}
				};
				config.addListener(listener);
				// when
				final PlayerConfiguration copy = config.copy();
				// then
				assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
				assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
				assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
				assertEquals(config.showMoveTargets(), copy.showMoveTargets());
				assertEquals(config.showShootline(), copy.showShootline());
				assertEquals(config.listeners.size(), copy.listeners.size());
				assertFalse(config.listeners.contains(listener));
				assertTrue(copy.listeners.contains(listener));
		}
}

// PlayerConfigurationListener.java
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
/**
 * A PlayerConfigurationListener is notified about changes in a
 * PlayerConfiguration.
 *
 * @author daniel
 */
public interface PlayerConfigurationListener {
    /**
     * @param show
     */
    void changedShowMoveTarget(boolean show);

    /**
     * @param show
     */
    void changedShowShootingLine(boolean show);
}

// PlayerState.java
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
/**
 * A PlayerState is used to control the player.
 *
 * @author daniel
 */
public enum PlayerState {
    /**
     * the player is playing
     */
    PLAY,
    /**
     * the player is paused
     */
    PAUSE,
    /**
     * the player is stopped
     */
    STOP
}

// PlayerThread.java
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
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import de.outstare.fortbattleplayer.Battleplayer;

/**
 * A PlayerThread is used to play a game in a separate thread.
 *
 * @author daniel
 */
public class PlayerThread extends Thread {
    private final Battleplayer player;
    private final Lock playLock = new ReentrantLock();

    /**
     * @param player
     */
    public PlayerThread(final Battleplayer player) {
        this.player = player;
    }

    @Override
    public void run() {
        playLock.lock();
        try {
            player.play();
        } finally {
            playLock.unlock();
        }
    }

    /**
     * @return true if the player is playing
     */
    public boolean isPlaying() {
        return player.isPlaying();
    }

    /**
     * @return true if the player is paused
     */
    public boolean isPaused() {
        return player.isPaused();
    }

    /**
     * @return true if the player is stopped
     */
    public boolean isStopped() {
        return player.isStopped();
    }

    /**
     * @return the player
     */
    public Battleplayer getPlayer() {
        return player;
    }

    /**
     * @return true if the player is currently playing
     */
    public boolean isLocked() {
        return playLock.isLocked();
    }
}

// PlayerThread_0Test.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished