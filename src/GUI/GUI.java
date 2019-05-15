/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.CustomerBL;
import GUI.VehicleDialog;
import GUI.CustomerDialog;
import BL.VehicleBL;
import Exceptions.NotEnoughMoney;
import Exceptions.VehicleNotAvailable;
import fahrzeug_vermietung.CarBrands;
import fahrzeug_vermietung.Customer;
import fahrzeug_vermietung.DataBase;
import fahrzeug_vermietung.Vehicle;
import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author oskar
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private VehicleBL vehicleBL = new VehicleBL();
    private CustomerBL customerBL = new CustomerBL();
    private DataBase database;
    
    public GUI() {
        initComponents();
        costumerList.setModel(customerBL);
        vehicleList.setModel(vehicleBL);
        try {
            database = DataBase.getInstance();
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            database.initialize(vehicleBL, customerBL);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
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
        java.awt.GridBagConstraints gridBagConstraints;

        vehiclePopM = new javax.swing.JPopupMenu();
        jMBorrowCar = new javax.swing.JMenuItem();
        jMVehicleIsBack = new javax.swing.JMenuItem();
        customerPopM = new javax.swing.JPopupMenu();
        jMPayIn = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleList = new javax.swing.JList<>();
        btNewCustomer = new javax.swing.JButton();
        btNewVehicle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        costumerList = new javax.swing.JList<>();

        jMBorrowCar.setText("borrow Car");
        jMBorrowCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBorrowCarActionPerformed(evt);
            }
        });
        vehiclePopM.add(jMBorrowCar);

        jMVehicleIsBack.setText("Vehicle is Back");
        jMVehicleIsBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVehicleIsBackActionPerformed(evt);
            }
        });
        vehiclePopM.add(jMVehicleIsBack);

        jMPayIn.setText("Pay in");
        jMPayIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPayInActionPerformed(evt);
            }
        });
        customerPopM.add(jMPayIn);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        vehicleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        vehicleList.setComponentPopupMenu(vehiclePopM);
        jScrollPane1.setViewportView(vehicleList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        btNewCustomer.setText("Create new Customer");
        btNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewCustomerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(btNewCustomer, gridBagConstraints);

        btNewVehicle.setText("Create new Vehicle");
        btNewVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewVehicleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(btNewVehicle, gridBagConstraints);

        costumerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        costumerList.setComponentPopupMenu(customerPopM);
        jScrollPane2.setViewportView(costumerList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewCustomerActionPerformed
        CustomerDialog d = new CustomerDialog(this, true);
        
        d.setVisible(true);
        if (d.isOk()) {
            int cID;
            try {
                cID = database.addCustomer(d.getName(), d.getGebDat(), d.getTelNumber(), d.getMoney());
                customerBL.add(d.getName(), d.getGebDat(), d.getTelNumber(), d.getMoney(), cID);
                
            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btNewCustomerActionPerformed

    private void btNewVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewVehicleActionPerformed
        VehicleDialog dia = new VehicleDialog(this, true);
        dia.setVisible(true);
        if (dia.isOk()) {
            try {
                int vID = database.addVehicle(dia.getName(), (int) dia.getPricePDay(), dia.getBrand());
                vehicleBL.add(dia.getName(), dia.getBrand(), dia.getPricePDay(), vID);
            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btNewVehicleActionPerformed

    private void jMBorrowCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBorrowCarActionPerformed
        int idx = vehicleList.getSelectedIndex();
        try {
            Vehicle v = vehicleBL.get(idx);
            Customer c = customerBL.get(costumerList.getSelectedIndex());
            DateDialog d = new DateDialog(this, true);
            d.setVisible(true);
            if (d.isOk()) {
                v.borrow(c, d.getDate());

//                database.VehicleBorrowed(v, c);
                database.updateVehicle(v);
                database.updateCustomer(c);
                vehicleBL.update();
            }

//        } catch (NotEnoughMoney ex) {
//            JOptionPane.showMessageDialog(null, "Customer has not enough money");
//        } catch (VehicleNotAvailable ex) {
//            JOptionPane.showMessageDialog(null, "Vehicle already borrowed");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Please select a vehicle and a customer");
        } catch (Exception ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMBorrowCarActionPerformed

    private void jMVehicleIsBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVehicleIsBackActionPerformed
        Vehicle v = vehicleBL.get(vehicleList.getSelectedIndex());
        v.vehicleBack();
        vehicleBL.update();
        try {
            database.updateVehicle(v);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMVehicleIsBackActionPerformed

    private void jMPayInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPayInActionPerformed
        int amount = Integer.parseInt(JOptionPane.showInputDialog("How much do you want to pay in?"));
        Customer c = customerBL.get(costumerList.getSelectedIndex());
        
        c.pay(amount);
        try {
            database.updateCustomer(c);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMPayInActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNewCustomer;
    private javax.swing.JButton btNewVehicle;
    private javax.swing.JList<String> costumerList;
    private javax.swing.JPopupMenu customerPopM;
    private javax.swing.JMenuItem jMBorrowCar;
    private javax.swing.JMenuItem jMPayIn;
    private javax.swing.JMenuItem jMVehicleIsBack;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> vehicleList;
    private javax.swing.JPopupMenu vehiclePopM;
    // End of variables declaration//GEN-END:variables
}
