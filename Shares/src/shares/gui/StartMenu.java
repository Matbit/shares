/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shares.gui;

import java.util.ResourceBundle;
import shares.controls.ControlGuiStart;
import shares.program.settings.Language;

/**
 *
 * @author Big Boss
 */
public class StartMenu extends javax.swing.JFrame {
    
    String baseName = Language.getLanguage();
    ResourceBundle bundle = ResourceBundle.getBundle(baseName);
    
    
    /**
     * Creates new form StartMenu
     */
    public StartMenu() {
        initComponents();
        rbtnEnglish.setSelected(true);
        rbtnGerman.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lWelcomeText = new javax.swing.JLabel();
        llanguageChoose = new javax.swing.JLabel();
        rbtnEnglish = new javax.swing.JRadioButton();
        rbtnGerman = new javax.swing.JRadioButton();
        lPlayer = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listbxGender = new javax.swing.JList<>();
        lChooseGender = new javax.swing.JLabel();
        lEnterNickname = new javax.swing.JLabel();
        txtfieldNick = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuFileNewGame = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lWelcomeText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lWelcomeText.setText("lWelcomeText");

        llanguageChoose.setText("languageChoose");

        rbtnEnglish.setSelected(true);
        rbtnEnglish.setText("rbtnEnglish");
        rbtnEnglish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnEnglishMouseClicked(evt);
            }
        });
        rbtnEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEnglishActionPerformed(evt);
            }
        });

        rbtnGerman.setText("rbtnGerman");
        rbtnGerman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnGermanMouseClicked(evt);
            }
        });
        rbtnGerman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGermanActionPerformed(evt);
            }
        });

        lPlayer.setText("lPlayer");

        btnExit.setText("btnExit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnStart.setText("btnStart");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        listbxGender.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "genderMale", "genderFemal" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listbxGender.setAutoscrolls(false);
        listbxGender.setSelectedIndex(0);
        jScrollPane1.setViewportView(listbxGender);

        lChooseGender.setText("lchooseGender");

        lEnterNickname.setText("lEnterNickname");

        txtfieldNick.setText("Joe");

        jMenu1.setText("File");

        menuFileNewGame.setText("menuFileNewGame");
        jMenu1.add(menuFileNewGame);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lWelcomeText))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnEnglish)
                                    .addComponent(llanguageChoose)
                                    .addComponent(rbtnGerman)
                                    .addComponent(lPlayer)
                                    .addComponent(lEnterNickname))
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtfieldNick)
                                .addGap(70, 70, 70)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lChooseGender)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lWelcomeText)
                .addGap(53, 53, 53)
                .addComponent(llanguageChoose)
                .addGap(18, 18, 18)
                .addComponent(rbtnEnglish)
                .addGap(18, 18, 18)
                .addComponent(rbtnGerman)
                .addGap(61, 61, 61)
                .addComponent(lPlayer)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExit)
                            .addComponent(btnStart))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lEnterNickname)
                                .addGap(18, 18, 18)
                                .addComponent(txtfieldNick, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lChooseGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(213, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEnglishActionPerformed
        if(rbtnEnglish.isSelected()){
            rbtnEnglish.setSelected(false);
            rbtnGerman.setSelected(true);
        }
        else{
            if(!rbtnEnglish.isSelected()){
                rbtnEnglish.setSelected(true);
                rbtnGerman.setSelected(false);
            }
        }
    }//GEN-LAST:event_rbtnEnglishActionPerformed

    private void rbtnGermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGermanActionPerformed
       if(rbtnGerman.isSelected()){
            rbtnEnglish.setSelected(true);
            rbtnGerman.setSelected(false);
        }
        else{
                rbtnEnglish.setSelected(false);
                rbtnGerman.setSelected(true);
            
        }
    }//GEN-LAST:event_rbtnGermanActionPerformed

    private void rbtnGermanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnGermanMouseClicked
       if(rbtnGerman.isSelected()){
            rbtnEnglish.setSelected(true);
            rbtnGerman.setSelected(false);
        }
        else{
                rbtnEnglish.setSelected(false);
                rbtnGerman.setSelected(true);
            
        }
    }//GEN-LAST:event_rbtnGermanMouseClicked

    private void rbtnEnglishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnEnglishMouseClicked
        if(rbtnEnglish.isSelected()){
            rbtnEnglish.setSelected(false);
            rbtnGerman.setSelected(true);
        }
        else{
            if(!rbtnEnglish.isSelected()){
                rbtnEnglish.setSelected(true);
                rbtnGerman.setSelected(false);
            }
        }
    }//GEN-LAST:event_rbtnEnglishMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        String nick = "";
        int gender = -1;
        //check data is ok        
        boolean threeChars = nickCountChars();
        if(threeChars){
        nick = txtfieldNick.getText().trim();
        
        
        //0 = male - 1= female
        if(listbxGender.isSelectedIndex(0))
            gender = 0;
        else gender = 1;
            
        }
        
        // init simulation and save current date and time
        ControlGuiStart.createPlayer(nick, gender);
        
        //close window
        this.setVisible(false);
        //open gui simulation
        ShareSimulation sim = new ShareSimulation();
        sim.setVisible(true);
        
        
    }//GEN-LAST:event_btnStartActionPerformed
    
    private boolean nickCountChars(){
        txtfieldNick.getText().trim();
        String nick = txtfieldNick.getText();
        
        if(nick.length() >= 3)
            return true;
        return false;
        
    }
    
    
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
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnStart;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lChooseGender;
    private javax.swing.JLabel lEnterNickname;
    private javax.swing.JLabel lPlayer;
    private javax.swing.JLabel lWelcomeText;
    private javax.swing.JList<String> listbxGender;
    private javax.swing.JLabel llanguageChoose;
    private javax.swing.JMenuItem menuFileNewGame;
    private javax.swing.JRadioButton rbtnEnglish;
    private javax.swing.JRadioButton rbtnGerman;
    private javax.swing.JTextField txtfieldNick;
    // End of variables declaration//GEN-END:variables
}
