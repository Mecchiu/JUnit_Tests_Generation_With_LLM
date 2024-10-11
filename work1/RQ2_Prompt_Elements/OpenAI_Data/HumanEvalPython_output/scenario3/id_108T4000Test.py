# id_108_Test.java
from scenario3.id_108 import count_nums

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario3.id_108.count_nums`.
    """


    def test_count_nums_1(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([]) == 0

    def test_count_nums_2(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, 11, -11]) == 1

    def test_count_nums_3(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([1, 1, 2]) == 3

    def test_count_nums_4(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2]) == 0

    def test_count_nums_5(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2]) == 0

    def test_count_nums_6(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3]) == 0

    def test_count_nums_7(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3]) == 0

    def test_count_nums_8(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4]) == 0

    def test_count_nums_9(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4, -4]) == 0

    def test_count_nums_10(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4, -4, -5]) == 0

# id_108_Test.py
from scenario3.id_108 import count_nums

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario3.id_108.count_nums`.
    """
		
    def test_count_nums_1(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([]) == 0

    def test_count_nums_2(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, 11, -11]) == 1

    def test_count_nums_3(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([1, 1, 2]) == 3

    def test_count_nums_4(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2]) == 0

    def test_count_nums_5(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2]) == 0

    def test_count_nums_6(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3]) == 0

    def test_count_nums_7(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3]) == 0

    def test_count_nums_8(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4]) == 0

    def test_count_nums_9(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4, -4]) == 0

    def test_count_nums_10(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4, -4, -5]) == 0

# id_108_Test.rb
require 'minitest/autorun'
require_relative '../scenario3/id_108'

class Id_108_Test < Minitest::Test
  """
  Test class of id_108.rb.
  It contains ten unit test cases for the :func:`scenario3.id_108.count_nums`.
  """
		
  def test_count_nums_1
    """
    Test case for the function :func:`scenario3.id_108.count_nums`.
    """
    assert_equal(count_nums([]), 0)
  end

  def test_count_nums_2
    """
    Test case for the function :func:`scenario3.id_108.count_nums`.
    """
    assert_equal(count_nums([-1, 11, -11]), 1)
  end

  def test_count_nums_3
    """
    Test case for the function :func:`scenario3.id_108.count_nums`.
    """
    assert_equal(count_nums([1, 1, 2]), 3)
  end

  def test_count_nums_4
    """
    Test case for the function :func:`scenario3.id_108.count_nums`.
    """
    assert_equal(count_nums([-1, -1, -2]), 0)
  end

  def test_count_nums_5
    """
    Test case for the function :func:`scenario3.id_108.count_nums`.
    """
    assert_equal(count_nums([-1, -1, -2, -2]), 0)
  end

  def test_count_nums_6
    """
    Test case for the function :func:`scenario3.id_108.count_nums`.
    """
    assert_equal(count_nums([-1, -1, -2, -2, -3]), 0)
  end

  def test_count_nums_7
    """
    Test case for the function :func:`scenario3.id_108.count_nums`.
    """
    assert_equal(count_nums([-1, -1, -2, -2, -3, -3]), 0)
  end

  def test_count_nums_8
    """
    Test case for the function :func:`scenario3.id_108.count_nums`.
    """
    assert_equal(count_nums([-1, -1, -2, -2, -3, -3, -4]), 0)
  end

  def test_count_nums_9
    """
    Test case for the function :func:`scenario3.id_108.count_nums`.
    """
    assert_equal(count_nums([-1, -1, -2, -2, -3, -3, -4, -4]), 0)
  end

  def test_count_nums_10
    """
    Test case for the function :func:`scenario3.id_108.count_nums`.
    """
    assert_equal(count_nums([-1, -1, -2, -2, -3, -3, -4, -4, -5]), 0)
  end

# id_108_Test.cs
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestStack.White;
using TestStack.White.UIItems;
using TestStack.White.UIItems.Finders;
using TestStack.White.UIItems.WindowItems;
using TestStack.White.UIItems.ListBoxItems;
using TestStack.White.UIItems.TreeItems;
using TestStack.White.UIItems.TableItems;
using TestStack.White.UIItems.WPFUIItems;
using TestStack.White.UIItems.MenuItems;
using TestStack.White.UIItems.Container;
using TestStack.White.UIItems.InputControls;
using TestStack.White.UIItems.Custom;
using TestStack.White.UIItems.ListViewItems;
using TestStack.White.UIItems.Actions;
using TestStack.White.UIItems.Scrolling;
using TestStack.White.UIItems.TabItems;
using TestStack.White.UIItems.WindowStripControls;
using TestStack.White.UIItems.PropertyGridItems;
using TestStack.White.UIItems.Finders;
using TestStack.White.UIItems.TreeItems;
using TestStack.White.UIItems.ListViewItems;
using TestStack.White.UIItems.WPFUIItems;
using TestStack.White.UIItems.MenuItems;
using TestStack.White.UIItems.Container;
using TestStack.White.UIItems.InputControls;
using TestStack.White.UIItems.Custom;
using TestStack.White.UIItems.Actions;
using TestStack.White.UIItems.Scrolling;
using TestStack.White.UIItems.TabItems;
using TestStack.White.UIItems.WindowStripControls;
using TestStack.White.UIItems.PropertyGridItems;
using TestStack.White.UIItems.Finders;
using TestStack.White.UIItems.TreeItems;
using TestStack.White.UIItems.ListViewItems;
using TestStack.White.UIItems.WPFUIItems;
using TestStack.White.UIItems.MenuItems;
using TestStack.White.UIItems.Container;
using TestStack.White.UIItems.InputControls;
using TestStack.White.UIItems.Custom;
using TestStack.White.UIItems.Actions;
using TestStack.White.UIItems.Scrolling;
using TestStack.White.UIItems.TabItems;
using TestStack.White.UIItems.WindowStripControls;
using TestStack.White.UIItems.PropertyGridItems;
using TestStack.White.UIItems.Finders;
using TestStack.White.UIItems.TreeItems;
using TestStack.White.UIItems.ListViewItems;
using TestStack.White.UIItems.WPFUIItems;
using TestStack.White.UIItems.MenuItems;
using TestStack.White.UIItems.Container;
using TestStack.White.UIItems.InputControls;
using TestStack.White.UIItems.Custom;
using TestStack.White.UIItems.Actions;
using TestStack.White.UIItems.Scrolling;
using TestStack.White.UIItems.TabItems;
using TestStack.White.UIItems.WindowStripControls;
using TestStack.White.UIItems.PropertyGridItems;
using TestStack.White.UIItems.Finders;
using TestStack.White.UIItems.TreeItems;
using TestStack.White.UIItems.ListViewItems;
using TestStack.White.UIItems.WPFUIItems;
using TestStack.White.UIItems.MenuItems;
using TestStack.White.UIItems.Container;
using TestStack.White.UIItems.InputControls;
using TestStack.White.UIItems.Custom;
using TestStack.White.UIItems.Actions;
using TestStack.White.UIItems.Scrolling;
using TestStack.White.UIItems.TabItems;
using TestStack.White.UIItems.WindowStripControls;
using TestStack.White.UIItems.PropertyGridItems;
using TestStack.White.UIItems.Finders;
using TestStack.White.UIItems.TreeItems;
using TestStack.White.UIItems.ListViewItems;
using TestStack.White.UIItems.WPFUIItems;
using TestStack.White.UIItems.MenuItems;
using TestStack.White.UIItems.Container;
using TestStack.White.UIItems.InputControls;
using TestStack.White.UIItems.Custom;
using TestStack.White.UIItems.Actions;
using TestStack.White.UIItems.Scrolling;
using TestStack.White.UIItems.TabItems;
using TestStack.White.UIItems.WindowStripControls;
using TestStack.White.UIItems.PropertyGridItems;
using TestStack.White.UIItems.Finders;
using TestStack.White.UIItems.TreeItems;
using TestStack.White.UIItems.ListViewItems;
using TestStack.White.UIItems.WPFUIItems;
using TestStack.White.UIItems.MenuItems;
using TestStack.White.UIItems.Container;
using TestStack.White.UIItems.InputControls;
using TestStack.White.UIItems.Custom;
using TestStack.White.UIItems.Actions;
using TestStack.White.UIItems.Scrolling;
using TestStack.White.UIItems.TabItems;
using TestStack.White.UIItems.WindowStripControls;
using TestStack.White.UIItems.PropertyGridItems;
using TestStack.White.UIItems.Finders;
using TestStack.White.UIItems.TreeItems;
using TestStack.White.UIItems.ListViewItems;
using TestStack.White.UIItems.WPFUIItems;
using TestStack.White.UIItems.MenuItems;
using TestStack.White.UIItems.Container;
using TestStack.White.UIItems.InputControls;
using TestStack.White.UIItems.Custom;
using TestStack.White.UIItems.Actions;
using TestStack.White.UIItems.Scrolling;
using TestStack.White.UIItems.TabItems;
using TestStack.White.UIItems.WindowStripControls;
using TestStack.White.UIItems.PropertyGridItems;
using TestStack.White.UIItems.Finders;
using TestStack.White.UIItems.TreeItems;
using TestStack.White.UIItems.ListViewItems;
using TestStack.White.UIItems.WPFUIItems;
using TestStack.White.UIItems.MenuItems;
using TestStack.White.UIItems.Container;
using TestStack.White.UIItems.InputControls;
using TestStack.White.UIItems.Custom;
using TestStack.White.UIItems.Actions;
using TestStack.White.UIItems.Scrolling;
using TestStack.White.UIItems.TabItems;
using TestStack.White.UIItems.WindowStripControls;
using TestStack.White.UIItems.PropertyGridItems;
using TestStack.White.UIItems.Finders;
using TestStack.White.UIItems.TreeItems;
using TestStack.White.UIItems.ListViewItems;
using TestStack.White.UIItems.WPFUIItems;
using TestStack.