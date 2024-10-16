/*
 * Copyright (C) 2010-2011 VTT Technical Research Centre of Finland.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation;
 * version 2.1 of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package fi.vtt.noen.mfw.integrationtests.agent.server;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import java.util.Properties;

/**
 * @author Teemu Kanstren
 */
public class TesterActivator implements BundleActivator {
  public void start(BundleContext bc) throws Exception {
    OSGITester tester = new OSGITesterImpl(bc);
    Properties props = new Properties();
    //these properties do not really mean anything atm. They are here just for the kicks.
    props.put("version", "1.0");
    bc.registerService(OSGITester.class.getName(), tester, props);
  }

  public void stop(BundleContext bundleContext) throws Exception {

  }


}
