package co.com.dev_co.sofka;

import java.util.Scanner;

public class Ejercicio4 {

    static final double iva = 0.21;

    public double calcularIva(double precio){
        double total = precio +  (precio * iva);
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio4 ejercicio4 = new Ejercicio4();
        System.out.println("Programa para calcular el valor del producto + Iva");
        System.out.println("digite el precio del producto:");
        double precioUsuario = scanner.nextDouble();
        System.out.println("El total Ivaincluido es de " + ejercicio4.calcularIva(precioUsuario));
    }
}
