package co.com.dev_co.sofka;

public class Ejercicio1 {

    int num1;
    int num2;

    public  void numeroMayor(int num1, int num2){

        this.num1 = num1;
        this.num2 = num2;

        if(num1 > num2)
            System.out.println(num1+ " es mayor que " + num2);
        else if (num1 < num2)
            System.out.println(num2+ " es mayor que " + num1);
        else
            System.out.println(num1 + " Es igual a " + num2);
    }

    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.numeroMayor(100, 10);
    }
}
