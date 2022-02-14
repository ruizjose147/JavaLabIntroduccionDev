package mx.com.gm.laboratorioJava.Ejercicio16;

public class Persona {
    private String nombre;
    private int edad;
    private int DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.DNI = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC(){
        double alturaM = this.altura/100;
        double calculoIMC=(this.peso/Math.pow(alturaM,2));
        String resultado = "";
        if(calculoIMC<20){
            resultado = String.valueOf(-1) + " Estas en tu peso ideal";
        }
        else if(calculoIMC>=20 && calculoIMC<=25){
            resultado= String.valueOf(0) +" Esta por debajo de tu peso ideal";
        }
        else {
            resultado=String.valueOf(1) +" Estas sobre tu peso ideal";
        }

        return resultado;
    }

    public String esMayorDeEdad(){
        if(this.edad > 17) {
            return "Es mayor de Edad";
        }
        else {
            return "Es menor de edad?";
        }
    }

    public char solicitarSexo(String sexo){
        String letra = sexo.toLowerCase();
        if(letra=="masculino" || letra=="hombre"){
            sexo="H";
        }
        else if(sexo=="femenino" || letra=="mujer") {
            sexo="M";
        }
        else {
            sexo = sexo;
        }
        char sexo1= sexo.charAt(0);
        return sexo1;
        /*this.sexo = sexo1;
        this.compararSexo(this.sexo);*/
    }

    private void compararSexo(char sexo){
        if(sexo != this.sexo){
            this.sexo = 'H';
        }
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

    public int generarDNI(){
        this.DNI = (int) (Math.random()*12345678)+1;
        return DNI;
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

    public char getSexo() {

        return sexo;
    }

    public void setSexo(char sexo) {

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
