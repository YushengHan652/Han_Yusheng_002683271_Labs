/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.FilmAdmin;

import System.Studio.Studio;
import System.MusicStudioSystem;
import System.Movie.Movie;
import System.Movie.MovieDirectory;
import System.Network.Network;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import System.WorkQueue.FilmQueue;
import System.WorkQueue.FilmRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import static javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Eva
 */
public class StartNewMovieJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StartNewMovieJPanel
     */
    JPanel workArea;
    MusicStudioSystem system;
    String enName;
    UserAccount filmAdmin;
    UserAccount dire;
    UserAccount sw;
    UserAccount cm;
    public StartNewMovieJPanel(JPanel workArea, UserAccount filmAdmin, MusicStudioSystem system) {
        initComponents();
        this.workArea= workArea;
        this.system = system;
        this.filmAdmin = filmAdmin;
        enName = filmAdmin.getUsername();
        sVGImage1.setSvgImage("UIDesign/undraw_awards_fieb.svg", 240,160);
        setSize(750, 530);
        populateCombo();
    }
    
    private void populateCombo() {
        cmbMovieType.setModel(new DefaultComboBoxModel<>(new String[]{
            "Romantic","Adventure","Action","Criminal"
        }));
        cmbDirector.removeAllItems();
        cmbScriptwriter.removeAllItems();
        cmbCameraman.removeAllItems();
        
        for(Network network:system.getNetworkList()) {
            for (Studio studio: network.getEnterpriseDirectory().getEnterpriseList()) {
                if (studio.getName().equals(enName)) {
                    for(Organization org: studio.getOrganizationDirectory().getOrganizationList()) {
                        for(UserAccount ua: org.getUserAccountDirectory().getUserAccountList()) {
                            if (ua.getRole().toString().equals("FilmDirector")) {
                                cmbDirector.addItem(ua);
                            } else if(ua.getRole().toString().equals("FilmScriptwriter")) {
                                cmbScriptwriter.addItem(ua);
                            } else if(ua.getRole().toString().equals("FilmCameraman")) {
                                cmbCameraman.addItem(ua);
                            } 
                        }
                    }
                }
            }
        }
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbMovieType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbScriptwriter = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmbDirector = new javax.swing.JComboBox();
        cmbCameraman = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        sVGImage1 = new UIDesign.SVGImage();

        setBackground(new java.awt.Color(10, 10, 10));

        btnBack.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Start A New Movie");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Director:");

        btnStart.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Movie Type:");

        cmbMovieType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMovieType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMovieTypeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cameraman:");

        cmbScriptwriter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbScriptwriterActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ScriptWriter:");

        cmbDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDirectorActionPerformed(evt);
            }
        });

        cmbCameraman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCameramanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Movie Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbCameraman, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbMovieType, 0, 197, Short.MAX_VALUE)
                                .addComponent(cmbDirector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbScriptwriter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sVGImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle))))
                .addGap(219, 219, 219))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbCameraman, cmbDirector, cmbMovieType, cmbScriptwriter, txtName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(sVGImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMovieType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbScriptwriter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbCameraman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbCameraman, cmbDirector, cmbMovieType, cmbScriptwriter, txtName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        String movieName = txtName.getText();
        String movieType = cmbMovieType.getSelectedItem().toString();
        if (movieName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please draft a name for the movie", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            if(filmAdmin.getMovieList() == null) {
                MovieDirectory movieDire = new MovieDirectory();
                filmAdmin.setMovieList(movieDire);
                Movie movie = movieDire.createMovie(movieName);
                int count = movieDire.getMovieList().size();
                movie.setID(String.valueOf(count));
                movie.setCameraman(cm);
                movie.setDirector(dire);
                movie.setScriptwriter(sw);
                movie.setType(movieType);
                FilmQueue filmQueue = filmAdmin.getFilmQueue();
                FilmRequest filmRequest = filmQueue.addFilmRequest();
                filmRequest.setMovie(movie);
                filmRequest.setStatus("Processing");
                filmRequest.setCameraMan(movie.getCameraman());
                movie.getCameraman().getFilmQueue().getFilmRequestList().add(filmRequest);
                filmRequest.setDirector(movie.getDirector());
                movie.getDirector().getFilmQueue().getFilmRequestList().add(filmRequest);
                filmRequest.setScriptwriter(movie.getScriptwriter());
                movie.getScriptwriter().getFilmQueue().getFilmRequestList().add(filmRequest);
                //JOptionPane.showMessageDialog(this, "bp1");
                JOptionPane.showMessageDialog(this, "Information Saved!");
                
            } else {
                MovieDirectory movieDire = filmAdmin.getMovieList();
                Movie movie = movieDire.createMovie(movieName);
                int count = movieDire.getMovieList().size();
                movie.setID(String.valueOf(count));
                movie.setCameraman(cm);
                movie.setDirector(dire);
                movie.setScriptwriter(sw);
                movie.setType(movieType);
                FilmRequest filmRequest = filmAdmin.getFilmQueue().addFilmRequest();
                filmRequest.setMovie(movie);
                filmRequest.setStatus("Processing");
                filmRequest.setCameraMan(movie.getCameraman());
                filmRequest.setDirector(movie.getDirector());
                filmRequest.setScriptwriter(movie.getScriptwriter());
                movie.getCameraman().getFilmQueue().getFilmRequestList().add(filmRequest);
                movie.getDirector().getFilmQueue().getFilmRequestList().add(filmRequest);
                movie.getScriptwriter().getFilmQueue().getFilmRequestList().add(filmRequest);
                JOptionPane.showMessageDialog(this, "Information Saved!");
            }
            
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbMovieTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMovieTypeActionPerformed
        
    }//GEN-LAST:event_cmbMovieTypeActionPerformed

    private void cmbDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDirectorActionPerformed
        dire = (UserAccount)cmbDirector.getSelectedItem();
    }//GEN-LAST:event_cmbDirectorActionPerformed

    private void cmbCameramanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCameramanActionPerformed
        cm = (UserAccount)cmbCameraman.getSelectedItem();
    }//GEN-LAST:event_cmbCameramanActionPerformed

    private void cmbScriptwriterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbScriptwriterActionPerformed
        sw = (UserAccount)cmbScriptwriter.getSelectedItem();
    }//GEN-LAST:event_cmbScriptwriterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnStart;
    private javax.swing.JComboBox cmbCameraman;
    private javax.swing.JComboBox cmbDirector;
    private javax.swing.JComboBox<String> cmbMovieType;
    private javax.swing.JComboBox cmbScriptwriter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblTitle;
    private UIDesign.SVGImage sVGImage1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}