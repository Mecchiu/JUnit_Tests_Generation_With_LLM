@Test
void testEmptyEventSetSize() {
    EventSet eventSet = new EventSet();
    assertEquals(0, eventSet.size());
}

@Test
void testEventSetSizeWithOneEvent() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    assertEquals(1, eventSet.size());
}

@Test
void testEventSetSizeWithMultipleEvents() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    eventSet.add(new Event("Event 2"));
    eventSet.add(new Event("Event 3"));
    assertEquals(3, eventSet.size());
}

@Test
void testEventSetSizeAfterRemovingEvent() {
    EventSet eventSet = new EventSet();
    Event event1 = new Event("Event 1");
    eventSet.add(event1);
    eventSet.add(new Event("Event 2"));
    eventSet.add(new Event("Event 3"));
    eventSet.remove(event1);
    assertEquals(2, eventSet.size());
}

@Test
void testEventSetSizeAfterClearing() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    eventSet.add(new Event("Event 2"));
    eventSet.add(new Event("Event 3"));
    eventSet.clear();
    assertEquals(0, eventSet.size());
}

@Test
void testEventSetSizeWithNullEvent() {
    EventSet eventSet = new EventSet();
    eventSet.add(null);
    assertEquals(1, eventSet.size());
}

@Test
void testEventSetSizeWithDuplicateEvents() {
    EventSet eventSet = new EventSet();
    Event event1 = new Event("Event 1");
    eventSet.add(event1);
    eventSet.add(event1);
    assertEquals(2, eventSet.size());
}

@Test
void testEventSetSizeWithDifferentTypesOfEvents() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    eventSet.add(new Meeting("Meeting 1"));
    eventSet.add(new Task("Task 1"));
    assertEquals(3, eventSet.size());
}

@Test
void testEventSetSizeWithEmptyEvents() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event(""));
    eventSet.add(new Meeting(""));
    eventSet.add(new Task(""));
    assertEquals(3, eventSet.size());
}

@Test
void testEventSetSizeWithEventsWithSameName() {
    EventSet eventSet = new EventSet();
    eventSet.add(new Event("Event 1"));
    eventSet.add(new Meeting("Event 1"));
    eventSet.add(new Task("Event 1"));
    assertEquals(3, eventSet.size());
}
}