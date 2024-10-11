// PlayerConfiguration_0Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_0Test {

	private PlayerConfiguration _config;
	private Set _configuredTournaments = new HashSet<>();

	@Test
    void init() {
        final Lock _configLock = new ReentrantLock();
        _configLock.lock();
        try {
            final Set<String> allowedTournaments = new HashSet<>();
            final Set<Integer> tournaments = new HashSet<>();
            for (int i = 0; i <= PlayerConfiguration.MAX_TOURNAMENT; i++) {
                allowedTournaments.add("Tournament " + i);
                _configuredTournaments.add(GameTournament.makeDefault(i));
                tournaments.add(i);
            }
            
            final Configuration configuration = new Configuration();
            configuration.setupForPlay(Player.NOPTS, allowedTournaments);
            configuration.setupForPlay(Player.NOPTS2, allowedTournaments);
            configuration.setupForPlay(Player.NOPTS3, allowedTournaments);
            configuration.setupForPlay(Player.NOPTS4, allowedTournaments);
            configuration.setupForPlay(Player.NOPTS5, allowedTournaments);
            configuration.setupForPlay(Player.NOPTS6, allowedTournaments);
            configuration.setupForPlay(Player.NOPTS7, allowedTournaments);
            configuration.setupForPlay(Player.NOPTS8, allowedTournaments);

            final Set<Integer> tournaments = new HashSet<>();
            tournaments.add(2);
            configuration.setupForTournament(frenchTournament("tournament2"));
            configuration.setupForTournament(frenchTournament("tournament3"));

            _config = new PlayerConfiguration(configuration);
        } finally {
            _configLock.unlock();
        }
    }

	@Test
    void setupTest() {
		
		final Lock _configLock = new ReentrantLock();
		_configLock.lock();
		try {
        
            final Set<String> allowedTournaments = new HashSet<>();
            final Set<Integer> tournaments = new HashSet<>();
            for (int i = 0; i <= PlayerConfiguration.MAX_TOURNAMENT; i++) {
                allowedTournaments.add("Tournament " + i);
                tournaments.add(i);
            }
            
            final Configuration configuration = new Configuration();
            final Set<Integer> tournaments = new HashSet<>();
            final Set<Integer> tournaments1 = new HashSet<>();
            tournaments = new HashSet<>();
            for (int i = 0; i <= PlayerConfiguration.MAX_TOURNAMENT; i++) {
                tournaments.add(i);

                if (i == PlayerConfiguration.NOPTS) {
                    tournaments1.addAll(tournaments);
                } else {
                    tournaments1.add(tournamentForSetup(i));
                }

                configuration.setupForTournament(frenchTournament("tournament" + i));
            }

            configuration.setupForTournament('0');
            configuration.setupForTournament(frenchTournament("0"));
            configuration.setupForTournament(frenchTournament("1"));
            configuration.setupForPlay(Player.NOPTS2, allowedTournaments);

            final Set<Integer> tournaments2 = new HashSet<>();
            for (int i = 2; i <= UserConfiguration.MAX_TOURNAMENT; i++) {
                tournaments2.add(i);
                final Integer tournament = i;
                tournaments2.add(tournament);
                configuration.setupForTournament(frenchTournament("tournament" + i));
            }

            configuration.setupForTournament('1');

            _config = new PlayerConfiguration(configuration);
            
        } finally {
            _configLock.unlock();
        }
        
    }

    /*
     * @param tournament0
     * @return
     */
    private Tournament tournamentForSetup(Integer tournament0) {
        return new Tournament(_config.tournaments.get(tournament0), _config.allowedTournaments.get(tournament0));
    }

    /*
     * @return
     */
    private int tournament0ForSetup() {
        final ThreadLocal<Integer> tlttt = new ThreadLocal<Integer>();
        tlttt.set(tournamentForSetup(tlttt.get() + 1));

        assertSame(PlayerConfiguration.NOPTS, _config.tournaments.get(tlttt.get()));
        assertEquals(PlayerConfiguration.NOPTS, _config.tournaments.get(tlttt.get() + 1));
        
        assertSame(PlayerConfiguration.NOPTS2, tlttt.get());
        assertEquals(PlayerConfiguration.NOPTS2, tlttt.get() + 1);
        
        assertSame(PlayerConfiguration.NOPTS3, tlttt.get());
        assertEquals(PlayerConfiguration.NOPTS3, tlttt.get() + 1);
        
        assertSame(PlayerConfiguration.NOPTS4, tlttt.get());
        assertEquals(PlayerConfiguration.NOPTS4, tlttt.get() + 1);

    	return tlttt.get();
    }

    /**
     * This method is called by the JUnit framework during
     * the setup test. Its purpose is to set the private parameters.
     * @param tournament0
     * @param tournaments1
     *
     */
    public void setTournamentForSetup(Integer tournament0, int tournaments1) {
        _config.tournaments.set(tournamentForSetup(tournament0), tournaments1);
    }
    

    private HashSet<String> allowedTournaments = new HashSet<>();
    private static final String frenchTournament = "French_tourney";
    
    private int frenchTournament(String tournamentId) {
        final Tournament tournament = getForthTournament(frenchTournament);
        return tournament.allowedTournaments.contains(tournamentId)? tournamentId : UserConfiguration.MAX_TOURNAMENT;
    }

    private Tournament getForthTournament(String tournamentName) {
        final int iTournament = tournament1ForSetup();
        final int iName = UserConfiguration.getTournamentByName(frenchTournament);
        assertEquals("Tournament does not exist", iName, UserConfiguration.getTournament(frenchTournament).tournamentId);
        assertSame(PlayerConfiguration.NOPTS, Tournament.makeDefault(iTournament));
        
        return new Tournament(iTournament, _config.tournaments.remove(Integer.valueOf(iName)));
    }

    private int tournament1ForSetup() {
        final Lock _configLock = new ReentrantLock();
        _configLock.lock();
        try {
        
            int iTournament = UserConfiguration.getTournamentByName(frenchTournament);
            
            if (_config.tournaments.isEmpty()) {
                Configuration configuration = new Configuration();
                for (int g : _config.guarantements) {
                    configuration.setupForPlay(g, Player.NOPTS);
                }
                configuration.setupForPlay