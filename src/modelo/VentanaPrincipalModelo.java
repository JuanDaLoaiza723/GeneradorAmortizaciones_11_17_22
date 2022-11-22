
package modelo;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01  
 *    LABORATORIO 1   
 *    Profesor: Luis Romo Portilla
 *
 *    Archivo: VentanaPrincipalModelo.java
 *    Autores: Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743
 *    Fecha creación: 11-22-2021
 *    Fecha última modificación: 11-22-2021
 *    Versión: 0.1
 *    Licencia: GNU-GPL
 *    
*/

public class VentanaPrincipalModelo {
    //  Recibe
    double monto;
    double meses;
    
    // Produce
    double tasa;
    double cuota;
    
    double interes;
    double abono;
    double saldoFinal;
    
    public VentanaPrincipalModelo(){
    }

    public void setMonto(int _monto) {
        monto = Double.valueOf(_monto);
    }

    public void setMeses(int _meses) {
        meses = Double.valueOf(_meses);
    }

    public double getTasa() {
        return tasa;
    }

    public double getInteres() {
        return interes;
    }

    public double getCuota() {
        return cuota;
    }
    
    public double getAbono() {
        return abono;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }
    
    public void definirTasa(){
        if (monto < 1500000){
            if(meses < 12){
                tasa=0.025;                
            }
            else{
                tasa=0.018;
            }
        }
        else if (monto >= 1500000 && monto<=3000000){
            if(meses < 12){
                tasa=0.019;
            }
            else{
                tasa=0.017;
            }
        }
        else if (monto > 3000000){
            tasa=0.015;
        }
    }
    
    public void calcularCuota(){
        double numerador = Math.pow((1+tasa),meses) * tasa;
        double denominador = Math.pow(1+tasa,meses) - 1;
        
        cuota = monto * numerador/denominador;  
    }
    
    public void calcularInteres(){
        interes = monto * tasa;
    }
    public void calcularAbono(){
        abono = cuota - interes;
    }
    public void calcularSaldoFinal(){
        saldoFinal = monto - abono;
    }
    
    public void calcularDatosTabla(){
        calcularInteres();
        calcularAbono();
        calcularSaldoFinal();
    }
}
