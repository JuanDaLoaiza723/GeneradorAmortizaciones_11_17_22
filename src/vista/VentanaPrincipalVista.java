
package vista;

import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01 
 *    Profesor: Luis Romo Portilla
 *
 *    Archivo: VentanaPrincipalVista.java;
 *    Licencia: GNU-GPL
 * 
 *    @version 0.3
 *    @author Juan David Loaiza Santiago (2177570 - 3743) {@literal <"juan.loaiza.santiago@correounivalle.edu.co">}
 *    
*/

public class VentanaPrincipalVista extends javax.swing.JFrame {
    
    public VentanaPrincipalVista() {
        initComponents();
        tabla_resultados.setModel(modeloTabla);
        configurarTabla();
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
        lbl_datos = new javax.swing.JLabel();
        lbl_resultados = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        lbl_totalInteres = new javax.swing.JLabel();
        cmp_totalInteres = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_monto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_monto.setForeground(new java.awt.Color(0, 0, 0));
        lbl_monto.setText("Monto");
        jPanel1.add(lbl_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 57, -1));

        lbl_meses.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_meses.setForeground(new java.awt.Color(0, 0, 0));
        lbl_meses.setText("Meses");
        jPanel1.add(lbl_meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 57, -1));

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
        jPanel1.add(cmp_cuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 80, -1));

        cmp_monto.setBackground(new java.awt.Color(255, 255, 255));
        cmp_monto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_monto.setForeground(new java.awt.Color(0, 0, 0));
        cmp_monto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmp_monto.setText("0");
        cmp_monto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_monto.setOpaque(true);
        jPanel1.add(cmp_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 130, 20));

        cmp_tasa.setEditable(false);
        cmp_tasa.setBackground(new java.awt.Color(204, 204, 204));
        cmp_tasa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_tasa.setForeground(new java.awt.Color(0, 0, 0));
        cmp_tasa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmp_tasa.setText("0");
        cmp_tasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_tasa.setOpaque(true);
        jPanel1.add(cmp_tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 80, -1));

        lbl_tasa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_tasa.setForeground(new java.awt.Color(0, 0, 0));
        lbl_tasa.setText("Tasa Interes");
        jPanel1.add(lbl_tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 90, -1));

        cmp_meses.setBackground(new java.awt.Color(255, 255, 255));
        cmp_meses.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_meses.setForeground(new java.awt.Color(0, 0, 0));
        cmp_meses.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmp_meses.setText("0");
        cmp_meses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_meses.setOpaque(true);
        jPanel1.add(cmp_meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 60, 20));

        lbl_cuota.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_cuota.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cuota.setText("Cuota");
        jPanel1.add(lbl_cuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 50, -1));

        lbl_datos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_datos.setForeground(new java.awt.Color(0, 102, 102));
        lbl_datos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_datos.setText("DATOS");
        jPanel1.add(lbl_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, -1));

        lbl_resultados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_resultados.setForeground(new java.awt.Color(0, 102, 102));
        lbl_resultados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_resultados.setText("RESULTADO");
        jPanel1.add(lbl_resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 20));

        btn_calcular.setBackground(new java.awt.Color(0, 102, 102));
        btn_calcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_calcular.setForeground(new java.awt.Color(255, 255, 255));
        btn_calcular.setText("Calcular");
        jPanel1.add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        tabla_resultados.setBackground(new java.awt.Color(255, 255, 255));
        tabla_resultados.setForeground(new java.awt.Color(0, 0, 0));
        tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_resultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 400, 120));

        lbl_totalInteres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_totalInteres.setForeground(new java.awt.Color(0, 0, 0));
        lbl_totalInteres.setText("Total de interes pagado: ");
        jPanel1.add(lbl_totalInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 180, -1));

        cmp_totalInteres.setEditable(false);
        cmp_totalInteres.setBackground(new java.awt.Color(204, 204, 204));
        cmp_totalInteres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmp_totalInteres.setForeground(new java.awt.Color(0, 0, 0));
        cmp_totalInteres.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmp_totalInteres.setText("0");
        cmp_totalInteres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmp_totalInteres.setOpaque(true);
        cmp_totalInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmp_totalInteresActionPerformed(evt);
            }
        });
        jPanel1.add(cmp_totalInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmp_totalInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmp_totalInteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmp_totalInteresActionPerformed

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

    /**
     * Crea los titulos de la tabla 
     */
    public void configurarTabla(){
        String[] titulosTabla = new String[]{"Saldo Inicial", "Interes", "Cuota", "Abono", "SaldoFinal"};
        modeloTabla.setColumnIdentifiers(titulosTabla);
    }
    
    /**
     * Obtiene el contenido del campo monto
     * @return cmp_monto El String que hay en el campo
     */
    public String getMonto() {
        return cmp_monto.getText();
    }
    
    /**
     * Obtiene el contenido del campo meses
     * @return cmp_monto El String que hay en el campo
     */
    public String getMeses() {
        return cmp_meses.getText();
    }

    /**
     * Convierte la tasa de interes en un String y la asigna al campo
     * @param valor El valor porcentual decimal de la tasa de interes
     */
    public void setTasa(double valor) {
        cmp_tasa.setText(String.valueOf(valor));
    }
    
    /**
     * Convierte la cuota en un String y la asigna al campo
     * @param valor El valor de la cuota 
     */
    public void setCuota(int valor) {
        cmp_cuota.setText(String.valueOf(valor));
    }
    
    /**
     * Convierte el interes en un String y lo asigna al campo
     * @param valor La sumatoria de los intereses durante 
     * todo el tiempo de amortización
     */
    public void setTotalInteres(int valor) {
        cmp_totalInteres.setText(String.valueOf(valor));
    }
    
    /**
     * Crea una nueva fila con los datos de amortizacion del mes
     * @param monto El saldo inicial
     * @param interes El costo del interes
     * @param cuota La cuota que se aplica
     * @param abono El abono obtenido
     * @param saldoFinal El saldo que queda
     */   
    public void nuevaFilaTablaResultados(int monto, int interes, int cuota, int abono, int saldoFinal){
        modeloTabla.addRow(new Object[]{
            monto, interes, cuota, abono, saldoFinal
        });
    }
    
    /**
     * Elimina todas las filas de la tabla para dejarla vacia
     */
    public void limpiarTabla(){
        int filasTabla = modeloTabla.getRowCount();
        for(int i = 0; i < filasTabla; i++){
            modeloTabla.removeRow(0);
        }
    }
    
    /**
     * Asigna un Listener para le boton de calcular
     * @param listener El ActionListener para asignar a btn_calcular
     */
    public void addActionBtnCalcular(ActionListener listener){
        btn_calcular.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JTextField cmp_cuota;
    private javax.swing.JTextField cmp_meses;
    private javax.swing.JTextField cmp_monto;
    private javax.swing.JTextField cmp_tasa;
    private javax.swing.JTextField cmp_totalInteres;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cuota;
    private javax.swing.JLabel lbl_datos;
    private javax.swing.JLabel lbl_meses;
    private javax.swing.JLabel lbl_monto;
    private javax.swing.JLabel lbl_resultados;
    private javax.swing.JLabel lbl_tasa;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_totalInteres;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
    
    DefaultTableModel modeloTabla = new DefaultTableModel();    
}
