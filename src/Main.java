import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas ventas has hecho?");
        //Declaro y asigno la variable numVentas
        int numVentas = sc.nextInt();

        System.out.println("¿Cuál es el sueldo base?");
        //Declaro y asigno la variable sueldoBase
        int sueldoBase = sc.nextInt();

        int ventaTotal = 0;

        for (int i = 1; i <= numVentas; i++) {
            System.out.println("Introduce la venta numero " + i + ":");
            int valorVenta = sc.nextInt();

            ventaTotal += valorVenta;
        }

        double beneficio = 0.1 * ventaTotal;
        double ganancia = sueldoBase + beneficio;

        System.out.println("La comision por las ventas es " + beneficio + " € y el sueldo total es " + ganancia +" €");

    }
}
