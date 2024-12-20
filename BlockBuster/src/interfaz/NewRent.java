/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfaz;

import blockbuster.Customer;
import blockbuster.Movie;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class NewRent extends javax.swing.JInternalFrame {

    private PrincipalPanel parent;
    private List<Movie> movies;
    private List<Customer> customers;
    private List<String> selectedItems;
    private List<Customer> copyCustomers;

    /**
     * Creates new form NewRent
     */
    public NewRent(PrincipalPanel parent) {
        initComponents();
        selectedItems = new ArrayList<>();
        this.parent = parent;
        this.customers = parent.getBlockBuster().getCustomers();
        this.copyCustomers = parent.getBlockBuster().getCustomers();
        this.movies = parent.getBlockBuster().getMovies();
        updateList(customers, listCustomer);
        updateList(movies, listMovieRental);
        listMovieRental.setMultipleMode(true);
        addListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCustomer = new javax.swing.JLabel();
        tfCustomerSearch = new javax.swing.JTextField();
        btnCustomerClear = new javax.swing.JButton();
        labelMovie = new javax.swing.JLabel();
        tfMovieSearch = new javax.swing.JTextField();
        btnMovieClear = new javax.swing.JButton();
        btnSaveRental = new javax.swing.JButton();
        btnCancelRental = new javax.swing.JButton();
        listMovieRental = new java.awt.List();
        listCustomer = new java.awt.List();

        setClosable(true);
        setIconifiable(true);

        labelCustomer.setText("Customer");

        tfCustomerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCustomerSearchActionPerformed(evt);
            }
        });
        tfCustomerSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCustomerSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCustomerSearchKeyReleased(evt);
            }
        });

        btnCustomerClear.setText("Clear");
        btnCustomerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerClearActionPerformed(evt);
            }
        });

        labelMovie.setText("movie");

        tfMovieSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMovieSearchKeyReleased(evt);
            }
        });

        btnMovieClear.setText("Clear");
        btnMovieClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovieClearActionPerformed(evt);
            }
        });

        btnSaveRental.setText("Save");
        btnSaveRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveRentalActionPerformed(evt);
            }
        });

        btnCancelRental.setText("Cancel");
        btnCancelRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRentalActionPerformed(evt);
            }
        });

        listMovieRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMovieRentalActionPerformed(evt);
            }
        });
        listMovieRental.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                listMovieRentalPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listMovieRental, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(listCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tfCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCustomerClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMovieSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMovieClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(labelCustomer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(labelMovie))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnSaveRental)
                        .addGap(57, 57, 57)
                        .addComponent(btnCancelRental)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelRental, btnSaveRental});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {listCustomer, listMovieRental});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCustomer)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCustomerSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCustomerClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                .addComponent(labelMovie)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMovieSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMovieClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listMovieRental, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSaveRental)
                    .addComponent(btnCancelRental))
                .addGap(37, 37, 37))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelRental, btnSaveRental});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {listCustomer, listMovieRental});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCustomerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCustomerSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCustomerSearchActionPerformed

    private void tfCustomerSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCustomerSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCustomerSearchKeyPressed

    //Clear the customer search bar
    private void btnCustomerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerClearActionPerformed
        // TODO add your handling code here:
        tfCustomerSearch.setText("");
        updateList(customers, listCustomer);
    }//GEN-LAST:event_btnCustomerClearActionPerformed

    // Filters the customer search
    private void tfCustomerSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCustomerSearchKeyReleased
        // TODO add your handling code here:
        Vector<Customer> filteredCustomers = ClientList.filter((Vector) customers, tfCustomerSearch.getText());
        copyCustomers = new Vector(filteredCustomers);
        updateList(filteredCustomers, listCustomer);
    }//GEN-LAST:event_tfCustomerSearchKeyReleased
    
    //Clear the movie search bar
    private void btnMovieClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovieClearActionPerformed
        // TODO add your handling code here:
        tfMovieSearch.setText("");
        updateList(movies, listMovieRental);
        selectedItems.clear();
    }//GEN-LAST:event_btnMovieClearActionPerformed
    
    // Filters the movie search
    private void tfMovieSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMovieSearchKeyReleased
        // TODO add your handling code here:
        Vector<Movie> filteredMovies = MovieInventory.filter((Vector) movies, tfMovieSearch.getText());
        updateList(filteredMovies, listMovieRental);
        selectItems();
    }//GEN-LAST:event_tfMovieSearchKeyReleased

    private void listMovieRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMovieRentalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listMovieRentalActionPerformed

    private void listMovieRentalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_listMovieRentalPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_listMovieRentalPropertyChange

    //Closes the window
    private void btnCancelRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRentalActionPerformed
        // TODO add your handling code here:
        setEmpty();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelRentalActionPerformed

    //adds the new rent
    private void btnSaveRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveRentalActionPerformed
        // TODO add your handling code here:
        String error = "";
        if (listCustomer.getSelectedIndex() == -1) {
            error += "You still need to select a client\n";
        }
        if (selectedItems.size() == 0) {
            error += "At least one movie still needs to be selected.\n";
        }
        if (!error.equals("")) {
            JOptionPane.showMessageDialog(null, error);
        }
        else{
            Customer customer = copyCustomers.get(listCustomer.getSelectedIndex());
            parent.getBlockBuster().saveRental(customer, selectedItems);
            JOptionPane.showMessageDialog(null, "Rental saved successfully");
            btnCancelRentalActionPerformed(evt);
        }
    }//GEN-LAST:event_btnSaveRentalActionPerformed
    
    //Return the window to its default mode 
    private void setEmpty() {
        selectedItems.clear();
        updateList(customers, listCustomer);
        updateList(movies, listMovieRental);
    }

    //Updates the lists only showing the element we need
    private void updateList(List list, java.awt.List listObject) {
        listObject.removeAll();
        for (var element : list) {
            listObject.add(element.toString());
        }
    }
    
    //Manage item selection
    private void addListener() {
        listMovieRental.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String[] list = listMovieRental.getItems();
                int index = (int) e.getItem();
                if (selectedItems.contains(list[index])) {
                    selectedItems.remove(selectedItems.indexOf(list[index]));
                } else {
                    selectedItems.add(list[index]);
                }
            }

        });
    }

    //Selects the items we need
    private void selectItems() {
        String[] list = listMovieRental.getItems();
        for (int i = 0; i < list.length; i++) {
            if (selectedItems.contains(list[i])) {
                listMovieRental.select(i);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelRental;
    private javax.swing.JButton btnCustomerClear;
    private javax.swing.JButton btnMovieClear;
    private javax.swing.JButton btnSaveRental;
    private javax.swing.JLabel labelCustomer;
    private javax.swing.JLabel labelMovie;
    private java.awt.List listCustomer;
    private java.awt.List listMovieRental;
    private javax.swing.JTextField tfCustomerSearch;
    private javax.swing.JTextField tfMovieSearch;
    // End of variables declaration//GEN-END:variables
}
