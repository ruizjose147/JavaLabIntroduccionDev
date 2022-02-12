package co.com.dev_co.sofka;

import java.util.Scanner;

public class Ejercicio12 {

    public void compararPalabras(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingresa otra palabra");
        String palabra2 = scanner.nextLine();

        if (palabra1.equals(palabra2)){
            System.out.println("las palabras son iguales");
        }
        else{
            System.out.println("Diferencias:");
            for (char c:palabra1.toCharArray()) {
                for (char b: palabra2.toCharArray()){
                    if(c!=b){
                        System.out.println(c + " " +b);

                    }

                }

            }
        }
    }

    public static void main(String[] args) {
        Ejercicio12 ejercicio12 = new Ejercicio12();
        ejercicio12.compararPalabras();
    }
}
