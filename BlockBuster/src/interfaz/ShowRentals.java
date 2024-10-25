/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfaz;

import blockbuster.Rental;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ShowRentals extends javax.swing.JInternalFrame {
    PrincipalPanel parent;

    /**
     * Creates new form ShowRentals
     */
    
    //ShowRentals  class constructor
    public ShowRentals(PrincipalPanel parent) {
        initComponents();
        this.parent = parent;
        updateTable(parent.getBlockBuster().getRentals());
    }
    
    //Responsible for displaying and updating the rental table
    private void updateTable(Vector<Rental> rentals){
        String[] columns = {
            "Customer",
            "Movies",
            "Start date",
            "End date",
            "Status"
        };
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        for (Rental rental : rentals){
            rental.verifyStatus();
            Object[] dataRow = {
                rental.getCustomer().getName(),
                rental.moviesToString(),
                rental.getStartDate(),
                rental.getEndDate(),
                rental.getState()
            };
            model.addRow(dataRow);
        }
        tableRentals.setModel(model);
        tableRentals.setEnabled(false);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableRentals = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        tableRentals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableRentals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRentals;
    // End of variables declaration//GEN-END:variables
}
