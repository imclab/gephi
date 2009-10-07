/*
Copyright 2008 WebAtlas
Authors : Mathieu Bastian, Mathieu Jacomy, Julian Bilcke
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.ui.ranking.transformer;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.gephi.ranking.ColorTransformer;
import org.gephi.ranking.Transformer;
import org.gephi.ui.components.JRangeSlider;
import org.gephi.ui.components.gradientslider.GradientSlider;

/**
 * @author Mathieu Bastian
 */
public class ColorTransformerPanel extends javax.swing.JPanel {

    private static final int SLIDER_MAXIMUM = 100;
    private ColorTransformer colorTransformer;

    public ColorTransformerPanel(Transformer transformer) {
        initComponents();

        colorTransformer = (ColorTransformer) transformer;

        //Gradient
        final GradientSlider gradientSlider = new GradientSlider(GradientSlider.HORIZONTAL, colorTransformer.getColorPositions(), colorTransformer.getColors());
        gradientSlider.putClientProperty("GradientSlider.includeOpacity", "false");
        gradientSlider.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                Color[] colors = gradientSlider.getColors();
                float[] positions = gradientSlider.getThumbPositions();
                colorTransformer.setColors(Arrays.copyOf(colors, colors.length));
                colorTransformer.setColorPositions(Arrays.copyOf(positions, positions.length));
            }
        });
        gradientPanel.add(gradientSlider);

        //Range
        JRangeSlider slider = (JRangeSlider) rangeSlider;
        slider.setMinimum(0);
        slider.setMaximum(SLIDER_MAXIMUM);
        slider.setValue(0);
        slider.setUpperValue(SLIDER_MAXIMUM);
        slider.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                JRangeSlider source = (JRangeSlider) e.getSource();
                if (!source.getValueIsAdjusting()) {
                    setRangeValues();
                }
            }
        });
        refreshRangeValues();
    }

    private void setRangeValues() {
        JRangeSlider slider = (JRangeSlider) rangeSlider;
        Object minVal = colorTransformer.getMinimumValue();
        Object maxVal = colorTransformer.getMaximumValue();
        if (minVal instanceof Float) {
            Float low = slider.getValue() * ((Float) maxVal - (Float) minVal) / SLIDER_MAXIMUM;
            Float up = slider.getUpperValue() * ((Float) maxVal - (Float) minVal) / SLIDER_MAXIMUM;
            colorTransformer.setLowerBound(low);
            colorTransformer.setUpperBound(up);
        } else if (minVal instanceof Double) {
            Double low = slider.getValue() * ((Double) maxVal - (Double) minVal) / SLIDER_MAXIMUM;
            Double up = slider.getUpperValue() * ((Double) maxVal - (Double) minVal) / SLIDER_MAXIMUM;
            colorTransformer.setLowerBound(low);
            colorTransformer.setUpperBound(up);
        } else if (minVal instanceof Integer) {
            Integer low = slider.getValue() * ((Integer) maxVal - (Integer) minVal) / SLIDER_MAXIMUM;
            Integer up = slider.getUpperValue() * ((Integer) maxVal - (Integer) minVal) / SLIDER_MAXIMUM;
            colorTransformer.setLowerBound(low);
            colorTransformer.setUpperBound(up);
        } else if (minVal instanceof Long) {
            Integer low = slider.getValue() * ((Integer) maxVal - (Integer) minVal) / SLIDER_MAXIMUM;
            Integer up = slider.getUpperValue() * ((Integer) maxVal - (Integer) minVal) / SLIDER_MAXIMUM;
            colorTransformer.setLowerBound(low);
            colorTransformer.setUpperBound(up);
        }
    }

    private void refreshRangeValues() {
        JRangeSlider slider = (JRangeSlider) rangeSlider;
        Object minVal = colorTransformer.getMinimumValue();
        Object maxVal = colorTransformer.getMaximumValue();
        if (minVal instanceof Float) {
            slider.setValue((int)(((Float)colorTransformer.getLowerBound())*SLIDER_MAXIMUM/((Float) maxVal - (Float) minVal)));
            slider.setUpperValue((int)(((Float)colorTransformer.getUpperBound())*SLIDER_MAXIMUM/((Float) maxVal - (Float) minVal)));
        } else if (minVal instanceof Double) {
            slider.setValue((int)(((Double)colorTransformer.getLowerBound())*SLIDER_MAXIMUM/((Double) maxVal - (Double) minVal)));
            slider.setUpperValue((int)(((Double)colorTransformer.getUpperBound())*SLIDER_MAXIMUM/((Double) maxVal - (Double) minVal)));
        } else if (minVal instanceof Integer) {
            slider.setValue((int)(((Integer)colorTransformer.getLowerBound())*SLIDER_MAXIMUM/((Integer) maxVal - (Integer) minVal)));
            slider.setUpperValue((int)(((Integer)colorTransformer.getUpperBound())*SLIDER_MAXIMUM/((Integer) maxVal - (Integer) minVal)));
        } else if (minVal instanceof Long) {
            slider.setValue((int)(((Long)colorTransformer.getLowerBound())*SLIDER_MAXIMUM/((Long) maxVal - (Long) minVal)));
            slider.setUpperValue((int)(((Long)colorTransformer.getUpperBound())*SLIDER_MAXIMUM/((Long) maxVal - (Long) minVal)));
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelColor = new javax.swing.JLabel();
        gradientPanel = new javax.swing.JPanel();
        rangeSlider = new JRangeSlider();
        labelRange = new javax.swing.JLabel();

        labelColor.setText(org.openide.util.NbBundle.getMessage(ColorTransformerPanel.class, "ColorTransformerPanel.labelColor.text")); // NOI18N

        gradientPanel.setOpaque(false);
        gradientPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        rangeSlider.setOpaque(false);

        labelRange.setText(org.openide.util.NbBundle.getMessage(ColorTransformerPanel.class, "ColorTransformerPanel.labelRange.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelRange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rangeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradientPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelRange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rangeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gradientPanel;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelRange;
    private javax.swing.JSlider rangeSlider;
    // End of variables declaration//GEN-END:variables
}
