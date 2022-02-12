package Ejercicio16;

import java.io.Reader;
import java.util.Scanner;

public class PersonaPrueba {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Primer Usuario");
            System.out.println("Ingresa el nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa la edad:");
            int edad = scanner.nextInt();
            System.out.println("Ingresa el sexo:");

            String sexo = scanner.nextLine();

            double peso = scanner.nextDouble();
            System.out.println("Ingresa el peso:");
            double altura = scanner.nextDouble();
            System.out.println("Ingresa la altura:");
            Persona persona1 = new Persona(nombre, edad, sexo);

            System.out.println("Segundo Usuario");
            System.out.println("Ingresa el nombre:");
            String nombre2 = scanner.nextLine();
            System.out.println("Ingresa la edad:");
            int edad2 = scanner.nextInt();
            System.out.println("Ingresa el sexo:");
            String sexo2 = scanner.nextLine();
            Persona persona2 = new Persona(nombre2, edad2, sexo2);

            System.out.println("Tercer Usuario");
            Persona persona3 = new Persona();
            persona3.setNombre("Jose");
            persona3.setEdad(33);
            persona3.setSexo("H");
            persona3.setPeso(70);
            persona3.setAltura(1.66);

            persona1.calcularIMC();
            persona2.calcularIMC();
            persona3.calcularIMC();

            persona1.esMayorDeEdad();
            persona2.esMayorDeEdad();
            persona3.esMayorDeEdad();

            persona1.toString();
            persona2.toString();
            persona3.toString();

    }
}
