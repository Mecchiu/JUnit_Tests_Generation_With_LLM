// PlayerConfiguration_2Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains one unit test case for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {
		
    @Test
    void showShootlineTest() {
        Configuration configuration = new Configuration("main");
        PlayerConfiguration playersTestValue = new PlayerConfiguration();
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        PlayerConfiguration expectedExpected = new PlayerConfiguration();
        expectedExpected.setShoot(true);
        expectedExpected.setShootline(true);
        playersTestValue = (PlayerConfiguration) expectedExpected.clone();
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue = (PlayerConfiguration) expectedExpected.clone();
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue = (PlayerConfiguration) expectedExpected.clone();
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootline(true);
        playersTestValue = (PlayerConfiguration) expectedExpected.clone();
        playersTestValue.setShoot(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShootLine(true);
        playersTestValue.setShoot(true);
        playersTestValue.setShootLine(true);
	Set<PlayerConfiguration> setShootLines = new HashSet<>();
	Set<PlayerConfiguration> setShoot = new HashSet<>();
	configuration.getShootLines().iterator().forEachRemaining(playersTestValue::addShootLine);
        playersTestValue.getShootLines().remove();
        playersTestValue.getShootLines().clear();
        playersTestValue.setShoot(false);
        playersTestValue.addShoot(playersTestValue);
        playersTestValue.addShoot(playersTestValue);
        playersTestValue.addShoot(playersTestValue);
	playersTestValue.setShoot(setShootLines);
	playersTestValue.setShoot(setShoot);
        playersTestValue.addShoot(playersTestValue);
        playersTestValue.addShoot(playersTestValue);
	playersTestValue.setShoot(setShootLines);
	playersTestValue.setShoot(setShoot);
        playersTestValue.addShoot(playersTestValue);
        playersTestValue.addShoot(playersTestValue);
	playersTestValue.setShoot(setShootLines);
	playersTestValue.setShoot(setShoot);

        playersTestValue.setShootLine(playersTestValue.getShootLine());
        playersTestValue.setShootLine(playersTestValue.getShootLine());
        playersTestValue.setShoots(setShootLines);
        playersTestValue.setShoots(setShootLines);

        playersTestValue.setShootLine2("");
        playersTestValue.setShots(setShorts);
        playersTestValue.setShots(setShorts);


	Set<String> setShadows = new HashSet<>();
	Set<String> setShadows2 = new HashSet<>();
	setShadows2.add(playersTestValue.getShadows().iterator().next().toString());
	playersTestValue.setShadows(setShadows);

	playersTestValue.setShadows(setShadows2);



	playersTestValue.getShadows().keySet().forEachRemaining(playersTestValue::addShadowLine);
	playersTestValue.getShadows().keySet().forEachRemaining(playersTestValue::addShadowLine2);


	StringBuffer shadowLine = new StringBuffer();

	playersTestValue.getShadows().keySet().forEachRemaining(playersTestValue::addShadows);
	playersTestValue.getShadows().keySet().forEachRemaining(playersTestValue::addShadows2);

	playersTestValue.getShadows().keySet().forEachRemaining(playersTestValue::addShadows);

	playersTestValue.setShared(playersTestValue.getShuffleMode());
	playersTestValue.getSharedLines().forEachRemaining(playersTestValue::getSharedLine);
	playersTestValue.getSharedLines().remove();

        playersTestValue.getSharedLines().iterator().forEachRemaining(playersTestValue::addSharedLine);

	playersTestValue.computeSharedMode();
	checkShuffledState(playersTestValue);

	if(null == configuration.getShuffleMode())
	{
		playersTestValue.setShuffled(true);
	}
	else
	{
		playersTestValue.setShuffled(false);
		playersTestValue.setShuffledLine(playersTestValue.getShuffleMode());

	}
        playersTestValue = (PlayerConfiguration) playersTestValue.clone();
        playersTestValue.setShuffled(configuration.getShuffleMode().getValue());
        playersTestValue.setShuffledLine(playersTestValue.getShuffledLine());

	playersTestValue.computeSharableMode();
	checkSharableState(playersTestValue);

        playersTestValue.setShared(playersTestValue.getSharedMode());
}
}