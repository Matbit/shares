package shares.gui;

import java.util.ResourceBundle;
import javax.swing.DefaultListModel;
import shares.controls.ControlGuiStart;
import shares.program.settings.Language;


public class StartMenu extends javax.swing.JFrame {
    
    private static StartMenu startMenu;
    String baseName;
    ResourceBundle bundle;
    DefaultListModel lmGender = new DefaultListModel();
    
       
    /**
     * Creates new form StartMenu
     */
    private StartMenu() {
        baseName = Language.getLanguage();
        bundle = ResourceBundle.getBundle(baseName);
        initComponents();
        lException.setVisible(false);
        rbtnEnglish.setSelected(true);
        rbtnGerman.setSelected(false);
        lmGender.addElement(bundle.getString("genderMale"));
        lmGender.addElement(bundle.getString("genderFemale"));
        listbxGender.setModel(lmGender);
        listbxGender.setSelectedIndex(0);
        mEdit.setVisible(false);
        //menu
        mFile.setText(bundle.getString("mFile"));
        mEdit.setText(bundle.getString("mEdit"));
        mFileExit.setText(bundle.getString("mFileExit"));
        mEditLanguage.setText(bundle.getString("mEditLanguage"));
        
        //add radioButton to buttonGroup
        buttonGroup1.add(rbtnEnglish);
        buttonGroup1.add(rbtnGerman);
        
        setLanguage(); 
    }
    
    public static StartMenu getInstance(){
        if(startMenu == null){
            startMenu= new StartMenu();
        }
        return startMenu;
    }
    
