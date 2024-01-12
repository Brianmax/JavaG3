package org.example.clasesGenericas;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Float> lista2 =  new ArrayList<>();

        Point2D<Integer> punto = new Point2D<>(1,2);
        Point2D<Float> punto2 = new Point2D<>(2.23f, 12.2f);

        punto.print();
        punto2.print();

        Point2Dv2<Integer> point2Dv2 = new Point2Dv2<>();
        point2Dv2.setA(2);
        point2Dv2.setB(3);
        point2Dv2.print();
    }
}
