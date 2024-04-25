package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo  {
    int temporadas;
    int epísodiosPorTemporada;
    int minutosPorTemporada;

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * epísodiosPorTemporada * minutosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpísodiosPorTemporada() {
        return epísodiosPorTemporada;
    }

    public void setEpísodiosPorTemporada(int epísodiosPorTemporada) {
        this.epísodiosPorTemporada = epísodiosPorTemporada;
    }

    public int getMinutosPorTemporada() {
        return minutosPorTemporada;
    }

    public void setMinutosPorTemporada(int minutosPorTemporada) {
        this.minutosPorTemporada = minutosPorTemporada;
    }
}
