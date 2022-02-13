package Ejercicio17;

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
    public void precioFinal(){
        double presio = super.getPrecioBase();

        int carga = this.carga;
        if(carga > 30) {
            presio = super.getPrecioBase();
            presio += 50;
            super.setPrecioBase(presio);
        }
    }

    public int getCarga() {

        return carga;
    }
}