    private void setLanguage(){
        baseName= Language.getLanguage();
        bundle = ResourceBundle.getBundle(baseName);
        
        this.setTitle(bundle.getString("title"));
        
        lWelcomeText.setText(bundle.getString("lWelcomeText"));
        llanguageChoose.setText(bundle.getString("lChooseLanguage"));
        rbtnEnglish.setText(bundle.getString("rbtnEnglishText"));
        rbtnGerman.setText(bundle.getString("rbtnGermanText"));
        lPlayer.setText(bundle.getString("lPlayer"));
        lEnterNickname.setText(bundle.getString("lEnterNickname"));
        lChooseGender.setText(bundle.getString("lChooseGender"));
        lmGender.setElementAt((bundle.getString("genderMale")),0);
        lmGender.setElementAt((bundle.getString("genderFemale")),1);
        btnExit.setText(bundle.getString("btnExit"));
        btnStart.setText(bundle.getString("btnStart"));
        lException.setText(bundle.getString("lException3"));
        
        mFile.setText(bundle.getString("mFile"));
        mEdit.setText(bundle.getString("mEdit"));
        mFileExit.setText(bundle.getString("mFileExit"));
        mEditLanguage.setText(bundle.getString("mEditLanguage"));
       
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
        buttonGroup1 = new javax.swing.ButtonGroup();
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
        lException = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        mFileExit = new javax.swing.JMenuItem();
        mEdit = new javax.swing.JMenu();
        mEditLanguage = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lWelcomeText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lWelcomeText.setForeground(new java.awt.Color(0, 153, 255));
        lWelcomeText.setText("lWelcomeText");

        llanguageChoose.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        llanguageChoose.setForeground(new java.awt.Color(0, 153, 255));
        llanguageChoose.setText("languageChoose");

        rbtnEnglish.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbtnEnglish.setForeground(new java.awt.Color(0, 153, 255));
        rbtnEnglish.setSelected(true);
        rbtnEnglish.setText("rbtnEnglish");
        rbtnEnglish.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnEnglishItemStateChanged(evt);
            }
        });
        rbtnEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEnglishActionPerformed(evt);
            }
        });

        rbtnGerman.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbtnGerman.setForeground(new java.awt.Color(0, 153, 255));
        rbtnGerman.setText("rbtnGerman");
        rbtnGerman.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnGermanItemStateChanged(evt);
            }
        });

        lPlayer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lPlayer.setForeground(new java.awt.Color(0, 153, 255));
        lPlayer.setText("lPlayer");

        btnExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 153, 255));
        btnExit.setText("btnExit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnStart.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnStart.setForeground(new java.awt.Color(0, 153, 255));
        btnStart.setText("btnStart");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        listbxGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        listbxGender.setForeground(new java.awt.Color(0, 153, 255));
        listbxGender.setAutoscrolls(false);
        listbxGender.setSelectionBackground(new java.awt.Color(102, 255, 102));
        listbxGender.setSelectionForeground(new java.awt.Color(0, 153, 255));
        jScrollPane1.setViewportView(listbxGender);

        lChooseGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lChooseGender.setForeground(new java.awt.Color(0, 153, 255));
        lChooseGender.setText("lchooseGender");

        lEnterNickname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lEnterNickname.setForeground(new java.awt.Color(0, 153, 255));
        lEnterNickname.setText("lEnterNickname");

        txtfieldNick.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtfieldNick.setForeground(new java.awt.Color(0, 153, 255));
        txtfieldNick.setText("Joe");

        lException.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lException.setForeground(new java.awt.Color(204, 0, 0));
        lException.setText("lException");

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        mFile.setText("File");

        mFileExit.setText("mFileExit");
        mFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFileExitActionPerformed(evt);
            }
        });
        mFile.add(mFileExit);

        jMenuBar1.add(mFile);

        mEdit.setText("Edit");

        mEditLanguage.setText("mEditLanguage");
        mEdit.add(mEditLanguage);

        jMenuBar1.add(mEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfieldNick, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lChooseGender, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lException)
                    .addComponent(llanguageChoose)
                    .addComponent(rbtnEnglish)
                    .addComponent(rbtnGerman)
                    .addComponent(lPlayer)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lEnterNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lWelcomeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lWelcomeText)
                .addGap(31, 31, 31)
                .addComponent(lException)
                .addGap(36, 36, 36)
                .addComponent(llanguageChoose)
                .addGap(5, 5, 5)
                .addComponent(rbtnEnglish)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnGerman)
                .addGap(29, 29, 29)
                .addComponent(lPlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEnterNickname)
                        .addGap(33, 33, 33)
                        .addComponent(txtfieldNick, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lChooseGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                
        //0 = male / 1= female
        if(listbxGender.isSelectedIndex(0))
            gender = 0;
        else gender = 1;
            
        }
        else{
            lException.setText(bundle.getString("lException3"));
            lException.setVisible(true);
            return;
        }
        
        // init simulation and save current date and time
        ControlGuiStart.createPlayer(nick, gender);
        
        //init shares
        ControlGuiStart.createShares();
        
        //close window
        this.setVisible(false);
        //open gui simulation
        ShareSimulation sim = ShareSimulation.getInstance();
        sim.refreshData();
        sim.setLocationRelativeTo(null);
        sim.setVisible(true);
        
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void mFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFileExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mFileExitActionPerformed

    private void rbtnEnglishItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnEnglishItemStateChanged
        if(rbtnEnglish.isSelected()){
           Language.setLanguage(Language.aLanguage.ENGLISH);                        
        }
        else{
            if(!rbtnEnglish.isSelected()){
               Language.setLanguage(Language.aLanguage.GERMAN);
                
            }
        }
        setLanguage();
    }//GEN-LAST:event_rbtnEnglishItemStateChanged

    private void rbtnGermanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnGermanItemStateChanged
        if(rbtnEnglish.isSelected()){
            Language.setLanguage(Language.aLanguage.ENGLISH);                        
        }
        else{
            if(!rbtnEnglish.isSelected()){
                Language.setLanguage(Language.aLanguage.GERMAN);
                
            }
        }
        setLanguage();
    }//GEN-LAST:event_rbtnGermanItemStateChanged

    private void rbtnEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnEnglishActionPerformed
    //nickname has to be longer than two chars
    private boolean nickCountChars(){
        
        String nick = txtfieldNick.getText().trim();
        
        if(nick.length() >= 3)
            return true;
        else return false;
        
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lChooseGender;
    private javax.swing.JLabel lEnterNickname;
    private javax.swing.JLabel lException;
    private javax.swing.JLabel lPlayer;
    private javax.swing.JLabel lWelcomeText;
    private javax.swing.JList<String> listbxGender;
    private javax.swing.JLabel llanguageChoose;
    private javax.swing.JMenu mEdit;
    private javax.swing.JMenuItem mEditLanguage;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenuItem mFileExit;
    private javax.swing.JRadioButton rbtnEnglish;
    private javax.swing.JRadioButton rbtnGerman;
    private javax.swing.JTextField txtfieldNick;
    // End of variables declaration//GEN-END:variables
}
