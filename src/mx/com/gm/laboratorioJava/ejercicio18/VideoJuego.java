package mx.com.gm.laboratorioJava.ejercicio18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class VideoJuego implements Entregable{


    public String titulo="";
    public int horasEstimada =10;
    public boolean entregado=false;
    public String genero="";
    public String compañia="";
    public ArrayList lista;

    public VideoJuego() {

    }

    public VideoJuego(String titulo, int horasEstimada) {
        this.titulo = titulo;
        this.horasEstimada = horasEstimada;
    }

    public VideoJuego(String titulo, int horasEstimada, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimada = horasEstimada;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimada() {
        return horasEstimada;
    }

    public void setHorasEstimada(int horasEstimada) {
        this.horasEstimada = horasEstimada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimada=" + horasEstimada +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }

    @Override
    public void Entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean IsEntregado() {
        return entregado;
    }


    @Override
    public int compareTo(Object a) {
        //La serie con más temporadas retornara 1, 0 si son iguales y -1 si es menor :)
        int res=-1;
        VideoJuego videoJuego = (VideoJuego) a;
        if (this.horasEstimada > videoJuego.getHorasEstimada()){
            res=1;
        }else if(this.horasEstimada == videoJuego.getHorasEstimada()){
            res=0;
        }
        return res;
    }
}
