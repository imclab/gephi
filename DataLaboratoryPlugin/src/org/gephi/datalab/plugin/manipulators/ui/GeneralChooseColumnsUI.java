/*
Copyright 2008-2010 Gephi
Authors : Eduardo Ramos <eduramiba@gmail.com>
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
package org.gephi.datalab.plugin.manipulators.ui;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import org.gephi.data.attributes.api.AttributeColumn;
import org.gephi.datalab.plugin.manipulators.GeneralColumnsChooser;
import org.gephi.datalab.spi.DialogControls;
import org.gephi.datalab.spi.Manipulator;
import org.gephi.datalab.spi.ManipulatorUI;

/**
 * UI for GeneralColumnsChooser (ClearNodesData and ClearEdgesData)
 * @author Eduardo Ramos <eduramiba@gmail.com>
 */
public class GeneralChooseColumnsUI extends javax.swing.JPanel implements ManipulatorUI {

    private GeneralColumnsChooser columnsChooser;
    private ColumnCheckBox[] columnsCheckBoxes;

    /** Creates new form GeneralChooseColumnsUI */
    public GeneralChooseColumnsUI(String descriptionText) {
        initComponents();
        descriptionLabel.setText(descriptionText);
    }

    public void setup(Manipulator m, DialogControls dialogControls) {
        this.columnsChooser = (GeneralColumnsChooser) m;
        refreshColumns();
    }

    public void unSetup() {
        columnsChooser.setColumns(getChosenColumns());
    }

    public String getDisplayName() {
        return columnsChooser.getName();
    }

    public JPanel getSettingsPanel() {
        return this;
    }

    public boolean isModal() {
        return true;
    }

    public AttributeColumn[] getChosenColumns(){
        ArrayList<AttributeColumn> columnsToClearDataList=new ArrayList<AttributeColumn>();
        for(ColumnCheckBox c:columnsCheckBoxes){
            if(c.isSelected()){
                columnsToClearDataList.add(c.getColumn());
            }
        }
        return columnsToClearDataList.toArray(new AttributeColumn[0]);
    }

    private void refreshColumns() {
        AttributeColumn[] columns=columnsChooser.getColumns();
        columnsCheckBoxes=new ColumnCheckBox[columns.length];
        contentPanel.removeAll();
        contentPanel.setLayout(new MigLayout("", "[pref!]"));
        for (int i=0;i< columns.length;i++) {
            columnsCheckBoxes[i] = new ColumnCheckBox(columns[i], true);
            contentPanel.add(columnsCheckBoxes[i].getCheckBox(), "wrap");
        }
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    private static class ColumnCheckBox {

        private JCheckBox checkBox;
        private AttributeColumn column;

        public ColumnCheckBox(AttributeColumn column, boolean selected) {
            checkBox = new JCheckBox(column.getTitle(), selected);
            this.column = column;
        }

        public void setSelected(boolean selected) {
            checkBox.setSelected(selected);
        }

        public boolean isSelected() {
            return checkBox.isSelected();
        }

        public JCheckBox getCheckBox() {
            return checkBox;
        }

        public AttributeColumn getColumn() {
            return column;
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

        contentScrollPane = new javax.swing.JScrollPane();
        contentPanel = new javax.swing.JPanel();
        descriptionLabel = new javax.swing.JLabel();

        contentPanel.setLayout(new java.awt.GridLayout(1, 0));
        contentScrollPane.setViewportView(contentPanel);

        descriptionLabel.setText(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descriptionLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addComponent(contentScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JScrollPane contentScrollPane;
    private javax.swing.JLabel descriptionLabel;
    // End of variables declaration//GEN-END:variables
}
