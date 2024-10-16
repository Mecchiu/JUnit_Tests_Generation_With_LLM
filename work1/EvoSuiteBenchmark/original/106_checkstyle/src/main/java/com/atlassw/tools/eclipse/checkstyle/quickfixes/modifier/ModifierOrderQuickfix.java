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

package com.atlassw.tools.eclipse.checkstyle.quickfixes.modifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jface.text.IRegion;
import org.eclipse.swt.graphics.Image;

import com.atlassw.tools.eclipse.checkstyle.quickfixes.AbstractASTResolution;
import com.atlassw.tools.eclipse.checkstyle.util.CheckstylePluginImages;

/**
 * Quickfix implementation that orders modifiers into the suggested order by the
 * JLS.
 * 
 * @author Lars K�dderitzsch
 */
public class ModifierOrderQuickfix extends AbstractASTResolution
{

    /**
     * List containing modifier keywords in the order proposed by Java Language
     * specification, sections 8.1.1, 8.3.1 and 8.4.3.
     */
    private static final List MODIFIER_ORDER = Arrays.asList(new Object[] {
        ModifierKeyword.PUBLIC_KEYWORD, ModifierKeyword.PROTECTED_KEYWORD,
        ModifierKeyword.PRIVATE_KEYWORD, ModifierKeyword.ABSTRACT_KEYWORD,
        ModifierKeyword.STATIC_KEYWORD, ModifierKeyword.FINAL_KEYWORD,
        ModifierKeyword.TRANSIENT_KEYWORD, ModifierKeyword.VOLATILE_KEYWORD,
        ModifierKeyword.SYNCHRONIZED_KEYWORD, ModifierKeyword.NATIVE_KEYWORD,
        ModifierKeyword.STRICTFP_KEYWORD, });

    /** The length of the javadoc comment declaration. */
    private static final int JAVADOC_COMMENT_LENGTH = 6;

    /**
     * Reorders the given list of <code>Modifier</code> nodes into their
     * suggested order by the JLS.
     * 
     * @param modifiers the list of modifiers to reorder
     * @return the reordered list of modifiers
     */
    public static List reOrderModifiers(List modifiers)
    {

        List copies = new ArrayList();
        Iterator it = modifiers.iterator();
        while (it.hasNext())
        {
            ASTNode mod = (ASTNode) it.next();
            copies.add(ASTNode.copySubtree(mod.getAST(), mod));
        }

        // oder modifiers to correct order
        Collections.sort(copies, new Comparator()
        {
            public int compare(Object arg0, Object arg1)
            {
                if (!(arg0 instanceof Modifier) || !(arg1 instanceof Modifier))
                {
                    return 0;
                }

                Modifier m1 = (Modifier) arg0;
                Modifier m2 = (Modifier) arg1;

                int modifierIndex1 = MODIFIER_ORDER.indexOf(m1.getKeyword());
                int modifierIndex2 = MODIFIER_ORDER.indexOf(m2.getKeyword());

                return new Integer(modifierIndex1).compareTo(new Integer(modifierIndex2));
            }
        });

        return copies;
    }

    /**
     * {@inheritDoc}
     */
    protected ASTVisitor handleGetCorrectingASTVisitor(final IRegion lineInfo,
            final int markerStartOffset)
    {

        return new ASTVisitor()
        {

            public boolean visit(TypeDeclaration node)
            {
                return visitBodyDecl(node);
            }

            public boolean visit(MethodDeclaration node)
            {
                return visitBodyDecl(node);
            }

            public boolean visit(FieldDeclaration node)
            {
                return visitBodyDecl(node);
            }

            public boolean visit(AnnotationTypeMemberDeclaration node)
            {
                return visitBodyDecl(node);
            }

            private boolean visitBodyDecl(BodyDeclaration node)
            {

                // recalculate start position because optional javadoc is mixed
                // into the original start position
                int pos = node.getStartPosition()
                        + (node.getJavadoc() != null ? node.getJavadoc().getLength()
                                + JAVADOC_COMMENT_LENGTH : 0);
                if (containsPosition(lineInfo, pos))
                {
                    List reorderedModifiers = reOrderModifiers(node.modifiers());
                    node.modifiers().clear();
                    node.modifiers().addAll(reorderedModifiers);
                }
                return true;
            }
        };
    }

    /**
     * {@inheritDoc}
     */
    public String getDescription()
    {
        return Messages.ModifierOrderQuickfix_description;
    }

    /**
     * {@inheritDoc}
     */
    public String getLabel()
    {
        return Messages.ModifierOrderQuickfix_label;
    }

    /**
     * {@inheritDoc}
     */
    public Image getImage()
    {
        return CheckstylePluginImages.getImage(CheckstylePluginImages.CORRECTION_CHANGE);
    }

}
