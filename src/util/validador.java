
package util;

/** Esta clase se utiliza para validar los datos
 * 
 * @author Xoma
 */

public class validador {
    
     // 1. Validar que el texto no este vacio.
    public static boolean validarTexto(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    // 2. Validar que la capacidad del tour sea mayor a 0
    public static boolean validarCapacidad(int capacidad) {
        return capacidad > 0;
    }

    // 3. Validar que el precio sea mayor a 0
    public static boolean validarPrecio(double precio) {
        return precio > 0;
    }

    // 4. Validar que ninguno de los atributos este vacio.
    public static boolean validarTour(String nombre, String instructor, int capacidad, double precio) {
        if (!validarTexto(nombre)) {
            System.out.println("Error: El nombre del tour no puede estar vacío.");
            return false;
        }
        if (!validarTexto(instructor)) {
            System.out.println("Error: El nombre del instructor no puede estar vacío.");
            return false;
        }
        if (!validarCapacidad(capacidad)) {
            System.out.println("Error: La capacidad debe ser mayor a 0.");
            return false;
        }
        if (!validarPrecio(precio)) {
            System.out.println("Error: El precio debe ser mayor a 0.");
            return false;
        }
        return true;
    }
}
    

