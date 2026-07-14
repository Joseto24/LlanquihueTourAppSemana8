
package model;

/**
 *
 * @author Xoma
 */
public class ColaboradorExterno extends Persona implements Registrable{
    
    private String tipoDeColaborador;

    public ColaboradorExterno(String nombre, String rut, String correo, String tipoDeColaborador) {
        super(nombre, rut, correo);
        this.tipoDeColaborador = tipoDeColaborador;
    }

    public String getTipoDeColaborador() {
        return tipoDeColaborador;
    }

    public void setTipoDeColaborador(String tipoDeColaborador) {
        this.tipoDeColaborador = tipoDeColaborador;
    }

    @Override
    public String mostrarResumen() {
       return super.toString() + 
               "\nCargo: " + tipoDeColaborador;
    }

    @Override
    public String registrar() {
        return "Colaborador externo registrado con exito";
    }
    
    
    
    
}
