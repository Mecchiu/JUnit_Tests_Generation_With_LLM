@Test
void testEmptyEventSet() {
    EventSet eventSet = new EventSet();
    assertEquals(0, eventSet.size());
}

@Test
void testEventSetWithOneEvent() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    assertEquals(1, eventSet.size());
}

@Test
void testEventSetWithMultipleEvents() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    eventSet.add(new Event("Event 2"));
    eventSet.add(new Event("Event 3"));
    assertEquals(3, eventSet.size());
}

@Test
void testEventSetWithDuplicateEvents() {
    EventSet eventSet = new EventSet();
    Event event1 = new Event("Event 1");
    eventSet.add(event1);
    eventSet.add(event1);
    assertEquals(2, eventSet.size());
}

@Test
void testEventSetWithNullEvent() {
    EventSet eventSet = new EventSet();
    eventSet.add(null);
    assertEquals(1, eventSet.size());
}

@Test
void testEventSetWithEmptyEventName() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event(""));
    assertEquals(1, eventSet.size());
}

@Test
void testEventSetWithWhitespaceEventName() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("   "));
    assertEquals(1, eventSet.size());
}

@Test
void testEventSetWithMixedEventNames() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    eventSet.add(new Event(""));
    eventSet.add(new Event("   "));
    eventSet.add(new Event("Event 2"));
    assertEquals(2, eventSet.size());
}

@Test
void testEventSetWithLargeNumberOfEvents() {
    EventSet eventSet = new EventSet();
    for (int i = 0; i < 1000000; i++) {
        eventSet.add(new Event("Event " + i));
    }
    assertEquals(1000000, eventSet.size());
}

@Test
void testEventSetWithConcurrentModification() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    eventSet.add(new Event("Event 2"));
    for (Event event : eventSet) {
        eventSet.add(new Event("Event 3"));
    }
    assertEquals(2, eventSet.size());
}
}