
package controlador;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01  
 *    Profesor: Luis Romo Portilla
 *
 *    Archivo: VentanaPrincipalControlador.java
 *    Autores: Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743
 *    Fecha creación: 11-22-2021
 *    Fecha última modificación: 11-24-2021
 *    Versión: 1.1
 *    Licencia: GNU-GPL
 *    
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*;

public class VentanaPrincipalControlador {
    VentanaPrincipalModelo modelo = new VentanaPrincipalModelo();
    VentanaPrincipalVista vista = new VentanaPrincipalVista();
    
    int monto = 0;
    
    public VentanaPrincipalControlador(VentanaPrincipalModelo _modelo, VentanaPrincipalVista _vista){
        vista = _vista;
        modelo = _modelo;
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
        vista.addActionBtnCalcular(oyenteDeCalcular);
    }
    
    ActionListener oyenteDeCalcular = new ActionListener() {
        @Override
        @SuppressWarnings("empty-statement")
        public void actionPerformed(ActionEvent evento){
            vista.limpiarTabla();
            
            monto = (int)Math.round(vista.getMonto());
            
            modelo.setMonto(monto);
            modelo.setMeses(vista.getMeses());
            modelo.definirTasa();
            modelo.calcularCuota();
            
            do{
                calcularNuevaFila();
            }
            while(monto > 0);
            
            vista.setTotalInteres((int)Math.round(modelo.getTotalInteres()));
            modelo.limpiarTotalInteres();        
        }
    };
    
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
