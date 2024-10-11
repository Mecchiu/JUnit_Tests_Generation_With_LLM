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

   