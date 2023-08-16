
package Inicio;

/**
 *
 * @author TUMBADOBoy
 */
public class tick {
    private String jidproducto;
    private String jcantidad;
    private String jtotal;

    public tick(String jidproducto, String jcantidad, String jtotal) {
        this.jidproducto = jidproducto;
        this.jcantidad = jcantidad;
        this.jtotal = jtotal;
    }

    public String getJidproducto() {
        return jidproducto;
    }

    public void setJidproducto(String jidproducto) {
        this.jidproducto = jidproducto;
    }

    public String getJcantidad() {
        return jcantidad;
    }

    public void setJcantidad(String jcantidad) {
        this.jcantidad = jcantidad;
    }

    public String getJtotal() {
        return jtotal;
    }

    public void setJtotal(String jtotal) {
        this.jtotal = jtotal;
    }
    
    
}
