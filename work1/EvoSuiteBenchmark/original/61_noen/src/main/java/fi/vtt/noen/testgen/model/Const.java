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

package fi.vtt.noen.testgen.model;

import fi.vtt.noen.testgen.observations.data.Event;

/**
 * This should contain constant values related to model generation.. More should be moved here.
 *
 * @author Teemu Kanstr�n
 */
public interface Const {
  public static final String INITIAL_STATE_NAME = "Init";
  public static final Event INITIAL_STATE = new Event(INITIAL_STATE_NAME);
}
