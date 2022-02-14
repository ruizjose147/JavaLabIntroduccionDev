package mx.com.gm.laboratorioJava.Ejercicio17;

public class Lavadora extends Electrodomestico{

    public int carga =5;

    public Lavadora(){

    }

    public Lavadora(double precioBase, double peso)
    {
        super(precioBase, peso);
    }

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    @Override
    public double precioFinal(){
        double precio = super.getPrecioBase();
        char consumoEnergetico = super.getConsumoEnergetico();

        if(consumoEnergetico == 'A')
            precio += 100;
        if(consumoEnergetico == 'B')
            precio += 80;
        if(consumoEnergetico == 'C')
            precio += 60;
        if(consumoEnergetico == 'D')
            precio += 50;
        if(consumoEnergetico == 'E')
            precio += 30;
        if(consumoEnergetico == 'F')
            precio += 10;

        int carga = this.carga;
        if(carga > 30)
            precio += 50;
        return precio;
    }

    public int getCarga() {

        return carga;
    }
}
