// Test case for EndState.getSingleton() method
public class EndState_0Test {

    @Test
    public void testSingleton() {
        EndState endState1 = EndState.getSingleton();
        EndState endState2 = EndState.getSingleton();
        assertEquals(endState1, endState2);
    }

    @Test
    public void testNotNull() {
        EndState endState = EndState.getSingleton();
        assertNotNull(endState);
    }

    @Test
    public void testIsIState() {
        EndState endState = EndState.getSingleton();
        assertTrue(endState instanceof IState);
    }

    @Test
    public void testIsISingleton() {
        EndState endState = EndState.getSingleton();
        assertTrue(endState instanceof uk.me.jockmacmad.jstate.patterns.ISingleton);
    }

    @Test
    public void testHashCode() {
        EndState endState1 = EndState.getSingleton();
        EndState endState2 = EndState.getSingleton();
        assertEquals(endState1.hashCode(), endState2.hashCode());
    }

    @Test
    public void testEquals() {
        EndState endState1 = EndState.getSingleton();
        EndState endState2 = EndState.getSingleton();
        assertTrue(endState1.equals(endState2));
    }

    @Test
    public void testToString() {
        EndState endState = EndState.getSingleton();
        assertEquals("EndState", endState.toString());
    }

    @Test
    public void testNotEqualsNull() {
        EndState endState = EndState.getSingleton();
        assertFalse(endState.equals(null));
    }

    @Test
    public void testNotEqualsObject() {
        EndState endState = EndState.getSingleton();
        assertFalse(endState.equals(new Object()));
    }
}