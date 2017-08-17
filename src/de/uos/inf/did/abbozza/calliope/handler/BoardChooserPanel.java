/**
 * @license
 * abbozza!
 *
 * Copyright 2015 Michael Brinkmeier ( michael.brinkmeier@uni-osnabrueck.de )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * @fileoverview ...
 * @author michael.brinkmeier@uni-osnabrueck.de (Michael Brinkmeier)
 */
package de.uos.inf.did.abbozza.calliope.handler;

/**
 *
 * @author michael
 */
public class BoardChooserPanel extends javax.swing.JPanel {

    /**
     * Creates new form BoardChooserPanel
     */
    public BoardChooserPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardGroup = new javax.swing.ButtonGroup();
        microbitButton = new javax.swing.JRadioButton();
        calliopeButton = new javax.swing.JRadioButton();

        boardGroup.add(microbitButton);
        microbitButton.setSelected(true);
        microbitButton.setText("BBC micro:bit");
        microbitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                microbitButtonActionPerformed(evt);
            }
        });

        boardGroup.add(calliopeButton);
        calliopeButton.setText("Calliope Mini");
        calliopeButton.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(microbitButton)
                    .addComponent(calliopeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(microbitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calliopeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void microbitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_microbitButtonActionPerformed
    }//GEN-LAST:event_microbitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup boardGroup;
    private javax.swing.JRadioButton calliopeButton;
    private javax.swing.JRadioButton microbitButton;
    // End of variables declaration//GEN-END:variables

    public void setCalliope() {
        this.calliopeButton.setSelected(true);
    }
    
    public void setMicrobit() {
        this.microbitButton.setSelected(true);
    }

    public boolean isCalliope() {
        return calliopeButton.isSelected();
    }
}