// BattleplanTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplan}.
* It contains one unit test case for the {@link Battleplan#numberOfRounds()} method.
*/
class BattleplanTest {
		
	final static Logger log = Logger.getLogger("BattleplanTest.Test");
	
	@Test
	public void test1() {
		Battleplan p = new Battleplan();
		assertTrue("Should get an empty map.",p.getMap().isEmpty());
		assertTrue("Should get no initial list of rounds.",p.getInitialRoundsSortedMap(100).isEmpty());
		
		int iterationsBefore = p.numberOfRounds(); // default = 10
		for(int i=0; i<10; i++) {              // step 10
			Collection<Integer> collection = p.getInitialRoundsSortedMap(100d);
			int k = 0;
			for(int j=0; j<iterationsBefore; j++) { // 10 times
				if(k++ % 2 == 0) {                                               // odd
					collection = collection.subList(0,j+1); // step 1
					collection = collection.subList(j+1,collection.size()); // step 2
				} else {                                                          // even
					collection = collection.subList(0,iterationsBefore-1-j); // step 1
					collection = collection.subList(iterationsBefore-1-j,collection.size()-1); // step 2
				}
			}
			assertTrue("Before step", (collection.size()>initSize));
			assertTrue("At step", (collection.size()==initSize));
		}
		
		for(int i=0; i<10; i++) {                  // step 10
			Collection<Integer> collection = p.getInitialRoundsSortedMap(100d);
			for(int j=0; j<iterationsBefore; j++) { // 10 times
				if(k++ % 2 == 0) {                      // odd
					collection = collection.subList(0, j+1); // step 1
					collection = collection.subList(j+1, collection.size()); // step 2
				} else {                          // even
					collection = collection.subList(0, iterationsBefore-1-j); // step 1
					collection = collection.subList(iterationsBefore-1-j, collection.size()-1); // step 2
				}
			}
			assertTrue("Before step2", (collection.size()>initSize));
			assertTrue("At step2", (collection.size()==initSize));
		}
		
		assertTrue("Should have get " + iterationsBefore + " iterations!",( p.numberOfRounds()==iterationsBefore));
	}
	
	@Test
	public void test2() {
		Battleplan p = new Battleplan();
		log.info("test2: No more rounds after 10 times!");
		
		int iterationsAfter = 10;
		p.setInitialRoundsSortedMap(1d, iterationsAfter);
		assertTrue("Should have a round of 0.",iterationsAfter==p.numberOfRounds());
		log.info("test2: rounds="+p.getMap().size());
		
		SortedMap<Integer, Integer> map = p.getMap();
		log.info("test2: check map"); 
		log.info("test2: round="+iterationsAfter);
		assertTrue("Wrong size",map.size() >= iterationsAfter);
	}
	
	@Test
	public void test3() {
		Battleplan p = new Battleplan();
		Collection<SortedMap<Integer, Integer>> coll = p.getInitialRoundsSortedMap(10d);
		assertTrue("Should get a sorted map!",( coll.size()==1));
		SortedMap<Integer, Integer> map = coll.get(0);
		assertTrue("Wrong size",(map.size() == 10));
		assertTrue("Wrong map",map.isEmpty());
		
		int iterationsBefore = p.numberOfRounds();                  // default = 10
		p.setInitialRoundsSortedMap(1d, iterationsBefore);
		assertTrue("Should get the map after 10 rounds.",(p.getMap().size()>10));
		int iterationsAfter = p.numberOfRounds();                  // after 10 rounds
		p.setInitialRoundsSortedMap(10d);
		assertTrue("Should get the map after 20 rounds.",(p.getMap().size()>20));
	}
	
	private SortedMap<Integer,Integer> getMap(int steps) {
		for (int i = 0; i < steps; i++)
			log.info(i+" "+p.getMap().size());
		
		SortedMap<Integer,Integer> map = p.getMap();
		return map;
	}

	
	@Test
	public void test4() {
		
		SortedMap<Integer,Integer> initialMap = getMap(10);
		log.info("Number of rounds before="+initialMap.size());
		assertTrue("Should have exactly 10 rounds after",(initialMap.size()==10));
		log.info("Number of rounds after="+initialMap.size());
		
		for(int i=0;i<9;i++) {
			int iterationsBefore = i;
			Iterator<SortedMap<Integer, Integer>> it =
				new TreeMapIterator<>(initialMap).iterator(null);
			for(int k=iterationsBefore;k<= initialMap.size();k++) {
				Collection<Integer> collection = it.next().headSet(k); 
				if(collection.size()==0) {               // not in round
					collection = it.next().headSet(k); // the first round
				}
				log.info(k+" "+collection);
				
				if(collection.size() > 0) {
					if(collection.size() > 0)
						log.info("More than one possible element:");
					int j = Collections.max(collection).intValue();
					Integer r = collection.get(j); 
					log.info("ROUND= "+r+" - "+collection.get(j));
				}
			}
			int iterationsAfter = iterationsBefore;
			iterationsBefore = iterationsAfter;
		}
		
		int iterationsAfter = initialMap.size()+initialMap.size()+9;
		SortedMap<Integer,Integer> map = getMap(100);
		for(int i=0;i<iterationsAfter;i++) {
			MapEntry<Integer,Integer> e = new MapEntry<>( 0, iterationsAfter, i+1);
			SortedMap<Integer,Integer> map2 = getMap(100);
			Collection<Integer> c2 = map2.get(e.pos);
			log.info("Map2="+c2);
			assertEquals("Map mismatch", map.size(), c2.size());
			for(int j=0;j< c2.size();j++) {
				assertEquals(new Integer(i+j), c2.get(j));
			}
		}
	}
}