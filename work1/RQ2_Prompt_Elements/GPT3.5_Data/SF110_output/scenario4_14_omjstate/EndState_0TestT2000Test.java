// Test case for EndState.getSingleton() method
class EndState_0Test {

    // Test case 1: Test if the returned object is an instance of EndState
    @Test
    void testGetSingletonReturnsEndStateInstance() {
        assertTrue(EndState.getSingleton() instanceof EndState);
    }

    // Test case 2: Test if the returned object is the same instance every time
    @Test
    void testGetSingletonReturnsSameInstance() {
        EndState instance1 = EndState.getSingleton();
        EndState instance2 = EndState.getSingleton();
        assertSame(instance1, instance2);
    }

    // Test case 3: Test if the returned object is not null
    @Test
    void testGetSingletonReturnsNotNull() {
        assertNotNull(EndState.getSingleton());
    }

    // Test case 4: Test if the returned object is equal to itself
    @Test
    void testGetSingletonIsEqualToItself() {
        EndState instance = EndState.getSingleton();
        assertTrue(instance.equals(instance));
    }

    // Test case 5: Test if the returned object is equal to another instance of EndState
    @Test
    void testGetSingletonIsEqualToAnotherEndStateInstance() {
        EndState instance1 = EndState.getSingleton();
        EndState instance2 = EndState.getSingleton();
        assertTrue(instance1.equals(instance2));
    }

    // Test case 6: Test if the returned object is not equal to null
    @Test
    void testGetSingletonIsNotEqualToNull() {
        EndState instance = EndState.getSingleton();
        assertFalse(instance.equals(null));
    }

    // Test case 7: Test if the returned object is not equal to a different object type
    @Test
    void testGetSingletonIsNotEqualToDifferentObjectType() {
        EndState instance = EndState.getSingleton();
        assertFalse(instance.equals(new Object()));
    }

    // Test case 8: Test if the hashCode of the returned object is consistent
    @Test
    void testGetSingletonHasConsistentHashCode() {
        EndState instance = EndState.getSingleton();
        int hashCode1 = instance.hashCode();
        int hashCode2 = instance.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    // Test case 9: Test if the hashCode of the returned object is equal to the hashCode of another instance of EndState
    @Test
    void testGetSingletonHasEqualHashCodeToAnotherEndStateInstance() {
        EndState instance1 = EndState.getSingleton();
        EndState instance2 = EndState.getSingleton();
        assertEquals(instance1.hashCode(), instance2.hashCode());
    }

    // Test case 10: Test if the getName() method returns the correct name for the EndState class
    @Test
    void testGetNameReturnsCorrectName() {
        EndState instance = EndState.getSingleton();
        assertEquals("com.objectmentors.state.EndState", instance.getName());
    }
}