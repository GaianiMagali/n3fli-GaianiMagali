package ar.edu.unahur.obj2.modelo;

public class Capitulo {
    private String titulo;
    private int duracion;

    public Capitulo(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }
}
