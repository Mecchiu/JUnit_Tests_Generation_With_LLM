```java
public class EndState_1Test {

    @Test
    void testEndStateToObjectNotNull() {
        EndState endState = EndState.getSingleton();
        assertNotNull(endState.toObject());
    }

    @Test
    void testEndStateToObjectIsEndState() {
        EndState endState = EndState.getSingleton();
        assertEquals(EndState.class, endState.toObject().getClass());
    }

    @Test
    void testEndStateToObjectSameInstance() {
        EndState endState = EndState.getSingleton();
        assertSame(endState, endState.toObject());
    }

    @Test
    void testEndStateEqualsItself() {
        EndState endState = EndState.getSingleton();
        assertTrue(endState.equals(endState));
    }

    @Test
    void testEndStateEqualsNull() {
        EndState endState = EndState.getSingleton();
        assertFalse(endState.equals(null));
    }

    @Test
    void testEndStateEqualsDifferentObject() {
        EndState endState = EndState.getSingleton();
        assertFalse(endState.equals(new Object()));
    }

    @Test
    void testEndStateHashCodeConsistent() {
        EndState endState = EndState.getSingleton();
        int hashCode1 = endState.hashCode();
        int hashCode2 = endState.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    void testEndStateHashCodeEquals() {
        EndState endState1 = EndState.getSingleton();
        EndState endState2 = EndState.getSingleton();
        assertEquals(endState1.hashCode(), endState2.hashCode());
    }

    @Test
    void testEndStateName() {
        EndState endState = EndState.getSingleton();
        assertEquals("com.objectmentors.state.EndState", endState.getName());
    }
}
```
```