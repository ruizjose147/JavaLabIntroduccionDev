package mx.com.gm.laboratorioJava;

public class Ejercicio5 {

    public void numerosParesEImpares(){
        int numero = 1;
        while (numero < 101){
            if (numero % 2 == 0)
                    System.out.println(numero + " Par.");
                else
                    System.out.println(numero + " Impar");
            numero++;

        }
    }

    public static void main(String[] args) {
        Ejercicio5 ejercicio5 = new Ejercicio5();
        ejercicio5.numerosParesEImpares();
    }
}
