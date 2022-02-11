package co.com.dev_co.sofka;

import java.util.Scanner;

public class Ejercicio7 {

    int numero;

    public void pedirNumero(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Igresa un numero");
            this.numero = scanner.nextInt();
            if (numero >= 0) {
                System.out.println("Numero ingresado " + numero + ".");
                break;
            }
        }while (numero < 0);
    }

    public static void main(String[] args) {
        Ejercicio7 Ejercicio7 = new Ejercicio7();
        Ejercicio7.pedirNumero();
    }
}
