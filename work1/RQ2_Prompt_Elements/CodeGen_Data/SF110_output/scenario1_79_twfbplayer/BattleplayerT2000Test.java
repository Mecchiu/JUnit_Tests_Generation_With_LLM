// BattleplayerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplayer}.
* It contains one unit test case for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {

	@Test
	public void numberOfRounds() {
		Battleplayer bp = new Battleplayer();
		assertEquals("numberOfRounds", 0, bp.numberOfRounds());
		
		Combatant cc = new Combatant(null,0,null,null, null, null, null, null, null, null,null,null);
        
        Battleplayer.Builder bb = new Battleplayer.Builder();
        bb.numberOfRounds(5);
        bp.add(bb.build());
        
        assertEquals("numberOfRounds", 5, bp.numberOfRounds());
        
		assertTrue("is empty", bp.isEmpty());

	}
	
	@Test
	public void isEmpty() {
		Battleplayer bp = new Battleplayer();
		Battler b = new Battle(null, Battle.BattlerType.NONE, null, null, BattleType.NONE, null, null, null, null, null, null);
        
        Battle bpB = new Battle(null, Battle.BattlerType.NONE, null, null, BattleType.NONE, null, null, null, null, null);
        
        assertEquals("isEmpty", false, bc(bp, bpB).isEmpty());
        assertEquals("isEmpty", false, bpB.isEmpty().or(false));
        assertEquals("isEmpty", false, bp.isEmpty().or(false));
        assertFalse("isEmpty", bp.isEmpty().any().or(false));
        assertFalse("isEmpty", bp.isEmpty().all().or(false));
        assertTrue("isEmpty", bp.isEmpty().one().or(true));
        assertTrue("isEmpty", bp.isEmpty().all().one().or(true));
		
	}
	
	@Test
	public void playerOne() {
		Battleplayer bp = new Battleplayer();
		Battle b = new Battle(null, Battle.BattlerType.NONE,null, null, BattleType.NONE, null, null, null, null, null);
        List<Battler> ls = new ArrayList<>(1);
		ls.add(b);
		b.add(ls);
        
        Battle bpB = new Battle(null, Battle.BattlerType.NONE,null, null, BattleType.NONE, null, null, null, null);
        List<Battler> lsB = new ArrayList<>(1);
		lsB.add(bpB.getFirst());
		b.addAll(ls, lsB);
        
        assertTrue("is empty",b.isEmpty().one().or(true));
        List<Combatant> cc = b.all();
        List<Combatant> bcc = bp.all();
        assertFalse("is empty",b.isEmpty().all().one().or(true));
        assertEquals(b.size(), cc.size());
        assertEquals(b.size(), bcc.size());
		
		assertTrue("isEmpty", bp.isEmpty().size().or(true));
		Set<Combatant> ccv = b.one().size();
        assertFalse("is empty", bp.isEmpty().one().size().or(true));
        assertEquals(1, ccv.size());
		
		assertTrue("isEmpty", bp.isEmpty().all().size().or(true));
		Set<Combatant> ccb = bp.all().one().size();
		Set<Combatant> bccb = bpB.all().one().size();
        assertFalse("isEmpty", bp.isEmpty().all().one().size().or(true));
        assertFalse("isEmpty", bp.isEmpty().all().all().one().size().or(true));
        
        assertTrue("isEmpty", bp.isEmpty().all().all().size().or(true));
	}
	
	@Test
	public void playerTwo() {
        Battleplayer bp = new Battleplayer();
        Combatant cc = new Combatant(null,0,null,null, null, null, null, null, null, null,null);
                
		List<Battler> ls = new ArrayList<>(1);
		Battler b = new Battle(null,Battle.BattlerType.NONE,null,null, BattleType.NONE, null, null, null, null);
		ls.add(b);
		bp.add(b);
		
		Battle bpB = new Battle(null,Battle.BattlerType.NONE,null,null, BattleType.NONE, null, null, null, null);
		List<Battler> lsB = new ArrayList<>(1);
		lsB.add(bpB);
		bpB.add(ls);
	}
	
	@Test
	public void playerThree() {
		Battleplayer bp = new Battleplayer();
		Battlebattle b = new Battlebattle(null, BattleType.NONE);
        List<Combatant> cc = new ArrayList<Combatant>(1);
		List<Combatant> bcc = new ArrayList<Combatant>(1);
		cc.add(new Combatant(null, 0, cc, bcc, null, null, null, null, null, null.getClass().getField("f1").getGenericType(), null.getClass().getField("f3").getGenericType()));
		bp.add(b);
        assertEquals(cc.size(), bp.all().size());
        assertEquals(bcc.size(), bp.all().size().one());
        
		assertTrue("is empty", bp.isEmpty().all().size().or(true));
		Set<Combatant> ccC = bp.all().all().one();
        
        assertEquals(ccC.size(), bp.all().size().one().size());
        
		cc = new ArrayList<Combatant>(1);
		cc.add(new Combatant(null, 0, cc, bcc, null, null, null, null, null.getClass().getField("f1").getGenericType(), null.getClass().getField("f3").getGenericType()));
		lista.clear();
		bp.add(b);		
		Combatant ccI = bp.all().one();
        
        assertEquals(ccI.size(), bp.all().one().size().size());
        cc = new ArrayList<Combatant>(1);
		cc.add(new Combatant(null, 0, cc, bcc, null, null, null, null, null.getClass().getField("f1").getGenericType(), null.getClass().getField("f3").getGenericType()));
        lista.clear();
        bp.add(b);
        Combatant ccII = bp.all().one().size();
        
        assertEquals(ccII.size(), bp.all().one().size().one().size());
                
		assertTrue("is empty", bp.isEmpty().one().size().or(true));
		Set<Combatant> ccVII = bp.all().one().size();
        
        assertEquals(ccVII.size(), bp.all().one().size().one().size());
        