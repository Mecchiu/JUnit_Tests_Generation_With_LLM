# id_18_Test.java
from scenario3.id_18 import how_many_times

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`scenario3.id_18.how_many_times`.
    """


    def test_how_many_times_1(self):
        """
        Test case 1 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('', 'a') == 0

    def test_how_many_times_2(self):
        """
        Test case 2 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaa', 'a') == 3

    def test_how_many_times_3(self):
        """
        Test case 3 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aa') == 3

    def test_how_many_times_4(self):
        """
        Test case 4 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaa') == 2

    def test_how_many_times_5(self):
        """
        Test case 5 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaa') == 1

    def test_how_many_times_6(self):
        """
        Test case 6 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaa') == 0

    def test_how_many_times_7(self):
        """
        Test case 7 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaa') == 0

    def test_how_many_times_8(self):
        """
        Test case 8 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaa') == 0

    def test_how_many_times_9(self):
        """
        Test case 9 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaaa') == 0

    def test_how_many_times_10(self):
        """
        Test case 10 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaaaa') == 0

# id_18_Test.py
from scenario3.id_18 import how_many_times

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`scenario3.id_18.how_many_times`.
    """
		
    def test_how_many_times_1(self):
        """
        Test case 1 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('', 'a') == 0

    def test_how_many_times_2(self):
        """
        Test case 2 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaa', 'a') == 3

    def test_how_many_times_3(self):
        """
        Test case 3 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aa') == 3

    def test_how_many_times_4(self):
        """
        Test case 4 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaa') == 2

    def test_how_many_times_5(self):
        """
        Test case 5 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaa') == 1

    def test_how_many_times_6(self):
        """
        Test case 6 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaa') == 0

    def test_how_many_times_7(self):
        """
        Test case 7 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaa') == 0

    def test_how_many_times_8(self):
        """
        Test case 8 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaa') == 0

    def test_how_many_times_9(self):
        """
        Test case 9 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaaa') == 0

    def test_how_many_times_10(self):
        """
        Test case 10 for :func:`scenario3.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaaaa') == 0

# id_19.java

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 * <p>frontBack("code") → "eodc"
 * <p>frontBack("a") → "a"
 * <p>frontBack("ab") → "ba"
 */
public String frontBack(String str) {
  if (str.length() <= 1) return str;
  String mid = str.substring(1, str.length()-1);
  return str.charAt(str.length()-1) + mid + str.charAt(0);
}

# id_19.py


def front_back(string: str) -> str:
    """ Given a string, return a new string where the first and last chars have been exchanged.
    >>> front_back('code')
    'eodc'
    >>> front_back('a')
    'a'
    >>> front_back('ab')
    'ba'
    """

    pass

# id_19_Test.java
from scenario3.id_19 import front_back

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains three unit test cases for the :func:`scenario3.id_19.front_back`.
    """
		
    def test_front_back_1(self):
        """
        Test case 1 for :func:`scenario3.id_19.front_back`.
        """
        assert front_back('code') == 'eodc'

    def test_front_back_2(self):
        """
        Test case 2 for :func:`scenario3.id_19.front_back`.
        """
        assert front_back('a') == 'a'

    def test_front_back_3(self):
        """
        Test case 3 for :func:`scenario3.id_19.front_back`.
        """
        assert front_back('ab') == 'ba'

# id_19_Test.py
from scenario3.id_19 import front_back

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains three unit test cases for the :func:`scenario3.id_19.front_back`.
    """
		
    def test_front_back_1(self):
        """
        Test case 1 for :func:`scenario3.id_19.front_back`.
        """
        assert front_back('code') == 'eodc'

    def test_front_back_2(self):
        """
        Test case 2 for :func:`scenario3.id_19.front_back`.
        """
        assert front_back('a') == 'a'

    def test_front_back_3(self):
        """
        Test case 3 for :func:`scenario3.id_19.front_back`.
        """
        assert front_back('ab') == 'ba'

# id_20.java

/**
 * Given a string, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there.
 * Return a new string which is 3 copies of the front.
 *
 * <p>front3("Java") → "JavJavJav"
 * <p>front3("Chocolate") → "ChoChoCho"
 * <p>front3("abc") → "abcabcabc"
 */
public String front3(String str) {
  String front;
  if (str.length() >= 3) {
    front = str.substring(0, 3);
  } else {
    front = str;
  }
  return front + front + front;
}

# id_20.py


def front_3(string: str) -> str:
    """ Given a string, we'll say that the front is the first 3 chars of the string.
    If the string length is less than 3, the front is whatever is there.
    Return a new string which is 3 copies of the front.
    >>> front_3('Java')
    'JavJavJav'
    >>> front_3('Chocolate')
    'ChoChoCho'
    >>> front_3('abc')
    'abcabcabc'
    """

    pass

# id_20_Test.java
from scenario3.id_20 import front_3

import pytest

class id_20_Test:
    """
    Test class of id_20.py.
    It contains three unit test cases for the :func:`scenario3.id_20.front_3`.
    """
		
    def test_front_3_1(self):
        """
        Test case 1 for :func:`scenario3.id_20.front_3`.
        """
        assert front_3('Java') == 'JavJavJav'

    def test_front_3_2(self):
        """
        Test case 2 for :func:`scenario3.id_20.front_3`.
        """
        assert front_3('Chocolate') == 'ChoChoCho'

    def test_front_3_3(self):
        """
        Test case 3 for :func:`scenario3.id_20.front_3`.
        """
        assert front_3('abc') == 'abcabcabc'

# id_20_Test.py
from scenario3.id_20 import front_3

import pytest

class id_20_Test:
    """
    Test class of id_20.py.
    It contains three unit test cases for the :func:`scenario3.id_20.front_3`.
    """
		
    def test_front_3_1(self):
        """
        Test case 1 for :func:`scenario3.id_20.front_3`.
        """
        assert front_3('Java') == 'JavJavJav'

    def test_front_3_2(self):
        """
        Test case 2 for :func:`scenario3.id_20.front_3`.
        """
        assert front_3('Chocolate') == 'ChoChoCho'

    def test_front_3_3(self):
        """
        Test case 3 for :func:`scenario3.id_20.front_3`.
        """
        assert front_3('abc') == 'abcabcabc'

# id_21.java

/**
 * Given a string, take the last char and return a new string with the last char added at the front and back,
 * so "cat" yields "tcatt". The original string will be length 1 or more.
 *
 * <p>backAround("cat") → "tcatt"
 * <p>backAround("Hello") → "oHelloo"
 * <p>backAround("a") → "aaa"
 */
public String backAround(String str) {
  String last = str.substring(str.length() - 1);
  return last + str + last;
}

# id_21.py


def back_around(string: str) -> str:
    """ Given a string, take the last char and return a new string with the last char added at the front and back,
    so "cat" yields "tcatt". The original string will be length 1 or more.
    >>> back_around('cat')
    'tcatt'
    >>> back_around('Hello')
    'oHelloo'
    >>> back_around('a')
    'aaa'
    """

    pass

# id_21_Test.java
from scenario3.id_21 import back_around

import pytest

class id_21_Test:
    """
    Test class of id_21.py.
    It contains three unit test cases for the :func:`scenario3.id_21.back_around`.
    """
		
    def test_back_around_1(self):
        """
        Test case 1 for :func:`scenario3.id_21.back_around`.
        """
        assert back_around('cat') == 'tcatt'

    def test_back_around_2(self):
        """
        Test case 2 for :func:`scenario3.id_21.back_around`.
        """
        assert back_around('Hello') == 'oHelloo'

    def test_back_around_3(self):
        """
        Test case 3 for :func:`scenario3.id_21.back_around`.
        """
        assert back_around('a') == 'aaa'

# id_21_Test.py
from scenario3.id_21 import back_around

import pytest

class id_21_Test:
    """
    Test class of id_21.py.
    It contains three unit test cases for the :func:`scenario3.id_21.back_around`.
    """
		
    def test_back_around_1(self):
        """
        Test case 1 for :func:`scenario3.id_21.back_around`.
        """
        assert back_around('cat') == 'tcatt'

    def test_back_around_2(self):
        """
        Test case 2 for :func:`scenario3.id_21.back_around`.
        """
        assert back_around('Hello') == 'oHelloo'

    def test_back_around_3(self):
        """
        Test case 3 for :func:`scenario3.id_21.back_around`.
        """
        assert back_around('a') == 'aaa'

# id_22.java

/**
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 * Use the % "mod" operator -- see Introduction to Mod
 *
 * <p>or35(3) → true
 * <p>or35(10) → true
 * <p>or35(8) → false
 */
public boolean or35(int n) {
  return (n % 3 == 0) || (n % 5 == 0);
}

# id_22.py


def or_35(number: int) -> bool:
    """ Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    Use the % "mod" operator -- see Introduction to Mod
    >>> or_35(3)
    True
    >>> or_35(10)
    True
    >>> or_35(8)
    False
    """

    pass

# id_22_Test.java
from scenario3.id_22 import or_35

import pytest

class id_22_Test:
    """
    Test class of id_22.py.
    It contains three unit test cases for the :func:`scenario3.id_22.or_35`.
    """
		
    def test_or_35_1(self):
        """
        Test case 1 for :func:`scenario3.id_22.or_35`.
        """
        assert or_35(3) == True

    def test_or_35_