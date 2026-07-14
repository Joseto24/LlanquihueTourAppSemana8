
package model;

/**
 *
 * @author Xoma
 */
public class GuiaTuristico extends Persona implements Registrable{
    
    private String tipoDeTour;

    public GuiaTuristico(String nombre, String rut, String correo, String tipoDeTour) {
        super(nombre, rut, correo);
        this.tipoDeTour = tipoDeTour;
    }

    public String getTipoDeTour() {
        return tipoDeTour;
    }

    public void setTipoDeTour(String tipoDeTour) {
        this.tipoDeTour = tipoDeTour;
    }

    @Override
    public String mostrarResumen() {
        return super.toString() + 
                "\nGuia del Tour: " + tipoDeTour;
    }

    @Override
    public String registrar() {
        return "Guia turistico registrado con exito.";
    }
    
    
    
    
}
