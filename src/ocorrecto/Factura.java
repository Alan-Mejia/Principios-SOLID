package ocorrecto;

import java.util.ArrayList;

public class Factura{
    public float precioTotal (ArrayList<ocorrecto.Bebida> bebidas){
        float total = 0.0F;
        for(Bebida bebida : bebidas){
            total += bebida.precioTotal();
        }
        return total;
    }

}
