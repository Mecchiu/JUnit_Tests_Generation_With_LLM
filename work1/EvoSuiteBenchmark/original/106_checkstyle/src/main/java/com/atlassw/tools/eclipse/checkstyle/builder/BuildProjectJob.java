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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.osgi.util.NLS;

import com.atlassw.tools.eclipse.checkstyle.Messages;
import com.atlassw.tools.eclipse.checkstyle.nature.CheckstyleNature;

/**
 * Operation which builds a project.
 * 
 * @author Lars K�dderitzsch
 */
public class BuildProjectJob extends Job
{

    //
    // attributes
    //

    /** the project to build. */
    private IProject[] mProjects;

    /** the build kind. */
    private int mKind;

    //
    // constructors
    //

    /**
     * Creates an operation which builds a project.
     * 
     * @param project the project to build
     * @param buildKind the kind of build to do
     */
    public BuildProjectJob(IProject project, int buildKind)
    {
        super(NLS.bind(Messages.BuildProjectJob_msgBuildProject, project.getName()));
        mProjects = new IProject[] { project };
        mKind = buildKind;
    }

    /**
     * Creates an operation which builds a set of project.
     * 
     * @param projects the projects to build
     * @param buildKind the kind of build to do
     */
    public BuildProjectJob(IProject[] projects, int buildKind)
    {
        super(Messages.BuildProjectJob_msgBuildAllProjects);

        mProjects = projects;
        mKind = buildKind;
    }

    //
    // methods
    //

    /**
     * {@inheritDoc}
     */
    public IStatus run(IProgressMonitor monitor)
    {

        IStatus status = null;

        try
        {

            for (int i = 0; i < mProjects.length; i++)
            {

                // build only if open and checkstyle active for the project
                if (mProjects[i].isOpen() && mProjects[i].hasNature(CheckstyleNature.NATURE_ID))
                {
                    mProjects[i].build(mKind, monitor);
                }
            }
            status = Status.OK_STATUS;
        }
        catch (CoreException e)
        {
            status = e.getStatus();
        }
        finally
        {
            monitor.done();
        }

        return status;
    }
}