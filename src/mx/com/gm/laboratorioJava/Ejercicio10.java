package mx.com.gm.laboratorioJava;

import java.util.Scanner;

public class Ejercicio10 {

    public void eliminarEspacios(){

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa una frase y eliminare los espacios...");
            String frase = scanner.nextLine();
            String nuevaFrase = frase.replace(" ", "");
            System.out.println("Tu frase sin espacios: " + nuevaFrase);
        }catch (Exception e){
            System.out.println("Se ingresaron datos invalidos, reinicie la aplicacion.");
        }

    }

    public static void main(String[] args) {
        Ejercicio10 ejercicio10 = new Ejercicio10();
        ejercicio10.eliminarEspacios();
    }
}
