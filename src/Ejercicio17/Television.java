package Ejercicio17;

public class Television extends Electrodomestico implements Precio{

    public double resolucion = 20;
    public boolean sintonizadorTDT = false;

    public Television() {

    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
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

        double resolucion = this.resolucion;
        double aumentoResolucion = 0;
        if (resolucion > 40) {
            aumentoResolucion = (precio * 0.3);
            precio += aumentoResolucion;
        }

        boolean tdt = this.sintonizadorTDT;
        if(tdt == true)
            precio += 50;

        return precio;
    }

    public double getResolucion() {

        return resolucion;
    }

    public boolean isSintonizadorTDT() {

        return sintonizadorTDT;
    }
}
