package mx.com.gm.laboratorioJava;

import java.util.Scanner;

public class Ejercicio14 {

    public void numerosDosEnDos(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa un numero menor a Mil");
        try {
            int numero = scanner.nextInt();
            if (numero <= 1000) {
                while (numero <= 1000) {
                    System.out.println(numero);
                    numero += 2;
                }
            }
            else if (numero > 1000){
                System.out.println("Ingresaste un numero fuera de rango");
            }
            else
                System.out.println("Ingresaste 1000 ya no puedo contar");
        }catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Ejercicio14 ejercicio14 = new Ejercicio14();
        ejercicio14.numerosDosEnDos();
    }
}
