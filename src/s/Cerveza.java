package s;

public class Cerveza {
    private String nombre;
    private String marca;

    //Responsable de la informacion
    public Cerveza(String nombre, String marca){
        this.marca = marca;
        this.nombre = nombre;
    }

    //Responsable de guardar en la DB
    public void guardar(){
        System.out.println("Guarda cerveza" + nombre + " De la marca " + marca);
    }

    //Responsable de notificar
    public void enviar(){
        System.out.println("Envio de la cerveza" + nombre + " De la marca " + marca);
    }

}
