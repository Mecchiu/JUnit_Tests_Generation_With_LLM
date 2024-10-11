// Here is an example of how you can test the numberOfRounds() method of Battleplayer class.

class BattleplayerTest {

    @Test
    void testNumberOfRoundsWithEmptyPlan() {
        Battleplan plan = new Battleplan(new ArrayList<>());
        Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithOneRound() {
        List<Combatant> combatants = new ArrayList<>();
        combatants.add(new Combatant("A", 100, 10, 5));
        combatants.add(new Combatant("B", 100, 10, 5));
        Round round = new Round(combatants);
        List<Round> rounds = new ArrayList<>();
        rounds.add(round);
        Battleplan plan = new Battleplan(rounds);
        Battleplayer player = new Battleplayer(plan);
        assertEquals(1, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithMultipleRounds() {
        List<Combatant> combatants = new ArrayList<>();
        combatants.add(new Combatant("A", 100, 10, 5));
        combatants.add(new Combatant("B", 100, 10, 5));
        Round round1 = new Round(combatants);
        Round round2 = new Round(combatants);
        Round round3 = new Round(combatants);
        List<Round> rounds = new ArrayList<>();
        rounds.add(round1);
        rounds.add(round2);
        rounds.add(round3);
        Battleplan plan = new Battleplan(rounds);
        Battleplayer player = new Battleplayer(plan);
        assertEquals(3, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithNullPlan() {
        Battleplayer player = new Battleplayer(null);
        assertEquals(0, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithEmptyRounds() {
        List<Round> rounds = new ArrayList<>();
        Battleplan plan = new Battleplan(rounds);
        Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithNullRounds() {
        List<Round> rounds = null;
        Battleplan plan = new Battleplan(rounds);
        Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithEmptyCombatants() {
        List<Combatant> combatants = new ArrayList<>();
        Round round = new Round(combatants);
        List<Round> rounds = new ArrayList<>();
        rounds.add(round);
        Battleplan plan = new Battleplan(rounds);
        Battleplayer player = new Battleplayer(plan);
        assertEquals(1, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithNullCombatants() {
        Round round = new Round(null);
        List<Round> rounds = new ArrayList<>();
        rounds.add(round);
        Battleplan plan = new Battleplan(rounds);
        Battleplayer player = new Battleplayer(plan);
        assertEquals(1, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithMultipleRoundsAndDifferentCombatants() {
        List<Combatant> combatants1 = new ArrayList<>();
        combatants1.add(new Combatant("A", 100, 10, 5));
        combatants1.add(new Combatant("B", 100, 10, 5));
        List<Combatant> combatants2 = new ArrayList<>();
        combatants2.add(new Combatant("C", 100, 10, 5));
        combatants2.add(new Combatant("D", 100, 10, 5));
        Round round1 = new Round(combatants1);
        Round round2 = new Round(combatants2);
        Round round3 = new Round(combatants1);
        List<Round> rounds = new ArrayList<>();
        rounds.add(round1);
        rounds.add(round2);
        rounds.add(round3);
        Battleplan plan = new Battleplan(rounds);
        Battleplayer player = new Battleplayer(plan);
        assertEquals(3, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithMultipleRoundsAndDifferentNumberOfCombatants() {
        List<Combatant> combatants1 = new ArrayList<>();
        combatants1.add(new Combatant("A", 100, 10, 5));
        combatants1.add(new Combatant("B", 100, 10, 5));
        List<Combatant> combatants2 = new ArrayList<>();
        combatants2.add(new Combatant("C", 100, 10, 5));
        Round round1 = new Round(combatants1);
        Round round2 = new Round(combatants2);
        Round round3 = new Round(combatants1);
        List<Round> rounds = new ArrayList<>();
        rounds.add(round1);
        rounds.add(round2);
        rounds.add(round3);
        Battleplan plan = new Battleplan(rounds);
        Battleplayer player = new Battleplayer(plan);
        assertEquals(3, player.numberOfRounds());
    }
}