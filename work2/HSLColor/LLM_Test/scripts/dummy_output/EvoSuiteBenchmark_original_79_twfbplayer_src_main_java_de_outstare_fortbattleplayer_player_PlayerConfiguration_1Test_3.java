// PlayerConfiguration_1Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains one unit test case for the {@link PlayerConfiguration#showMoveTargets()} method.
*/
class PlayerConfiguration_1Test {
		
	@Test
    public void test_showMoveTargets(){
        // Given
        Configuration configuration = new Configuration();
        
        // When
        boolean result = Configuration.showMoveTargets(configuration);
		
	    // Then
        assertEquals(true, result);
    }
	
	@Test
    public void test_GetTargets(){
        // Given
        Configuration configuration = new Configuration();
        
        // When
        Set targetsList = getTargets(configuration);
        Set sourceTargetsList = new HashSet();
        addSourceTargets(targetsList, sourceTargetsList);
        GetTargets getTargets = new GetTargets(configuration);
        Set setTargets = getTargets.getTargets(getTargets.getConfig());
        Set targetSourceTargetsList = setTargets.retrieveFirst();
        assertEquals(sourceTargetsList, targetSourceTargetsList);
               
        // When
        reloadConfiguration(configuration);
        setTargets = getTargets.getTargets(getTargets.getConfig());
        targetSourceTargetsList = setTargets.retrieveFirst();
        assertEquals(targetsList, targetSourceTargetsList);
    }

    /**
    * Test add a source target.
    * It adds a source target to the given hash set.
    */
    private void addSourceTargets(Set targetsList, Set targetSourceTargetsList) {
        assertTrue(targetsList.addAll(targetSourceTargetsList));
    }
	
	@Test
    public void test_addSortedConfigure(){
        // Given

        Configuration configuration = new Configuration();

        // When
        configuration.addSortedConfig(configuration.clone());
               
        // Then
        configuration.addSortedConfig(configuration);
               
    }
	
	@Test
    public void test_setSortedConfig(){
        // Given

        Configuration configuration = new Configuration();

        // When
        configuration.setSortedConfig(configuration);
               
        // Then
        configuration.setSortedConfig(configuration);
               
    }
        
	@Test
    public void test_addSortedConfigForPlayer(){
        // Given
        Configuration configuration = new Configuration();
        Configuration configuration2 = new Configuration();
        configuration.setSortedConfig(configuration2);
               
        // When
        configuration2.setSortedConfig(configuration2);
               
        // Then
        assertEquals(configuration, configuration2);
               
    }
	
	@Test
    public void test_addSortedConfigForPlayer2(){
        // Given
        Configuration configuration = new Configuration();
        Configuration configuration2 = new Configuration();
        configuration2.setSortedConfig(configuration);
               
        // When
        configuration.setSortedConfig(configuration2);
               
        // Then
        assertEquals(configuration, configuration2);
               
    }
	
	@Test
    public void test_getSortedConfig(){
        // Given
        Configuration configuration = new Configuration();
        Configuration configuration2 = new Configuration();
        configuration.setSortedConfig(configuration);
               
        // When
        assertEquals(configuration, configuration2.getSortedConfig());

    }

    /**
    * Test remove the given target.
    * It removes the given target.
    */
    private void test_remove(){
        // Given
        final PlayerConfiguration configuration2 = createFakeConfiguration();
        
        // When
        configuration2.removeTarget(10).removeTarget(5).removeTarget(14).removeTarget(15);
               
        // Then
        assertFalse(configuration2.containsTarget(15));
    }
	
	@Test
    public void test_getTargetByName(){
        // Given
        Configuration configuration = createFakeConfiguration();
        Set target1List = configuration.getTargetList();
        
        Set target2List = getTargetByName(configuration, "target1");
        Set target3List = getTargetByName(configuration, "target2");
        
        Set targetList = new HashSet();
        setTargetList(targetList);
               
        // When
        assertEquals(target2List, targetList.retrieveAll());
    }

	@Test
    public void test_addSortedConfigForTarget(){
        // Given
        Configuration configuration = createFakeConfiguration();
        Configuration configuration2 = createFakeConfiguration();
        
        // When
        configuration2.setSortedConfig(configuration);
               
        // Then
        assertEquals(configuration2, configuration.addSortedConfig(configuration2));
               
    }
	
	@Test
    public void test_addSortedConfigForPlayer(){
        // Given
        Configuration configuration = createFakeConfiguration();
        Configuration configuration2 = createFakeConfiguration();
        
        // When
        configuration2.setSortedConfig(configuration);
               
        // Then
        assertEquals(configuration2, configuration.addSortedConfig(configuration2));
               
    }
	
	@Test
    public void test_addSortedConfigForPlayer2() {
        // Given
        Configuration configuration = createFakeConfiguration();
        Configuration configuration2 = createFakeConfiguration();
        
        // When
        configuration2.setSortedConfig(configuration);
               
        // Then
        assertEquals(configuration2, configuration.addSortedConfig(configuration2));
               
    }
    
    private Configuration createFakeConfiguration(){
    	return new Configuration(){
    	    @Override
            public Set getAllSortedConfig().retrieveAll() {
    	        return new HashSet();
    	    }
    	};
    }

	private Set getTargetList(Configuration configuration){
		return configuration.getAllSortedConfig().retrieveAll();
	}

	private void setTargetList(Set targetList){
		configuration.setAllSortedConfig(targetList);
	}

}