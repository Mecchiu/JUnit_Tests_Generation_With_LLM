// Test cases for EndState's toObject() method
public class EndState_1Test {

    @Test
    public void testToObject() {
        EndState endState = EndState.getInstance();
        assertEquals(endState, endState.toObject());
    }

    @Test
    public void testToObjectSameInstance() {
        EndState endState = EndState.getInstance();
        assertSame(endState, endState.toObject());
    }

    @Test
    public void testToObjectNotNull() {
        EndState endState = EndState.getInstance();
        assertNotNull(endState.toObject());
    }

    @Test
    public void testToObjectNotEquals() {
        EndState endState = EndState.getInstance();
        assertNotEquals(new Object(), endState.toObject());
    }

    @Test
    public void testToObjectHashCode() {
        EndState endState = EndState.getInstance();
        assertEquals(endState.hashCode(), endState.toObject().hashCode());
    }

    @Test
    public void testToObjectEquals() {
        EndState endState = EndState.getInstance();
        assertTrue(endState.equals(endState.toObject()));
    }

    @Test
    public void testToObjectEqualsBuilder() {
        EndState endState = EndState.getInstance();
        assertTrue(new EqualsBuilder().append(endState, endState.toObject()).isEquals());
    }

    @Test
    public void testToObjectHashCodeBuilder() {
        EndState endState = EndState.getInstance();
        assertEquals(new HashCodeBuilder().append(endState).toHashCode(), endState.toObject().hashCode());
    }

    @Test
    public void testToObjectSingleton() {
        EndState endState = EndState.getInstance();
        assertTrue(endState.toObject() instanceof EndState);
    }

    @Test
    public void testToObjectSameClass() {
        EndState endState = EndState.getInstance();
        assertEquals(endState.getClass(), endState.toObject().getClass());
    }
}