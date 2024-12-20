/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class NewDirector extends javax.swing.JFrame {
    private NewMovie parent;
    private PrincipalPanel grandFather;
    /**
     * Creates new form NewDirector
     */
    
    //NewDirector class constructor
    public NewDirector(NewMovie parent, PrincipalPanel grandFather) {
        initComponents();
        this.parent = parent;
        this.grandFather = grandFather;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNewDirector = new javax.swing.JTextField();
        btnSaveDirector = new javax.swing.JButton();
        btnCancelDirector = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter the Director's name:");

        tfNewDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNewDirectorActionPerformed(evt);
            }
        });

        btnSaveDirector.setText("Save");
        btnSaveDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDirectorActionPerformed(evt);
            }
        });

        btnCancelDirector.setText("Cancel");
        btnCancelDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelDirectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfNewDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnSaveDirector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelDirector)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNewDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveDirector)
                    .addComponent(btnCancelDirector))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNewDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNewDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNewDirectorActionPerformed

    //It is responsible for adding directors to its respective list
    private void btnSaveDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDirectorActionPerformed
        // TODO add your handling code here:
        String directorName = tfNewDirector.getText();
        if (directorName.equals("")){
            JOptionPane.showMessageDialog(null, "Enter the director's name");
        }else if(validateDirectorName(directorName)){
            JOptionPane.showMessageDialog(null, "This director has already been registered");
        }else{
            grandFather.getBlockBuster().addDirector(directorName);
            JOptionPane.showMessageDialog(null, "Director saved successfully");
            tfNewDirector.setText("");
            parent.setVisible(true);
            this.setVisible(false);
            parent.updateDirectors();
        }
    }//GEN-LAST:event_btnSaveDirectorActionPerformed

    //Closes the window
    private void btnCancelDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelDirectorActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        parent.setVisible(true);
    }//GEN-LAST:event_btnCancelDirectorActionPerformed

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
            java.util.logging.Logger.getLogger(NewDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewDirector().setVisible(true);
//            }
//        });
    }
    //Checks if the directors name is valid
    private boolean validateDirectorName(String name){
        ComboBoxModel model = parent.getCmbxDirector().getModel();
        boolean contains = false;
        for (int i = 0; model.getSize() > i; i++){
            if (model.getElementAt(i).toString().toLowerCase().equals(name.toLowerCase())){
                contains = true;
            }
        }
        return contains;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelDirector;
    private javax.swing.JButton btnSaveDirector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfNewDirector;
    // End of variables declaration//GEN-END:variables
}
