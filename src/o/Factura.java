package o;

import java.util.ArrayList;
import java.util.Arrays;

public class Factura {

    public float precioTotal (ArrayList<Bebida> bebidas){
        float total = 0.0F;
        for(Bebida bebida : bebidas){
            if(bebida.tipo == "Agua"){
                total += bebida.precio;
            }
            else if (bebida.tipo == "Alcohol"){
                total += bebida.precio * .16;
            }
            else if(bebida.tipo == "Azucarada"){

                total += bebida.precio * 0.20;
            }
            else if(bebida.tipo == "Energizante"){
                total += bebida.precio * 0.3;
            }
        }
        return total;
    }

}
