/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfaz;

import blockbuster.Customer;
import blockbuster.Function;
import java.util.Vector;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ClientList extends javax.swing.JInternalFrame {

    private PrincipalPanel parent;

    /**
     * Creates new form ClientList
     */
    
    //ClientList class constructor
    public ClientList(PrincipalPanel parent) {
        initComponents();
        this.parent = parent;
        updateTable(parent.getBlockBuster().getCustomers());
    }

    //Responsible for displaying and updating the clients table
    private void updateTable(Vector<Customer> clientsList) {
        String[] columns = {
            "Name",
            "ID",
            "Email",
            "Phone number",
            "Rented movies"
        };
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        Vector<Customer> customers = clientsList;
        for (Customer customer : clientsList) {
            Object[] rowData = {
                customer.getName(),
                customer.getId(),
                customer.getEmail(),
                customer.getCellPhoneNumber(),
                customer.getRentedMovies()
            };
            model.addRow(rowData);
        }
        tableClients.setModel(model);
        tableClients.setEnabled(false);
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
        tableClients = new javax.swing.JTable();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        tableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Email", "Phone number", "Rented movies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableClients.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableClients);
        if (tableClients.getColumnModel().getColumnCount() > 0) {
            tableClients.getColumnModel().getColumn(0).setResizable(false);
            tableClients.getColumnModel().getColumn(1).setResizable(false);
            tableClients.getColumnModel().getColumn(2).setResizable(false);
            tableClients.getColumnModel().getColumn(3).setResizable(false);
            tableClients.getColumnModel().getColumn(4).setResizable(false);
        }

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setText("Search by ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSearch)
                    .addComponent(btnClear)
                    .addComponent(jLabel1)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //It is responsible for giving functionality to the search bar through its search button
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String idToSearch = tfSearch.getText();
        if (idToSearch.equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter a ID to search");
        } else if (!Function.validateString(idToSearch, "^(0|[1-9][0-9]{0,9})$")) {
            JOptionPane.showMessageDialog(null, "You must enter a valid ID");
        } else {
            updateTable(filter(parent.getBlockBuster().getCustomers(), idToSearch));
        }

    }//GEN-LAST:event_btnSearchActionPerformed
    
    //Clears the search bar
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        updateTable(parent.getBlockBuster().getCustomers());
        tfSearch.setText("");
    }//GEN-LAST:event_btnClearActionPerformed
    
    // Filters the search
    public static Vector<Customer> filter(Vector<Customer> customers, String idToFilter) {
        Vector<Customer> filteredList = customers
                .stream()
                .filter(customer -> customer.getId().startsWith(idToFilter))
                .collect(Collectors.toCollection(Vector::new));
        return filteredList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableClients;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
