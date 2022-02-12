package co.com.dev_co.sofka;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {

    public void FechaHora (){
        System.out.println("Fecha y hora");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
    }

    public static void main(String[] args) {
        Ejercicio13 ejercicio13 = new Ejercicio13();
        ejercicio13.FechaHora();
    }
}
