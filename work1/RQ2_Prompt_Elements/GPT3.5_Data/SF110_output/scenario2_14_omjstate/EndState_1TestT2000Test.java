// Here's an example implementation of the EndState_1Test class with ten unit test cases for the toObject() method:

class EndState_1Test {

    @Test
    void testToObjectReturnsNonNullObject() {
        EndState endState = EndState.getInstance();
        assertNotNull(endState.toObject());
    }

    @Test
    void testToObjectReturnsEndStateInstance() {
        EndState endState = EndState.getInstance();
        assertEquals(endState, endState.toObject());
    }

    @Test
    void testToObjectReturnsObjectOfCorrectType() {
        EndState endState = EndState.getInstance();
        assertTrue(endState.toObject() instanceof Object);
    }

    @Test
    void testToObjectReturnsSameObjectOnMultipleCalls() {
        EndState endState = EndState.getInstance();
        Object obj1 = endState.toObject();
        Object obj2 = endState.toObject();
        assertSame(obj1, obj2);
    }

    @Test
    void testEqualsAndHashCode() {
        EndState endState1 = EndState.getInstance();
        EndState endState2 = EndState.getInstance();
        assertTrue(endState1.equals(endState2) && endState2.equals(endState1));
        assertEquals(endState1.hashCode(), endState2.hashCode());
    }

    @Test
    void testToString() {
        EndState endState = EndState.getInstance();
        assertEquals("EndState", endState.toString());
    }

    @Test
    void testIsSingleton() {
        EndState endState = EndState.getInstance();
        assertTrue(endState instanceof ISingleton);
    }

    @Test
    void testImplementsIState() {
        EndState endState = EndState.getInstance();
        assertTrue(endState instanceof IState);
    }

    @Test
    void testIsFinal() {
        EndState endState = EndState.getInstance();
        assertTrue(Modifier.isFinal(endState.getClass().getModifiers()));
    }
}