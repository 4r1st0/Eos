/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eos.gui;

import eos.io.WriteDefaultSpectrum;
import eos.io.CheckUserInput;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;


/**
 *
 * @author dommer01
 */
public class defaultSpectrumGUI extends javax.swing.JFrame {
    /**
     * Creates new form defaultSpectrumGUI
     */
    
    private String line;
    private String headerSpectrum;
    private int numberOfEnergyBins;
    private int spectrumForm;
    private int energyScale;
    private int errorFlag = 0;
    private double energyHighBinEdge;
    private List<Double> energyLeftEdge = new ArrayList<Double>();
    private List<Double> spectrumBin = new ArrayList<Double>();
    private List<Double> spectrumBinUncertainty = new ArrayList<Double>();
    Exception e;
    CheckUserInput checkInput = new CheckUserInput();
    

    public defaultSpectrumGUI(eosGUI aThis) {
        initComponents();
        buttonGroupSpectrum.add(jRadioButton1);
        buttonGroupSpectrum.add(jRadioButton2);
        buttonGroupSpectrum.add(jRadioButton3);
        buttonGroupEnergy.add(jRadioButtoneV);
        buttonGroupEnergy.add(jRadioButtonMeV);
        buttonGroupEnergy.add(jRadioButtonkeV);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSpectrum = new javax.swing.ButtonGroup();
        buttonGroupEnergy = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldHeaderSpectrum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtoneV = new javax.swing.JRadioButton();
        jRadioButtonMeV = new javax.swing.JRadioButton();
        jRadioButtonkeV = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEnergyBins = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBinEdge = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSpectrum = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaUncertainty = new javax.swing.JTextArea();
        jButtonAddZero = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonCreateDefaultSpectrum = new javax.swing.JButton();
        jButtonClearSpecUnc = new javax.swing.JButton();
        jButtonClearAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldOutName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "INPUT"));

        jLabel2.setText("header:");

        jTextFieldHeaderSpectrum.setText("!header restricted to max. 80 characters!");

        jLabel3.setText("Spectrum form:");

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("(fluence rate per bin)/(width of E bin)");

        jRadioButton2.setText("fluence rate per bin");

        jRadioButton3.setText("(fluence rate per bin)/(width of bin in ln(E))");

        jLabel4.setText("Energy scale:");

        jRadioButtoneV.setText("eV (equals 0)");

        jRadioButtonMeV.setSelected(true);
        jRadioButtonMeV.setText("MeV (equals 1)");

        jRadioButtonkeV.setText("keV (equals 2)");

        jLabel5.setText("# of energy bins:");

        jTextFieldEnergyBins.setText("131");

        jLabel6.setText("Highest energy bin edge:");

        jTextField4.setText("0.0000E00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("left energy bin edge:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("spectrum bin:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("uncertainty of bin:");

        jTextAreaBinEdge.setColumns(20);
        jTextAreaBinEdge.setRows(5);
        jTextAreaBinEdge.setText("0.0000E+00\n" + "or\n" + "0.0000");
        jScrollPane1.setViewportView(jTextAreaBinEdge);

        jTextAreaSpectrum.setColumns(20);
        jTextAreaSpectrum.setRows(5);
        jTextAreaSpectrum.setText("0.0000E+00\n" + "or\n" + "0.0000");
        jScrollPane2.setViewportView(jTextAreaSpectrum);

        jTextAreaUncertainty.setColumns(20);
        jTextAreaUncertainty.setRows(5);
        jTextAreaUncertainty.setText("0.0000E+00\n" + "or\n" + "0.0000");
        jScrollPane3.setViewportView(jTextAreaUncertainty);

        jButtonAddZero.setText("add 0.0");
        jButtonAddZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddZeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4))
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonkeV)
                            .addComponent(jRadioButtonMeV)
                            .addComponent(jRadioButtoneV))
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldHeaderSpectrum, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldEnergyBins, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButtonAddZero, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldHeaderSpectrum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButtoneV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButtonMeV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButtonkeV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEnergyBins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddZero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "OUTPUT"));

        jButtonCreateDefaultSpectrum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCreateDefaultSpectrum.setText("Create Output");
        jButtonCreateDefaultSpectrum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateDefaultSpectrumActionPerformed(evt);
            }
        });

        jButtonClearSpecUnc.setText("Clear Spectrum/Unc.");
        jButtonClearSpecUnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearSpecUncActionPerformed(evt);
            }
        });

        jButtonClearAll.setText("Clear All TextArea");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });

        jLabel1.setText("Output Name:");

        jTextFieldOutName.setText("default-spectrum");

        jLabel10.setText(".flu");

        appendingTextOutLogSpec.setEditable(false);
        jScrollPane4.setViewportView(appendingTextOutLogSpec);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldOutName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCreateDefaultSpectrum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClearSpecUnc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreateDefaultSpectrum)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldOutName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClearSpecUnc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClearAll))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateDefaultSpectrumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateDefaultSpectrumActionPerformed
        //============START: Read data from GUI=================================
        headerSpectrum = jTextFieldHeaderSpectrum.getText();
        //START: get Spectrum form from radioButtonGroupSpectrum
        if(jRadioButton1.isSelected()){
            spectrumForm = 1;            
        }
        if(jRadioButton2.isSelected()){
            spectrumForm = 2;            
        }
        if(jRadioButton3.isSelected()){
            spectrumForm = 3;            
        }
        //END: get Spectrum form from radioButtonGroupSpectrum
        
        //START: get Energy Scale from radioButtonGroupEnergy
        if(jRadioButtoneV.isSelected()){
            energyScale = 0;            
        }
        if(jRadioButtonMeV.isSelected()){
            energyScale = 1;            
        }
        if(jRadioButtonkeV.isSelected()){
            energyScale = 2;            
        }
        //END: get Energy Scale from radioButtonGroupEnergy
        
        try {
            numberOfEnergyBins = Integer.parseInt(jTextFieldEnergyBins.getText());
        } catch (NumberFormatException e1) {
            appendingTextOutLogSpec.appendTextErrorMinor("# of E bins: "
                                                + "requires integer value!\n");
            errorFlag = 1;
        }
        
        try {
            energyHighBinEdge = Double.parseDouble(jTextField4.getText());
        } catch (NumberFormatException e2) {
            appendingTextOutLogSpec.appendTextErrorMinor("Highest energy bin: "
                                                + "requires double value!\n");
            errorFlag = 1;
        }
        try {
        for (String line : jTextAreaBinEdge.getText().split("\\n")) {
            energyLeftEdge.add(Double.parseDouble(line));
        }
        } catch (NumberFormatException e3) {
            appendingTextOutLogSpec.appendTextErrorMinor("left energy bin:"
                                            + " requires list of doubles!\n");
            errorFlag = 1;
        }
        try {
        for (String line : jTextAreaSpectrum.getText().split("\\n")) {
            spectrumBin.add(Double.parseDouble(line));
        } 
        } catch (NumberFormatException e4) {
            appendingTextOutLogSpec.appendTextErrorMinor("spectrum bin: "
                                             + "requires list of doubles!\n");
            errorFlag = 1;
        }
        
        try {
        for (String line : jTextAreaUncertainty.getText().split("\\n")) {
            spectrumBinUncertainty.add(Double.parseDouble(line));
        }
        } catch (NumberFormatException e5) {
            appendingTextOutLogSpec.appendTextErrorMinor("unc. of bin: "
                                             + "requires list of doubles!\n");
            errorFlag = 1;
        }
        
        // check uniformity of given number of energy bins and array size of energyLeftEdge/spectrum/uncertainty 
        if((checkInput.checkDataUniformity(numberOfEnergyBins, energyLeftEdge.size())
            + checkInput.checkDataUniformity(numberOfEnergyBins, spectrumBin.size())
            + checkInput.checkDataUniformity(numberOfEnergyBins, spectrumBinUncertainty.size())) != 0) {
            appendingTextOutLogSpec.appendTextErrorMinor("Data array length inconsistent "
                                                + "with number of spheres! \n");
            errorFlag = 1;
        }
        //============END: Read data from GUI===================================

        //============START: Write data to file=================================
        if(errorFlag != 0) {
            appendingTextOutLogSpec.appendTextErrorMajor("Input error. Please "
                                                + "check all input fields!\n");
            errorFlag = 0;
        } else {
            try{
                WriteDefaultSpectrum writeDefaultSpec = new WriteDefaultSpectrum();
                writeDefaultSpec.WriteDefaultSpectrum(jTextFieldOutName,
                                         headerSpectrum, numberOfEnergyBins,
                                         spectrumForm, energyScale,
                                         energyHighBinEdge,
                                         energyLeftEdge,
                                         spectrumBin,
                                         spectrumBinUncertainty);
            } catch (Exception e) {
                System.out.println("problem with path : "+ jTextFieldOutName.getText());
                System.out.println(e.getMessage());
            } finally {
                appendingTextOutLogSpec.appendTextSuccess("Success! Spectrum file successfully written"
                    + " to: " +  jTextFieldOutName.getText() +".flu \n");
            }
            appendingTextOutLogSpec.appendText("#==============================#\n");
        }
        //============END: Write data to file===================================
        
        //============START: clear ArrayLists===================================
        energyLeftEdge = new ArrayList<Double>();
        spectrumBin = new ArrayList<Double>();
        spectrumBinUncertainty = new ArrayList<Double>();
        //============END: clear ArrayLists=====================================
    }//GEN-LAST:event_jButtonCreateDefaultSpectrumActionPerformed

    private void jButtonClearSpecUncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearSpecUncActionPerformed
        //START: clear text from all TextAreas
        jTextAreaSpectrum.setText(null);
        jTextAreaUncertainty.setText(null);
        //END: clear text from all TextAreas
    }//GEN-LAST:event_jButtonClearSpecUncActionPerformed

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        //START: clear text from all TextAreas
        jTextAreaBinEdge.setText(null);
        jTextAreaSpectrum.setText(null);
        jTextAreaUncertainty.setText(null);
        //END: clear text from all TextAreas
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    private void jButtonAddZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddZeroActionPerformed
        try {
            numberOfEnergyBins = Integer.parseInt(jTextFieldEnergyBins.getText());
        } catch (NumberFormatException e) {
        // Invalid double String.
        }
        jTextAreaUncertainty.setText(null);
        for(int i = 0; i < numberOfEnergyBins; i ++ ) {
            jTextAreaUncertainty.append("0.0\n");
        }
    }//GEN-LAST:event_jButtonAddZeroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(defaultSpectrumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(defaultSpectrumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(defaultSpectrumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(defaultSpectrumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new defaultSpectrumGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private final eos.io.AppendingTextPane appendingTextOutLogSpec = new eos.io.AppendingTextPane();
    private javax.swing.ButtonGroup buttonGroupEnergy;
    private javax.swing.ButtonGroup buttonGroupSpectrum;
    private javax.swing.JButton jButtonAddZero;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonClearSpecUnc;
    private javax.swing.JButton jButtonCreateDefaultSpectrum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButtonMeV;
    private javax.swing.JRadioButton jRadioButtoneV;
    private javax.swing.JRadioButton jRadioButtonkeV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaBinEdge;
    private javax.swing.JTextArea jTextAreaSpectrum;
    private javax.swing.JTextArea jTextAreaUncertainty;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldEnergyBins;
    private javax.swing.JTextField jTextFieldHeaderSpectrum;
    private javax.swing.JTextField jTextFieldOutName;
    // End of variables declaration//GEN-END:variables
}
