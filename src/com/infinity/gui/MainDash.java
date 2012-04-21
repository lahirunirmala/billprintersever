/*
 * MainDash.java
 *
 * Created on October 23, 2008, 12:34 PM
 */
package com.infinity.gui;

import com.infinity.io.HostHandler;
import com.infinity.logics.Computers;
import com.infinity.logics.MessageSender;
import com.infinity.logics.SeverLogger;
import com.infinity.logics.StartNortify;
import java.text.DateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author  Lahiru
 */
public class MainDash extends javax.swing.JFrame {

    Object[] selectedItems;

    /** Creates new form MainDash */
    public MainDash() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            new SeverLogger();
        } catch (Exception ex) {
        }
        setHost();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstHosts = new javax.swing.JList();
        tbrMain = new javax.swing.JToolBar();
        btnSave = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnDoLoging = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnSendNote = new javax.swing.JButton();
        btnRef = new javax.swing.JButton();
        btnSendMsg = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnShoutDown = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLogState = new javax.swing.JTextArea();
        menuMain = new javax.swing.JMenuBar();
        munFile = new javax.swing.JMenu();
        mnuSave = new javax.swing.JMenuItem();
        mnuOption = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        mnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuPing = new javax.swing.JMenuItem();
        mnuRef = new javax.swing.JMenuItem();
        mnuNote = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bill Looger");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage("./computers.png"));

        lstHosts.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "(empty set)" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstHosts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstHostsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstHosts);

        tbrMain.setRollover(true);
        tbrMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbrMainMouseEntered(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/save32.png"))); // NOI18N
        btnSave.setToolTipText("<HTML><B>Save</B> to a txt file\n\n");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrMain.add(btnSave);

        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/Options32.png"))); // NOI18N
        btnSetting.setToolTipText("<HTML><B>Settings</B> such as <B>Add New Computer,Set there IP and Names</B>");
        btnSetting.setFocusable(false);
        btnSetting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSetting.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });
        tbrMain.add(btnSetting);
        tbrMain.add(jSeparator4);

        btnDoLoging.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/dolog.png"))); // NOI18N
        btnDoLoging.setToolTipText("<HTML>Press this button <B>Start all Computers and Loging</B>");
        btnDoLoging.setFocusable(false);
        btnDoLoging.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoLoging.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDoLoging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoLogingActionPerformed(evt);
            }
        });
        tbrMain.add(btnDoLoging);
        tbrMain.add(jSeparator1);

        btnSendNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/comp32.png"))); // NOI18N
        btnSendNote.setToolTipText("<HTML>use this button to <B>Check Your Computers are working</B>"); // NOI18N
        btnSendNote.setEnabled(false);
        btnSendNote.setFocusable(false);
        btnSendNote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSendNote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSendNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendNoteActionPerformed(evt);
            }
        });
        tbrMain.add(btnSendNote);

        btnRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/ref32.png"))); // NOI18N
        btnRef.setToolTipText("<HTML><B>Refresh</B> data in log");
        btnRef.setFocusable(false);
        btnRef.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRef.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefActionPerformed(evt);
            }
        });
        tbrMain.add(btnRef);

        btnSendMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/receipt32.png"))); // NOI18N
        btnSendMsg.setToolTipText("<HTML><B>Send a Message</B> to selected <B>Computer</B>");
        btnSendMsg.setEnabled(false);
        btnSendMsg.setFocusable(false);
        btnSendMsg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSendMsg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSendMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMsgActionPerformed(evt);
            }
        });
        tbrMain.add(btnSendMsg);
        tbrMain.add(jSeparator2);

        btnShoutDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/shoutdown32.png"))); // NOI18N
        btnShoutDown.setToolTipText("<HTML><B>Shout Down </B>Selected Computers");
        btnShoutDown.setEnabled(false);
        btnShoutDown.setFocusable(false);
        btnShoutDown.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnShoutDown.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnShoutDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShoutDownActionPerformed(evt);
            }
        });
        tbrMain.add(btnShoutDown);

        btnRestart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/Restart32.png"))); // NOI18N
        btnRestart.setToolTipText("<HTML><B>ReStarts </B>Selected Computers");
        btnRestart.setEnabled(false);
        btnRestart.setFocusable(false);
        btnRestart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });
        tbrMain.add(btnRestart);

        txtLogState.setColumns(20);
        txtLogState.setRows(5);
        jScrollPane2.setViewportView(txtLogState);

        munFile.setText("File");

        mnuSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/save_16.png"))); // NOI18N
        mnuSave.setText("Save");
        munFile.add(mnuSave);

        mnuOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/Options1.png"))); // NOI18N
        mnuOption.setText("Options");
        mnuOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOptionActionPerformed(evt);
            }
        });
        munFile.add(mnuOption);
        munFile.add(jSeparator3);

        mnuExit.setText("Exit");
        munFile.add(mnuExit);

        menuMain.add(munFile);

        jMenu2.setText("Commands");

        mnuPing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/computers.png"))); // NOI18N
        mnuPing.setText("Ping");
        mnuPing.setEnabled(false);
        mnuPing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPingActionPerformed(evt);
            }
        });
        jMenu2.add(mnuPing);

        mnuRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/Refresh.png"))); // NOI18N
        mnuRef.setText("Refresh");
        mnuRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRefActionPerformed(evt);
            }
        });
        jMenu2.add(mnuRef);

        mnuNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infinity/res/note.png"))); // NOI18N
        mnuNote.setText("Send Message");
        mnuNote.setEnabled(false);
        mnuNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNoteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuNote);

        menuMain.add(jMenu2);

        setJMenuBar(menuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbrMain, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbrMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnSendNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendNoteActionPerformed
    doPing();
}//GEN-LAST:event_btnSendNoteActionPerformed

