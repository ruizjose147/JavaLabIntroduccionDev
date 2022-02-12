package co.com.dev_co.sofka;

import java.util.Scanner;

public class Ejercicio11 {

    public int tamañoCadena(String str) {
        int longitud = str.length();
        return longitud;
    }

    public int cantidadVocales(String str) {
       str = str.toLowerCase();
        int contador = 0;
        for (int i = str.length()-1; i >= 0; i--){
           if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
               contador++;
       }
        return contador;
    }

    public void detalleVocales(String str) {
        str = str.toLowerCase();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        for (int x = str.length()-1; x >= 0; x--){
            if(str.charAt(x) == 'a')
                a++;
            else if (str.charAt(x) == 'e')
                e++;
            else if(str.charAt(x) == 'i')
                i++;
            else if (str.charAt(x) == 'o')
                o++;
            else if (str.charAt(x) == 'u')
                u++;
        }
        System.out.println("Vocales que contiene");
        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase y te dire su longitud y el numero de vocales");
        String usuario = scanner.nextLine();
        Ejercicio11 ejercicio11 = new Ejercicio11();
        System.out.println("La longitud es de: " + ejercicio11.tamañoCadena(usuario));
        System.out.println("Contiene " + ejercicio11.cantidadVocales(usuario) + " vocales");
        ejercicio11.detalleVocales(usuario);
    }
}