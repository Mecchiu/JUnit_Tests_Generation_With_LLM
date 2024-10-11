// InternalGmHeroFrameTest.java
package dsachat.gm.gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link InternalGmHeroFrame}.
 * It contains ten unit test cases for the {@link InternalGmHeroFrame#silent()} method.
 */
class InternalGmHeroFrameTest {

    /**
     * Test case for the {@link InternalGmHeroFrame#silent()} method.
     * It should return false for a game master.
     */
    @Test
    void testSilentForGameMaster() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame();
        assertFalse(frame.silent());
    }

    /**
     * Test case for the {@link InternalGmHeroFrame#silent()} method.
     * It should return true for a non-game master.
     */
    @Test
    void testSilentForNonGameMaster() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame();
        // set the frame to non-game master mode
        // by setting the hero to null
        frame.hero = null;
        assertTrue(frame.silent());
    }

    /**
     * Test case for the {@link InternalGmHeroFrame#silent()} method.
     * It should return true for a hero with silent mode enabled.
     */
    @Test
    void testSilentForHeroWithSilentMode() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame();
        Hero hero = new Hero();
        hero.setSilentMode(true);
        frame.hero = hero;
        assertTrue(frame.silent());
    }

    /**
     * Test case for the {@link InternalGmHeroFrame#silent()} method.
     * It should return false for a hero with silent mode disabled.
     */
    @Test
    void testSilentForHeroWithoutSilentMode() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame();
        Hero hero = new Hero();
        hero.setSilentMode(false);
        frame.hero = hero;
        assertFalse(frame.silent());
    }

    /**
     * Test case for the {@link InternalGmHeroFrame#silent()} method.
     * It should return true for an enemy with silent mode enabled.
     */
    @Test
    void testSilentForEnemyWithSilentMode() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame();
        Hero enemy = new Hero();
        enemy.setEnemy(true);
        enemy.setSilentMode(true);
        frame.hero = enemy;
        assertTrue(frame.silent());
    }

    /**
     * Test case for the {@link InternalGmHeroFrame#silent()} method.
     * It should return false for an enemy with silent mode disabled.
     */
    @Test
    void testSilentForEnemyWithoutSilentMode() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame();
        Hero enemy = new Hero();
        enemy.setEnemy(true);
        enemy.setSilentMode(false);
        frame.hero = enemy;
        assertFalse(frame.silent());
    }

    /**
     * Test case for the {@link InternalGmHeroFrame#silent()} method.
     * It should return true for a hero with a weapon in silent mode.
     */
    @Test
    void testSilentForHeroWithWeaponInSilentMode() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame();
        Hero hero = new Hero();
        Weapon weapon = new Weapon();
        weapon.setSilentMode(true);
        hero.setWeapon(weapon);
        frame.hero = hero;
        assertTrue(frame.silent());
    }

    /**
     * Test case for the {@link InternalGmHeroFrame#silent()} method.
     * It should return false for a hero with a weapon without silent mode.
     */
    @Test
    void testSilentForHeroWithWeaponWithoutSilentMode() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame();
        Hero hero = new Hero();
        Weapon weapon = new Weapon();
        weapon.setSilentMode(false);
        hero.setWeapon(weapon);
        frame.hero = hero;
        assertFalse(frame.silent());
    }

    /**
     * Test case for the {@link InternalGmHeroFrame#silent()} method.
     * It should return true for an enemy with a weapon in silent mode.
     */
    @Test
    void testSilentForEnemyWithWeaponInSilentMode() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame();
        Hero enemy = new Hero();
        enemy.setEnemy(true);
        Weapon weapon = new Weapon();
        weapon.setSilentMode(true);
        enemy.setWeapon(weapon);
        frame.hero = enemy;
        assertTrue(frame.silent());
    }

    /**
     * Test case for the {@link InternalGmHeroFrame#silent()} method.
     * It should return false for an enemy with a weapon without silent mode.
     */
    @Test
    void testSilentForEnemyWithWeaponWithoutSilentMode() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame();
        Hero enemy = new Hero();
        enemy.setEnemy(true);
        Weapon weapon = new Weapon();
        weapon.setSilentMode(false);
        enemy.setWeapon(weapon);
        frame.hero = enemy;
        assertFalse(frame.silent());
    }
}