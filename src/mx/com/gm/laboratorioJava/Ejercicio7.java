package mx.com.gm.laboratorioJava;

import java.util.Scanner;

public class Ejercicio7 {

    int numero;

    public void pedirNumero(){


        do {
            try{
                Scanner scanner = new Scanner(System.in);

                System.out.println("Igresa un numero");
                this.numero = scanner.nextInt();
                if (numero >= 0) {
                    System.out.println("Numero ingresado " + numero + ".");
                    break;
                }
            }catch (Exception e){
                System.out.println("Se ingresaron datos invalidos, reinicie la aplicacion.");
            }
        }while (numero < 0);
    }

    public static void main(String[] args) {
        Ejercicio7 Ejercicio7 = new Ejercicio7();
        Ejercicio7.pedirNumero();
    }
}
