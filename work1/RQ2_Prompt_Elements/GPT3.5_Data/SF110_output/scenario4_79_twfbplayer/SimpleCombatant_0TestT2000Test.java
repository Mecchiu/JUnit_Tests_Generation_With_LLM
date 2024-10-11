// SimpleCombatant.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;

/**
 * A Combatant with basic attributes (position, health)
 *
 * @author daniel
 */
public class SimpleCombatant implements Combatant {

    private static final transient Logger LOG = Logger.getLogger(SimpleCombatant.class.getName());

    private final int maxHealth;

    private final CombatantSide side;

    private final String name;

    private final String city;

    private final Set<CombatantObserver> observers = new HashSet<CombatantObserver>();

    private final Object stateChangeLock = new Object();

    private final CharacterClass charClass;

    private final Weapon weapon;

    private CombatantState state;

    private Combatant aimingAt = null;

    /**
     * Create a new {@link Combatant} at the given position and the given amount
     * of health.
     *
     * @param side
     *            not null
     * @param initialState
     *            not null
     * @param maxHealth
     *            > 0
     * @param name
     *            the name of the player of this Combatant
     * @param characterClass
     *            maybe null for old logs
     * @param weapon
     *            not null
     * @param city
     *            not null
     */
    public SimpleCombatant(final CombatantSide side, final CombatantState initialState, final int maxHealth, final String name, final CharacterClass characterClass, final Weapon weapon, final String city) {
        this.side = side;
        this.state = initialState;
        this.maxHealth = maxHealth;
        this.name = name;
        this.charClass = characterClass;
        this.weapon = weapon;
        this.city = city;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SimpleCombatant [maxHealth=" + maxHealth + ", side=" + side + ", name=" + name + ", city=" + city + ", charClass=" + charClass + ", weapon=" + weapon + ", state=" + state + ", aimingAt=" + aimingAt + "]";
    }

    /**
     * @see de.outstare.fortbattleplayer.model.Combatant#getName()
     */
    public String getName() {
        return name;
    }

    /**
     * @see de.outstare.fortbattleplayer.model.Combatant#getWeapon()
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * internal method for graphical display
     *
     * @return the maximal health
     */
    public int _getMaxLP() {
        return maxHealth;
    }

    /**
     * internal method for graphical display
     *
     * @return the current health
     */
    public int _getCurrentLP() {
        return _health();
    }

    /**
     * @see de.outstare.fortbattleplayer.model.Combatant#move(de.outstare.fortbattleplayer.model.Area)
     */
    public void move(final Area target) {
        synchronized (stateChangeLock) {
            if (state == CombatantState.DEAD) {
                LOG.warning("Cannot move while dead");
                return;
            }
            if (state == CombatantState.AIMING) {
                LOG.warning("Cannot move while aiming");
                return;
            }
            if (state == CombatantState.RELOADING) {
                LOG.warning("Cannot move while reloading");
                return;
            }
            if (state == CombatantState.MOVING) {
                LOG.warning("Already moving");
                return;
            }
            state = CombatantState.MOVING;
            fireHasMoved();
        }
    }

    /**
     * @see de.outstare.fortbattleplayer.model.Combatant#shoot(de.outstare.fortbattleplayer.model.Area)
     */
    public void shoot(final int power) {
        synchronized (stateChangeLock) {
            if (state == CombatantState.DEAD) {
                LOG.warning("Cannot shoot while dead");
                return;
            }
            if (state == CombatantState.AIMING) {
                LOG.warning("Already aiming");
                return;
            }
            if (state == CombatantState.RELOADING) {
                LOG.warning("Cannot shoot while reloading");
                return;
            }
            if (state == CombatantState.MOVING) {
                LOG.warning("Cannot shoot while moving");
                return;
            }
            if (aimingAt == null) {
                LOG.warning("No target to shoot at");
                return;
            }
            state = CombatantState.AIMING;
            fireAimingAt();
        }
    }

    /**
     * @see de.outstare.fortbattleplayer.model.Combatant#hit(int)
     */
    public boolean hit(final int damageAmount) {
        synchronized (stateChangeLock) {
            if (state == CombatantState.DEAD) {
                LOG.warning("Cannot hit while dead");
                return false;
            }
            if (state == CombatantState.AIMING) {
                LOG.warning("Cannot hit while aiming");
                return false;
            }
            if (state == CombatantState.RELOADING) {
                LOG.warning("Cannot hit while reloading");
                return false;
            }
            if (state == CombatantState.MOVING) {
                LOG.warning("Cannot hit while moving");
                return false;
            }
            final int healthBefore = _health();
            if (healthBefore <= 0) {
                LOG.warning("Cannot hit while already dead");
                return false;
            }
            final int newHealth = healthBefore - damageAmount;
            if (newHealth <= 0) {
                state = CombatantState.DEAD;
                fireIsDead();
            } else {
                state = CombatantState.ALIVE;
            }
            fireWasHit(damageAmount, healthBefore);
            return true;
        }
    }

    /**
     * @see de.outstare.fortbattleplayer.model.Combatant#aimAt(de.outstare.fortbattleplayer.model.Combatant)
     */
    public void aimAt(final Combatant target) {
        synchronized (stateChangeLock) {
            if (state == CombatantState.DEAD) {
                LOG.warning("Cannot aim while dead");
                return;
            }
            if (state == CombatantState.AIMING) {
                LOG.warning("Already aiming");
                return;
            }
            if (state == CombatantState.RELOADING) {
                LOG.warning("Cannot aim while reloading");
                return;
            }
            if (state == CombatantState.MOVING) {
                LOG.warning("Cannot aim while moving");
                return;
            }
            aimingAt = target;
            fireNewTarget();
        }
    }

    /**
     * @see de.outstare.fortbattleplayer.model.Combatant#setDestination(de.outstare.fortbattleplayer.model.Area)
     */
    public void setDestination(final Area destination) {
        move(destination);
    }

    /**
     * @see de.outstare.fortbattleplayer.model.Combatant#addObserver(de.outstare.fortbattleplayer.model.CombatantObserver)
     */
    public void addObserver(final CombatantObserver observer) {
        observers.add(observer);
    }

    /**
     * @see de.outstare.fortbattleplayer.model.Combatant#removeObserver(de.outstare.fortbattleplayer.model.CombatantObserver)
     */
    public void removeObserver(final CombatantObserver observer) {
        observers.remove(observer);
    }

    /**
     * notify all observers about the current position
     */
    protected void fireHasMoved() {
        for (final CombatantObserver observer : observers) {
            observer.hasMoved(this);
        }
    }

    /**
     * notify all observers about the current position
     *
     * @param swappedWith
     */
    protected void fireHasSwapped(final Combatant swappedWith) {
        for (final CombatantObserver observer : observers) {
            observer.hasSwapped(this, swappedWith);
        }
    }

    /**
     * notify all observers about the current position
     */
    protected void fireNewTarget() {
        for (final CombatantObserver observer : observers) {
            observer.newTarget(this, aimingAt);
        }
    }

    /**
     * notify all observers that I shot at somebody.
     */
    protected void fireAimingAt() {
        for (final CombatantObserver observer : observers) {
            observer.aimingAt(this, aimingAt);
        }
    }

    /**
     * notify all observers about a loss of health
     *
     * @param damage
     *            amount of healthpoints lost
     * @param healthBefore
     *            original health amount before it was decreased by
     *            <code>damage</code>
     */
    protected void fireWasHit(final int damage, final int healthBefore) {
        for (final CombatantObserver observer :