/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempConverter;

/**
 *
 * @author FCT
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 65, 118, -1));

        jLabel1.setText("Convert What Quantity?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 68, 145, -1));

        jLabel2.setText("From:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 105, -1, -1));

        jLabel3.setText("To:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 103, -1, -1));

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 250, 105, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 333, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Temperature Converter");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 176, 28));

        jLabel6.setText("By CS/2019/032 - K.A.J. Induwara");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 375, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "degree Celsius", "degree Fahrenheit", "degree Rankine", "degree Reaumur", "Kelvin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 50));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "degree Celsius", "degree Fahrenheit", "degree Rankine", "degree Reaumur", "Kelvin" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        String quantity;
        double quantity2;
        String list1;
        String list2;
        double result;
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        quantity2 = Double.parseDouble(jTextField1.getText());
        switch(list1){
            case "degree Celsius":
                switch(list2){
                    case "degree Fahrenheit":
                        result = (quantity2*9/5)+32;
                        break;
                    case "degree Rankine":
                        result = (quantity2*9/5)+491.67;
                        break;
                    case "degree Reaumur":
                        result = quantity2*0.8;
                        break;
                    case "Kelvin":
                        result = quantity2 + 273.15;
                        break;
                    default:
                        result = quantity2;
                        break;
                }break;
            case "degree Fahrenheit":
                switch(list2){
                    case "degree Celsius":
                        result = (quantity2-32)*5/9;
                        break;
                    case "degree Rankine":
                        result = quantity2+459.67;
                        break;
                    case "degree Reaumur":
                        result = (quantity2-32)*4/9;
                        break;
                    case "Kelvin":
                        result = ((quantity2-32)*5/9)+273.15;
                        break;
                    default:
                        result = quantity2;
                        break;
                }break;
            case "degree Rankine":
                switch(list2){
                    case "degree Celsius":
                        result = (quantity2-491.67)*5/9;
                        break;
                    case "degree Fahrenheit":
                        result = quantity2-459.67;
                        break;
                    case "degree Reaumur":
                        result = (quantity2-491.67)*0.44444;
                        break;
                    case "Kelvin":
                        result = quantity2*5/9;
                        break;
                    default:
                        result = quantity2;
                        break;
                }break;
            case "degree Reaumur":
                switch(list2){
                    case "degree Celsius":
                        result = quantity2*1.25;
                        break;
                    case "degree Rankine":
                        result = (quantity2*2.25)+491.67;
                        break;
                    case "degree Fahrenheit":
                        result = (quantity2*2.25)+32;
                        break;
                    case "Kelvin":
                        result = (quantity2/0.8)+273.15;
                        break;
                    default:
                        result = quantity2;
                        break;
                }break;
            case "Kelvin":
                switch(list2){
                    case "degree Celsius":
                        result = quantity2-273.15;
                        break;
                    case "degree Rankine":
                        result = ((quantity2-273.15)*1.8)+491.67;
                        break;
                    case "degree Reaumur":
                        result = (quantity2-273.15)*0.8 ;
                        break;
                    case "degree Fahrenheit":
                        result = ((quantity2-273.15)*1.8)+32;
                        break;
                    default:
                        result = quantity2;
                        break;
                }break;
        }
        quantity = jTextField1.getText();
        jTextField2.setText(quantity+" "+list1+" = "+result+" "+list2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        list1 = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        list2 = jComboBox2.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
