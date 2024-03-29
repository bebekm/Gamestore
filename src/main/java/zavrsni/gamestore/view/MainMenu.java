/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.gamestore.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import zavrsni.gamestore.controller.ControllerUser;
import zavrsni.gamestore.controller.ControllerGame;
import zavrsni.gamestore.model.User;

import zavrsni.gamestore.model.Game;


import zavrsni.gamestore.util.GamestoreException;

/**
 *
 * @author Korisnik
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    
        private User user;
        private ControllerGame controlGame;
        private ControllerUser control;
    
    public MainMenu() {
        
        
        initComponents();
        control = new ControllerUser();
        setTitle(Application.TITLE_APP + "Main Menu");
        controlGame = new ControllerGame();
        new Time().start();
        
        String name = Application.user.getUsername();
        lblWelcomeUser.setText("Welcome, \r" + name);
        loadUsers();
        loadGames();
        loadOwnedGames();
        loadFriendlist();
    }

    
    private class Time extends Thread{
        private SimpleDateFormat df = 
                new SimpleDateFormat("dd. MMMM YYYY. HH:mm:ss");

        @Override
        public void run() {
            while (true) {                
                lblTime.setText(df.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
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

        lblWelcomeUser = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGamesOwned = new javax.swing.JList<>();
        lblGamesOwned = new javax.swing.JLabel();
        btnPurchase = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstGames = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstFriendlist = new javax.swing.JList<>();
        lblGames = new javax.swing.JLabel();
        lblFriendlist = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstAllUsers = new javax.swing.JList<>();
        lblAllUsers = new javax.swing.JLabel();
        btnSendRqst = new javax.swing.JButton();
        btnRmvFrnd = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnConfirm1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWelcomeUser.setText("Welcome, [USER]");

        lblTime.setText("Time");

        lstGamesOwned.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstGamesOwnedValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstGamesOwned);

        lblGamesOwned.setText("Games owned:");

        btnPurchase.setText("Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstGames);

        lstFriendlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFriendlistValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstFriendlist);

        lblGames.setText("Games:");

        lblFriendlist.setText("Friendlist");

        jScrollPane4.setViewportView(lstAllUsers);

        lblAllUsers.setText("All users:");

        btnSendRqst.setText("Send request");
        btnSendRqst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRqstActionPerformed(evt);
            }
        });

        btnRmvFrnd.setText("Remove friend");
        btnRmvFrnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvFrndActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnConfirm1.setText("Confirm");
        btnConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGamesOwned)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTime)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFriendlist))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPurchase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSendRqst, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(btnConfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRmvFrnd, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(btnConfirm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAllUsers)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGames)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWelcomeUser)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblWelcomeUser)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGamesOwned)
                    .addComponent(lblGames))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnPurchase)
                        .addGap(26, 26, 26)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFriendlist)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(lblTime))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnSendRqst)
                                .addGap(38, 38, 38)
                                .addComponent(btnRmvFrnd)
                                .addGap(18, 18, 18)
                                .addComponent(btnConfirm1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAllUsers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        DefaultListModel<Game> m;
        try {
            m=(DefaultListModel<Game>) lstGamesOwned.getModel();
            m.get(0).toString();
        } catch (Exception e) {
            m= new DefaultListModel<>();
            lstGamesOwned.setModel(m);
        }
        boolean exists;
        for(Game a : lstGames.getSelectedValuesList()){
           exists=false;
           for(int i=0;i<m.size();i++){
               if(a.getId().equals(m.get(i).getId())){
                   exists=true;
                   break;
               }
           }
           if(!exists){
               m.addElement(a);
           }
       }
        
        Game g = new Game();
        controlGame.setEntitet(g);
//       lstGamesOwned.repaint();
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
      DefaultListModel<Game> m;
        try {
            m=(DefaultListModel<Game>) lstGamesOwned.getModel();
            m.get(0).toString();
        } catch (Exception e) {
           return;
        }

        for(Game an : lstGamesOwned.getSelectedValuesList()){

           for(int i=0;i<m.size();i++){
               if(an.getId().equals(m.get(i).getId())){
                   m.removeElementAt(i);
                   break;
               }
           }

       }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSendRqstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRqstActionPerformed
        DefaultListModel<User> m;
        try {
            m=(DefaultListModel<User>) lstFriendlist.getModel();
            m.get(0).toString();
        } catch (Exception e) {
            m= new DefaultListModel<>();
            lstFriendlist.setModel(m);
        }
        boolean exists;
        for(User a : lstAllUsers.getSelectedValuesList()){
           exists=false;
           for(int i=0;i<m.size();i++){
               if(a.getId().equals(m.get(i).getId())){
                   exists=true;
                   break;
               }
           }
           if(!exists){
               m.addElement(a);
           }
       }
       lstFriendlist.repaint();
    }//GEN-LAST:event_btnSendRqstActionPerformed

    private void btnRmvFrndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvFrndActionPerformed
        DefaultListModel<User> m;
        try {
            m=(DefaultListModel<User>) lstFriendlist.getModel();
            m.get(0).toString();
        } catch (Exception e) {
           return;
        }

        for(User an : lstFriendlist.getSelectedValuesList()){

           for(int i=0;i<m.size();i++){
               if(an.getId().equals(m.get(i).getId())){
                   m.removeElementAt(i);
                   break;
               }
           }

       }
    }//GEN-LAST:event_btnRmvFrndActionPerformed

    private void lstGamesOwnedValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstGamesOwnedValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstGamesOwned.getSelectedValue() == null) {
            return;
        }
        
        Game g = lstGamesOwned.getSelectedValue();
    }//GEN-LAST:event_lstGamesOwnedValueChanged

    private void lstFriendlistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFriendlistValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstFriendlist.getSelectedValue() == null) {
            return;
        }
        
        User u = lstFriendlist.getSelectedValue();
    }//GEN-LAST:event_lstFriendlistValueChanged

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        controlGame.setEntitet(new Game());
        setGamesOnEntity();

        try {
            controlGame.update();
        } catch (GamestoreException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm1ActionPerformed
        control.setEntitet(new User());
        setFriendsOnEntity();

        try {
            control.update();
        } catch (GamestoreException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnConfirm1ActionPerformed


    private void loadUsers(){
               
        DefaultListModel<User> m = new DefaultListModel<>();

        m.addAll(control.getData());

        lstAllUsers.setModel(m);
    }
    
    private void loadGames() {
                
        DefaultListModel<Game> m = new DefaultListModel<>();

        m.addAll(controlGame.getData());

        lstGames.setModel(m);
    }
    
    private void loadOwnedGames(){
        DefaultListModel<Game> m = new DefaultListModel<>();

        m.addAll(Application.user.getGames());

        lstGamesOwned.setModel(m);
    }
    
    private void loadFriendlist(){
        DefaultListModel<User> m = new DefaultListModel<>();

        m.addAll(Application.user.getFriendlists());

        lstFriendlist.setModel(m);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnConfirm1;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnRmvFrnd;
    private javax.swing.JButton btnSendRqst;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAllUsers;
    private javax.swing.JLabel lblFriendlist;
    private javax.swing.JLabel lblGames;
    private javax.swing.JLabel lblGamesOwned;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblWelcomeUser;
    private javax.swing.JList<User> lstAllUsers;
    private javax.swing.JList<User> lstFriendlist;
    private javax.swing.JList<Game> lstGames;
    private javax.swing.JList<Game> lstGamesOwned;
    // End of variables declaration//GEN-END:variables


    private void setGamesOnEntity(){
        var c = Application.user;
        
        DefaultListModel<Game> g;
        try {
            g=(DefaultListModel<Game>) lstGamesOwned.getModel();
            c.setGames(new ArrayList<>());
            for(int i=0;i<g.getSize();i++){
                c.getGames().add(g.get(i));
            }
        } catch (Exception e) {
           
        }
    }
    
    private void setFriendsOnEntity(){
        var c = Application.user;
        
        DefaultListModel<User> u;
        try {
            u=(DefaultListModel<User>) lstFriendlist.getModel();
            c.setFriendlists(new ArrayList<>());
            for(int i=0;i<u.getSize();i++){
                c.getFriendlists().add(u.get(i));
            }
        } catch (Exception e) {
           
        }

    }
}
