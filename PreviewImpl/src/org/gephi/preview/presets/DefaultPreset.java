/*
Copyright 2008-2010 Gephi
Authors : Mathieu Bastian <mathieu.bastian@gephi.org>
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
package org.gephi.preview.presets;

import org.gephi.preview.api.PreviewPreset;
import org.openide.util.NbBundle;

/**
 *
 * @author Mathieu Bastian
 */
public class DefaultPreset extends PreviewPreset {

    public DefaultPreset() {
        super(NbBundle.getMessage(DefaultPreset.class, "Default.name"));

        properties.put("showNodes", "true");
        properties.put("Directed_arrowAddedRadius", "65.0");
        properties.put("Directed_miniLabelColorizer", "parent");
        properties.put("Bidirectional_shortenLabelsFlag", "false");
        properties.put("Bidirectional_showArrowsFlag", "true");
        properties.put("Bidirectional_labelColorizer", "parent");
        properties.put("Bidirectional_arrowSize", "20.0");
        properties.put("Bidirectional_miniLabelFont", "Arial Plain 6");
        properties.put("Bidirectional_arrowAddedRadius", "65.0");
        properties.put("Bidirectional_baseLabelFont", "Arial Plain 10");
        properties.put("nodeLabelColorizer", "custom [0,0,0]");
        properties.put("nodeLabelBorderColorizer", "custom [255,255,255]");
        properties.put("Bidirectional_colorizer", "mixed");
        properties.put("Directed_labelColorizer", "parent");
        properties.put("showNodeLabelBorders", "false");
        properties.put("SelfLoop_showFlag", "true");
        properties.put("GlobalEdge_showFlag", "true");
        properties.put("Directed_miniLabelAddedRadius", "15.0");
        properties.put("showNodeLabels", "false");
        properties.put("proportionalLabelSize", "true");
        properties.put("Directed_colorizer", "source");
        properties.put("Undirected_rescaleWeight", "false");
        properties.put("Directed_miniLabelMaxChar", "10");
        properties.put("Undirected_shortenLabelsFlag", "false");
        properties.put("Directed_shortenLabelsFlag", "false");
        properties.put("Bidirectional_curvedFlag", "false");
        properties.put("baseNodeLabelFont", "Arial Plain 12");
        properties.put("Directed_showMiniLabelsFlag", "false");
        properties.put("Directed_arrowSize", "20.0");
        properties.put("SelfLoop_edgeScale", "1.0");
        properties.put("SelfLoop_rescaleWeight", "false");
        properties.put("SelfLoop_colorizer", "custom [0,0,0]");
        properties.put("Directed_showArrowsFlag", "true");
        properties.put("Undirected_baseLabelFont", "Arial Plain 10");
        properties.put("Directed_rescaleWeight", "false");
        properties.put("Undirected_showLabelsFlag", "false");
        properties.put("Directed_edgeScale", "1.0");
        properties.put("Undirected_labelMaxChar", "10");
        properties.put("shortenLabelsFlag", "false");
        properties.put("nodeLabelMaxChar", "10");
        properties.put("Undirected_colorizer", "mixed");
        properties.put("Bidirectional_miniLabelMaxChar", "10");
        properties.put("Directed_labelMaxChar", "10");
        properties.put("nodeBorderWidth", "1.0");
        properties.put("Undirected_labelColorizer", "parent");
        properties.put("Directed_arrowColorizer", "parent");
        properties.put("Bidirectional_arrowColorizer", "parent");
        properties.put("nodeBorderColorizer", "custom [0,0,0]");
        properties.put("Bidirectional_edgeScale", "1.0");
        properties.put("Bidirectional_labelMaxChar", "10");
        properties.put("Directed_showLabelsFlag", "false");
        properties.put("Bidirectional_miniLabelColorizer", "parent");
        properties.put("Directed_shortenMiniLabelsFlag", "false");
        properties.put("Bidirectional_shortenMiniLabelsFlag", "false");
        properties.put("Directed_curvedFlag", "true");
        properties.put("Undirected_curvedFlag", "false");
        properties.put("Bidirectional_miniLabelAddedRadius", "15.0");
        properties.put("nodeColorizer", "original");
        properties.put("Undirected_edgeScale", "1.0");
        properties.put("Directed_baseLabelFont", "Arial Plain 8");
        properties.put("Bidirectional_rescaleWeight", "false");
        properties.put("Bidirectional_showMiniLabelsFlag", "false");
        properties.put("Bidirectional_showLabelsFlag", "false");
        properties.put("Directed_miniLabelFont", "Arial Plain 6");
    }
}
