package mx.com.gm.laboratorioJava;

import java.util.Scanner;

public class Ejercicio2 {
        int num1;
        int num2;

        public  void numeroMayor(int num1, int num2){

            this.num1 = num1;
            this.num2 = num2;

            if(num1 > num2)
                System.out.println(num1+ " es mayor que " + num2);
            else if(num1 < num2)
                System.out.println(num2+ " es mayor que " + num1);
            else
                System.out.println(num1 + " Es igual a " + num2);
        }

        public static void main(String[] args) {
            Ejercicio2 ejercicio2 = new Ejercicio2();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dime dos numero y te dire cual es el mayor");
            System.out.println("Primer numero");
            int num1 = scanner.nextInt();
            System.out.println("Segundo numero");
            int num2 = scanner.nextInt();
            ejercicio2.numeroMayor(num1,num2);

        }
    }
