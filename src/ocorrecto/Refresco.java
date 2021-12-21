package ocorrecto;

public class Refresco implements Bebida{

    String nombre;
    float precio;
    float impuesto;

    String tipo;
    String caducidad;

    public Refresco(String nombre, float precio, float impuesto, String tipo, String caducidad){
        this.nombre = nombre;
        this.precio = precio;
        this.impuesto = impuesto;
        this.tipo = tipo;
        this.caducidad = caducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return 0;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public String setNombre() {
        return nombre;
    }

    public float setPrecio() {
        return precio;
    }

    public float setImpuesto() {
        return impuesto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public float promoCaducidad(){
        //obetener fecha
        return getPrecio()/2;
    }

    @Override
    public float precioTotal() {
        if (getCaducidad().equals(toString(/*caducidad - 2 dias */))) {
            return promoCaducidad();
        }
        return getPrecio();
    }
}
