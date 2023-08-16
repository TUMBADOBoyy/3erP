
package Inicio;

public class reporte {
    private String jidventa;
    private String jidproducto;

    private String jcantidad;
    private String jpreciou;
    private String jtotal;

    public reporte(String jidventa, String jidproducto, String jcantidad, String jpreciou, String jtotal) {
        this.jidventa = jidventa;
        this.jidproducto = jidproducto;
        this.jcantidad = jcantidad;
        this.jpreciou = jpreciou;
        this.jtotal = jtotal;
    }

    public String getJidventa() {
        return jidventa;
    }

    public void setJidventa(String jidventa) {
        this.jidventa = jidventa;
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

    public String getJpreciou() {
        return jpreciou;
    }

    public void setJpreciou(String jpreciou) {
        this.jpreciou = jpreciou;
    }

    public String getJtotal() {
        return jtotal;
    }

    public void setJtotal(String jtotal) {
        this.jtotal = jtotal;
    }
    
    
}
