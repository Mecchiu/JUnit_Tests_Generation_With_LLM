//============================================================================
//
// Copyright (C) 2002-2007  David Schneider, Lars K�dderitzsch
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//============================================================================

package com.atlassw.tools.eclipse.checkstyle.builder;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.texteditor.IAnnotationImageProvider;

import com.atlassw.tools.eclipse.checkstyle.util.CheckstylePluginImages;

/**
 * Image provider for Checkstyle markers.
 * 
 * @author Lars K�dderitzsch
 */
public class CheckstyleMarkerImageProvider implements IAnnotationImageProvider
{

    /**
     * {@inheritDoc}
     */
    public Image getManagedImage(Annotation annotation)
    {
        String type = annotation.getType();
        if (CheckstyleMarker.ERROR_TYPE.equals(type))
        {
            return CheckstylePluginImages.getImage(CheckstylePluginImages.MARKER_ERROR);
        }
        else if (CheckstyleMarker.WARNING_TYPE.equals(type))
        {
            return CheckstylePluginImages.getImage(CheckstylePluginImages.MARKER_WARNING);
        }
        else if (CheckstyleMarker.INFO_TYPE.equals(type))
        {
            return CheckstylePluginImages.getImage(CheckstylePluginImages.MARKER_INFO);
        }

        return null;
    }

    /**
     * {@inheritDoc}
     */
    public String getImageDescriptorId(Annotation annotation)
    {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public ImageDescriptor getImageDescriptor(String imageDescritporId)
    {
        return null;
    }
}