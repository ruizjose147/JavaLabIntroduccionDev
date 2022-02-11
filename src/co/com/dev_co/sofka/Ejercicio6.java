package co.com.dev_co.sofka;

public class Ejercicio6 {
    public void parImparFor(){
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0)
                System.out.println(i + " Par.");
            else
                System.out.println(i + " Impar");
        }
    }

    public static void main(String[] args) {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        ejercicio6.parImparFor();
    }
}
