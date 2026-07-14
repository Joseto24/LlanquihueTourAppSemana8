
package model;

/** Esta clase representa el tipo de servico que adquiere un cliente.
 *
 * @author Xoma
 */
public class Tour {
    
    // 1. Crea los atributos.
    
    private String nombre;
    private String instructor;
    private int capacidad;
    private double precio;
    
    // 2. Crear constructor.

    /** Constructor de la clase Tour. 
     * 
     * @param nombre El nombre del tour
     * @param instructor El instructor que realiza el tour
     * @param capacidad Cuantas personas por grupo deben ir.
     * @param precio El precio del tour.
     */
    
    public Tour(String nombre, String instructor, int capacidad, double precio) {
        this.nombre = nombre;
        this.instructor = instructor;
        this.capacidad = capacidad;
        this.precio = precio;
    }
    
    // 3. Crear Getters y Setters.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    // 4. Crear toString() con @Override.
    
    @Override
    public String toString(){
        return "Nombre del Tour: " + nombre +
                " | Instructor del Tour: " + instructor +
                " | Capacidad del Tour: " + capacidad + " personas" +
                " | Precio del Tour: $" + precio;
    }
            
     
}
