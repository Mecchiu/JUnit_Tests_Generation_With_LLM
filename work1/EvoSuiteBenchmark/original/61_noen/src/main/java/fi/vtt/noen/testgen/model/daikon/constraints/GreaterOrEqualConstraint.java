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
import fi.vtt.noen.testgen.model.daikon.constraints.DaikonConstraint;

import java.util.Collection;

/**
 * An invariant that says the contents of a variable are always greater or equal to a certain value. The
 * matched value may be a constant primitive value or the contents of another variable.
 * For example, if X is the name of the variable which this invariant describes, possibilities
 * include X >= 1, where X always has a value greater or equal to 1, and X >= Y, where the value of X always
 * is greater or equal to Y. 
 *
 * @author Teemu Kanstr�n
 */
public class GreaterOrEqualConstraint extends ConstraintWithAddition {
  private boolean leftArray = false;
  private boolean rightArray = false;

  public GreaterOrEqualConstraint(String left, String value) {
    if (parseLexical(value)) {
      return;
    }
    String fail = null;
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
    this.left = (ReferenceValue)DaikonParser.parseValueObject(left);
    this.right = DaikonParser.parseValueObject(value);
  }

  public String asAssert(String returnVar) {
    checkEnabled();
    return "assertTrue("+returnVar+additionToString(true)+" >= "+valueObjectToString(right)+additionToString(false)+");"+ln;
  }

  public double min() {
    if (right instanceof Number) {
      Number n = (Number) right;
      return n.doubleValue();
    }
    return super.min();
  }

  public double max() {
    return super.max();
  }

  public String toString() {
    checkEnabled();
    String lstr = left.toString();
    String rstr = right.toString();
    if (leftArray) {
      lstr = "sizeof("+lstr+")"+additionToString(true);
    }
    if (rightArray) {
      rstr = "sizeof("+rstr+")"+additionToString(false);
    }
    return lstr +" >= "+rstr;
  }

  public String toJava() {
    checkEnabled();
    String lstr = left.getReferredVariable();
    String rstr = valueObjectToString(right);
    if (leftArray) {
      lstr += ".size()";
    }
    if (rightArray) {
      rstr += ".size()";
    }
    lstr += additionToString(true);
    rstr += additionToString(false);
    return createCondition(lstr+" >= "+rstr);
  }

  protected String guardName() {
    return left.getReferredVariable()+"IsNotGreaterOrEqualThan"+valueObjectToGuardObject(right);
  }

  public String guardInvocation() {
    if (right instanceof Number) {
      Number n = (Number) right;
      if (n.intValue() == 0) {
        return "";
      }
      return "    if("+left.getReferredVariable()+".size() < "+n+") return false;"+ln;
    }
    return "";
  }
}
