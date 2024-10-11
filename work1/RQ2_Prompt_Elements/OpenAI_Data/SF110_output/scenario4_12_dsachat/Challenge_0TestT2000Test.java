// Challenge_0Test.java
package dsachat.share;

import java.io.Serializable;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Challenge}.
* It contains ten unit test cases for the {@link Challenge#roll()} method.
*/
class Challenge_0Test {

	/**
	 * Test case for {@link Challenge#roll()}
	 * <br>
	 * Test case for a talent challenge.
	 * <br>
	 * The talent is "Klettern" with a difficulty of 10.
	 * <br>
	 * The hero has the following attributes:
	 * <ul>
	 * <li>MU: 12</li>
	 * <li>KL: 12</li>
	 * <li>IN: 12</li>
	 * <li>CH: 12</li>
	 * <li>FF: 12</li>
	 * <li>GE: 12</li>
	 * <li>KO: 12</li>
	 * <li>KK: 12</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>KL: 0</li>
	 * <li>IN: 0</li>
	 * <li>CH: 0</li>
	 * <li>FF: 0</li>
	 * <li>GE: 0</li>
	 * <li>KO: 0</li>
	 * <li>KK: 0</li>
	 * </ul>
	 * The talent has the following values:
	 * <ul>
	 * <li>MU: 0</li>
	 * <li>