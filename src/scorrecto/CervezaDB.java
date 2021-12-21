package scorrecto;

public class CervezaDB {
    private Cerveza cerveza;

    public CervezaDB(Cerveza cerveza){
        this.cerveza = cerveza;
    }

    public void guardad(){
        System.out.println("Se guarda la cerveza " + cerveza.nombre + " De la marca " + cerveza.marca);
    }
}
