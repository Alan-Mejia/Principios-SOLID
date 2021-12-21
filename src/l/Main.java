package l;

public class Main {

    public static void main(String[] args){
        Empleado[] empleados = new Empleado[4];

        empleados[0] = new Empleado("Alan", 100, 2021, 12, 6);
        empleados[1] = new Jefatura("Gustavo", 100, 2020, 10, 14);
        empleados[2] = new Empleado("Sam", 150, 2018, 5,3);
        empleados[3] = new Jefatura("Kevin", 150,2016,3,27);

        for(Empleado aux : empleados){
            aux.aumentoSueldo(10);
        }

        for(Empleado aux : empleados){
            System.out.print("Nombre: " + aux.getNombre() + "\n" +
                    "Nuevo sueldo: " + aux.getSueldo() + "\n" +
                    "Instancia de: ");
            if(aux instanceof Empleado){
                System.out.print("Empleado\n\n");
            }
            else if(aux instanceof Jefatura){
                System.out.print("Jefatura\n\n");
            }
        }
    }
}
