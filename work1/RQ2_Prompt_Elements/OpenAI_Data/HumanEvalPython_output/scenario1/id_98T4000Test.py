# id_98_Test.java
from scenario1.id_98 import count_upper

import pytest

class id_98_Test:
    """
    Test class of id_98.py.
    It contains ten unit test cases for the :func:`scenario1.id_98.count_upper`.
    """


    def test_count_upper_1(self):
        """
        Test case 1 for :func:`scenario1.id_98.count_upper`.
        """
        assert count_upper("") == 0

    def test_count_upper_2(self):
        """
        Test case 2 for :func:`scenario1.id_98.count_upper`.
        """
        assert count_upper("a") == 0

    def test_count_upper_3(self):
        """
        Test case 3 for :func:`scenario1.id_98.count_upper`.
        """
        assert count_upper("A") == 1

    def test_count_upper_4(self):
        """
        Test case 4 for :func:`scenario1.id_98.count_upper`.
        """
        assert count_upper("aA") == 1

    def test_count_upper_5(self):
        """
        Test case 5 for :func:`scenario1.id_98.count_upper`.
        """
        assert count_upper("aAa") == 1

    def test_count_upper_6(self):
        """
        Test case 6 for :func:`scenario1.id_98.count_upper`.
        """
        assert count_upper("aAaA") == 2

    def test_count_upper_7(self):
        """
        Test case 7 for :func:`scenario1.id_98.count_upper`.
        """
        assert count_upper("aAaAa") == 2

    def test_count_upper_8(self):
        """
        Test case 8 for :func:`scenario1.id_98.count_upper`.
        """
        assert count_upper("aAaAaA") == 3

    def test_count_upper_9(self):
        """
        Test case 9 for :func:`scenario1.id_98.count_upper`.
        """
        assert count_upper("aAaAaAa") == 3

    def test_count_upper_10(self):
        """
        Test case 10 for :func:`scenario1.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaA") == 4

# id_99.py

def count_upper(s):

    count = 0
    for i in range(0,len(s),2):
        if s[i] in "AEIOU":
            count += 1
    return count

# id_99_Test.java
from scenario1.id_99 import count_upper

import pytest

class id_99_Test:
    """
    Test class of id_99.py.
    It contains ten unit test cases for the :func:`scenario1.id_99.count_upper`.
    """
		
    def test_count_upper_1(self):
        """
        Test case 1 for :func:`scenario1.id_99.count_upper`.
        """
        assert count_upper("") == 0

    def test_count_upper_2(self):
        """
        Test case 2 for :func:`scenario1.id_99.count_upper`.
        """
        assert count_upper("a") == 0

    def test_count_upper_3(self):
        """
        Test case 3 for :func:`scenario1.id_99.count_upper`.
        """
        assert count_upper("A") == 1

    def test_count_upper_4(self):
        """
        Test case 4 for :func:`scenario1.id_99.count_upper`.
        """
        assert count_upper("aA") == 1

    def test_count_upper_5(self):
        """
        Test case 5 for :func:`scenario1.id_99.count_upper`.
        """
        assert count_upper("aAa") == 1

    def test_count_upper_6(self):
        """
        Test case 6 for :func:`scenario1.id_99.count_upper`.
        """
        assert count_upper("aAaA") == 2

    def test_count_upper_7(self):
        """
        Test case 7 for :func:`scenario1.id_99.count_upper`.
        """
        assert count_upper("aAaAa") == 2

    def test_count_upper_8(self):
        """
        Test case 8 for :func:`scenario1.id_99.count_upper`.
        """
        assert count_upper("aAaAaA") == 3

    def test_count_upper_9(self):
        """
        Test case 9 for :func:`scenario1.id_99.count_upper`.
        """
        assert count_upper("aAaAaAa") == 3

    def test_count_upper_10(self):
        """
        Test case 10 for :func:`scenario1.id_99.count_upper`.
        """
        assert count_upper("aAaAaAaA") == 4

# id_100.py

def count_upper(s):

    count = 0
    for i in range(0,len(s),2):
        if s[i] in "AEIOU":
            count += 1
    return count

# id_100_Test.java
from scenario1.id_100 import count_upper

import pytest

class id_100_Test:
    """
    Test class of id_100.py.
    It contains ten unit test cases for the :func:`scenario1.id_100.count_upper`.
    """
		
    def test_count_upper_1(self):
        """
        Test case 1 for :func:`scenario1.id_100.count_upper`.
        """
        assert count_upper("") == 0

    def test_count_upper_2(self):
        """
        Test case 2 for :func:`scenario1.id_100.count_upper`.
        """
        assert count_upper("a") == 0

    def test_count_upper_3(self):
        """
        Test case 3 for :func:`scenario1.id_100.count_upper`.
        """
        assert count_upper("A") == 1

    def test_count_upper_4(self):
        """
        Test case 4 for :func:`scenario1.id_100.count_upper`.
        """
        assert count_upper("aA") == 1

    def test_count_upper_5(self):
        """
        Test case 5 for :func:`scenario1.id_100.count_upper`.
        """
        assert count_upper("aAa") == 1

    def test_count_upper_6(self):
        """
        Test case 6 for :func:`scenario1.id_100.count_upper`.
        """
        assert count_upper("aAaA") == 2

    def test_count_upper_7(self):
        """
        Test case 7 for :func:`scenario1.id_100.count_upper`.
        """
        assert count_upper("aAaAa") == 2

    def test_count_upper_8(self):
        """
        Test case 8 for :func:`scenario1.id_100.count_upper`.
        """
        assert count_upper("aAaAaA") == 3

    def test_count_upper_9(self):
        """
        Test case 9 for :func:`scenario1.id_100.count_upper`.
        """
        assert count_upper("aAaAaAa") == 3

    def test_count_upper_10(self):
        """
        Test case 10 for :func:`scenario1.id_100.count_upper`.
        """
        assert count_upper("aAaAaAaA") == 4

# id_101.py

def count_upper(s):

    count = 0
    for i in range(0,len(s),2):
        if s[i] in "AEIOU":
            count += 1
    return count

# id_101_Test.java
from scenario1.id_101 import count_upper

import pytest

class id_101_Test:
    """
    Test class of id_101.py.
    It contains ten unit test cases for the :func:`scenario1.id_101.count_upper`.
    """
		
    def test_count_upper_1(self):
        """
        Test case 1 for :func:`scenario1.id_101.count_upper`.
        """
        assert count_upper("") == 0

    def test_count_upper_2(self):
        """
        Test case 2 for :func:`scenario1.id_101.count_upper`.
        """
        assert count_upper("a") == 0

    def test_count_upper_3(self):
        """
        Test case 3 for :func:`scenario1.id_101.count_upper`.
        """
        assert count_upper("A") == 1

    def test_count_upper_4(self):
        """
        Test case 4 for :func:`scenario1.id_101.count_upper`.
        """
        assert count_upper("aA") == 1

    def test_count_upper_5(self):
        """
        Test case 5 for :func:`scenario1.id_101.count_upper`.
        """
        assert count_upper("aAa") == 1

    def test_count_upper_6(self):
        """
        Test case 6 for :func:`scenario1.id_101.count_upper`.
        """
        assert count_upper("aAaA") == 2

    def test_count_upper_7(self):
        """
        Test case 7 for :func:`scenario1.id_101.count_upper`.
        """
        assert count_upper("aAaAa") == 2

    def test_count_upper_8(self):
        """
        Test case 8 for :func:`scenario1.id_101.count_upper`.
        """
        assert count_upper("aAaAaA") == 3

    def test_count_upper_9(self):
        """
        Test case 9 for :func:`scenario1.id_101.count_upper`.
        """
        assert count_upper("aAaAaAa") == 3

    def test_count_upper_10(self):
        """
        Test case 10 for :func:`scenario1.id_101.count_upper`.
        """
        assert count_upper("aAaAaAaA") == 4

# id_102.py

def count_upper(s):

    count = 0
    for i in range(0,len(s),2):
        if s[i] in "AEIOU":
            count += 1
    return count

# id_102_Test.java
from scenario1.id_102 import count_upper

import pytest

class id_102_Test:
    """
    Test class of id_102.py.
    It contains ten unit test cases for the :func:`scenario1.id_102.count_upper`.
    """
		
    def test_count_upper_1(self):
        """
        Test case 1 for :func:`scenario1.id_102.count_upper`.
        """
        assert count_upper("") == 0

    def test_count_upper_2(self):
        """
        Test case 2 for :func:`scenario1.id_102.count_upper`.
        """
        assert count_upper("a") == 0

    def test_count_upper_3(self):
        """
        Test case 3 for :func:`scenario1.id_102.count_upper`.
        """
        assert count_upper("A") == 1

    def test_count_upper_4(self):
        """
        Test case 4 for :func:`scenario1.id_102.count_upper`.
        """
        assert count_upper("aA") == 1

    def test_count_upper_5(self):
        """
        Test case 5 for :func:`scenario1.id_102.count_upper`.
        """
        assert count_upper("aAa") == 1

    def test_count_upper_6(self):
        """
        Test case 6 for :func:`scenario1.id_102.count_upper`.
        """
        assert count_upper("aAaA") == 2

    def test_count_upper_7(self):
        """
        Test case 7 for :func:`scenario1.id_102.count_upper`.
        """
        assert count_upper("aAaAa") == 2

    def test_count_upper_8(self):
        """
        Test case 8 for :func:`scenario1.id_102.count_upper`.
        """
        assert count_upper("aAaAaA") == 3

    def test_count_upper_9(self):
        """
        Test case 9 for :func:`scenario1.id_102.count_upper`.
        """
        assert count_upper("aAaAaAa") == 3

    def test_count_upper_10(self):
        """
        Test case 10 for :func:`scenario1.id_102.count_upper`.
        """
        assert count_upper("aAaAaAaA") == 4

# id_103.py

def count_upper(s):

    count = 0
    for i in range(0,len(s),2):
        if s[i] in "AEIOU":
            count += 1
    return count

# id_103_Test.java
from scenario1.id_103 import count_upper

import pytest

class id_103_Test:
    """
    Test class of id_103.py.
    It contains ten unit test cases for the :func:`scenario1.id_103.count_upper`.
    """
		
    def test_count_upper_1(self):
        """
        Test case 1 for :func:`scenario1.id_103.count_upper`.
        """
        assert count_upper("") == 0

    def test_count_upper_2(self):
        """
        Test case 2 for :func:`scenario1.id_103.count_upper`.
        """
        assert count_upper("a") == 0

    def test_count_upper_3(self):
        """
        Test case 3 for :func:`scenario1.id_103.count_upper`.
        """
        assert count_upper("A") == 1

    def test_count_upper_4(self):
        """
        Test case 4 for :func:`scenario1.id_103.count_upper`.
        """
        assert count_upper("aA") == 1

    def test_count_upper_5(self):
        """
        Test case 5 for :func:`scenario1.id_103.count_upper`.
        """
        assert count_upper("aAa") == 1

    def test_count_upper_6(self):
        """
        Test case 6 for :func:`scenario1.id_103.count_upper`.
        """
        assert count_upper("aAaA") == 2

    def test_count_upper_7(self):
        """
        Test case 7 for :func:`scenario1.id_103.count_upper`.
        """
        assert count_upper("aAaAa") == 2

    def test_count_upper_8(self):
        """
        Test case 8 for :func:`scenario1.id_103.count_upper`.
        """
        assert count_upper("aAaAaA") == 3

    def test_count_upper_9(self):
        """
        Test case 9 for :func:`scenario1.id_103.count_upper`.
        """
        assert count_upper("aAaAaAa") == 3

    def test_count_upper_10(self):
        """
        Test case 10 for :func:`scenario1.id_103.count_upper`.
        """
        assert count_upper("aAaAaAaA") == 4

# id_104.py

def count_