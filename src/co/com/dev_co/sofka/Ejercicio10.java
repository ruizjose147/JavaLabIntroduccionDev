package co.com.dev_co.sofka;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio10 {

    public void eliminarEspacios(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase y eliminare los espacios...");
        String frase = scanner.nextLine();
        String nuevaFrase = frase.replace(" ", "");
        System.out.println("Tu frase sin espacios: " + nuevaFrase);
    }

    public static void main(String[] args) {
        Ejercicio10 ejercicio10 = new Ejercicio10();
        ejercicio10.eliminarEspacios();
    }
}
