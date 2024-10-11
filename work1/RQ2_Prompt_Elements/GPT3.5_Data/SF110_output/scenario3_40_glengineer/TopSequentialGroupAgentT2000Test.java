// Test case 1: Test if the method returns a SequentialGroup object
@Test
void testGroupContentReturnsSequentialGroup() {
    TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
    SequentialGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
        @Override
        public SequentialGroup createSequentialGroup() {
            return new SequentialGroup();
        }

        @Override
        public void addElementToGroup(SequentialGroup group, Object element) {
            // Do nothing
        }
    });
    assertTrue(group instanceof SequentialGroup);
}

// Test case 2: Test if the method returns a non-null object
@Test
void testGroupContentReturnsNonNull() {
    TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
    SequentialGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
        @Override
        public SequentialGroup createSequentialGroup() {
            return new SequentialGroup();
        }

        @Override
        public void addElementToGroup(SequentialGroup group, Object element) {
            // Do nothing
        }
    });
    assertNotNull(group);
}

// Test case 3: Test if the method creates a SequentialGroup object
@Test
void testGroupContentCreatesSequentialGroup() {
    TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
    SequentialGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
        @Override
        public SequentialGroup createSequentialGroup() {
            return new SequentialGroup();
        }

        @Override
        public void addElementToGroup(SequentialGroup group, Object element) {
            // Do nothing
        }
    });
    assertNotNull(group);
}

// Test case 4: Test if the method adds elements to the SequentialGroup object
@Test
void testGroupContentAddsElementsToGroup() {
    TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
    SequentialGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
        @Override
        public SequentialGroup createSequentialGroup() {
            return new SequentialGroup();
        }

        @Override
        public void addElementToGroup(SequentialGroup group, Object element) {
            group.addComponent(new Object());
        }
    });
    assertEquals(1, group.getComponentCount());
}

// Test case 5: Test if the method adds multiple elements to the SequentialGroup object
@Test
void testGroupContentAddsMultipleElementsToGroup() {
    TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
    SequentialGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
        @Override
        public SequentialGroup createSequentialGroup() {
            return new SequentialGroup();
        }

        @Override
        public void addElementToGroup(SequentialGroup group, Object element) {
            group.addComponent(new Object());
            group.addComponent(new Object());
        }
    });
    assertEquals(2, group.getComponentCount());
}

// Test case 6: Test if the method adds elements of different types to the SequentialGroup object
@Test
void testGroupContentAddsElementsOfDifferentTypesToGroup() {
    TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
    SequentialGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
        @Override
        public SequentialGroup createSequentialGroup() {
            return new SequentialGroup();
        }

        @Override
        public void addElementToGroup(SequentialGroup group, Object element) {
            group.addComponent(new Object());
            group.addGap(10);
        }
    });
    assertEquals(2, group.getComponentCount());
}

// Test case 7: Test if the method adds elements in the correct order to the SequentialGroup object
@Test
void testGroupContentAddsElementsInCorrectOrderToGroup() {
    TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
    SequentialGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
        @Override
        public SequentialGroup createSequentialGroup() {
            return new SequentialGroup();
        }

        @Override
        public void addElementToGroup(SequentialGroup group, Object element) {
            group.addComponent(new Object());
            group.addGap(10);
        }
    });
    assertEquals(10, group.getGap());
}

// Test case 8: Test if the method throws an exception when the GroupCreatorAndElementAdder parameter is null
@Test
void testGroupContentThrowsExceptionWhenParameterIsNull() {
    TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
    assertThrows(IllegalArgumentException.class, () -> {
        agent.groupContent(null);
    });
}

// Test case 9: Test if the method throws an exception when the GroupCreatorAndElementAdder parameter returns a null SequentialGroup object
@Test
void testGroupContentThrowsExceptionWhenCreateSequentialGroupReturnsNull() {
    TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
    assertThrows(IllegalArgumentException.class, () -> {
        agent.groupContent(new GroupCreatorAndElementAdder() {
            @Override
            public SequentialGroup createSequentialGroup() {
                return null;
            }

            @Override
            public void addElementToGroup(SequentialGroup group, Object element) {
                // Do nothing
            }
        });
    });
}

// Test case 10: Test if the method throws an exception when the GroupCreatorAndElementAdder parameter adds a null element to the SequentialGroup object
@Test
void testGroupContentThrowsExceptionWhenAddElementToGroupAddsNull() {
    TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
    assertThrows(IllegalArgumentException.class, () -> {
        agent.groupContent(new GroupCreatorAndElementAdder() {
            @Override
            public SequentialGroup createSequentialGroup() {
                return new SequentialGroup();
            }

            @Override
            public void addElementToGroup(SequentialGroup group, Object element) {
                group.addComponent(null);
            }
        });
    });
}