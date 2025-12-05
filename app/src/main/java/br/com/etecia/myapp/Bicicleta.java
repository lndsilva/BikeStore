package br.com.etecia.myapp;

public class Bicicleta {
    private String titulo;
    private int imgBicicleta;

    //alt+insert
    //construtor
    public Bicicleta() {
    }

    public Bicicleta(String titulo, int imgBicicleta) {
        this.titulo = titulo;
        this.imgBicicleta = imgBicicleta;
    }
    //getters and setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImgBicicleta() {
        return imgBicicleta;
    }

    public void setImgBicicleta(int imgBicicleta) {
        this.imgBicicleta = imgBicicleta;
    }
}
