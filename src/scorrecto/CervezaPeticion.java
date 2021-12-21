package scorrecto;

public class CervezaPeticion {
    Cerveza cerveza;

    public CervezaPeticion(Cerveza cerveza){
        this.cerveza = cerveza;
    }

    public void enviar(){
        System.out.println("Envio de la cerveza" + cerveza.nombre + " De la marca" + cerveza.marca);
    }

}
