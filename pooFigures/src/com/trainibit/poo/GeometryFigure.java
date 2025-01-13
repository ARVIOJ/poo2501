package com.trainibit.poo;

public class GeometryFigure implements Describible{

    private String nombre;
    private Integer numeroLado; //clases wraperr siemepre llevan mayusculas al inicio (Integer, String)a comparacion de los primititvos
    private Float area;
    private Float perimetro;


    //constructor
    GeometryFigure(String nombre, Integer numeroLado, Float area, Float perimetro) {
        this.nombre = nombre;
        this.numeroLado = numeroLado;
        this.area = area;
        this.perimetro = perimetro;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Float perimetro) {
        this.perimetro = perimetro;
    }

    public Integer getNumeroLado() {
        return numeroLado;
    }

    public void setNumeroLado(Integer numeroLado) {
        this.numeroLado = numeroLado;
    }

    public Float calcularArea() { return null;}
    public Float calcularPerimetro() { return null;}

    @Override
    public String getDescription() {
        return "";
    }
}
