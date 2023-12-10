/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.FilmAdmin;

import System.MusicStudioSystem;
import System.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Eva
 */
public class FilmAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FilmManagerWorkAreaJPanel
     */
    JPanel workArea;
    MusicStudioSystem system;
    UserAccount account;
    public FilmAdminWorkAreaJPanel(JPanel workArea, UserAccount account, MusicStudioSystem system) {
        initComponents();
        this.workArea= workArea;
        this.system = system;
        this.account = account;
        sVGImage1.setSvgImage("UIDesign/undraw_videographer_nnc7.svg", 240,160);
        setSize(750, 530);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        btnCompleted = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnOngoing = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        sVGImage1 = new UIDesign.SVGImage();

        setBackground(new java.awt.Color(10, 10, 10));

        btnStart.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Start A New Movie");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnCompleted.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnCompleted.setForeground(new java.awt.Color(255, 255, 255));
        btnCompleted.setText("View Completed Movies");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Film Admin Work Area");

        btnOngoing.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnOngoing.setForeground(new java.awt.Color(255, 255, 255));
        btnOngoing.setText("View Ongoing Movies");
        btnOngoing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOngoingActionPerformed(evt);
            }
        });

        btnManage.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnManage.setForeground(new java.awt.Color(255, 255, 255));
        btnManage.setText("Manage Film Employee");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCompleted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOngoing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sVGImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(sVGImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(btnStart)
                .addGap(18, 18, 18)
                .addComponent(btnOngoing)
                .addGap(18, 18, 18)
                .addComponent(btnCompleted)
                .addGap(18, 18, 18)
                .addComponent(btnManage)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        StartNewMovieJPanel snmjp = new StartNewMovieJPanel(workArea, account, system);
        workArea.add("StartNewMovieJPanel", snmjp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnOngoingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOngoingActionPerformed
        ViewOngoingMovieJPanel vomjp = new ViewOngoingMovieJPanel(workArea, account, system);
        workArea.add("ViewOngoingMovieJPanel", vomjp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnOngoingActionPerformed

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed
        ViewCompletedMovieJPanel vcmjp = new ViewCompletedMovieJPanel(workArea, account, system);
        workArea.add("ViewCompletedMovieJPanel", vcmjp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnCompletedActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        ManageFilmEmployeeJPanel mfejp = new ManageFilmEmployeeJPanel(workArea, account, system);
        workArea.add("ManageFilmEmployeeJPanel", mfejp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnOngoing;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel lblTitle;
    private UIDesign.SVGImage sVGImage1;
    // End of variables declaration//GEN-END:variables
}
