
package shares.gui;

import java.util.ResourceBundle;
import shares.controls.ControlGuiScore;
import shares.controls.ControlGuiSimulation;
import shares.controls.ControlGuiStart;
import shares.program.settings.Language;


public class Score extends javax.swing.JFrame {

   String baseName = Language.getLanguage();
    ResourceBundle bundle = ResourceBundle.getBundle(baseName);
    
    public Score() {
        initComponents();
        setLanguage();              
        setStatistics();
    }
    
    private void setLanguage(){
        baseName= Language.getLanguage();
        bundle = ResourceBundle.getBundle(baseName);
        
        lScore.setText(bundle.getString("lScore"));
        btnExit.setText(bundle.getString("btnExit"));
        btnBack.setText(bundle.getString("btnBack"));
        mOptions.setText(bundle.getString("mOptions"));
        mOptionsLanguageEn.setText(bundle.getString("mOptionsLanguageEn"));
        mOptionsLanguageDe.setText(bundle.getString("mOptionsLanguageDe"));
        setStatistics();
        this.setTitle(bundle.getString("title"));
        mFile.setText(bundle.getString("mFile"));
        mFileExit.setText(bundle.getString("mFileExit"));
        mFileNewGame.setText(bundle.getString("mFileNewGame"));
        mFileNewPlayer.setText(bundle.getString("mFileNewPlayer"));
        
    }
    
    private void setStatistics(){
        txtAreaScores.setLineWrap(true);
        txtAreaScores.setText(bundle.getString("txtStartCapital")+ " "+ControlGuiScore.getStartAmount());
        txtAreaScores.append("\n");
        txtAreaScores.append(bundle.getString("txtEndCapital")+ " "+ControlGuiScore.getEndCapital());
        txtAreaScores.append("\n");
        txtAreaScores.append(bundle.getString("txtDiff")+ " "+ ControlGuiScore.getDiffFortune());
        txtAreaScores.append("\n");
        txtAreaScores.append(bundle.getString("txtProcent")+ " "+ControlGuiScore.getProcentProfit());
        txtAreaScores.append("\n");
        txtAreaScores.append(bundle.getString("txtDays")+ " "+ControlGuiScore.getDays());
        txtAreaScores.append("\n");
              
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lScore = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaScores = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        mFileNewGame = new javax.swing.JMenuItem();
        mFileNewPlayer = new javax.swing.JMenuItem();
        mFileExit = new javax.swing.JMenuItem();
        mOptions = new javax.swing.JMenu();
        mOptionsLanguageEn = new javax.swing.JMenuItem();
        mOptionsLanguageDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lScore.setText("lScore");

        txtAreaScores.setEditable(false);
        txtAreaScores.setBackground(new java.awt.Color(255, 255, 204));
        txtAreaScores.setColumns(20);
        txtAreaScores.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtAreaScores.setLineWrap(true);
        txtAreaScores.setRows(5);
        txtAreaScores.setText("txtAreaScores");
        txtAreaScores.setAutoscrolls(false);
        txtAreaScores.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAreaScores.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaScores);

        btnExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 102, 255));
        btnExit.setText("btnExit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 255));
        btnBack.setText("btnBack");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        mFile.setText("File");

        mFileNewGame.setText("mFileNewGame");
        mFileNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFileNewGameActionPerformed(evt);
            }
        });
        mFile.add(mFileNewGame);

        mFileNewPlayer.setText("mFileNewPlayer");
        mFileNewPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFileNewPlayerActionPerformed(evt);
            }
        });
        mFile.add(mFileNewPlayer);

        mFileExit.setText("mFileExit");
        mFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFileExitActionPerformed(evt);
            }
        });
        mFile.add(mFileExit);

        jMenuBar1.add(mFile);

        mOptions.setText("mOptions");

        mOptionsLanguageEn.setText("mOptionsLanguageEn");
        mOptionsLanguageEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOptionsLanguageEnActionPerformed(evt);
            }
        });
        mOptions.add(mOptionsLanguageEn);

        mOptionsLanguageDe.setText("mOptionsLanguageDe");
        mOptionsLanguageDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOptionsLanguageDeActionPerformed(evt);
            }
        });
        mOptions.add(mOptionsLanguageDe);

        jMenuBar1.add(mOptions);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lScore, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(lScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        setBounds(0, 0, 450, 397);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void mFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFileExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mFileExitActionPerformed

    private void mFileNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFileNewGameActionPerformed
        ControlGuiSimulation.startNewGame();
        ShareSimulation sim = ShareSimulation.getInstance();
        sim.setLocationRelativeTo(null);
        sim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mFileNewGameActionPerformed

    private void mOptionsLanguageEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOptionsLanguageEnActionPerformed
         Language.setLanguage(Language.aLanguage.ENGLISH);
         setLanguage();
    }//GEN-LAST:event_mOptionsLanguageEnActionPerformed

    private void mOptionsLanguageDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOptionsLanguageDeActionPerformed
         Language.setLanguage(Language.aLanguage.GERMAN);
         setLanguage();
    }//GEN-LAST:event_mOptionsLanguageDeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ShareSimulation sim = ShareSimulation.getInstance();
        sim.setLocationRelativeTo(null);
        sim.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void mFileNewPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFileNewPlayerActionPerformed
       ControlGuiStart.startWithNewPlayer();
    }//GEN-LAST:event_mFileNewPlayerActionPerformed

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
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Score().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lScore;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenuItem mFileExit;
    private javax.swing.JMenuItem mFileNewGame;
    private javax.swing.JMenuItem mFileNewPlayer;
    private javax.swing.JMenu mOptions;
    private javax.swing.JMenuItem mOptionsLanguageDe;
    private javax.swing.JMenuItem mOptionsLanguageEn;
    private javax.swing.JTextArea txtAreaScores;
    // End of variables declaration//GEN-END:variables
}
