/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.treehouse.mvp.tabletutor;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableForm extends javax.swing.JFrame implements ListSelectionListener {

    private List<Data> dataList;
    private JTable table;
    
    public TableForm() {
        initComponents();
        setLocationRelativeTo(null);
        dataList = new ArrayList<>();
        dataList.add(new Data("Jack", 514.12, 51545, new Date()));
        dataList.add(new Data("Karel", 45.45, 64589, new Date()));
        dataList.add(new Data("Jarda", 812.31, 84516, new Date()));
        dataList.add(new Data("Alan", 567.145, 32157, new Date()));
        dataList.add(new Data("Thomas", 100.39, 9654, new Date()));
        dataList.add(new Data("Phillipe", 1984.0608, 96544, new Date()));
        dataList.add(new Data("Alexa", 794.99, 95461, new Date()));
        dataList.add(new Data("Bukač", 326.645, 44652, new Date()));
        dataList.add(new Data("Fedor", 655.16, 2150, new Date()));
        dataList.add(new Data("Trumpton", 320.21, 6234, new Date()));
        dataList.add(new Data("Mc Daniels", 8845.65164, 68459, new Date()));
        TernerTableModel tableModel = new TernerTableModel(dataList);
        TernerTableRenderer tableRenderer = new TernerTableRenderer();
        table = new JTable(tableModel);
        table.setDefaultRenderer(table.getColumnClass(0), tableRenderer);
        table.setDefaultRenderer(table.getColumnClass(1), tableRenderer);
        spTable.setViewportView(table);
        for (int i = 0; i < 4; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(TernerTableModel.COLUMN_WIDTHS[i] * 20);
        }
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getSelectionModel().addListSelectionListener(this);
        table.setRowHeight(20);
        table.setFillsViewportHeight(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTable = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        tfJmeno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfInt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDouble = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDatum = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(tfJmeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, -1));

        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel2.setText("Integer:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        tfInt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(tfInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, -1));

        jLabel3.setText("Double:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        tfDouble.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(tfDouble, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 80, -1));

        jLabel4.setText("Date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));
        jPanel1.add(tfDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 330, -1));

        btnAdd.setText("Add");
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTable)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TableForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JTextField tfDatum;
    private javax.swing.JTextField tfDouble;
    private javax.swing.JTextField tfInt;
    private javax.swing.JTextField tfJmeno;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int r = table.getSelectedRow();
        tfJmeno.setText((String) table.getValueAt(r, 0));
        tfInt.setText(String.valueOf(table.getValueAt(r, 1)));
        tfDouble.setText(String.valueOf(table.getValueAt(r, 2)));
        tfDatum.setText(String.valueOf(table.getValueAt(r, 3)));
    }
}
