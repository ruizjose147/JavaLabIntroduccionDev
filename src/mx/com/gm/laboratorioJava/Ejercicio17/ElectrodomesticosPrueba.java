package mx.com.gm.laboratorioJava.Ejercicio17;

public class ElectrodomesticosPrueba {

    public static void main(String[] args) {
        Electrodomestico [] electrodomesticos = new  Electrodomestico[10];
        electrodomesticos[0] = new Television(100, "negro", 'F', 7, 55,true);
        electrodomesticos[1] = new Lavadora(10,200, "blanco", 'F', 12);
        electrodomesticos[2] = new Television(80, "negro", 'E', 8, 54,false);
        electrodomesticos[3] = new Lavadora(35,220, "blanco", 'F', 12);
        electrodomesticos[4] = new Lavadora(15,210, "blanco", 'F', 12);
        electrodomesticos[5] = new Television(90, "gris", 'D', 6, 39,true);
        electrodomesticos[6] = new Lavadora(40,250, "blanco", 'F', 12);
        electrodomesticos[7] = new Television(60, "negro", 'F', 7, 30,false);
        electrodomesticos[8] = new Lavadora(25,180, "blanco", 'F', 12);
        electrodomesticos[9] = new Television(100, "negro", 'F', 7, 55,false);

        double total = 0;
        double temporal = 0;
        System.out.println("Lavadoras");
        for (int i = electrodomesticos.length - 1; i >= 0; i--){
            if(electrodomesticos[i]instanceof Lavadora) {
                System.out.println(electrodomesticos[i].precioFinal());
                temporal = electrodomesticos[i].precioFinal();
                total += temporal;
            }
        }
        System.out.println("El total Lavadoras es de: " + total);
        total = 0;

        System.out.println("Televisores");
        for (int i = electrodomesticos.length - 1; i >= 0; i--){
            if(electrodomesticos[i]instanceof Television) {
                System.out.println(electrodomesticos[i].precioFinal());
                temporal = electrodomesticos[i].precioFinal();
                total += temporal;
            }
        }
        System.out.println("El total de Televisores es de: " + total);
    }
}
