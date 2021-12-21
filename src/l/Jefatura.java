package l;

public class Jefatura extends Empleado implements AumSueldo{
    public Jefatura(String nombre, float sueldo, int anioIngreso, int mesIngreso, int diaIngreso){
        super(nombre, sueldo, anioIngreso, mesIngreso, diaIngreso);
    }

    public float bono(int cantidadBono){
        cantidadBono /= 100;
        sueldo *= (1 + cantidadBono);
        return sueldo;
    }

    @Override
    public float aumentoSueldo(int aumento) {
        aumento /= aumento;
        sueldo *= (1 + aumento);
        return sueldo + bono(5);
    }
}
