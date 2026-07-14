
package Data;

import util.validador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Tour;

/** Esta clase se encarga de leer los datos desde un archivo de texto.
 *
 * @author Xoma
 */
public class Gestordedatos {
    
    // 1. Metodo que recibe la ruta del archivoy retorna una lista de tours
    public ArrayList<Tour> cargartour(String rutaArchivo){
        
        // 2. Lista dinamica donde se almacenaran los tours
        ArrayList<Tour> listaTours = new ArrayList<>();
        
        try {
            // Se abre el archivo para lectura
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            
           // Lectura linea por linea
           String linea;
           
           // Se lee el archivo linea por linea
            while ((linea = lector.readLine()) != null) {                
                
                // Se separa la linea usando punto y coma ;
                String[] partes = linea.split(";");
                
                // Se valida que la linea tenga 4 datos
                if (partes.length == 4) {
                    
                    // Se convierten los datos al tipo correspondiente
                    String nombre = partes[0];
                    String instructor = partes[1];
                    int capacidad = Integer.parseInt(partes[2]);
                    double precio = Double.parseDouble(partes[3]);
                    
                    // Se llama al validador.
                    if (validador.validarTour(nombre, instructor, capacidad, precio)) {
                        Tour tour = new Tour(nombre, instructor, capacidad, precio);
                        
                        // Se agrega el objeto a la lista
                    listaTours.add(tour);
             
                    } else {
                        System.out.println("Línea inválida, no se agregó: " + linea);
                                    }
      
                }
                
            }
            
            // Se cierra el lector
            lector.close();
             
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir un numero: " + e.getMessage());
        }
        
        // Se retorna la lista de los tours cargados
        return listaTours;
    }
    

}