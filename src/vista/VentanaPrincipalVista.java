
package vista;

import java.awt.event.ActionListener;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01  
 *    LABORATORIO 1   
 *    Profesor: Luis Romo Portilla
 *
 *    Archivo: VentanaPrincipalVista.java
 *    Autores: Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743
 *    Fecha creación: 11-22-2021
 *    Fecha última modificación: 11-22-2021
 *    Versión: 0.1
 *    Licencia: GNU-GPL
 *    
*/

public class VentanaPrincipalVista extends javax.swing.JFrame {
    
    public VentanaPrincipalVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_monto = new javax.swing.JLabel();
        lbl_meses = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        cmp_cuota = new javax.swing.JTextField();
        cmp_monto = new javax.swing.JTextField();
        cmp_tasa = new javax.swing.JTextField();
        lbl_tasa = new javax.swing.JLabel();
        cmp_meses = new javax.swing.JTextField();
        lbl_cuota = new javax.swing.JLabel();
        cmp_interes = new javax.swing.JTextField();
        lbl_interes = new javax.swing.JLabel();
        lbl_datos = new javax.swing.JLabel();
        lbl_resultados = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        cmp_cuota2 = new javax.swing.JTextField();
        lbl_cuota2 = new javax.swing.JLabel();
        lbl_abono = new javax.swing.JLabel();
        cmp_abono = new javax.swing.JTextField();
        cmp_saldoFinal = new javax.swing.JTextField();
        lbl_saldoFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_monto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_monto.setForeground(new java.awt.Color(0, 0, 0));
        lbl_monto.setText("Monto");
        jPanel1.add(lbl_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 57, -1));

        lbl_meses.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_meses.setForeground(new java.awt.Color(0, 0, 0));
        lbl_meses.setText("Meses");
        jPanel1.add(lbl_meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 57, -1));

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 102, 102));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_titulo.setText("CALCULADORA DE PAGOS");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 260, -1));

        cmp_cuota.setEditable(false);
        cmp_cuota.setBackground(new java.awt.Color(204, 204, 204));
        cmp_cuota.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_cuota.setForeground(new java.awt.Color(0, 0, 0));
        cmp_cuota.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmp_cuota.setText("0");
        cmp_cuota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_cuota.setOpaque(true);
        jPanel1.add(cmp_cuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 80, -1));

        cmp_monto.setBackground(new java.awt.Color(255, 255, 255));
        cmp_monto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_monto.setForeground(new java.awt.Color(0, 0, 0));
        cmp_monto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmp_monto.setText("0");
        cmp_monto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_monto.setOpaque(true);
        jPanel1.add(cmp_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 130, 20));

        cmp_tasa.setEditable(false);
        cmp_tasa.setBackground(new java.awt.Color(204, 204, 204));
        cmp_tasa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_tasa.setForeground(new java.awt.Color(0, 0, 0));
        cmp_tasa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmp_tasa.setText("0");
        cmp_tasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_tasa.setOpaque(true);
        jPanel1.add(cmp_tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 80, -1));

        lbl_tasa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_tasa.setForeground(new java.awt.Color(0, 0, 0));
        lbl_tasa.setText("Tasa Interes");
        jPanel1.add(lbl_tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 90, -1));

        cmp_meses.setBackground(new java.awt.Color(255, 255, 255));
        cmp_meses.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_meses.setForeground(new java.awt.Color(0, 0, 0));
        cmp_meses.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmp_meses.setText("0");
        cmp_meses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_meses.setOpaque(true);
        jPanel1.add(cmp_meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 60, 20));

        lbl_cuota.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_cuota.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cuota.setText("Cuota");
        jPanel1.add(lbl_cuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 50, -1));

        cmp_interes.setEditable(false);
        cmp_interes.setBackground(new java.awt.Color(255, 255, 255));
        cmp_interes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_interes.setForeground(new java.awt.Color(0, 0, 0));
        cmp_interes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmp_interes.setText("0");
        cmp_interes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_interes.setOpaque(true);
        jPanel1.add(cmp_interes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 20));

        lbl_interes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_interes.setForeground(new java.awt.Color(0, 0, 0));
        lbl_interes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_interes.setText("Interes");
        lbl_interes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl_interes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 20));

        lbl_datos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_datos.setForeground(new java.awt.Color(0, 102, 102));
        lbl_datos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_datos.setText("DATOS");
        jPanel1.add(lbl_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, -1));

        lbl_resultados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_resultados.setForeground(new java.awt.Color(0, 102, 102));
        lbl_resultados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_resultados.setText("RESULTADO");
        jPanel1.add(lbl_resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 20));

        btn_calcular.setBackground(new java.awt.Color(0, 102, 102));
        btn_calcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_calcular.setForeground(new java.awt.Color(255, 255, 255));
        btn_calcular.setText("Calcular");
        jPanel1.add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        cmp_cuota2.setEditable(false);
        cmp_cuota2.setBackground(new java.awt.Color(255, 255, 255));
        cmp_cuota2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_cuota2.setForeground(new java.awt.Color(0, 0, 0));
        cmp_cuota2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmp_cuota2.setText("0");
        cmp_cuota2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_cuota2.setOpaque(true);
        jPanel1.add(cmp_cuota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 90, 20));

        lbl_cuota2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_cuota2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cuota2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cuota2.setText("Cuota");
        lbl_cuota2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl_cuota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 90, 20));

        lbl_abono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_abono.setForeground(new java.awt.Color(0, 0, 0));
        lbl_abono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_abono.setText("Abono");
        lbl_abono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl_abono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, 20));

        cmp_abono.setEditable(false);
        cmp_abono.setBackground(new java.awt.Color(255, 255, 255));
        cmp_abono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_abono.setForeground(new java.awt.Color(0, 0, 0));
        cmp_abono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmp_abono.setText("0");
        cmp_abono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_abono.setOpaque(true);
        jPanel1.add(cmp_abono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 90, 20));

        cmp_saldoFinal.setEditable(false);
        cmp_saldoFinal.setBackground(new java.awt.Color(255, 255, 255));
        cmp_saldoFinal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_saldoFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmp_saldoFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmp_saldoFinal.setText("0");
        cmp_saldoFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_saldoFinal.setOpaque(true);
        jPanel1.add(cmp_saldoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 90, 20));

        lbl_saldoFinal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_saldoFinal.setForeground(new java.awt.Color(0, 0, 0));
        lbl_saldoFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_saldoFinal.setText("Saldo Final");
        lbl_saldoFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl_saldoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 90, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 360));

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
            java.util.logging.Logger.getLogger(VentanaPrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipalVista().setVisible(true);
        });
    }

    public int getMonto() {
        return Integer.parseInt(cmp_monto.getText());
    }
    public int getMeses() {
        return Integer.parseInt(cmp_meses.getText());
    }

    public void setTasa(double valor) {
        cmp_tasa.setText(String.valueOf(valor));
    }
    public void setCuota(int valor) {
        cmp_cuota.setText(String.valueOf(valor));
    }
    
    public void setInteres(int valor) {
        cmp_interes.setText(String.valueOf(valor));
    }
    public void setCuota2(int valor) {
        cmp_cuota2.setText(String.valueOf(valor));
    }
    public void setAbono(int valor) {
        cmp_abono.setText(String.valueOf(valor));
    }
    public void setSaldoFinal(int valor) {
        cmp_saldoFinal.setText(String.valueOf(valor));
    }
   
    public void addActionBtnCalcular(ActionListener listener){
        btn_calcular.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JTextField cmp_abono;
    private javax.swing.JTextField cmp_cuota;
    private javax.swing.JTextField cmp_cuota2;
    private javax.swing.JTextField cmp_interes;
    private javax.swing.JTextField cmp_meses;
    private javax.swing.JTextField cmp_monto;
    private javax.swing.JTextField cmp_saldoFinal;
    private javax.swing.JTextField cmp_tasa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_abono;
    private javax.swing.JLabel lbl_cuota;
    private javax.swing.JLabel lbl_cuota2;
    private javax.swing.JLabel lbl_datos;
    private javax.swing.JLabel lbl_interes;
    private javax.swing.JLabel lbl_meses;
    private javax.swing.JLabel lbl_monto;
    private javax.swing.JLabel lbl_resultados;
    private javax.swing.JLabel lbl_saldoFinal;
    private javax.swing.JLabel lbl_tasa;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
