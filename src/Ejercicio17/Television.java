package Ejercicio17;

public class Television extends Electrodomestico{

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
    public void precioFinal(){
        double presio = super.getPrecioBase();

        double resolucion = this.resolucion;
        if (resolucion > 40)
            presio = (presio*0.3)+presio;

        boolean tdt = this.sintonizadorTDT;
        if(tdt == true)
            presio += 50;

        System.out.println("Precio final es de: " + presio);
    }

    public double getResolucion() {

        return resolucion;
    }

    public boolean isSintonizadorTDT() {

        return sintonizadorTDT;
    }
}
