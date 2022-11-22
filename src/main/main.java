
package main;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01  
 *    LABORATORIO 1   
 *    Profesor: Luis Romo Portilla
 *
 *    Archivo: main.java
 *    Autores: Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743
 *    Fecha creación: 11-22-2021
 *    Fecha última modificación: 11-22-2021
 *    Versión: 1.0
 *    Licencia: GNU-GPL
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
