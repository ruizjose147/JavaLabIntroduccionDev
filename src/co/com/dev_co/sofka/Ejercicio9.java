package co.com.dev_co.sofka;

import java.util.Scanner;

public class Ejercicio9 {

    public void reemplazar(){
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String nuevaFrase = frase.replace('a', 'e');
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase que desee agregar:");
        String usuario = scanner.nextLine();
        String nuevaUsuario = usuario.replace('a', 'e');
        System.out.println("El nuevo String es: " + nuevaFrase + " " + nuevaUsuario);
    }

    public static void main(String[] args) {
        Ejercicio9 ejercicio9 = new Ejercicio9();
        ejercicio9.reemplazar();
    }
}
