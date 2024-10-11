// Here's an example of how you can write unit tests for the Battleplayer class:

@Test
void testNumberOfRoundsWithEmptyPlan() {
    Battleplayer player = new Battleplayer();
    assertEquals(0, player.numberOfRounds());
}

@Test
void testNumberOfRoundsWithOneRoundPlan() {
    Battleplan plan = new Battleplan();
    plan.addRound(new ArrayList<>());
    Battleplayer player = new Battleplayer(plan);
    assertEquals(1, player.numberOfRounds());
}

@Test
void testNumberOfRoundsWithMultipleRoundPlan() {
    Battleplan plan = new Battleplan();
    plan.addRound(new ArrayList<>());
    plan.addRound(new ArrayList<>());
    plan.addRound(new ArrayList<>());
    Battleplayer player = new Battleplayer(plan);
    assertEquals(3, player.numberOfRounds());
}

@Test
void testNumberOfRoundsWithNullPlan() {
    Battleplayer player = new Battleplayer(null);
    assertEquals(0, player.numberOfRounds());
}

@Test
void testNumberOfRoundsWithPlanContainingNullRound() {
    Battleplan plan = new Battleplan();
    plan.addRound(null);
    Battleplayer player = new Battleplayer(plan);
    assertEquals(0, player.numberOfRounds());
}

@Test
void testNumberOfRoundsWithPlanContainingEmptyRound() {
    Battleplan plan = new Battleplan();
    plan.addRound(new ArrayList<>());
    plan.addRound(new ArrayList<>());
    plan.addRound(new ArrayList<>());
    plan.addRound(new ArrayList<>());
    Battleplayer player = new Battleplayer(plan);
    assertEquals(4, player.numberOfRounds());
}

@Test
void testNumberOfRoundsWithPlanContainingOneCombatant() {
    Battleplan plan = new Battleplan();
    List<Combatant> round = new ArrayList<>();
    round.add(new Combatant("Alice"));
    plan.addRound(round);
    Battleplayer player = new Battleplayer(plan);
    assertEquals(1, player.numberOfRounds());
}

@Test
void testNumberOfRoundsWithPlanContainingMultipleCombatants() {
    Battleplan plan = new Battleplan();
    List<Combatant> round1 = new ArrayList<>();
    round1.add(new Combatant("Alice"));
    round1.add(new Combatant("Bob"));
    List<Combatant> round2 = new ArrayList<>();
    round2.add(new Combatant("Charlie"));
    round2.add(new Combatant("Dave"));
    round2.add(new Combatant("Eve"));
    plan.addRound(round1);
    plan.addRound(round2);
    Battleplayer player = new Battleplayer(plan);
    assertEquals(2, player.numberOfRounds());
}

@Test
void testNumberOfRoundsWithPlanContainingDuplicateCombatants() {
    Battleplan plan = new Battleplan();
    List<Combatant> round1 = new ArrayList<>();
    round1.add(new Combatant("Alice"));
    round1.add(new Combatant("Bob"));
    List<Combatant> round2 = new ArrayList<>();
    round2.add(new Combatant("Charlie"));
    round2.add(new Combatant("Bob"));
    round2.add(new Combatant("Eve"));
    plan.addRound(round1);
    plan.addRound(round2);
    Battleplayer player = new Battleplayer(plan);
    assertEquals(2, player.numberOfRounds());
}

@Test
void testNumberOfRoundsWithPlanContainingEmptyRounds() {
    Battleplan plan = new Battleplan();
    plan.addRound(new ArrayList<>());
    plan.addRound(new ArrayList<>());
    plan.addRound(new ArrayList<>());
    plan.addRound(new ArrayList<>());
    plan.addRound(new ArrayList<>());
    Battleplayer player = new Battleplayer(plan);
    assertEquals(0, player.numberOfRounds());
}