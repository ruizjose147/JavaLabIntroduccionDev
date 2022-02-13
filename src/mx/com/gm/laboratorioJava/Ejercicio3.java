package mx.com.gm.laboratorioJava;

import java.util.Scanner;

public class Ejercicio3 {

    public double calcularArea(double radio){
        double area= Math.PI * Math.pow(radio, 2);
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de radio circulos");
        System.out.println("De cuanto es el radio?");
        double radio = scanner.nextDouble();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        System.out.println("El area del circulo de radio " + radio + " es " + ejercicio3.calcularArea(radio));
    }
}
