/*
Copyright 2008-2010 Gephi
Authors : Jeremy Subtil <jeremy.subtil@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.gephi.preview.api;

/**
 * Interface of a color.
 *
 * @author Jérémy Subtil <jeremy.subtil@gephi.org>
 */
public interface Color {

    /**
     * Returns the red component.
     *
     * @return the red component
     */
    public Integer getRed();

    /**
     * Returns the green component.
     *
     * @return the green component
     */
    public Integer getGreen();

    /**
     * Returns the blue component.
     *
     * @return the blue component
     */
    public Integer getBlue();

    /**
     * Formats the color as an hex string.
     *
     * @return  the color formatted as an hex string
     */
    public String toHexString();
}
