/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdlaf.demo.views;

import java.awt.Color;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import mdlaf.animation.MaterialUIMovement;
import mdlaf.demo.MaterialDemoSwingApp;
import mdlaf.demo.ResoucesConstantBundle;
import mdlaf.utils.MaterialColors;
import mdlaf.utils.MaterialFontFactory;
import mdlaf.utils.MaterialManagerListener;

/**
 *
 * @author Vincenzo Palazzo
 */
public class MaterialDemoSwingDialogInfo extends javax.swing.JDialog {

    public MaterialDemoSwingDialogInfo(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
    }

    
    public void init(){
        initComponents();
        initAction();
        initContentArea();
        initStyle();
        
        pack();
        setLocationRelativeTo(this.getRootPane());
       // setResizable(false);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconAtarw = new javax.swing.JLabel();
        projectAtarw = new javax.swing.JButton();
        projectVinz = new javax.swing.JButton();
        materialPanelDialog = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescription = new javax.swing.JTextArea();
        buttonDonation = new javax.swing.JButton();
        iconVincent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        iconAtarw.setText("jLabel1");

        projectAtarw.setText("jButton1");

        projectVinz.setText("jButton2");

        textAreaDescription.setColumns(20);
        textAreaDescription.setRows(5);
        jScrollPane1.setViewportView(textAreaDescription);

        buttonDonation.setText("jButton1");
        buttonDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDonationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout materialPanelDialogLayout = new javax.swing.GroupLayout(materialPanelDialog);
        materialPanelDialog.setLayout(materialPanelDialogLayout);
        materialPanelDialogLayout.setHorizontalGroup(
            materialPanelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanelDialogLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(buttonDonation, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(212, 212, 212))
            .addGroup(materialPanelDialogLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(15, 15, 15))
        );
        materialPanelDialogLayout.setVerticalGroup(
            materialPanelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanelDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        iconVincent.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconAtarw, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconVincent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(projectVinz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(projectAtarw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(materialPanelDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(iconAtarw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(projectAtarw, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(iconVincent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(projectVinz, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(materialPanelDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDonationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDonationActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDonation;
    private javax.swing.JLabel iconAtarw;
    private javax.swing.JLabel iconVincent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel materialPanelDialog;
    private javax.swing.JButton projectAtarw;
    private javax.swing.JButton projectVinz;
    private javax.swing.JTextArea textAreaDescription;
    // End of variables declaration//GEN-END:variables

    private void initAction() {
        
    }

    private void initStyle() {
        try {
            BufferedImage buffertIconAtarw = ImageIO.read(getClass().getClassLoader().getResource("iconAtarw.jpeg"));
            iconAtarw.setIcon(new ImageIcon(buffertIconAtarw));
            iconAtarw.setText("atarw");
            BufferedImage buffertIconVinz = ImageIO.read(getClass().getClassLoader().getResource("iconVinz.png"));
            iconVincent.setIcon(new ImageIcon(buffertIconVinz));
            iconVincent.setText("vincenzopalazzo");
            
            BufferedImage github = ImageIO.read(getClass().getClassLoader().getResource("githubIcon.png"));
            projectAtarw.setIcon(new ImageIcon(github));
            projectAtarw.setBackground(MaterialColors.COSMO_BLACK);
            projectAtarw.setForeground(MaterialColors.COSMO_LIGTH_GRAY);
            MaterialManagerListener.removeAllMouseListener(projectAtarw);
            projectAtarw.addMouseListener(MaterialUIMovement.getMovement(projectAtarw, MaterialColors.GRAY_600));
            
            projectVinz.setIcon(new ImageIcon(github));
            projectVinz.setBackground(MaterialColors.COSMO_BLACK);
            projectVinz.setForeground(MaterialColors.COSMO_LIGTH_GRAY);
            MaterialManagerListener.removeAllMouseListener(projectVinz);
            projectVinz.addMouseListener(MaterialUIMovement.getMovement(projectVinz, MaterialColors.GRAY_600));
            
            buttonDonation.setIcon(new ImageIcon(github));
            buttonDonation.setBackground(MaterialColors.COSMO_BLACK);
            buttonDonation.setForeground(MaterialColors.COSMO_LIGTH_GRAY);
            MaterialManagerListener.removeAllMouseListener(buttonDonation);
            buttonDonation.addMouseListener(MaterialUIMovement.getMovement(buttonDonation, MaterialColors.GRAY_600));
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void initContentArea() {
        textAreaDescription.setText(ResoucesConstantBundle.PRESENTATION);
    }

}