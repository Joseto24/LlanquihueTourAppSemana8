
package model;

/**
 *
 * @author Xoma
 */
public class ExcursionCultural extends ServicioTuristico{
    
    private String lugarHistorico;
    

    public ExcursionCultural(String nombre, int duraconHoras, String lugarHistorico) {
        super(nombre, duraconHoras);
        this.lugarHistorico = lugarHistorico;
    }
    

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nLugar historico: " + lugarHistorico;
    }

 
}
