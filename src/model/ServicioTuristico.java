
package model;

/**
 *
 * @author Xoma
 */
public class ServicioTuristico {
    
    private String nombre;
    private int duraconHoras;

    public ServicioTuristico(String nombre, int duraconHoras) {
        this.nombre = nombre;
        this.duraconHoras = duraconHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuraconHoras() {
        return duraconHoras;
    }

    public void setDuraconHoras(int duraconHoras) {
        this.duraconHoras = duraconHoras;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre +
                "\nDuracion: " + duraconHoras + "hrs";
    } 
           
    
    
    
   
    
}
