
package modelo;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01 
 *    Profesor: Luis Romo Portilla
 *
 *    Archivo: VentanaPrincipalModelo.java
 *    Licencia: GNU-GPL
 * 
 *    @version 0.3
 *    @author Juan David Loaiza Santiago (2177570 - 3743) {@literal <"juan.loaiza.santiago@correounivalle.edu.co">}
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

    /** 
     * Asgina un valor para el monto.
     * @param _monto La cantidad de dinero con la que se cuenta.
     */
    public void setMonto(int _monto) {
        monto = Double.valueOf(_monto);
    }

    /**
     * Asigna un valor para los meses.
     * @param _meses La cantidad de meses en la que se hará la amortización.
     */
    public void setMeses(int _meses) {
        meses = Double.valueOf(_meses);
    }

    /**
     * Obtiene el porcentaje de la tasa
     * @return tasa Un numero flotante que representa el porcentaje de tasa de interes.
     */
    public double getTasa() {
        return tasa;
    }

    /**
     * Obtiene el costo del interes
     * @return interes Un numero flotante que representa una cantidad de dinero.
     */
    public double getInteres() {
        return interes;
    }

    /**
     * Obtiene el costo de la cuota
     * @return cuota Un numero flotante que representa una cantidad de dinero.
     */
    public double getCuota() {
        return cuota;
    }
    
    /**
     * Obtiene la cantidad que hay que abonar
     * @return abono Un numero flotante que representa una cantidad de dinero.
     */
    public double getAbono() {
        return abono;
    }

    /**
     * Obtiene el saldo que queda
     * @return saldoFinal Un numero flotante (double) que representa una cantidad de dinero.
     */
    public double getSaldoFinal() {
        return saldoFinal;
    }
    
    /**
     * Obtiene el total de interes que se paga en todo el tiempo de amortizacion
     * @return Un numero flotante que representa una cantidad de dinero, en este caso la sumatoria de todos los "interes".
     */
    public double getTotalInteres() {
        return totalInteres;
    }
    
    /**
     * Define un porcentaje para la tasa de interes en bases a
     * la cantidad del monto y los meses, modifica la variable "tasa".
     */
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
    
    /**
     * Define una cuota en base a una formula donde interviene la "tasa" y los "meses"
     * Modifica el valor de la variable "cuota"
     */
    public void calcularCuota(){
        double numerador = Math.pow((1+tasa),meses) * tasa;
        double denominador = Math.pow(1+tasa,meses) - 1;
        
        cuota = monto * numerador/denominador;  
    }
    
    /**
     * Genera el valor del interes y acumula el interes total
     */
    public void calcularInteres(){
        interes = monto * tasa;
        totalInteres += interes;
    }
    
    /**
     * Calcula el abono en base a la cuota y los intereses
     * Si el abono es mayor al monto entonces se igualará
     */
    public void calcularAbono(){
        abono = cuota - interes;
        if(abono > monto){
            abono = monto;
        }
    }
    
    /**
     * Calcula el saldo final en base al "monto" y el "abono"
     */
    public void calcularSaldoFinal(){
        saldoFinal = monto - abono;
    }
    
    
    /**
     * Anidacion de métodos, hace una llamada a otros metodos
     * @see calcularInteres Método al que llama
     * @see calcularAbono Método al que llama
     * @see calcularSaldoFinal Método al que llama
     */
    public void calcularDatosTabla(){
        calcularInteres();
        calcularAbono();
        calcularSaldoFinal();
    }
    
    /**
     * Establece el valor de totalInteres en 0
     */
    public void limpiarTotalInteres(){
        totalInteres = 0;
    }
}
