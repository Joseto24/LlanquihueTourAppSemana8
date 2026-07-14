
package model;

/**
 *
 * @author Xoma
 */
public class PaseoLacustre extends ServicioTuristico{
    
    private String TipoEmbarcacion;
    

    public PaseoLacustre(String nombre, int duraconHoras, String TipoEmbarcacion) {
        super(nombre, duraconHoras);
        this.TipoEmbarcacion = TipoEmbarcacion;
    }
    

    public String getTipoEmbarcacion() {
        return TipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String TipoEmbarcacion) {
        this.TipoEmbarcacion = TipoEmbarcacion;
    }
   
    @Override
    public String toString(){
        return super.toString() + "\nTipo de embarcacion: " + TipoEmbarcacion;
    }
 
}
