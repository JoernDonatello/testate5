package t4;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import static t4.CreateHelper.tfPrename;
import static t4.CreateHelper.tfSurname;
import static t4.CreateHelper.cbGender;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nutzer
 */
public class HelperManager extends javax.swing.JFrame {
    
    
 DefaultTableModel model;
    private int helperID;
    private String prename, surname, gender;

    static HelperManager myHelperManager = new HelperManager();
    static ArrayList<HelperManager> myHelpers = new ArrayList<>();

    public HelperManager() {
        initComponents();
         model = (DefaultTableModel) jTable1.getModel();
        hinzufugen();
    }

    public HelperManager(int id, String prename, String surname, String gender) {
        this.helperID = id;
        this.prename = prename;
        this.surname = surname;
        this.gender = gender;
    }

    public int getHelperID() {
        return helperID;
    }

    public void setHelperID(int helperID) {
        this.helperID = helperID;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jWarningHelper = new javax.swing.JLabel();
        cbFilter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        saveHelper = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Create a new helper");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHelper(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHelper(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jWarningHelper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jWarningHelper.setForeground(new java.awt.Color(255, 51, 51));

        cbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all", "male", "female", "divers" }));
        cbFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFilter(evt);
            }
        });

        jLabel1.setText("Set Filter:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Double-click to update!");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HelperID", "Prename", "Surname", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        saveHelper.setText("Save");
        saveHelper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHelperActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbFilter, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jWarningHelper, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveHelper)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(jButton4)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jWarningHelper, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveHelper))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteHelper(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHelper
        jWarningHelper.setText("");
        if (jTable1.getModel().getRowCount() == 0) {
            jWarningHelper.setText("Please first create a helper!");
        } else {
            try {
                int selectedIndex = jTable1.getSelectedRow();
                
                if (selectedIndex != -1) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", dialogButton);
                    if (dialogResult == 0) {
                        model.removeRow(selectedIndex);
                        myHelpers.remove(selectedIndex);
                    }
                } else {
                    jWarningHelper.setText("Please select first, then delete!");
                }
            } catch (Exception e) {
                jWarningHelper.setText("Please first create a Helper!");
            }
        }


    }//GEN-LAST:event_deleteHelper

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        BasicData home = new BasicData();
        home.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void createHelper(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHelper
        this.setVisible(false);
        CreateHelper createwindow = new CreateHelper();
        createwindow.setVisible(true);
    }//GEN-LAST:event_createHelper

    private void showFilter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFilter
        String select = cbFilter.getSelectedItem().toString();
        try {
            model.setRowCount(0);
            for (HelperManager i : myHelpers) {
                switch (select) {
                    case "male":
                        if (i.getGender() == "male") {
                           model.insertRow(model.getRowCount(), new Object[]{i.getHelperID(),i.getPrename(),i.getSurname(),i.getGender()});
                        }
                        break;
                    case "female":
                        if (i.getGender() == "female") {
                            model.insertRow(model.getRowCount(), new Object[]{i.getHelperID(),i.getPrename(),i.getSurname(),i.getGender()});
                        }
                        break;
                    case "divers":
                        if (i.getGender() == "divers") {
                             model.insertRow(model.getRowCount(), new Object[]{i.getHelperID(),i.getPrename(),i.getSurname(),i.getGender()});
                        }
                        break;
                    case "all":
                         model.insertRow(model.getRowCount(), new Object[]{i.getHelperID(),i.getPrename(),i.getSurname(),i.getGender()});
                        break;
                }
            }
          
        } catch (Exception e) {
        }
    }//GEN-LAST:event_showFilter

    private void saveHelperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHelperActionPerformed
        // TODO add your handling code here:
        jWarningHelper.setText("");
        myHelpers.clear();
        int row = jTable1.getRowCount ();
        for (int i = 0; i<row; i++) {
            this.myHelpers.add(new HelperManager (Integer.parseInt(model.getValueAt (i, 0).toString()), model.getValueAt (i, 1).toString(), model.getValueAt(i, 2).toString(), model.getValueAt(i, 3).toString()));    
        }
        this.setVisible(false);
        HelperManager home = new HelperManager();
        home.setVisible(true);
    }//GEN-LAST:event_saveHelperActionPerformed
    public void hinzufugen() {
        try {
           
            for (HelperManager i : myHelpers) {
                model.insertRow(model.getRowCount(), new Object[]{i.getHelperID(),i.getPrename(),i.getSurname(),i.getGender()});

            }
            

        } catch (Exception e) {
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelperManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JLabel jWarningHelper;
    private javax.swing.JButton saveHelper;
    // End of variables declaration//GEN-END:variables
}
