// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains one unit test case for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {

	/**
	* Test public void test()
	* Tests that {@link StringMatchesGuardCondition#evaluate(Object)} throws an IllegalArgumentException when String not matched to guard
	*/
	@Test
	public void test() throws IllegalArgumentException {
		StringMatchesGuardCondition Guard = new StringMatchesGuardCondition(null);
		assertNull(Guard);
		String newStr = "new test";
		assertEquals(newStr, Guard.getValue());
		newStr = "";
		assertNull(Guard);
		GuardedAction<String, Object, IllegalArgumentException> Guard2 = Guard.newGuard(new GuardGuardReturnValue(newStr), null);
		GuardedAction<String, Object, IllegalArgumentException> Guard3 = Guard2.newGuard(new GuardGuardReturnValue(newStr), null);
		Guard2.setAction(new GuardGuardAction(GuardedAction.Action.SAFE));
		GuardedAction<String, Object, IllegalArgumentException> Guard4 = Guard2.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard5 = Guard4.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		assertNotNull(Guard4);
		GuardedAction<String, Object, IllegalArgumentException> Guard6 = Guard5.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard7 = new Guard7(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard8 = new Guard7.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		Guard.evaluate(GuardedAction.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr)));
		GuardedAction<String, Object, IllegalArgumentException> Guard9 = Guard8.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard10 = new Guard9.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard11 = new Guard10.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard12 = (GuardedAction<String, Object, IllegalArgumentException>)Guard11.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard13 = (GuardedAction<String, Object, IllegalArgumentException>)Guard11.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard14 = (GuardedAction<String, Object, IllegalArgumentException>)Guard12.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard15 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard16 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard17 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue("new test"), new GuardGuardReturnValue("new test"));
		GuardedAction<String, Object, IllegalArgumentException> Guard18 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue("new test"), new GuardGuardReturnValue("new test"));
		GuardedAction<String, Object, IllegalArgumentException> Guard19 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue("new test"), new GuardGuardReturnValue("new test"));
		GuardedAction<String, Object, IllegalArgumentException> Guard20 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue("new test"), new GuardGuardReturnValue("new test"));
		GuardedAction<String, Object, IllegalArgumentException> Guard21 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue("new test"), new GuardGuardReturnValue("new test"));
		GuardedAction<String, Object, IllegalArgumentException> Guard22 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard23 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard24 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue(newStr));
		GuardedAction<String, Object, IllegalArgumentException> Guard25 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue("new test"));
		GuardedAction<String, Object, IllegalArgumentException> Guard26 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue("new test"));
		GuardedAction<String, Object, IllegalArgumentException> Guard27 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue("new test"), new GuardGuardReturnValue("new test"));
		GuardedAction<String, Object, IllegalArgumentException> Guard28 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue("new test"), new GuardGuardReturnValue("new test"));
		GuardedAction<String, Object, IllegalArgumentException> Guard29 = (GuardedAction<String, Object, IllegalArgumentException>)GuardedAction.newGuard(new GuardGuardReturnValue(newStr), new GuardGuardReturnValue("new test"));
		