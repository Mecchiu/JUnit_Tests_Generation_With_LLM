// Test case 1: Test for quantum = 1.0, aLB = 0.0, aUB = 10.0, xA = 0.0, xB = 100.0
@Test
public void testCalcTickMarks1() {
    LinearAxisScale scale = new LinearAxisScale();
    double quantum = 1.0;
    double aLB = 0.0;
    double aUB = 10.0;
    double xA = 0.0;
    double xB = 100.0;
    TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
    assertEquals(11, tickMarks.getNumTickMarks());
    assertEquals(0.0, tickMarks.getTickMarkPosition(0));
    assertEquals(10.0, tickMarks.getTickMarkPosition(10));
}

// Test case 2: Test for quantum = 2.0, aLB = -5.0, aUB = 5.0, xA = 0.0, xB = 100.0
@Test
public void testCalcTickMarks2() {
    LinearAxisScale scale = new LinearAxisScale();
    double quantum = 2.0;
    double aLB = -5.0;
    double aUB = 5.0;
    double xA = 0.0;
    double xB = 100.0;
    TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
    assertEquals(6, tickMarks.getNumTickMarks());
    assertEquals(-4.0, tickMarks.getTickMarkPosition(0));
    assertEquals(4.0, tickMarks.getTickMarkPosition(5));
}

// Test case 3: Test for quantum = 0.5, aLB = -2.0, aUB = 2.0, xA = 0.0, xB = 100.0
@Test
public void testCalcTickMarks3() {
    LinearAxisScale scale = new LinearAxisScale();
    double quantum = 0.5;
    double aLB = -2.0;
    double aUB = 2.0;
    double xA = 0.0;
    double xB = 100.0;
    TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
    assertEquals(9, tickMarks.getNumTickMarks());
    assertEquals(-2.0, tickMarks.getTickMarkPosition(0));
    assertEquals(2.0, tickMarks.getTickMarkPosition(8));
}

// Test case 4: Test for quantum = 1.0, aLB = 0.0, aUB = 0.0, xA = 0.0, xB = 100.0
@Test
public void testCalcTickMarks4() {
    LinearAxisScale scale = new LinearAxisScale();
    double quantum = 1.0;
    double aLB = 0.0;
    double aUB = 0.0;
    double xA = 0.0;
    double xB = 100.0;
    TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
    assertEquals(1, tickMarks.getNumTickMarks());
    assertEquals(0.0, tickMarks.getTickMarkPosition(0));
}

// Test case 5: Test for quantum = 0.1, aLB = -1.0, aUB = 1.0, xA = 0.0, xB = 100.0
@Test
public void testCalcTickMarks5() {
    LinearAxisScale scale = new LinearAxisScale();
    double quantum = 0.1;
    double aLB = -1.0;
    double aUB = 1.0;
    double xA = 0.0;
    double xB = 100.0;
    TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
    assertEquals(21, tickMarks.getNumTickMarks());
    assertEquals(-1.0, tickMarks.getTickMarkPosition(0));
    assertEquals(1.0, tickMarks.getTickMarkPosition(20));
}

// Test case 6: Test for quantum = 0.5, aLB = -1.0, aUB = 1.0, xA = 0.0, xB = 50.0
@Test
public void testCalcTickMarks6() {
    LinearAxisScale scale = new LinearAxisScale();
    double quantum = 0.5;
    double aLB = -1.0;
    double aUB = 1.0;
    double xA = 0.0;
    double xB = 50.0;
    TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
    assertEquals(5, tickMarks.getNumTickMarks());
    assertEquals(-1.0, tickMarks.getTickMarkPosition(0));
    assertEquals(1.0, tickMarks.getTickMarkPosition(4));
}

// Test case 7: Test for quantum = 0.1, aLB = -10.0, aUB = 10.0, xA = 0.0, xB = 100.0
@Test
public void testCalcTickMarks7() {
    LinearAxisScale scale = new LinearAxisScale();
    double quantum = 0.1;
    double aLB = -10.0;
    double aUB = 10.0;
    double xA = 0.0;
    double xB = 100.0;
    TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
    assertEquals(201, tickMarks.getNumTickMarks());
    assertEquals(-10.0, tickMarks.getTickMarkPosition(0));
    assertEquals(10.0, tickMarks.getTickMarkPosition(200));
}

// Test case 8: Test for quantum = 1.0, aLB = -10.0, aUB = 10.0, xA = 0.0, xB = 50.0
@Test
public void testCalcTickMarks8() {
    LinearAxisScale scale = new LinearAxisScale();
    double quantum = 1.0;
    double aLB = -10.0;
    double aUB = 10.0;
    double xA = 0.0;
    double xB = 50.0;
    TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
    assertEquals(21, tickMarks.getNumTickMarks());
    assertEquals(-10.0, tickMarks.getTickMarkPosition(0));
    assertEquals(10.0, tickMarks.getTickMarkPosition(20));
}

// Test case 9: Test for quantum = 0.5, aLB = -10.0, aUB = 10.0, xA = 0.0, xB = 50.0
@Test
public void testCalcTickMarks9() {
    LinearAxisScale scale = new LinearAxisScale();
    double quantum = 0.5;
    double aLB = -10.0;
    double aUB = 10.0;
    double xA = 0.0;
    double xB = 50.0;
    TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
    assertEquals(41, tickMarks.getNumTickMarks());
    assertEquals(-10.0, tickMarks.getTickMarkPosition(0));
    assertEquals(10.0, tickMarks.getTickMarkPosition(40));
}

// Test case 10: Test for quantum = 0.1, aLB = -100.0, aUB = 100.0, xA = 0.0, xB = 100.0
@Test
public void testCalcTickMarks10() {
    LinearAxisScale scale = new LinearAxisScale();
    double quantum = 0.1;
    double aLB = -100.0;
    double aUB = 100.0;
    double xA = 0.0;
    double xB = 100.0;
    TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
    assertEquals(2001, tickMarks.getNumTickMarks());
    assertEquals(-100.0, tickMarks.getTickMarkPosition(0));
    assertEquals(100.0, tickMarks.getTickMarkPosition(2000));
}
}