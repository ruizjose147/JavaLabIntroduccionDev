package co.com.dev_co.sofka;

import com.sun.source.tree.CaseTree;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {

    public void esLaboral(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un dia de la semana y te dire si es laboral.");
        String dia = scanner.nextLine();
        dia = dia.toLowerCase();
        switch (dia){
            case "lunes":
                System.out.println("El dia lunes es laboral");
                break;
            case "martes":
                System.out.println("El dia martes es laboral");
                break;
            case "miercoles":
                System.out.println("El dia miercoles es laboral");
                break;
            case "jueves":
                System.out.println("El dia jueves es laboral");
                break;
            case "viernes":
                System.out.println("El dia viernes es laboral");
                break;
            case "sabado":
                System.out.println("El dia sabado no es laboral");
                break;
            case "domingo":
                System.out.println("El dia domingo no es laboral");
                break;
            default:
                System.out.println("ingresa un dia de la semana");
                break;
        }
    }

    public static void main(String[] args) {
        Ejercicio8 ejercicio8 = new Ejercicio8();
        ejercicio8.esLaboral();
    }
}
