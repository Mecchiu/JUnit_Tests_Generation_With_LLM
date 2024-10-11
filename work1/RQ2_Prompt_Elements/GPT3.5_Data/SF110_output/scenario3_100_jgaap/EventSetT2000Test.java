@Test
void testEmptySet() {
    EventSet eventSet = new EventSet();
    assertEquals(0, eventSet.size());
}

@Test
void testSingleEvent() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    assertEquals(1, eventSet.size());
}

@Test
void testMultipleEvents() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    eventSet.add(new Event("Event 2"));
    eventSet.add(new Event("Event 3"));
    assertEquals(3, eventSet.size());
}

@Test
void testDuplicateEvents() {
    EventSet eventSet = new EventSet();
    Event event1 = new Event("Event 1");
    eventSet.add(event1);
    eventSet.add(event1);
    assertEquals(1, eventSet.size());
}

@Test
void testNullEvent() {
    EventSet eventSet = new EventSet();
    eventSet.add(null);
    assertEquals(0, eventSet.size());
}

@Test
void testAddAndRemoveEvent() {
    EventSet eventSet = new EventSet();
    Event event1 = new Event("Event 1");
    eventSet.add(event1);
    eventSet.remove(event1);
    assertEquals(0, eventSet.size());
}

@Test
void testRemoveNonExistingEvent() {
    EventSet eventSet = new EventSet();
    Event event1 = new Event("Event 1");
    eventSet.add(event1);
    eventSet.remove(new Event("Event 2"));
    assertEquals(1, eventSet.size());
}

@Test
void testAddAllEvents() {
    EventSet eventSet = new EventSet();
    List<Event> events = new Vector<>();
    events.add(new Event("Event 1"));
    events.add(new Event("Event 2"));
    events.add(new Event("Event 3"));
    eventSet.addAll(events);
    assertEquals(3, eventSet.size());
}

@Test
void testClearEvents() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    eventSet.add(new Event("Event 2"));
    eventSet.clear();
    assertEquals(0, eventSet.size());
}

@Test
void testContainsEvent() {
    EventSet eventSet = new EventSet();
    Event event1 = new Event("Event 1");
    eventSet.add(event1);
    assertTrue(eventSet.contains(event1));
} 
}