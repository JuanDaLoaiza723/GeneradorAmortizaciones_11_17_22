
package controlador;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01 
 *    Profesor: Luis Romo Portilla 
 *
 *    Archivo: VentanaPrincipalControlador.java 
 *    Licencia: GNU-GPL 
 * 
 *    @version 1.2
 *    @author Juan David Loaiza Santiago (2177570 - 3743) {@literal <"juan.loaiza.santiago@correounivalle.edu.co">}
 * 
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

public class VentanaPrincipalControlador {
    VentanaPrincipalModelo modelo = new VentanaPrincipalModelo();
    VentanaPrincipalVista vista = new VentanaPrincipalVista();
    
    int monto, meses;
    
    public VentanaPrincipalControlador(VentanaPrincipalModelo _modelo, VentanaPrincipalVista _vista){
        vista = _vista;
        modelo = _modelo;
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setTitle("Generador de amortizaciones");
        
        vista.addActionBtnCalcular(oyenteDeCalcular);
    }
    
    ActionListener oyenteDeCalcular = new ActionListener() {
        @Override
        @SuppressWarnings("empty-statement")
        public void actionPerformed(ActionEvent evento){
            vista.limpiarTabla();
            
            try{            
                monto = Integer.parseInt(vista.getMonto());
                meses = Integer.parseInt(vista.getMeses());

                modelo.setMonto(monto);
                modelo.setMeses(meses);
                modelo.definirTasa();
                modelo.calcularCuota();

            do calcularNuevaFila();            
            while(monto > 0);
            
            vista.setTotalInteres((int)Math.round(modelo.getTotalInteres()));
            modelo.limpiarTotalInteres();        
            }
            catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null, "Error: Debe digirar numeros unicamente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    };
    
    /**
     * Comunica al modelo con la vista para generar los distintos valores de la tabla en un mes
     */
    public void calcularNuevaFila(){
        modelo.setMonto(monto);
        modelo.calcularDatosTabla();

        double tasa = modelo.getTasa();

        int cuota = (int)Math.round(modelo.getCuota());
        int interes = (int)Math.round(modelo.getInteres());
        int abono = (int)Math.round(modelo.getAbono());
        int saldoFinal = (int)Math.round(modelo.getSaldoFinal());

        vista.setTasa(tasa);
        vista.setCuota(cuota);

        vista.nuevaFilaTablaResultados(monto, interes, cuota, abono, saldoFinal);

        monto = saldoFinal;
    }
}
