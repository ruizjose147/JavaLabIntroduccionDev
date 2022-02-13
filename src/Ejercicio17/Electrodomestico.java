package Ejercicio17;

public class Electrodomestico implements Precio{

    private double precioBase = 100;
    private String color = "Blanco";
    private char consumoEnergetico = 'F';
    private double peso = 5;

    public Electrodomestico() {

    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra){
        if(letra!='A' || letra !='F'){
            this.consumoEnergetico='F';
        }
    }

    private void comprobarColor(String color){

        if (color.equalsIgnoreCase("negro")){
            this.color=color;
        }
        else  if(color.equalsIgnoreCase("rojo")){
            this.color=color;
        }
        else if(color.equalsIgnoreCase("azul")) {
            this.color=color;
        }
        else if (color.equalsIgnoreCase("gris")){
            this.color=color;
        }
        else {
            this.color="Blanco";
        }
    }

    @Override
    public double precioFinal(){
        if(this.consumoEnergetico == 'A')
            this.precioBase += 100;
        if(this.consumoEnergetico == 'B')
            this.precioBase += 80;
        if(this.consumoEnergetico == 'C')
            this.precioBase += 60;
        if(this.consumoEnergetico == 'D')
            this.precioBase += 50;
        if(this.consumoEnergetico == 'E')
            this.precioBase += 30;
        if(this.consumoEnergetico == 'F')
            this.precioBase += 10;
        return precioBase;

        /*int resolucion = 0;
        if (resolucion > 40)
            this.precioBase = (this.precioBase*0.3)+this.precioBase;

        boolean tdt = false;
        if(tdt == true)
            this.precioBase += 50;
        System.out.println("Precio final es de: " + precioBase);*/
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {

        return precioBase;
    }

    public String getColor() {

        return color;
    }

    public char getConsumoEnergetico() {

        return consumoEnergetico;
    }

    public double getPeso() {

        return peso;
    }
}
