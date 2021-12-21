package l;

public class Empleado implements AumSueldo{
    String nombre;
    float sueldo;
    int anioIngreso;
    int mesIngreso;
    int diaIngreso;

    public Empleado(String nombre, float sueldo, int anioIngreso, int mesIngreso, int diaIngreso){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this. anioIngreso = anioIngreso;
        this.mesIngreso = mesIngreso;
        this.diaIngreso = diaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public int getMesIngreso() {
        return mesIngreso;
    }

    public int getDiaIngreso() {
        return diaIngreso;
    }

    @Override
    public float aumentoSueldo(int aumento) {
        aumento /= 100;
        sueldo *= (1 + aumento);
        return sueldo;
    }
}
