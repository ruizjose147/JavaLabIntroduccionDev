package mx.com.gm.laboratorioJava;

import java.util.Scanner;

// TODO: 12/02/2022 mejorara
public class Ejercicio12 {

    public void compararPalabras(){

        try{
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
        }catch (Exception e){
            System.out.println("Se ingresaron datos invalidos, reinicie la aplicacion.");
        }

    }

    public static void main(String[] args) {
        Ejercicio12 ejercicio12 = new Ejercicio12();
        ejercicio12.compararPalabras();
    }
}
