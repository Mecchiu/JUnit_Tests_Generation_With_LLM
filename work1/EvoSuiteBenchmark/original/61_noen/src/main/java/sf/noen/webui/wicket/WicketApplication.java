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

package sf.noen.webui.wicket;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.Request;
import org.apache.wicket.Response;

/**
 * @author Teemu Kanstr�n
 */
public class WicketApplication extends WebApplication {
  public Class<? extends Page> getHomePage() {
	return StartPage.class;
  }

  @Override
  public Session newSession(Request request, Response response) {
    return new NoenSession(request);
  }
}
