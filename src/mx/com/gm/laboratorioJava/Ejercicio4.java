package mx.com.gm.laboratorioJava;

import java.util.Scanner;

public class Ejercicio4 {

    static final double iva = 0.21;

    public double calcularIva(double precio){
        double total = precio +  (precio * iva);
        return total;
    }

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            Ejercicio4 ejercicio4 = new Ejercicio4();
            System.out.println("Programa para calcular el valor del producto + Iva");
            System.out.println("digite el precio del producto:");
            double precioUsuario = scanner.nextDouble();
            System.out.println("El total Ivaincluido es de " + ejercicio4.calcularIva(precioUsuario));
        }catch (Exception e){
            System.out.println("Se ingresaron datos invalidos, reinicie la aplicacion.");
        }
    }
}
