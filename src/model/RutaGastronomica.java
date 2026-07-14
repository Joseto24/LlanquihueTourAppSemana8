
package model;

/**
 *
 * @author Xoma
 */
public class RutaGastronomica extends ServicioTuristico{
    
    private int numeroDeParadas;


    public RutaGastronomica(String nombre, int duraconHoras, int numeroDeParadas) {
        super(nombre, duraconHoras);
        this.numeroDeParadas = numeroDeParadas;
    }
    

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNumero de Paradas: " + numeroDeParadas;
    }
  
}
