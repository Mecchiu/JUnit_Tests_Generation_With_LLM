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

package fi.vtt.noen.mfw.bundle.server.plugins.sac.sacclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.0
 * Mon Jan 03 12:17:56 EET 2011
 * Generated source version: 2.3.0
 * 
 */
 
@WebService(targetNamespace = "http://www.bugyobeyond.org/MFW_SAC/", name = "MFW_SAC")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MFWSAC {

    @WebResult(name = "OperationResult", targetNamespace = "http://www.bugyobeyond.org/MFW_SAC/", partName = "parameters")
    @WebMethod
    public OperationResult setAvailability(
        @WebParam(partName = "parameters", name = "Availability", targetNamespace = "http://www.bugyobeyond.org/MFW_SAC/")
        Availability parameters
    );

    @WebResult(name = "SAC", targetNamespace = "http://www.bugyobeyond.org/MFW_SAC/", partName = "parameters")
    @WebMethod
    public SAC getSAC(
        @WebParam(partName = "parameters", name = "getSAC", targetNamespace = "http://www.bugyobeyond.org/MFW_SAC/")
        GetSAC parameters
    );

    @WebResult(name = "OperationResult", targetNamespace = "http://www.bugyobeyond.org/MFW_SAC/", partName = "parameters")
    @WebMethod
    public OperationResult setBMResults(
        @WebParam(partName = "parameters", name = "BMResults", targetNamespace = "http://www.bugyobeyond.org/MFW_SAC/")
        BMResults parameters
    );
}
