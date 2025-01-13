import com.trainibit.poo.Cuadrado;
import com.trainibit.poo.GeometryFigure;
import com.trainibit.poo.Triangulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        System.out.println("Practica POO");

        List<GeometryFigure> ListaFiguras = new ArrayList<GeometryFigure>();

        Triangulo triangulo1 = new Triangulo(2F,3F,5F);

        Cuadrado cuadrado2 = new Cuadrado(5F);

        ListaFiguras.add(triangulo1);
        ListaFiguras.add(cuadrado2);

        Collections.shuffle(ListaFiguras);

        ListaFiguras.forEach(figura -> {System.out.println(figura.getDescription());
        });
    }
}