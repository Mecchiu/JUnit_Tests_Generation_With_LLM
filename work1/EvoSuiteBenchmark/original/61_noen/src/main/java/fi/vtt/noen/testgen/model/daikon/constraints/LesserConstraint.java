/*
 * Copyright (C) 2009 VTT Technical Research Centre of Finland.
 *
 * This file is part of NOEN framework.
 *
 * NOEN framework is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 2.
 *
 * NOEN framework is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package fi.vtt.noen.testgen.model.daikon.constraints;

import fi.vtt.noen.testgen.parser.DaikonParser;

/**
 * An invariant that says the contents of a variable are always less than a certain value. The
 * matched value may be a constant primitive value or the contents of another variable.
 * For example, if X is the name of the variable which this invariant describes, possibilities
 * include X < 1, where X always has a value less than 1, and X < Y, where the value of X always
 * is less than that of Y. 
 *
 * @author Teemu Kanstr�n
 */public class LesserConstraint extends ConstraintWithAddition {
  private boolean rightArray = false;
  private boolean leftArray = false;

  public LesserConstraint(String left, String value) {
    if (parseLexical(value)) {
      return;
    }
    if (left.startsWith("size")) {
      leftArray = true;
      parseAddition(left, true);
      left = parseArrayName(left);
    }
    if (value.startsWith("size")) {
      rightArray = true;
      parseAddition(value, false);
      value = parseArrayName(value);
    }
    this.left = (ReferenceValue) DaikonParser.parseValueObject(left);
    this.right = DaikonParser.parseValueObject(value);
  }

  public double min() {
    return super.min();
  }

  public double max() {
    if (right instanceof Number) {
      Number n = (Number) right;
      return n.doubleValue();
    }
    return super.max();
  }

  public String asAssert(String returnVar) {
    checkEnabled();
    return "assertTrue("+returnVar+" < "+valueObjectToString(right)+");"+ln;
  }

  public String toString() {
    checkEnabled();
    String lstr = left.toString();
    String rstr = right.toString();
    if (leftArray) {
      lstr = "sizeof("+left+")";
    }
    if (rightArray) {
      rstr = "sizeof("+right+")";
    }
    lstr += additionToString(true);
    rstr += additionToString(false);
    return lstr +" < "+rstr;
  }

  protected String toJava() {
    checkEnabled();
    String lstr = left.getReferredVariable();
    if (!(right instanceof ReferenceValue)) {
      return createCondition(lstr+" < "+valueObjectToString(right));
    }
    String rstr = ((ReferenceValue)right).getReferredVariable();
    if (leftArray) {
      lstr += ".size()";
    }
    if (rightArray) {
      rstr += ".size()";
    }
    lstr += additionToString(true);
    rstr += additionToString(false);
    return createCondition(lstr+" < "+rstr);
  }

  protected String guardName() {
    return left.getReferredVariable()+"IsNotLesserThan"+valueObjectToGuardObject(right);
  }
}
