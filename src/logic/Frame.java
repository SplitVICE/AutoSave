package logic;

import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {

    LinkedList<autoSaveRun> listaHilos = new LinkedList<autoSaveRun>();

    public Frame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle(Static.title + " " + Static.version);
        settings();
        userSettingsIO();
    }

    private void settings() {
        combos.setSelected(true);
        textmin.setText("0");
        textsec.setText("0");
        if (Static.showSavedMessage) {
            combosaved.setSelected(true);
        } else {
            combosaved.setSelected(false);
        }
        stop.setEnabled(false);
        setIconImage(Static.getIconImage());
    }

    private void userSettingsIO() {
        switch (Static.data.getUserData().getSavePrefix()) {/*Combo boxes*/
            case "S":
                combos.setSelected(true);
                break;
            case "G":
                combog.setSelected(true);
                break;
            default:
                throw new AssertionError();
        }
        if (Static.data.getUserData().isShowSavedMessage()) {
            combosaved.setSelected(true);
            Static.showSavedMessage = true;
        } else {
            combosaved.setSelected(false);
            Static.showSavedMessage = false;
        }
        textsec.setText(Static.data.getUserData().getSec());
        textmin.setText(Static.data.getUserData().getMin());
    }

    private void saveUserSettings() {
        if (combos.isSelected()) {
            Static.data.getUserData().setSavePrefix("S");
        } else {
            Static.data.getUserData().setSavePrefix("G");
        }
        if (combosaved.isSelected()) {
            Static.data.getUserData().setShowSavedMessage(true);
        } else {
            Static.data.getUserData().setShowSavedMessage(false);
        }
        Static.data.updateInfo();
        Static.data.getUserData().setSec(textsec.getText());
        Static.data.getUserData().setMin(textmin.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        stop = new javax.swing.JButton();
        start = new javax.swing.JButton();
        combosaved = new javax.swing.JRadioButton();
        textmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textsec = new javax.swing.JTextField();
        sec = new javax.swing.JLabel();
        combog = new javax.swing.JRadioButton();
        combos = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        Github = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alllinks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stop.setText("Stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        start.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        combosaved.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combosaved.setText("Show \"saved\" alert");
        combosaved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combosavedActionPerformed(evt);
            }
        });

        textmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textminFocusLost(evt);
            }
        });
        textmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textminKeyTyped(evt);
            }
        });

        jLabel2.setText("MINUTES");

        textsec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textsec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textsecFocusLost(evt);
            }
        });
        textsec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textsecKeyTyped(evt);
            }
        });

        sec.setText("SECONDS");

        buttonGroup1.add(combog);
        combog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combog.setText("CTRL + G");
        combog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combogActionPerformed(evt);
            }
        });

        buttonGroup1.add(combos);
        combos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combos.setText("CTRL + S");
        combos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ACTION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textsec)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textmin)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel2))
                                    .addComponent(combosaved))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(sec))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(combos)
                                        .addComponent(combog)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textsec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(combosaved)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start)
                    .addComponent(stop))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main", jPanel1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jv.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jv name.png"))); // NOI18N

        jLabel4.setText("Made by:");

        twitter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        twitter.setText("<html><a href=\"http://www.google.com\">Twitter</a></html>");
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });

        Github.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Github.setText("<html><a href=\"http://www.google.com\">Github</a></html>");
        Github.setToolTipText("<html><a href=\"http://www.google.com\">Github</a>\n</html>");
        Github.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GithubMouseClicked(evt);
            }
        });

        jLabel6.setText("Links:");

        alllinks.setText("<html><a href=\"http://www.google.com\">All links</a></html>");
        alllinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alllinksMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(alllinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alllinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );

        jTabbedPane1.addTab("About", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        startWorking();
    }//GEN-LAST:event_startActionPerformed

    private void startWorking() {
        try {
            if (isTimeTyped()) {
                int undertime = 0;
                Static.timeStatic = Static.run.timeConverter(textsec.getText(), textmin.getText());
                if (Static.timeStatic <= 10000) {
                    undertime = JOptionPane.showConfirmDialog(null, "You are setting an under/equals 10 seconds timelapse to perform a CTRL + S/G"
                            + "\nThere will be a continuos spam of CTRL + S/G. It is recomended to set 2 minutes.\n"
                            + "Do you want to continue?");
                }
                if (undertime == 0) {
                    byte option = 0;
                    if (combog.isSelected()) {
                        option = (byte) 1;
                    }
                    listaHilos.add(new autoSaveRun());
                    stop.setEnabled(true);
                    start.setEnabled(false);
                    saveUserSettings();
                }
            }

        } catch (Exception e) {
        }
    }

    private void timeChanged() {
        try {
            if (Integer.parseInt(textsec.getText()) < 2 && textmin.getText().equals("0")) {
                textsec.setText("10");
            }
            Static.timeStatic = Static.run.timeConverter(textsec.getText(), textmin.getText());
        } catch (Exception e) {
            System.out.println("Error en timeChanged");
        }

    }

    private boolean isTimeTyped() {
        if (textsec.getText().equals("0") && textmin.getText().equals("0")) {
            setTextFieldsToCero();
            errorMessage("NO TIME", "You must provide a time to perform hotkeys.");
            return false;
        } else {
            try {
                int n1 = Integer.parseInt(textsec.getText());
                int n2 = Integer.parseInt(textmin.getText());
                return true;
            } catch (Exception e) {
                setTextFieldsToCero();
                errorMessage("NO TIME", "You must provide a time to perform hotkeys.");
                return false;
            }
        }
    }

    private void setTextFieldsToCero() {
        textsec.setText("0");
        textmin.setText("0");
    }

    private void errorMessage(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, 0);
    }

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        for (autoSaveRun a : listaHilos) {
            a.setStillRunning(false);
        }
        stop.setEnabled(false);
        start.setEnabled(true);
    }//GEN-LAST:event_stopActionPerformed

    private void textsecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textsecKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || textsec.getText().length() == 4) {
            evt.consume();
        }
        if (textsec.getText().equals("0") && Character.isDigit(c)) {
            evt.consume();
            textsec.setText("" + c);
        }
        if (textsec.getText().equals("")) {
            textsec.setText("0");
        }

        if (c == KeyEvent.VK_ENTER) {
            startWorking();
        }
        if (c == KeyEvent.VK_0 && textsec.getText().length() == 4) {
            textsec.setText("0");
        }
        timeChanged();
        saveUserSettings();
    }//GEN-LAST:event_textsecKeyTyped

    private void textminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textminKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || textmin.getText().length() == 4) {
            evt.consume();
        }
        if (textmin.getText().equals("0") && Character.isDigit(c)) {
            evt.consume();
            textmin.setText("" + c);
        }
        if (textmin.getText().equals("")) {
            textmin.setText("0");
        }
        if (c == KeyEvent.VK_ENTER) {
            startWorking();
        }
        if (c == KeyEvent.VK_0 && textmin.getText().length() == 4) {
            textmin.setText("0");
        }
        timeChanged();
        saveUserSettings();
    }//GEN-LAST:event_textminKeyTyped

    private void combosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combosActionPerformed
        Static.parameterStatic = 0;
        saveUserSettings();
    }//GEN-LAST:event_combosActionPerformed

    private void combosavedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combosavedActionPerformed
        if (combosaved.isSelected()) {
            Static.showSavedMessage = true;
            saveUserSettings();
        } else {
            Static.showSavedMessage = false;
            saveUserSettings();
        }
    }//GEN-LAST:event_combosavedActionPerformed

    private void combogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combogActionPerformed
        Static.parameterStatic = 1;
        saveUserSettings();
    }//GEN-LAST:event_combogActionPerformed

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://twitter.com/JustVice1"));
            } catch (IOException | URISyntaxException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_twitterMouseClicked

    private void GithubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GithubMouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/JustVice?tab=repositories"));
            } catch (IOException | URISyntaxException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_GithubMouseClicked

    private void alllinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alllinksMouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://justvice.wixsite.com/info"));
            } catch (IOException | URISyntaxException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_alllinksMouseClicked

    private void textsecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textsecFocusLost
        saveUserSettings();
    }//GEN-LAST:event_textsecFocusLost

    private void textminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textminFocusLost
        saveUserSettings();
    }//GEN-LAST:event_textminFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Github;
    private javax.swing.JLabel alllinks;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton combog;
    private javax.swing.JRadioButton combos;
    private javax.swing.JRadioButton combosaved;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel sec;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    private javax.swing.JTextField textmin;
    private javax.swing.JTextField textsec;
    private javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables

}