// ParseMusicTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains one unit test case for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {
private final List<Object> expected = new ArrayList<Object>();

		private final List<Object> actual = new ArrayList<Object>();


		/**
		* Tests whether list passed to {@link ParseMusic#parseMusic(String)} are the elements expected.<br>
		* <ul>
		*       <li>{@code [1]} - {@link ParseMusic#parseMusic(String)},
		*       <li>{@code [1, 2, 3]} - {@link ParseMusic#parseMusic(String)},
		*       <li>{@code ['1', '2', '3']} - {@link ParseMusic#parseMusic(String)},
		*       <li>{@code [1, -1, 5]} - {@link ParseMusic#parseMusic(String)},
		*       <li>{@code [1, 2, 3, ['5', 'f']]} - {@link ParseMusic#parseMusic(String)},
		*       <li>{@code
		*           [1, f, 2]
		*       } - {@link ParseMusic#parseMusic(String)},
		*       <li>{@code [['1'], f, 2]
		*       } - {@link ParseMusic#parseMusic(String)},
		*       <li>{@code [['1', '2', '3']]
		*       } - {@link ParseMusic#parseMusic(String)},
		*       <li>{@code [[1, 2, 3], *]
		*       } - {@link ParseMusic#parseMusic(String)},
		*       <li>{@code [[1, 2, '3'], *] /
		*       } - {@link ParseMusic#parseMusic(String)},
		*       </ul>
		* @throws AssertionFailedError
		*/
    @Test
    void containsMusicCorrectElements() {
        List<Object> result = ParseMusic.parseMusic("[1, 2, 3]");
        Assert.assertEquals(3, result.size());
        result = result.subList(1, 4);
        Assert.assertEquals(3, result.size());
        result = result.subList(1, 5);
        Assert.assertEquals(result, 0);
        Assert.assertEquals(result.getClass(), ArrayList.class);
        result = result.subList(1, 4);
        Assert.assertEquals(3, result.getClass().getComponentType().getEnumConstants()[0].getOrdinal());
        result = result.subList(1, 4);
        Assert.assertEquals(3, result.getClass().getComponentType().getEnumConstants()[0].getOrdinal());
    }



		private ParseMusicTest() {
    }
}


// {@link ParseMusicTest}
class ParseMusicTest2 {
    private List<Object> actual_ = new ArrayList<Object>();
	public void add(Object expected_) {
		actual_.add(expected_);
	}

	public List<Object> getActual() {
		return actual_;
	}
	
	public void addActual(Object actual_) {
		actual_.add(actual_);
	}
}