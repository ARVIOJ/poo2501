package com.trainibit.poo;

public class Cuadrado extends GeometryFigure implements Describible{

    public static int NUMERO_LADOS = 4;
    public static String NOMBRE = "Cuadrado";

    private Float longitudLado;

    public Cuadrado(Float longitudLado){
        this.longitudLado = longitudLado;
        this.setNumeroLado(NUMERO_LADOS);
        this.setNombre(NOMBRE);
    }

    @Override
    public Float calcularArea() {
        return longitudLado * longitudLado;
    }

    @Override
    public Float calcularPerimetro() {
        return longitudLado * 2;
    }

}
