
package Data;

import java.util.ArrayList;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;


/**
 *
 * @author Xoma
 */
public class GestordeUsuarios {
  
    private ArrayList<Registrable> listaTrabajadores = new ArrayList<>();
    
    public void agregar(Registrable trabajador){
        listaTrabajadores.add(trabajador);
    }
    
    public String mostrarResumen(){
        if (listaTrabajadores.isEmpty()) {
            return "No hay Usuarios Registrados";
        }
        
        String resumen = "";
    
        for (Registrable trabajador : listaTrabajadores) {
            
            resumen += trabajador.registrar() + "\n";
            
            if (trabajador instanceof GuiaTuristico) {
                
                GuiaTuristico Guia = (GuiaTuristico) trabajador;
                
                resumen += "Tipo detectado con instanceof: " + Guia.getNombre() + " es un Guia.\n";
                resumen += Guia.mostrarResumen();
            } else if(trabajador instanceof ColaboradorExterno){
                
            ColaboradorExterno colaborador = (ColaboradorExterno) trabajador;
            
            resumen += "Tipo detectado con instanceof: " + colaborador.getNombre() + " es un Colaborador Externo.\n";
            resumen += colaborador.mostrarResumen();
        }
         
            resumen += "\n-------------------------------------------\n";
        }
        
        return resumen;
    }
    
  
}
