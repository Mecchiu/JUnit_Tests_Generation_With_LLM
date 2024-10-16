// TopSequentialGroupAgentTest.java
package glengineer.agents;

import javax.swing.GroupLayout.SequentialGroup;
import glengineer.agents.setters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TopSequentialGroupAgent}.
* It contains ten unit test cases for the {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class TopSequentialGroupAgentTest {
		
	@Test
	void testGroupContent_1() {
		TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
		agent.addChild(new ComponentAgent("component1"));
		agent.addChild(new ComponentAgent("component2"));
		agent.addChild(new ComponentAgent("component3"));
		agent.addChild(new ComponentAgent("component4"));
		agent.addChild(new ComponentAgent("component5"));
		agent.addChild(new ComponentAgent("component6"));
		agent.addChild(new ComponentAgent("component7"));
		agent.addChild(new ComponentAgent("component8"));
		agent.addChild(new ComponentAgent("component9"));
		agent.addChild(new ComponentAgent("component10"));
		agent.addChild(new ComponentAgent("component11"));
		agent.addChild(new ComponentAgent("component12"));
		agent.addChild(new ComponentAgent("component13"));
		agent.addChild(new ComponentAgent("component14"));
		agent.addChild(new ComponentAgent("component15"));
		agent.addChild(new ComponentAgent("component16"));
		agent.addChild(new ComponentAgent("component17"));
		agent.addChild(new ComponentAgent("component18"));
		agent.addChild(new ComponentAgent("component19"));
		agent.addChild(new ComponentAgent("component20"));
		agent.addChild(new ComponentAgent("component21"));
		agent.addChild(new ComponentAgent("component22"));
		agent.addChild(new ComponentAgent("component23"));
		agent.addChild(new ComponentAgent("component24"));
		agent.addChild(new ComponentAgent("component25"));
		agent.addChild(new ComponentAgent("component26"));
		agent.addChild(new ComponentAgent("component27"));
		agent.addChild(new ComponentAgent("component28"));
		agent.addChild(new ComponentAgent("component29"));
		agent.addChild(new ComponentAgent("component30"));
		agent.addChild(new ComponentAgent("component31"));
		agent.addChild(new ComponentAgent("component32"));
		agent.addChild(new ComponentAgent("component33"));
		agent.addChild(new ComponentAgent("component34"));
		agent.addChild(new ComponentAgent("component35"));
		agent.addChild(new ComponentAgent("component36"));
		agent.addChild(new ComponentAgent("component37"));
		agent.addChild(new ComponentAgent("component38"));
		agent.addChild(new ComponentAgent("component39"));
		agent.addChild(new ComponentAgent("component40"));
		agent.addChild(new ComponentAgent("component41"));
		agent.addChild(new ComponentAgent("component42"));
		agent.addChild(new ComponentAgent("component43"));
		agent.addChild(new ComponentAgent("component44"));
		agent.addChild(new ComponentAgent("component45"));
		agent.addChild(new ComponentAgent("component46"));
		agent.addChild(new ComponentAgent("component47"));
		agent.addChild(new ComponentAgent("component48"));
		agent.addChild(new ComponentAgent("component49"));
		agent.addChild(new ComponentAgent("component50"));
		agent.addChild(new ComponentAgent("component51"));
		agent.addChild(new ComponentAgent("component52"));
		agent.addChild(new ComponentAgent("component53"));
		agent.addChild(new ComponentAgent("component54"));
		agent.addChild(new ComponentAgent("component55"));
		agent.addChild(new ComponentAgent("component56"));
		agent.addChild(new ComponentAgent("component57"));
		agent.addChild(new ComponentAgent("component58"));
		agent.addChild(new ComponentAgent("component59"));
		agent.addChild(new ComponentAgent("component60"));
		agent.addChild(new ComponentAgent("component61"));
		agent.addChild(new ComponentAgent("component62"));
		agent.addChild(new ComponentAgent("component63"));
		agent.addChild(new ComponentAgent("component64"));
		agent.addChild(new ComponentAgent("component65"));
		agent.addChild(new ComponentAgent("component66"));
		agent.addChild(new ComponentAgent("component67"));
		agent.addChild(new ComponentAgent("component68"));
		agent.addChild(new ComponentAgent("component69"));
		agent.addChild(new ComponentAgent("component70"));
		agent.addChild(new ComponentAgent("component71"));
		agent.addChild(new ComponentAgent("component72"));
		agent.addChild(new ComponentAgent("component73"));
		agent.addChild(new ComponentAgent("component74"));
		agent.addChild(new ComponentAgent("component75"));
		agent.addChild(new ComponentAgent("component76"));
		agent.addChild(new ComponentAgent("component77"));
		agent.addChild(new ComponentAgent("component78"));
		agent.addChild(new ComponentAgent("component79"));
		agent.addChild(new ComponentAgent("component80"));
		agent.addChild(new ComponentAgent("component81"));
		agent.addChild(new ComponentAgent("component82"));
		agent.addChild(new ComponentAgent("component83"));
		agent.addChild(new ComponentAgent("component84"));
		agent.addChild(new ComponentAgent("component85"));
		agent.addChild(new ComponentAgent("component86"));
		agent.addChild(new ComponentAgent("component87"));
		agent.addChild(new ComponentAgent("component88"));
		agent.addChild(new ComponentAgent("component89"));
		agent.addChild(new ComponentAgent("component90"));
		agent.addChild(new ComponentAgent("component91"));
		agent.addChild(new ComponentAgent("component92"));
		agent.addChild(new ComponentAgent("component93"));
		agent.addChild(new ComponentAgent("component94"));
		agent.addChild(new ComponentAgent("component95"));
		agent.addChild(new ComponentAgent("component96"));
		agent.addChild(new ComponentAgent("component97"));
		agent.addChild(new ComponentAgent("component98"));
		agent.addChild(new ComponentAgent("component99"));
		agent.addChild(new ComponentAgent("component100"));
		agent.addChild(new ComponentAgent("component101"));
		agent.addChild(new ComponentAgent("component102"));
		agent.addChild(new ComponentAgent("component103"));
		agent.addChild(new ComponentAgent("component104"));
		agent.addChild(new ComponentAgent("component105"));
		agent.addChild(new ComponentAgent("component106"));
		agent.addChild(new ComponentAgent("component107"));
		agent.addChild(new ComponentAgent("component108"));
		agent.addChild(new ComponentAgent("component109"));
		agent.addChild(new ComponentAgent("component110"));
		agent.addChild(new ComponentAgent("component111"));
		agent.addChild(new ComponentAgent("component112"));
		agent.addChild(new ComponentAgent("component113"));
		agent.addChild(new ComponentAgent("component114"));
		agent.addChild(new ComponentAgent("component115"));
		agent.addChild(new ComponentAgent("component116"));
		agent.addChild(new ComponentAgent("component117"));
		agent.addChild(new ComponentAgent("component118"));
		agent.addChild(new ComponentAgent("component119"));
		agent.addChild(new ComponentAgent("component120"));
		agent.addChild(new ComponentAgent("component121"));
		agent.addChild(new ComponentAgent("component122"));
		agent.addChild(new ComponentAgent("component123"));
		agent.addChild(new ComponentAgent("component124"));
		agent.addChild(new ComponentAgent("component125"));
		agent.addChild(new ComponentAgent("component126"));
		agent.addChild(new ComponentAgent("component127"));
		agent.addChild(new ComponentAgent("component128"));
		agent.addChild(new ComponentAgent("component129"));
		agent.addChild(new ComponentAgent("component130"));
		agent.addChild(new ComponentAgent("component131"));
		agent.addChild(new ComponentAgent("component132"));
		agent.addChild(new ComponentAgent("component133"));
		agent.addChild(new ComponentAgent("component134"));
		agent.addChild(new ComponentAgent("component135"));
		agent.addChild(new ComponentAgent("component136"));
		agent.addChild(new ComponentAgent("component137"));
		agent.addChild(new ComponentAgent("component138"));
		agent.addChild(new ComponentAgent("component139"));
		agent.addChild(new ComponentAgent("component140"));
		agent.addChild(new ComponentAgent("component141"));
		agent.addChild(new ComponentAgent("component142"));
		agent.addChild(new ComponentAgent("component143"));
		agent.addChild(new ComponentAgent("component144"));
		agent.addChild(new ComponentAgent("component145"));
		agent.addChild(new ComponentAgent("component146"));
		agent.addChild(new ComponentAgent("component147"));
		agent.addChild(new ComponentAgent("component148"));
		agent.addChild(new ComponentAgent("component149"));
		agent.addChild(new ComponentAgent("component150"));
		agent.addChild(new ComponentAgent("component151"));
		agent.addChild(new ComponentAgent("component152"));
		agent.addChild(new ComponentAgent("component153"));
		agent.addChild(new ComponentAgent("component154"));
		agent.addChild(new ComponentAgent("component155"));
		agent.addChild(new ComponentAgent("component156"));
		agent.addChild(new ComponentAgent("component157"));
		agent.addChild(new ComponentAgent("component158"));
		agent.addChild(new ComponentAgent("component159"));
		agent.addChild(new ComponentAgent("component160"));
		agent.addChild(new ComponentAgent("component161"));
		agent.addChild(new ComponentAgent("component162"));
		agent.addChild(new ComponentAgent("component163"));
		agent.addChild(new ComponentAgent("component164"));
		agent.addChild(new ComponentAgent("component165"));
		agent.addChild(new ComponentAgent("component166"));
		agent.addChild(new ComponentAgent("component167"));
		agent.addChild(new ComponentAgent("component168"));
		agent.addChild(new ComponentAgent("component169"));
		agent.addChild(new ComponentAgent("component170"));
		agent.addChild(new ComponentAgent("component171"));
		agent.addChild(new ComponentAgent("component172"));
		agent.addChild(new ComponentAgent("component173"));
		agent.addChild(new ComponentAgent("component174"));
		agent.addChild(new ComponentAgent("component175"));
		agent.addChild(new ComponentAgent("component176"));
		agent.addChild(new ComponentAgent("component177"));
		agent.addChild(new ComponentAgent("component178"));
		agent.addChild(new ComponentAgent("component179"));
		agent.addChild(new ComponentAgent("component180"));
		agent.addChild(new ComponentAgent("component181"));
		agent.addChild(new ComponentAgent("component182"));
		agent.addChild(new ComponentAgent("component183"));
		agent.addChild(new ComponentAgent("component184"));
		agent.addChild(new ComponentAgent("component185"));
		agent.addChild(new ComponentAgent("component186"));
		agent.addChild(new ComponentAgent("component187"));
		agent.addChild(new ComponentAgent("component188"));
		agent.addChild(new ComponentAgent("component189"));
		agent.addChild(new ComponentAgent("component190"));
		agent.addChild(new ComponentAgent("component191"));
		agent.addChild(new ComponentAgent("component192"));
		agent.addChild(new ComponentAgent("component193"));
		agent.addChild(new ComponentAgent("component194"));
		agent.addChild(new ComponentAgent("component195"));
		agent.addChild(new ComponentAgent("component196"));
		agent.addChild(new ComponentAgent("component197"));
		agent.addChild(new ComponentAgent("component198"));
		agent.addChild(new ComponentAgent("component199"));
		agent.addChild(new ComponentAgent("component200"));
		agent.addChild(new ComponentAgent("component201"));
		agent.addChild(new ComponentAgent("component202"));
		agent.addChild(new ComponentAgent("component203"));
		agent.addChild(new ComponentAgent("component204"));
		agent.addChild(new ComponentAgent("component205"));
		agent.addChild(new ComponentAgent("component206"));
		agent.addChild(new ComponentAgent("component207"));
		agent.addChild(new ComponentAgent("component208"));
		agent.addChild(new ComponentAgent("component209"));
		agent.addChild(new ComponentAgent("component210"));
		agent.addChild(new ComponentAgent("component211"));
		agent.addChild(new ComponentAgent("component212"));
		agent.addChild(new ComponentAgent("component213"));
		agent.addChild(new ComponentAgent("component214"));
		agent.addChild(new ComponentAgent("component215"));
		agent.addChild(new ComponentAgent("component216"));
		agent.addChild(new ComponentAgent("component217"));
		agent.addChild(new ComponentAgent("component218"));
		agent.addChild(new ComponentAgent("component219"));
		agent.addChild(new ComponentAgent("component220"));
		agent.addChild(new ComponentAgent("component221"));
		agent.addChild(new ComponentAgent("component222"));
		agent.addChild(new ComponentAgent("component223"));
		agent.addChild(new ComponentAgent("component224"));
		agent.addChild(new ComponentAgent("component225"));
		agent.addChild(new ComponentAgent("component226"));
		agent.addChild(new ComponentAgent("component227"));
		agent.addChild(new ComponentAgent("component228"));
		agent.addChild(new ComponentAgent("component229"));
		agent.addChild(new ComponentAgent("component230"));
		agent.addChild(new ComponentAgent("component231"));
		agent.addChild(new ComponentAgent("component232"));
		agent.addChild(new ComponentAgent("component233"));
		agent.addChild(new ComponentAgent("component234"));
		agent.addChild(new ComponentAgent("component235"));
		agent.addChild(new ComponentAgent("component236"));
		agent.addChild(new ComponentAgent("component237"));
		agent.addChild(new ComponentAgent("component238"));
		agent.addChild(new ComponentAgent("component239"));
		agent.addChild(new ComponentAgent("component240"));
		agent.addChild(new ComponentAgent("component241"));
		agent.addChild(new ComponentAgent("component242"));
		agent.addChild(new ComponentAgent("component243"));
		agent.addChild(new ComponentAgent("component244"));
		agent.addChild(new ComponentAgent("component245"));
		agent.addChild(new ComponentAgent("component246"));
		agent.addChild(new ComponentAgent("component247"));
		agent.addChild(new ComponentAgent("component248"));
}
}