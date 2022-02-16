package com.example.listagemcardview.model;

public class Postagem {
    private String titulo, data, desc;
    private Integer imageId;

    public Postagem(String titulo, String data, String desc, Integer imageId) {
        this.titulo = titulo;
        this.data = data;
        this.desc = desc;
        this.imageId = imageId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}
