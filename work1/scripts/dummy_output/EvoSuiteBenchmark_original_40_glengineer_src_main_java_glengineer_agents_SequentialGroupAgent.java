package glengineer.agents;
java
class SequentialGroupAgentTest {

    @Test
    void testGroupContent_emptyChildren() {
        SequentialGroupAgent agent = new SequentialGroupAgent();
        GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
        SequentialGroup result = agent.groupContent(creatorAndAdder);
        assertNotNull(result);
        assertTrue(result instanceof SequentialGroup);
    }

    @Test
    void testGroupContent_singleChild() {
        SequentialGroupAgent agent = new SequentialGroupAgent();
        agent.addChild(new Agent());
        GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
        SequentialGroup result = agent.groupContent(creatorAndAdder);
        assertNotNull(result);
        assertTrue(result instanceof SequentialGroup);
    }

    @Test
    void testGroupContent_multipleChildren() {
        SequentialGroupAgent agent = new SequentialGroupAgent();
        agent.addChild(new Agent());
        agent.addChild(new Agent());
        GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
        SequentialGroup result = agent.groupContent(creatorAndAdder);
        assertNotNull(result);
        assertTrue(result instanceof SequentialGroup);
    }

    @Test
    void testGroupContent_nestedChildren() {
        SequentialGroupAgent agent = new SequentialGroupAgent();
        SequentialGroupAgent childAgent = new SequentialGroupAgent();
        childAgent.addChild(new Agent());
        agent.addChild(childAgent);
        GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
        SequentialGroup result = agent.groupContent(creatorAndAdder);
        assertNotNull(result);
        assertTrue(result instanceof SequentialGroup);
    }

    @Test
    void testGroupContent_nullCreatorAndAdder() {
        SequentialGroupAgent agent = new SequentialGroupAgent();
        assertThrows(NullPointerException.class, () -> agent.groupContent(null));
    }

    @Test
    void testGetFunctionsOnGroupImplemenation() {
        SequentialGroupAgent agent = new SequentialGroupAgent();
        assertNotNull(agent.getFunctionsOnGroupImplemenation());
    }

    @Test
    void testGetFunctionsOnSequentialGroupImplemenation() {
        SequentialGroupAgent agent = new SequentialGroupAgent();
        assertNotNull(agent.getFunctionsOnSequentialGroupImplemenation());
    }

    @Test
    void testToString() {
        SequentialGroupAgent agent = new SequentialGroupAgent();
        assertEquals("sequential group <null,null>", agent.toString());
    }
}