private void btnSendMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMsgActionPerformed
    getSelectedHosts();
    sendMessage();
}//GEN-LAST:event_btnSendMsgActionPerformed

private void mnuNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNoteActionPerformed
    getSelectedHosts();
    sendMessage();
}//GEN-LAST:event_mnuNoteActionPerformed

private void mnuOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOptionActionPerformed
    options();
}//GEN-LAST:event_mnuOptionActionPerformed

private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
    options();
}//GEN-LAST:event_btnSettingActionPerformed

private void mnuPingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPingActionPerformed
    doPing();
}//GEN-LAST:event_mnuPingActionPerformed

private void btnShoutDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShoutDownActionPerformed
    doShutDown();
}//GEN-LAST:event_btnShoutDownActionPerformed

private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
    doReStart();
}//GEN-LAST:event_btnRestartActionPerformed

private void btnRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefActionPerformed
    refreshLog();
}//GEN-LAST:event_btnRefActionPerformed

private void mnuRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRefActionPerformed
    refreshLog();
}//GEN-LAST:event_mnuRefActionPerformed

private void lstHostsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstHostsMouseClicked
    setStates(true);
}//GEN-LAST:event_lstHostsMouseClicked

private void tbrMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbrMainMouseEntered
    
    if (lstHosts.getSelectedValues().length == 0) {
        setStates(false);
    }else{
    setStates(true);}
}//GEN-LAST:event_tbrMainMouseEntered

private void btnDoLogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoLogingActionPerformed
doLoginStuff();
}//GEN-LAST:event_btnDoLogingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainDash().setVisible(true);
            }
        });
    }

    private void sendMessage() {
        new SendMessage(this, true,selectedItems).setVisible(true);
    }

    private void options() {
        new Options(this, true).setVisible(true);
    }

    private void setHost() {
        new Computers().getComputers();
    }

    private void getSelectedHosts() {
        selectedItems = lstHosts.getSelectedValues();
        if (selectedItems.length == 0) {
            JOptionPane.showMessageDialog(this, "Select one or More Host to Prefom a Command", "Select A Host", JOptionPane.ERROR_MESSAGE);
        }


    }

    private void pingComputers(Object[] data) {
        for (Object object : data) {
            String key = (String) object;
            String ipAddress = new Computers().getIpAddress(key);
            txtLogState.append(key + " on " + ipAddress + " is pinged Now !! ..\n");
            new Thread(new StartNortify(key, ipAddress)).start();
        }
    }

    private void doPing() {
        getSelectedHosts();
        pingComputers(selectedItems);
    }

    private void doShutDown() {
        getSelectedHosts();
        for (Object object : selectedItems) {
            String key = (String) object;
            String ipAddress = new Computers().getIpAddress(key);
            txtLogState.append(key + " on " + ipAddress + " is Shutig Down Now !! ..\n");
            new MessageSender(ipAddress, "SDW~");
        }
    }

    private void doReStart() {
        getSelectedHosts();
        for (Object object : selectedItems) {
            String key = (String) object;
            String ipAddress = new Computers().getIpAddress(key);
            txtLogState.append(key + " on " + ipAddress + " is Restred Now !! ..\n");
            new MessageSender(ipAddress, "REST~");
        }
    }

    private void refreshLog() {
        txtLogState.setText(null);
        DateFormat d = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT);
        txtLogState.append("....." + d.format(new Date()) + "....\n");
    }

    private void setStates(boolean b) {
        btnSendMsg.setEnabled(b);
        btnSendNote.setEnabled(b);
        btnShoutDown.setEnabled(b);
        btnRestart.setEnabled(b);
        mnuPing.setEnabled(b);
        mnuNote.setEnabled(b);
    }
    
    private void doLoginStuff(){
       Vector<String> allComps =new Vector<String>();
        Enumeration<String> elements = new HostHandler().getFromHD().elements();
        while (elements.hasMoreElements()) {
            String string = elements.nextElement();
            allComps.add(string);
        }
        pingComputers(allComps.toArray());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            }
        String text = txtLogState.getText();
        JOptionPane.showMessageDialog(this, text,"Ping Result",JOptionPane.PLAIN_MESSAGE);
        refreshLog();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoLoging;
    private javax.swing.JButton btnRef;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSendMsg;
    private javax.swing.JButton btnSendNote;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnShoutDown;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    public static javax.swing.JList lstHosts;
    private javax.swing.JMenuBar menuMain;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuNote;
    private javax.swing.JMenuItem mnuOption;
    private javax.swing.JMenuItem mnuPing;
    private javax.swing.JMenuItem mnuRef;
    private javax.swing.JMenuItem mnuSave;
    private javax.swing.JMenu munFile;
    private javax.swing.JToolBar tbrMain;
    public static javax.swing.JTextArea txtLogState;
    // End of variables declaration//GEN-END:variables
}
