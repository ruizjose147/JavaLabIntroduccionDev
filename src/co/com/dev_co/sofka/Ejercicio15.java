package co.com.dev_co.sofka;

import java.util.Scanner;

public class Ejercicio15 {

    public void mostrarMenu(){

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 8) {
            try {
                System.out.println("******GESTION CINEMATOGRÁFICA******");
                System.out.println("1-NUEVO ACTOR" + "\n"
                                + "2-BUSCAR ACTOR" + "\n"
                                + "3-ELIMINAR ACTOR" + "\n"
                                + "4-MODIFICAR ACTOR" + "\n"
                                + "5-VER TODOS LOS ACTORES" + "\n"
                                + "6-VER PELICULAS DE LOS ACTORES" + "\n"
                                + "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" + "\n"
                                + "8-SALIR");
                System.out.println("Elija una opcion");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        System.out.println("Salio del menu");
                        break;
                    default:
                        System.out.println("Utilizo una opcion invalidad");
                        break;
                }

            }catch(Exception ex){
                System.out.println("Ocurrio un error al selecionar la opcion");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio15 ejercicio15 = new Ejercicio15();
        ejercicio15.mostrarMenu();
    }
}

