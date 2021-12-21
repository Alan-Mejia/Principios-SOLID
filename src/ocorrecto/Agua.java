package ocorrecto;

public class Agua implements Bebida{
    String nombre;
    float precio;
    String tipo;


    public Agua(String nombre, float precio, String tipo){
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return 0;
    }

    public String setNombre() {
        return nombre;
    }

    public float setPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public float precioTotal() {
        return getPrecio();
    }
}
