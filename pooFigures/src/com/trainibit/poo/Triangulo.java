package com.trainibit.poo;

public class Triangulo extends GeometryFigure{

    private static int ANGULOS_INTERNOS = 180; //static significa que depedne de la clase y no del objeto
    private static  int NUMERO_LADOS = 3;

    public Float base;
    public Float altura;
    public Float hipotenusa;

    public Triangulo(Float base, Float altura, Float hipotenusa) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
        this.setNumeroLado(NUMERO_LADOS);
    }

    @Override
    public Float calcularArea() {
        return base*altura/2;
    }

    @Override
    public Float calcularPerimetro() {
        return base+altura+hipotenusa;
    }


}
