// CorrectBracketingTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains one unit test case for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {
   
	   @Test
	   public void correctBracketingTest() {
	      	assertTrue(CorrectBracketing.correctBracketing("<>").equals(""));
	      	assertTrue(CorrectBracketing.correctBracketing("<<><>>").equals("<><><><><>>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<<><"><>>")
	      					.equals("<><><>>>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> >>>>>>>>").equals(""));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>><<<>>>>>>>>")
	      					.equals(""));
	      	assertTrue(CorrectBracketing.correctBracketing("<>><")
		  				.equals("<><>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<>) <>")
		  					.equals("<><>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> > >><>>")
		  				.equals("<><>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> >>>")
		  					.equals("<>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<><> <> > >><<>")
		  					.equals("<<<>>>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>) <<<>")
		  					.equals("<<<>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> <<<<)) <<<>")
		  					.equals("<><"));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>) <<<<<")
		  					.equals("<<<"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> <> <<<>> >>>")
		  					.equals("<>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>) <<<<>")
		  					.equals("<<<"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> <> <<<>>      >>")
		  					.equals("<<<<"));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>) <<<<<<")
		  					.equals("<<<"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> <<<<>) <<<>>  ")
		  					.equals("<>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>) <<<<<<")
		  					.equals("<<<"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> <<<<) <<<>  ")
		  					.equals("<<<<"));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>) <<<<<<")
		  					.equals("<<<"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> <<<-> ")
		  					.equals("<>" ));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>) <<<<<> ")
		  					.equals("<<>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>) <<<>")
		  					.equals("<<<"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> <->) <<<>>")
		  					.equals("<>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>> >")
		  					.equals("<<<"));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<>) <<<>> ")
		  					.equals("<<>"));
	      	assertTrue(CorrectBracketing.correctBracketing("<> <> & <> &</ >")
		  					.equals(""));
	      	assertTrue(CorrectBracketing.correctBracketing("<<<> __<>__<")
		  					.equals(""));
	      	assertTrue(CorrectBracketing.correctBracketing("<> <> <> &  <> > >");
		  					.equals(""));
		  	}
	    }
}