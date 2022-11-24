
package main;

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

import modelo.*;
import vista.*;
import controlador.*;

public class main {
    
    public static void main(String[] args) {
        VentanaPrincipalVista miVista = new VentanaPrincipalVista();
        VentanaPrincipalModelo miModelo = new VentanaPrincipalModelo();
        
        VentanaPrincipalControlador miControlador = new VentanaPrincipalControlador(miModelo, miVista);
    }
}
