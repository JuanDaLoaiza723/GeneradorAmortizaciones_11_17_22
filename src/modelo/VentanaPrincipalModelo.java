
package modelo;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01 
 *    Profesor: Luis Romo Portilla
 *
 *    Archivo: VentanaPrincipalModelo.java
 *    Autores: Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743
 *    Fecha creación: 11-22-2021
 *    Fecha última modificación: 11-24-2021
 *    Versión: 0.2
 *    Licencia: GNU-GPL
 *    
*/

public class VentanaPrincipalModelo {
    //  Recibe
    private double monto;
    private double meses;
    
    // Produce
    private double tasa;
    private double cuota;
    
    private double interes;
    private double abono;
    private double saldoFinal;
    
    private double totalInteres = 0;
    
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
    public double getTotalInteres() {
        return totalInteres;
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
        totalInteres += interes;
    }
    
    public void calcularAbono(){
        abono = cuota - interes;
        if(abono > monto){
            abono = monto;
        }
    }
    public void calcularSaldoFinal(){
        saldoFinal = monto - abono;
    }
    
    public void calcularDatosTabla(){
        calcularInteres();
        calcularAbono();
        calcularSaldoFinal();
    }
    
    public void limpiarTotalInteres(){
        totalInteres = 0;
    }
}
