package Ejercicio16;

public class Persona {
    private String nombre;
    private int edad;
    private int DNI;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.DNI = generarDNI();
    }

    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generarDNI();
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC(){
        double calculoIMC=(this.peso/Math.pow(this.altura,2));
        if(calculoIMC<20){
            return "Estas en tu peso ideal";
        }
        else if(calculoIMC>=20 && calculoIMC<=25){
            return "Estas por debajo de tu peso ideal";
        }
        else {
            return "Estas en sobrepeso";
        }
    }

    public Boolean esMayorDeEdad(){
        boolean mayorDeEdad = true;
        if(this.edad > 17)
            mayorDeEdad = true;
        else
            mayorDeEdad = false;
        System.out.println("Es mayor de edad?");
        return mayorDeEdad;
    }

    private void comprobarSexo(String sexo){
        if(sexo != "H" || sexo != "M")
            this.sexo = "H";
    }

    @Override
    public String toString() {
        return "Persona" +
                "nombre:" + nombre + "\n" +
                "edad: " + edad + "\n" +
                "DNI:" + DNI + "\n" +
                "sexo: " + sexo + "\n" +
                "peso:" + peso + "kg" + "\n" +
                "altura: " + altura + "m";
    }

    private int generarDNI(){
        this.DNI = (int) (Math.random()*12345678)+1;
        return 0;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public String getSexo() {

        return sexo;
    }

    public void setSexo(String sexo) {

        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }
}
