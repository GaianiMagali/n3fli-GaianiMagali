package ar.edu.unahur.obj2.estadistica;

import ar.edu.unahur.obj2.modelo.Capitulo;

public class EstadisticaCapitulo implements Reproducible {

    private Capitulo capitulo;

    @Override
    public int minutosReproducidos() {
        return capitulo.getDuracion();
    }

    @Override
    public boolean completa() {
        return true;
    }
}
