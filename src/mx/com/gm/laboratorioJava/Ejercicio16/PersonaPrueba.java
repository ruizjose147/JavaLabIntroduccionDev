package mx.com.gm.laboratorioJava.Ejercicio16;

import java.util.Scanner;

public class PersonaPrueba {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Persona 1");
            System.out.println("Ingresar tu nombre");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa tu edad");
            int edad = scanner.nextInt();
            System.out.println("Ingesa tu sexo");
            String sexo = scanner1.nextLine();
            char sexoC = 'H';
            String letra = sexo.toLowerCase();
            if(letra=="masculino" || letra=="hombre"){
                    sexo="H";
            }
            else if(sexo=="femenino" || letra=="mujer") {
                    sexo="M";
            }
            else {
                    sexo = sexo;
            }
            if(sexo.isEmpty())
                    sexo = "hombre";
            else
                    sexoC = sexo.charAt(0);

            System.out.println("Ingresa tu peso");
            double peso =scanner1.nextDouble();
            System.out.println("Ingresa tu altura");
            double altura = scanner.nextDouble();
            Persona persona1 = new Persona(nombre, edad, sexoC, peso, altura);
            String pesoIdeal = persona1.calcularIMC();
            String mayorDeEdad = persona1.esMayorDeEdad();
            System.out.println("Calculo IMC: " + pesoIdeal);
            System.out.println(mayorDeEdad);
            System.out.println(persona1.toString());



            System.out.println("Persona 2");
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Ingresar tu nombre");
            String nombre2 = scanner2.nextLine();
            System.out.println("Ingresa tu edad");
            int edad2 = scanner2.nextInt();
            System.out.println("Ingesa tu sexo");
            String sexo2 = scanner3.nextLine();
            char sexoC2 = 'H';
            String letra2 = sexo2.toLowerCase();
            if(letra2 == "masculino" || letra2 == "hombre"){
                    sexo2="H";
            }
            else if(sexo2 == "femenino" || letra2 == "mujer") {
                    sexo2="M";
            }
            else {
                    sexo2 = sexo2;
            }
            if(sexo2.isEmpty())
                    sexo2 = "hombre";
            else
                    sexoC2 = sexo2.charAt(0);


            Persona persona2 = new Persona(nombre2, edad2, sexoC2);
            String pesoIdeal2 = persona2.calcularIMC();
            String mayorDeEdad2 = persona2.esMayorDeEdad();
            System.out.println("Calculo IMC: " + pesoIdeal2);
            System.out.println(mayorDeEdad2);
            System.out.println(persona2.toString());


            System.out.println("Tercera persona");
            Persona persona3 = new Persona();
            persona3.setNombre("Jose");
            persona3.setEdad(33);
            persona3.setSexo('H');
            persona3.setPeso(70);
            persona3.setAltura(1.66);
            String pesoIdeal3 = persona3.calcularIMC();
            String mayorDeEdad3 = persona3.esMayorDeEdad();
            System.out.println("Calculo IMC: " + pesoIdeal3);
            System.out.println(mayorDeEdad3);
            System.out.println(persona3.toString());
    }
}
