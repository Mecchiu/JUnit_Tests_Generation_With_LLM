# id_163_Test.java
from scenario3.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario3.id_163.generate_integers`.
    """


    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 0) == [0]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 1) == [0]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 2) == [0, 2]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 3) == [0, 2]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 4) == [0, 2, 4]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 5) == [0, 2, 4]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 6) == [0, 2, 4, 6]

# id_163_Test.py
from scenario3.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario3.id_163.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 0) == [0]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 1) == [0]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 2) == [0, 2]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 3) == [0, 2]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 4) == [0, 2, 4]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 5) == [0, 2, 4]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 6) == [0, 2, 4, 6]

# id_163_Test.rb
require 'minitest/autorun'
require_relative 'id_163'

class Id_163_Test < Minitest::Test
  def test_generate_integers_1
    assert_equal [2, 4, 6, 8], generate_integers(2, 8)
  end

  def test_generate_integers_2
    assert_equal [2, 4, 6, 8], generate_integers(8, 2)
  end

  def test_generate_integers_3
    assert_equal [], generate_integers(10, 14)
  end

  def test_generate_integers_4
    assert_equal [0], generate_integers(0, 0)
  end

  def test_generate_integers_5
    assert_equal [0], generate_integers(0, 1)
  end

  def test_generate_integers_6
    assert_equal [0, 2], generate_integers(0, 2)
  end

  def test_generate_integers_7
    assert_equal [0, 2], generate_integers(0, 3)
  end

  def test_generate_integers_8
    assert_equal [0, 2, 4], generate_integers(0, 4)
  end

  def test_generate_integers_9
    assert_equal [0, 2, 4], generate_integers(0, 5)
  end

  def test_generate_integers_10
    assert_equal [0, 2, 4, 6], generate_integers(0, 6)
  end
end

# id_163_Test.cs
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Tests
{
    public class Id_163_Test
    {
        [Test]
        public void Test_generate_integers_1()
        {
            Assert.AreEqual(new List<int> { 2, 4, 6, 8 }, Id_163.generate_integers(2, 8));
        }

        [Test]
        public void Test_generate_integers_2()
        {
            Assert.AreEqual(new List<int> { 2, 4, 6, 8 }, Id_163.generate_integers(8, 2));
        }

        [Test]
        public void Test_generate_integers_3()
        {
            Assert.AreEqual(new List<int> { }, Id_163.generate_integers(10, 14));
        }

        [Test]
        public